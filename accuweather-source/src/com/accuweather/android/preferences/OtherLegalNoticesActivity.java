// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import com.accuweather.android.utilities.PartnerCoding;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class OtherLegalNoticesActivity extends SherlockActivity
{

    public OtherLegalNoticesActivity()
    {
    }

    private void initActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setBackgroundDrawable(getResources().getDrawable(com.accuweather.android.R.drawable.action_bar_gradient));
            actionbar.setTitle(com.accuweather.android.R.string.OpenSourceSoftwareLicenseInfo);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.accuweather.android.R.layout.other_legal_notices);
        bundle = new StringBuilder();
        bundle.append(getResources().getString(com.accuweather.android.R.string.open_source_text_prefix));
        bundle.append("\n\n");
        bundle.append(GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(this));
        ((TextView)findViewById(com.accuweather.android.R.id.attribution_tv)).setText(bundle.toString());
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
        }
        return super.onMenuItemSelected(i, menuitem);
    }

    protected void onPause()
    {
        super.onPause();
        overridePendingTransition(com.accuweather.android.R.anim.fade_in, com.accuweather.android.R.anim.fade_out);
    }

    protected void onStart()
    {
        super.onStart();
        if (!PartnerCoding.isPartnerCodedAmazonPhone(this))
        {
            initActionBar();
        }
    }
}
