// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            gi, gj, ft, fl, 
//            gk, hm, hl, gq

final class hk extends gi
{

    private final transient gj a[];
    private final transient gj b[];
    private final transient int c;

    hk(java.util.Map.Entry aentry[])
    {
        int l = aentry.length;
        a = new gj[l];
        int i = ft.b(l);
        b = new gj[i];
        c = i - 1;
        for (int j = 0; j < l; j++)
        {
            Object obj = aentry[j];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            fl.a(obj1, obj);
            int k = ft.a(obj1.hashCode()) & c;
            gj gj1 = b[k];
            if (gj1 == null)
            {
                obj = new gk(obj1, obj);
            } else
            {
                obj = new hm(obj1, obj, gj1);
            }
            b[k] = ((gj) (obj));
            a[j] = ((gj) (obj));
            boolean flag;
            for (; gj1 != null; gj1 = gj1.a())
            {
                if (!obj1.equals(gj1.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append("key").append(": ").append(obj).append(" and ").append(gj1).toString());
                }
            }

        }

    }

    static gj[] a(hk hk1)
    {
        return hk1.a;
    }

    final gq c()
    {
        return new hl(this, (byte)0);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = ft.a(obj.hashCode());
            int j = c;
            gj gj1 = b[i & j];
            while (gj1 != null) 
            {
                if (obj.equals(gj1.getKey()))
                {
                    return gj1.getValue();
                }
                gj1 = gj1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
