// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.settings.SettingsCacheBehavior;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class hbv
{

    private final AtomicReference a;
    private final CountDownLatch b;
    private hby c;
    private boolean d;

    private hbv()
    {
        a = new AtomicReference();
        b = new CountDownLatch(1);
        d = false;
    }

    hbv(byte byte0)
    {
        this();
    }

    private void a(hbz hbz1)
    {
        a.set(hbz1);
        b.countDown();
    }

    public final hbv a(gyh gyh1, IdManager idmanager, hba hba, String s, String s1, String s2)
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
            android.content.Context context = gyh1.k;
            String s3 = idmanager.d;
            new gyx();
            String s4 = gyx.a(context);
            String s5 = idmanager.e();
            gzl gzl1 = new gzl();
            hbp hbp1 = new hbp();
            hbn hbn1 = new hbn(gyh1);
            String s6 = CommonUtils.i(context);
            hba = new hbq(gyh1, s2, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s3
            }), hba);
            c = new hbo(gyh1, new hcb(s4, idmanager.a(s4, s3), CommonUtils.a(new String[] {
                CommonUtils.k(context)
            }), s1, s, DeliveryMechanism.a(s5).id, s6), gzl1, hbp1, hbn1, hba);
        }
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        gyh1;
        throw gyh1;
    }

    public final hbz a()
    {
        hbz hbz1;
        try
        {
            b.await();
            hbz1 = (hbz)a.get();
        }
        catch (InterruptedException interruptedexception)
        {
            gya.a().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
        return hbz1;
    }

    public final Object a(hbx hbx1, Object obj)
    {
        hbz hbz1 = (hbz)a.get();
        if (hbz1 == null)
        {
            return obj;
        } else
        {
            return hbx1.a(hbz1);
        }
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        hbz hbz1;
        hbz1 = c.a();
        a(hbz1);
        boolean flag;
        if (hbz1 != null)
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
        hbz hbz1;
        hbz1 = c.a(SettingsCacheBehavior.b);
        a(hbz1);
        if (hbz1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        gya.a().c("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (hbz1 != null)
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
