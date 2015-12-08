// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity, b

public class PicProfileActivity extends AbsDrawerActivity
    implements com.cardinalblue.android.piccollage.view.fragments.i.b
{

    public PicProfileActivity()
    {
    }

    public void a(int i, String s)
    {
        Intent intent = new Intent(this, com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        intent.putExtra("from", s);
        startActivityForResult(intent, i);
    }

    protected boolean f()
    {
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003c);
        bundle = (Toolbar)findViewById(0x7f1000c5);
        ViewCompat.setElevation(bundle, 0.0F);
        setSupportActionBar(bundle);
        a(new AbsDrawerActivity.a() {

            final PicProfileActivity a;

            public void a(View view)
            {
            }

            public void b(View view)
            {
                com.cardinalblue.android.piccollage.a.b.ax("User profile");
            }

            
            {
                a = PicProfileActivity.this;
                super();
            }
        });
        setTitle(getString(0x7f0700eb));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bundle = new com.cardinalblue.android.piccollage.activities.b();
        bundle.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(0x7f1000cd, bundle).commit();
    }
}
