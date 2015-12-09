// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.savedstate.u;
import com.fitbit.util.al;
import com.fitbit.util.bs;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.domain:
//            Profile, UnitSystem

public class r
{

    public r()
    {
    }

    public static WeightLogEntry.WeightUnits a()
    {
        Profile profile = an.a().b();
        if (profile != null && profile.w() != null)
        {
            return profile.w();
        } else
        {
            return (WeightLogEntry.WeightUnits)w.a(al.d().a("weight"), com/fitbit/data/domain/WeightLogEntry$WeightUnits);
        }
    }

    public static void a(Context context, Length.LengthUnits lengthunits)
    {
        if (lengthunits != Length.LengthUnits.MILES && lengthunits != Length.LengthUnits.KM)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(lengthunits).append(" are not supported").toString());
        }
        if (lengthunits == Length.LengthUnits.MILES)
        {
            b(context, Length.LengthUnits.FEET);
            return;
        } else
        {
            b(context, Length.LengthUnits.CM);
            return;
        }
    }

    public static void a(Context context, WeightLogEntry.WeightUnits weightunits)
    {
        Profile profile = an.a().b();
        if (profile == null)
        {
            return;
        } else
        {
            profile.a(weightunits);
            an.a().a(profile, context);
            return;
        }
    }

    public static void a(WaterLogEntry.WaterUnits waterunits)
    {
        Profile profile = an.a().b();
        if (profile != null)
        {
            if (UnitSystem.getByWaterUnit(waterunits) != UnitSystem.getByWaterUnit(profile.x()))
            {
                profile.a(waterunits);
                an.a().a(profile, FitBitApplication.a());
            }
            if (waterunits != WaterLogEntry.WaterUnits.ML)
            {
                u.a(waterunits);
                return;
            }
        }
    }

    public static Length.LengthUnits b()
    {
        Profile profile = an.a().b();
        if (profile != null && profile.t() != null)
        {
            return profile.t();
        } else
        {
            return (Length.LengthUnits)w.a(al.d().a("distance"), com/fitbit/data/domain/Length$LengthUnits);
        }
    }

    public static void b(Context context, Length.LengthUnits lengthunits)
    {
        Profile profile = an.a().b();
        if (profile == null)
        {
            return;
        } else
        {
            profile.b(lengthunits);
            an.a().a(profile, context);
            return;
        }
    }

    public static Length.LengthUnits c()
    {
        Profile profile = an.a().b();
        if (profile != null && profile.v() != null)
        {
            if (profile.v() == Length.LengthUnits.FEET)
            {
                return Length.LengthUnits.MILES;
            } else
            {
                return Length.LengthUnits.KM;
            }
        } else
        {
            return (Length.LengthUnits)w.a(al.d().a("distance"), com/fitbit/data/domain/Length$LengthUnits);
        }
    }

    public static Length.LengthUnits d()
    {
        Profile profile = an.a().b();
        if (profile != null && profile.v() != null)
        {
            return profile.v();
        } else
        {
            return (Length.LengthUnits)w.a(al.d().a("height"), com/fitbit/data/domain/Length$LengthUnits);
        }
    }

    public static WaterLogEntry.WaterUnits e()
    {
        Object obj;
label0:
        {
            obj = an.a().b();
            if (obj != null)
            {
                obj = ((Profile) (obj)).x();
                if (obj != null)
                {
                    if (obj != WaterLogEntry.WaterUnits.ML)
                    {
                        WaterLogEntry.WaterUnits waterunits = u.g();
                        if (waterunits != null)
                        {
                            return waterunits;
                        }
                    }
                    break label0;
                }
            }
            return (WaterLogEntry.WaterUnits)w.a(al.d().a("liquids"), com/fitbit/data/domain/WaterLogEntry$WaterUnits);
        }
        return ((WaterLogEntry.WaterUnits) (obj));
    }
}
