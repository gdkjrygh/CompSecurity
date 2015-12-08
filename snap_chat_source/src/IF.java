// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public final class IF
{

    private static final double DEFAULT_BUCKET_ACCURACY = 10D;
    private static final NumberFormat mNumberFormatter = new DecimalFormat("###,###,###");

    public static String a(double d, Locale locale, int i)
    {
        locale = NumberFormat.getCurrencyInstance(locale);
        locale.setMinimumFractionDigits(i);
        locale.setGroupingUsed(true);
        return locale.format(d);
    }

    public static String a(int i)
    {
        String s;
        if (i >= 0)
        {
            s = "";
        } else
        {
            s = "-";
            i = -i;
        }
        if (i < 1000)
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
        int j = (int)(Math.log(i) / Math.log(1000D));
        float f = (float)((double)i / Math.pow(1000D, j));
        if (f < 100F)
        {
            return String.format("%s%.1f%c", new Object[] {
                s, Float.valueOf(f), Character.valueOf("kMB".charAt(j - 1))
            });
        } else
        {
            return String.format("%s%d%c", new Object[] {
                s, Integer.valueOf((int)f), Character.valueOf("kMB".charAt(j - 1))
            });
        }
    }

    public static String a(long l)
    {
        double d1 = Jk.a(l, 1);
        double d = Math.exp(Math.floor(Math.log(d1) * 10D) / 10D);
        d1 = Math.exp(Math.ceil(Math.log(d1) * 10D) / 10D);
        return String.format(Locale.US, "%4.3f-%4.3f s", new Object[] {
            Double.valueOf(d), Double.valueOf(d1)
        });
    }

    public static String b(int i)
    {
        return mNumberFormatter.format(i);
    }

    public static String b(long l)
    {
        double d = (double)l / 1000D;
        if (d > 11000D)
        {
            return String.format("%d+ s", new Object[] {
                Integer.valueOf(11000)
            });
        }
        if (d < 1000D)
        {
            return String.format("0-%d s", new Object[] {
                Integer.valueOf(1000)
            });
        } else
        {
            int i = (int)(d / 1000D) + 1;
            return String.format("%d-%d s", new Object[] {
                Integer.valueOf((i - 1) * 1000), Integer.valueOf(i * 1000)
            });
        }
    }

}
