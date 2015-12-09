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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.view.fragments.p;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity, HomeActivity

public class FindFriendsActivity extends BaseActivity
{

    public FindFriendsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003b);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ViewCompat.setElevation(findViewById(0x7f1000c5), 0.0F);
        if (bundle == null)
        {
            getSupportFragmentManager().beginTransaction().add(0x7f1000cd, new p(), "find friends").commit();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11000f, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            return true;

        case 2131755761: 
            b.aB("action bar");
            break;
        }
        menuitem = new Intent(this, com/cardinalblue/android/piccollage/activities/HomeActivity);
        menuitem.setAction("piccollage.intent.action.VIEW_PAGE");
        menuitem.putExtra("key_position", 0x7f1002e1);
        menuitem.putExtra("extra_init_fragment_pos", 1);
        startActivity(menuitem);
        return true;
    }
}
