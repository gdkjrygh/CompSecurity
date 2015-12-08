// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Intent;
import android.os.Bundle;
import com.accuweather.android.TermsAndConditionsActivity;
import com.accuweather.android.appattach.AppAttachUtility;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.views.TutorialProgressStrip;

// Referenced classes of package com.accuweather.android.widgets:
//            WidgetWhatsNewActivity

public class WidgetTermsAndConditionsActivity extends TermsAndConditionsActivity
{

    private boolean mIsFromHoloDark;
    private boolean mIsFromHoloLight;
    private boolean mIsFromResizable;

    public WidgetTermsAndConditionsActivity()
    {
        mIsFromResizable = false;
        mIsFromHoloDark = false;
        mIsFromHoloLight = false;
    }

    public void accept()
    {
        if (PartnerCoding.isPartnerCodedAppAttach(this))
        {
            (new AppAttachUtility()).initAppattach(this);
        }
        PreferenceUtils.save(this, "terms_and_conditions_accepted", true);
        Intent intent = new Intent(this, com/accuweather/android/widgets/WidgetWhatsNewActivity);
        intent.putExtra("is_from_resizable", mIsFromResizable);
        intent.putExtra("is_from_holo_dark", mIsFromHoloDark);
        intent.putExtra("is_from_holo_light", mIsFromHoloLight);
        startActivityForResult(intent, 203);
    }

    public void decline()
    {
        setResult(0);
        finish();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 203)
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

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Logger.i(this, "onCreate");
        bundle = getIntent();
        mIsFromResizable = bundle.getBooleanExtra("is_from_resizable", false);
        mIsFromHoloDark = bundle.getBooleanExtra("is_from_holo_dark", false);
        mIsFromHoloLight = bundle.getBooleanExtra("is_from_holo_light", false);
    }

    protected void onStart()
    {
        super.onStart();
        TutorialProgressStrip tutorialprogressstrip = (TutorialProgressStrip)findViewById(com.accuweather.android.R.id.tutorialProgressIndicator);
        if (tutorialprogressstrip != null)
        {
            tutorialprogressstrip.showNumberOfProgressStripCells(4);
            tutorialprogressstrip.setTutorialPageIndex(0);
        }
    }
}
