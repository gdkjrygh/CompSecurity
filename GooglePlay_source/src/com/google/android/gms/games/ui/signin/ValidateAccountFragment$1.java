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

final class  extends GamesDialogFragment
{

    final ValidateAccountFragment this$0;

    protected final android.support.v7.app.gBuilder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(0x7f10028f).setMessage(getString(0x7f10028e, new Object[] {
            getParent().mAccount
        })).itiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final ValidateAccountFragment._cls1 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                failSignIn(0);
                dismissInternal(false);
            }

            
            {
                this$1 = ValidateAccountFragment._cls1.this;
                super();
            }
        }).celable(false);
    }

    _cls1.this._cls1()
    {
        this$0 = ValidateAccountFragment.this;
        super();
    }
}
