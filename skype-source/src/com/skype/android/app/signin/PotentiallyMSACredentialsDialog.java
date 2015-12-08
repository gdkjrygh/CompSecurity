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

public class PotentiallyMSACredentialsDialog extends SkypeDialogFragment
    implements SignInConstants
{

    SignInNavigation signInNavigation;

    public PotentiallyMSACredentialsDialog()
    {
    }

    public void navigateToSignIn()
    {
        signInNavigation.toMsaLogin();
        getActivity().finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080280);
        bundle.b(getString(0x7f0803e7));
        bundle.a(0x7f08034b, new android.content.DialogInterface.OnClickListener() {

            final PotentiallyMSACredentialsDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                navigateToSignIn();
            }

            
            {
                this$0 = PotentiallyMSACredentialsDialog.this;
                super();
            }
        });
        bundle.b(0x7f0802e5, null);
        bundle.a(false);
        return bundle.c();
    }
}
