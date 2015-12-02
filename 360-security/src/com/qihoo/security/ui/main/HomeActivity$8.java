// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.graphics.drawable.ColorDrawable;
import com.qihoo.security.v7.ColorChangeBackgroundView;
import com.qihoo.security.widget.c;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a extends c
{

    final HomeActivity a;

    public void a(int i)
    {
        super.a(i);
        a.y = i;
        HomeActivity.a(a, i);
    }

    public void a(int i, float f, int j)
    {
        super.a(i, f, j);
        HomeActivity.b(a, com.qihoo.security.ui.main.HomeActivity.c(a).getCurrentColor());
        HomeActivity.a(a, new ColorDrawable(0));
    }

    dView(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
