// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;

import c.a.a.a.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;

// Referenced classes of package c.a.a:
//            g, e, f, b, 
//            c, d, a, h

public final class i
{

    public static g a;
    private static final a b = new a();

    public static void a(Object obj, Appendable appendable, g g1)
    {
        Object obj2;
        int j2;
        int k2;
        int l4;
        Object obj1 = obj;
        do
        {
            if (obj1 == null)
            {
                appendable.append("null");
                return;
            }
            if (obj1 instanceof String)
            {
                if (!g1.b((String)obj1))
                {
                    appendable.append((String)obj1);
                    return;
                } else
                {
                    appendable.append('"');
                    a((String)obj1, appendable, g1);
                    appendable.append('"');
                    return;
                }
            }
            if (obj1 instanceof Number)
            {
                if (obj1 instanceof Double)
                {
                    if (((Double)obj1).isInfinite())
                    {
                        appendable.append("null");
                        return;
                    } else
                    {
                        appendable.append(obj1.toString());
                        return;
                    }
                }
                if (obj1 instanceof Float)
                {
                    if (((Float)obj1).isInfinite())
                    {
                        appendable.append("null");
                        return;
                    } else
                    {
                        appendable.append(obj1.toString());
                        return;
                    }
                } else
                {
                    appendable.append(obj1.toString());
                    return;
                }
            }
            if (obj1 instanceof Boolean)
            {
                appendable.append(obj1.toString());
                return;
            }
            if (obj1 instanceof e)
            {
                if (obj1 instanceof f)
                {
                    ((f)obj1).a(appendable, g1);
                    return;
                } else
                {
                    ((e)obj1).a(appendable);
                    return;
                }
            }
            if (obj1 instanceof b)
            {
                if (obj1 instanceof c)
                {
                    appendable.append(((c)obj1).a(g1));
                    return;
                } else
                {
                    appendable.append(((b)obj1).a());
                    return;
                }
            }
            if (obj1 instanceof Map)
            {
                c.a.a.d.a((Map)obj1, appendable, g1);
                return;
            }
            if (obj1 instanceof Iterable)
            {
                a((Iterable)obj1, appendable, g1);
                return;
            }
            if (!(obj1 instanceof Date))
            {
                break;
            }
            obj1 = obj1.toString();
        } while (true);
        if (obj1 instanceof Enum)
        {
            obj = ((Enum)obj1).name();
            if (!g1.b(((String) (obj))))
            {
                appendable.append(((CharSequence) (obj)));
                return;
            } else
            {
                appendable.append('"');
                a(((String) (obj)), appendable, g1);
                appendable.append('"');
                return;
            }
        }
        if (obj1.getClass().isArray())
        {
            obj = obj1.getClass().getComponentType();
            appendable.append('[');
            if (((Class) (obj)).isPrimitive())
            {
                if (obj == Integer.TYPE)
                {
                    obj = (int[])obj1;
                    int l2 = obj.length;
                    boolean flag = false;
                    int j = 0;
                    while (j < l2) 
                    {
                        int i5 = obj[j];
                        if (flag)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag = true;
                        }
                        appendable.append(Integer.toString(i5));
                        j++;
                    }
                } else
                if (obj == Short.TYPE)
                {
                    obj = (short[])obj1;
                    int i3 = obj.length;
                    boolean flag1 = false;
                    int k = 0;
                    while (k < i3) 
                    {
                        short word0 = obj[k];
                        if (flag1)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag1 = true;
                        }
                        appendable.append(Short.toString(word0));
                        k++;
                    }
                } else
                if (obj == Byte.TYPE)
                {
                    obj = (byte[])obj1;
                    int j3 = obj.length;
                    boolean flag2 = false;
                    int l = 0;
                    while (l < j3) 
                    {
                        byte byte0 = obj[l];
                        if (flag2)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag2 = true;
                        }
                        appendable.append(Byte.toString(byte0));
                        l++;
                    }
                } else
                if (obj == Long.TYPE)
                {
                    obj = (long[])obj1;
                    int k3 = obj.length;
                    boolean flag3 = false;
                    int i1 = 0;
                    while (i1 < k3) 
                    {
                        long l5 = obj[i1];
                        if (flag3)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag3 = true;
                        }
                        appendable.append(Long.toString(l5));
                        i1++;
                    }
                } else
                if (obj == Float.TYPE)
                {
                    obj = (float[])obj1;
                    int l3 = obj.length;
                    boolean flag4 = false;
                    int j1 = 0;
                    while (j1 < l3) 
                    {
                        float f1 = obj[j1];
                        if (flag4)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag4 = true;
                        }
                        appendable.append(Float.toString(f1));
                        j1++;
                    }
                } else
                if (obj == Double.TYPE)
                {
                    obj = (double[])obj1;
                    int i4 = obj.length;
                    boolean flag5 = false;
                    int k1 = 0;
                    while (k1 < i4) 
                    {
                        double d1 = obj[k1];
                        if (flag5)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag5 = true;
                        }
                        appendable.append(Double.toString(d1));
                        k1++;
                    }
                } else
                if (obj == Boolean.TYPE)
                {
                    obj = (boolean[])obj1;
                    int j4 = obj.length;
                    boolean flag6 = false;
                    int l1 = 0;
                    while (l1 < j4) 
                    {
                        byte byte1 = obj[l1];
                        if (flag6)
                        {
                            appendable.append(',');
                        } else
                        {
                            flag6 = true;
                        }
                        if (byte1 != 0)
                        {
                            appendable.append("true");
                        } else
                        {
                            appendable.append("false");
                        }
                        l1++;
                    }
                }
            } else
            {
                obj = ((Object) ((Object[])obj1));
                int k4 = obj.length;
                boolean flag7 = false;
                int i2 = 0;
                while (i2 < k4) 
                {
                    obj1 = obj[i2];
                    if (flag7)
                    {
                        appendable.append(',');
                    } else
                    {
                        flag7 = true;
                    }
                    a(obj1, appendable, g1);
                    i2++;
                }
            }
            appendable.append(']');
            return;
        }
        char c2;
        Class class1;
        Field afield[];
        Field field;
        Class class2;
        int j5;
        int k5;
        try
        {
            class1 = obj1.getClass();
            afield = class1.getDeclaredFields();
            appendable.append('{');
            j5 = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        j2 = 0;
        k2 = 0;
_L11:
        if (k2 >= j5) goto _L2; else goto _L1
_L1:
        field = afield[k2];
        k5 = field.getModifiers();
        l4 = j2;
        if ((k5 & 0x98) > 0) goto _L4; else goto _L3
_L3:
        if ((k5 & 1) <= 0) goto _L6; else goto _L5
_L5:
        obj = field.get(obj1);
_L9:
        if (j2 == 0)
        {
            break MISSING_BLOCK_LABEL_1453;
        }
        appendable.append(',');
_L12:
        c.a.a.d.a(field.getName(), obj, appendable, g1);
        l4 = j2;
          goto _L4
_L6:
        obj = field.getName();
        k5 = ((String) (obj)).length();
        obj2 = new char[k5 + 3];
        obj2[0] = 'g';
        obj2[1] = 'e';
        obj2[2] = 't';
        c2 = ((String) (obj)).charAt(0);
        break MISSING_BLOCK_LABEL_1237;
_L7:
        if (l4 >= k5)
        {
            break MISSING_BLOCK_LABEL_1299;
        }
        obj2[l4 + 3] = ((String) (obj)).charAt(l4);
        l4++;
          goto _L7
        obj2 = new String(((char []) (obj2)));
        obj = null;
        obj2 = class1.getDeclaredMethod(((String) (obj2)), new Class[0]);
        obj = obj2;
_L10:
        obj2 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_1379;
        }
        class2 = field.getType();
        if (class2 != Boolean.TYPE)
        {
            obj2 = obj;
            if (class2 != java/lang/Boolean)
            {
                break MISSING_BLOCK_LABEL_1379;
            }
        }
        obj2 = class1.getDeclaredMethod(c.a.a.h.a(field.getName()), new Class[0]);
        l4 = j2;
        if (obj2 == null) goto _L4; else goto _L8
_L8:
        obj = ((Method) (obj2)).invoke(obj1, new Object[0]);
          goto _L9
_L2:
        appendable.append('}');
        return;
        obj2;
          goto _L10
_L4:
        k2++;
        j2 = l4;
          goto _L11
        char c1 = c2;
        if (c2 >= 'a')
        {
            c1 = c2;
            if (c2 <= 'z')
            {
                c1 = (char)(c2 - 32);
            }
        }
        obj2[3] = c1;
        l4 = 1;
          goto _L7
        j2 = 1;
          goto _L12
    }

    public static void a(String s, Appendable appendable, g g1)
    {
        if (s == null)
        {
            return;
        } else
        {
            g1.a(s, appendable);
            return;
        }
    }

    static 
    {
        a = c.a.a.g.a;
    }
}
