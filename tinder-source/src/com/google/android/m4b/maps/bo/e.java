// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ap, bb

public final class e extends ap
{
    final class a
        implements ap.b
    {

        private int a;
        private int b;
        private e c;

        public final bb a()
        {
            return (bb)c.a.get(a);
        }

        public final void b()
        {
            b = a;
        }

        public final void c()
        {
            a = b;
        }

        public final boolean hasNext()
        {
            return a < c.a.size();
        }

        public final Object next()
        {
            List list = c.a;
            int i1 = a;
            a = i1 + 1;
            return (bb)list.get(i1);
        }

        public final void remove()
        {
            throw new UnsupportedOperationException("remove() not supported");
        }

        private a()
        {
            c = e.this;
            super();
            a = 0;
            b = 0;
        }

        a(byte byte0)
        {
            this();
        }
    }


    List a;
    public Set b;
    private final List l;
    private List m;
    private List n;
    private long o;

    private e(ap ap1, com.google.android.m4b.maps.bs.e e1)
    {
        super(ap1.c, ap1.d, ap1.e, ap1.j, null, null, ap1.g, null, ap1.h, null, -1L, ap1.k, e1);
        b = new HashSet();
        o = -1L;
        l = Collections.unmodifiableList(Arrays.asList(ap1.f));
        a = new ArrayList();
        for (e1 = ap1.l(); e1.hasNext(); a.add(e1.next())) { }
        m = new ArrayList();
        if (ap1.j() != null)
        {
            m.addAll(Arrays.asList(ap1.j()));
        }
        n = new ArrayList();
        if (ap1.i() != null)
        {
            n.addAll(Arrays.asList(ap1.i()));
        }
        o = ap1.m();
    }

    public static ap a(ap ap1, ap ap2, com.google.android.m4b.maps.bs.e e1)
    {
        boolean flag = false;
        long l2 = ap1.m();
        if (l2 < 0L || ap2.m() >= 0L && ap2.m() < l2)
        {
            l2 = ap2.m();
        }
        if (ap2.n() == 0 && l2 == ap1.m())
        {
            return ap1;
        }
        if (ap2.n() > 0)
        {
            e1 = a(ap1, e1);
            e1.b = new HashSet();
            ArrayList arraylist1 = new ArrayList();
            Object obj = new ArrayList();
            ArrayList arraylist = new ArrayList();
            int i1 = 0;
            while (i1 < ap2.n()) 
            {
                if (ap2.i != null)
                {
                    ap1 = ap2.i[i1];
                } else
                {
                    ap1 = null;
                }
                if (ap1 instanceof ao.a)
                {
                    arraylist1.add((ao.a)ap1);
                } else
                if (ap1 instanceof ao.c)
                {
                    ((e) (e1)).b.add(((ao.c)ap1).a());
                } else
                if (ap1 instanceof ao.b)
                {
                    ((ArrayList) (obj)).add((ao.b)ap1);
                } else
                if (ap1 instanceof ao.d)
                {
                    arraylist.add((ao.d)ap1);
                } else
                {
                    ap1 = String.valueOf(ap1);
                    throw new IllegalArgumentException((new StringBuilder(String.valueOf(ap1).length() + 16)).append("Wrong modifier: ").append(ap1).toString());
                }
                i1++;
            }
            ap1 = ((e) (e1)).a.iterator();
            do
            {
                if (!ap1.hasNext())
                {
                    break;
                }
                bb bb1 = (bb)ap1.next();
                if (((e) (e1)).b.contains(bb1.b()))
                {
                    ap1.remove();
                }
            } while (true);
            for (ap1 = arraylist1.iterator(); ap1.hasNext();)
            {
                ao.a a1 = (ao.a)ap1.next();
                for (int j1 = 0; j1 < a1.a().f().length; j1++)
                {
                    int ai[] = a1.a().f();
                    ai[j1] = ai[j1] + ((e) (e1)).m.size();
                }

                if (a1.b() && a1.c() < ((e) (e1)).l.size())
                {
                    bb bb2 = (bb)((e) (e1)).l.get(a1.c());
                    int k1 = ((e) (e1)).a.indexOf(bb2);
                    if (k1 >= 0)
                    {
                        if (a1.d())
                        {
                            ((e) (e1)).a.add(k1, a1.a());
                        } else
                        {
                            ((e) (e1)).a.add(k1 + 1, a1.a());
                        }
                    } else
                    {
                        ((e) (e1)).a.add(a1.a());
                    }
                } else
                {
                    if (a1.c() >= ((e) (e1)).l.size() && ab.a("MutableVectorTile", 6))
                    {
                        String s = String.valueOf(ap2.h);
                        String s1 = String.valueOf(ap2.c);
                        Log.e("MutableVectorTile", (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append("Invalid plane index on tile ").append(s).append(" at ").append(s1).toString());
                    }
                    ((e) (e1)).a.add(a1.a());
                }
            }

            for (ap1 = arraylist.iterator(); ap1.hasNext(); ap1.next()) { }
            for (ap1 = ((ArrayList) (obj)).iterator(); ap1.hasNext(); ((e) (e1)).a.add(0, ((ao.b) (obj)).a()))
            {
                obj = (ao.b)ap1.next();
            }

            ap1 = ap2.i();
            for (int l1 = ((flag) ? 1 : 0); l1 < ap1.length; l1++)
            {
                if (!((e) (e1)).n.contains(ap1[l1]))
                {
                    ((e) (e1)).n.add(ap1[l1]);
                }
            }

            ((e) (e1)).m.addAll(Arrays.asList(ap2.j()));
            e1.o = l2;
            return e1;
        }
        if (ap1 instanceof e)
        {
            ((e)ap1).o = l2;
            return ap1;
        } else
        {
            ap2 = new ap.a(e1);
            ap2.a = ap1.c;
            ap2.b = ap1.d;
            ap2.c = ap1.j;
            ap2.f = ap1.i();
            ap2.g = ap1.j();
            ap2.h = ap1.g;
            ap2.d = ap1.f;
            ap2.i = ap1.h;
            ap2.e = l2;
            ap2.j = ap1.k;
            return ap2.a();
        }
    }

    private static e a(ap ap1, com.google.android.m4b.maps.bs.e e1)
    {
        if (ap1 instanceof e)
        {
            return (e)ap1;
        } else
        {
            return new e(ap1, e1);
        }
    }

    public static ap b(ap ap1, ap ap2, com.google.android.m4b.maps.bs.e e1)
    {
        bb abb[];
        int i1;
        int k1;
        ap1 = a(ap1, e1);
        abb = ap2.f;
        k1 = abb.length;
        i1 = 0;
_L8:
        bb bb1;
        int j1;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        bb1 = abb[i1];
        if (bb1.a() != 6)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        j1 = 0;
_L5:
        if (j1 >= ((e) (ap1)).a.size()) goto _L2; else goto _L1
_L1:
        if (((bb)((e) (ap1)).a.get(j1)).a() != 6) goto _L4; else goto _L3
_L3:
        ((e) (ap1)).a.set(j1, bb1);
_L6:
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        j1++;
          goto _L5
_L2:
        if (ab.a("MutableVectorTile", 5))
        {
            Log.w("MutableVectorTile", "No raster to replace in the base tile. Adding the new raster to the feature collection");
        }
        ((e) (ap1)).a.add(bb1);
          goto _L6
        ((e) (ap1)).a.add(bb1);
          goto _L6
        return a(ap1, ap2, e1);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final bb a(int i1)
    {
        return (bb)a.get(i1);
    }

    public final boolean d()
    {
        return o >= 0L && com.google.android.m4b.maps.ay.k.c() > o;
    }

    public final String[] i()
    {
        return (String[])n.toArray(new String[n.size()]);
    }

    public final String[] j()
    {
        return (String[])m.toArray(new String[m.size()]);
    }

    public final int k()
    {
        return a.size();
    }

    public final ap.b l()
    {
        return new a((byte)0);
    }

    public final long m()
    {
        return o;
    }
}
