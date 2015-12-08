// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.a;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package org.c.a:
//            a

public final class c
{

    public static final a a(String s, Object obj, Object obj1)
    {
        Object aobj[] = new Object[2];
        aobj[0] = obj;
        aobj[1] = obj1;
        obj = aobj[1];
        if (obj instanceof Throwable)
        {
            obj = (Throwable)obj;
        } else
        {
            obj = null;
        }
        if (s == null)
        {
            return new a(null, aobj, ((Throwable) (obj)));
        }
        obj1 = new StringBuffer(s.length() + 50);
        int j = 0;
        int i = 0;
        while (j < 2) 
        {
            int k = s.indexOf("{}", i);
            if (k == -1)
            {
                if (i == 0)
                {
                    return new a(s, aobj, ((Throwable) (obj)));
                } else
                {
                    ((StringBuffer) (obj1)).append(s.substring(i, s.length()));
                    return new a(((StringBuffer) (obj1)).toString(), aobj, ((Throwable) (obj)));
                }
            }
            boolean flag;
            if (k != 0 && s.charAt(k - 1) == '\\')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (k >= 2 && s.charAt(k - 2) == '\\')
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    j--;
                    ((StringBuffer) (obj1)).append(s.substring(i, k - 1));
                    ((StringBuffer) (obj1)).append('{');
                    i = k + 1;
                } else
                {
                    ((StringBuffer) (obj1)).append(s.substring(i, k - 1));
                    a(((StringBuffer) (obj1)), aobj[j], ((Map) (new HashMap())));
                    i = k + 2;
                }
            } else
            {
                ((StringBuffer) (obj1)).append(s.substring(i, k));
                a(((StringBuffer) (obj1)), aobj[j], ((Map) (new HashMap())));
                i = k + 2;
            }
            j++;
        }
        ((StringBuffer) (obj1)).append(s.substring(i, s.length()));
        if (j <= 0)
        {
            return new a(((StringBuffer) (obj1)).toString(), aobj, ((Throwable) (obj)));
        } else
        {
            return new a(((StringBuffer) (obj1)).toString(), aobj, null);
        }
    }

    private static void a(StringBuffer stringbuffer, Object obj, Map map)
    {
        if (obj == null)
        {
            stringbuffer.append("null");
            return;
        }
        if (!obj.getClass().isArray())
        {
            try
            {
                stringbuffer.append(obj.toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                System.err.println((new StringBuilder("SLF4J: Failed toString() invocation on an object of type [")).append(obj.getClass().getName()).append("]").toString());
            }
            map.printStackTrace();
            stringbuffer.append("[FAILED toString()]");
            return;
        }
        if (obj instanceof boolean[])
        {
            a(stringbuffer, (boolean[])obj);
            return;
        }
        if (obj instanceof byte[])
        {
            a(stringbuffer, (byte[])obj);
            return;
        }
        if (obj instanceof char[])
        {
            a(stringbuffer, (char[])obj);
            return;
        }
        if (obj instanceof short[])
        {
            a(stringbuffer, (short[])obj);
            return;
        }
        if (obj instanceof int[])
        {
            a(stringbuffer, (int[])obj);
            return;
        }
        if (obj instanceof long[])
        {
            a(stringbuffer, (long[])obj);
            return;
        }
        if (obj instanceof float[])
        {
            a(stringbuffer, (float[])obj);
            return;
        }
        if (obj instanceof double[])
        {
            a(stringbuffer, (double[])obj);
            return;
        } else
        {
            a(stringbuffer, (Object[])obj, map);
            return;
        }
    }

    private static void a(StringBuffer stringbuffer, byte abyte0[])
    {
        stringbuffer.append('[');
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(abyte0[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, char ac[])
    {
        stringbuffer.append('[');
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(ac[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, double ad[])
    {
        stringbuffer.append('[');
        int j = ad.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(ad[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, float af[])
    {
        stringbuffer.append('[');
        int j = af.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(af[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, int ai[])
    {
        stringbuffer.append('[');
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(ai[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, long al[])
    {
        stringbuffer.append('[');
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(al[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, Object aobj[], Map map)
    {
        stringbuffer.append('[');
        if (!map.containsKey(((Object) (aobj))))
        {
            map.put(((Object) (aobj)), null);
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                a(stringbuffer, aobj[i], map);
                if (i != j - 1)
                {
                    stringbuffer.append(", ");
                }
            }

            map.remove(((Object) (aobj)));
        } else
        {
            stringbuffer.append("...");
        }
        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, short aword0[])
    {
        stringbuffer.append('[');
        int j = aword0.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(aword0[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }

    private static void a(StringBuffer stringbuffer, boolean aflag[])
    {
        stringbuffer.append('[');
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(aflag[i]);
            if (i != j - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(']');
    }
}
