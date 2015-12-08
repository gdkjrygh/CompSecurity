// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import com.fitbit.data.domain.Profile;

// Referenced classes of package com.fitbit.settings.ui:
//            HeartRateCustomZoneActivity

final class a
{

    final HeartRateCustomZoneActivity a;
    private boolean b;
    private int c;
    private int d;

    public void a(int i)
    {
        c = i;
    }

    public void a(Profile profile)
    {
        if (profile != null)
        {
            b = profile.C();
            c = profile.B();
            d = profile.z();
        }
    }

    public void a(ZoneSaveModel zonesavemodel)
    {
        if (zonesavemodel != null)
        {
            b = zonesavemodel.enabledCustomZone;
            c = zonesavemodel.upperLimit;
            d = zonesavemodel.lowerLimit;
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public void b(int i)
    {
        d = i;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        while (b && (c == 0 || c < 30 || c > 220 || c - d < 1)) 
        {
            return 0x7f080183;
        }
        return 0;
    }

    public int e()
    {
        while (b && (d == 0 || d < 30 || d > 220 || c - d < 1)) 
        {
            return 0x7f080183;
        }
        return 0;
    }

    ZoneSaveModel(HeartRateCustomZoneActivity heartratecustomzoneactivity)
    {
        a = heartratecustomzoneactivity;
        super();
    }
}
