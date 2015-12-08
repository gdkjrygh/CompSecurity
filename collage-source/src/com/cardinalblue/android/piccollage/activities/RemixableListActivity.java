// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.view.fragments.af;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

public class RemixableListActivity extends AbsDrawerActivity
    implements com.cardinalblue.android.piccollage.view.fragments.i.b
{

    public RemixableListActivity()
    {
    }

    private void b(Fragment fragment)
    {
        fragment = getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, fragment, "tag_drawer_fragment");
        if (getSupportFragmentManager().findFragmentByTag("tag_drawer_fragment") != null)
        {
            fragment.addToBackStack(null);
        }
        fragment.commit();
    }

    public void a(int i, String s)
    {
    }

    protected boolean f()
    {
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003c);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        setTitle(getString(0x7f0702ac));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a(new AbsDrawerActivity.a() {

            final RemixableListActivity a;

            public void a(View view)
            {
            }

            public void b(View view)
            {
                com.cardinalblue.android.piccollage.a.b.ax("Remix feed");
            }

            
            {
                a = RemixableListActivity.this;
                super();
            }
        });
        if (bundle == null)
        {
            b(new af());
        }
    }
}
