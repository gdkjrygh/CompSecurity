// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.instrumentation;

import android.os.Bundle;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.google.android.maps.MapActivity;

public class InstrumentedMapActivity extends MapActivity
{

    public InstrumentedMapActivity()
    {
    }

    protected boolean isRouteDisplayed()
    {
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        comScore.setAppContext(getApplicationContext());
    }

    protected void onPause()
    {
        super.onPause();
        comScore.onExitForeground();
    }

    protected void onResume()
    {
        super.onResume();
        comScore.getCore().setCurrentActivityName(getClass().getSimpleName());
        comScore.onEnterForeground();
    }
}
