// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            c

public final class android.support.v4.view.accessibility.d
{
    static interface a
    {

        public abstract Object a(android.support.v4.view.accessibility.d d1);
    }

    static final class b extends d
    {

        public final Object a(android.support.v4.view.accessibility.d d1)
        {
            return new e._cls1(new e.a(this, d1) {

                final android.support.v4.view.accessibility.d a;
                final b b;

                public final boolean a()
                {
                    return android.support.v4.view.accessibility.d.c();
                }

                public final List b()
                {
                    android.support.v4.view.accessibility.d.d();
                    new ArrayList();
                    throw new NullPointerException();
                }

                public final Object c()
                {
                    android.support.v4.view.accessibility.d.b();
                    return null;
                }

            
            {
                b = b1;
                a = d1;
                super();
            }
            });
        }

        b()
        {
        }
    }

    static final class c extends d
    {

        public final Object a(android.support.v4.view.accessibility.d d1)
        {
            return new f._cls1(new f.a(this, d1) {

                final android.support.v4.view.accessibility.d a;
                final c b;

                public final boolean a()
                {
                    return android.support.v4.view.accessibility.d.c();
                }

                public final List b()
                {
                    android.support.v4.view.accessibility.d.d();
                    new ArrayList();
                    throw new NullPointerException();
                }

                public final Object c()
                {
                    android.support.v4.view.accessibility.d.b();
                    return null;
                }

                public final Object d()
                {
                    android.support.v4.view.accessibility.d.e();
                    return null;
                }

            
            {
                b = c1;
                a = d1;
                super();
            }
            });
        }

        c()
        {
        }
    }

    static class d
        implements a
    {

        public Object a(android.support.v4.view.accessibility.d d1)
        {
            return null;
        }

        d()
        {
        }
    }


    private static final a a;
    private final Object b;

    public android.support.v4.view.accessibility.d()
    {
        b = a.a(this);
    }

    public android.support.v4.view.accessibility.d(Object obj)
    {
        b = obj;
    }

    public static android.support.v4.view.accessibility.c b()
    {
        return null;
    }

    public static boolean c()
    {
        return false;
    }

    public static List d()
    {
        return null;
    }

    public static android.support.v4.view.accessibility.c e()
    {
        return null;
    }

    public final Object a()
    {
        return b;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new b();
        } else
        {
            a = new d();
        }
    }
}
