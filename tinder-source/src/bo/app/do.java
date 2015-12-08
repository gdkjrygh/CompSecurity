// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//            dn, dm, bb, az

public class do
    implements dn
{

    private static final String a;
    private final az b;

    public do(az az1)
    {
        b = az1;
    }

    public final void a(dm dm1)
    {
        c(dm1);
    }

    public final void b(dm dm1)
    {
        c(dm1);
    }

    public final void c(dm dm1)
    {
        AppboyLogger.i(a, "Short circuiting execution of network request and immediately marking it as succeeded.");
        dm1.a(b);
        dm1.b(b);
        b.a(new bb(dm1), bo/app/bb);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/do.getName()
        });
    }
}
