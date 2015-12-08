// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.devicecollector.DataCollection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.devicecollector.collectors:
//            AbstractAsyncCollectorTask, CollectorEnum, SoftErrorCode, CollectorStatusListener

public class LocationCollectorTask extends AbstractAsyncCollectorTask
    implements LocationListener
{

    boolean h;
    private LocationManager i;
    private Location j;
    private Date k;

    public LocationCollectorTask(Activity activity, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, long l)
    {
        super(activity, collectorstatuslistener, datacollection, CollectorEnum.e, l);
        k = new Date();
        i = (LocationManager)activity.getApplicationContext().getSystemService("location");
    }

    private void a(String s)
    {
        i.requestSingleUpdate(s, this, null);
    }

    private boolean a(Location location, Location location1)
    {
        if (location1 != null)
        {
            long l1 = location.getTime() - location1.getTime();
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (l1 > 0x36ee80L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (l1 < 0x36ee80L)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (l1 > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag1)
            {
                if (flag2)
                {
                    return false;
                }
                int l = (int)(location.getAccuracy() - location1.getAccuracy());
                boolean flag3;
                boolean flag4;
                if (l > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (l < 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (l > 200)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                flag4 = a(location.getProvider(), location1.getProvider());
                if (!flag2 && (!flag || flag1) && (!flag || flag3 || !flag4))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    private void b(String s)
    {
        i.requestLocationUpdates(s, 1000L, 1.0F, this);
    }

    private void g()
    {
        if (j == null) goto _L2; else goto _L1
_L1:
        long l = (j.getTime() - k.getTime()) / 1000L;
        a((new StringBuilder()).append("Time it took:").append(l).toString(), new Object[0]);
        b.a(com.devicecollector.DataCollection.PostElement.a, (new StringBuilder()).append("").append(j.getLatitude()).toString());
        b.a(com.devicecollector.DataCollection.PostElement.b, (new StringBuilder()).append("").append(j.getLongitude()).toString());
        b.a(com.devicecollector.DataCollection.PostElement.c, (new StringBuilder()).append("").append(j.getTime() / 1000L).toString());
        b.a(com.devicecollector.DataCollection.PostElement.d, (new StringBuilder()).append("").append(j.getProvider()).toString());
        h = true;
_L4:
        g = true;
        h();
        a(e, f);
        return;
_L2:
        a("No Location found.", new Object[0]);
        if (e == null)
        {
            e = SoftErrorCode.d;
            f = new RuntimeException("No location found");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void h()
    {
        if (i != null)
        {
            i.removeUpdates(this);
        }
    }

    protected void a()
    {
        Object obj1;
        h = false;
        Object obj = null;
        String s;
        String s1;
        Iterator iterator;
        try
        {
            a("Getting providers", new Object[0]);
            obj1 = i.getProviders(true);
            if (((List) (obj1)).size() == 0)
            {
                a(SoftErrorCode.d, ((Exception) (new RuntimeException(SoftErrorCode.d.name()))));
                return;
            }
        }
        catch (SecurityException securityexception)
        {
            a(securityexception.getMessage(), new Object[0]);
            e = SoftErrorCode.c;
            f = securityexception;
            return;
        }
        iterator = ((List) (obj1)).iterator();
_L13:
        obj1 = obj;
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s1 = (String)iterator.next();
        s = ((String) (obj));
        if (isCancelled()) goto _L4; else goto _L3
_L3:
        a((new StringBuilder()).append("Trying provider [").append(s1).append("]").toString(), new Object[0]);
        obj1 = obj;
        if (obj == null)
        {
            obj1 = s1;
        }
        obj = i.getLastKnownLocation("network");
        s = ((String) (obj1));
        if (obj == null) goto _L4; else goto _L5
_L5:
        s = ((String) (obj1));
        if (k.getTime() - ((Location) (obj)).getTime() >= 0x36ee80L) goto _L4; else goto _L6
_L6:
        a((new StringBuilder()).append("New enough, using this location: ").append(((Location) (obj)).getProvider()).toString(), new Object[0]);
        if (!a(((Location) (obj)), j)) goto _L2; else goto _L7
_L7:
        a((new StringBuilder()).append(((Location) (obj)).getProvider()).append(" is better location").toString(), new Object[0]);
        j = ((Location) (obj));
        h = true;
        obj1 = s1;
_L2:
        if (isCancelled() || e != null)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        if (h && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        a("making a single request", new Object[0]);
        this;
        JVM INSTR monitorenter ;
        Looper.prepare();
        if (android.os.Build.VERSION.SDK_INT <= 8) goto _L9; else goto _L8
_L8:
        a(((String) (obj1)));
_L10:
        if (!g && !isCancelled())
        {
            a("Waiting on location... for [%s] milliseconds", new Object[] {
                (new StringBuilder()).append("").append(f()).toString()
            });
            wait(f());
            a("Done Waiting on location.", new Object[0]);
            if (!h)
            {
                h();
                e();
            }
        }
_L11:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        obj = s;
        continue; /* Loop/switch isn't completed */
_L9:
        b(((String) (obj1)));
          goto _L10
        Exception exception;
        exception;
        a((new StringBuilder()).append("Got exception(hiding it):").append(exception.getMessage()).toString(), new Object[0]);
          goto _L11
        g();
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected void finalize()
    {
        super.finalize();
        h();
    }

    public void onLocationChanged(Location location)
    {
        if (a(location, j))
        {
            j = location;
        }
        g();
    }

    public void onProviderDisabled(String s)
    {
        g();
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int l, Bundle bundle)
    {
        if (l == 0 || l == 1)
        {
            g();
        }
    }
}
