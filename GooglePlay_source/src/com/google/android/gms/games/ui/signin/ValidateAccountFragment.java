// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesSignInService;
import com.google.android.gms.games.signin.SignInClient;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public final class ValidateAccountFragment extends GamesSignInFragment
    implements com.google.android.gms.games.signin.SignInClient.OnAccountValidatedCallback
{

    public ValidateAccountFragment()
    {
    }

    public final int getAssociatedSignInState()
    {
        return 3;
    }

    public final int getLoggingEvent()
    {
        return 15;
    }

    public final void onAccountValidated(int i)
    {
        if (!inAssociatedSignInState())
        {
            return;
        }
        if (i == 0)
        {
            transitionTo(4);
            return;
        } else
        {
            GamesLog.e("ValidateAccountFragment", (new StringBuilder("Account is not allowed to use games. Status: ")).append(i).toString());
            logState(16);
            DialogFragmentUtil.show(super.mActivity, new GamesDialogFragment() {

                final ValidateAccountFragment this$0;

                protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
                {
                    return gamesdialogbuilder.setTitle(0x7f10028f).setMessage(getString(0x7f10028e, new Object[] {
                        getParent().mAccount
                    })).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$1;

                        public final void onClick(DialogInterface dialoginterface, int i)
                        {
                            failSignIn(0);
                            dismissInternal(false);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    }).setCancelable(false);
                }

            
            {
                this$0 = ValidateAccountFragment.this;
                super();
            }
            }, "ValidateAccountFragment");
            return;
        }
    }

    protected final void onTransition(SignInClient signinclient)
    {
        android.accounts.Account account = getParent().mAccount;
        signinclient.checkConnected();
        try
        {
            signinclient.mService.validateAccount(new com.google.android.gms.games.signin.SignInClient.AccountValidatedBinderCallback(signinclient, this), account);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SignInClient signinclient)
        {
            GamesLog.w("SignInClient", "service died");
        }
    }
}
