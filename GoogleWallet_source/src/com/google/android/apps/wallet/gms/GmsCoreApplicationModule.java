// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms;

import android.app.Application;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.people.People;

public class GmsCoreApplicationModule
{

    public GmsCoreApplicationModule()
    {
    }

    static GoogleApiClient getGoogleApiClient(Application application)
    {
        com.google.android.gms.people.People.PeopleOptions1p peopleoptions1p = (new com.google.android.gms.people.People.PeopleOptions1p.Builder()).setClientApplicationId(126).build();
        return (new com.google.android.gms.common.api.GoogleApiClient.Builder(application)).addApi(People.API_1P, peopleoptions1p).build();
    }
}
