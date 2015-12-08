// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.be.f;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ab;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bo.bl;
import com.google.android.m4b.maps.bo.h;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bo.x;
import com.google.android.m4b.maps.bw.c;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            b

public final class e extends com.google.android.m4b.maps.bq.b
{
    static final class a extends b.a
    {

        private com.google.android.m4b.maps.ac.a a[];
        private k b;
        private final com.google.android.m4b.maps.bs.e f;

        private com.google.android.m4b.maps.ac.a i()
        {
            boolean flag = false;
            com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.cq.u.a);
            a1.a(1, 128L);
            bl bl1 = ((b)super.c[0].a).h;
            com.google.android.m4b.maps.ac.a a2 = a1.a(2);
            a2.b(21, bl1.a);
            String as[] = bl1.b;
            for (int j = 0; j < as.length; j += 2)
            {
                com.google.android.m4b.maps.ac.a a4 = a2.a(22);
                a4.b(1, as[j]);
                a4.b(2, as[j + 1]);
                a2.a(22, a4);
            }

            a1.b(2, a2);
            for (int l = ((flag) ? 1 : 0); l < super.d; l++)
            {
                ac ac1 = super.c[l].a;
                com.google.android.m4b.maps.ac.a a3 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.cq.e.g);
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
            com.google.android.m4b.maps.ac.a a1 = a[j];
            if (a1 == null)
            {
                return null;
            }
            new x();
            b b1 = (b)super.c[j].a;
            int l = a1.j(3);
            Object obj = new ArrayList();
            for (j = 0; j < l; j++)
            {
                bb bb1 = com.google.android.m4b.maps.bq.e.a(a1.c(3, j), t.a(), b1);
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
            obj = b1.h;
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
            obj = new com.google.android.m4b.maps.bo.ap.a(f);
            obj.a = b1;
            obj.d = abb;
            obj.e = l1;
            return ((com.google.android.m4b.maps.bo.ap.a) (obj)).a();
        }

        public final void a(DataOutput dataoutput)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            i().b(bytearrayoutputstream);
            dataoutput.writeInt(bytearrayoutputstream.size());
            dataoutput.write(bytearrayoutputstream.toByteArray());
        }

        protected final boolean a(b.d d1)
        {
            return super.d == 0 || ((b)d1.a).a((b)super.c[0].a);
        }

        public final boolean a(DataInput datainput)
        {
            datainput = com.google.android.m4b.maps.ac.c.a(com.google.android.m4b.maps.cq.u.b, datainput);
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

        a(com.google.android.m4b.maps.bs.e e1, k k1)
        {
            super(e1);
            a = new com.google.android.m4b.maps.ac.a[8];
            b = k1;
            f = e1;
        }
    }

    public static final class b extends ac
    {

        final bl h;

        public final ac a(af af)
        {
            return new b(super.a(af), h);
        }

        public final boolean a(b b1)
        {
            return h == b1.h;
        }

        public final boolean equals(Object obj)
        {
            while (obj == this || (obj instanceof b) && super.equals(obj) && a((b)obj)) 
            {
                return true;
            }
            return false;
        }

        public final int hashCode()
        {
            return super.hashCode() * 37 + h.hashCode();
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder("[layer: ")).append(h.a);
            stringbuilder.append(" params: ");
            String as[] = h.b;
            for (int i = 0; i < as.length; i += 2)
            {
                stringbuilder.append(as[i]).append('=').append(as[i + 1]);
            }

            stringbuilder.append(" coords: ").append(super.toString()).append(']');
            return stringbuilder.toString();
        }

        private b(ac ac1, bl bl1)
        {
            super(ac1.a, ac1.b, ac1.c, ac1.d);
            h = bl1;
        }
    }


    public e(u u, int i, Locale locale, File file, com.google.android.m4b.maps.bs.e e1)
    {
        super(u, ah.h, new f(), null, 0, true, i, locale, file, e1);
    }

    static bb a(com.google.android.m4b.maps.ac.a a1, t t1, ac ac1)
    {
        if (a1.d(1) != 0 || a1.j(3) == 0 || a1.j(2) == 0)
        {
            return null;
        }
        Object obj2 = a1.c(3, 0);
        if (!((com.google.android.m4b.maps.ac.a) (obj2)).i(31))
        {
            return null;
        }
        com.google.android.m4b.maps.bo.g g = c.a(((com.google.android.m4b.maps.ac.a) (obj2)).f(31));
        if (!ac1.d().a(g))
        {
            return null;
        }
        a1 = a1.c(2, 0);
        Object obj = a1.g(2);
        Object obj5 = a(a1, 3);
        String s = a(a1, 4);
        a(a1, 10);
        Object obj3;
        com.google.android.m4b.maps.bo.a a2;
        int i;
        int j;
        if (a1.i(7))
        {
            i = a1.d(7) / 10;
        } else
        {
            i = 0;
        }
        if (!((com.google.android.m4b.maps.ac.a) (obj2)).i(34)) goto _L2; else goto _L1
_L1:
        j = ((com.google.android.m4b.maps.ac.a) (obj2)).d(34);
        if (j < 0) goto _L2; else goto _L3
_L3:
        a1 = String.valueOf(j);
_L6:
        obj2 = com.google.android.m4b.maps.ak.a.a;
        obj = com.google.android.m4b.maps.ak.a.a(((String) (obj)));
        obj2 = obj;
_L4:
        a2 = new com.google.android.m4b.maps.bo.a(g, 0, 0.0F, null, 0.0F, 0.0F, 0.0F);
        Object obj1;
        if (a1 != null)
        {
            obj = new ArrayList();
            ((List) (obj)).add(new com.google.android.m4b.maps.bo.bk.a(1, a1, 4, null, null, 0, null, 0.0F));
            a1 = new bk(((List) (obj)), ab.b);
        } else
        {
            a1 = null;
        }
        if (obj5 != null)
        {
            obj1 = new ArrayList();
            ((List) (obj1)).add(new com.google.android.m4b.maps.bo.bk.a(2, null, 0, ((String) (obj5)), t.a(), 0, "styleid", 0.0F));
            if (a1 == null)
            {
                obj1 = new bk(((List) (obj1)), ab.b);
                a1 = null;
            } else
            {
                bk bk1 = new bk(((List) (obj1)), ab.b);
                obj1 = a1;
                a1 = bk1;
            }
        } else
        {
            Object obj4 = null;
            obj1 = a1;
            a1 = obj4;
        }
        obj3 = a1;
        if (a1 == null)
        {
            obj3 = new bk(new ArrayList(), ab.b);
        }
        a1 = ((com.google.android.m4b.maps.ac.a) (obj5));
        if (obj5 == null)
        {
            a1 = "";
        }
        obj5 = com.google.android.m4b.maps.bo.ab.a.c;
        return new h(-1, ac1, g, ((com.google.android.m4b.maps.ak.a) (obj2)), new com.google.android.m4b.maps.bo.a[] {
            a2
        }, ((bk) (obj1)), ((bk) (obj3)), new com.google.android.m4b.maps.bo.ab.a[0], s, t1, 0, "styleid", i, 0, 20, 0, null, a1, ((com.google.android.m4b.maps.bo.ab.a) (obj5)), new int[0]);
        obj1;
          goto _L4
_L2:
        a1 = "";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static String a(com.google.android.m4b.maps.ac.a a1, int i)
    {
        if (a1.i(i))
        {
            return a1.g(i);
        } else
        {
            return "";
        }
    }

    public final aa a(ac ac1, boolean flag)
    {
        if (!(ac1 instanceof b))
        {
            throw new ClassCastException("DashServerLayerTileStore only supports LayerCoords");
        } else
        {
            return super.a(ac1, flag);
        }
    }

    public final void a(ac ac1, d d1)
    {
        if (!(ac1 instanceof b))
        {
            throw new ClassCastException("DashServerLayerTileStore only supports LayerCoords");
        } else
        {
            super.a(ac1, d1);
            return;
        }
    }

    protected final b.a d()
    {
        return new a(c, k.a());
    }

    public final ah e()
    {
        return ah.h;
    }
}
