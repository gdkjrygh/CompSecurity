// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.d;
import com.google.a.a.e;
import com.google.a.af;
import com.google.a.ag;
import com.google.a.b;
import com.google.a.c.a;
import com.google.a.j;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.a.b:
//            t

public final class s
    implements ag, Cloneable
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

    private boolean a(d d1)
    {
        return d1 == null || d1.a() <= b;
    }

    private boolean a(d d1, e e1)
    {
        return a(d1) && a(e1);
    }

    private boolean a(e e1)
    {
        return e1 == null || e1.a() > b;
    }

    private boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    private boolean b(Class class1)
    {
        return class1.isMemberClass() && !c(class1);
    }

    private boolean c(Class class1)
    {
        return (class1.getModifiers() & 8) != 0;
    }

    public af a(j j, a a1)
    {
        Class class1 = a1.a();
        boolean flag = a(class1, true);
        boolean flag1 = a(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new t(this, flag1, flag, j, a1);
        }
    }

    protected s a()
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

    public boolean a(Class class1, boolean flag)
    {
        if (b != -1D && !a((d)class1.getAnnotation(com/google/a/a/d), (e)class1.getAnnotation(com/google/a/a/e)))
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
        Object obj;
        if (flag)
        {
            obj = f;
        } else
        {
            obj = g;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (((com.google.a.a)((Iterator) (obj)).next()).a(class1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean a(Field field, boolean flag)
    {
label0:
        {
            if ((c & field.getModifiers()) != 0)
            {
                return true;
            }
            if (b != -1D && !a((d)field.getAnnotation(com/google/a/a/d), (e)field.getAnnotation(com/google/a/a/e)))
            {
                return true;
            }
            if (field.isSynthetic())
            {
                return true;
            }
            if (e)
            {
                com.google.a.a.a a1 = (com.google.a.a.a)field.getAnnotation(com/google/a/a/a);
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
            Object obj;
            if (flag)
            {
                obj = f;
            } else
            {
                obj = g;
            }
            if (((List) (obj)).isEmpty())
            {
                break label0;
            }
            field = new b(field);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!((com.google.a.a)((Iterator) (obj)).next()).a(field));
            return true;
        }
        return false;
    }

    protected Object clone()
    {
        return a();
    }

}
