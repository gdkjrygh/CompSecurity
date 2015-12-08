// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package io.fabric.sdk.android:
//            DefaultLogger, InitializationCallback, Fabric, Kit, 
//            Logger

public class nContext
{

    private final Context a;
    private Kit b[];
    private PriorityThreadPoolExecutor c;
    private Handler d;
    private Logger e;
    private boolean f;
    private String g;
    private String h;
    private InitializationCallback i;

    public transient nContext a(Kit akit[])
    {
        if (akit == null)
        {
            throw new IllegalArgumentException("Kits must not be null.");
        }
        if (akit.length == 0)
        {
            throw new IllegalArgumentException("Kits must not be empty.");
        }
        if (b != null)
        {
            throw new IllegalStateException("Kits already set.");
        } else
        {
            b = akit;
            return this;
        }
    }

    public Fabric a()
    {
        if (b == null)
        {
            throw new IllegalStateException("Kits must not be null.");
        }
        if (c == null)
        {
            c = PriorityThreadPoolExecutor.a();
        }
        if (d == null)
        {
            d = new Handler(Looper.getMainLooper());
        }
        Map map;
        IdManager idmanager;
        if (e == null)
        {
            if (f)
            {
                e = new DefaultLogger(3);
            } else
            {
                e = new DefaultLogger();
            }
        }
        if (h == null)
        {
            h = a.getPackageName();
        }
        if (i == null)
        {
            i = InitializationCallback.d;
        }
        map = Fabric.a(Arrays.asList(b));
        idmanager = new IdManager(a, h, g, map.values());
        return new Fabric(a, map, c, d, e, f, i, idmanager);
    }

    public allback(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null.");
        } else
        {
            a = context.getApplicationContext();
            return;
        }
    }
}
