// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.k;
import com.google.android.gms.location.m;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ca, cg, bw, k, 
//            am, cf, w

public class ch extends ca
{
    private final class a extends aa.b
    {

        final ch b;
        private final int c;
        private final String d[];

        protected void a()
        {
        }

        protected void a(com.google.android.gms.location.p.a a1)
        {
            if (a1 != null)
            {
                a1.a(c, d);
            }
        }

        protected void a(Object obj)
        {
            a((com.google.android.gms.location.p.a)obj);
        }

        public a(com.google.android.gms.location.p.a a1, int i, String as[])
        {
            b = ch.this;
            super(ch.this, a1);
            c = m.a(i);
            d = as;
        }
    }

    private static final class b extends ce.a
    {

        private com.google.android.gms.location.p.a a;
        private com.google.android.gms.location.p.b b;
        private ch c;

        public void a(int i, PendingIntent pendingintent)
        {
            if (c == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                ch ch1 = c;
                ch ch2 = c;
                ch2.getClass();
                ch1.a(ch2. new c(1, b, i, pendingintent));
                c = null;
                a = null;
                b = null;
                return;
            }
        }

        public void a(int i, String as[])
            throws RemoteException
        {
            if (c == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                ch ch1 = c;
                ch ch2 = c;
                ch2.getClass();
                ch1.a(ch2. new a(a, i, as));
                c = null;
                a = null;
                b = null;
                return;
            }
        }

        public void b(int i, String as[])
        {
            if (c == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                ch ch1 = c;
                ch ch2 = c;
                ch2.getClass();
                ch1.a(ch2. new c(2, b, i, as));
                c = null;
                a = null;
                b = null;
                return;
            }
        }

        public b(com.google.android.gms.location.p.a a1, ch ch1)
        {
            a = a1;
            b = null;
            c = ch1;
        }

        public b(com.google.android.gms.location.p.b b1, ch ch1)
        {
            b = b1;
            a = null;
            c = ch1;
        }
    }

    private final class c extends aa.b
    {

        final ch b;
        private final int c;
        private final String d[];
        private final PendingIntent e;
        private final int f;

        protected void a()
        {
        }

        protected void a(com.google.android.gms.location.p.b b1)
        {
label0:
            {
label1:
                {
                    if (b1 != null)
                    {
                        switch (f)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(f).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                b1.a(c, e);
                return;
            }
            b1.a(c, d);
        }

        protected void a(Object obj)
        {
            a((com.google.android.gms.location.p.b)obj);
        }

        public c(int i, com.google.android.gms.location.p.b b1, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            b = ch.this;
            super(ch.this, b1);
            if (i != 1)
            {
                flag = false;
            }
            w.a(flag);
            f = i;
            c = m.a(j);
            e = pendingintent;
            d = null;
        }

        public c(int i, com.google.android.gms.location.p.b b1, int j, String as[])
        {
            b = ch.this;
            super(ch.this, b1);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            w.a(flag);
            f = i;
            c = m.a(j);
            d = as;
            e = null;
        }
    }


    private final cg e;
    private final bw f;
    private final com.google.android.gms.internal.k g;

    public ch(Context context, Looper looper, String s, com.google.android.gms.common.api.h.b b1, com.google.android.gms.common.api.h.c c1, String s1)
    {
        this(context, looper, s, b1, c1, s1, null);
    }

    public ch(Context context, Looper looper, String s, com.google.android.gms.common.api.h.b b1, com.google.android.gms.common.api.h.c c1, String s1, String s2)
    {
        this(context, looper, s, b1, c1, s1, s2, null);
    }

    public ch(Context context, Looper looper, String s, com.google.android.gms.common.api.h.b b1, com.google.android.gms.common.api.h.c c1, String s1, String s2, 
            String s3)
    {
        super(context, looper, b1, c1, s1);
        e = new cg(context, d);
        f = bw.a(context, s2, s3, d);
        g = k.a(context, d);
    }

    public void a(long l1, PendingIntent pendingintent)
        throws RemoteException
    {
        j();
        am.a(pendingintent);
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "detectionIntervalMillis must be >= 0");
        ((cf)k()).a(l1, true, pendingintent);
    }

    public void a(PendingIntent pendingintent)
        throws RemoteException
    {
        j();
        am.a(pendingintent);
        ((cf)k()).a(pendingintent);
    }

    public void a(PendingIntent pendingintent, com.google.android.gms.location.p.b b1)
        throws RemoteException
    {
        j();
        am.a(pendingintent, "PendingIntent must be specified.");
        am.a(b1, "OnRemoveGeofencesResultListener not provided.");
        if (b1 == null)
        {
            b1 = null;
        } else
        {
            b1 = new b(b1, this);
        }
        ((cf)k()).a(pendingintent, b1, g().getPackageName());
    }

    public void a(Location location)
        throws RemoteException
    {
        e.a(location);
    }

    public void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, com.google.android.gms.location.p.a a1)
        throws RemoteException
    {
        j();
        am.a(geofencingrequest, "geofencingRequest can't be null.");
        am.a(pendingintent, "PendingIntent must be specified.");
        am.a(a1, "OnAddGeofencesResultListener not provided.");
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            a1 = new b(a1, this);
        }
        ((cf)k()).a(geofencingrequest, pendingintent, a1);
    }

    public void a(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        e.a(locationrequest, pendingintent);
    }

    public void a(LocationRequest locationrequest, k k1, Looper looper)
        throws RemoteException
    {
        synchronized (e)
        {
            e.a(locationrequest, k1, looper);
        }
        return;
        locationrequest;
        cg1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void a(k k1)
        throws RemoteException
    {
        e.a(k1);
    }

    public void a(List list, com.google.android.gms.location.p.b b1)
        throws RemoteException
    {
        j();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "geofenceRequestIds can't be null nor empty.");
        am.a(b1, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (b1 == null)
        {
            list = null;
        } else
        {
            list = new b(b1, this);
        }
        ((cf)k()).a(as, list, g().getPackageName());
    }

    public void a(boolean flag)
        throws RemoteException
    {
        e.a(flag);
    }

    public void b()
    {
        cg cg1 = e;
        cg1;
        JVM INSTR monitorenter ;
        boolean flag = c();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        e.b();
        e.c();
_L1:
        super.b();
        cg1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        cg1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void b(PendingIntent pendingintent)
        throws RemoteException
    {
        e.a(pendingintent);
    }

    public Location l()
    {
        return e.a();
    }
}
