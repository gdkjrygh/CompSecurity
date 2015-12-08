// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.c;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.j;
import io.fabric.sdk.android.services.settings.f;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.beta:
//            UpdatesController, BuildProperties, CheckForUpdatesRequest, CheckForUpdatesResponseTransform, 
//            Beta

abstract class AbstractCheckForUpdatesController
    implements UpdatesController
{

    final AtomicBoolean a;
    final AtomicBoolean b;
    private Context c;
    private Beta d;
    private IdManager e;
    private f f;
    private BuildProperties g;
    private c h;
    private j i;
    private io.fabric.sdk.android.services.network.c j;
    private long k;

    public AbstractCheckForUpdatesController()
    {
        this(false);
    }

    public AbstractCheckForUpdatesController(boolean flag)
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
        io.fabric.sdk.android.c.a().a("Beta", (new StringBuilder("Check for updates delay: ")).append(l1).toString());
        io.fabric.sdk.android.c.a().a("Beta", (new StringBuilder("Check for updates last check time: ")).append(k).toString());
        l1 += k;
        io.fabric.sdk.android.c.a().a("Beta", (new StringBuilder("Check for updates current time: ")).append(l).append(", next check time: ").append(l1).toString());
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        io.fabric.sdk.android.c.a().a("Beta", "Performing update check");
        new g();
        obj = io.fabric.sdk.android.services.common.g.a(c);
        String s = e.a(((String) (obj)), g.d);
        (new CheckForUpdatesRequest(d, CommonUtils.d(((h) (d)).n, "com.crashlytics.ApiEndpoint"), f.a, j, new CheckForUpdatesResponseTransform())).a(((String) (obj)), s, g);
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
        io.fabric.sdk.android.c.a().a("Beta", "Check for updates next check time was not passed");
        return;
    }

    public final void a(Context context, Beta beta, IdManager idmanager, f f1, BuildProperties buildproperties, c c1, j j1, 
            io.fabric.sdk.android.services.network.c c2)
    {
        c = context;
        d = beta;
        e = idmanager;
        f = f1;
        g = buildproperties;
        h = c1;
        i = j1;
        j = c2;
        a.set(true);
        if (b.get())
        {
            a();
        }
    }
}
