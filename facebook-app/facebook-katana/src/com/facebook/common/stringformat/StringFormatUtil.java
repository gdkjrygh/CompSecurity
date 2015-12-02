// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.stringformat;

import java.util.Formattable;

public class StringFormatUtil
{

    public StringFormatUtil()
    {
    }

    private static int a(StringBuilder stringbuilder, String s, Object aobj[])
    {
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        int i1;
        i1 = 0;
        j = 0;
        int j2 = s.length();
        int j1;
        if (stringbuilder == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = 0;
        k = 0;
        l = 0;
        if (i1 >= j2) goto _L2; else goto _L1
_L1:
        if (l != 0) goto _L4; else goto _L3
_L3:
        char c1 = s.charAt(i1);
        if (c1 == '%')
        {
            l = 1;
            j1 = 1;
            k = j;
            j = i;
            i = j1;
        } else
        if (flag)
        {
            int k1 = j;
            j = i + 1;
            i = k;
            k = k1;
        } else
        {
            stringbuilder.append(c1);
            int l1 = j;
            j = i;
            i = k;
            k = l1;
        }
_L6:
        j1 = i1 + 1;
        i1 = i;
        i = j;
        j = k;
        k = i1;
        i1 = j1;
        break MISSING_BLOCK_LABEL_28;
_L4:
        l = s.charAt(i1);
        if (l != 37)
        {
            break; /* Loop/switch isn't completed */
        }
        int i2;
        if (flag)
        {
            i++;
        } else
        {
            stringbuilder.append('%');
        }
_L11:
        i2 = i;
        i = k;
        k = j;
        l = 0;
        j = i2;
        if (true) goto _L6; else goto _L5
_L5:
        if (aobj != null && j < aobj.length) goto _L8; else goto _L7
_L7:
        if (!flag) goto _L10; else goto _L9
_L9:
        i = -1;
_L13:
        return i;
_L10:
        throw new AssertionError();
_L8:
        Object obj = aobj[j];
        switch (l)
        {
        default:
            if (flag)
            {
                return -1;
            } else
            {
                throw new AssertionError();
            }

        case 100: // 'd'
            break MISSING_BLOCK_LABEL_425;

        case 115: // 's'
            if (obj instanceof Formattable)
            {
                if (flag)
                {
                    return -1;
                } else
                {
                    throw new AssertionError();
                }
            }
            if (obj instanceof String)
            {
                if (flag)
                {
                    i = ((String)obj).length() + i;
                } else
                {
                    stringbuilder.append(obj);
                }
            } else
            if (flag)
            {
                Object obj1;
                if (obj == null)
                {
                    obj = "null";
                } else
                {
                    obj = obj.toString();
                }
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = "null";
                }
                l = ((String) (obj1)).length();
                aobj[j] = obj1;
                i += l;
            } else
            {
                stringbuilder.append(obj);
            }
            break;
        }
        j++;
          goto _L11
        if (obj == null)
        {
            if (flag)
            {
                i += 4;
            } else
            {
                stringbuilder.append("null");
            }
        } else
        if (obj instanceof Integer)
        {
            if (flag)
            {
                i += 11;
            } else
            {
                stringbuilder.append(((Number)obj).intValue());
            }
        } else
        if (obj instanceof Short)
        {
            if (flag)
            {
                i += 6;
            } else
            {
                stringbuilder.append(((Number)obj).intValue());
            }
        } else
        if (obj instanceof Byte)
        {
            if (flag)
            {
                i += 4;
            } else
            {
                stringbuilder.append(((Number)obj).intValue());
            }
        } else
        if (obj instanceof Long)
        {
            if (flag)
            {
                i += 20;
            } else
            {
                stringbuilder.append(((Long)obj).longValue());
            }
        } else
        if (flag)
        {
            return -1;
        } else
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_336;
_L2:
        if (l != 0)
        {
            if (flag)
            {
                return -1;
            } else
            {
                throw new AssertionError();
            }
        }
        if (k != 0) goto _L13; else goto _L12
_L12:
        return -2;
          goto _L11
    }

    public static String a(String s)
    {
        return b(s, new Object[0]);
    }

    public static String a(String s, Object obj)
    {
        return b(s, new Object[] {
            obj
        });
    }

    public static String a(String s, Object obj, Object obj1)
    {
        return b(s, new Object[] {
            obj, obj1
        });
    }

    public static String a(String s, Object obj, Object obj1, Object obj2)
    {
        return b(s, new Object[] {
            obj, obj1, obj2
        });
    }

    public static String a(String s, Object obj, Object obj1, Object obj2, Object obj3)
    {
        return b(s, new Object[] {
            obj, obj1, obj2, obj3
        });
    }

    public static transient String a(String s, Object aobj[])
    {
        return b(s, aobj);
    }

    private static transient String b(String s, Object aobj[])
    {
        int i = c(s, aobj);
        String s1;
        if (i == -1)
        {
            s1 = String.format(null, s, aobj);
        } else
        {
            s1 = s;
            if (i != -2)
            {
                StringBuilder stringbuilder = new StringBuilder(i);
                a(stringbuilder, s, aobj);
                return stringbuilder.toString();
            }
        }
        return s1;
    }

    private static int c(String s, Object aobj[])
    {
        return a(((StringBuilder) (null)), s, aobj);
    }
}
