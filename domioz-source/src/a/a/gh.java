// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            fe, ff, ep, eh, 
//            fg, gj, gi, fm

final class gh extends fe
{

    private final transient ff a[];
    private final transient ff b[];
    private final transient int c;

    gh(java.util.Map.Entry aentry[])
    {
        int l = aentry.length;
        a = new ff[l];
        int i = ep.b(l);
        b = new ff[i];
        c = i - 1;
        for (int j = 0; j < l; j++)
        {
            Object obj = aentry[j];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            eh.a(obj1, obj);
            int k = ep.a(obj1.hashCode()) & c;
            ff ff1 = b[k];
            if (ff1 == null)
            {
                obj = new fg(obj1, obj);
            } else
            {
                obj = new gj(obj1, obj, ff1);
            }
            b[k] = ((ff) (obj));
            a[j] = ((ff) (obj));
            boolean flag;
            for (; ff1 != null; ff1 = ff1.a())
            {
                if (!obj1.equals(ff1.getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append("key").append(": ").append(obj).append(" and ").append(ff1).toString());
                }
            }

        }

    }

    static ff[] a(gh gh1)
    {
        return gh1.a;
    }

    final fm c()
    {
        return new gi(this, (byte)0);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = ep.a(obj.hashCode());
            int j = c;
            ff ff1 = b[i & j];
            while (ff1 != null) 
            {
                if (obj.equals(ff1.getKey()))
                {
                    return ff1.getValue();
                }
                ff1 = ff1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
