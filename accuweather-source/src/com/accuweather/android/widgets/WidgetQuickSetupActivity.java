// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.Activity;
import android.os.Bundle;
import com.accuweather.android.QuickSetupActivity;
import com.accuweather.android.views.TutorialProgressStrip;

public class WidgetQuickSetupActivity extends QuickSetupActivity
{

    public WidgetQuickSetupActivity()
    {
    }

    protected void accept()
    {
        super.accept();
        if (getParent() == null)
        {
            setResult(-1);
        } else
        {
            getParent().setResult(-1);
        }
        finish();
    }

    protected void decline()
    {
        super.decline();
        setResult(-1);
        finish();
    }

    public void goToNextScreen()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (TutorialProgressStrip)findViewById(com.accuweather.android.R.id.tutorialProgressIndicator);
        if (bundle != null)
        {
            bundle.showNumberOfProgressStripCells(4);
            bundle.setTutorialPageIndex(2);
        }
        if (hasBeenViewed())
        {
            setResult(-1);
            finish();
        }
    }
}
