// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class fcd
    implements fbz
{

    static final myc a;
    private static myc b;
    private static final oqe c;
    private static final oqe d;
    private static final oqe e;
    private static final oqe f;
    private static final onh g = new onh("debug.photos.hq_devmgmt");
    private final fcz h;
    private final myf i;

    fcd(fcz fcz1, myf myf1)
    {
        h = fcz1;
        i = myf1;
    }

    public final long a()
    {
        return Long.valueOf(c.a).longValue();
    }

    public final boolean a(int j)
    {
        return i.a(a, j);
    }

    public final long b()
    {
        return Long.valueOf(d.a).longValue();
    }

    public final boolean b(int j)
    {
        return false;
    }

    public final long c()
    {
        return Long.valueOf(e.a).longValue();
    }

    public final boolean c(int j)
    {
        boolean flag = false;
        if (h.a.a(j).d("device_mgmt_user_actions").a("dismissal_count", 0) >= 4)
        {
            flag = true;
        }
        return flag;
    }

    public final long d()
    {
        return Long.valueOf(f.a).longValue();
    }

    static 
    {
        a = new myc("debug.photos.devmgmt_enabled", "false", "f3713bfa", myi.b);
        b = new myc("debug.photos.hq_devmgmt_enabled", "false", "c2d6f421", myi.b);
        c = new oqe("debug.photos.low_storage", String.valueOf(oqm.c.f * 1024L));
        d = new oqe("debug.photos.vlow_storage", String.valueOf(oqm.c.f * 512L));
        e = new oqe("debug.photos.media_trigger", String.valueOf(oqm.c.f * 50L));
        f = new oqe("debug.photos.media_age_limit", String.valueOf(TimeUnit.DAYS.toMillis(30L)));
    }
}
