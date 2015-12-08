// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class alg
    implements alp
{

    final AtomicBoolean a;
    final AtomicBoolean b;
    private Context c;
    private ali d;
    private IdManager e;
    private hbk f;
    private alj g;
    private hbd h;
    private gzc i;
    private hba j;
    private long k;

    public alg()
    {
        this(false);
    }

    public alg(boolean flag)
    {
        a = new AtomicBoolean();
        k = 0L;
        b = new AtomicBoolean(flag);
    }

    protected final void a()
    {
        long l;
        synchronized (h)
        {
            if (h.a().contains("last_update_check"))
            {
                h.a(h.b().remove("last_update_check"));
            }
        }
        l = i.a();
        long l1 = (long)f.b * 1000L;
        gya.a().a("Beta", (new StringBuilder("Check for updates delay: ")).append(l1).toString());
        gya.a().a("Beta", (new StringBuilder("Check for updates last check time: ")).append(k).toString());
        l1 += k;
        gya.a().a("Beta", (new StringBuilder("Check for updates current time: ")).append(l).append(", next check time: ").append(l1).toString());
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        gya.a().a("Beta", "Performing update check");
        new gyx();
        obj = gyx.a(c);
        String s = e.a(((String) (obj)), g.d);
        ali ali = d;
        String s1 = CommonUtils.d(((gyh) (d)).k, "com.crashlytics.ApiEndpoint");
        String s2 = f.a;
        hba hba = j;
        new alm();
        (new alk(ali, s1, s2, hba)).a(((String) (obj)), s, g);
        k = l;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        k = l;
        throw exception;
        gya.a().a("Beta", "Check for updates next check time was not passed");
        return;
    }

    public final void a(Context context, ali ali, IdManager idmanager, hbk hbk1, alj alj1, hbd hbd1, gzc gzc1, 
            hba hba)
    {
        c = context;
        d = ali;
        e = idmanager;
        f = hbk1;
        g = alj1;
        h = hbd1;
        i = gzc1;
        j = hba;
        a.set(true);
        if (b.get())
        {
            a();
        }
    }
}
