// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.Activity;
import android.support.v4.app.a;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ListView;
import com.jcp.JCP;
import com.jcp.util.af;
import com.jcp.widget.g;

// Referenced classes of package com.jcp.activities:
//            MainActivity

class aj extends a
{

    final MainActivity a;

    aj(MainActivity mainactivity, Activity activity, DrawerLayout drawerlayout, int i, int j, int k)
    {
        a = mainactivity;
        super(activity, drawerlayout, i, j, k);
    }

    public void a(View view)
    {
        a.mDrawerList.bringToFront();
        a.mDrawerList.requestLayout();
        MainActivity.c(a).a();
        a.i();
        com.jcp.activities.MainActivity.a(a, JCP.s().c());
        com.jcp.h.g.a("Menu", "Hamburger Menu", null);
    }

    public void b(View view)
    {
        a.invalidateOptionsMenu();
    }
}
