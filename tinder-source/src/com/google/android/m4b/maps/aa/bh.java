// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            af, ag, bx, bb, 
//            al, ah, ae, be, 
//            x

final class bh extends af
{
    final class a extends ah
    {

        private bh a;

        public final x a()
        {
            return b().a();
        }

        final ae c()
        {
            return new be(this, bh.a(a));
        }

        final af e()
        {
            return a;
        }

        public final Iterator iterator()
        {
            return b().a();
        }

        private a()
        {
            a = bh.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b extends ag
    {

        private final ag a;

        final ag a()
        {
            return a;
        }

        final ag b()
        {
            return null;
        }

        b(ag ag1, ag ag2)
        {
            super(ag1);
            a = ag2;
        }

        b(Object obj, Object obj1, ag ag1)
        {
            super(obj, obj1);
            a = ag1;
        }
    }


    private static final long serialVersionUID = 0L;
    private final transient ag a[];
    private final transient ag b[];
    private final transient int c;

    bh(int i, ag.a aa[])
    {
        a = new ag[i];
        int j = bx.b(i);
        b = new ag[j];
        c = j - 1;
        j = 0;
        while (j < i) 
        {
            Object obj = aa[j];
            Object obj1 = ((ag.a) (obj)).getKey();
            int k = bx.a(obj1.hashCode());
            k = c & k;
            ag ag1 = b[k];
            if (ag1 != null)
            {
                obj = new b(((ag) (obj)), ag1);
            }
            b[k] = ((ag) (obj));
            a[j] = ((ag) (obj));
            a(obj1, ((ag) (obj)), ag1);
            j++;
        }
    }

    bh(java.util.Map.Entry aentry[])
    {
        int j = aentry.length;
        a = new ag[j];
        int i = bx.b(j);
        b = new ag[i];
        c = i - 1;
        i = 0;
        while (i < j) 
        {
            Object obj = aentry[i];
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            bb.a(obj1, obj);
            int k = bx.a(obj1.hashCode());
            k = c & k;
            ag ag1 = b[k];
            if (ag1 == null)
            {
                obj = new ag.a(obj1, obj);
            } else
            {
                obj = new b(obj1, obj, ag1);
            }
            b[k] = ((ag) (obj));
            a[i] = ((ag) (obj));
            a(obj1, ((ag) (obj)), ag1);
            i++;
        }
    }

    private static void a(Object obj, ag ag1, ag ag2)
    {
        while (ag2 != null) 
        {
            boolean flag;
            if (!obj.equals(ag2.getKey()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag, "key", ((java.util.Map.Entry) (ag1)), ((java.util.Map.Entry) (ag2)));
            ag2 = ag2.a();
        }
    }

    static ag[] a(bh bh1)
    {
        return bh1.a;
    }

    final al b()
    {
        return new a((byte)0);
    }

    final boolean c()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = bx.a(obj.hashCode());
            int j = c;
            ag ag1 = b[i & j];
            while (ag1 != null) 
            {
                if (obj.equals(ag1.getKey()))
                {
                    return ag1.getValue();
                }
                ag1 = ag1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
