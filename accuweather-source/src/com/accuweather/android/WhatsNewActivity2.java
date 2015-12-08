// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.app.NotificationManager;
import android.content.Intent;
import android.view.View;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.TutorialProgressStrip;

// Referenced classes of package com.accuweather.android:
//            SetupActivity, QuickSetupActivity

public class WhatsNewActivity2 extends SetupActivity
{

    public WhatsNewActivity2()
    {
    }

    private void cancelDownloadNotification()
    {
        ((NotificationManager)getSystemService("notification")).cancel(0x101104);
    }

    private void goToNextScreen()
    {
        Intent intent = (new Intent(this, com/accuweather/android/QuickSetupActivity)).addFlags(0x4000000);
        if (getIntent() != null)
        {
            intent.putExtras(getIntent());
        }
        startActivity(intent);
        finish();
    }

    private boolean hasBeenViewed()
    {
        return PreferenceUtils.get(this, "whats_new_page2_viewed", false);
    }

    private void init()
    {
        setContentView(R.layout.whats_new_page_2);
        TutorialProgressStrip tutorialprogressstrip = (TutorialProgressStrip)findViewById(R.id.tutorialProgressIndicator);
        if (tutorialprogressstrip != null)
        {
            tutorialprogressstrip.showNumberOfProgressStripCells(5);
            tutorialprogressstrip.setTutorialPageIndex(2);
        }
        setTypeFaces();
        hideActionBar();
        findViewById(R.id.nextButton).setOnClickListener(new android.view.View.OnClickListener() {

            final WhatsNewActivity2 this$0;

            public void onClick(View view)
            {
                setViewed();
                goToNextScreen();
            }

            
            {
                this$0 = WhatsNewActivity2.this;
                super();
            }
        });
    }

    private void setViewed()
    {
        PreferenceUtils.save(this, "whats_new_page2_viewed", true);
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
        if (hasBeenViewed())
        {
            goToNextScreen();
            return;
        } else
        {
            init();
            return;
        }
    }

    public void setTypeFaces()
    {
        Utilities.setTypeFace(this, Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.minuteCast2HourPrecipTextView), Data.getRobotoCondensed());
        Utilities.setTypeFace(findViewById(R.id.minuteCastIconsAndColorsTextView), Data.getRobotoCondensed());
    }


}
