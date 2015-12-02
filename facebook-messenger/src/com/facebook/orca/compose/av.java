// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import com.facebook.orca.prefs.az;
import com.facebook.orca.prefs.ba;

// Referenced classes of package com.facebook.orca.compose:
//            ax, ap, LocationNuxView, LocationDisabledNuxView, 
//            aw

public class av
{

    private final az a;
    private LocationNuxView b;
    private LocationDisabledNuxView c;
    private ba d;
    private ax e;
    private boolean f;
    private boolean g;
    private boolean h;
    private ap i;

    public av(az az1)
    {
        e = ax.OFF;
        i = ap.SHRUNK;
        a = az1;
    }

    static ax a(av av1)
    {
        return av1.c();
    }

    static void a(av av1, ax ax1)
    {
        av1.a(ax1);
    }

    private void a(ax ax1)
    {
        if (ax1 != e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (e != ax.LOCATION_NUX_SHOWING) goto _L4; else goto _L3
_L3:
        b.a(false);
_L6:
        e = ax1;
        if (e == ax.LOCATION_NUX_SHOWING)
        {
            b.a(true);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (e == ax.LOCATION_DISABLED_NUX_SHOWING)
        {
            c.a(false);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (e != ax.LOCATION_DISABLED_NUX_SHOWING) goto _L1; else goto _L7
_L7:
        c.a(true);
        return;
    }

    public static void a(az az1)
    {
        az1.a("dismissed_location_disabled_nux", 0);
        az1.a("send_clicked_with_location_disabled_nux", 0);
        az1.a("dismissed_location_nux", 0);
        az1.a("enabled_shared_location_in_message", 0);
        az1.a("disabled_shared_location_in_message", 0);
        az1.a("send_clicked", 0);
    }

    private ax c()
    {
        if (i == ap.SHRUNK || !h)
        {
            return ax.OFF;
        }
        if (!f && g && a.a("dismissed_location_disabled_nux") == 0 && a.a("send_clicked_with_location_disabled_nux") == 0)
        {
            return ax.LOCATION_DISABLED_NUX_SHOWING;
        }
        if (a.a("dismissed_location_nux") == 0 && a.a("send_clicked") == 0 && a.a("enabled_shared_location_in_message") == 0 && a.a("disabled_shared_location_in_message") == 0)
        {
            return ax.LOCATION_NUX_SHOWING;
        } else
        {
            return ax.OFF;
        }
    }

    public void a()
    {
        if (e == ax.LOCATION_DISABLED_NUX_SHOWING)
        {
            a.c("send_clicked_with_location_disabled_nux");
        }
    }

    public void a(LocationNuxView locationnuxview, LocationDisabledNuxView locationdisablednuxview)
    {
        b = locationnuxview;
        c = locationdisablednuxview;
        d = new aw(this);
        a.a(d);
    }

    public void a(ap ap1)
    {
        i = ap1;
        a(c());
    }

    public void a(boolean flag, boolean flag1, boolean flag2)
    {
        f = flag;
        g = flag1;
        h = flag2;
        a(c());
    }

    public void b()
    {
        a(ax.OFF);
    }
}
