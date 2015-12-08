// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

final class gca
{

    private static long f;
    private static long g;
    private static final oqe h;
    final int a;
    final muz b;
    final mmv c;
    final noz d;
    boolean e;
    private final hqo i;
    private final long j;
    private final npk k;
    private long l;

    gca(Context context, int i1, hqo hqo1)
    {
        boolean flag;
        if (i1 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, Integer.valueOf(i1));
        i = hqo1;
        a = i1;
        c = (mmv)olm.a(context, mmv);
        k = (npk)olm.a(context, npk);
        b = (muz)olm.a(context, muz);
        d = noz.a(context, 3, "SyncValidator", new String[] {
            "sync"
        });
        j = b.a();
        try
        {
            l = c.a(i1).d("com.google.android.apps.photos.mediasync.SyncValidator").a("last_sync_time", 0L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (d.a())
        {
            noy.a(i1);
        }
        l = 0x7fffffffffffffffL;
    }

    private long c()
    {
        return b.a() - l;
    }

    private long d()
    {
        return b.a() - j;
    }

    public final boolean a()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (!k.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d() >= g)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (c() <= Long.parseLong(h.a))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!c.d(a))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag2 || e || flag3 || i.c)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag4 && d.a())
        {
            noy.a("isOffSyncable", Boolean.valueOf(flag));
            noy.a("isOverMaxDuration", Boolean.valueOf(flag1));
            noy.a("duration", noy.b(d()));
            noy.a("isLastSyncTimeTooRecent", Boolean.valueOf(flag2));
            noy.a("last sync time", Long.valueOf(c()));
            noy.a("isThrottled", Boolean.valueOf(e));
            noy.a("isLoggedOut", Boolean.valueOf(flag3));
            noy.a("isCancelled", Boolean.valueOf(i.c));
        }
        return flag4;
    }

    public final void b()
    {
        c.b(a).h("com.google.android.apps.photos.mediasync.SyncValidator").b("last_sync_time", b.a()).d();
_L1:
        return;
        mmy mmy1;
        mmy1;
        if (d.a())
        {
            noy.a(a);
            return;
        }
          goto _L1
    }

    static 
    {
        f = TimeUnit.HOURS.toMillis(12L);
        g = TimeUnit.MINUTES.toMillis(2L);
        h = new oqe("debug.photos.sync_pause_time", String.valueOf(f));
    }
}
