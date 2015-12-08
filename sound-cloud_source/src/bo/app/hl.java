// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            gj, gk, fu, fm, 
//            gl, hn, hm, gr

final class hl extends gj
{

    private final transient gk a[];
    private final transient gk b[];
    private final transient int c;

    hl(java.util.Map.Entry aentry[])
    {
        int l = aentry.length;
        a = new gk[l];
        int i = fu.b(l);
        b = new gk[i];
        c = i - 1;
        for (int j = 0; j < l; j++)
        {
            Object obj = aentry[j];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            fm.a(obj1, obj);
            int k = fu.a(obj1.hashCode()) & c;
            gk gk1 = b[k];
            if (gk1 == null)
            {
                obj = new gl(obj1, obj);
            } else
            {
                obj = new hn(obj1, obj, gk1);
            }
            b[k] = ((gk) (obj));
            a[j] = ((gk) (obj));
            boolean flag;
            for (; gk1 != null; gk1 = gk1.a())
            {
                if (!obj1.equals(gk1.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append("key").append(": ").append(obj).append(" and ").append(gk1).toString());
                }
            }

        }

    }

    static gk[] a(hl hl1)
    {
        return hl1.a;
    }

    final gr c()
    {
        return new hm(this, (byte)0);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = fu.a(obj.hashCode());
            int j = c;
            gk gk1 = b[i & j];
            while (gk1 != null) 
            {
                if (obj.equals(gk1.getKey()))
                {
                    return gk1.getValue();
                }
                gk1 = gk1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
