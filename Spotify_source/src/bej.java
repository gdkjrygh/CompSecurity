// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bej
{

    public static final int a;
    public static final String b;
    public static final String c;
    private static final Pattern d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    private static final Pattern e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    public static int a(int i)
    {
        return ((i + 0x10000) - 1) / 0x10000;
    }

    public static int a(long al[], long l)
    {
        int j = Arrays.binarySearch(al, l);
        int i = j;
        if (j < 0)
        {
            i = -(j + 2);
        }
        return Math.max(0, i);
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

    public static bde a(bde bde1, int i)
    {
        long l = -1L;
        if (i == 0)
        {
            return bde1;
        }
        if (bde1.d != -1L)
        {
            l = bde1.d - (long)i;
        }
        return new bde(bde1.a, bde1.c + (long)i, l, bde1.e, bde1.f);
    }

    public static ExecutorService a(String s)
    {
        return Executors.newSingleThreadExecutor(new ThreadFactory(s) {

            private String a;

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, a);
            }

            
            {
                a = s;
                super();
            }
        });
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

    public static int[] a(List list)
    {
        int j = list.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return ai;
    }

    public static long b(String s)
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

    public static long c(String s)
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
                i = -i;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int d(String s)
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
        bds.a(flag);
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
}
