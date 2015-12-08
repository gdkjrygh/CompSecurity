// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.LocationManager;
import com.appboy.Constants;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.services.AppboyLocationService;
import com.appboy.support.AppboyLogger;
import java.util.List;

// Referenced classes of package bo.app:
//            ch, em, bw, cw, 
//            cz, cd, df

public final class bv
    implements ch
{

    private static final String a;
    private final Context b;
    private final String c;
    private final LocationManager d;
    private final cd e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private float m;
    private String n;

    public bv(Context context, cd cd1, XmlAppConfigurationProvider xmlappconfigurationprovider, em em1)
    {
        k = false;
        l = 0x36ee80L;
        m = 50F;
        b = context;
        c = context.getPackageName();
        e = cd1;
        d = (LocationManager)context.getSystemService("location");
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (xmlappconfigurationprovider.isLocationCollectionEnabled())
        {
            AppboyLogger.i(a, "Location collection enabled via appboy.xml configuration.");
            flag = true;
        } else
        {
            AppboyLogger.i(a, "Location collection disabled via appboy.xml configuration.");
            flag = false;
        }
        h = flag;
        if (em1.a())
        {
            if (em1.b())
            {
                AppboyLogger.i(a, "Background location collection enabled via server configuration.");
                flag = true;
            } else
            {
                AppboyLogger.i(a, "Background location collection disabled via server configuration.");
                flag = false;
            }
        } else
        if (xmlappconfigurationprovider.isBackgroundLocationCollectionEnabled())
        {
            AppboyLogger.i(a, "Background location collection enabled via appboy.xml configuration.");
            flag = true;
        } else
        {
            AppboyLogger.i(a, "Background location collection disabled via appboy.xml configuration.");
            flag = false;
        }
        j = flag;
        if (b.getPackageManager().queryIntentServices((new Intent()).setClass(b, com/appboy/services/AppboyLocationService), 0x10000).size() > 0)
        {
            flag = true;
        } else
        {
            AppboyLogger.i(a, String.format("Appboy location service is not available. Declare <service android:name=\"com.appboy.services.AppboyLocationService\"/> in your Appboy.xml to enable Appboy location service.", new Object[0]));
            flag = false;
        }
        i = flag;
        if (em1.c() >= 0L)
        {
            l = em1.c();
            AppboyLogger.i(a, (new StringBuilder("Time interval override set via server configuration for background location collection: ")).append(l / 1000L).append("s.").toString());
        } else
        if (xmlappconfigurationprovider.getLocationUpdateTimeIntervalInMillis() > 0x493e0L)
        {
            l = xmlappconfigurationprovider.getLocationUpdateTimeIntervalInMillis();
            AppboyLogger.i(a, (new StringBuilder("Time interval override set via appboy.xml configuration for background location collection: ")).append(l / 1000L).append("s.").toString());
        } else
        {
            l = 0x36ee80L;
            AppboyLogger.i(a, (new StringBuilder("Time interval override set to default for background location collection: ")).append(l / 1000L).append("s.").toString());
        }
        if (em1.d() >= 0.0F)
        {
            m = em1.d();
            AppboyLogger.i(a, (new StringBuilder("Distance threshold override set via server configuration for background location collection: ")).append(m).append("m.").toString());
        } else
        if (xmlappconfigurationprovider.getLocationUpdateDistanceInMeters() > 50F)
        {
            m = xmlappconfigurationprovider.getLocationUpdateDistanceInMeters();
            AppboyLogger.i(a, (new StringBuilder("Distance threshold override set via appboy.xml configuration for background location collection: ")).append(m).append("m.").toString());
        } else
        {
            m = 50F;
            AppboyLogger.i(a, (new StringBuilder("Distance threshold override set to default for background location collection: ")).append(m).append("m.").toString());
        }
        if (!h)
        {
            AppboyLogger.i(a, "Returning null location provider. Location collection is disabled.");
            context = null;
        } else
        if (g)
        {
            AppboyLogger.i(a, "Using passive provider for fine-grained location collection.");
            context = "passive";
        } else
        if (f)
        {
            context = new Criteria();
            context.setAccuracy(2);
            context.setPowerRequirement(1);
            context = d.getBestProvider(context, true);
            if (context != null)
            {
                AppboyLogger.i(a, (new StringBuilder("Using ")).append(context).append(" provider for coarse-grained location collection.").toString());
            } else
            {
                AppboyLogger.i(a, "Returning null location provider. No suitable location provider found.");
            }
        } else
        {
            AppboyLogger.i(a, "Returning null location provider. Coarse or fine grained location permissions not found.");
            context = null;
        }
        n = context;
        context = new bw(this);
        cd1 = new IntentFilter((new StringBuilder()).append(c).append(".SINGLE_APPBOY_LOCATION_UPDATE").toString());
        b.registerReceiver(context, cd1);
        c();
    }

    private boolean a(String s)
    {
        Intent intent;
        if (!i)
        {
            AppboyLogger.i(a, String.format("Appboy Location service is not available. Did not send intent to service: %s", new Object[] {
                s
            }));
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
        if (!h)
        {
            AppboyLogger.i(a, "Did not request background location updates. Location collection is disabled.");
            return false;
        }
        if (!j)
        {
            AppboyLogger.i(a, "Did not request background location updates. Background location collection is disabled.");
            return false;
        }
        if (!g)
        {
            AppboyLogger.i(a, "Did not request background location updates. Fine grained location permissions not found.");
            return false;
        }
        boolean flag;
        try
        {
            if (!k)
            {
                AppboyLogger.i(a, "Attempting to start Appboy Location Service.");
                a((new StringBuilder()).append(c).append(".INIT_APPBOY_LOCATION_SERVICE").toString());
            }
            a((new StringBuilder()).append(c).append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES").toString());
            flag = a((new StringBuilder()).append(c).append(".REQUEST_APPBOY_LOCATION_UPDATES").toString());
        }
        catch (Exception exception)
        {
            AppboyLogger.w(a, "Could not request location updates due to exception.", exception);
            return false;
        }
        return flag;
    }

    public final void a(cw cw1)
    {
        if (cw1 == null)
        {
            AppboyLogger.w(a, "Could not reset background location collection interval. Server config was null.");
        } else
        {
            if (cw1.g >= 0L)
            {
                l = cw1.g;
                AppboyLogger.i(a, (new StringBuilder("Time interval override reset via server configuration for background location collection: ")).append(l / 1000L).append("s.").toString());
            }
            if (cw1.h >= 0.0F)
            {
                m = cw1.h;
                AppboyLogger.i(a, (new StringBuilder("Distance threshold override reset via server configuration for background location collection: ")).append(m).append("m.").toString());
            }
            if (cw1.e)
            {
                if (cw1.f)
                {
                    j = true;
                    AppboyLogger.i(a, "Background location collection enabled via server configuration. Requesting location updates.");
                    c();
                    return;
                }
                j = false;
                AppboyLogger.i(a, "Background location collection disabled via server configuration. Stopping any active Appboy location service.");
                if (!i)
                {
                    AppboyLogger.i(a, "Did not attempt to stop service. Appboy Location service is not available.");
                    return;
                } else
                {
                    AppboyLogger.i(a, "Stopping Appboy location service.");
                    cw1 = (new Intent()).setClass(b, com/appboy/services/AppboyLocationService);
                    b.stopService(cw1);
                    k = false;
                    return;
                }
            }
        }
    }

    public final boolean a()
    {
        if (!h)
        {
            AppboyLogger.i(a, "Did not request single location update. Location collection is disabled.");
            return false;
        }
        if (!g && !f)
        {
            AppboyLogger.i(a, "Did not request single location update. Coarse or fine grained location permissions not found.");
            return false;
        }
        if (n == null)
        {
            String s = a;
            return false;
        }
        try
        {
            Object obj = a;
            obj = new Intent((new StringBuilder()).append(c).append(".SINGLE_APPBOY_LOCATION_UPDATE").toString());
            ((Intent) (obj)).putExtra("origin", "Appboy location manager");
            obj = PendingIntent.getBroadcast(b, 0, ((Intent) (obj)), 0x8000000);
            d.requestSingleUpdate(n, ((PendingIntent) (obj)));
        }
        catch (Exception exception)
        {
            AppboyLogger.w(a, "Failed to request single location update due to exception.", exception);
            return false;
        }
        return true;
    }

    public final boolean a(df df)
    {
        try
        {
            df = cz.a(df);
            e.a(df);
        }
        // Misplaced declaration of an exception variable
        catch (df df)
        {
            AppboyLogger.w(a, "Failed to log location recorded event.", df);
            return false;
        }
        return true;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/bv.getName()
        });
    }
}
