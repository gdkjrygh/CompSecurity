// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            c

public class android.support.v4.view.a.d
{
    static interface a
    {

        public abstract Object a(android.support.v4.view.a.d d1);
    }

    static final class b extends d
    {

        public final Object a(android.support.v4.view.a.d d1)
        {
            return new e._cls1(new e.a(this, d1) {

                final android.support.v4.view.a.d a;
                final b b;

                public final Object a(int i)
                {
                    android.support.v4.view.a.c c1 = a.a(i);
                    if (c1 == null)
                    {
                        return null;
                    } else
                    {
                        return c1.b;
                    }
                }

                public final List a()
                {
                    android.support.v4.view.a.d.a();
                    new ArrayList();
                    throw new NullPointerException();
                }

                public final boolean a(int i, int j, Bundle bundle)
                {
                    return a.a(i, j, bundle);
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

        public final Object a(android.support.v4.view.a.d d1)
        {
            return new f._cls1(new f.a(this, d1) {

                final android.support.v4.view.a.d a;
                final c b;

                public final Object a(int i)
                {
                    android.support.v4.view.a.c c1 = a.a(i);
                    if (c1 == null)
                    {
                        return null;
                    } else
                    {
                        return c1.b;
                    }
                }

                public final List a()
                {
                    android.support.v4.view.a.d.a();
                    new ArrayList();
                    throw new NullPointerException();
                }

                public final boolean a(int i, int j, Bundle bundle)
                {
                    return a.a(i, j, bundle);
                }

                public final Object b()
                {
                    android.support.v4.view.a.d.b();
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

        public Object a(android.support.v4.view.a.d d1)
        {
            return null;
        }

        d()
        {
        }
    }


    private static final a b;
    public final Object a;

    public android.support.v4.view.a.d()
    {
        a = b.a(this);
    }

    public android.support.v4.view.a.d(Object obj)
    {
        a = obj;
    }

    public static List a()
    {
        return null;
    }

    public static android.support.v4.view.a.c b()
    {
        return null;
    }

    public android.support.v4.view.a.c a(int i)
    {
        return null;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return false;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            b = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new b();
        } else
        {
            b = new d();
        }
    }
}
