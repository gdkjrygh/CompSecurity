// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wallet.fragment.ZxingScannerActivity;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider, ScanActivity, HomeActivity

public class ScanHelpActivity extends BaseActivityWithoutSlider
    implements android.view.View.OnClickListener
{

    final String TAG = com/kohls/mcommerce/opal/framework/view/activity/ScanHelpActivity.getName();

    public ScanHelpActivity()
    {
    }

    private void showScanActivity(int i)
    {
        if (KohlsPhoneApplication.getInstance().getKohlsPref().isFirstScan())
        {
            KohlsPhoneApplication.getInstance().getKohlsPref().setIsFirstScan(false);
            Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/ScanActivity);
            intent.setAction("com.google.zxing.client.android.SCAN");
            intent.putExtra("SCAN_FORMATS", getResources().getStringArray(0x7f0a0018));
            intent.putExtra("SAVE_HISTORY", false);
            intent.putExtra("scan_request", i);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            i = displaymetrics.heightPixels;
            int j = displaymetrics.widthPixels;
            intent.putExtra("SCAN_WIDTH", (double)i * 0.59999999999999998D);
            intent.putExtra("SCAN_HEIGHT", (double)j * 0.59999999999999998D);
            if (getIntent() != null)
            {
                intent.putExtra("LAUNCHED_FROM_TOOLS", getIntent().getBooleanExtra("LAUNCHED_FROM_TOOLS", false));
            }
            startActivityForResult(intent, 2);
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected int getLayoutId()
    {
        return 0x7f030095;
    }

    protected void initializeViews(Bundle bundle)
    {
        Button button = (Button)findViewById(0x7f0d0387);
        if (bundle != null && bundle.getInt("scan_request") != 0)
        {
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final ScanHelpActivity this$0;
                final int val$scanReason;

                public void onClick(View view)
                {
                    if (scanReason == 2001)
                    {
                        view = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/ZxingScannerActivity);
                        view.putExtra("intent_multi_scan", false);
                        startActivity(view);
                        return;
                    } else
                    {
                        showScanActivity(scanReason);
                        return;
                    }
                }

            
            {
                this$0 = ScanHelpActivity.this;
                scanReason = i;
                super();
            }
            });
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        Intent intent1;
label0:
        {
            if (i == 2)
            {
                intent1 = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                if (j != -1)
                {
                    break label0;
                }
                if (intent.hasExtra("SCAN_DATA"))
                {
                    intent1.putExtra("SCAN_DATA", intent.getExtras().getSerializable("SCAN_DATA"));
                    setResult(-1, intent1);
                    finish();
                }
            }
            return;
        }
        setResult(j, intent1);
        finish();
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    public void onClick(View view)
    {
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
        getActionBarHelper().showActionBarForScanHelp("Scan Help");
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }

}
