// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pe, gg

public final class gf extends pe
    implements Comparable
{

    public static final gf a = new gf(0);

    public gf(int i)
    {
        super(i);
    }

    public final gg a(int i)
    {
        return (gg)d(i);
    }

    public final void a(int i, gg gg1)
    {
        a(i, gg1);
    }

    public final int compareTo(Object obj)
    {
        obj = (gf)obj;
        if (this != obj)
        {
            int j = super.K.length;
            int k = ((pe) (obj)).K.length;
            int l = Math.min(j, k);
            for (int i = 0; i < l; i++)
            {
                int i1 = a(i).a(((gf) (obj)).a(i));
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

}
