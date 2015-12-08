// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.instabug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.IActivityService;

// Referenced classes of package me.lyft.android.infrastructure.instabug:
//            IInstabugService

class NoOpInstabugService
    implements IActivityService, IInstabugService
{

    NoOpInstabugService()
    {
    }

    public void addMapView(View view, GoogleMap googlemap)
    {
    }

    public boolean isNull()
    {
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
