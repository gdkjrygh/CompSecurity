// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            go, gp, fz, fr, 
//            gq, hs, hr, gw

final class hq extends go
{

    private final transient gp a[];
    private final transient gp b[];
    private final transient int c;

    hq(java.util.Map.Entry aentry[])
    {
        int l = aentry.length;
        a = new gp[l];
        int i = fz.b(l);
        b = new gp[i];
        c = i - 1;
        for (int j = 0; j < l; j++)
        {
            Object obj = aentry[j];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            fr.a(obj1, obj);
            int k = fz.a(obj1.hashCode()) & c;
            gp gp1 = b[k];
            if (gp1 == null)
            {
                obj = new gq(obj1, obj);
            } else
            {
                obj = new hs(obj1, obj, gp1);
            }
            b[k] = ((gp) (obj));
            a[j] = ((gp) (obj));
            boolean flag;
            for (; gp1 != null; gp1 = gp1.a())
            {
                if (!obj1.equals(gp1.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append("key").append(": ").append(obj).append(" and ").append(gp1).toString());
                }
            }

        }

    }

    static gp[] a(hq hq1)
    {
        return hq1.a;
    }

    final gw c()
    {
        return new hr(this, (byte)0);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = fz.a(obj.hashCode());
            int j = c;
            gp gp1 = b[i & j];
            while (gp1 != null) 
            {
                if (obj.equals(gp1.getKey()))
                {
                    return gp1.getValue();
                }
                gp1 = gp1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
