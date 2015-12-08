// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.app.PendingIntent;
import com.pandora.android.provider.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.cw.c;
import p.dd.bg;
import p.dd.bh;
import p.df.a;

// Referenced classes of package com.pandora.android.audio:
//            d

public class f extends d
{

    static final boolean b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static boolean h = false;
    private long f;
    private int g;
    private android.media.RemoteControlClient.OnGetPlaybackPositionListener i;
    private android.media.RemoteControlClient.OnPlaybackPositionUpdateListener j;

    public f(PendingIntent pendingintent)
    {
        super(pendingintent);
        i = new android.media.RemoteControlClient.OnGetPlaybackPositionListener() {

            final f a;

            public long onGetPlaybackPosition()
            {
                return com.pandora.android.audio.f.a(a);
            }

            
            {
                a = f.this;
                super();
            }
        };
        j = new android.media.RemoteControlClient.OnPlaybackPositionUpdateListener() {

            final f a;

            public void onPlaybackPositionUpdate(long l)
            {
                com.pandora.android.audio.f.a(a, com.pandora.android.audio.f.b(a), l);
            }

            
            {
                a = f.this;
                super();
            }
        };
        if (!h)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b.a.b().b(this);
        c.invoke(b(), new Object[] {
            j
        });
        d.invoke(b(), new Object[] {
            i
        });
        return;
        pendingintent;
        p.df.a.b("RemoteControlClientManager", "RemoteControlClientV18Compat init error", pendingintent);
        return;
        pendingintent;
        p.df.a.b("RemoteControlClientManager", "RemoteControlClientV18Compat init error", pendingintent);
        return;
        pendingintent;
        p.df.a.b("RemoteControlClientManager", "RemoteControlClientV18Compat init error", pendingintent);
        return;
    }

    static long a(f f1)
    {
        return f1.f;
    }

    private void a(int k, long l)
    {
        if (!b && !h)
        {
            throw new AssertionError();
        }
        try
        {
            e.invoke(b(), new Object[] {
                Integer.valueOf(k), Long.valueOf(f), Float.valueOf(1.0F)
            });
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            p.df.a.b("RemoteControlClientManager", "setPlaybackState error", illegalargumentexception);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            p.df.a.b("RemoteControlClientManager", "setPlaybackState error", illegalaccessexception);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            p.df.a.b("RemoteControlClientManager", "setPlaybackState error", invocationtargetexception);
        }
    }

    static void a(f f1, int k, long l)
    {
        f1.a(k, l);
    }

    static int b(f f1)
    {
        return f1.g;
    }

    public void a(int k)
    {
        g = k;
        if (h)
        {
            a(g, f);
            return;
        } else
        {
            super.a(k);
            return;
        }
    }

    public void b(int k)
    {
        int l = k;
        if (h)
        {
            l = k;
            if (k != 0)
            {
                l = k | 0x100;
            }
        }
        super.b(l);
    }

    public void onTrackElapsedTime(bg bg1)
    {
        f = bg1.a * 1000;
    }

    public void onTrackState(bh bh1)
    {
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.audio._cls3.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            f = -1L;
            // fall through

        case 4: // '\004'
        case 5: // '\005'
            return;
        }
    }

    static 
    {
        boolean flag = true;
        if (com/pandora/android/audio/f.desiredAssertionStatus())
        {
            flag = false;
        }
        b = flag;
        try
        {
            c = a.getMethod("setPlaybackPositionUpdateListener", new Class[] {
                android/media/RemoteControlClient$OnPlaybackPositionUpdateListener
            });
            d = a.getMethod("setOnGetPlaybackPositionListener", new Class[] {
                android/media/RemoteControlClient$OnGetPlaybackPositionListener
            });
            e = a.getMethod("setPlaybackState", new Class[] {
                Integer.TYPE, Long.TYPE, Float.TYPE
            });
            h = true;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            p.df.a.a("RemoteControlClientManager", "RemoteControlClientV18Compat static init error", nosuchmethodexception);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            p.df.a.a("RemoteControlClientManager", "RemoteControlClientV18Compat static init error", illegalargumentexception);
        }
        catch (SecurityException securityexception)
        {
            p.df.a.a("RemoteControlClientManager", "RemoteControlClientV18Compat static init error", securityexception);
        }
    }
}
