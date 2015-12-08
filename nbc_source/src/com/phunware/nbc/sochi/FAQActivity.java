// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ui.core.BaseActivity;
import com.phunware.nbc.sochi.fragments.FAQFragment;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import java.util.HashMap;

// Referenced classes of package com.phunware.nbc.sochi:
//            NBCSportsApplication

public class FAQActivity extends BaseActivity
{

    TrackingHelper trackingHelper;

    public FAQActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001b);
        getSupportActionBar().setTitle("FAQ");
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setIcon(0x7f030000);
        NBCSportsApplication.component().inject(this);
        bundle = getSupportFragmentManager().findFragmentById(0x7f0f006c);
        HashMap hashmap = new HashMap();
        hashmap.put("nbcs.section", "pass");
        hashmap.put("nbcs.pagecount", "true");
        trackingHelper.trackPageEvent(":Pass:FAQ", hashmap);
        if (bundle == null)
        {
            getSupportFragmentManager().beginTransaction().replace(0x7f0f006c, FAQFragment.getInstance()).commit();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            NavUtils.navigateUpFromSameTask(this);
            break;
        }
        return true;
    }
}
