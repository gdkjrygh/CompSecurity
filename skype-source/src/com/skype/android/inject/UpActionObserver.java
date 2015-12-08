// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.t;
import android.support.v7.app.ActionBar;
import com.skype.android.annotation.UpIsBack;
import com.skype.android.annotation.UpIsHome;
import com.skype.android.annotation.UpIsParent;
import com.skype.android.app.ActionBarProvider;

// Referenced classes of package com.skype.android.inject:
//            LifecycleAdapter

public class UpActionObserver extends LifecycleAdapter
{

    private Activity activity;

    public UpActionObserver(Activity activity1)
    {
        activity = activity1;
    }

    public void onCreate(Bundle bundle)
    {
        bundle = activity.getClass();
        if ((bundle.isAnnotationPresent(com/skype/android/annotation/UpIsHome) || bundle.isAnnotationPresent(com/skype/android/annotation/UpIsParent) || bundle.isAnnotationPresent(com/skype/android/annotation/UpIsBack)) && (activity instanceof ActionBarProvider))
        {
            bundle = ((ActionBarProvider)activity).getSupportActionBar();
            if (bundle != null)
            {
                bundle.b(true);
            }
        }
    }

    public boolean onUpEvent()
    {
        Object obj = activity.getClass();
        if (((Class) (obj)).isAnnotationPresent(com/skype/android/annotation/UpIsHome))
        {
            activity.finish();
            return true;
        }
        if (((Class) (obj)).isAnnotationPresent(com/skype/android/annotation/UpIsParent))
        {
            obj = (UpIsParent)((Class) (obj)).getAnnotation(com/skype/android/annotation/UpIsParent);
            obj = new Intent(activity, ((UpIsParent) (obj)).value());
            ((Intent) (obj)).addFlags(0x4000000);
            t.b(activity, ((Intent) (obj)));
            return true;
        }
        if (((Class) (obj)).isAnnotationPresent(com/skype/android/annotation/UpIsBack))
        {
            activity.finish();
            return true;
        } else
        {
            return false;
        }
    }
}
