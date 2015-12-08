// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            SocialSecurityFormattingTextWatcher

public class KycFullSsnActivity extends WalletActivity
{

    EncryptionService encryptionService;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private EditText input;
    KycClient kycClient;

    public KycFullSsnActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private boolean verify()
    {
        final String ssn = input.getText().toString().replaceAll("-", "");
        if (ssn.length() == 9) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= ssn.length())
                {
                    break label1;
                }
                if (!Character.isDigit(ssn.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        Views.hideSoftKeyboard(this, getCurrentFocus());
        fullScreenProgressSpinnerManager.show();
        executeAction("SUBMIT_FULL_SSN", new Callable() {

            final KycFullSsnActivity this$0;
            final String val$ssn;

            private com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnRequest submitfullssnrequest = new com.google.wallet.proto.api.NanoWalletKyc.SubmitFullSsnRequest();
                com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession encryptionsession = encryptionService.newSession();
                com.google.wallet.proto.NanoWalletShared.ClientEncryptedData clientencrypteddata = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                clientencrypteddata.sessionMaterial = (String)encryptionsession.getSessionMaterial();
                clientencrypteddata.payload = (String)encryptionsession.encrypt(ssn);
                submitfullssnrequest.fullSsn = clientencrypteddata;
                return kycClient.submitFullSsn(submitfullssnrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycFullSsnActivity.this;
                ssn = s;
                super();
            }
        });
        return true;
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getWindow().addFlags(8192);
        setTitle("");
        setContentView(com.google.android.apps.walletnfcrel.R.layout.kyc_full_ssn_activity);
        getSupportActionBar().setElevation(0.0F);
        input = (EditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Input);
        input.requestFocus();
        input.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final KycFullSsnActivity this$0;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                verify();
                return true;
            }

            
            {
                this$0 = KycFullSsnActivity.this;
                super();
            }
        });
        input.addTextChangedListener(new SocialSecurityFormattingTextWatcher());
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        fullScreenProgressSpinnerManager.hide();
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        super.onActionSuccess(s, callable, obj);
        fullScreenProgressSpinnerManager.hide();
        setResult(13);
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.kyc_verify_button);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            return verify();
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected final void onUpPressed()
    {
        onBackPressed();
    }

}
