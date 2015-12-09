// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            ValidateAccountFragment, GamesSignInFragment, SignInActivity

final class this._cls1
    implements android.content.ner
{

    final SignIn this$1;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        failSignIn(0);
        dismissInternal(false);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/signin/ValidateAccountFragment$1

/* anonymous class */
    final class ValidateAccountFragment._cls1 extends GamesDialogFragment
    {

        final ValidateAccountFragment this$0;

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f10028f).setMessage(getString(0x7f10028e, new Object[] {
                getParent().mAccount
            })).setPositiveButton(0x104000a, new ValidateAccountFragment._cls1._cls1()).setCancelable(false);
        }

            
            {
                this$0 = ValidateAccountFragment.this;
                super();
            }
    }

}
