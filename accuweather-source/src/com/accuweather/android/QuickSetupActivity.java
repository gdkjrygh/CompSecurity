// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.accuweather.android.dialogs.GenericAlertDialogFragment;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.TutorialProgressStrip;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import java.util.Locale;

// Referenced classes of package com.accuweather.android:
//            SetupActivity, LocationActivity

public class QuickSetupActivity extends SetupActivity
    implements android.view.View.OnClickListener
{

    public QuickSetupActivity()
    {
    }

    private void init()
    {
        setContentView(R.layout.quick_setup);
        Object obj = (TutorialProgressStrip)findViewById(R.id.tutorialProgressIndicator);
        if (obj != null)
        {
            ((TutorialProgressStrip) (obj)).showNumberOfProgressStripCells(5);
            ((TutorialProgressStrip) (obj)).setTutorialPageIndex(3);
        }
        obj = Locale.getDefault();
        if (!Utilities.shouldShowPush(this) && (((Locale) (obj)).equals(Locale.ENGLISH) || ((Locale) (obj)).equals(Locale.US)))
        {
            ((TextView)findViewById(R.id.you_can_change)).setText(getString(R.string.YouCanChangeSettingsAnytimeWant_parenthesis));
        }
        if (!Utilities.shouldShowPush(this))
        {
            hideView(R.id.enable_push);
            hideView(R.id.descrip_push);
        }
        if (PartnerCoding.isPartnerCodedIcontrol(this))
        {
            ((TextView)findViewById(R.id.you_can_change)).setText(getString(R.string.YouCanChangeSettingsAnytimeWant_parenthesis));
            hideView(R.id.enable_push);
            hideView(R.id.descrip_push);
        }
        findViewById(R.id.do_it_btn).setOnClickListener(this);
        findViewById(R.id.no_thanks_btn).setOnClickListener(this);
        updateTypefaces();
        hideActionBar();
    }

    private void savePreferences()
    {
        PreferenceUtils.save(this, "pref_temp_notifications", "2");
        PreferenceUtils.save(this, "pref_push_notification", "1");
    }

    private void setViewed()
    {
        PreferenceUtils.save(this, "quick_setup_completed", true);
    }

    private void updateTypefaces()
    {
        Utilities.setTypeFace(findViewById(R.id.quick_setup_label).getRootView(), Data.getRobotoCondensed());
    }

    protected void accept()
    {
        setViewed();
        saveQuickPreferences();
        goToNextScreen();
    }

    protected void decline()
    {
        setViewed();
        savePreferences();
        goToNextScreen();
    }

    public void goToNextScreen()
    {
        Intent intent = (new Intent(this, com/accuweather/android/LocationActivity)).addFlags(0x4000000);
        if (getIntent() != null)
        {
            intent.putExtras(getIntent());
        }
        startActivity(intent);
        finish();
    }

    protected boolean hasBeenViewed()
    {
        return PreferenceUtils.get(this, "quick_setup_completed", false);
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.do_it_btn)
        {
            AccuAnalytics.logUiEvent(this, "Quick setup accepted");
            accept();
        } else
        if (view.getId() == R.id.no_thanks_btn)
        {
            AccuAnalytics.logUiEvent(this, "Quick setup declined");
            decline();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
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

    public void onNegativeClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        String s;
        if (genericalertdialogfragment != null)
        {
            s = genericalertdialogfragment.getClass().getSimpleName();
        } else
        {
            s = "";
        }
        AccuAnalytics.logUiEvent(this, "Dialog negative click", s);
        genericalertdialogfragment.dismiss();
    }

    public void onPositiveClick(GenericAlertDialogFragment genericalertdialogfragment)
    {
        String s;
        if (genericalertdialogfragment != null)
        {
            s = genericalertdialogfragment.getClass().getSimpleName();
        } else
        {
            s = "";
        }
        AccuAnalytics.logUiEvent(this, "Dialog positive click", s);
        genericalertdialogfragment.dismiss();
    }

    protected void onStart()
    {
        super.onStart();
        if (PartnerCoding.isPartnerCodedIcontrol(this))
        {
            decline();
        }
        if (!BackgroundImages.getInstance(this).isLoaded())
        {
            startDownloadService();
        }
    }

    public void saveQuickPreferences()
    {
        PreferenceUtils.save(this, "pref_temp_notifications", "1");
        if (Utilities.shouldShowPush(this))
        {
            PreferenceUtils.save(this, "pref_push_notification", "0");
            Logger.d(this, "Setting push enabled with UAirship.shared().getPushManager().setUserNotificationsEnabled(true)");
            UAirship.shared().getPushManager().setUserNotificationsEnabled(true);
            UAirship.shared().getPushManager().setPushEnabled(true);
        }
    }
}
