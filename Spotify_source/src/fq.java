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
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;

public final class fq
    implements fo
{

    final ft a = new ft(this, Looper.myLooper());
    final String b;
    final String c;
    final AudioManager d;
    final Object e = new Object();
    final RemoteCallbackList f = new RemoteCallbackList();
    boolean g;
    fl h;
    int i;
    MediaMetadataCompat j;
    PlaybackStateCompat k;
    Bundle l;
    int m;
    int n;
    ek o;
    private final Context p;
    private final ComponentName q;
    private final PendingIntent r;
    private final Object s;
    private final fs t = new fs(this);
    private final android.support.v4.media.session.MediaSessionCompat.Token u;
    private boolean v;
    private boolean w;
    private boolean x;
    private el y;

    public fq(Context context, String s1, ComponentName componentname, PendingIntent pendingintent)
    {
        g = false;
        v = false;
        w = false;
        x = false;
        y = new el() {

            private fq a;

            public final void a(ek ek1)
            {
                if (a.o != ek1)
                {
                    return;
                } else
                {
                    ek1 = new ParcelableVolumeInfo(a.m, a.n, ek1.a, ek1.b, ek1.c);
                    a.a(ek1);
                    return;
                }
            }

            
            {
                a = fq.this;
                super();
            }
        };
        if (componentname == null)
        {
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }
        p = context;
        b = context.getPackageName();
        d = (AudioManager)context.getSystemService("audio");
        c = s1;
        q = componentname;
        r = pendingintent;
        u = new android.support.v4.media.session.MediaSessionCompat.Token(t);
        m = 1;
        n = 3;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            s = new RemoteControlClient(pendingintent);
            return;
        } else
        {
            s = null;
            return;
        }
    }

    static void a(fq fq1, int i1, int j1)
    {
        if (fq1.m == 2)
        {
            if (fq1.o != null)
            {
                fq1.o.b(i1);
            }
            return;
        } else
        {
            fq1.d.adjustStreamVolume(fq1.n, i1, j1);
            return;
        }
    }

    static void b(fq fq1, int i1, int j1)
    {
        if (fq1.m == 2)
        {
            if (fq1.o != null)
            {
                fq1.o.a(i1);
            }
            return;
        } else
        {
            fq1.d.setStreamVolume(fq1.n, i1, j1);
            return;
        }
    }

    private boolean h()
    {
        if (v)
        {
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                if (!x && (i & 1) != 0)
                {
                    Context context;
                    Object obj;
                    if (android.os.Build.VERSION.SDK_INT >= 18)
                    {
                        fx.a(p, r, q);
                    } else
                    {
                        Context context1 = p;
                        ComponentName componentname = q;
                        ((AudioManager)context1.getSystemService("audio")).registerMediaButtonEventReceiver(componentname);
                    }
                    x = true;
                } else
                if (x && (i & 1) == 0)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 18)
                    {
                        fx.b(p, r, q);
                    } else
                    {
                        gh.a(p, q);
                    }
                    x = false;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                if (!w && (i & 2) != 0)
                {
                    context = p;
                    obj = s;
                    ((AudioManager)context.getSystemService("audio")).registerRemoteControlClient((RemoteControlClient)obj);
                    w = true;
                    return true;
                }
                if (w && (i & 2) == 0)
                {
                    fv.a(s, 0);
                    fv.a(p, s);
                    w = false;
                    return false;
                }
            }
        } else
        {
            if (x)
            {
                if (android.os.Build.VERSION.SDK_INT >= 18)
                {
                    fx.b(p, r, q);
                } else
                {
                    gh.a(p, q);
                }
                x = false;
            }
            if (w)
            {
                fv.a(s, 0);
                fv.a(p, s);
                w = false;
            }
        }
        return false;
    }

    public final void a()
    {
        synchronized (e)
        {
            i = 3;
        }
        h();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i1)
    {
        if (o != null)
        {
            o.d = null;
        }
        m = 1;
        a(new ParcelableVolumeInfo(m, n, 2, d.getStreamMaxVolume(n), d.getStreamVolume(n)));
    }

    public final void a(PendingIntent pendingintent)
    {
    }

    public final void a(Bundle bundle)
    {
        l = bundle;
    }

    public final void a(MediaMetadataCompat mediametadatacompat)
    {
        Object obj1 = null;
        Object obj = null;
        synchronized (e)
        {
            j = mediametadatacompat;
        }
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            obj2 = (eo)f.getBroadcastItem(i1);
            long l1;
            try
            {
                ((eo) (obj2)).a(mediametadatacompat);
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        break MISSING_BLOCK_LABEL_74;
        mediametadatacompat;
        obj2;
        JVM INSTR monitorexit ;
        throw mediametadatacompat;
        f.finishBroadcast();
        if (v)
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                obj1 = s;
                if (mediametadatacompat == null)
                {
                    mediametadatacompat = ((MediaMetadataCompat) (obj));
                } else
                {
                    mediametadatacompat = mediametadatacompat.b;
                }
                if (k == null)
                {
                    l1 = 0L;
                } else
                {
                    l1 = k.e;
                }
                obj = ((RemoteControlClient)obj1).editMetadata(true);
                fv.a(mediametadatacompat, ((android.media.RemoteControlClient.MetadataEditor) (obj)));
                if (mediametadatacompat != null)
                {
                    if (mediametadatacompat.containsKey("android.media.metadata.YEAR"))
                    {
                        ((android.media.RemoteControlClient.MetadataEditor) (obj)).putLong(8, mediametadatacompat.getLong("android.media.metadata.YEAR"));
                    }
                    if (mediametadatacompat.containsKey("android.media.metadata.RATING"))
                    {
                        ((android.media.RemoteControlClient.MetadataEditor) (obj)).putObject(101, mediametadatacompat.getParcelable("android.media.metadata.RATING"));
                    }
                    if (mediametadatacompat.containsKey("android.media.metadata.USER_RATING"))
                    {
                        ((android.media.RemoteControlClient.MetadataEditor) (obj)).putObject(0x10000001, mediametadatacompat.getParcelable("android.media.metadata.USER_RATING"));
                    }
                }
                if ((l1 & 128L) != 0L)
                {
                    ((android.media.RemoteControlClient.MetadataEditor) (obj)).addEditableKey(0x10000001);
                }
                ((android.media.RemoteControlClient.MetadataEditor) (obj)).apply();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                obj = s;
                if (mediametadatacompat == null)
                {
                    mediametadatacompat = ((MediaMetadataCompat) (obj1));
                } else
                {
                    mediametadatacompat = mediametadatacompat.b;
                }
                obj = ((RemoteControlClient)obj).editMetadata(true);
                fv.a(mediametadatacompat, ((android.media.RemoteControlClient.MetadataEditor) (obj)));
                ((android.media.RemoteControlClient.MetadataEditor) (obj)).apply();
                return;
            }
        }
        return;
    }

    final void a(ParcelableVolumeInfo parcelablevolumeinfo)
    {
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            eo eo1 = (eo)f.getBroadcastItem(i1);
            try
            {
                eo1.a(parcelablevolumeinfo);
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        f.finishBroadcast();
    }

    public final void a(PlaybackStateCompat playbackstatecompat)
    {
        synchronized (e)
        {
            k = playbackstatecompat;
        }
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            obj = (eo)f.getBroadcastItem(i1);
            Object obj1;
            int j1;
            long l1;
            try
            {
                ((eo) (obj)).a(playbackstatecompat);
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        break MISSING_BLOCK_LABEL_59;
        playbackstatecompat;
        obj;
        JVM INSTR monitorexit ;
        throw playbackstatecompat;
        f.finishBroadcast();
        if (v) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (playbackstatecompat != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            fv.a(s, 0);
            fv.a(s, 0L);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT < 18) goto _L5; else goto _L4
_L4:
        fx.a(s, playbackstatecompat.a, playbackstatecompat.b, playbackstatecompat.d, playbackstatecompat.g);
_L7:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj1 = s;
            l1 = playbackstatecompat.e;
            playbackstatecompat = (RemoteControlClient)obj1;
            j1 = fx.a(l1);
            i1 = j1;
            if ((l1 & 128L) != 0L)
            {
                i1 = j1 | 0x200;
            }
            playbackstatecompat.setTransportControlFlags(i1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            fv.a(s, playbackstatecompat.a);
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            fx.a(s, playbackstatecompat.e);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            fv.a(s, playbackstatecompat.e);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void a(ek ek1)
    {
        if (ek1 == null)
        {
            throw new IllegalArgumentException("volumeProvider may not be null");
        }
        if (o != null)
        {
            o.d = null;
        }
        m = 2;
        o = ek1;
        a(new ParcelableVolumeInfo(m, n, o.a, o.b, o.c));
        ek1.d = y;
    }

    public final void a(fl fl, Handler handler)
    {
        if (fl == h)
        {
            return;
        }
        if (fl != null && android.os.Build.VERSION.SDK_INT >= 18) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            fx.a(s, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            fz.a(s, null);
        }
_L4:
        h = fl;
        return;
_L2:
        handler = new fw() {

            public final void a(Object obj1)
            {
                RatingCompat.a(obj1);
            }

        };
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            Object obj = fx.a();
            fx.a(s, obj);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            handler = new ga(handler);
            fz.a(s, handler);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag)
    {
        if (flag != v)
        {
            v = flag;
            if (h())
            {
                a(j);
                a(k);
                return;
            }
        }
    }

    public final boolean b()
    {
        return v;
    }

    public final void c()
    {
        v = false;
        g = true;
        h();
        int i1 = f.beginBroadcast() - 1;
        while (i1 >= 0) 
        {
            eo eo1 = (eo)f.getBroadcastItem(i1);
            try
            {
                eo1.a();
            }
            catch (RemoteException remoteexception) { }
            i1--;
        }
        f.finishBroadcast();
        f.kill();
    }

    public final android.support.v4.media.session.MediaSessionCompat.Token d()
    {
        return u;
    }

    public final Object e()
    {
        return null;
    }

    public final Object f()
    {
        return s;
    }

    final PlaybackStateCompat g()
    {
        long l2 = -1L;
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        PlaybackStateCompat playbackstatecompat = k;
        long l1 = l2;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l1 = l2;
        if (j.b.containsKey("android.media.metadata.DURATION"))
        {
            l1 = j.c("android.media.metadata.DURATION");
        }
        obj;
        JVM INSTR monitorexit ;
        if (playbackstatecompat == null || playbackstatecompat.a != 3 && playbackstatecompat.a != 4 && playbackstatecompat.a != 5) goto _L2; else goto _L1
_L1:
        long l3;
        l2 = playbackstatecompat.g;
        l3 = SystemClock.elapsedRealtime();
        if (l2 <= 0L) goto _L2; else goto _L3
_L3:
        l2 = (long)(playbackstatecompat.d * (float)(l3 - l2)) + playbackstatecompat.b;
        Object obj1;
        Exception exception;
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
        obj = new gi(playbackstatecompat);
        ((gi) (obj)).a(playbackstatecompat.a, l1, playbackstatecompat.d, l3);
        obj = ((gi) (obj)).a();
_L5:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = playbackstatecompat;
        }
        return ((PlaybackStateCompat) (obj1));
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
