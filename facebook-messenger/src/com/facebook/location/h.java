// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Location;
import android.location.LocationManager;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.g;
import com.google.common.base.Objects;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.location:
//            GetDeviceLocationParams, j, r

public class h
{

    private static final Class a = com/facebook/location/h;
    private final LocationManager b;
    private final r c;
    private final ScheduledExecutorService d;
    private final a e;

    public h(LocationManager locationmanager, r r, ScheduledExecutorService scheduledexecutorservice, a a1)
    {
        b = locationmanager;
        c = r;
        d = scheduledexecutorservice;
        e = a1;
    }

    static LocationManager a(h h1)
    {
        return h1.b;
    }

    static Class a()
    {
        return a;
    }

    private String a(Location location)
    {
        if (location == null)
        {
            return null;
        } else
        {
            return Objects.toStringHelper(location).add("accuracy", (new StringBuilder()).append(location.getAccuracy()).append(" m").toString()).add("age", (new StringBuilder()).append(b(location) / 1000L).append(" ms").toString()).toString();
        }
    }

    static String a(h h1, Location location)
    {
        return h1.a(location);
    }

    private boolean a(String s, String s1)
    {
        return Objects.equal(s, s1);
    }

    private long b(Location location)
    {
        return e.a() - location.getTime();
    }

    static long b(h h1, Location location)
    {
        return h1.b(location);
    }

    static ScheduledExecutorService b(h h1)
    {
        return h1.d;
    }

    static r c(h h1)
    {
        return h1.c;
    }

    public j a(GetDeviceLocationParams getdevicelocationparams, g g)
    {
        com.facebook.debug.log.b.b(a, "Getting location. Target age: %d ms, Target accuracy: %f m, Timeout: %d ms", new Object[] {
            Long.valueOf(getdevicelocationparams.f), Float.valueOf(getdevicelocationparams.g), Long.valueOf(getdevicelocationparams.a)
        });
        return new j(this, getdevicelocationparams, g);
    }

    boolean a(Location location, Location location1, GetDeviceLocationParams getdevicelocationparams)
    {
        boolean flag7 = true;
        if (location != null) goto _L2; else goto _L1
_L1:
        boolean flag6 = false;
_L4:
        return flag6;
_L2:
        flag6 = flag7;
        if (location1 == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        long l = location.getTime() - location1.getTime();
        boolean flag1;
        boolean flag3;
        if (l > getdevicelocationparams.h)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l < -getdevicelocationparams.h)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag6 = flag7;
        if (flag1) goto _L4; else goto _L5
_L5:
        if (flag3)
        {
            return false;
        }
        float f = location.getAccuracy() - location1.getAccuracy();
        boolean flag2;
        boolean flag4;
        boolean flag5;
        boolean flag8;
        if (f > 0.0F)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (f < 0.0F)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (f > getdevicelocationparams.i)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        flag8 = a(location.getProvider(), location1.getProvider());
        flag6 = flag7;
        if (flag4) goto _L4; else goto _L6
_L6:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag6 = flag7;
        if (!flag2) goto _L4; else goto _L7
_L7:
        if (!flag || flag5)
        {
            break; /* Loop/switch isn't completed */
        }
        flag6 = flag7;
        if (flag8) goto _L4; else goto _L8
_L8:
        return false;
    }

}
