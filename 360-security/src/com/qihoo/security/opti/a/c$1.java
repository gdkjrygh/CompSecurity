// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.qihoo.security.opti.a:
//            c

class a
    implements ServiceConnection
{

    final c a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c.a(a, com.qihoo360.mobilesafe.core.c.a(ibinder));
        if (c.a(a) == null)
        {
            c.a(a, new Thread(new Runnable() {

                final c._cls1 a;

                public void run()
                {
                    c.b(a.a);
                    c.c(a.a);
                }

            
            {
                a = c._cls1.this;
                super();
            }
            }));
            c.a(a).start();
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        c.a(a, null);
    }

    _cls1.a(c c1)
    {
        a = c1;
        super();
    }
}
