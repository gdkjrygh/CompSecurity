// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.zxing.Result;
import com.google.zxing.client.android.CaptureActivity;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.activity.ScanHelpActivity;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.QRMessageDialog;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ManualScanActivity

public class ZxingScannerActivity extends CaptureActivity
{
    private class AddtoWallet extends AsyncTask
    {

        ProgressDialog progressDialog;
        final ZxingScannerActivity this$0;
        List walletId;

        protected transient WalletResponse doInBackground(List alist[])
        {
            if (alist != null && alist.length > 0 && alist[0] != null)
            {
                walletId = alist[0];
                if (alist[0] != null)
                {
                    return (new WalletService(new WeakReference(getApplicationContext()))).addWalletItems(alist[0], false);
                }
            } else
            if (mWalletResponse != null)
            {
                return (new WalletService(new WeakReference(getApplicationContext()))).addWalletItems(mWalletResponse, false);
            }
            return null;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((List[])aobj);
        }

        protected void onPostExecute(WalletResponse walletresponse)
        {
            super.onPostExecute(walletresponse);
            progressDialog.dismiss();
            if (walletresponse == null || !walletresponse.isSuccess()) goto _L2; else goto _L1
_L1:
            Intent intent;
            intent = new Intent("signin_page");
            intent.putExtra("createwallet", "createwallet");
            if (isMultiScan || !((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("offer")) goto _L4; else goto _L3
_L3:
            intent.putExtra("position", Constants.POSITION_OF_OFFERS_TAB_IN_WALLET);
_L6:
            Iterator iterator;
            WalletItemResponse walletitemresponse;
            boolean flag;
            boolean flag1;
            if (walletId == null)
            {
                if (mValidBarcode != null)
                {
                    ArrayList arraylist = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                    arraylist.addAll(mValidBarcode);
                    KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(arraylist);
                }
            } else
            {
                ArrayList arraylist1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                for (Iterator iterator1 = walletId.iterator(); iterator1.hasNext(); arraylist1.add(((WalletItemResponse)iterator1.next()).getId())) { }
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(arraylist1);
            }
            OmnitureMeasurement.getInstance().walletScan();
            if (walletresponse.getAddedItems() != null && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equalsIgnoreCase("kohlscash"))
            {
                AnalyticsHelper.sendAnalyticsOnWalletKohlsCashAdded();
            } else
            if (walletresponse.getAddedItems() != null && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equalsIgnoreCase("offers"))
            {
                AnalyticsHelper.sendAnalyticsOnWalletDiscountAdded();
            } else
            {
                AnalyticsHelper.sendAnalyticsOnGiftCardAdded();
            }
            intent.putExtra("notificationId", System.currentTimeMillis());
            LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
            goback();
            return;
_L4:
            if (!isMultiScan && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("giftcard") || !isMultiScan && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("kmrc"))
            {
                intent.putExtra("position", Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET);
            } else
            if (!isMultiScan)
            {
                intent.putExtra("position", Constants.POSITION_OF_CASH_TAB_IN_WALLET);
            } else
            {
                flag = false;
                flag1 = false;
                iterator = walletresponse.getAddedItems().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    walletitemresponse = (WalletItemResponse)iterator.next();
                    if (walletitemresponse.getTypeCode().equals("kohlscash"))
                    {
                        flag = true;
                    } else
                    if (walletitemresponse.getTypeCode().equals("giftcard") || walletitemresponse.getTypeCode().equals("kmrc"))
                    {
                        flag1 = true;
                    }
                } while (true);
                if (flag)
                {
                    intent.putExtra("position", Constants.POSITION_OF_CASH_TAB_IN_WALLET);
                } else
                if (flag1)
                {
                    intent.putExtra("position", Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET);
                }
            }
            continue; /* Loop/switch isn't completed */
_L2:
            showError(walletresponse);
            return;
            if (true) goto _L6; else goto _L5
_L5:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((WalletResponse)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(ZxingScannerActivity.this, "Adding Items", "Please wait");
        }

        private AddtoWallet()
        {
            this$0 = ZxingScannerActivity.this;
            super();
            walletId = null;
        }

    }

    public class LookupBarcodeAsyncTask extends AsyncTask
    {

        WalletResponse barcodeResponseContainerLookup;
        ProgressDialog progressDialog;
        String response;
        final ZxingScannerActivity this$0;

        protected transient WalletResponse doInBackground(String as[])
        {
            if (as[0] != null && as[0].length() > 15 && as[1] != null)
            {
                barcodeResponseContainerLookup = (new WalletService(new WeakReference(getApplicationContext()))).getWallentByGiftCard(as[0], as[1]);
            } else
            {
                barcodeResponseContainerLookup = (new WalletService(new WeakReference(getApplicationContext()))).getWallentByLookup(as[0]);
            }
            return barcodeResponseContainerLookup;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(WalletResponse walletresponse)
        {
            super.onPostExecute(walletresponse);
            resetCamera();
        /* block-local class not found */
        class _cls1 {}

            try
            {
                progressDialog.dismiss();
            }
            catch (Exception exception)
            {
                isScanning = false;
                exception.printStackTrace();
            }
            if (!Appconfig.isNetworkAvailable(getApplicationContext())) goto _L2; else goto _L1
_L1:
            if (walletresponse == null)
            {
                break MISSING_BLOCK_LABEL_2592;
            }
            if (walletresponse.isSuccess() && !((WalletItemResponse)walletresponse.getWalletItems().get(0)).getTypeCode().equals("kmrc") && !((WalletItemResponse)walletresponse.getWalletItems().get(0)).getTypeCode().equals("giftcard") && Long.valueOf(((WalletItemResponse)walletresponse.getWalletItems().get(0)).getEffectiveEndDate()).longValue() + 0xf731400L < System.currentTimeMillis())
            {
                (new android.app.AlertDialog.Builder(ZxingScannerActivity.this)).setMessage("The barcode you've scanned is invalid. Please try another barcode.").setPositiveButton("OK", new _cls1(walletresponse)).show();
                isScanning = false;
                return;
            }
            if (!walletresponse.isSuccess()) goto _L4; else goto _L3
_L3:
            if (!isMultiScan) goto _L6; else goto _L5
_L5:
            android.view.animation.Animation animation;
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
            resetCamera();
            animation = AnimationUtils.loadAnimation(getApplicationContext(), 0x7f040002);
            marginlayoutparams = new android.view.ViewGroup.MarginLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 15));
            marginlayoutparams.setMargins(1, 1, 1, -3);
            if (mScannedBarcode != null && mScannedBarcode.size() > 0 && findViewById(0x7f0d0134).getVisibility() == 8)
            {
                findViewById(0x7f0d0134).setVisibility(0);
            }
            walletresponse = "";
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("offer"))
            {
                if (!TextUtils.isEmpty(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getDescription()))
                {
                    walletresponse = (new StringBuilder()).append(" ").append(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getDescription()).toString();
                } else
                if (!TextUtils.isEmpty(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getPromoCode()))
                {
                    walletresponse = (new StringBuilder()).append(" ").append(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getPromoCode()).toString();
                }
            } else
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("giftcard"))
            {
                walletresponse = (new DecimalFormat("0.00")).format(Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()));
                walletresponse = (new StringBuilder()).append(" $").append(walletresponse.replaceFirst("\\.00+$", "")).append(" ").append("Gift Card").toString();
            } else
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("kmrc"))
            {
                walletresponse = (new DecimalFormat("0.00")).format(Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()));
                walletresponse = (new StringBuilder()).append(" $").append(walletresponse.replaceFirst("\\.00+$", "")).append(" ").append("Merchandise Credit").toString();
            } else
            {
                walletresponse = (new DecimalFormat("0.00")).format(Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()));
                walletresponse = (new StringBuilder()).append(" $").append(walletresponse.replaceFirst("\\.00+$", "")).append(" ").append("Kohl's Cash").toString();
            }
            mScannedBarcode.size();
            JVM INSTR tableswitch 1 5: default 444
        //                       1 960
        //                       2 1231
        //                       3 1475
        //                       4 1795
        //                       5 2129;
               goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
            mWalletResponse.add(barcodeResponseContainerLookup.getWalletItems().get(0));
            mValidBarcode = mScannedBarcode;
            if (mValidBarcode != null && mValidBarcode.size() > 0)
            {
                if (findViewById(0x7f0d0132).getVisibility() == 8)
                {
                    findViewById(0x7f0d0132).setVisibility(0);
                }
                ((TextView)findViewById(0x7f0d0133)).setText((new StringBuilder()).append("").append(mValidBarcode.size()).toString());
            }
            invalidateOptionsMenu();
_L2:
            isScanning = false;
            return;
_L8:
            ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0135)).findViewById(0x7f0d0036)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("offer") || Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()).doubleValue() > 0.0D || ((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("giftcard") || ((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("kmrc"))
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0135)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0135)).setBackgroundResource(0x7f020003);
            } else
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0135)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0135)).setBackgroundResource(0x7f0200ac);
            }
            findViewById(0x7f0d0135).setVisibility(0);
              goto _L7
_L9:
            ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0136)).findViewById(0x7f0d0036)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("offer") || Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()).doubleValue() > 0.0D)
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0136)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0136)).setBackgroundResource(0x7f020003);
            } else
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0136)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0136)).setBackgroundResource(0x7f0200ac);
            }
            findViewById(0x7f0d0134).setAnimation(animation);
            findViewById(0x7f0d0136).setVisibility(0);
            findViewById(0x7f0d0135).setVisibility(0);
              goto _L7
_L10:
            ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).findViewById(0x7f0d0036)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("offer") || Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()).doubleValue() > 0.0D)
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).findViewById(0x7f0d0036)).setBackgroundResource(0x7f020003);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).setBackgroundResource(0x7f020003);
            } else
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).findViewById(0x7f0d0036)).setBackgroundResource(0x7f0200ac);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0137)).setBackgroundResource(0x7f0200ac);
            }
            findViewById(0x7f0d0134).setAnimation(animation);
            findViewById(0x7f0d0137).setVisibility(0);
            findViewById(0x7f0d0135).setVisibility(0);
            findViewById(0x7f0d0136).setVisibility(0);
              goto _L7
_L11:
            ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).findViewById(0x7f0d0036)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("offer") || Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()).doubleValue() > 0.0D)
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).findViewById(0x7f0d0036)).setBackgroundResource(0x7f020003);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).setBackgroundResource(0x7f020003);
            } else
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).findViewById(0x7f0d0036)).setBackgroundResource(0x7f0200ac);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0138)).setBackgroundResource(0x7f0200ac);
            }
            findViewById(0x7f0d0134).setAnimation(animation);
            findViewById(0x7f0d0138).setVisibility(0);
            findViewById(0x7f0d0135).setVisibility(0);
            findViewById(0x7f0d0136).setVisibility(0);
            findViewById(0x7f0d0137).setVisibility(0);
              goto _L7
_L12:
            ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).findViewById(0x7f0d0036)).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
            if (((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getTypeCode().equals("offer") || Double.valueOf(((WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0)).getValue()).doubleValue() > 0.0D)
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).findViewById(0x7f0d0036)).setBackgroundResource(0x7f020003);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).setBackgroundResource(0x7f020003);
            } else
            {
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).findViewById(0x7f0d0036)).setText(walletresponse);
                ((TextView)((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).findViewById(0x7f0d0036)).setBackgroundResource(0x7f0200ac);
                ((LinearLayout)(LinearLayout)findViewById(0x7f0d0139)).setBackgroundResource(0x7f0200ac);
            }
            findViewById(0x7f0d0134).setAnimation(animation);
            findViewById(0x7f0d0139).setVisibility(0);
            findViewById(0x7f0d0135).setVisibility(0);
            findViewById(0x7f0d0136).setVisibility(0);
            findViewById(0x7f0d0137).setVisibility(0);
            findViewById(0x7f0d0138).setVisibility(0);
            findViewById(0x7f0d0138).setLayoutParams(new android.widget.LinearLayout.LayoutParams(marginlayoutparams));
              goto _L7
_L6:
            walletresponse = (WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0);
            ArrayList arraylist = new ArrayList();
            arraylist.add(walletresponse);
            if (Appconfig.isNetworkAvailable(getApplicationContext()) && !isFinishing())
            {
                (new AddtoWallet()).execute(new List[] {
                    arraylist
                });
            }
              goto _L2
_L4:
            showError(walletresponse);
              goto _L2
            Dialog.showDialog("No Network Connection", Constants.NETWORK_CONNECTION_MESSAGE, ZxingScannerActivity.this, "OK", null, false, false);
              goto _L2
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((WalletResponse)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(ZxingScannerActivity.this, "Looking Up Barcode", "Please wait");
        }

        public LookupBarcodeAsyncTask()
        {
            this$0 = ZxingScannerActivity.this;
            super();
            response = "false";
            barcodeResponseContainerLookup = null;
        }
    }


    public static final String INTENT_MULTI_SCAN = "intent_multi_scan";
    public static final int RESULT_NOT_A_KOHLS_CODE = 3;
    public static final String SCAN_REQUEST_TYPE = "scan_request";
    private boolean isFound;
    private boolean isMultiScan;
    private boolean isScanning;
    private List mAvailableCodes;
    private List mScannedBarcode;
    protected BroadcastReceiver mUpdateUIReceiver;
    private List mValidBarcode;
    private List mWalletResponse;
    Menu mainMenu;
    private int scanRequestType;

    public ZxingScannerActivity()
    {
        isFound = false;
        isMultiScan = false;
        isScanning = false;
        mAvailableCodes = new ArrayList();
        mScannedBarcode = new ArrayList();
        mValidBarcode = new ArrayList();
        mWalletResponse = new ArrayList();
        mUpdateUIReceiver = new BroadcastReceiver() {

            final ZxingScannerActivity this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
                {
                    context = new Intent(context.getApplicationContext(), com/kohls/mcommerce/opal/wallet/util/QRMessageDialog);
                    context.putExtra("ServerError", "Hi! It looks like you've already enrolled in Yes2You Rewards. Just shop and you can earn points!");
                    startActivity(context);
                }
                try
                {
                    finish();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return;
                }
            }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
        };
    }

    private void displayPageFromQRScan()
    {
        if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setLoyaltyMode("signup");
            Intent intent = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            intent.putExtra("open_screen_key", "open_my_enrollment");
            startActivity(intent);
            finish();
            return;
        } else
        {
            Intent intent1 = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/util/QRMessageDialog);
            intent1.putExtra("ServerError", "Hi! It looks like you've already enrolled in Yes2You Rewards. Just shop and you can earn points!");
            startActivity(intent1);
            finish();
            return;
        }
    }

    private List getWalletEntries()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = WalletCache.get(getApplicationContext(), "rpwallet");
        if (obj != null && ((WalletResponse) (obj)).getWalletItems() != null)
        {
            for (obj = ((WalletResponse) (obj)).getWalletItems().iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((WalletItemResponse)((Iterator) (obj)).next()).getId())) { }
        }
        return arraylist;
    }

    private void goback()
    {
        super.onBackPressed();
    }

    private void showError(WalletResponse walletresponse)
    {
        isFound = false;
        OmnitureMeasurement.getInstance().walletScanError();
        if (walletresponse != null && walletresponse.getErrors() != null)
        {
            ErrorResponse errorresponse = (ErrorResponse)walletresponse.getErrors().get(0);
            try
            {
                mScannedBarcode.remove(errorresponse.getID());
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            if (walletresponse != null && walletresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR || walletresponse != null && errorresponse.getErrorCode() == 4)
            {
                UtilityMethods.openAccountActivity(this, true, false);
                return;
            }
            if (errorresponse.getErrorCode() == 2 || errorresponse.getErrorCode() == 12)
            {
                (new android.app.AlertDialog.Builder(this)).setMessage(getApplicationContext().getResources().getString(0x7f080550)).setPositiveButton(getApplicationContext().getResources().getString(0x7f080481), new android.content.DialogInterface.OnClickListener() {

                    final ZxingScannerActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                    }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
                }).setNegativeButton(getApplicationContext().getResources().getString(0x7f08022d), new android.content.DialogInterface.OnClickListener() {

                    final ZxingScannerActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity);
                        dialoginterface.setData(Uri.parse("file:///android_asset/scan_help.html"));
                        dialoginterface.putExtra("scan_request", 2001);
                        dialoginterface.setAction("android.intent.action.VIEW");
                        startActivity(dialoginterface);
                    }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
                }).show();
                return;
            }
            if (errorresponse.getErrorCode() == 8)
            {
                Dialog.showDialog(getApplicationContext().getResources().getString(0x7f080262), getApplicationContext().getResources().getString(0x7f080553), this, getApplicationContext().getResources().getString(0x7f0803e5), null, false, false);
                return;
            }
            if (errorresponse.getErrorCode() == 3 || errorresponse.getErrorCode() == 15)
            {
                Dialog.showDialog(getApplicationContext().getResources().getString(0x7f080262), getApplicationContext().getResources().getString(0x7f080551), this, getApplicationContext().getResources().getString(0x7f0803e5), null, false, false);
                return;
            }
            if (errorresponse.getErrorCode() == 5)
            {
                Dialog.showDialog(getApplicationContext().getResources().getString(0x7f080262), getApplicationContext().getResources().getString(0x7f080552), this, getApplicationContext().getResources().getString(0x7f0803e5), null, false, false);
                return;
            } else
            {
                Dialog.showDialog(getApplicationContext().getResources().getString(0x7f08055c), errorresponse.getMessage(), this, getApplicationContext().getResources().getString(0x7f0803e5), null, false, false);
                return;
            }
        }
        if (walletresponse != null && walletresponse.getErrorType() != null && walletresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR)
        {
            UtilityMethods.openAccountActivity(this, true, false);
            return;
        } else
        {
            Dialog.showDialog(getApplicationContext().getResources().getString(0x7f0803bd), getApplicationContext().getResources().getString(0x7f08055d), this, getApplicationContext().getResources().getString(0x7f0803e5), null, false, false);
            return;
        }
    }

    public void handleDecode(Result result, Bitmap bitmap, float f)
    {
        if (isScanning) goto _L2; else goto _L1
_L1:
        String s = result.getText();
        if (!s.contains("http") && !s.contains("https")) goto _L4; else goto _L3
_L3:
        result = Uri.parse(result.getText());
        (new Intent()).setData(result);
        bitmap = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getLoyaltyEnrollmentScanningUrl();
        result = bitmap;
        if (TextUtils.isEmpty(bitmap))
        {
            result = "http://2d-co.de/70605596023";
        }
        if (s.contains(result))
        {
            if (isMultiScan)
            {
                if (mValidBarcode.size() > 0)
                {
                    (new android.app.AlertDialog.Builder(this)).setTitle("Kohl's").setMessage("You are about to be redirected away from this page and may lose the items you have scanned. Do you wish to continue?").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                        final ZxingScannerActivity this$0;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            finish();
                            displayPageFromQRScan();
                        }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
                    }).setNegativeButton("CANCEL", new android.content.DialogInterface.OnClickListener() {

                        final ZxingScannerActivity this$0;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            finish();
                        }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
                    }).show();
                } else
                {
                    displayPageFromQRScan();
                }
            } else
            {
                displayPageFromQRScan();
            }
        } else
        {
            result = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog);
            result.putExtra("ServerError", "This is not a Kohl's code.");
            startActivity(result);
            setResult(3, result);
        }
        resetCamera();
_L2:
        return;
_L4:
        resetCamera();
        if (isMultiScan)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (result != null && !isFound)
        {
            isFound = true;
            if (result.getText().length() > 15)
            {
                showInputDialog(result.getText());
                return;
            }
            bitmap = new LookupBarcodeAsyncTask();
            try
            {
                bitmap.execute(new String[] {
                    URLEncoder.encode(result.getText().trim(), "UTF8")
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Result result)
            {
                result.printStackTrace();
            }
            Dialog.showDialog("Invalid Barcode", "The barcode you have scanned is invalid. Please try a different one.", this, "OK", null, false, false);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!isMultiScan || isScanning) goto _L2; else goto _L5
_L5:
        if (result != null && mValidBarcode.size() < 5)
        {
            if (!mScannedBarcode.contains(result.getText()) && !mAvailableCodes.contains(result.getText()))
            {
                isScanning = true;
                if (result.getText().length() > 15)
                {
                    showInputDialog(result.getText());
                } else
                {
                    bitmap = new LookupBarcodeAsyncTask();
                    try
                    {
                        bitmap.execute(new String[] {
                            URLEncoder.encode(result.getText(), "UTF8")
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bitmap bitmap)
                    {
                        bitmap.printStackTrace();
                        Dialog.showDialog("Invalid Barcode", "The barcode you have scanned is invalid. Please try a different one.", this, "OK", null, false, false);
                    }
                }
                mScannedBarcode.add(result.getText());
                return;
            }
            if (mAvailableCodes.contains(result.getText()))
            {
                Dialog.showDialog("Kohl's", "This item has already been added to your wallet. Please scan a new item.", this, "OK", null, false, false);
                return;
            } else
            {
                (new android.app.AlertDialog.Builder(this)).setMessage("This item has already been scanned.").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                    final ZxingScannerActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                    }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
                }).show();
                return;
            }
        }
        if (mValidBarcode.size() >= 5)
        {
            (new android.app.AlertDialog.Builder(this)).setMessage("We're sorry, you've scanned the maximum number of items allowed.").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final ZxingScannerActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
            }).show();
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onBackPressed()
    {
        if (mValidBarcode.size() > 0)
        {
            (new android.app.AlertDialog.Builder(this)).setTitle("Discard Items").setMessage("Are you sure you want to cancel the scanned item(s)?").setPositiveButton("Yes", new android.content.DialogInterface.OnClickListener() {

                final ZxingScannerActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    goback();
                }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
            }).setNegativeButton("No", new android.content.DialogInterface.OnClickListener() {

                final ZxingScannerActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
            }).show();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030023);
        bundle = (TextView)findViewById(0x7f0d01c5);
        bundle.setVisibility(0);
        bundle.setClickable(true);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final ZxingScannerActivity this$0;

            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/ManualScanActivity));
                finish();
            }

            
            {
                this$0 = ZxingScannerActivity.this;
                super();
            }
        });
        setActionBar();
        mAvailableCodes = getWalletEntries();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100005, menu);
        if (isMultiScan && mValidBarcode != null && mValidBarcode.size() > 0)
        {
            menu.findItem(0x7f0d06f7).setVisible(false);
            findViewById(0x7f0d01c5).setVisibility(8);
            menu.findItem(0x7f0d06f8).setVisible(true);
            menu.findItem(0x7f0d06f6).setVisible(true);
            menu.findItem(0x7f0d06f8).setIcon(0x7f0200e5);
        } else
        {
            menu.findItem(0x7f0d06f7).setVisible(true);
            findViewById(0x7f0d01c5).setVisibility(0);
            menu.findItem(0x7f0d06f8).setVisible(true);
            menu.findItem(0x7f0d06f6).setVisible(false);
        }
        mainMenu = menu;
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() != 0x7f0d06f6)
        {
            int i = 0;
            while (i < mainMenu.size()) 
            {
                if (mainMenu.getItem(i).getItemId() == 0x7f0d06f7)
                {
                    mainMenu.getItem(i).setIcon(0x7f0200fc);
                } else
                if (mainMenu.getItem(i).getItemId() == 0x7f0d06f8)
                {
                    mainMenu.getItem(i).setIcon(0x7f0200e6);
                }
                i++;
            }
        }
        menuitem.getItemId();
        JVM INSTR tableswitch 2131560182 2131560184: default 156
    //                   2131560182 257
    //                   2131560183 236
    //                   2131560184 162;
           goto _L1 _L2 _L3 _L4
_L1:
        onBackPressed();
_L6:
        return true;
_L4:
        Bundle bundle = new Bundle();
        bundle.putBoolean("isMultiScan", true);
        Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/ZxingScannerActivity);
        intent.setFlags(0x20000);
        intent.putExtra("intent_multi_scan", true);
        intent.putExtras(bundle);
        startActivity(intent);
        isMultiScan = true;
        menuitem.setIcon(0x7f0200e5);
        return true;
_L3:
        resetCamera();
        isMultiScan = false;
        menuitem.setIcon(0x7f0200fb);
        return true;
_L2:
        if (Appconfig.isNetworkAvailable(getApplicationContext()) && !isFinishing())
        {
            (new AddtoWallet()).execute(new List[0]);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onResume()
    {
        super.onResume();
        if (getIntent().hasExtra("scan_request"))
        {
            scanRequestType = getIntent().getExtras().getInt("scan_request");
        }
    }

    public void setActionBar()
    {
        Object obj = getActionBar();
        ((ActionBar) (obj)).setDisplayUseLogoEnabled(false);
        ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(true);
        ((ActionBar) (obj)).setBackgroundDrawable(new ColorDrawable(0xff000000));
        ((ActionBar) (obj)).setTitle(getString(0x7f0804a4));
        ((ActionBar) (obj)).setIcon(new ColorDrawable(getResources().getColor(0x106000d)));
        ((ActionBar) (obj)).show();
        obj = (TextView)findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (obj != null)
        {
            ((TextView) (obj)).setTypeface(WalletFontCache.getGothamBold(getApplicationContext()));
            ((TextView) (obj)).setTextColor(-1);
            ((TextView) (obj)).setTextSize(Constants.BARCODE_FONT_SIZE);
        }
    }

    protected void showInputDialog(final String barCode)
    {
        final EditText editText = LayoutInflater.from(this).inflate(0x7f030090, null);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setView(editText);
        editText = (EditText)editText.findViewById(0x7f0d037e);
        builder.setCancelable(false).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final ZxingScannerActivity this$0;
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
                this$0 = ZxingScannerActivity.this;
                barCode = s;
                editText = edittext;
                super();
            }
        });
        builder.create().show();
    }






/*
    static List access$402(ZxingScannerActivity zxingscanneractivity, List list)
    {
        zxingscanneractivity.mValidBarcode = list;
        return list;
    }

*/




/*
    static boolean access$702(ZxingScannerActivity zxingscanneractivity, boolean flag)
    {
        zxingscanneractivity.isScanning = flag;
        return flag;
    }

*/


/*
    static boolean access$802(ZxingScannerActivity zxingscanneractivity, boolean flag)
    {
        zxingscanneractivity.isFound = flag;
        return flag;
    }

*/

}
