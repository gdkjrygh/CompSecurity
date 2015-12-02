// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.core.c.c;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class a
    implements ServiceConnection
{

    final PowerActivity a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        PowerActivity.a(a, com.qihoo360.mobilesafe.core.c.ty._cls6.a(ibinder));
        if (PowerActivity.h(a) != null)
        {
            try
            {
                PowerActivity.h(a).a(PowerActivity.i(a));
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
        }
        a.y.post(new Runnable() {

            final PowerActivity._cls6 a;

            public void run()
            {
                if (PowerActivity.h(a.a) == null) goto _L2; else goto _L1
_L1:
                if (PowerActivity.h(a.a).f()) goto _L4; else goto _L3
_L3:
                PowerActivity.j(a.a).setVisibility(8);
                PowerActivity.h(a.a).a(true);
                if (!PowerActivity.h(a.a).g())
                {
                    PowerActivity.a(a.a, s.d());
                }
_L2:
                a.a.o();
                return;
_L4:
                try
                {
                    PowerActivity.k(a.a).setVisibility(8);
                    PowerActivity.j(a.a).setVisibility(0);
                }
                catch (RemoteException remoteexception) { }
                if (true) goto _L2; else goto _L5
_L5:
            }

            
            {
                a = PowerActivity._cls6.this;
                super();
            }
        });
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        if (PowerActivity.h(a) == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        PowerActivity.h(a).b(PowerActivity.i(a));
        return;
        componentname;
    }

    _cls1.a(PowerActivity poweractivity)
    {
        a = poweractivity;
        super();
    }
}
