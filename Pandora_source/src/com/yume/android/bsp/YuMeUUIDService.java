// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package com.yume.android.bsp:
//            t

public class YuMeUUIDService extends Service
{

    public YuMeUUIDService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return new t(this);
    }

    public boolean onUnbind(Intent intent)
    {
        return super.onUnbind(intent);
    }
}
