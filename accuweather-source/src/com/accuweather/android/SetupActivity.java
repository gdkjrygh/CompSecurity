// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.view.View;
import com.accuweather.android.services.ImageFileDownloadService;
import com.accuweather.android.utilities.BackgroundImages;
import com.actionbarsherlock.app.ActionBar;
import java.io.File;
import java.util.HashMap;

// Referenced classes of package com.accuweather.android:
//            WeatherActivity

public abstract class SetupActivity extends WeatherActivity
{

    private static final String IMAGES_ZIP_FILENAME = "images.zip";
    protected int mInAnimation;
    protected int mOutAnimation;

    public SetupActivity()
    {
        mInAnimation = R.anim.slide_in_right;
        mOutAnimation = R.anim.slide_out_left;
    }

    private Intent getImageDownloadServiceIntent()
    {
        return new Intent(this, com/accuweather/android/services/ImageFileDownloadService);
    }

    protected final void hideActionBar()
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
    }

    protected void hideView(int i)
    {
        View view = findViewById(i);
        if (view != null)
        {
            view.setVisibility(8);
        }
    }

    public void onBackPressed()
    {
        mInAnimation = 0;
        mOutAnimation = 0;
        super.onBackPressed();
    }

    public void onPause()
    {
        super.onPause();
        overridePendingTransition(mInAnimation, mOutAnimation);
    }

    protected boolean shouldShowBannerAds()
    {
        return false;
    }

    protected final void startDownloadService()
    {
        HashMap hashmap = new HashMap();
        hashmap.put(BackgroundImages.getInstance(this).getImageZipUrl(), (new File(BackgroundImages.getInstance(this).getBackgroundDirectory(), "images.zip")).getAbsolutePath());
        Intent intent = getImageDownloadServiceIntent();
        intent.putExtra("file_map_key", hashmap);
        intent.putExtra("extract_path_key", BackgroundImages.getInstance(this).getBackgroundDirectory());
        startService(intent);
    }

    protected final void stopDownloadService()
    {
        stopService(getImageDownloadServiceIntent());
    }
}
