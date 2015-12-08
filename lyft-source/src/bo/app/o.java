// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.events.IEventSubscriber;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package bo.app:
//            ad, p, q, du, 
//            dp, ah, ab, dt, 
//            be, cs, ds

public class o
    implements ad
{

    public static final String a;
    public final dt b;
    public final ab c;
    public final Object d = new Object();
    public final IEventSubscriber e;
    public volatile boolean f;
    public volatile Thread g;
    public volatile boolean h;
    private final XmlAppConfigurationProvider i;
    private du j;
    private boolean k;

    public o(XmlAppConfigurationProvider xmlappconfigurationprovider, be be, dt dt, ab ab1, ThreadFactory threadfactory, boolean flag)
    {
        f = false;
        h = true;
        k = false;
        i = xmlappconfigurationprovider;
        b = dt;
        c = ab1;
        e = new p(this, be);
        g = threadfactory.newThread(new q(this, (byte)0));
        j = new du(be);
        k = flag;
    }

    static ab a(o o1)
    {
        return o1.c;
    }

    static dp b(o o1)
    {
        return o1.a();
    }

    static String b()
    {
        return a;
    }

    static boolean c(o o1)
    {
        return o1.h;
    }

    static boolean d(o o1)
    {
        return o1.k;
    }

    static du e(o o1)
    {
        return o1.j;
    }

    static dt f(o o1)
    {
        return o1.b;
    }

    public final dp a()
    {
        return new dp(i.getBaseUrlForRequests(), ah.d);
    }

    public final void a(cs cs)
    {
        c.a(cs);
    }

    public final void a(ds ds)
    {
        c.a(ds);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/o.getName()
        });
    }
}
