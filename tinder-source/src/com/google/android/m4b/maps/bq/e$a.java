// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bl;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bo.x;
import com.google.android.m4b.maps.cq.e;
import com.google.android.m4b.maps.cq.u;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            e

static final class f extends f
{

    private a a[];
    private k b;
    private final com.google.android.m4b.maps.bs.e f;

    private a i()
    {
        boolean flag = false;
        a a1 = new a(u.a);
        a1.a(1, 128L);
        bl bl1 = ((nit>)super.c[0].a).h;
        a a2 = a1.a(2);
        a2.b(21, bl1.a);
        String as[] = bl1.b;
        for (int j = 0; j < as.length; j += 2)
        {
            a a4 = a2.a(22);
            a4.b(1, as[j]);
            a4.b(2, as[j + 1]);
            a2.a(22, a4);
        }

        a1.b(2, a2);
        for (int l = ((flag) ? 1 : 0); l < super.d; l++)
        {
            ac ac1 = super.c[l].a;
            a a3 = new a(e.g);
            a3.a(1, 8L);
            a3.a(30, al.a(ac1.b, ac1.c, ac1.a));
            a3.a(2, 0L);
            a3.a(3, 0L);
            a3.a(4, 0L);
            a1.a(3, a3);
        }

        return a1;
    }

    public final aa a(int j)
    {
        boolean flag = false;
        a a1 = a[j];
        if (a1 == null)
        {
            return null;
        }
        new x();
          = (nit>)super.c[j].a;
        int l = a1.j(3);
        Object obj = new ArrayList();
        for (j = 0; j < l; j++)
        {
            bb bb1 = com.google.android.m4b.maps.bq.e.a(a1.c(3, j), t.a(), );
            if (bb1 == null)
            {
                continue;
            }
            ((ArrayList) (obj)).add(bb1);
            if (((ArrayList) (obj)).size() == 20)
            {
                break;
            }
        }

        bb abb[] = (bb[])((ArrayList) (obj)).toArray(new bb[((ArrayList) (obj)).size()]);
        obj = .h;
        long l1 = -1L;
        j = ((flag) ? 1 : 0);
        if (((bl) (obj)).c >= 0L)
        {
            j = 1;
        }
        if (j != 0)
        {
            l1 = k.c() + ((bl) (obj)).c;
        }
        obj = new com.google.android.m4b.maps.bo.(f);
        obj.a = ;
        obj.d = abb;
        obj.e = l1;
        return ((com.google.android.m4b.maps.bo.) (obj)).a();
    }

    public final void a(DataOutput dataoutput)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        i().b(bytearrayoutputstream);
        dataoutput.writeInt(bytearrayoutputstream.size());
        dataoutput.write(bytearrayoutputstream.toByteArray());
    }

    protected final boolean a(eArray earray)
    {
        return super.d == 0 || ((d)earray.a).a((a)super.c[0].a);
    }

    public final boolean a(DataInput datainput)
    {
        datainput = c.a(u.b, datainput);
        int l = datainput.j(2);
        if (l == super.d)
        {
            int j = 0;
            while (j < l) 
            {
                a[j] = datainput.c(2, j);
                j++;
            }
        }
        return true;
    }

    public final int g()
    {
        return 36;
    }

    (com.google.android.m4b.maps.bs.e e1, k k1)
    {
        super(e1);
        a = new a[8];
        b = k1;
        f = e1;
    }
}
