// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.test;

import android.app.Activity;
import android.content.Intent;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;

public class TestActivity extends Activity
{

    ActivityService service;

    public TestActivity()
    {
        service = new NoOpActivityService();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        service.onActivityResult(this, ActivityResult.create(i, j, intent));
    }

    public void setTestedService(ActivityService activityservice)
    {
        service = activityservice;
    }

    private class NoOpActivityService extends ActivityService
    {

        NoOpActivityService()
        {
        }
    }

}
