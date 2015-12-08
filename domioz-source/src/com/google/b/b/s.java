// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.a.d;
import com.google.b.a.e;
import com.google.b.al;
import com.google.b.am;
import com.google.b.b;
import com.google.b.c;
import com.google.b.c.a;
import com.google.b.k;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.b.b:
//            t

public final class s
    implements am, Cloneable
{

    public static final s a = new s();
    private double b;
    private int c;
    private boolean d;
    private boolean e;
    private List f;
    private List g;

    public s()
    {
        b = -1D;
        c = 136;
        d = true;
        f = Collections.emptyList();
        g = Collections.emptyList();
    }

    private boolean a(d d1, e e1)
    {
        boolean flag;
        if (d1 != null && d1.a() > b)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            if (e1 != null && e1.a() <= b)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    private s b()
    {
        s s1;
        try
        {
            s1 = (s)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return s1;
    }

    private static boolean b(Class class1)
    {
        if (class1.isMemberClass())
        {
            boolean flag;
            if ((class1.getModifiers() & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }

    public final al a(k k, a a1)
    {
        Class class1 = a1.getRawType();
        boolean flag = a(class1, true);
        boolean flag1 = a(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new t(this, flag1, flag, k, a1);
        }
    }

    public final s a()
    {
        s s1 = b();
        s1.b = 1.0D;
        return s1;
    }

    public final boolean a(Class class1, boolean flag)
    {
        if (b != -1D && !a((d)class1.getAnnotation(com/google/b/a/d), (e)class1.getAnnotation(com/google/b/a/e)))
        {
            return true;
        }
        if (!d && b(class1))
        {
            return true;
        }
        if (a(class1))
        {
            return true;
        }
        if (flag)
        {
            class1 = f;
        } else
        {
            class1 = g;
        }
        for (class1 = class1.iterator(); class1.hasNext();)
        {
            if (((b)class1.next()).b())
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(Field field, boolean flag)
    {
label0:
        {
            if ((c & field.getModifiers()) != 0)
            {
                return true;
            }
            if (b != -1D && !a((d)field.getAnnotation(com/google/b/a/d), (e)field.getAnnotation(com/google/b/a/e)))
            {
                return true;
            }
            if (field.isSynthetic())
            {
                return true;
            }
            if (e)
            {
                com.google.b.a.a a1 = (com.google.b.a.a)field.getAnnotation(com/google/b/a/a);
                if (a1 == null || (flag ? !a1.a() : !a1.b()))
                {
                    return true;
                }
            }
            if (!d && b(field.getType()))
            {
                return true;
            }
            if (a(field.getType()))
            {
                return true;
            }
            List list;
            if (flag)
            {
                list = f;
            } else
            {
                list = g;
            }
            if (list.isEmpty())
            {
                break label0;
            }
            new c(field);
            field = list.iterator();
            do
            {
                if (!field.hasNext())
                {
                    break label0;
                }
            } while (!((b)field.next()).a());
            return true;
        }
        return false;
    }

    protected final Object clone()
    {
        return b();
    }

}
