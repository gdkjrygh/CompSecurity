// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Callable;

public class KycShortSsnActivity extends WalletActivity
{

    EncryptionService encryptionService;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    Handler handler;
    private EditText input;
    KycClient kycClient;
    private int retryCount;

    public KycShortSsnActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        retryCount = 0;
    }

    private void showSomethingWentWrongError()
    {
        fullScreenProgressSpinnerManager.hide();
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_okay).setDismissDialogOnClickPositiveButton().build().show(getSupportFragmentManager());
    }

    private boolean verify()
    {
        final String ssn = input.getText().toString();
        if (ssn.length() == 4) goto _L2; else goto _L1
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
        executeAction("SUBMIT_VERIFICATION_INFORMATION", new Callable() {

            final KycShortSsnActivity this$0;
            final String val$ssn;

            private com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentResponse call()
                throws Exception
            {
                byte abyte0[] = getIntent().getByteArrayExtra("CLIENT_ENCRYPTED_DATA");
                com.google.wallet.proto.NanoWalletShared.ClientEncryptedData clientencrypteddata = (com.google.wallet.proto.NanoWalletShared.ClientEncryptedData)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData(), abyte0);
                Object obj = encryptionService.newSession();
                com.google.wallet.proto.NanoWalletShared.ClientEncryptedData clientencrypteddata1 = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                clientencrypteddata1.sessionMaterial = (String)((com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession) (obj)).getSessionMaterial();
                clientencrypteddata1.payload = (String)((com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession) (obj)).encrypt(ssn);
                obj = new com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentRequest();
                obj.identityDocument = clientencrypteddata;
                obj.ssnLastFour = clientencrypteddata1;
                obj.mimeType = "image/jpeg";
                return kycClient.submitVerificationDocument(((com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentRequest) (obj)));
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycShortSsnActivity.this;
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
        setContentView(com.google.android.apps.walletnfcrel.R.layout.kyc_ssn_activity);
        getSupportActionBar().setElevation(0.0F);
        input = (EditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Input);
        input.requestFocus();
        input.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final KycShortSsnActivity this$0;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                verify();
                return true;
            }

            
            {
                this$0 = KycShortSsnActivity.this;
                super();
            }
        });
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        }
        if (retryCount <= 0 && input.getText().toString().length() > 0)
        {
            retryCount = retryCount + 1;
            handler.postDelayed(new Runnable() {

                final KycShortSsnActivity this$0;

                public final void run()
                {
                    verify();
                }

            
            {
                this$0 = KycShortSsnActivity.this;
                super();
            }
            }, 100L);
            return true;
        } else
        {
            showSomethingWentWrongError();
            return true;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        super.onActionSuccess(s, callable, obj);
        if (((com.google.wallet.proto.api.NanoWalletKyc.SubmitVerificationDocumentResponse)obj).callError != null)
        {
            showSomethingWentWrongError();
            return;
        } else
        {
            setResult(13);
            finish();
            return;
        }
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
