// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal:
//            yb

public final class yc
{

    public static String a(yb yb1)
    {
        if (yb1 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            a(null, yb1, new StringBuffer(), stringbuffer);
        }
        // Misplaced declaration of an exception variable
        catch (yb yb1)
        {
            return (new StringBuilder("Error printing proto: ")).append(yb1.getMessage()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (yb yb1)
        {
            return (new StringBuilder("Error printing proto: ")).append(yb1.getMessage()).toString();
        }
        return stringbuffer.toString();
    }

    private static String a(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (i == 0)
            {
                stringbuffer.append(Character.toLowerCase(c));
            } else
            if (Character.isUpperCase(c))
            {
                stringbuffer.append('_').append(Character.toLowerCase(c));
            } else
            {
                stringbuffer.append(c);
            }
            i++;
        }
        return stringbuffer.toString();
    }

    private static void a(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
    {
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof yb)) goto _L4; else goto _L3
_L3:
        Class class1;
        Object aobj[];
        int j;
        int i1;
        int k1;
        k1 = stringbuffer.length();
        if (s != null)
        {
            stringbuffer1.append(stringbuffer).append(a(s)).append(" <\n");
            stringbuffer.append("  ");
        }
        class1 = obj.getClass();
        aobj = class1.getFields();
        int l1 = aobj.length;
        for (int i = 0; i < l1; i++)
        {
            Object obj1 = aobj[i];
            int k = ((Field) (obj1)).getModifiers();
            String s1 = ((Field) (obj1)).getName();
            if ("cachedSize".equals(s1) || (k & 1) != 1 || (k & 8) == 8 || s1.startsWith("_") || s1.endsWith("_"))
            {
                continue;
            }
            Class class2 = ((Field) (obj1)).getType();
            obj1 = ((Field) (obj1)).get(obj);
            if (class2.isArray() && class2.getComponentType() != Byte.TYPE)
            {
                int l;
                int j1;
                if (obj1 == null)
                {
                    l = 0;
                } else
                {
                    l = Array.getLength(obj1);
                }
                for (j1 = 0; j1 < l; j1++)
                {
                    a(s1, Array.get(obj1, j1), stringbuffer, stringbuffer1);
                }

            } else
            {
                a(s1, obj1, stringbuffer, stringbuffer1);
            }
        }

        aobj = class1.getMethods();
        i1 = aobj.length;
        j = 0;
_L6:
        String s2;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = aobj[j].getName();
        if (!s2.startsWith("set"))
        {
            break MISSING_BLOCK_LABEL_388;
        }
        s2 = s2.substring(3);
        Method method = class1.getMethod((new StringBuilder("has")).append(s2).toString(), new Class[0]);
        if (!((Boolean)method.invoke(obj, new Object[0])).booleanValue())
        {
            break MISSING_BLOCK_LABEL_388;
        }
        method = class1.getMethod((new StringBuilder("get")).append(s2).toString(), new Class[0]);
        a(s2, method.invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
_L7:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        if (s != null)
        {
            stringbuffer.setLength(k1);
            stringbuffer1.append(stringbuffer).append(">\n");
        }
_L2:
        return;
_L4:
        s = a(s);
        stringbuffer1.append(stringbuffer).append(s).append(": ");
        if (obj instanceof String)
        {
            obj = (String)obj;
            s = ((String) (obj));
            if (!((String) (obj)).startsWith("http"))
            {
                s = ((String) (obj));
                if (((String) (obj)).length() > 200)
                {
                    s = (new StringBuilder()).append(((String) (obj)).substring(0, 200)).append("[...]").toString();
                }
            }
            s = b(s);
            stringbuffer1.append("\"").append(s).append("\"");
        } else
        if (obj instanceof byte[])
        {
            a((byte[])obj, stringbuffer1);
        } else
        {
            stringbuffer1.append(obj);
        }
        stringbuffer1.append("\n");
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
          goto _L7
        nosuchmethodexception;
          goto _L7
    }

    private static void a(byte abyte0[], StringBuffer stringbuffer)
    {
        if (abyte0 == null)
        {
            stringbuffer.append("\"\"");
            return;
        }
        stringbuffer.append('"');
        int i = 0;
        while (i < abyte0.length) 
        {
            int j = abyte0[i] & 0xff;
            if (j == 92 || j == 34)
            {
                stringbuffer.append('\\').append((char)j);
            } else
            if (j >= 32 && j < 127)
            {
                stringbuffer.append((char)j);
            } else
            {
                stringbuffer.append(String.format("\\%03o", new Object[] {
                    Integer.valueOf(j)
                }));
            }
            i++;
        }
        stringbuffer.append('"');
    }

    private static String b(String s)
    {
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        int i = 0;
        while (i < j) 
        {
            char c = s.charAt(i);
            if (c >= ' ' && c <= '~' && c != '"' && c != '\'')
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append(String.format("\\u%04x", new Object[] {
                    Integer.valueOf(c)
                }));
            }
            i++;
        }
        return stringbuilder.toString();
    }
}
