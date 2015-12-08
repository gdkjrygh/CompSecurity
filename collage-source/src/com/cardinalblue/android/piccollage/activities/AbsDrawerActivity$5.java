// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

class a extends ActionBarDrawerToggle
{

    final b a;
    final AbsDrawerActivity b;

    public void onDrawerClosed(View view)
    {
        b.invalidateOptionsMenu();
        if (a != null)
        {
            a.a(view);
        }
    }

    public void onDrawerOpened(View view)
    {
        b.invalidateOptionsMenu();
        if (a != null)
        {
            a.b(view);
        }
    }

    (AbsDrawerActivity absdraweractivity, Activity activity, DrawerLayout drawerlayout, int i, int j,  )
    {
        b = absdraweractivity;
        a = ;
        super(activity, drawerlayout, i, j);
    }
}
