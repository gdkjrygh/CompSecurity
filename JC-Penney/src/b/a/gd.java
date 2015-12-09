// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pe, ge, pf, op

public final class gd extends pe
    implements Comparable
{

    public static final gd a = new gd(0);

    public gd(int i)
    {
        super(i);
    }

    public final int a(gd gd1)
    {
        if (this != gd1)
        {
            int j = super.K.length;
            int k = ((pe) (gd1)).K.length;
            int l = Math.min(j, k);
            for (int i = 0; i < l; i++)
            {
                int i1 = a(i).a(gd1.a(i));
                if (i1 != 0)
                {
                    return i1;
                }
            }

            if (j < k)
            {
                return -1;
            }
            if (j > k)
            {
                return 1;
            }
        }
        return 0;
    }

    public final ge a(int i)
    {
        return (ge)d(i);
    }

    public final String a(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        int j = super.K.length;
        stringbuilder.append(s);
        stringbuilder.append(s1);
        stringbuilder.append("catch ");
        int i = 0;
        while (i < j) 
        {
            s1 = a(i);
            if (i != 0)
            {
                stringbuilder.append(",\n");
                stringbuilder.append(s);
                stringbuilder.append("  ");
            }
            if (i == j - 1 && b())
            {
                stringbuilder.append("<any>");
            } else
            {
                stringbuilder.append(((ge) (s1)).a.h_());
            }
            stringbuilder.append(" -> ");
            stringbuilder.append(pf.c(((ge) (s1)).b));
            i++;
        }
        return stringbuilder.toString();
    }

    public final void a(int i, op op1, int j)
    {
        a(i, new ge(op1, j));
    }

    public final boolean b()
    {
        int i = super.K.length;
        if (i == 0)
        {
            return false;
        } else
        {
            return a(i - 1).a.equals(op.a);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((gd)obj);
    }

    public final String h_()
    {
        return a("", "");
    }

}
