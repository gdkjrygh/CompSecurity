// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.a.a.a.a;

public final class b
{

    private boolean a;

    public b()
    {
        a = true;
    }

    private b a(int i, int j)
    {
        if (!a)
        {
            return this;
        }
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        return this;
    }

    private b a(long l, long l1)
    {
        if (!a)
        {
            return this;
        }
        boolean flag;
        if (l == l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        return this;
    }

    private static void a(Object obj, Object obj1, Class class1, b b1)
    {
        class1 = class1.getDeclaredFields();
        AccessibleObject.setAccessible(class1, true);
        int i = 0;
        while (i < class1.length && b1.a) 
        {
            Field field = class1[i];
            if (!org.a.a.a.a.a(null, field.getName()) && field.getName().indexOf('$') == -1 && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()))
            {
                try
                {
                    b1.c(field.get(obj), field.get(obj1));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
            i++;
        }
    }

    public static boolean a(Object obj, Object obj1)
    {
        return b(obj, obj1);
    }

    private static boolean b(Object obj, Object obj1)
    {
        {
            if (obj == obj1)
            {
                return true;
            }
            if (obj == null || obj1 == null)
            {
                return false;
            }
            Object obj3 = obj.getClass();
            Object obj2 = obj1.getClass();
            if (!((Class) (obj3)).isInstance(obj1))
            {
                break MISSING_BLOCK_LABEL_87;
            }
            if (((Class) (obj2)).isInstance(obj))
            {
                obj2 = obj3;
            }
        }
        obj3 = new b();
        a(obj, obj1, ((Class) (obj2)), ((b) (obj3)));
        while (((Class) (obj2)).getSuperclass() != null && obj2 != null) 
        {
            try
            {
                obj2 = ((Class) (obj2)).getSuperclass();
                a(obj, obj1, ((Class) (obj2)), ((b) (obj3)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
        }
        break MISSING_BLOCK_LABEL_110;
        if (!((Class) (obj2)).isInstance(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Class) (obj3)).isInstance(obj1))
        {
            obj2 = obj3;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_43;
_L1:
        return false;
        return ((b) (obj3)).a;
    }

    private b c(Object obj, Object obj1)
    {
        int i;
        boolean flag;
        short word1;
        boolean flag1;
        boolean flag2;
        flag = false;
        word1 = 0;
        flag1 = false;
        flag2 = false;
        i = 0;
        break MISSING_BLOCK_LABEL_15;
        while (true) 
        {
            do
            {
                do
                {
                    do
                    {
                        do
                        {
                            do
                            {
                                do
                                {
                                    do
                                    {
                                        do
                                        {
                                            do
                                            {
                                                return this;
                                            } while (!a || obj == obj1);
                                            if (obj == null || obj1 == null)
                                            {
                                                a = false;
                                                return this;
                                            }
                                            if (!obj.getClass().isArray())
                                            {
                                                a = obj.equals(obj1);
                                                return this;
                                            }
                                            if (obj.getClass() != obj1.getClass())
                                            {
                                                a = false;
                                                return this;
                                            }
                                            if (!(obj instanceof long[]))
                                            {
                                                break;
                                            }
                                            obj = (long[])obj;
                                            obj1 = (long[])obj1;
                                            if (a && obj != obj1)
                                            {
                                                if (obj == null || obj1 == null)
                                                {
                                                    a = false;
                                                    return this;
                                                }
                                                if (obj.length != obj1.length)
                                                {
                                                    a = false;
                                                    return this;
                                                }
                                                while (i < obj.length && a) 
                                                {
                                                    a(obj[i], obj1[i]);
                                                    i++;
                                                }
                                            }
                                        } while (true);
                                        if (!(obj instanceof int[]))
                                        {
                                            break;
                                        }
                                        obj = (int[])obj;
                                        obj1 = (int[])obj1;
                                        if (a && obj != obj1)
                                        {
                                            if (obj == null || obj1 == null)
                                            {
                                                a = false;
                                                return this;
                                            }
                                            int j = ((flag) ? 1 : 0);
                                            if (obj.length != obj1.length)
                                            {
                                                a = false;
                                                return this;
                                            }
                                            while (j < obj.length && a) 
                                            {
                                                a(obj[j], obj1[j]);
                                                j++;
                                            }
                                        }
                                    } while (true);
                                    if (!(obj instanceof short[]))
                                    {
                                        break;
                                    }
                                    obj = (short[])obj;
                                    obj1 = (short[])obj1;
                                    if (a && obj != obj1)
                                    {
                                        if (obj == null || obj1 == null)
                                        {
                                            a = false;
                                            return this;
                                        }
                                        if (obj.length != obj1.length)
                                        {
                                            a = false;
                                            return this;
                                        }
                                        int k = 0;
                                        while (k < obj.length && a) 
                                        {
                                            short word0 = obj[k];
                                            word1 = obj1[k];
                                            if (a)
                                            {
                                                boolean flag3;
                                                if (word0 == word1)
                                                {
                                                    flag3 = true;
                                                } else
                                                {
                                                    flag3 = false;
                                                }
                                                a = flag3;
                                            }
                                            k++;
                                        }
                                    }
                                } while (true);
                                if (!(obj instanceof char[]))
                                {
                                    break;
                                }
                                obj = (char[])obj;
                                obj1 = (char[])obj1;
                                if (a && obj != obj1)
                                {
                                    if (obj == null || obj1 == null)
                                    {
                                        a = false;
                                        return this;
                                    }
                                    if (obj.length != obj1.length)
                                    {
                                        a = false;
                                        return this;
                                    }
                                    int l = 0;
                                    while (l < obj.length && a) 
                                    {
                                        char c1 = obj[l];
                                        word1 = obj1[l];
                                        if (a)
                                        {
                                            boolean flag4;
                                            if (c1 == word1)
                                            {
                                                flag4 = true;
                                            } else
                                            {
                                                flag4 = false;
                                            }
                                            a = flag4;
                                        }
                                        l++;
                                    }
                                }
                            } while (true);
                            if (!(obj instanceof byte[]))
                            {
                                break;
                            }
                            obj = (byte[])obj;
                            obj1 = (byte[])obj1;
                            if (a && obj != obj1)
                            {
                                if (obj == null || obj1 == null)
                                {
                                    a = false;
                                    return this;
                                }
                                if (obj.length != obj1.length)
                                {
                                    a = false;
                                    return this;
                                }
                                int i1 = 0;
                                while (i1 < obj.length && a) 
                                {
                                    byte byte0 = obj[i1];
                                    word1 = obj1[i1];
                                    if (a)
                                    {
                                        boolean flag5;
                                        if (byte0 == word1)
                                        {
                                            flag5 = true;
                                        } else
                                        {
                                            flag5 = false;
                                        }
                                        a = flag5;
                                    }
                                    i1++;
                                }
                            }
                        } while (true);
                        if (!(obj instanceof double[]))
                        {
                            break;
                        }
                        obj = (double[])obj;
                        obj1 = (double[])obj1;
                        if (a && obj != obj1)
                        {
                            if (obj == null || obj1 == null)
                            {
                                a = false;
                                return this;
                            }
                            int j1 = word1;
                            if (obj.length != obj1.length)
                            {
                                a = false;
                                return this;
                            }
                            while (j1 < obj.length && a) 
                            {
                                double d = obj[j1];
                                double d1 = obj1[j1];
                                if (a)
                                {
                                    a(Double.doubleToLongBits(d), Double.doubleToLongBits(d1));
                                }
                                j1++;
                            }
                        }
                    } while (true);
                    if (!(obj instanceof float[]))
                    {
                        break;
                    }
                    obj = (float[])obj;
                    obj1 = (float[])obj1;
                    if (a && obj != obj1)
                    {
                        if (obj == null || obj1 == null)
                        {
                            a = false;
                            return this;
                        }
                        int k1 = ((flag1) ? 1 : 0);
                        if (obj.length != obj1.length)
                        {
                            a = false;
                            return this;
                        }
                        while (k1 < obj.length && a) 
                        {
                            float f = obj[k1];
                            float f1 = obj1[k1];
                            if (a)
                            {
                                a(Float.floatToIntBits(f), Float.floatToIntBits(f1));
                            }
                            k1++;
                        }
                    }
                } while (true);
                if (!(obj instanceof boolean[]))
                {
                    break;
                }
                obj = (boolean[])obj;
                obj1 = (boolean[])obj1;
                if (a && obj != obj1)
                {
                    if (obj == null || obj1 == null)
                    {
                        a = false;
                        return this;
                    }
                    if (obj.length != obj1.length)
                    {
                        a = false;
                        return this;
                    }
                    int l1 = 0;
                    while (l1 < obj.length && a) 
                    {
                        byte byte1 = obj[l1];
                        byte byte2 = obj1[l1];
                        if (a)
                        {
                            if (byte1 == byte2)
                            {
                                byte1 = 1;
                            } else
                            {
                                byte1 = 0;
                            }
                            a = byte1;
                        }
                        l1++;
                    }
                }
            } while (true);
            obj = ((Object) ((Object[])obj));
            obj1 = ((Object) ((Object[])obj1));
            if (a && obj != obj1)
            {
                if (obj == null || obj1 == null)
                {
                    a = false;
                    return this;
                }
                int i2 = ((flag2) ? 1 : 0);
                if (obj.length != obj1.length)
                {
                    a = false;
                    return this;
                }
                while (i2 < obj.length && a) 
                {
                    c(obj[i2], obj1[i2]);
                    i2++;
                }
            }
        }
    }
}
