// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import S;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            SQAcceptTermsFragment

final class a
    implements android.view.QAcceptTermsFragment._cls2
{

    private SQAcceptTermsFragment a;

    public final void onClick(View view)
    {
        Bt.ad();
        AnalyticsEvents.o();
        a.getActivity().mFragments.c();
        if (SQAcceptTermsFragment.a(a) != null)
        {
            SQAcceptTermsFragment.a(a).a();
            SQAcceptTermsFragment.b(a);
        }
    }

    A(SQAcceptTermsFragment sqaccepttermsfragment)
    {
        a = sqaccepttermsfragment;
        super();
    }
}
