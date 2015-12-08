// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.p;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            k, i, l, j, 
//            v, s, r, SettingsCacheBehavior

public final class q
{
    public static final class a
    {

        private static final q a = new q((byte)0);

        public static q a()
        {
            return a;
        }

    }

    public static interface b
    {

        public abstract Object a(s s1);
    }


    private final AtomicReference a;
    private final CountDownLatch b;
    private r c;
    private boolean d;

    private q()
    {
        a = new AtomicReference();
        b = new CountDownLatch(1);
        d = false;
    }

    q(byte byte0)
    {
        this();
    }

    private void a(s s1)
    {
        a.set(s1);
        b.countDown();
    }

    public final q a(h h1, IdManager idmanager, io.fabric.sdk.android.services.network.c c1, String s1, String s2, String s3)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (c == null)
        {
            android.content.Context context = h1.n;
            String s4 = idmanager.d;
            new g();
            String s5 = g.a(context);
            String s6 = idmanager.e();
            p p1 = new p();
            io.fabric.sdk.android.services.settings.k k1 = new io.fabric.sdk.android.services.settings.k();
            i i1 = new i(h1);
            String s7 = CommonUtils.i(context);
            c1 = new l(h1, s3, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s4
            }), c1);
            c = new j(h1, new v(s5, idmanager.a(s5, s4), CommonUtils.a(new String[] {
                CommonUtils.k(context)
            }), s2, s1, DeliveryMechanism.a(s6).e, s7), p1, k1, i1, c1);
        }
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        h1;
        throw h1;
    }

    public final s a()
    {
        s s1;
        try
        {
            b.await();
            s1 = (s)a.get();
        }
        catch (InterruptedException interruptedexception)
        {
            io.fabric.sdk.android.c.a().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
        return s1;
    }

    public final Object a(b b1, Object obj)
    {
        s s1 = (s)a.get();
        if (s1 == null)
        {
            return obj;
        } else
        {
            return b1.a(s1);
        }
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        s s1;
        s1 = c.a();
        a(s1);
        boolean flag;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        s s1;
        s1 = c.a(SettingsCacheBehavior.b);
        a(s1);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        io.fabric.sdk.android.c.a().c("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
