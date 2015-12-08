// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.LocationManager;
import com.appboy.a.b;
import com.appboy.d;
import com.appboy.services.AppboyLocationService;

// Referenced classes of package bo.app:
//            cb, eg, ep, bq, 
//            cq, ct, bx, cz

public final class bp
    implements cb
{

    private static final String a;
    private final Context b;
    private final String c;
    private final LocationManager d;
    private final bx e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private float m;
    private String n;

    public bp(Context context, bx bx1, b b1, eg eg1)
    {
        k = false;
        l = 0x36ee80L;
        m = 50F;
        b = context;
        c = context.getPackageName();
        e = bx1;
        d = (LocationManager)context.getSystemService("location");
        f = com.appboy.f.d.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        g = com.appboy.f.d.a(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean flag;
        if (b1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (eg1.a())
        {
            if (eg1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (b1.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (ep.a(b, com/appboy/services/AppboyLocationService))
        {
            flag = true;
        } else
        {
            String.format("Appboy location service is not available. Declare <service android:name=\"com.appboy.services.AppboyLocationService\"/> in your AndroidManifest.xml to enable Appboy location service.", new Object[0]);
            flag = false;
        }
        i = flag;
        if (eg1.c() >= 0L)
        {
            l = eg1.c();
            (new StringBuilder("Time interval override set via server configuration for background location collection: ")).append(l / 1000L).append("s.");
        } else
        if (b1.g() > 0x493e0L)
        {
            l = b1.g();
            (new StringBuilder("Time interval override set via appboy.xml configuration for background location collection: ")).append(l / 1000L).append("s.");
        } else
        {
            l = 0x36ee80L;
            (new StringBuilder("Time interval override set to default for background location collection: ")).append(l / 1000L).append("s.");
        }
        if (eg1.d() >= 0.0F)
        {
            m = eg1.d();
            (new StringBuilder("Distance threshold override set via server configuration for background location collection: ")).append(m).append("m.");
        } else
        if (b1.h() > 50F)
        {
            m = b1.h();
            (new StringBuilder("Distance threshold override set via appboy.xml configuration for background location collection: ")).append(m).append("m.");
        } else
        {
            m = 50F;
            (new StringBuilder("Distance threshold override set to default for background location collection: ")).append(m).append("m.");
        }
        if (!h) goto _L2; else goto _L1
_L1:
        if (!g) goto _L4; else goto _L3
_L3:
        context = "passive";
_L6:
        n = context;
        context = new bq(this);
        bx1 = new IntentFilter((new StringBuilder()).append(c).append(".SINGLE_APPBOY_LOCATION_UPDATE").toString());
        b.registerReceiver(context, bx1);
        c();
        return;
_L4:
        if (f)
        {
            context = new Criteria();
            context.setAccuracy(2);
            context.setPowerRequirement(1);
            bx1 = d.getBestProvider(context, true);
            context = bx1;
            if (bx1 != null)
            {
                (new StringBuilder("Using ")).append(bx1).append(" provider for coarse-grained location collection.");
                context = bx1;
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean a(String s)
    {
        Intent intent;
        if (!i)
        {
            String.format("Appboy Location service is not available. Did not send intent to service: %s", new Object[] {
                s
            });
            return false;
        }
        intent = (new Intent(s)).setClass(b, com/appboy/services/AppboyLocationService);
        if (!s.equals((new StringBuilder()).append(c).append(".INIT_APPBOY_LOCATION_SERVICE").toString())) goto _L2; else goto _L1
_L1:
        intent.putExtra("provider", n);
_L4:
        b.startService(intent);
        k = true;
        return true;
_L2:
        if (s.equals((new StringBuilder()).append(c).append(".REQUEST_APPBOY_LOCATION_UPDATES").toString()))
        {
            intent.putExtra("distance", m);
            intent.putExtra("time", l);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String b()
    {
        return a;
    }

    private boolean c()
    {
        while (!h || !j || !g) 
        {
            return false;
        }
        boolean flag;
        try
        {
            if (!k)
            {
                a((new StringBuilder()).append(c).append(".INIT_APPBOY_LOCATION_SERVICE").toString());
            }
            a((new StringBuilder()).append(c).append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES").toString());
            flag = a((new StringBuilder()).append(c).append(".REQUEST_APPBOY_LOCATION_UPDATES").toString());
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    public final void a(cq cq1)
    {
        if (cq1 != null)
        {
            if (cq1.g >= 0L)
            {
                l = cq1.g;
                (new StringBuilder("Time interval override reset via server configuration for background location collection: ")).append(l / 1000L).append("s.");
            }
            if (cq1.h >= 0.0F)
            {
                m = cq1.h;
                (new StringBuilder("Distance threshold override reset via server configuration for background location collection: ")).append(m).append("m.");
            }
            if (cq1.e)
            {
                if (cq1.f)
                {
                    j = true;
                    c();
                    return;
                }
                j = false;
                if (i)
                {
                    cq1 = (new Intent()).setClass(b, com/appboy/services/AppboyLocationService);
                    b.stopService(cq1);
                    k = false;
                    return;
                }
            }
        }
    }

    public final boolean a()
    {
        while (!h || !g && !f || n == null) 
        {
            return false;
        }
        try
        {
            Object obj = new Intent((new StringBuilder()).append(c).append(".SINGLE_APPBOY_LOCATION_UPDATE").toString());
            ((Intent) (obj)).putExtra("origin", "Appboy location manager");
            obj = PendingIntent.getBroadcast(b, 0, ((Intent) (obj)), 0x8000000);
            d.requestSingleUpdate(n, ((PendingIntent) (obj)));
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public final boolean a(cz cz)
    {
        try
        {
            cz = ct.a(cz);
            e.a(cz);
        }
        // Misplaced declaration of an exception variable
        catch (cz cz)
        {
            return false;
        }
        return true;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/bp.getName()
        });
    }
}
