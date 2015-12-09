// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.tracking.Tracking;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class gpu
    implements Tracking
{

    private static final int b;
    private boolean a;
    private Optional c;
    private com.spotify.music.spotlets.tracking.Tracking.SourceType d;

    public gpu()
    {
        c = Optional.e();
    }

    private void a(Map map)
    {
        if (c.b())
        {
            ((bmc)c.c()).a(map);
        }
    }

    public final void a()
    {
        ctz.a(d);
        a((new blx("Registration", "Registration")).a(d.name()).a());
    }

    public final void a(Application application)
    {
        if (a)
        {
            Logger.a("Google Analytics Tracking SDK already setup", new Object[0]);
            return;
        }
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(application) == 0)
        {
            try
            {
                blt blt1 = blt.a(application);
                blt1.a(b);
                blt1.a(application);
                c = Optional.b(blt1.b());
                a((new blx("Tracking", "InitGoogleAnalytics")).a());
            }
            // Misplaced declaration of an exception variable
            catch (Application application)
            {
                c = Optional.e();
            }
        }
        a = true;
    }

    public final void a(com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype)
    {
        d = sourcetype;
        a((new blx("Registration", "Registration initiated")).a(sourcetype.name()).a());
    }

    public final void a(dxc dxc)
    {
    }

    public final void a(edb edb)
    {
    }

    public final void b()
    {
    }

    public final void b(com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype)
    {
        a((new blx("Login", "Login")).a(sourcetype.name()).a());
    }

    public final void b(dxc dxc)
    {
    }

    public final void b(edb edb)
    {
    }

    public final void c()
    {
    }

    static 
    {
        b = (int)TimeUnit.MINUTES.toSeconds(10L);
    }
}
