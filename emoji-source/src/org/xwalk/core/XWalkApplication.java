// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.app.Application;
import android.content.res.Resources;

// Referenced classes of package org.xwalk.core:
//            XWalkMixedResources

public class XWalkApplication extends Application
{

    private static XWalkApplication gApp = null;
    private Resources mRes;

    public XWalkApplication()
    {
        mRes = null;
    }

    static XWalkApplication getApplication()
    {
        return gApp;
    }

    void addResource(Resources resources)
    {
        if (mRes != null)
        {
            return;
        } else
        {
            mRes = new XWalkMixedResources(super.getResources(), resources);
            return;
        }
    }

    public Resources getResources()
    {
        if (mRes == null)
        {
            return super.getResources();
        } else
        {
            return mRes;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        gApp = this;
    }

}
