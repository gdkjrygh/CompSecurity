// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

// Referenced classes of package b.a:
//            gn, gr, go, gi, 
//            gz, nk, ha, nh, 
//            nc, ot, op, gl, 
//            nj, pc, hl, gh, 
//            no, pe, gq, ga

public final class hc
{

    final int a;
    public ArrayList b;
    public boolean c;
    public boolean d;
    int e;
    private final ga f;

    public hc(ga ga, int i, int j)
    {
        f = ga;
        a = j;
        b = new ArrayList(i);
        e = -1;
        c = false;
        d = false;
    }

    private gn a(gl gl1, gn gn1)
    {
        for (; gn1 != null && !gn1.d.b(gl1); gn1 = go.a(gn1, f)) { }
        return gn1;
    }

    public static void a(HashSet hashset, gl gl1)
    {
        if (!(gl1 instanceof gi)) goto _L2; else goto _L1
_L1:
        hashset.add(((gi)gl1).a);
_L4:
        return;
_L2:
        if (!(gl1 instanceof gz))
        {
            break; /* Loop/switch isn't completed */
        }
        gl1 = ((gz)gl1).a;
        int j = gl1.b();
        int i = 0;
        while (i < j) 
        {
            a(hashset, gl1.a(i));
            i++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(gl1 instanceof ha)) goto _L4; else goto _L5
_L5:
        a(hashset, ((ha)gl1).a);
        return;
    }

    private static void a(HashSet hashset, nh nh1)
    {
        if (nh1 != null)
        {
            Object obj = nh1.g();
            oo oo = ((nc) (obj)).a();
            obj = ((nc) (obj)).b();
            nh1 = nh1.b();
            if (nh1 != ot.j)
            {
                hashset.add(op.a(nh1));
            }
            if (oo != null)
            {
                hashset.add(oo);
            }
            if (obj != null)
            {
                hashset.add(obj);
                return;
            }
        }
    }

    private static boolean a(nh nh1)
    {
        return nh1 != null && nh1.g().a() != null;
    }

    private gn b(gl gl1)
    {
        gn gn1 = a(gl1.a(gl1.f.a(0, gl1.d.e, null)), gl1.d);
        if (gn1 == null)
        {
            throw new pc((new StringBuilder("No expanded opcode for ")).append(gl1).toString());
        } else
        {
            return gn1;
        }
    }

    private boolean c()
    {
        int i = 0;
        int j = b.size();
        boolean flag = false;
        do
        {
            while (i < j) 
            {
                gl gl1 = (gl)b.get(i);
                if (gl1 instanceof hl)
                {
                    gn gn1 = gl1.d;
                    Object obj = (hl)gl1;
                    if (!gn1.d.a(((hl) (obj))))
                    {
                        if (gn1.b == 40)
                        {
                            obj = a(gl1, gn1);
                            if (obj == null)
                            {
                                throw new UnsupportedOperationException("method too long");
                            }
                            b.set(i, gl1.a(((gn) (obj))));
                        } else
                        {
                            gh gh1;
                            hl hl1;
                            try
                            {
                                gh1 = (gh)b.get(i + 1);
                            }
                            catch (IndexOutOfBoundsException indexoutofboundsexception)
                            {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                            catch (ClassCastException classcastexception)
                            {
                                throw new IllegalStateException("unpaired TargetInsn");
                            }
                            hl1 = new hl(go.P, ((gl) (obj)).e, nj.a, ((hl) (obj)).a);
                            b.set(i, hl1);
                            b.add(i, ((hl) (obj)).a(gh1));
                            j++;
                            i++;
                        }
                        flag = true;
                    }
                }
                i++;
            }
            return flag;
        } while (true);
    }

    public final void a(gl gl1)
    {
        boolean flag1;
        flag1 = false;
        b.add(gl1);
        if (!c && gl1.e.a() >= 0)
        {
            c = true;
        }
        if (d) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        if (!(gl1 instanceof gz))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        gl1 = ((gz)gl1).a;
        j = gl1.b();
        i = 0;
_L7:
        boolean flag = flag1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (!a(gl1.a(i))) goto _L6; else goto _L5
_L5:
        flag = true;
_L4:
        if (flag)
        {
            d = true;
        }
_L2:
        return;
_L6:
        i++;
          goto _L7
        flag = flag1;
        if (gl1 instanceof ha)
        {
            flag = flag1;
            if (a(((ha)gl1).a))
            {
                flag = true;
            }
        }
          goto _L4
    }

    final void a(gn agn[])
    {
        int i;
        int j;
        int l;
        int l1;
        if (e < 0)
        {
            j = 0;
        } else
        {
            j = e;
        }
_L6:
        l1 = b.size();
        i = e;
        l = 0;
_L2:
        {
            if (l >= l1)
            {
                break MISSING_BLOCK_LABEL_262;
            }
            gl gl1 = (gl)b.get(l);
            Object obj = agn[l];
            gn gn1 = a(gl1, ((gn) (obj)));
            if (gn1 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = b(gl1).d.c(gl1);
            boolean flag = gl1.d.e;
            int i2 = ((pe) (gl1.f)).K.length;
            int k;
            int i1;
            int j1;
            int k1;
            if (flag && !((BitSet) (obj)).get(0))
            {
                i1 = gl1.f.b(0).i();
            } else
            {
                i1 = 0;
            }
            if (flag)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            for (j1 = 0; k < i2; j1 = k1)
            {
                k1 = j1;
                if (!((BitSet) (obj)).get(k))
                {
                    k1 = j1 + gl1.f.b(k).i();
                }
                k++;
            }

            i1 = Math.max(j1, i1);
            k = i;
            if (i1 > i)
            {
                k = i1;
            }
        }
        agn[l] = gn1;
_L4:
        l++;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        k = i;
        if (obj == gn1) goto _L4; else goto _L3
_L3:
        k = i;
        break MISSING_BLOCK_LABEL_227;
        if (j < i)
        {
            l = b.size();
            for (k = 0; k < l; k++)
            {
                gl1 = (gl)b.get(k);
                if (!(gl1 instanceof gh))
                {
                    b.set(k, gl1.c(i - j));
                }
            }

            j = i;
        } else
        {
            e = j;
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final gn[] a()
    {
        int j = b.size();
        gn agn[] = new gn[j];
        for (int i = 0; i < j; i++)
        {
            agn[i] = ((gl)b.get(i)).d;
        }

        return agn;
    }

    final void b()
    {
        do
        {
            int k = b.size();
            int i = 0;
            int j = 0;
            for (; i < k; i++)
            {
                gl gl1 = (gl)b.get(i);
                if (j < 0)
                {
                    throw new IllegalArgumentException("address < 0");
                }
                gl1.c = j;
                j += gl1.f();
            }

        } while (c());
    }

    final void b(gn agn[])
    {
        int i = 0;
        if (e == 0)
        {
            for (int k = b.size(); i < k; i++)
            {
                gl gl1 = (gl)b.get(i);
                gn gn1 = gl1.d;
                gn gn2 = agn[i];
                if (gn1 != gn2)
                {
                    b.set(i, gl1.a(gn2));
                }
            }

        } else
        {
            int l = b.size();
            ArrayList arraylist = new ArrayList(l * 2);
            int j = 0;
            while (j < l) 
            {
                gl gl2 = (gl)b.get(j);
                gn gn4 = gl2.d;
                Object obj = agn[j];
                Object obj1;
                Object obj2;
                if (obj != null)
                {
                    obj1 = null;
                    obj2 = null;
                } else
                {
                    gn gn3 = b(gl2);
                    obj2 = gn3.d.c(gl2);
                    obj = gl2.f;
                    boolean flag = ((BitSet) (obj2)).get(0);
                    if (gl2.d.e)
                    {
                        ((BitSet) (obj2)).set(0);
                    }
                    obj = ((nj) (obj)).a(((BitSet) (obj2)));
                    if (gl2.d.e)
                    {
                        ((BitSet) (obj2)).set(0, flag);
                    }
                    if (((pe) (obj)).K.length == 0)
                    {
                        obj = null;
                    } else
                    {
                        obj = new gq(gl2.e, ((nj) (obj)));
                    }
                    if (gl2.d.e && !((BitSet) (obj2)).get(0))
                    {
                        obj1 = gl2.f.b(0);
                        obj1 = gl.a(gl2.e, ((nh) (obj1)), ((nh) (obj1)).a(0));
                    } else
                    {
                        obj1 = null;
                    }
                    gl2 = gl2.a(gl2.f.a(0, gl2.d.e, ((BitSet) (obj2))));
                    obj2 = obj;
                    obj = gn3;
                }
                if (obj2 != null)
                {
                    arraylist.add(obj2);
                }
                obj2 = gl2;
                if (obj != gn4)
                {
                    obj2 = gl2.a(((gn) (obj)));
                }
                arraylist.add(obj2);
                if (obj1 != null)
                {
                    arraylist.add(obj1);
                }
                j++;
            }
            b = arraylist;
        }
    }
}
