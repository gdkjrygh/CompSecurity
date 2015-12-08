// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ZxingScannerActivity, WalletUsageInfoActivity

public class ManualScanActivity extends FragmentActivity
    implements android.view.View.OnClickListener
{
    private class AddtoWallet extends AsyncTask
    {

        ProgressDialog progressDialog;
        final ManualScanActivity this$0;
        List walletId;

        protected transient WalletResponse doInBackground(List alist[])
        {
            if (alist != null && alist.length > 0 && alist[0] != null)
            {
                walletId = alist[0];
                if (walletId.get(0) != null && ((WalletItemResponse)walletId.get(0)).getTypeCode().equalsIgnoreCase("giftcard") || walletId.get(0) != null && ((WalletItemResponse)walletId.get(0)).getTypeCode().equalsIgnoreCase("kmrc"))
                {
                    return (new WalletService(new WeakReference(getApplicationContext()))).addWalletItems(walletId, false);
                }
                if (walletId != null)
                {
                    alist = new HashSet(walletId);
                    return (new WalletService(new WeakReference(getApplicationContext()))).addtoWallet(alist);
                }
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
            if (walletresponse != null && walletresponse.isSuccess())
            {
                Object obj = new Intent("signin_page");
                ((Intent) (obj)).putExtra("createwallet", "createwallet");
                if (walletresponse.getAddedItems() != null && walletresponse.getAddedItems().size() > 0 && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("offer"))
                {
                    ((Intent) (obj)).putExtra("position", Constants.POSITION_OF_OFFERS_TAB_IN_WALLET);
                } else
                if (walletresponse.getAddedItems() != null && walletresponse.getAddedItems().size() > 0 && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("giftcard") || walletresponse.getAddedItems() != null && walletresponse.getAddedItems().size() > 0 && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("kmrc"))
                {
                    ((Intent) (obj)).putExtra("position", Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET);
                } else
                {
                    ((Intent) (obj)).putExtra("position", Constants.POSITION_OF_CASH_TAB_IN_WALLET);
                }
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(((Intent) (obj)));
                if (walletId != null)
                {
                    obj = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                    for (Iterator iterator = walletId.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(((WalletItemResponse)iterator.next()).getId())) { }
                    KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(((ArrayList) (obj)));
                }
                dismissVirtualKeyboard();
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
            progressDialog = ProgressDialog.show(ManualScanActivity.this, "Adding Items", "Please wait");
        }

        private AddtoWallet()
        {
            this$0 = ManualScanActivity.this;
            super();
            walletId = null;
        }

    }

    public class LookupBarcodeAsyncTask extends AsyncTask
    {

        WalletResponse barcodeResponseContainerLookup;
        ProgressDialog progressDialog;
        String response;
        final ManualScanActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient String doInBackground(String as[])
        {
            if (as[0] != null && as[0].length() > 15 && as[1] != null)
            {
                barcodeResponseContainerLookup = (new WalletService(new WeakReference(getApplicationContext()))).getWallentByGiftCard(as[0], as[1]);
            } else
            {
                barcodeResponseContainerLookup = (new WalletService(new WeakReference(getApplicationContext()))).getWallentByLookup(as[0]);
            }
            if (barcodeResponseContainerLookup == null)
            {
                return "false";
            } else
            {
                return "true";
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            super.onPostExecute(s);
            try
            {
                progressDialog.dismiss();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            if (s.equals("true"))
            {
                if (barcodeResponseContainerLookup.isSuccess())
                {
                    s = (WalletItemResponse)barcodeResponseContainerLookup.getWalletItems().get(0);
                    if (s != null && (s.getTypeCode().equals("kohlscash") || s.getTypeCode().equals("offer")) && Long.valueOf(s.getEffectiveEndDate()).longValue() + 0xa4cb800L < System.currentTimeMillis())
                    {
        /* block-local class not found */
        class _cls1 {}

                        (new android.app.AlertDialog.Builder(ManualScanActivity.this)).setMessage("The Item you entered is invalid.Please try again").setPositiveButton("OK", new _cls1()).show();
                        return;
                    }
                    String s1 = pinEditText.getText().toString();
                    if (s != null && s.getTypeCode().equals("kohlscash") && s1.equals(Appconfig.generatePinWithBarcodeNumber(s.getId())) || s != null && s.getTypeCode().equals("offer") || s != null && s.getTypeCode().equals("giftcard") || s != null && s.getTypeCode().equals("kmrc"))
                    {
                        ArrayList arraylist = new ArrayList();
                        arraylist.add(s);
                        (new AddtoWallet()).execute(new List[] {
                            arraylist
                        });
                        return;
                    } else
                    {
                        Dialog.showDialog("Invalid Pin", Constants.INVALID_INPUT_PIN_MESSAGE, ManualScanActivity.this, "OK", null, false, false);
                        return;
                    }
                }
                if (barcodeResponseContainerLookup == null || barcodeResponseContainerLookup != null && barcodeResponseContainerLookup.getErrors() == null || barcodeResponseContainerLookup != null && barcodeResponseContainerLookup.getErrors() != null && barcodeResponseContainerLookup.getErrors().size() <= 0)
                {
                    Dialog.showDialog("Kohl's", "Please try again later", ManualScanActivity.this, "OK", null, false, false);
                    return;
                }
                s = (ErrorResponse)barcodeResponseContainerLookup.getErrors().get(0);
                if (barcodeResponseContainerLookup != null && barcodeResponseContainerLookup.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR || barcodeResponseContainerLookup != null && s.getErrorCode() == 4)
                {
                    UtilityMethods.openAccountActivity(ManualScanActivity.this, true, false);
                    return;
                }
                if (s.getErrorCode() == 2 || s.getErrorCode() == 12)
                {
                    Dialog.showDialog("Kohl's", "The item you entered is invalid. Please try again.", ManualScanActivity.this, "OK", null, false, false);
                    return;
                } else
                {
                    Dialog.showDialog("Kohl's", s.getMessage(), ManualScanActivity.this, "OK", null, false, false);
                    OmnitureMeasurement.getInstance().walletScanError();
                    return;
                }
            } else
            {
                Dialog.showDialog("No Network Connection", Constants.NETWORK_CONNECTION_MESSAGE, ManualScanActivity.this, "OK", null, false, false);
                return;
            }
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(ManualScanActivity.this, "Please wait", "Verifying...");
        }

        public LookupBarcodeAsyncTask()
        {
            this$0 = ManualScanActivity.this;
            super();
            response = "false";
            barcodeResponseContainerLookup = null;
        }
    }


    EditText barcodeEditText;
    boolean isFromHome;
    EditText pinEditText;

    public ManualScanActivity()
    {
    }

    private void showError(WalletResponse walletresponse)
    {
        if (walletresponse != null && walletresponse.getErrors() != null)
        {
            walletresponse = (ErrorResponse)walletresponse.getErrors().get(0);
            if (walletresponse.getErrorCode() == 2 || walletresponse.getErrorCode() == 12)
            {
                (new android.app.AlertDialog.Builder(this)).setMessage("The Item you entered is invalid. Please try again").setPositiveButton("RETRY", new android.content.DialogInterface.OnClickListener() {

                    final ManualScanActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                    }

            
            {
                this$0 = ManualScanActivity.this;
                super();
            }
                }).setNegativeButton("HELP", new android.content.DialogInterface.OnClickListener() {

                    final ManualScanActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        UtilityMethods.openUrlInWebViewActivity("https://cs-stress.kohlsecommerce.com/app/answers/detail/a_id/50", getApplicationContext());
                    }

            
            {
                this$0 = ManualScanActivity.this;
                super();
            }
                }).show();
                return;
            }
            if (walletresponse.getErrorCode() == 8)
            {
                Dialog.showDialog("Kohl's", "This item has already been added to your wallet. Please enter a new item.", this, "OK", null, false, false);
                return;
            }
            if (walletresponse.getErrorCode() == 3 || walletresponse.getErrorCode() == 15)
            {
                Dialog.showDialog("Kohl's", "System Error. Please try again later.", this, "OK", null, false, false);
                return;
            } else
            {
                Dialog.showDialog("Invalid Barcode", walletresponse.getMessage(), this, "OK", null, false, false);
                return;
            }
        }
        if (walletresponse != null && walletresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.Response.ErrorType.AUTHENTICATION_ERROR)
        {
            UtilityMethods.openAccountActivity(this, true, false);
            return;
        } else
        {
            Dialog.showDialog("Network Error", "Check your network connection or try again later", this, "OK", null, false, false);
            return;
        }
    }

    void dismissVirtualKeyboard()
    {
        try
        {
            InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
            inputmethodmanager.hideSoftInputFromWindow(barcodeEditText.getWindowToken(), 0);
            inputmethodmanager.hideSoftInputFromWindow(pinEditText.getWindowToken(), 0);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void findBarcode()
    {
label0:
        {
            String as[];
label1:
            {
label2:
                {
                    as = new String[2];
                    as[0] = barcodeEditText.getText().toString();
                    if (Appconfig.isNetworkAvailable(getApplicationContext()))
                    {
                        if (TextUtils.isEmpty(as[0]))
                        {
                            break label0;
                        }
                        if (as[0].length() <= 15)
                        {
                            break label1;
                        }
                        if (!TextUtils.isEmpty(pinEditText.getText().toString()))
                        {
                            break label2;
                        }
                        Dialog.showDialog("Enter PIN", "Please enter a Pin Number to continue", this, "OK", null, false, false);
                    }
                    return;
                }
                as[1] = pinEditText.getText().toString();
            }
            (new LookupBarcodeAsyncTask()).execute(as);
            return;
        }
        Dialog.showDialog("Invalid Fields", Constants.INVLIAD_INPUT_FIELD_MESSAGE, this, "OK", null, false, false);
    }

    public void onBackPressed()
    {
        if (!isFromHome)
        {
            Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/ZxingScannerActivity);
            intent.putExtra("intent_multi_scan", false);
            startActivity(intent);
        }
        dismissVirtualKeyboard();
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131559593: 
        case 2131559594: 
        default:
            return;

        case 2131559597: 
            findBarcode();
            return;

        case 2131559596: 
            isFromHome = false;
            onBackPressed();
            return;

        case 2131559595: 
            view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/WalletUsageInfoActivity);
            if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getwalletHelpURL()))
            {
                view.putExtra("help_bundle", Appconfig.WALLET_HELP_PAGE_FAIL_SAFE);
            } else
            {
                view.putExtra("help_bundle", KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getwalletHelpURL());
            }
            startActivity(view);
            AnalyticsHelper.sendAnalyticsOnUsingWallet();
            return;

        case 2131559592: 
            dismissVirtualKeyboard();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b7);
        isFromHome = getIntent().getBooleanExtra("fromHome", false);
        barcodeEditText = (EditText)findViewById(0x7f0d04a9);
        barcodeEditText.requestFocus();
        pinEditText = (EditText)findViewById(0x7f0d04aa);
        barcodeEditText.setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
        pinEditText.setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
        bundle = new SpannableString(getString(0x7f080557));
        bundle.setSpan(new UnderlineSpan(), 0, bundle.length(), 0);
        ((TextView)findViewById(0x7f0d04ab)).setText(bundle);
        bundle = new SpannableString(getString(0x7f08055a));
        bundle.setSpan(new UnderlineSpan(), 0, bundle.length(), 0);
        ((TextView)findViewById(0x7f0d04ac)).setText(bundle);
        findViewById(0x7f0d04ac).setOnClickListener(this);
        findViewById(0x7f0d04ad).setOnClickListener(this);
        findViewById(0x7f0d04ab).setOnClickListener(this);
        findViewById(0x7f0d04a8).setOnClickListener(this);
        setUpActionBar();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.setTitle("Enter Code");
            actionbar.show();
        }
    }

}
