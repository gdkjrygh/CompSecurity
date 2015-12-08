// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.view.fragments.ad;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

public class PicUsersListActivity extends AbsDrawerActivity
{

    public PicUsersListActivity()
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
        a(new AbsDrawerActivity.a() {

            final PicUsersListActivity a;

            public void a(View view)
            {
            }

            public void b(View view)
            {
                com.cardinalblue.android.piccollage.a.b.ax("Users list");
            }

            
            {
                a = PicUsersListActivity.this;
                super();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bundle = new ad();
        bundle.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, bundle).commit();
    }
}
