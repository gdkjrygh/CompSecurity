// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.TimeUnit;

final class fca
    implements hqh
{

    private static final long a;
    private static final oqe b;
    private final Context c;
    private final noz d;

    fca(Context context)
    {
        c = context;
        d = noz.a(context, 3, "PhotosDeviceMgmt", new String[0]);
    }

    public final String a()
    {
        return "DeviceManagementTrigger";
    }

    public final void a(int i, hqo hqo)
    {
        if (d.a())
        {
            noy.a(i);
        }
        ((fbw)olm.a(c, fbw)).a();
    }

    public final String b()
    {
        return "com.google.android.apps.photos.devicemanagement.trigger";
    }

    public final long c()
    {
        return Long.valueOf(b.a).longValue();
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
        b = new oqe("debug.devmgmt.period", String.valueOf(a));
    }
}
