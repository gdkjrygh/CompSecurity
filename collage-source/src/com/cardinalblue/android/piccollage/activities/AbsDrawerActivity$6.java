// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import com.cardinalblue.android.piccollage.view.fragments.q;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

class a
    implements Callable
{

    final Intent a;
    final AbsDrawerActivity b;

    public Void a()
        throws Exception
    {
        int i = a.getIntExtra("key_position", -1);
        android.support.v4.app.Fragment fragment = b.getSupportFragmentManager().findFragmentById(0x7f1000cd);
        if (i == -1 && fragment != null && (fragment instanceof q))
        {
            ((q)fragment).b(true);
        }
        b.a(i, a.getExtras());
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (AbsDrawerActivity absdraweractivity, Intent intent)
    {
        b = absdraweractivity;
        a = intent;
        super();
    }
}
