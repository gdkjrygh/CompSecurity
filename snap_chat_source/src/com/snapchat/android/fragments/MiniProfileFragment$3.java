// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Bt;
import android.animation.Animator;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.model.Friend;

// Referenced classes of package com.snapchat.android.fragments:
//            MiniProfileFragment

final class a
    implements android.animation.ner
{

    private MiniProfileFragment a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        MiniProfileFragment.c(a);
        AnalyticsEvents.a(Bt.L(), MiniProfileFragment.a(MiniProfileFragment.d(a)), MiniProfileFragment.a(a).g(), MiniProfileFragment.e(a));
        MiniProfileFragment.f(a).a(MiniProfileFragment.b(MiniProfileFragment.d(a)), MiniProfileFragment.e(a));
        MiniProfileFragment.g(a);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (MiniProfileFragment miniprofilefragment)
    {
        a = miniprofilefragment;
        super();
    }
}
