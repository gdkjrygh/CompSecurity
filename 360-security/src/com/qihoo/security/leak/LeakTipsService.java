// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import com.qihoo.security.app.UiProcessService;

// Referenced classes of package com.qihoo.security.leak:
//            f

public class LeakTipsService extends UiProcessService
    implements f.a
{

    private f c;

    public LeakTipsService()
    {
        c = null;
    }

    public void a()
    {
        stopSelf();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        c.a(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        c = new f(this, this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        c.b();
    }

    public void onStart(Intent intent, int i)
    {
        super.onStart(intent, i);
        c.a();
        (new Handler()).postDelayed(new Runnable() {

            final LeakTipsService a;

            public void run()
            {
                a.stopSelf();
            }

            
            {
                a = LeakTipsService.this;
                super();
            }
        }, 3000L);
    }
}
