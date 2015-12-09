// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.f;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.f:
//            a, f, g

public class e
{
    static interface a
    {

        public abstract Object a(e e1);
    }

    static class b extends d
    {

        public Object a(e e1)
        {
            return f.a(new f.a(this, e1) {

                final e a;
                final b b;

                public Object a(int i)
                {
                    p.f.a a1 = a.a(i);
                    if (a1 == null)
                    {
                        return null;
                    } else
                    {
                        return a1.a();
                    }
                }

                public List a(String s, int i)
                {
                    s = a.a(s, i);
                    ArrayList arraylist = new ArrayList();
                    int j = s.size();
                    for (i = 0; i < j; i++)
                    {
                        arraylist.add(((p.f.a)s.get(i)).a());
                    }

                    return arraylist;
                }

                public boolean a(int i, int j, Bundle bundle)
                {
                    return a.a(i, j, bundle);
                }

            
            {
                b = b1;
                a = e1;
                super();
            }
            });
        }

        b()
        {
        }
    }

    static class c extends d
    {

        public Object a(e e1)
        {
            return g.a(new g.a(this, e1) {

                final e a;
                final c b;

                public Object a(int i)
                {
                    p.f.a a1 = a.a(i);
                    if (a1 == null)
                    {
                        return null;
                    } else
                    {
                        return a1.a();
                    }
                }

                public List a(String s, int i)
                {
                    s = a.a(s, i);
                    ArrayList arraylist = new ArrayList();
                    int j = s.size();
                    for (i = 0; i < j; i++)
                    {
                        arraylist.add(((p.f.a)s.get(i)).a());
                    }

                    return arraylist;
                }

                public boolean a(int i, int j, Bundle bundle)
                {
                    return a.a(i, j, bundle);
                }

                public Object b(int i)
                {
                    p.f.a a1 = a.b(i);
                    if (a1 == null)
                    {
                        return null;
                    } else
                    {
                        return a1.a();
                    }
                }

            
            {
                b = c1;
                a = e1;
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

        public Object a(e e1)
        {
            return null;
        }

        d()
        {
        }
    }


    private static final a a;
    private final Object b;

    public e()
    {
        b = a.a(this);
    }

    public e(Object obj)
    {
        b = obj;
    }

    public Object a()
    {
        return b;
    }

    public List a(String s, int i)
    {
        return null;
    }

    public p.f.a a(int i)
    {
        return null;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return false;
    }

    public p.f.a b(int i)
    {
        return null;
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
