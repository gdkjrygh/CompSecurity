// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            dt, ds, bg, be

public class du
    implements dt
{

    private static final String a;
    private final be b;

    public du(be be1)
    {
        b = be1;
    }

    public final void a(ds ds1)
    {
        c(ds1);
    }

    public final void b(ds ds1)
    {
        c(ds1);
    }

    public final void c(ds ds1)
    {
        AppboyLogger.i(a, "Short circuiting execution of network request and immediately marking it as succeeded.");
        ds1.a(b);
        ds1.b(b);
        b.a(new bg(ds1), bo/app/bg);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/du.getName()
        });
    }
}
