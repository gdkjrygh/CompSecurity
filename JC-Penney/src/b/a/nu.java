// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pe, nr

public final class nu extends pe
    implements Comparable
{

    public nu(int i)
    {
        super(i);
    }

    public final int a(nu nu1)
    {
        int k = super.K.length;
        int l = ((pe) (nu1)).K.length;
        int i;
        int j;
        if (k < l)
        {
            i = k;
        } else
        {
            i = l;
        }
        for (j = 0; j < i; j++)
        {
            int i1 = ((nr)d(j)).a((nr)nu1.d(j));
            if (i1 != 0)
            {
                return i1;
            }
        }

        if (k < l)
        {
            return -1;
        }
        return k <= l ? 0 : 1;
    }

    public final nr a(int i)
    {
        return (nr)d(i);
    }

    public final void a(int i, nr nr1)
    {
        a(i, nr1);
    }

    public final int compareTo(Object obj)
    {
        return a((nu)obj);
    }
}
