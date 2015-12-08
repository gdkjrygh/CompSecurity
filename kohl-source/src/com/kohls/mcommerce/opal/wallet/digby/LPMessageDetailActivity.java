// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.digby;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.localpoint.sdk.core.ILPMessageProvider;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.digby.mm.android.library.utils.Logger;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ScanHelpActivity;
import com.kohls.mcommerce.opal.wallet.asynctask.GetDataFromServerTask;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.BarcodeCreator;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.digby:
//            LPCustomID

public class LPMessageDetailActivity extends Activity
    implements android.view.View.OnClickListener
{
    private class AddtoWallet extends AsyncTask
    {

        ProgressDialog progressDialog;
        final LPMessageDetailActivity this$0;
        Set walletId;

        protected transient WalletResponse doInBackground(Set aset[])
        {
            if (canAccessNetwork() && aset != null && aset.length > 0 && aset[0] != null)
            {
                return (new WalletService(new WeakReference(getApplicationContext()))).addtoWallet(aset[0]);
            } else
            {
                return null;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Set[])aobj);
        }

        protected void onPostExecute(WalletResponse walletresponse)
        {
            super.onPostExecute(walletresponse);
            progressDialog.dismiss();
            if (walletresponse != null && walletresponse.isSuccess())
            {
                Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                intent.setFlags(0x400000);
                intent.putExtra("open_screen_key", "open_my_wallet");
                startActivity(intent);
        /* block-local class not found */
        class _cls1 {}

                (new Handler()).postDelayed(new _cls1(walletresponse), 1000L);
                if (walletId != null)
                {
                    ArrayList arraylist = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                    arraylist.addAll(walletId);
                    KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(arraylist);
                }
                OmnitureMeasurement.getInstance().walletManualScan(((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode());
                finish();
                return;
            } else
            {
                showError(walletresponse);
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((WalletResponse)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(LPMessageDetailActivity.this, "Adding Items", "Please wait");
        }

        private AddtoWallet()
        {
            this$0 = LPMessageDetailActivity.this;
            super();
            walletId = null;
        }

    }

    private class GetWalletData extends GetDataFromServerTask
    {

        boolean isEnabled;
        ProgressDialog progressDialog;
        final LPMessageDetailActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            isEnabled = false;
            avoid = retrieveWalletResponse();
            if (avoid == null || !hasErrors(avoid).booleanValue()) goto _L2; else goto _L1
_L1:
            if (((ErrorResponse)avoid.getErrors().get(0)).getErrorCode() != 5);
_L4:
            return null;
_L2:
            if (avoid != null && avoid.isSuccess())
            {
                isEnabled = true;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected void doOnPostExecute()
        {
            progressDialog.cancel();
            if (isEnabled)
            {
                addtoWallet((WalletItemResponse)findViewById(0x7f0d0044).getTag());
            }
        }

        protected void onPreExecute()
        {
            progressDialog = ProgressDialog.show(LPMessageDetailActivity.this, "Adding Items", "Please wait");
            super.onPreExecute();
        }

        public GetWalletData(Context context)
        {
            this$0 = LPMessageDetailActivity.this;
            super(context);
            isEnabled = false;
        }
    }

    public class LookupBarcodeAsyncTask extends AsyncTask
    {

        ProgressDialog progressDialog;
        String response;
        final LPMessageDetailActivity this$0;

        protected transient WalletResponse doInBackground(String as[])
        {
            if (as[0] != null && as[0].length() > 15 && as[1] != null)
            {
                return (new WalletService(new WeakReference(getApplicationContext()))).getWallentByGiftCard(as[0], as[1]);
            } else
            {
                return (new WalletService(new WeakReference(getApplicationContext()))).getWallentByLookup(as[0]);
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(WalletResponse walletresponse)
        {
            super.onPostExecute(walletresponse);
            try
            {
                progressDialog.dismiss();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
            if (walletresponse != null)
            {
                if (walletresponse.isSuccess())
                {
                    Object obj = (WalletItemResponse)walletresponse.getWalletItems().get(0);
                    if (Long.valueOf(((WalletItemResponse) (obj)).getEffectiveEndDate()).longValue() + 0xa4cb800L < System.currentTimeMillis())
                    {
                        Dialog.showDialog(null, "The Item you entered is invalid.Please try again", LPMessageDetailActivity.this, "OK", null, false, true);
                        return;
                    }
                    findViewById(0x7f0d0044).setTag(obj);
                    findViewById(0x7f0d0044).setOnClickListener(LPMessageDetailActivity.this);
                    if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()))
                    {
                        customerName.setText((new StringBuilder()).append("Hi ").append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()).append("!").toString());
                    } else
                    {
                        customerName.setVisibility(8);
                    }
                    setOffersView((WalletItemResponse)walletresponse.getWalletItems().get(0));
                    return;
                }
                if (walletresponse == null || walletresponse != null && walletresponse.getErrors() == null || walletresponse != null && walletresponse.getErrors() != null && walletresponse.getErrors().size() <= 0)
                {
                    Dialog.showDialog("Kohl's", "Please try again later", LPMessageDetailActivity.this, "OK", null, false, false);
                    return;
                }
                ErrorResponse errorresponse = (ErrorResponse)walletresponse.getErrors().get(0);
                if (walletresponse != null && walletresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR || walletresponse != null && errorresponse.getErrorCode() == 4)
                {
                    UtilityMethods.openAccountActivity(LPMessageDetailActivity.this, true, false);
                    return;
                }
                if (errorresponse.getErrorCode() == 2 || errorresponse.getErrorCode() == 12)
                {
                    walletresponse = new Intent(LPMessageDetailActivity.this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                    setResult(7005, walletresponse);
                }
                Dialog.showDialog("Kohl's", getResources().getString(0x7f08024a), LPMessageDetailActivity.this, "OK", null, false, true);
                OmnitureMeasurement.getInstance().walletScanError();
                return;
            } else
            {
                Dialog.showDialog("No Network Connection", Constants.NETWORK_CONNECTION_MESSAGE, LPMessageDetailActivity.this, "OK", null, false, true);
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((WalletResponse)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(LPMessageDetailActivity.this, "Please wait", "Verifying...");
        }

        public LookupBarcodeAsyncTask()
        {
            this$0 = LPMessageDetailActivity.this;
            super();
            response = "false";
        }
    }


    private ImageView barCode;
    private TextView barCodeId;
    private TextView customerName;
    private TextView expirationTime;
    private TextView expiryDate;
    boolean isFirstAttempt;
    private TextView itemState;
    private TimeZone mCentralTimezone;
    private TimeZone mCurrentTimezone;
    private TextView pinNo;
    private TextView promoCode;
    private long timeDifference;
    private TextView title;
    private TextView walletTerms;

    public LPMessageDetailActivity()
    {
        isFirstAttempt = true;
    }

    private void addtoWallet(WalletItemResponse walletitemresponse)
    {
        if (canAccessNetwork())
        {
            if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref()))
            {
                UtilityMethods.openAccountActivity(this, true, false);
            } else
            {
                if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId()) && isFirstAttempt)
                {
                    (new GetWalletData(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                }
                HashSet hashset = new HashSet();
                hashset.add(walletitemresponse);
                if (walletitemresponse != null)
                {
                    (new AddtoWallet()).execute(new Set[] {
                        hashset
                    });
                    return;
                }
            }
        }
    }

    private void setOffersView(WalletItemResponse walletitemresponse)
    {
        Object obj1 = Calendar.getInstance(mCentralTimezone);
        ((Calendar) (obj1)).setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue());
        String s = DateUtils.getRelativeTimeSpanString(((Calendar) (obj1)).getTimeInMillis() + timeDifference, Calendar.getInstance().getTimeInMillis(), 0L).toString();
        Calendar calendar = Calendar.getInstance(mCentralTimezone);
        calendar.setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue());
        Object obj = DateUtils.getRelativeTimeSpanString(calendar.getTimeInMillis() + timeDifference, Calendar.getInstance().getTimeInMillis(), 0L).toString();
        boolean flag;
        if (!TextUtils.isEmpty(walletitemresponse.getDescription()))
        {
            title.setText(walletitemresponse.getDescription());
        } else
        {
            title.setText(walletitemresponse.getPromoCode());
        }
        if (walletitemresponse.getTypeCode().equals("offer"))
        {
            ((ImageView)findViewById(0x7f0d0035)).setImageResource(0x7f0201a6);
        } else
        if (walletitemresponse.getTypeCode().equals("kohlscash"))
        {
            ((ImageView)findViewById(0x7f0d0035)).setImageResource(0x7f0200d7);
        } else
        {
            ((ImageView)findViewById(0x7f0d0035)).setImageResource(0x7f020104);
        }
        promoCode.setVisibility(0);
        if (TextUtils.isEmpty(walletitemresponse.getDisclaimer()))
        {
            walletTerms.setText(Appconfig.discalimer);
        } else
        {
            walletTerms.setText(walletitemresponse.getDisclaimer());
        }
        if (walletitemresponse.isShortTermOffer())
        {
            s = DateUtils.getRelativeTimeSpanString(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue(), Calendar.getInstance().getTimeInMillis(), 0L).toString();
        }
        if (walletitemresponse.getCouponState() == Constants.EXPIRED.intValue() || s.contains(" ago"))
        {
            expirationTime.setText((new StringBuilder()).append("Expired ").append(s).toString());
            itemState.setText("Expired");
        } else
        if (walletitemresponse.getCouponState() == Constants.REDEEMED.intValue())
        {
            expirationTime.setText("Redeemed ");
            itemState.setText("Redeemed");
        } else
        if (s.contains(","))
        {
            if (walletitemresponse.getCouponState() == Constants.PENDING.intValue())
            {
                if (walletitemresponse.isShortTermOffer())
                {
                    obj = DateUtils.getRelativeTimeSpanString(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue(), Calendar.getInstance().getTimeInMillis(), 0L).toString();
                }
                expirationTime.setText((new StringBuilder()).append("Available ").append(((String) (obj))).toString());
                itemState.setText("Pending");
            } else
            {
                expirationTime.setText((new StringBuilder()).append("Expires ").append(s).toString());
                itemState.setText("Available");
            }
            title.setTextColor(getResources().getColor(0x106000b));
        } else
        {
            if (walletitemresponse.getCouponState() == Constants.PENDING.intValue())
            {
                if (walletitemresponse.isShortTermOffer())
                {
                    obj = DateUtils.getRelativeTimeSpanString(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue(), Calendar.getInstance().getTimeInMillis(), 0L).toString();
                }
                expirationTime.setText((new StringBuilder()).append("Available ").append(((String) (obj))).toString());
                itemState.setText("Pending");
            } else
            {
                expirationTime.setText((new StringBuilder()).append("Expires ").append(s).toString());
                itemState.setText("Available");
            }
            title.setTextColor(getResources().getColor(0x106000b));
        }
        flag = walletitemresponse.isShortTermOffer();
        if (flag)
        {
            obj = new SimpleDateFormat("hh:mm a (z) MMMM d, yyyy");
        } else
        {
            obj = new SimpleDateFormat("MMMM d, yyyy");
            ((SimpleDateFormat) (obj)).setTimeZone(mCentralTimezone);
        }
        s = ((SimpleDateFormat) (obj)).format(calendar.getTime());
        if (walletitemresponse.isShortTermOffer())
        {
            s = ((SimpleDateFormat) (obj)).format(Long.valueOf(walletitemresponse.getEffectiveStartDate()));
        }
        obj1 = ((SimpleDateFormat) (obj)).format(((Calendar) (obj1)).getTime());
        if (walletitemresponse.isShortTermOffer())
        {
            obj1 = ((SimpleDateFormat) (obj)).format(Long.valueOf(walletitemresponse.getEffectiveEndDate()));
        }
        if (flag)
        {
            expiryDate.setText((new StringBuilder()).append(s).append(" to ").append(((String) (obj1))).toString());
        } else
        {
            expiryDate.setText((new StringBuilder()).append(s).append(" - ").append(((String) (obj1))).toString());
        }
        barCodeId.setText(walletitemresponse.getId());
        pinNo.setText((new StringBuilder()).append("PIN: ").append(Appconfig.generatePinWithBarcodeNumber(walletitemresponse.getId())).toString());
        if (expirationTime.getText().toString().toLowerCase().contains("expires"))
        {
            barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), 600, 100, 0xff000000).get());
        } else
        {
            barCode.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(walletitemresponse.getId(), 600, 100, 0xffcccccc).get());
        }
        if (!TextUtils.isEmpty(walletitemresponse.getPromoCode()) && walletitemresponse.getPromoCode().equals("null"))
        {
            promoCode.setText((new StringBuilder()).append("Use Promo Code: ").append(walletitemresponse.getPromoCode()).toString());
            promoCode.setVisibility(0);
            return;
        } else
        {
            promoCode.setVisibility(4);
            return;
        }
    }

    private void showError(WalletResponse walletresponse)
    {
        if (walletresponse == null || walletresponse.getErrors() == null) goto _L2; else goto _L1
_L1:
        walletresponse = (ErrorResponse)walletresponse.getErrors().get(0);
        if (walletresponse.getErrorCode() != 2 && walletresponse.getErrorCode() != 12) goto _L4; else goto _L3
_L3:
        (new android.app.AlertDialog.Builder(this)).setMessage("The Item you entered is invalid. Please try again").setPositiveButton("RETRY", new android.content.DialogInterface.OnClickListener() {

            final LPMessageDetailActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = LPMessageDetailActivity.this;
                super();
            }
        }).setNegativeButton("HELP", new android.content.DialogInterface.OnClickListener() {

            final LPMessageDetailActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
                dialoginterface.setData(Uri.parse("file:///android_asset/scan_help.html"));
                dialoginterface.setAction("android.intent.action.VIEW");
                startActivity(dialoginterface);
            }

            
            {
                this$0 = LPMessageDetailActivity.this;
                super();
            }
        }).show();
_L6:
        return;
_L4:
        if (walletresponse.getErrorCode() == 8)
        {
            Dialog.showDialog("Kohl's", "This item has already been added to your wallet. Please enter a new item.", this, "OK", null, false, true);
            return;
        }
        if (walletresponse.getErrorCode() == 3 || walletresponse.getErrorCode() == 15)
        {
            Dialog.showDialog("Kohl's", "System Error. Please try again later.", this, "OK", null, false, true);
            return;
        } else
        {
            Dialog.showDialog("Invalid Barcode", walletresponse.getMessage(), this, "OK", null, false, true);
            return;
        }
_L2:
        if (walletresponse != null && walletresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR)
        {
            UtilityMethods.openAccountActivity(this, true, false);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean canAccessNetwork()
    {
        return Appconfig.isNetworkAvailable(getApplicationContext());
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        Log.e("Signed in", (new StringBuilder()).append("signin happened ").append(i).append(" result ").append(j).toString());
        if (i == 7001 && j == -1 && KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            findViewById(0x7f0d0044).performClick();
        }
        super.onActivityResult(i, j, intent);
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131558468 2131558469: default 28
    //                   2131558468 29
    //                   2131558469 51;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (view.getTag() instanceof WalletItemResponse)
        {
            addtoWallet((WalletItemResponse)view.getTag());
            return;
        }
          goto _L1
_L3:
        finish();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        String s;
        Bundle bundle1;
        boolean flag;
        boolean flag1;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f03000b);
        mCentralTimezone = TimeZone.getTimeZone("US/Central");
        mCurrentTimezone = TimeZone.getDefault();
        timeDifference = (mCentralTimezone.getRawOffset() + mCentralTimezone.getDSTSavings()) - (mCurrentTimezone.getDSTSavings() + mCurrentTimezone.getRawOffset());
        customerName = (TextView)findViewById(0x7f0d0032);
        title = (TextView)findViewById(0x7f0d0036);
        expirationTime = (TextView)findViewById(0x7f0d0038);
        itemState = (TextView)findViewById(0x7f0d0037);
        promoCode = (TextView)findViewById(0x7f0d0040);
        barCode = (ImageView)findViewById(0x7f0d003e);
        barCodeId = (TextView)findViewById(0x7f0d0041);
        pinNo = (TextView)findViewById(0x7f0d003d);
        expiryDate = (TextView)findViewById(0x7f0d003c);
        walletTerms = (TextView)findViewById(0x7f0d0043);
        findViewById(0x7f0d0045).setOnClickListener(this);
        s = "The message you selected is a invalid or expired.";
        flag1 = false;
        bundle1 = getIntent().getExtras();
        flag = flag1;
        bundle = s;
        if (bundle1 == null) goto _L2; else goto _L1
_L1:
        String s1 = bundle1.getString("messageId");
        if (TextUtils.isEmpty(s1) || !StringUtils.isNumeric(s1) || !bundle1.getBoolean("isScanned")) goto _L4; else goto _L3
_L3:
        s = s1;
        flag = flag1;
        bundle = s;
        if (s.length() > 15)
        {
            flag = true;
            bundle = s;
        }
_L2:
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() == null)
        {
            KohlsPhoneApplication.getInstance().setAuthenticationUtils();
        }
        if (canAccessNetwork())
        {
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
            if (bundle.length() > 15)
            {
                showInputDialog(bundle);
            }
        }
        return;
_L4:
        Logger.Debug((new StringBuilder()).append("Notification extras: messageId=").append(s1).toString(), this);
        flag = flag1;
        bundle = s;
        if (s1 != null)
        {
            bundle = new LPCustomID(s1);
            bundle = LPLocalpointService.getInstance(this).getMessageProvider().getMessage(bundle).getTitle().replaceAll("\\%", "%25");
            flag = flag1;
        }
        if (true) goto _L2; else goto _L5
_L5:
        (new LookupBarcodeAsyncTask()).execute(new String[] {
            bundle
        });
        return;
    }

    protected WalletResponse retrieveWalletResponse()
    {
        Object obj = null;
        if (canAccessNetwork())
        {
            obj = new WalletService(new WeakReference(getApplicationContext()));
            String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId();
            if (TextUtils.isEmpty(s))
            {
                obj = ((WalletService) (obj)).getWalletbyEmail(null);
            } else
            {
                obj = ((WalletService) (obj)).getWalletData(s);
            }
            if (!((WalletResponse) (obj)).isSuccess())
            {
                WalletCache.commit(getApplicationContext(), "rpwallet", obj);
                return null;
            }
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setWalletId(((WalletResponse) (obj)).getWalletId());
            WalletCache.commit(getApplicationContext(), "rpwallet", obj);
        }
        return ((WalletResponse) (obj));
    }

    protected void showInputDialog(final String barCode)
    {
        final EditText editText = LayoutInflater.from(this).inflate(0x7f030090, null);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setView(editText);
        editText = (EditText)editText.findViewById(0x7f0d037e);
        builder.setCancelable(false).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final LPMessageDetailActivity this$0;
            final String val$barCode;
            final EditText val$editText;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
                (new LookupBarcodeAsyncTask()).execute(new String[] {
                    barCode, editText.getText().toString()
                });
            }

            
            {
                this$0 = LPMessageDetailActivity.this;
                barCode = s;
                editText = edittext;
                super();
            }
        });
        builder.create().show();
    }




}
