// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;

// Referenced classes of package kik.android.widget:
//            PagerIconTabs

final class cu
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final PagerIconTabs a;

    cu(PagerIconTabs pagericontabs)
    {
        a = pagericontabs;
        super();
    }

    public final void onGlobalLayout()
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else
        {
            a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        i = PagerIconTabs.a(a).getCurrentItem();
        PagerIconTabs.a(a, i);
    }
}
