// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.configuration.XmlAppConfigurationProvider;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package bo.app:
//            z, p, do, x, 
//            dn, az, cm, dm

public class o
    implements z
{

    public static final String a;
    public final XmlAppConfigurationProvider b;
    public final dn c;
    public final x d;
    public final Object e = new Object();
    public volatile boolean f;
    public volatile Thread g;
    public volatile boolean h;
    private do i;
    private boolean j;

    public o(XmlAppConfigurationProvider xmlappconfigurationprovider, az az, dn dn, x x1, ThreadFactory threadfactory, boolean flag)
    {
        f = false;
        h = true;
        j = false;
        b = xmlappconfigurationprovider;
        c = dn;
        d = x1;
        g = threadfactory.newThread(new p(this, (byte)0));
        i = new do(az);
        j = flag;
    }

    static String a()
    {
        return a;
    }

    static boolean a(o o1)
    {
        return o1.h;
    }

    static x b(o o1)
    {
        return o1.d;
    }

    static boolean c(o o1)
    {
        return o1.j;
    }

    static do d(o o1)
    {
        return o1.i;
    }

    static dn e(o o1)
    {
        return o1.c;
    }

    public final void a(cm cm)
    {
        d.a(cm);
    }

    public final void a(dm dm)
    {
        d.a(dm);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/o.getName()
        });
    }
}
