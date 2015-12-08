// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;

// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants, SignInNavigation

public final class AlreadyMergedDialog extends SkypeDialogFragment
    implements SignInConstants
{

    SignInNavigation signInNavigation;

    public AlreadyMergedDialog()
    {
    }

    public final void navigateToMsaSignIn()
    {
        signInNavigation.toMsaLogin(null);
        getActivity().finish();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080228);
        bundle.b(getString(0x7f08045e));
        bundle.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final AlreadyMergedDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigateToMsaSignIn();
            }

            
            {
                this$0 = AlreadyMergedDialog.this;
                super();
            }
        });
        bundle.a(false);
        return bundle.c();
    }
}
