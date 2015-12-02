// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Timer;
import java.util.WeakHashMap;

public final class adv
{

    private final Object a;
    private final Context b;
    private final String c;
    private final VersionInfoParcel d;
    private final WeakHashMap e;
    private akc f;
    private akc g;
    private ajy h;
    private aql i;
    private int j;

    public adv(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        a = new Object();
        j = 1;
        c = s;
        b = context.getApplicationContext();
        d = versioninfoparcel;
        e = new WeakHashMap();
        f = new akb();
        g = new akb();
    }

    public adv(Context context, VersionInfoParcel versioninfoparcel, String s, akc akc, akc akc1)
    {
        this(context, versioninfoparcel, s);
        f = akc;
        g = akc1;
    }

    static int a(adv adv1, int k)
    {
        adv1.j = k;
        return k;
    }

    static ajy a(adv adv1, ajy ajy1)
    {
        adv1.h = ajy1;
        return ajy1;
    }

    private static aql a(Context context, VersionInfoParcel versioninfoparcel)
    {
        return new aar(context, versioninfoparcel);
    }

    static Object a(adv adv1)
    {
        return adv1.a;
    }

    static aql b(adv adv1)
    {
        return adv1.i;
    }

    static akc c(adv adv1)
    {
        return adv1.f;
    }

    static ajy d(adv adv1)
    {
        return adv1.h;
    }

    private void d(ajy ajy1)
    {
        j = 2;
        i = a(b, d);
        i.a(new _cls1(ajy1));
        i.a("/jsLoaded", new _cls2(ajy1));
        ajr ajr1 = new ajr();
        _cls3 _lcls3 = new _cls3(ajr1);
        ajr1.a(_lcls3);
        i.a("/requestReload", _lcls3);
        if (c.endsWith(".js"))
        {
            i.a(c);
        } else
        if (c.startsWith("<html>"))
        {
            i.b(c);
        } else
        {
            i.c(c);
        }
        (new Timer()).schedule(new _cls4(ajy1), adw.a);
    }

    public final ajy a()
    {
label0:
        {
            akd akd1;
            synchronized (a)
            {
                if (h != null && h.b() != -1)
                {
                    break label0;
                }
                akd1 = new akd();
                h = akd1;
                d(akd1);
                b(akd1);
            }
            return akd1;
        }
        ajy ajy1;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        b(h);
        ajy1 = h;
        obj;
        JVM INSTR monitorexit ;
        return ajy1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d(new akd());
        b(h);
        exception = h;
        obj;
        JVM INSTR monitorexit ;
        return exception;
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        b(h);
        exception = h;
        obj;
        JVM INSTR monitorexit ;
        return exception;
        b(h);
        exception = h;
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    public final void a(ajy ajy1)
    {
        synchronized (a)
        {
            c(ajy1);
        }
        return;
        ajy1;
        obj;
        JVM INSTR monitorexit ;
        throw ajy1;
    }

    protected final void b(ajy ajy1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Integer integer1 = (Integer)e.get(ajy1);
        Integer integer;
        integer = integer1;
        if (integer1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        integer = Integer.valueOf(0);
        of.d("Incremented use-counter for js engine.");
        int k = integer.intValue();
        e.put(ajy1, Integer.valueOf(k + 1));
        obj;
        JVM INSTR monitorexit ;
        return;
        ajy1;
        obj;
        JVM INSTR monitorexit ;
        throw ajy1;
    }

    protected final void c(ajy ajy1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Integer integer = (Integer)e.get(ajy1);
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (integer.intValue() != 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        integer = Integer.valueOf(integer.intValue() - 1);
        if (integer.intValue() == 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        of.d("Decremented use-counter for js engine.");
        e.put(ajy1, integer);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        ajy1;
        obj;
        JVM INSTR monitorexit ;
        throw ajy1;
        of.d("Removing js engine.");
        e.remove(ajy1);
        ajy1.a(g, new aka());
        ajy1.a(new _cls5(), new aka());
          goto _L1
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}
