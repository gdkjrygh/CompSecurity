// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;

public class hf
    implements hd, mau
{

    final hk a;
    final String b;
    final String c;
    final AudioManager d;
    final Object e;
    final RemoteCallbackList f;
    boolean g;
    ha h;
    int i;
    fw j;
    ib k;
    int l;
    int m;
    gb n;
    private final Context o;
    private final ComponentName p;
    private final PendingIntent q;
    private final Object r;
    private final hj s;
    private final hq t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private gc y;

    public hf()
    {
    }

    public hf(Context context, String s1, ComponentName componentname, PendingIntent pendingintent)
    {
        e = new Object();
        f = new RemoteCallbackList();
        g = false;
        u = false;
        v = false;
        w = false;
        y = new hg(this);
        if (componentname == null)
        {
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }
        o = context;
        b = context.getPackageName();
        d = (AudioManager)context.getSystemService("audio");
        c = s1;
        p = componentname;
        q = pendingintent;
        s = new hj(this);
        t = new hq(s);
        a = new hk(this, Looper.myLooper());
        x = 0;
        l = 1;
        m = 3;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            r = new RemoteControlClient(pendingintent);
            return;
        } else
        {
            r = null;
            return;
        }
    }

    private void a(fw fw1)
    {
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            gd gd1 = (gd)f.getBroadcastItem(i1);
            try
            {
                gd1.a(fw1);
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        f.finishBroadcast();
    }

    static void a(hf hf1, int i1, int j1)
    {
        if (hf1.l == 2)
        {
            if (hf1.n != null)
            {
                hf1.n.b(i1);
            }
            return;
        } else
        {
            hf1.d.adjustStreamVolume(i1, hf1.m, j1);
            return;
        }
    }

    static void b(hf hf1, int i1, int j1)
    {
        if (hf1.l == 2)
        {
            if (hf1.n != null)
            {
                hf1.n.a(i1);
            }
            return;
        } else
        {
            hf1.d.setStreamVolume(hf1.m, i1, j1);
            return;
        }
    }

    private boolean d()
    {
        if (u)
        {
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                if (!w && (i & 1) != 0)
                {
                    Context context1;
                    Object obj;
                    if (android.os.Build.VERSION.SDK_INT >= 18)
                    {
                        Context context = o;
                        PendingIntent pendingintent = q;
                        ((AudioManager)context.getSystemService("audio")).registerMediaButtonEventReceiver(pendingintent);
                    } else
                    {
                        Context context2 = o;
                        ComponentName componentname = p;
                        ((AudioManager)context2.getSystemService("audio")).registerMediaButtonEventReceiver(componentname);
                    }
                    w = true;
                } else
                if (w && (i & 1) == 0)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 18)
                    {
                        c.a(o, q);
                    } else
                    {
                        b.a(o, p);
                    }
                    w = false;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                if (!v && (i & 2) != 0)
                {
                    context1 = o;
                    obj = r;
                    ((AudioManager)context1.getSystemService("audio")).registerRemoteControlClient((RemoteControlClient)obj);
                    v = true;
                    return true;
                }
                if (v && (i & 2) == 0)
                {
                    b.a(r, 0);
                    b.b(o, r);
                    v = false;
                    return false;
                }
            }
        } else
        {
            if (w)
            {
                if (android.os.Build.VERSION.SDK_INT >= 18)
                {
                    c.a(o, q);
                } else
                {
                    b.a(o, p);
                }
                w = false;
            }
            if (v)
            {
                b.a(r, 0);
                b.b(o, r);
                v = false;
            }
        }
        return false;
    }

    public lzx a(jyw jyw)
    {
        return new mgr((lmi)jyw);
    }

    public final void a()
    {
        u = false;
        g = true;
        d();
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            gd gd1 = (gd)f.getBroadcastItem(i1);
            try
            {
                gd1.a();
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        f.finishBroadcast();
        f.kill();
    }

    public final void a(int i1)
    {
        synchronized (e)
        {
            i = i1;
        }
        d();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(PendingIntent pendingintent)
    {
    }

    public final void a(ha ha, Handler handler)
    {
        if (ha == h)
        {
            return;
        }
        if (ha != null && android.os.Build.VERSION.SDK_INT >= 18) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            c.a(r, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            p.a(r, null);
        }
_L4:
        h = ha;
        return;
_L2:
        if (handler == null)
        {
            new Handler();
        }
        handler = new hh(this, ha);
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            ht ht1 = new ht(handler);
            c.a(r, ht1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            handler = new hu(handler);
            p.a(r, handler);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(ib ib1)
    {
        synchronized (e)
        {
            k = ib1;
        }
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            obj = (gd)f.getBroadcastItem(i1);
            float f1;
            Object obj1;
            int j1;
            long l1;
            long l4;
            try
            {
                ((gd) (obj)).a(ib1);
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        break MISSING_BLOCK_LABEL_64;
        ib1;
        obj;
        JVM INSTR monitorexit ;
        throw ib1;
        f.finishBroadcast();
        if (u) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ib1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.a(r, 0);
            b.a(r, 0L);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
label0:
        {
            {
                if (android.os.Build.VERSION.SDK_INT < 18)
                {
                    break label0;
                }
                obj1 = r;
                i1 = ib1.a;
                long l3 = ib1.b;
                f1 = ib1.d;
                l1 = ib1.g;
                l4 = SystemClock.elapsedRealtime();
                long l2;
                if (i1 == 3 && l3 > 0L)
                {
                    if (l1 > 0L)
                    {
                        l4 -= l1;
                        l2 = l4;
                        if (f1 > 0.0F)
                        {
                            l2 = l4;
                            if (f1 != 1.0F)
                            {
                                l2 = (long)((float)l4 * f1);
                            }
                        }
                    } else
                    {
                        l2 = 0L;
                    }
                    l2 += l3;
                } else
                {
                    l2 = l3;
                }
                i1 = b.a(i1);
                ((RemoteControlClient)obj1).setPlaybackState(i1, l2, f1);
            }
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                obj1 = r;
                l2 = ib1.e;
                ib1 = (RemoteControlClient)obj1;
                j1 = c.a(l2);
                i1 = j1;
                if ((l2 & 128L) != 0L)
                {
                    i1 = j1 | 0x200;
                }
                ib1.setTransportControlFlags(i1);
                return;
            }
            break; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.a(r, ib1.a);
        }
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_230;
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            obj1 = r;
            l2 = ib1.e;
            ((RemoteControlClient)obj1).setTransportControlFlags(c.a(l2));
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b.a(r, ib1.e);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(boolean flag)
    {
        Object obj2;
        obj2 = null;
        obj = null;
        if (flag != u) goto _L2; else goto _L1
_L1:
        return;
_L2:
        u = flag;
        if (!d()) goto _L1; else goto _L3
_L3:
        fw fw1;
        fw1 = j;
        synchronized (e)
        {
            j = fw1;
        }
        a(fw1);
        if (!u) goto _L5; else goto _L4
_L4:
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L7; else goto _L6
_L6:
        obj2 = r;
        long l1;
        if (fw1 != null)
        {
            obj = fw1.a;
        }
        if (k == null)
        {
            l1 = 0L;
        } else
        {
            l1 = k.e;
        }
        obj2 = ((RemoteControlClient)obj2).editMetadata(true);
        b.a(((Bundle) (obj)), ((android.media.RemoteControlClient.MetadataEditor) (obj2)));
        if (obj != null)
        {
            if (((Bundle) (obj)).containsKey("android.media.metadata.YEAR"))
            {
                ((android.media.RemoteControlClient.MetadataEditor) (obj2)).putLong(8, ((Bundle) (obj)).getLong("android.media.metadata.YEAR"));
            }
            if (((Bundle) (obj)).containsKey("android.media.metadata.RATING"))
            {
                ((android.media.RemoteControlClient.MetadataEditor) (obj2)).putObject(101, ((Bundle) (obj)).getParcelable("android.media.metadata.RATING"));
            }
            if (((Bundle) (obj)).containsKey("android.media.metadata.USER_RATING"))
            {
                ((android.media.RemoteControlClient.MetadataEditor) (obj2)).putObject(0x10000001, ((Bundle) (obj)).getParcelable("android.media.metadata.USER_RATING"));
            }
        }
        if ((l1 & 128L) != 0L)
        {
            ((android.media.RemoteControlClient.MetadataEditor) (obj2)).addEditableKey(0x10000001);
        }
        ((android.media.RemoteControlClient.MetadataEditor) (obj2)).apply();
_L5:
        a(k);
        return;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Object obj4 = r;
            Object obj1;
            if (fw1 == null)
            {
                obj1 = obj2;
            } else
            {
                obj1 = fw1.a;
            }
            obj2 = ((RemoteControlClient)obj4).editMetadata(true);
            b.a(((Bundle) (obj1)), ((android.media.RemoteControlClient.MetadataEditor) (obj2)));
            ((android.media.RemoteControlClient.MetadataEditor) (obj2)).apply();
        }
        if (true) goto _L5; else goto _L8
_L8:
    }

    public final hq b()
    {
        return t;
    }

    ib c()
    {
        long l2 = -1L;
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        ib ib1 = k;
        long l1 = l2;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        l1 = l2;
        if (j.a.containsKey("android.media.metadata.DURATION"))
        {
            l1 = j.a.getLong("android.media.metadata.DURATION", 0L);
        }
        obj;
        JVM INSTR monitorexit ;
        if (ib1 == null || ib1.a != 3 && ib1.a != 4 && ib1.a != 5) goto _L2; else goto _L1
_L1:
        long l3;
        l2 = ib1.g;
        l3 = SystemClock.elapsedRealtime();
        if (l2 <= 0L) goto _L2; else goto _L3
_L3:
        l2 = (long)(ib1.d * (float)(l3 - l2)) + ib1.b;
        float f1;
        Object obj1;
        Exception exception;
        int i1;
        if (l1 < 0L || l2 <= l1)
        {
            if (l2 < 0L)
            {
                l1 = 0L;
            } else
            {
                l1 = l2;
            }
        }
        obj = new id(ib1);
        i1 = ib1.a;
        f1 = ib1.d;
        obj.a = i1;
        obj.b = l1;
        obj.e = l3;
        obj.c = f1;
        obj = ((id) (obj)).a();
_L5:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = ib1;
        }
        return ((ib) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
