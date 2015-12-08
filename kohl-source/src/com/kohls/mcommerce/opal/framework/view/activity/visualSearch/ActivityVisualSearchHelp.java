// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity.visualSearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

public class ActivityVisualSearchHelp extends BaseActivityWithoutSlider
{

    private static final String LOG_TAG = "ActivityVisualSearchHelp";

    public ActivityVisualSearchHelp()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f030097;
    }

    protected void initializeViews(Bundle bundle)
    {
        findViewById(0x7f0d038e).setOnClickListener(new android.view.View.OnClickListener() {

            final ActivityVisualSearchHelp this$0;

            public void onClick(View view)
            {
                UtilityMethods.openCamera(ActivityVisualSearchHelp.this, 115, "KohlsVisualSearchCamera.jpg");
            }

            
            {
                this$0 = ActivityVisualSearchHelp.this;
                super();
            }
        });
        findViewById(0x7f0d038d).setOnClickListener(new android.view.View.OnClickListener() {

            final ActivityVisualSearchHelp this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = ActivityVisualSearchHelp.this;
                super();
            }
        });
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        setResult(j, intent);
        finish();
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarForScanHelp(getString(0x7f080548));
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
