// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            i

public abstract class e
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/bl/e$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("NO", 0);
            b = new a("MAYBE", 1);
            c = new a("YES", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    protected final i.b a;
    boolean b;

    public e(i.b b1)
    {
        j.a(b1);
        a = b1;
    }

    protected static float a(float f1, float f2)
    {
        if (f2 >= f1)
        {
            return Math.min(f2 - f1, (float)((6.2831853071795862D + (double)f1) - (double)f2));
        } else
        {
            return -a(f2, f1);
        }
    }

    protected abstract a a(long l, LinkedList linkedlist, List list);

    public final a a(long l, LinkedList linkedlist, boolean flag, List list)
    {
        if (a() && !list.isEmpty())
        {
            return a.a;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            if (((e)iterator.next()).a())
            {
                if (list.size() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j.b(flag);
                return a.a;
            }
        }

        if (flag != c())
        {
            return a.a;
        } else
        {
            return a(l, linkedlist, list);
        }
    }

    public boolean a()
    {
        return false;
    }

    public final boolean a(i i)
    {
        if (b)
        {
            i = String.valueOf(getClass().getName());
            if (i.length() != 0)
            {
                i = "Gesture already active: ".concat(i);
            } else
            {
                i = new String("Gesture already active: ");
            }
            throw new IllegalStateException(i);
        } else
        {
            b = b(i);
            return b;
        }
    }

    public boolean b()
    {
        return false;
    }

    protected abstract boolean b(i i);

    public final void c(i i)
    {
        if (!b)
        {
            i = String.valueOf(getClass().getName());
            if (i.length() != 0)
            {
                i = "Gesture already inactive: ".concat(i);
            } else
            {
                i = new String("Gesture already inactive: ");
            }
            throw new IllegalStateException(i);
        } else
        {
            b = false;
            d(i);
            return;
        }
    }

    public boolean c()
    {
        return false;
    }

    protected abstract void d(i i);

    public final boolean e(i i)
    {
        if (!b)
        {
            i = String.valueOf(getClass().getName());
            if (i.length() != 0)
            {
                i = "Gesture is not active: ".concat(i);
            } else
            {
                i = new String("Gesture is not active: ");
            }
            throw new IllegalStateException(i);
        } else
        {
            return f(i);
        }
    }

    protected abstract boolean f(i i);
}
