// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewCompat;
import android.view.Menu;
import android.view.MenuItem;
import com.cardinalblue.android.piccollage.view.a.e;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

class a
    implements android.support.v4.app.ckStackChangedListener
{

    final AbsDrawerActivity a;

    public void onBackStackChanged()
    {
        Object obj = a.getSupportFragmentManager().findFragmentById(0x7f1000cd);
        if (obj != null)
        {
            obj = ((Fragment) (obj)).getArguments();
            if (obj != null && ((Bundle) (obj)).containsKey("key_fragment_position"))
            {
                int i = ((Bundle) (obj)).getInt("key_fragment_position");
                AbsDrawerActivity.a(a).set(i);
                ViewCompat.setElevation(a.findViewById(0x7f1000c5), e.a(i));
                obj = a.b.getMenu().findItem(i);
                if (obj != null)
                {
                    ((MenuItem) (obj)).setChecked(true);
                }
            }
        }
    }

    (AbsDrawerActivity absdraweractivity)
    {
        a = absdraweractivity;
        super();
    }
}
