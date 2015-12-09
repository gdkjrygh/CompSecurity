// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.content.Context;
import android.text.SpannedString;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.heartrate.HeartRate;
import com.fitbit.util.al;
import com.fitbit.util.bl;
import com.fitbit.water.Water;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.util.format:
//            e

public class f
{

    public f()
    {
    }

    public static String a(Context context, double d)
    {
        Object obj;
        String s;
        s = com.fitbit.util.format.e.a(d);
        obj = null;
        a a1 = FitBitApplication.a().e();
        if (a1 != null)
        {
            try
            {
                obj = a1.a(0x7f0b0003, s, al.j());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = context.getString(0x7f0802be);
            }
        }
        return String.format(context.getString(0x7f080218), new Object[] {
            s, obj
        });
    }

    public static String a(Context context, double d, String s, String s1)
    {
        boolean flag;
        if (Math.abs(d - 1.0D) < 0.0001D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (s == null)
            {
                s = context.getString(0x7f080426);
            }
        } else
        {
            if (s1 == null)
            {
                s1 = context.getString(0x7f080426);
            }
            s = s1;
        }
        return String.format(context.getString(0x7f08021f), new Object[] {
            com.fitbit.util.format.e.a(d, 2), s
        });
    }

    public static String a(Context context, HeartRate heartrate)
    {
        return String.format(context.getString(0x7f080607), new Object[] {
            e.e(heartrate.b()), ((com.fitbit.heartrate.HeartRate.HeartRateUnits)heartrate.a()).getShortDisplayName()
        });
    }

    public static String a(Context context, Water water)
    {
        water = e.b(water.b());
        return String.format(context.getString(0x7f080225), new Object[] {
            water
        });
    }

    public static String a(Context context, Fat fat)
    {
        return String.format(context.getString(0x7f080215), new Object[] {
            com.fitbit.util.format.e.a(fat.b()), ((com.fitbit.weight.Fat.FatUnits)fat.a()).getShortDisplayName()
        });
    }

    public static String a(Context context, Weight weight)
    {
        if (weight.a() == com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE)
        {
            int i = (int)weight.b();
            double d = (weight.b() - (double)i) * (double)((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).getChildrenCount();
            if (i >= 1)
            {
                return String.format(context.getString(0x7f08022a), new Object[] {
                    e.e(i), com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE.getShortDisplayName(), com.fitbit.util.format.e.a(d), com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS.getShortDisplayName()
                });
            } else
            {
                return String.format(context.getString(0x7f08022b), new Object[] {
                    com.fitbit.util.format.e.a(d), com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS.getShortDisplayName()
                });
            }
        } else
        {
            return String.format(context.getString(0x7f08022b), new Object[] {
                com.fitbit.util.format.e.a(weight.f()), ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).getShortDisplayName()
            });
        }
    }

    public static CharSequence b(Context context, Weight weight)
    {
        if (weight.a() == com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE)
        {
            int i = (int)weight.b();
            double d = weight.b();
            double d1 = i;
            double d2 = ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).getChildrenCount();
            weight = new bl();
            weight.a(context, com.fitbit.util.format.e.a((d - d1) * d2));
            bl bl1 = new bl();
            bl1.c(context, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS.getShortDisplayName());
            if (i >= 1)
            {
                bl bl3 = new bl();
                bl3.a(context, e.e(i));
                bl bl5 = new bl();
                bl5.c(context, com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE.getShortDisplayName());
                return bl.a(bl.a(bl.a(bl.a(new SpannedString(context.getString(0x7f08022a)), 1, bl3), 2, bl5), 3, weight), 4, bl1);
            } else
            {
                return bl.a(bl.a(new SpannedString(context.getString(0x7f08022b)), 1, weight), 2, bl1);
            }
        } else
        {
            bl bl2 = new bl();
            bl2.a(context, com.fitbit.util.format.e.a(weight.b()));
            bl bl4 = new bl();
            bl4.c(context, ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).getShortDisplayName());
            return bl.a(bl.a(new SpannedString(context.getString(0x7f08022b)), 1, bl2), 2, bl4);
        }
    }

    public static String b(Context context, double d)
    {
        return String.format(context.getString(0x7f0804d4), new Object[] {
            e.e(d)
        });
    }

    public static String b(Context context, Water water)
    {
        String s = e.b(water.b());
        return String.format(context.getString(0x7f080224), new Object[] {
            ((com.fitbit.data.domain.WaterLogEntry.WaterUnits)water.a()).getQuantityDisplayName(s)
        });
    }

    public static String c(Context context, Water water)
    {
        String s = com.fitbit.util.format.e.a(water.b());
        int i;
        if (water.a() == com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML)
        {
            i = 0x7f080227;
        } else
        {
            i = 0x7f080226;
        }
        return String.format(context.getString(i), new Object[] {
            s, ((com.fitbit.data.domain.WaterLogEntry.WaterUnits)water.a()).getQuantityDisplayName(s)
        });
    }
}
