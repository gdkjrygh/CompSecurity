// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.leanplum.annotations.Parser;

// Referenced classes of package com.leanplum:
//            g, LeanplumResources, LeanplumActivityHelper

public class LeanplumApplication extends Application
{

    private static LeanplumApplication a;

    public LeanplumApplication()
    {
    }

    public static Context getContext()
    {
        return a;
    }

    public static LeanplumApplication getInstance()
    {
        return a;
    }

    public Resources getResources()
    {
        if (g.a())
        {
            return super.getResources();
        } else
        {
            return new LeanplumResources(super.getResources());
        }
    }

    public void onCreate()
    {
        a = this;
        LeanplumActivityHelper.enableLifecycleCallbacks(this);
        super.onCreate();
        Parser.parseVariables(new Object[] {
            this
        });
    }
}
