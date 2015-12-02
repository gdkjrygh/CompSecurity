// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.qihoo.a.a.a.c;
import com.qihoo.security.e.a;

// Referenced classes of package com.qihoo.security.clearengine.service:
//            a

public class ClearEngineService extends Service
{

    private Context a;
    private com.qihoo.security.clearengine.service.a b;

    public ClearEngineService()
    {
        b = null;
    }

    public IBinder onBind(Intent intent)
    {
        if ("ACTION_TRASH_CLEAR".equals(intent.getAction()))
        {
            if (b == null)
            {
                b = new com.qihoo.security.clearengine.service.a(c.b(a), c.a(a), c.d(a));
                b.a(com.qihoo.security.e.a.a(this));
            }
            return b.d();
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        a = this;
    }
}
