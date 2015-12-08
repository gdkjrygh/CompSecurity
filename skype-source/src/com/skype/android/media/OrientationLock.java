// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.skype.android.media:
//            DeviceProfile

public class OrientationLock
{

    private Activity a;
    private DeviceProfile b;
    private boolean c;
    private boolean d;
    private int e;

    public OrientationLock(Activity activity, DeviceProfile deviceprofile)
    {
        e = -1;
        a = activity;
        b = deviceprofile;
    }

    private void a(int i)
    {
        a.setRequestedOrientation(i);
        a.overridePendingTransition(0, 0);
    }

    public final void a()
    {
        int i;
        int j;
        j = a.getRequestedOrientation();
        i = j;
        if (j != -1) goto _L2; else goto _L1
_L1:
        i = a.getResources().getConfiguration().orientation;
        j = a.getWindowManager().getDefaultDisplay().getRotation();
        i;
        JVM INSTR tableswitch 1 2: default 68
    //                   1 97
    //                   2 118;
           goto _L3 _L4 _L5
_L3:
        i = 5;
_L7:
        i = b.c(i);
        c = true;
_L2:
        a(i);
        d = true;
        return;
_L4:
        if (j == 2 || j == 1)
        {
            i = 9;
        } else
        {
            i = 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (j == 0 || j == 1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b()
    {
        if (!c) goto _L2; else goto _L1
_L1:
        a(-1);
_L4:
        d = false;
        return;
_L2:
        if (e != -1)
        {
            a(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
