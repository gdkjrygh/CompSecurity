// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SQAcceptTermsFragment

final class a
    implements android.view.QAcceptTermsFragment._cls1
{

    private SQAcceptTermsFragment a;

    public final void onClick(View view)
    {
        if (SQAcceptTermsFragment.a(a) != null)
        {
            SQAcceptTermsFragment.a(a).b();
            SQAcceptTermsFragment.b(a);
        }
        a.getActivity().onBackPressed();
    }

    A(SQAcceptTermsFragment sqaccepttermsfragment)
    {
        a = sqaccepttermsfragment;
        super();
    }
}
