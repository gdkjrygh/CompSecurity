// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.NavigationUrl;

public class AccountBlockedDialogFragment extends InfoDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    NavigationUrl navigationUrl;

    public AccountBlockedDialogFragment()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.p);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }
}
