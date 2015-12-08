// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal:
//            zzrn

public final class zzro
{

    public static String a(zzrn zzrn1)
    {
        if (zzrn1 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            a(null, zzrn1, new StringBuffer(), stringbuffer);
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            return (new StringBuilder()).append("Error printing proto: ").append(zzrn1.getMessage()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (zzrn zzrn1)
        {
            return (new StringBuilder()).append("Error printing proto: ").append(zzrn1.getMessage()).toString();
        }
        return stringbuffer.toString();
    }

    private static String a(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < s.length()) 
        {
            char c1 = s.charAt(i);
            if (i == 0)
            {
                stringbuffer.append(Character.toLowerCase(c1));
            } else
            if (Character.isUpperCase(c1))
            {
                stringbuffer.append('_').append(Character.toLowerCase(c1));
            } else
            {
                stringbuffer.append(c1);
            }
            i++;
        }
        return stringbuffer.toString();
    }

    private static void a(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(obj instanceof zzrn)) goto _L4; else goto _L3
_L3:
        Class class1;
        Object aobj[];
        int i;
        int l;
        int j1;
        j1 = stringbuffer.length();
        if (s != null)
        {
            stringbuffer1.append(stringbuffer).append(a(s)).append(" <\n");
            stringbuffer.append("  ");
        }
        class1 = obj.getClass();
        aobj = class1.getFields();
        int k1 = aobj.length;
        i = 0;
        while (i < k1) 
        {
            Object obj1 = aobj[i];
            int j = ((Field) (obj1)).getModifiers();
            String s1 = ((Field) (obj1)).getName();
            if ((j & 1) == 1 && (j & 8) != 8 && !s1.startsWith("_") && !s1.endsWith("_"))
            {
                Class class2 = ((Field) (obj1)).getType();
                obj1 = ((Field) (obj1)).get(obj);
                if (class2.isArray())
                {
                    if (class2.getComponentType() == Byte.TYPE)
                    {
                        a(s1, obj1, stringbuffer, stringbuffer1);
                    } else
                    {
                        int k;
                        int i1;
                        if (obj1 == null)
                        {
                            k = 0;
                        } else
                        {
                            k = Array.getLength(obj1);
                        }
                        i1 = 0;
                        while (i1 < k) 
                        {
                            a(s1, Array.get(obj1, i1), stringbuffer, stringbuffer1);
                            i1++;
                        }
                    }
                } else
                {
                    a(s1, obj1, stringbuffer, stringbuffer1);
                }
            }
            i++;
        }
        aobj = class1.getMethods();
        l = aobj.length;
        i = 0;
_L6:
        String s2;
        if (i >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        s2 = aobj[i].getName();
        if (!s2.startsWith("set"))
        {
            break MISSING_BLOCK_LABEL_349;
        }
        s2 = s2.substring(3);
        Method method = class1.getMethod((new StringBuilder()).append("has").append(s2).toString(), new Class[0]);
        if (((Boolean)method.invoke(obj, new Object[0])).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        method = class1.getMethod((new StringBuilder()).append("get").append(s2).toString(), new Class[0]);
        a(s2, method.invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
          goto _L7
        if (s == null) goto _L1; else goto _L8
_L8:
        stringbuffer.setLength(j1);
        stringbuffer1.append(stringbuffer).append(">\n");
        return;
_L4:
        s = a(s);
        stringbuffer1.append(stringbuffer).append(s).append(": ");
        if (obj instanceof String)
        {
            s = b((String)obj);
            stringbuffer1.append("\"").append(s).append("\"");
        } else
        if (obj instanceof byte[])
        {
            a((byte[])(byte[])obj, stringbuffer1);
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
        String s1 = s;
        if (!s.startsWith("http"))
        {
            s1 = s;
            if (s.length() > 200)
            {
                s1 = (new StringBuilder()).append(s.substring(0, 200)).append("[...]").toString();
            }
        }
        return c(s1);
    }

    private static String c(String s)
    {
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        int i = 0;
        while (i < j) 
        {
            char c1 = s.charAt(i);
            if (c1 >= ' ' && c1 <= '~' && c1 != '"' && c1 != '\'')
            {
                stringbuilder.append(c1);
            } else
            {
                stringbuilder.append(String.format("\\u%04x", new Object[] {
                    Integer.valueOf(c1)
                }));
            }
            i++;
        }
        return stringbuilder.toString();
    }
}
