// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.graphics.drawable.ColorDrawable;
import com.qihoo.security.widget.QihooViewPager;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a
    implements com.qihoo360.mobilesafe.b.
{

    final HomeActivity a;

    public void a(int i)
    {
        HomeActivity.g(a);
        HomeActivity.c(a, i);
    }

    public void setColor(int i)
    {
        HomeActivity.b(a, new ColorDrawable(i));
        HomeActivity.c(a, i);
        if (HomeActivity.d(a) != null)
        {
            HomeActivity.c(a, new ColorDrawable(0));
        }
        int ai[] = HomeActivity.e(a);
        int j = HomeActivity.f(a).getCurrentItem();
        if (ai != null && ai.length > 0 && j < ai.length)
        {
            ai[j] = i;
            HomeActivity.a(a, ai);
        }
    }

    (HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
