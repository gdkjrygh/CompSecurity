// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.support.v4.app.FragmentManager;
import android.view.View;
import com.cardinalblue.android.piccollage.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements ty.a
{

    final HomeActivity a;

    public void a(View view)
    {
    }

    public void b(View view)
    {
        view = a.getSupportFragmentManager().findFragmentById(0x7f1000cd);
        if (view != null)
        {
            com.cardinalblue.android.piccollage.a.b.ax(HomeActivity.a(a, view));
        }
    }

    ty.a(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
