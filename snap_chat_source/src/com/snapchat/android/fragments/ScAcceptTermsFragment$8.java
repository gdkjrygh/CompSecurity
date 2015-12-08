// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Bt;
import LA;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class a
    implements android.view.ptTermsFragment._cls8
{

    private ScAcceptTermsFragment a;

    public final void onClick(View view)
    {
        ScAcceptTermsFragment.e(a);
        LA.j();
        Bt.ah();
        a.getActivity().finish();
    }

    (ScAcceptTermsFragment scaccepttermsfragment)
    {
        a = scaccepttermsfragment;
        super();
    }
}
