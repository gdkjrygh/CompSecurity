// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package b.a:
//            kg, jv, kc, kk, 
//            ju, kt, ow, pf, 
//            ji

public final class jw extends kg
{

    private final jv a;
    private final kk c;
    private final ju d;
    private final ju e;
    private final int f;

    private jw(jv jv1, kk kk1, ju ju1, ju ju2, int i)
    {
        super(4, 12);
        if (jv1 == null)
        {
            throw new NullPointerException("type == null");
        }
        if (kk1 == null)
        {
            throw new NullPointerException("section == null");
        }
        if (ju1 == null)
        {
            throw new NullPointerException("firstItem == null");
        }
        if (ju2 == null)
        {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("itemCount <= 0");
        } else
        {
            a = jv1;
            c = kk1;
            d = ju1;
            e = ju2;
            f = i;
            return;
        }
    }

    private jw(kk kk1)
    {
        super(4, 12);
        if (kk1 == null)
        {
            throw new NullPointerException("section == null");
        } else
        {
            a = jv.h;
            c = kk1;
            d = null;
            e = null;
            f = 1;
            return;
        }
    }

    public static void a(kk akk[], kc kc1)
    {
        if (akk == null)
        {
            throw new NullPointerException("sections == null");
        }
        if (kc1.a().size() != 0)
        {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arraylist = new ArrayList(50);
        int l = akk.length;
        int j = 0;
        while (j < l) 
        {
            kk kk1 = akk[j];
            Iterator iterator = kk1.a().iterator();
            int i = 0;
            ju ju2 = null;
            ju ju1 = null;
            jv jv1 = null;
            while (iterator.hasNext()) 
            {
                ju ju3 = (ju)iterator.next();
                jv jv3 = ju3.a();
                jv jv2 = jv1;
                ju ju4 = ju1;
                int k = i;
                if (jv3 != jv1)
                {
                    if (i != 0)
                    {
                        arraylist.add(new jw(jv1, kk1, ju1, ju2, i));
                    }
                    k = 0;
                    ju4 = ju3;
                    jv2 = jv3;
                }
                i = k + 1;
                ju2 = ju3;
                jv1 = jv2;
                ju1 = ju4;
            }
            if (i != 0)
            {
                arraylist.add(new jw(jv1, kk1, ju1, ju2, i));
            } else
            if (kk1 == kc1)
            {
                arraylist.add(new jw(kc1));
            }
            j++;
        }
        kc1.a(new kt(jv.h, arraylist));
    }

    public final jv a()
    {
        return jv.s;
    }

    public final void a(ji ji)
    {
    }

    protected final void a_(ji ji, ow ow1)
    {
        int j = a.b();
        int i;
        if (d == null)
        {
            i = c.e();
        } else
        {
            i = c.a(d);
        }
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(' ').append(a.c()).append(" map").toString());
            ow1.a(2, (new StringBuilder("  type:   ")).append(pf.b(j)).append(" // ").append(a.toString()).toString());
            ow1.a(2, "  unused: 0");
            ow1.a(4, (new StringBuilder("  size:   ")).append(pf.a(f)).toString());
            ow1.a(4, (new StringBuilder("  offset: ")).append(pf.a(i)).toString());
        }
        ow1.c(j);
        ow1.c(0);
        ow1.d(f);
        ow1.d(i);
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append('{');
        stringbuffer.append(c.toString());
        stringbuffer.append(' ');
        stringbuffer.append(a.h_());
        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
