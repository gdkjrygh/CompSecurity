// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.support.v7.media.MediaRouter;
import android.view.Display;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.cast:
//            k, h, j, l, 
//            CastDevice

public abstract class CastRemoteDisplayLocalService extends Service
{
    private final class a extends Binder
    {

        final CastRemoteDisplayLocalService a;

        private a()
        {
            a = CastRemoteDisplayLocalService.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b extends BroadcastReceiver
    {

        public final void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
            {
                CastRemoteDisplayLocalService.b().a("disconnecting", new Object[0]);
                CastRemoteDisplayLocalService.a();
            }
        }
    }


    private static final p a = new p("CastRemoteDisplayLocalService");
    private static final int b;
    private static final Object c = new Object();
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static CastRemoteDisplayLocalService o;
    private GoogleApiClient e;
    private String f;
    private b g;
    private Notification h;
    private CastDevice i;
    private Display j;
    private Context k;
    private ServiceConnection l;
    private MediaRouter m;
    private final android.support.v7.media.MediaRouter.Callback n = new k(this);
    private final IBinder p = new a((byte)0);

    public CastRemoteDisplayLocalService()
    {
    }

    static CastDevice a(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        return castremotedisplaylocalservice.i;
    }

    public static void a()
    {
label0:
        {
            a.a("Stopping Service", new Object[0]);
            d.set(false);
            synchronized (c)
            {
                if (o != null)
                {
                    break label0;
                }
                a.c("Service is already being stopped", new Object[0]);
            }
            return;
        }
        obj1 = o;
        o = null;
        obj;
        JVM INSTR monitorexit ;
        ((CastRemoteDisplayLocalService) (obj1)).a("Stopping Service");
        if (((CastRemoteDisplayLocalService) (obj1)).m != null)
        {
            ((CastRemoteDisplayLocalService) (obj1)).a("Setting default route");
            ((CastRemoteDisplayLocalService) (obj1)).m.selectRoute(((CastRemoteDisplayLocalService) (obj1)).m.getDefaultRoute());
        }
        if (((CastRemoteDisplayLocalService) (obj1)).g != null)
        {
            ((CastRemoteDisplayLocalService) (obj1)).a("Unregistering notification receiver");
            ((CastRemoteDisplayLocalService) (obj1)).unregisterReceiver(((CastRemoteDisplayLocalService) (obj1)).g);
        }
        ((CastRemoteDisplayLocalService) (obj1)).a("stopRemoteDisplaySession");
        ((CastRemoteDisplayLocalService) (obj1)).a("stopRemoteDisplay");
        if (((CastRemoteDisplayLocalService) (obj1)).e == null || !((CastRemoteDisplayLocalService) (obj1)).e.isConnected())
        {
            a.c("Unable to stop the remote display as the API client is not ready", new Object[0]);
        } else
        {
            h.b.a(((CastRemoteDisplayLocalService) (obj1)).e).setResultCallback(new l(((CastRemoteDisplayLocalService) (obj1))));
        }
        ((CastRemoteDisplayLocalService) (obj1)).a("Stopping the remote display Service");
        ((CastRemoteDisplayLocalService) (obj1)).stopForeground(true);
        ((CastRemoteDisplayLocalService) (obj1)).stopSelf();
        if (((CastRemoteDisplayLocalService) (obj1)).m != null)
        {
            zzx.zzch("CastRemoteDisplayLocalService calls must be done on the main thread");
            ((CastRemoteDisplayLocalService) (obj1)).a("removeMediaRouterCallback");
            ((CastRemoteDisplayLocalService) (obj1)).m.removeCallback(((CastRemoteDisplayLocalService) (obj1)).n);
        }
        if (((CastRemoteDisplayLocalService) (obj1)).e != null)
        {
            ((CastRemoteDisplayLocalService) (obj1)).e.disconnect();
            obj1.e = null;
        }
        if (((CastRemoteDisplayLocalService) (obj1)).k != null && ((CastRemoteDisplayLocalService) (obj1)).l != null)
        {
            try
            {
                ((CastRemoteDisplayLocalService) (obj1)).k.unbindService(((CastRemoteDisplayLocalService) (obj1)).l);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                ((CastRemoteDisplayLocalService) (obj1)).a("No need to unbind service, already unbound");
            }
            obj1.l = null;
            obj1.k = null;
        }
        obj1.f = null;
        obj1.e = null;
        obj1.h = null;
        obj1.j = null;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    static void a(CastRemoteDisplayLocalService castremotedisplaylocalservice, String s)
    {
        castremotedisplaylocalservice.a(s);
    }

    private void a(String s)
    {
        a.a("[Instance: %s] %s", new Object[] {
            this, s
        });
    }

    static Display b(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        castremotedisplaylocalservice.j = null;
        return null;
    }

    static p b()
    {
        return a;
    }

    static 
    {
        b = com.google.android.gms.a.c.cast_notification_id;
    }
}
