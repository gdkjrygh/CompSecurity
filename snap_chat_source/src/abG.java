// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abG extends aeN
    implements Comparable
{
    public static final class a
        implements Comparable
    {

        public final aez a;
        public final int b;

        public final int a(a a1)
        {
            if (b < a1.b)
            {
                return -1;
            }
            if (b > a1.b)
            {
                return 1;
            } else
            {
                return a.a(a1.a);
            }
        }

        public final int compareTo(Object obj)
        {
            return a((a)obj);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof a)
            {
                flag = flag1;
                if (a((a)obj) == 0)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return b * 31 + a.hashCode();
        }

        public a(aez aez1, int i)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException("handler < 0");
            }
            if (aez1 == null)
            {
                throw new NullPointerException("exceptionType == null");
            } else
            {
                b = i;
                a = aez1;
                return;
            }
        }
    }


    public static final abG a = new abG(0);

    public abG(int i)
    {
        super(i);
    }

    public final int a(abG abg)
    {
        if (this != abg)
        {
            int j = super.K.length;
            int k = ((aeN) (abg)).K.length;
            int l = Math.min(j, k);
            for (int i = 0; i < l; i++)
            {
                int i1 = a(i).a(abg.a(i));
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

    public final a a(int i)
    {
        return (a)d(i);
    }

    public final void a(int i, aez aez1, int j)
    {
        a(i, new a(aez1, j));
    }

    public final String ag_()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        int j = super.K.length;
        stringbuilder.append("");
        stringbuilder.append("");
        stringbuilder.append("catch ");
        int i = 0;
        while (i < j) 
        {
            a a1 = a(i);
            if (i != 0)
            {
                stringbuilder.append(",\n");
                stringbuilder.append("");
                stringbuilder.append("  ");
            }
            if (i == j - 1 && b())
            {
                stringbuilder.append("<any>");
            } else
            {
                stringbuilder.append(a1.a.ag_());
            }
            stringbuilder.append(" -> ");
            stringbuilder.append(aeO.c(a1.b));
            i++;
        }
        return stringbuilder.toString();
    }

    public final boolean b()
    {
        int i = super.K.length;
        if (i == 0)
        {
            return false;
        } else
        {
            return a(i - 1).a.equals(aez.a);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((abG)obj);
    }

}
