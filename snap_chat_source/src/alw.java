// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public abstract class alw
    implements Serializable
{

    public static final alw a;
    public static anC b;
    private static anD d;
    private static Set e;
    private static volatile alw f;
    private static anm g;
    private static Map h;
    private static Map i;
    public final String c;

    public alw(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id must not be null");
        } else
        {
            c = s;
            return;
        }
    }

    public static alw a()
    {
        Object obj = f;
        if (obj != null) goto _L2; else goto _L1
_L1:
        alw;
        JVM INSTR monitorenter ;
        Object obj1 = f;
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        alw alw1;
        alw1 = null;
        obj1 = null;
        obj = alw1;
        String s = System.getProperty("user.timezone");
        obj = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = alw1;
        alw1 = a(s);
        obj = alw1;
_L5:
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = a(TimeZone.getDefault());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj;
            }
            finally { }
        }
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        obj = a;
        f = ((alw) (obj));
_L4:
        alw;
        JVM INSTR monitorexit ;
        return ((alw) (obj));
        alw;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj = obj1;
        if (true) goto _L5; else goto _L2
_L2:
        return ((alw) (obj));
    }

    public static alw a(int j)
    {
        if (j < 0xfad9a401 || j > 0x5265bff)
        {
            throw new IllegalArgumentException((new StringBuilder("Millis out of range: ")).append(j).toString());
        } else
        {
            return a(b(j), j);
        }
    }

    public static alw a(String s)
    {
        alw alw1;
        if (s == null)
        {
            alw1 = a();
        } else
        {
            if (s.equals("UTC"))
            {
                return a;
            }
            alw alw2 = d.a(s);
            alw1 = alw2;
            if (alw2 == null)
            {
                if (s.startsWith("+") || s.startsWith("-"))
                {
                    int j = c(s);
                    if ((long)j == 0L)
                    {
                        return a;
                    } else
                    {
                        return a(b(j), j);
                    }
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("The datetime zone id '")).append(s).append("' is not recognised").toString());
                }
            }
        }
        return alw1;
    }

    private static alw a(String s, int j)
    {
        alw;
        JVM INSTR monitorenter ;
        if (j != 0) goto _L2; else goto _L1
_L1:
        Object obj = a;
_L4:
        alw;
        JVM INSTR monitorexit ;
        return ((alw) (obj));
_L2:
        if (h == null)
        {
            h = new HashMap();
        }
        obj = (Reference)h.get(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        alw alw1 = (alw)((Reference) (obj)).get();
        obj = alw1;
        if (alw1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new anB(s, null, j, j);
        h.put(s, new SoftReference(obj));
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public static alw a(TimeZone timezone)
    {
        alw alw2;
        if (timezone == null)
        {
            alw2 = a();
        } else
        {
            String s = timezone.getID();
            if (s.equals("UTC"))
            {
                return a;
            }
            alw2 = null;
            String s1 = b(s);
            if (s1 != null)
            {
                alw2 = d.a(s1);
            }
            alw alw1 = alw2;
            if (alw2 == null)
            {
                alw1 = d.a(s);
            }
            alw2 = alw1;
            if (alw1 == null)
            {
                if (s1 == null)
                {
                    timezone = timezone.getID();
                    if (timezone.startsWith("GMT+") || timezone.startsWith("GMT-"))
                    {
                        int j = c(timezone.substring(3));
                        if ((long)j == 0L)
                        {
                            return a;
                        } else
                        {
                            return a(b(j), j);
                        }
                    }
                }
                throw new IllegalArgumentException((new StringBuilder("The datetime zone id '")).append(s).append("' is not recognised").toString());
            }
        }
        return alw2;
    }

    public static String b(int j)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int k;
        if (j >= 0)
        {
            stringbuffer.append('+');
        } else
        {
            stringbuffer.append('-');
            j = -j;
        }
        k = j / 0x36ee80;
        anr.a(stringbuffer, k, 2);
        j -= k * 0x36ee80;
        k = j / 60000;
        stringbuffer.append(':');
        anr.a(stringbuffer, k, 2);
        j -= k * 60000;
        if (j == 0)
        {
            return stringbuffer.toString();
        }
        k = j / 1000;
        stringbuffer.append(':');
        anr.a(stringbuffer, k, 2);
        j -= k * 1000;
        if (j == 0)
        {
            return stringbuffer.toString();
        } else
        {
            stringbuffer.append('.');
            anr.a(stringbuffer, j, 3);
            return stringbuffer.toString();
        }
    }

    private static String b(String s)
    {
        alw;
        JVM INSTR monitorenter ;
        Map map = i;
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        obj = new HashMap();
        ((Map) (obj)).put("GMT", "UTC");
        ((Map) (obj)).put("WET", "WET");
        ((Map) (obj)).put("CET", "CET");
        ((Map) (obj)).put("MET", "CET");
        ((Map) (obj)).put("ECT", "CET");
        ((Map) (obj)).put("EET", "EET");
        ((Map) (obj)).put("MIT", "Pacific/Apia");
        ((Map) (obj)).put("HST", "Pacific/Honolulu");
        ((Map) (obj)).put("AST", "America/Anchorage");
        ((Map) (obj)).put("PST", "America/Los_Angeles");
        ((Map) (obj)).put("MST", "America/Denver");
        ((Map) (obj)).put("PNT", "America/Phoenix");
        ((Map) (obj)).put("CST", "America/Chicago");
        ((Map) (obj)).put("EST", "America/New_York");
        ((Map) (obj)).put("IET", "America/Indiana/Indianapolis");
        ((Map) (obj)).put("PRT", "America/Puerto_Rico");
        ((Map) (obj)).put("CNT", "America/St_Johns");
        ((Map) (obj)).put("AGT", "America/Argentina/Buenos_Aires");
        ((Map) (obj)).put("BET", "America/Sao_Paulo");
        ((Map) (obj)).put("ART", "Africa/Cairo");
        ((Map) (obj)).put("CAT", "Africa/Harare");
        ((Map) (obj)).put("EAT", "Africa/Addis_Ababa");
        ((Map) (obj)).put("NET", "Asia/Yerevan");
        ((Map) (obj)).put("PLT", "Asia/Karachi");
        ((Map) (obj)).put("IST", "Asia/Kolkata");
        ((Map) (obj)).put("BST", "Asia/Dhaka");
        ((Map) (obj)).put("VST", "Asia/Ho_Chi_Minh");
        ((Map) (obj)).put("CTT", "Asia/Shanghai");
        ((Map) (obj)).put("JST", "Asia/Tokyo");
        ((Map) (obj)).put("ACT", "Australia/Darwin");
        ((Map) (obj)).put("AET", "Australia/Sydney");
        ((Map) (obj)).put("SST", "Pacific/Guadalcanal");
        ((Map) (obj)).put("NST", "Pacific/Auckland");
        i = ((Map) (obj));
        s = (String)((Map) (obj)).get(s);
        alw;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static Set b()
    {
        return e;
    }

    private static int c(String s)
    {
        ama ama = new ama() {

            public final alr a(alw alw1)
            {
                return this;
            }

            public final alw a()
            {
                return null;
            }

            public final alr b()
            {
                return this;
            }

            public final String toString()
            {
                return getClass().getName();
            }

        };
        return -(int)f().a(ama).a(s);
    }

    private static anD d()
    {
        Object obj1 = null;
        String s = System.getProperty("org.joda.time.DateTimeZone.Provider");
        Object obj;
        obj = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj = (anD)Class.forName(s).newInstance();
_L1:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj1 = new anF("org/joda/time/tz/data");
        obj = obj1;
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new anE();
        }
        return ((anD) (obj1));
        obj;
        Thread thread = Thread.currentThread();
        thread.getThreadGroup().uncaughtException(thread, ((Throwable) (obj)));
        obj = obj1;
          goto _L1
        SecurityException securityexception;
        securityexception;
        securityexception = ((SecurityException) (obj1));
          goto _L1
        Exception exception;
        exception;
        Thread thread1 = Thread.currentThread();
        thread1.getThreadGroup().uncaughtException(thread1, exception);
          goto _L2
    }

    private static anC e()
    {
        Object obj = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (anC)Class.forName(((String) (obj))).newInstance();
_L4:
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = new anA();
        }
        return ((anC) (obj1));
        obj;
        Thread thread = Thread.currentThread();
        thread.getThreadGroup().uncaughtException(thread, ((Throwable) (obj)));
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
        SecurityException securityexception;
        securityexception;
        securityexception = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static anm f()
    {
        alw;
        JVM INSTR monitorenter ;
        anm anm1;
        if (g == null)
        {
            g = (new ann()).a(null, true, 4).a();
        }
        anm1 = g;
        alw;
        JVM INSTR monitorexit ;
        return anm1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long a(long l, long l1)
    {
        int j = b(l1);
        l1 = l - (long)j;
        if (b(l1) == j)
        {
            return l1;
        } else
        {
            return e(l);
        }
    }

    public final long a(alw alw1, long l)
    {
        alw alw2 = alw1;
        if (alw1 == null)
        {
            alw2 = a();
        }
        if (alw2 == this)
        {
            return l;
        } else
        {
            return alw2.a(d(l), l);
        }
    }

    public abstract String a(long l);

    public abstract int b(long l);

    public int c(long l)
    {
        int j = b(l);
        long l1 = l - (long)j;
        int k = b(l1);
        if (j != k)
        {
            if (j - k < 0 && f(l1) != f(l - (long)k))
            {
                return j;
            }
        } else
        if (j >= 0)
        {
            l = g(l1);
            if (l < l1)
            {
                int i1 = b(l);
                if (l1 - l <= (long)(i1 - j))
                {
                    return i1;
                }
            }
        }
        return k;
    }

    public abstract boolean c();

    public final long d(long l)
    {
        int j = b(l);
        long l1 = (long)j + l;
        if ((l ^ l1) < 0L && ((long)j ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return l1;
        }
    }

    public final long e(long l)
    {
        int j;
        int k;
        long l2;
        l2 = 0x7fffffffffffffffL;
        j = b(l);
        k = b(l - (long)j);
        if (j == k || j >= 0) goto _L2; else goto _L1
_L1:
        long l3 = f(l - (long)j);
        long l1 = l3;
        if (l3 == l - (long)j)
        {
            l1 = 0x7fffffffffffffffL;
        }
        l3 = f(l - (long)k);
        if (l3 != l - (long)k)
        {
            l2 = l3;
        }
        if (l1 == l2) goto _L2; else goto _L3
_L3:
        l1 = l - (long)j;
        if ((l ^ l1) < 0L && ((long)j ^ l) < 0L)
        {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        } else
        {
            return l1;
        }
_L2:
        j = k;
        if (true) goto _L3; else goto _L4
_L4:
    }

    public abstract boolean equals(Object obj);

    public abstract long f(long l);

    public abstract long g(long l);

    public int hashCode()
    {
        return c.hashCode() + 57;
    }

    public String toString()
    {
        return c;
    }

    static 
    {
        a = new anB("UTC", "UTC", 0, 0);
        anD and = d();
        Set set = and.a();
        if (set == null || set.size() == 0)
        {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!set.contains("UTC"))
        {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!a.equals(and.a("UTC")))
        {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        } else
        {
            d = and;
            e = set;
            b = e();
        }
    }
}
