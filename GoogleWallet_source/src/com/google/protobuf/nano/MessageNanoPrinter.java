// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.google.protobuf.nano:
//            MessageNano

public final class MessageNanoPrinter
{

    private static void appendQuotedBytes(byte abyte0[], StringBuffer stringbuffer)
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

    private static String deCamelCaseify(String s)
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

    private static String escapeString(String s)
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

    public static String print(MessageNano messagenano)
    {
        if (messagenano == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            print(null, messagenano, new StringBuffer(), stringbuffer);
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            messagenano = String.valueOf(messagenano.getMessage());
            if (messagenano.length() != 0)
            {
                return "Error printing proto: ".concat(messagenano);
            } else
            {
                return new String("Error printing proto: ");
            }
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            messagenano = String.valueOf(messagenano.getMessage());
            if (messagenano.length() != 0)
            {
                return "Error printing proto: ".concat(messagenano);
            } else
            {
                return new String("Error printing proto: ");
            }
        }
        return stringbuffer.toString();
    }

    private static void print(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
        throws IllegalAccessException, InvocationTargetException
    {
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof MessageNano)) goto _L4; else goto _L3
_L3:
        Class class1;
        Method amethod[];
        int i;
        int l;
        int j1;
        j1 = stringbuffer.length();
        if (s != null)
        {
            stringbuffer1.append(stringbuffer).append(deCamelCaseify(s)).append(" <\n");
            stringbuffer.append("  ");
        }
        class1 = obj.getClass();
        Field afield[] = class1.getFields();
        int k1 = afield.length;
        i = 0;
        while (i < k1) 
        {
            Object obj2 = afield[i];
            int j = ((Field) (obj2)).getModifiers();
            String s1 = ((Field) (obj2)).getName();
            if (!"cachedSize".equals(s1) && (j & 1) == 1 && (j & 8) != 8 && !s1.startsWith("_") && !s1.endsWith("_"))
            {
                Class class2 = ((Field) (obj2)).getType();
                obj2 = ((Field) (obj2)).get(obj);
                if (class2.isArray())
                {
                    if (class2.getComponentType() == Byte.TYPE)
                    {
                        print(s1, obj2, stringbuffer, stringbuffer1);
                    } else
                    {
                        int k;
                        int i1;
                        if (obj2 == null)
                        {
                            k = 0;
                        } else
                        {
                            k = Array.getLength(obj2);
                        }
                        i1 = 0;
                        while (i1 < k) 
                        {
                            print(s1, Array.get(obj2, i1), stringbuffer, stringbuffer1);
                            i1++;
                        }
                    }
                } else
                {
                    print(s1, obj2, stringbuffer, stringbuffer1);
                }
            }
            i++;
        }
        amethod = class1.getMethods();
        l = amethod.length;
        i = 0;
_L15:
        Object obj1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_465;
        }
        obj1 = amethod[i].getName();
        if (!((String) (obj1)).startsWith("set")) goto _L6; else goto _L5
_L5:
        String s2 = ((String) (obj1)).substring(3);
        obj1 = String.valueOf(s2);
        if (((String) (obj1)).length() == 0) goto _L8; else goto _L7
_L7:
        obj1 = "has".concat(((String) (obj1)));
_L12:
        obj1 = class1.getMethod(((String) (obj1)), new Class[0]);
        if (!((Boolean)((Method) (obj1)).invoke(obj, new Object[0])).booleanValue()) goto _L6; else goto _L9
_L9:
        obj1 = String.valueOf(s2);
        if (((String) (obj1)).length() == 0) goto _L11; else goto _L10
_L10:
        obj1 = "get".concat(((String) (obj1)));
_L13:
        obj1 = class1.getMethod(((String) (obj1)), new Class[0]);
        print(s2, ((Method) (obj1)).invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L8:
        obj1 = new String("has");
          goto _L12
        obj1;
          goto _L6
_L11:
        obj1 = new String("get");
          goto _L13
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
          goto _L6
        if (s != null)
        {
            stringbuffer.setLength(j1);
            stringbuffer1.append(stringbuffer).append(">\n");
        }
_L2:
        return;
_L4:
        s = deCamelCaseify(s);
        stringbuffer1.append(stringbuffer).append(s).append(": ");
        if (obj instanceof String)
        {
            s = sanitizeString((String)obj);
            stringbuffer1.append("\"").append(s).append("\"");
        } else
        if (obj instanceof byte[])
        {
            appendQuotedBytes((byte[])obj, stringbuffer1);
        } else
        {
            stringbuffer1.append(obj);
        }
        stringbuffer1.append("\n");
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private static String sanitizeString(String s)
    {
        String s1 = s;
        if (!s.startsWith("http"))
        {
            s1 = s;
            if (s.length() > 200)
            {
                s1 = String.valueOf(s.substring(0, 200)).concat("[...]");
            }
        }
        return escapeString(s1);
    }
}
