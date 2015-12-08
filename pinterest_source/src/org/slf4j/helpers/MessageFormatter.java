// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package org.slf4j.helpers:
//            FormattingTuple

public final class MessageFormatter
{

    static final char DELIM_START = 123;
    static final char DELIM_STOP = 125;
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = 92;

    public MessageFormatter()
    {
    }

    public static final FormattingTuple arrayFormat(String s, Object aobj[])
    {
        int j = 0;
        Throwable throwable = getThrowableCandidate(aobj);
        if (s == null)
        {
            return new FormattingTuple(null, aobj, throwable);
        }
        if (aobj == null)
        {
            return new FormattingTuple(s);
        }
        StringBuffer stringbuffer = new StringBuffer(s.length() + 50);
        int i = 0;
        while (j < aobj.length) 
        {
            int k = s.indexOf("{}", i);
            if (k == -1)
            {
                if (i == 0)
                {
                    return new FormattingTuple(s, aobj, throwable);
                } else
                {
                    stringbuffer.append(s.substring(i, s.length()));
                    return new FormattingTuple(stringbuffer.toString(), aobj, throwable);
                }
            }
            if (isEscapedDelimeter(s, k))
            {
                if (!isDoubleEscaped(s, k))
                {
                    j--;
                    stringbuffer.append(s.substring(i, k - 1));
                    stringbuffer.append('{');
                    i = k + 1;
                } else
                {
                    stringbuffer.append(s.substring(i, k - 1));
                    deeplyAppendParameter(stringbuffer, aobj[j], new HashMap());
                    i = k + 2;
                }
            } else
            {
                stringbuffer.append(s.substring(i, k));
                deeplyAppendParameter(stringbuffer, aobj[j], new HashMap());
                i = k + 2;
            }
            j++;
        }
        stringbuffer.append(s.substring(i, s.length()));
        if (j < aobj.length - 1)
        {
            return new FormattingTuple(stringbuffer.toString(), aobj, throwable);
        } else
        {
            return new FormattingTuple(stringbuffer.toString(), aobj, null);
        }
    }

    private static void booleanArrayAppend(StringBuffer stringbuffer, boolean aflag[])
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

    private static void byteArrayAppend(StringBuffer stringbuffer, byte abyte0[])
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

    private static void charArrayAppend(StringBuffer stringbuffer, char ac[])
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

    private static void deeplyAppendParameter(StringBuffer stringbuffer, Object obj, Map map)
    {
        if (obj == null)
        {
            stringbuffer.append("null");
            return;
        }
        if (!obj.getClass().isArray())
        {
            safeObjectAppend(stringbuffer, obj);
            return;
        }
        if (obj instanceof boolean[])
        {
            booleanArrayAppend(stringbuffer, (boolean[])obj);
            return;
        }
        if (obj instanceof byte[])
        {
            byteArrayAppend(stringbuffer, (byte[])obj);
            return;
        }
        if (obj instanceof char[])
        {
            charArrayAppend(stringbuffer, (char[])obj);
            return;
        }
        if (obj instanceof short[])
        {
            shortArrayAppend(stringbuffer, (short[])obj);
            return;
        }
        if (obj instanceof int[])
        {
            intArrayAppend(stringbuffer, (int[])obj);
            return;
        }
        if (obj instanceof long[])
        {
            longArrayAppend(stringbuffer, (long[])obj);
            return;
        }
        if (obj instanceof float[])
        {
            floatArrayAppend(stringbuffer, (float[])obj);
            return;
        }
        if (obj instanceof double[])
        {
            doubleArrayAppend(stringbuffer, (double[])obj);
            return;
        } else
        {
            objectArrayAppend(stringbuffer, (Object[])obj, map);
            return;
        }
    }

    private static void doubleArrayAppend(StringBuffer stringbuffer, double ad[])
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

    private static void floatArrayAppend(StringBuffer stringbuffer, float af[])
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

    public static final FormattingTuple format(String s, Object obj)
    {
        return arrayFormat(s, new Object[] {
            obj
        });
    }

    public static final FormattingTuple format(String s, Object obj, Object obj1)
    {
        return arrayFormat(s, new Object[] {
            obj, obj1
        });
    }

    static final Throwable getThrowableCandidate(Object aobj[])
    {
        if (aobj == null || aobj.length == 0)
        {
            return null;
        }
        aobj = ((Object []) (aobj[aobj.length - 1]));
        if (aobj instanceof Throwable)
        {
            return (Throwable)aobj;
        } else
        {
            return null;
        }
    }

    private static void intArrayAppend(StringBuffer stringbuffer, int ai[])
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

    static final boolean isDoubleEscaped(String s, int i)
    {
        return i >= 2 && s.charAt(i - 2) == '\\';
    }

    static final boolean isEscapedDelimeter(String s, int i)
    {
        while (i == 0 || s.charAt(i - 1) != '\\') 
        {
            return false;
        }
        return true;
    }

    private static void longArrayAppend(StringBuffer stringbuffer, long al[])
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

    private static void objectArrayAppend(StringBuffer stringbuffer, Object aobj[], Map map)
    {
        stringbuffer.append('[');
        if (!map.containsKey(((Object) (aobj))))
        {
            map.put(((Object) (aobj)), null);
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                deeplyAppendParameter(stringbuffer, aobj[i], map);
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

    private static void safeObjectAppend(StringBuffer stringbuffer, Object obj)
    {
        try
        {
            stringbuffer.append(obj.toString());
            return;
        }
        catch (Throwable throwable)
        {
            System.err.println((new StringBuilder("SLF4J: Failed toString() invocation on an object of type [")).append(obj.getClass().getName()).append("]").toString());
            throwable.printStackTrace();
            stringbuffer.append("[FAILED toString()]");
            return;
        }
    }

    private static void shortArrayAppend(StringBuffer stringbuffer, short aword0[])
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
}
