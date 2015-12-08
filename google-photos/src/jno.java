// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public final class jno
{

    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;

    public static int a(int i, int j)
    {
        return ((i + j) - 1) / j;
    }

    public static int a(long l)
    {
        return (int)(l >>> 32);
    }

    public static int a(long al[], long l, boolean flag, boolean flag1)
    {
        int j = Arrays.binarySearch(al, l);
        if (j >= 0) goto _L2; else goto _L1
_L1:
        int i = -(j + 2);
_L4:
        j = i;
        if (flag1)
        {
            j = Math.max(0, i);
        }
        return j;
_L2:
        i = j;
        if (!flag)
        {
            i = j - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static long a(long l, long l1, long l2)
    {
        if (l2 >= l1 && l2 % l1 == 0L)
        {
            return l / (l2 / l1);
        }
        if (l2 < l1 && l1 % l2 == 0L)
        {
            return (l1 / l2) * l;
        } else
        {
            return (long)(((double)l1 / (double)l2) * (double)l);
        }
    }

    public static String a(Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < aobj.length; i++)
        {
            stringbuilder.append(aobj[i].getClass().getSimpleName());
            if (i < aobj.length - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.toString();
    }

    public static ExecutorService a(String s)
    {
        return Executors.newSingleThreadExecutor(new jnp(s));
    }

    public static void a(long al[], long l, long l1)
    {
        boolean flag = false;
        boolean flag1 = false;
        int i = 0;
        if (l1 >= 0xf4240L && l1 % 0xf4240L == 0L)
        {
            l = l1 / 0xf4240L;
            for (; i < al.length; i++)
            {
                al[i] = al[i] / l;
            }

        } else
        if (l1 < 0xf4240L && 0xf4240L % l1 == 0L)
        {
            l = 0xf4240L / l1;
            for (int j = ((flag) ? 1 : 0); j < al.length; j++)
            {
                al[j] = al[j] * l;
            }

        } else
        {
            double d1 = 1000000D / (double)l1;
            for (int k = ((flag1) ? 1 : 0); k < al.length; k++)
            {
                al[k] = (long)((double)al[k] * d1);
            }

        }
    }

    public static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static int b(long l)
    {
        return (int)l;
    }

    public static int b(long al[], long l, boolean flag, boolean flag1)
    {
        int j = Arrays.binarySearch(al, l);
        int i = j;
        if (j < 0)
        {
            i = ~j;
        }
        return i;
    }

    public static long b(int i, int j)
    {
        return (long)i << 32 | (long)j & 0xffffffffL;
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toLowerCase(Locale.US);
        }
    }

    public static int c(String s)
    {
        int i = 0;
        int k = s.length();
        int j;
        boolean flag;
        if (k <= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        j = 0;
        for (; i < k; i++)
        {
            j = j << 8 | s.charAt(i);
        }

        return j;
    }

    static 
    {
        a = android.os.Build.VERSION.SDK_INT;
        b = Build.DEVICE;
        c = Build.MANUFACTURER;
        d = Build.MODEL;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }
}
