// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.accuweather.android.SetupActivity;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.TutorialProgressStrip;

// Referenced classes of package com.accuweather.android.widgets:
//            WidgetQuickSetupActivity

public class WidgetWhatsNewActivity extends SetupActivity
{

    private boolean mIsFromHoloDark;
    private boolean mIsFromResizable;

    public WidgetWhatsNewActivity()
    {
        mIsFromResizable = false;
        mIsFromHoloDark = false;
    }

    private void cancelDownloadNotification()
    {
        ((NotificationManager)getSystemService("notification")).cancel(0x101104);
    }

    private int getWhatsNewImageResourceId()
    {
        if (mIsFromHoloDark)
        {
            return com.accuweather.android.R.drawable.widget_whats_new_holo_dark;
        } else
        {
            return com.accuweather.android.R.drawable.widget_whats_new_holo_light;
        }
    }

    private void goToNextScreen()
    {
        startActivityForResult(new Intent(this, com/accuweather/android/widgets/WidgetQuickSetupActivity), 201);
    }

    private boolean hasBeenViewed()
    {
        return PreferenceUtils.get(this, "widget_whats_new_viewed", false);
    }

    private void init()
    {
        setContentView(com.accuweather.android.R.layout.widget_whats_new);
        TutorialProgressStrip tutorialprogressstrip = (TutorialProgressStrip)findViewById(com.accuweather.android.R.id.tutorialProgressIndicator);
        if (tutorialprogressstrip != null)
        {
            tutorialprogressstrip.showNumberOfProgressStripCells(4);
            tutorialprogressstrip.setTutorialPageIndex(1);
        }
        ((ImageView)findViewById(com.accuweather.android.R.id.tutorial_img)).setImageResource(getWhatsNewImageResourceId());
        setTypeFaces();
        hideActionBar();
        findViewById(com.accuweather.android.R.id.lets_go).setOnClickListener(new android.view.View.OnClickListener() {

            final WidgetWhatsNewActivity this$0;

            public void onClick(View view)
            {
                setViewed();
                goToNextScreen();
            }

            
            {
                this$0 = WidgetWhatsNewActivity.this;
                super();
            }
        });
    }

    private void setViewed()
    {
        PreferenceUtils.save(this, "widget_whats_new_viewed", true);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 201)
        {
            if (j == -1)
            {
                setResult(-1);
                finish();
            } else
            if (j == 0)
            {
                finish();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        mIsFromResizable = bundle.getBooleanExtra("is_from_resizable", false);
        mIsFromHoloDark = bundle.getBooleanExtra("is_from_holo_dark", false);
        if (!mIsFromResizable)
        {
            goToNextScreen();
        }
    }

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        genericalertdialogfragment.dismiss();
    }

    protected void onStart()
    {
        super.onStart();
        if (!BackgroundImages.getInstance(this).backgroundImagesAreLocal())
        {
            if (BackgroundImages.getInstance(this).isLoaded())
            {
                cancelDownloadNotification();
            } else
            {
                startDownloadService();
            }
        }
        if (!hasBeenViewed())
        {
            init();
            return;
        } else
        {
            goToNextScreen();
            return;
        }
    }

    public void setTypeFaces()
    {
        Utilities.setTypeFace(this, Data.getRobotoCondensed());
    }


}
