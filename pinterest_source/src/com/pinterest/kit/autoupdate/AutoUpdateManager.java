// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.autoupdate;

import android.app.Activity;
import com.pinterest.base.ApplicationInfo;

// Referenced classes of package com.pinterest.kit.autoupdate:
//            AutoUpdateClient, OtaAutoUpdateClient, ProdAutoUpdateClient

public class AutoUpdateManager
    implements AutoUpdateClient
{

    private static AutoUpdateManager a = new AutoUpdateManager();
    private AutoUpdateClient b;

    private AutoUpdateManager()
    {
label0:
        {
            super();
            if (b == null)
            {
                if (!ApplicationInfo.isOta())
                {
                    break label0;
                }
                b = new OtaAutoUpdateClient();
            }
            return;
        }
        b = new ProdAutoUpdateClient();
    }

    public static AutoUpdateManager a()
    {
        return a;
    }

    public void checkForUpdate()
    {
        if (b != null)
        {
            b.checkForUpdate();
        }
    }

    public void startUpdate(Activity activity)
    {
        if (b != null)
        {
            b.startUpdate(activity);
        }
    }

}
