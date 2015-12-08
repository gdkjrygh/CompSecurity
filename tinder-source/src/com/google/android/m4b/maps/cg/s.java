// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.cq.z;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            t, y, z

public final class s extends n
{
    public static interface a
    {

        public abstract void a();
    }


    public final m a;
    private final a b;
    private final List c;

    public s(List list, a a1, m m)
    {
        b = a1;
        c = list;
        a = m;
    }

    public final void a(DataOutput dataoutput)
    {
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(z.a);
        com.google.android.m4b.maps.ac.a a2;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); a1.a(3, a2))
        {
            t t1 = (t)iterator.next();
            a2 = new com.google.android.m4b.maps.ac.a(z.b);
            a2.a(1, t1.a.a.a());
            a2.a(2, t1.b());
        }

        com.google.android.m4b.maps.ac.c.a(dataoutput, a1);
    }

    public final boolean a(DataInput datainput)
    {
        datainput = com.google.android.m4b.maps.ac.c.a(z.c, datainput);
        for (int i = 0; i < datainput.j(4); i++)
        {
            Object obj = datainput.c(4, i);
            if (((com.google.android.m4b.maps.ac.a) (obj)).d(1) == 1)
            {
                t t1 = (t)c.get(i);
                String s1 = ((com.google.android.m4b.maps.ac.a) (obj)).g(2);
                obj = ((com.google.android.m4b.maps.ac.a) (obj)).g(3);
                t1.b = s1;
                t1.c = ((String) (obj));
            }
        }

        return true;
    }

    public final void b()
    {
        super.b();
        b.a();
    }

    public final int g()
    {
        return 149;
    }
}
