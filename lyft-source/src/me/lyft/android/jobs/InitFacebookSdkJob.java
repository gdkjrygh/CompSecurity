// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.facebook.FacebookSdk;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class InitFacebookSdkJob
    implements Job
{

    LyftApplication application;
    ILyftPreferences preferences;

    public InitFacebookSdkJob()
    {
    }

    public void execute()
    {
        FacebookSdk.sdkInitialize(application);
        FacebookSdk.setApplicationId(preferences.getFacebookAppId());
    }
}
