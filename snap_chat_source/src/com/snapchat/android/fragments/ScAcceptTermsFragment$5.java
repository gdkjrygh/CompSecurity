// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.snapchat.android.api2.LogoutTask;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class a
    implements android.content.istener
{

    private ScAcceptTermsFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ScAcceptTermsFragment.g(a);
        (new LogoutTask()).a(com.snapchat.android.api2.TERMS_OF_USE, new String[0]).execute();
        dialoginterface = a.getActivity();
        dialoginterface.setResult(1);
        dialoginterface.finish();
    }

    (ScAcceptTermsFragment scaccepttermsfragment)
    {
        a = scaccepttermsfragment;
        super();
    }
}
