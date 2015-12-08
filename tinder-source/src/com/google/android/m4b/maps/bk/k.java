// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            m

public class k
{
    final class a extends k
    {

        public final boolean a(int i, int j, int l)
        {
            throw new UnsupportedOperationException("Cannot add triangle to immutable empty mesh");
        }

        public final double b()
        {
            return 0.0D;
        }

        public final int c()
        {
            return 0;
        }

        public final int d()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (this == obj || equals(obj))
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof k)
                {
                    flag = flag1;
                    if (((k)obj).c() == 0)
                    {
                        return true;
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return 0;
        }

        public a()
        {
        }
    }


    private static final k c = new a();
    final m a;
    int b;

    k()
    {
        this(null);
    }

    private k(m m1)
    {
        b = 0;
        a = m1;
    }

    public static k a()
    {
        return c;
    }

    public static k a(m m1)
    {
        return new k(m1.c());
    }

    public final int a(int i, int j)
    {
        if (i < 0 || i >= c() || j < 0 || j >= 3)
        {
            throw new IllegalArgumentException();
        } else
        {
            return a.j(i * 3 + j);
        }
    }

    public boolean a(int i, int j, int l)
    {
        if (a.c(i, j, l) > 0.0D)
        {
            a.b(new int[] {
                i, j, l
            });
            return true;
        } else
        {
            b = b + 1;
            return false;
        }
    }

    public double b()
    {
        double d1 = 0.0D;
        for (int i = 0; i < a.c; i += 3)
        {
            d1 += a.b(i, i + 1, i + 2);
        }

        return d1;
    }

    public int c()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.c / 3;
        }
    }

    public int d()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.e();
        }
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof k))
        {
            return false;
        } else
        {
            return ((k)obj).a.equals(a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("\nint[] triangles = {\n    ");
        int l = a.c;
        int i = 0;
        while (i < l) 
        {
            stringbuilder.append(a.j(i));
            stringbuilder.append(", ");
            stringbuilder.append(a.j(i + 1));
            stringbuilder.append(", ");
            stringbuilder.append(a.j(i + 2));
            if (i == a.c - 3)
            {
                stringbuilder.append("\n};\n\n");
            } else
            {
                stringbuilder.append(",\n    ");
            }
            i += 3;
        }
        l = a.e();
        for (int j = ((flag) ? 1 : 0); j < l; j++)
        {
            stringbuilder.append("cutVertices.add(new Vertex2d(");
            stringbuilder.append(a.b(j));
            stringbuilder.append(", ");
            stringbuilder.append(a.c(j));
            stringbuilder.append("));\n");
        }

        return stringbuilder.toString();
    }

}
