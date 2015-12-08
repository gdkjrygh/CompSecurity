// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import kik.android.util.ar;

public abstract class b
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        private static final int e[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = (new int[] {
                a, b, c, d
            });
        }
    }


    private final Context a;
    private final String b;
    private Object c;
    private final Object d;
    private final List e;
    private final Runnable f;
    private ar g;

    protected b(Context context, String s, Object obj, Object aobj[], Runnable runnable, ar ar)
    {
        a = context;
        if (s == null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }
        b = s;
        if (obj == null)
        {
            throw new IllegalArgumentException("DefaultValue cannot be null");
        }
        d = obj;
        if (aobj == null)
        {
            e = null;
        } else
        {
            e = Arrays.asList(aobj);
            if (!e.contains(d))
            {
                throw new IllegalArgumentException("Allowed values must contain defaultValue");
            }
        }
        f = runnable;
        g = ar;
        c = b(g);
    }

    public abstract int a();

    protected abstract void a(ar ar);

    public boolean a(Object obj)
    {
        if (e == null || e.contains(obj))
        {
            c = obj;
            a(g);
            if (f != null)
            {
                f.run();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public Object b()
    {
        return c;
    }

    protected abstract Object b(ar ar);

    protected final Context c()
    {
        return a;
    }

    public final String d()
    {
        return b;
    }

    public final Object e()
    {
        return d;
    }

    public final List f()
    {
        return e;
    }
}
