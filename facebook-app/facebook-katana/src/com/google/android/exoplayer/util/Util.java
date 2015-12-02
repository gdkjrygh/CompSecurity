// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.exoplayer.upstream.DataSpec;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.util:
//            Assertions

public final class Util
{

    public static final int a;
    public static final String b;
    public static final String c;
    private static final Pattern d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    private static final Pattern e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    private Util()
    {
    }

    public static int a(int i, int j)
    {
        return ((i + j) - 1) / j;
    }

    public static int a(List list, Object obj, boolean flag, boolean flag1)
    {
        int j = Collections.binarySearch(list, obj);
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

    public static long a(long l, long l1)
    {
        return ((l + l1) - 1L) / l1;
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

    public static DataSpec a(DataSpec dataspec, int i)
    {
        long l = -1L;
        if (i == 0)
        {
            return dataspec;
        }
        if (dataspec.e != -1L)
        {
            l = dataspec.e - (long)i;
        }
        return new DataSpec(dataspec.a, dataspec.d + (long)i, l, dataspec.f, dataspec.g);
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
        return Executors.newSingleThreadExecutor(new _cls1(s));
    }

    public static void a(HttpURLConnection httpurlconnection, long l)
    {
        if (a == 19 || a == 20) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        try
        {
            httpurlconnection = httpurlconnection.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            return;
        }
        if (l != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (httpurlconnection.read() == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        obj = httpurlconnection.getClass().getName();
        if (((String) (obj)).equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || ((String) (obj)).equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"))
        {
            obj = httpurlconnection.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((Method) (obj)).setAccessible(true);
            ((Method) (obj)).invoke(httpurlconnection, new Object[0]);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (l <= 2048L)
        {
            return;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void a(long al[], long l, long l1)
    {
        boolean flag = false;
        boolean flag1 = false;
        int i = 0;
        if (l1 >= l && l1 % l == 0L)
        {
            l = l1 / l;
            for (; i < al.length; i++)
            {
                al[i] = al[i] / l;
            }

        } else
        if (l1 < l && l % l1 == 0L)
        {
            l /= l1;
            for (int j = ((flag) ? 1 : 0); j < al.length; j++)
            {
                al[j] = al[j] * l;
            }

        } else
        {
            double d1 = (double)l / (double)l1;
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

    public static boolean a(Object aobj[], Object obj)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < aobj.length)
                {
                    if (!a(aobj[i], obj))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static int[] a(List list)
    {
        if (list == null)
        {
            return null;
        }
        int j = list.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return ai;
    }

    public static int b(long al[], long l, boolean flag, boolean flag1)
    {
        int j = Arrays.binarySearch(al, l);
        if (j >= 0) goto _L2; else goto _L1
_L1:
        int i = ~j;
_L4:
        j = i;
        if (flag1)
        {
            j = Math.min(al.length - 1, i);
        }
        return j;
_L2:
        i = j;
        if (!flag)
        {
            i = j + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
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

    public static long c(String s)
    {
        boolean flag = true;
        double d6 = 0.0D;
        Matcher matcher = e.matcher(s);
        if (matcher.matches())
        {
            double d1;
            double d2;
            double d3;
            double d4;
            double d5;
            long l;
            if (TextUtils.isEmpty(matcher.group(1)))
            {
                flag = false;
            }
            s = matcher.group(3);
            if (s != null)
            {
                d1 = Double.parseDouble(s) * 31556908D;
            } else
            {
                d1 = 0.0D;
            }
            s = matcher.group(5);
            if (s != null)
            {
                d2 = Double.parseDouble(s) * 2629739D;
            } else
            {
                d2 = 0.0D;
            }
            s = matcher.group(7);
            if (s != null)
            {
                d3 = Double.parseDouble(s) * 86400D;
            } else
            {
                d3 = 0.0D;
            }
            s = matcher.group(10);
            if (s != null)
            {
                d4 = Double.parseDouble(s) * 3600D;
            } else
            {
                d4 = 0.0D;
            }
            s = matcher.group(12);
            if (s != null)
            {
                d5 = Double.parseDouble(s) * 60D;
            } else
            {
                d5 = 0.0D;
            }
            s = matcher.group(14);
            if (s != null)
            {
                d6 = Double.parseDouble(s);
            }
            l = (long)((d5 + (d2 + d1 + d3 + d4) + d6) * 1000D);
            if (flag)
            {
                return -l;
            } else
            {
                return l;
            }
        } else
        {
            return (long)(Double.parseDouble(s) * 3600D * 1000D);
        }
    }

    public static long d(String s)
    {
        Matcher matcher;
        matcher = d.matcher(s);
        if (!matcher.matches())
        {
            throw new ParseException((new StringBuilder("Invalid date/time format: ")).append(s).toString(), 0);
        }
        if (matcher.group(9) != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        s = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        s.clear();
        s.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8)))
        {
            s.set(14, (new BigDecimal((new StringBuilder("0.")).append(matcher.group(8)).toString())).movePointRight(3).intValue());
        }
        long l1 = s.getTimeInMillis();
        long l = l1;
        if (i != 0)
        {
            l = l1 - (long)(60000 * i);
        }
        return l;
_L2:
        if (matcher.group(9).equalsIgnoreCase("Z"))
        {
            i = 0;
        } else
        {
            i = Integer.parseInt(matcher.group(12)) * 60 + Integer.parseInt(matcher.group(13));
            if (matcher.group(11).equals("-"))
            {
                i *= -1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int e(String s)
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
        Assertions.a(flag);
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
    }

    private class _cls1
        implements ThreadFactory
    {

        final String a;

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, a);
        }

        _cls1(String s)
        {
            a = s;
            super();
        }
    }

}
