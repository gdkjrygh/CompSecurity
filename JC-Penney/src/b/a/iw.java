// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package b.a:
//            kg, iu, jv, ji, 
//            kc, jn, jp, jz, 
//            kb, kh, ow, pf, 
//            ob, ol, kt, kk

public final class iw extends kg
{

    private iu a;
    private ArrayList c;
    private ArrayList d;
    private ArrayList e;

    public iw()
    {
        super(4, -1);
        a = null;
        c = null;
        d = null;
        e = null;
    }

    private static int a(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            return 0;
        } else
        {
            return arraylist.size();
        }
    }

    public final int a(kg kg1)
    {
        if (!c())
        {
            throw new UnsupportedOperationException("uninternable instance");
        } else
        {
            kg1 = (iw)kg1;
            return a.c(((iw) (kg1)).a);
        }
    }

    public final jv a()
    {
        return jv.r;
    }

    public final void a(ji ji1)
    {
        kc kc1 = ji1.b;
        if (a != null)
        {
            a = (iu)kc1.b(a);
        }
        if (c != null)
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext();)
            {
                jn jn1 = (jn)iterator.next();
                jp jp1 = ji1.i;
                kc kc2 = ji1.b;
                jp1.a(jn1.a);
                jn1.b = (iu)kc2.b(jn1.b);
            }

        }
        if (d != null)
        {
            for (Iterator iterator1 = d.iterator(); iterator1.hasNext();)
            {
                jz jz1 = (jz)iterator1.next();
                kb kb1 = ji1.j;
                kc kc3 = ji1.b;
                kb1.a(jz1.a);
                jz1.b = (iu)kc3.b(jz1.b);
            }

        }
        if (e != null)
        {
            kh kh1;
            kc kc4;
            for (Iterator iterator2 = e.iterator(); iterator2.hasNext(); kc4.a(kh1.b))
            {
                kh1 = (kh)iterator2.next();
                kb kb2 = ji1.j;
                kc4 = ji1.b;
                kb2.a(kh1.a);
            }

        }
    }

    protected final void a(kk kk, int i)
    {
        a((a(c) + a(d) + a(e)) * 8 + 16);
    }

    protected final void a_(ji ji1, ow ow1)
    {
        boolean flag = ow1.a();
        int j1 = kg.b(a);
        int i2 = a(c);
        int k = a(d);
        int i = a(e);
        if (flag)
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" annotations directory").toString());
            ow1.a(4, (new StringBuilder("  class_annotations_off: ")).append(pf.a(j1)).toString());
            ow1.a(4, (new StringBuilder("  fields_size:           ")).append(pf.a(i2)).toString());
            ow1.a(4, (new StringBuilder("  methods_size:          ")).append(pf.a(k)).toString());
            ow1.a(4, (new StringBuilder("  parameters_size:       ")).append(pf.a(i)).toString());
        }
        ow1.d(j1);
        ow1.d(i2);
        ow1.d(k);
        ow1.d(i);
        if (i2 != 0)
        {
            Collections.sort(c);
            if (flag)
            {
                ow1.a(0, "  fields:");
            }
            int j2;
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ow1.d(j2))
            {
                jn jn1 = (jn)iterator.next();
                int k1 = ji1.i.b(jn1.a);
                j2 = jn1.b.d();
                if (ow1.a())
                {
                    ow1.a(0, (new StringBuilder("    ")).append(jn1.a.h_()).toString());
                    ow1.a(4, (new StringBuilder("      field_idx:       ")).append(pf.a(k1)).toString());
                    ow1.a(4, (new StringBuilder("      annotations_off: ")).append(pf.a(j2)).toString());
                }
                ow1.d(k1);
            }

        }
        if (k != 0)
        {
            Collections.sort(d);
            if (flag)
            {
                ow1.a(0, "  methods:");
            }
            int l1;
            for (Iterator iterator1 = d.iterator(); iterator1.hasNext(); ow1.d(l1))
            {
                jz jz1 = (jz)iterator1.next();
                int l = ji1.j.b(jz1.a);
                l1 = jz1.b.d();
                if (ow1.a())
                {
                    ow1.a(0, (new StringBuilder("    ")).append(jz1.a.h_()).toString());
                    ow1.a(4, (new StringBuilder("      method_idx:      ")).append(pf.a(l)).toString());
                    ow1.a(4, (new StringBuilder("      annotations_off: ")).append(pf.a(l1)).toString());
                }
                ow1.d(l);
            }

        }
        if (i != 0)
        {
            Collections.sort(e);
            if (flag)
            {
                ow1.a(0, "  parameters:");
            }
            int i1;
            for (Iterator iterator2 = e.iterator(); iterator2.hasNext(); ow1.d(i1))
            {
                kh kh1 = (kh)iterator2.next();
                int j = ji1.j.b(kh1.a);
                i1 = kh1.b.d();
                if (ow1.a())
                {
                    ow1.a(0, (new StringBuilder("    ")).append(kh1.a.h_()).toString());
                    ow1.a(4, (new StringBuilder("      method_idx:      ")).append(pf.a(j)).toString());
                    ow1.a(4, (new StringBuilder("      annotations_off: ")).append(pf.a(i1)).toString());
                }
                ow1.d(j);
            }

        }
    }

    public final boolean b()
    {
        return a == null && c == null && d == null && e == null;
    }

    public final boolean c()
    {
        return a != null && c == null && d == null && e == null;
    }

    public final int hashCode()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.hashCode();
        }
    }
}
