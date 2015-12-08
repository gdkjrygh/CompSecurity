// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.view.KeyEvent;
import java.util.List;

final class hj extends gh
{

    private hf a;

    hj(hf hf1)
    {
        a = hf1;
        super();
    }

    public final void a(int i1, int j1, String s1)
    {
        hf.a(a, i1, j1);
    }

    public final void a(long l1)
    {
        a.a.a(4, Long.valueOf(l1));
    }

    public final void a(Uri uri, Bundle bundle)
    {
        a.a.a(18, uri, bundle);
    }

    public final void a(fz fz)
    {
        a.a.a(12, fz);
    }

    public final void a(gd gd1)
    {
        if (a.g)
        {
            try
            {
                gd1.a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (gd gd1)
            {
                return;
            }
        } else
        {
            a.f.register(gd1);
            return;
        }
    }

    public final void a(String s1, Bundle bundle)
    {
        a.a.a(2, s1, bundle);
    }

    public final void a(String s1, Bundle bundle, ho ho1)
    {
        a.a.a(15, new hi(s1, bundle, ho.a(ho1)));
    }

    public final boolean a()
    {
        return (a.i & 2) != 0;
    }

    public final boolean a(KeyEvent keyevent)
    {
        boolean flag;
        if ((a.i & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a.a.a(14, keyevent);
        }
        return flag;
    }

    public final String b()
    {
        return a.b;
    }

    public final void b(int i1, int j1, String s1)
    {
        hf.b(a, i1, j1);
    }

    public final void b(long l1)
    {
        a.a.a(11, Long.valueOf(l1));
    }

    public final void b(gd gd1)
    {
        a.f.unregister(gd1);
    }

    public final void b(String s1, Bundle bundle)
    {
        a.a.a(3, s1, bundle);
    }

    public final String c()
    {
        return a.c;
    }

    public final void c(String s1, Bundle bundle)
    {
        a.a.a(13, s1, bundle);
    }

    public final PendingIntent d()
    {
        hf hf1;
        synchronized (a.e)
        {
            hf1 = a;
        }
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long e()
    {
        long l1;
        synchronized (a.e)
        {
            l1 = a.i;
        }
        return l1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final hz f()
    {
        int i1 = 2;
        Object obj = a.e;
        obj;
        JVM INSTR monitorenter ;
        gb gb1;
        int l1;
        int i2;
        l1 = a.l;
        i2 = a.m;
        gb1 = a.n;
        if (l1 != 2)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        int j1;
        int k1;
        i1 = gb1.a;
        j1 = gb1.b;
        k1 = gb1.c;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return new hz(l1, i2, i1, j1, k1);
        j1 = a.d.getStreamMaxVolume(i2);
        k1 = a.d.getStreamVolume(i2);
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void g()
    {
        a.a.a(1, null);
    }

    public final void h()
    {
        a.a.a(5, null);
    }

    public final void i()
    {
        a.a.a(6, null);
    }

    public final void j()
    {
        a.a.a(7, null);
    }

    public final void k()
    {
        a.a.a(8, null);
    }

    public final void l()
    {
        a.a.a(9, null);
    }

    public final void m()
    {
        a.a.a(10, null);
    }

    public final fw n()
    {
        return a.j;
    }

    public final ib o()
    {
        return a.c();
    }

    public final List p()
    {
        hf hf1;
        synchronized (a.e)
        {
            hf1 = a;
        }
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final CharSequence q()
    {
        hf hf1 = a;
        return null;
    }

    public final Bundle r()
    {
        hf hf1;
        synchronized (a.e)
        {
            hf1 = a;
        }
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int s()
    {
        hf hf1 = a;
        return 0;
    }
}
