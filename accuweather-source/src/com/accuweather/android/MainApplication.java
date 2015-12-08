// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.app.Application;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.PartnerCoding;
import com.comscore.analytics.comScore;

public class MainApplication extends Application
{

    public MainApplication()
    {
    }

    public void onCreate()
    {
        super.onCreate();
        Data.getInstance(this).init();
        comScore.setAppContext(getApplicationContext());
        comScore.setCustomerC2("6005068");
        comScore.setPublisherSecret("c7d1f7f9920e55503ee3470a942d6341");
        (new PartnerCoding()).initializePartnerCode(this);
    }
}
