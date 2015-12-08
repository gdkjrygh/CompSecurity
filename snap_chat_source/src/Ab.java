// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationServices;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Ab
{

    private static Ab c;
    private static boolean d = false;
    private static Context e;
    private static HandlerThread f;
    private static Looper g;
    final List a;
    final zY b;
    private final zX h;

    private Ab(LocationManager locationmanager, zX zx, zY zy)
    {
        this(zx, ((List) (a(locationmanager))), zy);
    }

    private Ab(zX zx, List list, zY zy)
    {
        a = list;
        h = zx;
        b = zy;
    }

    public static Ab a()
    {
        Ab;
        JVM INSTR monitorenter ;
        if (!d)
        {
            throw new IllegalStateException("Location manager has not been initialized");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        Ab;
        JVM INSTR monitorexit ;
        throw exception;
        Ab ab;
        if (c == null)
        {
            c = new Ab((LocationManager)e.getSystemService("location"), new zX(e), zY.a());
        }
        ab = c;
        Ab;
        JVM INSTR monitorexit ;
        return ab;
    }

    private static ArrayList a(LocationManager locationmanager)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList(3);
        i = 0;
_L2:
        String s;
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        s = (new String[] {
            "network", "gps"
        })[i];
        if (locationmanager.getProvider(s) != null)
        {
            arraylist.add(new zZ(s, locationmanager, g));
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        try
        {
            Timber.g("LocationProvider", ((IllegalArgumentException) (obj)).getMessage(), new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (LocationManager locationmanager)
        {
            Timber.g("LocationProvider", locationmanager.getMessage(), new Object[0]);
            return arraylist;
        }
          goto _L3
        obj;
        Timber.g("LocationProvider", ((SecurityException) (obj)).getMessage(), new Object[0]);
          goto _L3
_L1:
        locationmanager = new zZ("passive", locationmanager, g);
        PG.b(new zZ._cls1(locationmanager));
        arraylist.add(locationmanager);
        return arraylist;
    }

    public static void a(Context context)
    {
        Ab;
        JVM INSTR monitorenter ;
        if (!d)
        {
            d = true;
            e = context;
            context = new HandlerThread("Location", 10);
            f = context;
            context.start();
            g = f.getLooper();
        }
        Ab;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public final void b()
    {
        PG.b(new Runnable() {

            private Ab a;

            public final void run()
            {
                Object obj = a;
                PG.b();
                Timber.g("LocationProvider", "Start tracking!", new Object[0]);
                for (Iterator iterator = ((Ab) (obj)).a.iterator(); iterator.hasNext(); ((zZ)iterator.next()).b()) { }
                obj = ((Ab) (obj)).b;
                PG.b();
                if (((zY) (obj)).c == zY.a)
                {
                    obj.c = System.currentTimeMillis();
                }
            }

            
            {
                a = Ab.this;
                super();
            }
        });
    }

    public final void c()
    {
        PG.b(new Runnable() {

            private Ab a;

            public final void run()
            {
                Iterator iterator;
                Ab ab = a;
                PG.b();
                Timber.g("LocationProvider", "Stop tracking!", new Object[0]);
                iterator = ab.a.iterator();
_L3:
                Object obj1;
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_165;
                }
                obj1 = (zZ)iterator.next();
                PG.b();
                obj1.e = false;
                Object obj = ((zZ) (obj1)).c;
                obj;
                JVM INSTR monitorenter ;
                boolean flag;
                if (!((zZ) (obj1)).d)
                {
                    break MISSING_BLOCK_LABEL_99;
                }
                flag = ((zZ) (obj1)).a.equals("passive");
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_99;
                }
                ((zZ) (obj1)).b.removeUpdates(((android.location.LocationListener) (obj1)));
                obj1.d = false;
_L1:
                obj;
                JVM INSTR monitorexit ;
                continue; /* Loop/switch isn't completed */
                obj1;
                obj;
                JVM INSTR monitorexit ;
                throw obj1;
                Object obj2;
                obj2;
                Timber.g("LocationListener", ((IllegalArgumentException) (obj2)).getMessage(), new Object[0]);
                obj1.d = false;
                  goto _L1
                obj2;
                Timber.g("LocationListener", ((Exception) (obj2)).getMessage(), new Object[0]);
                obj1.d = false;
                  goto _L1
                Exception exception;
                exception;
                obj1.d = false;
                throw exception;
                return;
                if (true) goto _L3; else goto _L2
_L2:
            }

            
            {
                a = Ab.this;
                super();
            }
        });
    }

    public final Location d()
    {
        Object obj;
        PG.b();
        obj = h;
        PG.b();
        if (!((zX) (obj)).a.isConnected())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        obj = ((zX) (obj)).a;
        obj = LocationServices.FusedLocationApi.getLastLocation(((GoogleApiClient) (obj)));
        if (obj == null || System.currentTimeMillis() - ((Location) (obj)).getTime() >= 60000L)
        {
            break MISSING_BLOCK_LABEL_184;
        }
_L1:
        Object obj2 = new StringBuilder("Location from device is ");
        Object obj1;
        if (obj == null)
        {
            obj1 = "Null";
        } else
        {
            obj1 = ((Location) (obj)).toString();
        }
        Timber.g("LocationProvider", ((StringBuilder) (obj2)).append(((String) (obj1))).toString(), new Object[0]);
        obj2 = a.iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            obj1 = ((zZ)((Iterator) (obj2)).next()).a();
            if (obj == null || obj1 != null && ((Location) (obj1)).getAccuracy() < ((Location) (obj)).getAccuracy())
            {
                StringBuilder stringbuilder = new StringBuilder("Location has been updated to ");
                if (obj1 == null)
                {
                    obj = "Null";
                } else
                {
                    obj = ((Location) (obj1)).toString();
                }
                Timber.g("LocationProvider", stringbuilder.append(((String) (obj))).toString(), new Object[0]);
                obj = obj1;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_205;
        obj = null;
          goto _L1
        return ((Location) (obj));
    }

}
