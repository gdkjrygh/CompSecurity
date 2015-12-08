// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

final class ab extends bp
    implements az, Runnable
{

    private static boolean n;
    af a;
    int b;
    int c;
    int d;
    boolean e;
    String f;
    int g;
    int h;
    CharSequence i;
    int j;
    CharSequence k;
    ArrayList l;
    ArrayList m;
    private bb o;
    private af p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;

    public ab(bb bb1)
    {
        u = true;
        g = -1;
        o = bb1;
    }

    private int a(boolean flag)
    {
        if (v)
        {
            throw new IllegalStateException("commit already called");
        }
        boolean flag1 = bb.a;
        v = true;
        if (e)
        {
            g = o.a(this);
        } else
        {
            g = -1;
        }
        o.a(this, flag);
        return g;
    }

    private ag a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        ag ag1 = new ag(this);
        ag1.d = new View(o.h.b);
        int i1 = 0;
        boolean flag1 = false;
        int k1;
        boolean flag3;
        do
        {
            k1 = ((flag4) ? 1 : 0);
            flag3 = flag1;
            if (i1 >= sparsearray.size())
            {
                break;
            }
            if (a(sparsearray.keyAt(i1), ag1, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
            i1++;
        } while (true);
        while (k1 < sparsearray1.size()) 
        {
            int j1 = sparsearray1.keyAt(k1);
            boolean flag2 = flag3;
            if (sparsearray.get(j1) == null)
            {
                flag2 = flag3;
                if (a(j1, ag1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k1++;
            flag3 = flag2;
        }
        sparsearray = ag1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    private static Object a(Object obj, am am1, ArrayList arraylist, jk jk1, View view)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                am1 = am1.R;
                obj1 = obj;
                if (obj != null)
                {
                    b.a(arraylist, am1);
                    if (jk1 != null)
                    {
                        arraylist.removeAll(jk1.values());
                    }
                    if (!arraylist.isEmpty())
                    {
                        break label0;
                    }
                    obj1 = null;
                }
            }
            return obj1;
        }
        arraylist.add(view);
        b.b((Transition)obj, arraylist);
        return obj;
    }

    static jk a(ab ab1, ag ag1, boolean flag, am am1)
    {
        jk jk2 = new jk();
        View view = am1.R;
        jk jk1 = jk2;
        if (view != null)
        {
            jk1 = jk2;
            if (ab1.l != null)
            {
                b.a(jk2, view);
                if (flag)
                {
                    jk1 = a(ab1.l, ab1.m, jk2);
                } else
                {
                    jq.a(jk2, ab1.m);
                    jk1 = jk2;
                }
            }
        }
        if (flag)
        {
            am1 = am1.ac;
            ab1.a(ag1, jk1, true);
            return jk1;
        } else
        {
            ab1 = am1.ab;
            b(ag1, jk1, true);
            return jk1;
        }
    }

    private jk a(ag ag1, am am1, boolean flag)
    {
        jk jk2 = new jk();
        jk jk1 = jk2;
        if (l != null)
        {
            b.a(jk2, am1.R);
            if (flag)
            {
                jq.a(jk2, m);
                jk1 = jk2;
            } else
            {
                jk1 = a(l, m, jk2);
            }
        }
        if (flag)
        {
            am1 = am1.ab;
            a(ag1, jk1, false);
            return jk1;
        } else
        {
            am1 = am1.ac;
            b(ag1, jk1, false);
            return jk1;
        }
    }

    private static jk a(ArrayList arraylist, ArrayList arraylist1, jk jk1)
    {
        if (jk1.isEmpty())
        {
            return jk1;
        }
        jk jk2 = new jk();
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = (View)jk1.get(arraylist.get(i1));
            if (view != null)
            {
                jk2.put(arraylist1.get(i1), view);
            }
        }

        return jk2;
    }

    private void a(int i1, am am1, String s1, int j1)
    {
        am1.B = o;
        if (s1 != null)
        {
            if (am1.H != null && !s1.equals(am1.H))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(am1).append(": was ").append(am1.H).append(" now ").append(s1).toString());
            }
            am1.H = s1;
        }
        if (i1 != 0)
        {
            if (am1.F != 0 && am1.F != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(am1).append(": was ").append(am1.F).append(" now ").append(i1).toString());
            }
            am1.F = i1;
            am1.G = i1;
        }
        s1 = new af();
        s1.c = j1;
        s1.d = am1;
        a(((af) (s1)));
    }

    static void a(ab ab1, ag ag1, int i1, Object obj)
    {
        ab1.a(ag1, i1, obj);
    }

    static void a(ab ab1, ag ag1, am am1, am am2, boolean flag, jk jk1)
    {
        if (flag)
        {
            ab1 = am2.ab;
            return;
        } else
        {
            ab1 = am1.ab;
            return;
        }
    }

    static void a(ab ab1, jk jk1, ag ag1)
    {
        if (ab1.m != null && !jk1.isEmpty())
        {
            ab1 = (View)jk1.get(ab1.m.get(0));
            if (ab1 != null)
            {
                ag1.c.a = ab1;
            }
        }
    }

    private void a(ag ag1, int i1, Object obj)
    {
        if (o.c != null)
        {
            int j1 = 0;
            while (j1 < o.c.size()) 
            {
                am am1 = (am)o.c.get(j1);
                if (am1.R != null && am1.Q != null && am1.G == i1)
                {
                    if (am1.I)
                    {
                        if (!ag1.b.contains(am1.R))
                        {
                            b.a(obj, am1.R, true);
                            ag1.b.add(am1.R);
                        }
                    } else
                    {
                        b.a(obj, am1.R, false);
                        ag1.b.remove(am1.R);
                    }
                }
                j1++;
            }
        }
    }

    private void a(ag ag1, jk jk1, boolean flag)
    {
        int i1;
        int j1;
        if (m == null)
        {
            i1 = 0;
        } else
        {
            i1 = m.size();
        }
        j1 = 0;
        while (j1 < i1) 
        {
            String s1 = (String)l.get(j1);
            Object obj = (View)jk1.get((String)m.get(j1));
            if (obj != null)
            {
                obj = ((View) (obj)).getTransitionName();
                if (flag)
                {
                    a(ag1.a, s1, ((String) (obj)));
                } else
                {
                    a(ag1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private static void a(SparseArray sparsearray, am am1)
    {
        if (am1 != null)
        {
            int i1 = am1.G;
            if (i1 != 0 && !am1.I && am1.i() && am1.R != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, am1);
            }
        }
    }

    private static void a(jk jk1, String s1, String s2)
    {
        if (s1 == null || s2 == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= jk1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.equals(jk1.c(i1))) goto _L4; else goto _L3
_L3:
        jk1.a(i1, s2);
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        jk1.put(s1, s2);
        return;
    }

    private boolean a(int i1, ag ag1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)o.i.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj2 = (am)sparsearray1.get(i1);
        Object obj3 = (am)sparsearray.get(i1);
        Object obj;
        if (obj2 == null)
        {
            obj = null;
        } else
        {
            if (flag)
            {
                if (((am) (obj2)).Z == am.i)
                {
                    sparsearray = null;
                } else
                {
                    sparsearray = ((SparseArray) (((am) (obj2)).Z));
                }
            } else
            {
                sparsearray = null;
            }
            obj = b.a(sparsearray);
        }
        if (obj2 == null || obj3 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag)
            {
                if (((am) (obj3)).aa == am.i)
                {
                    sparsearray = null;
                } else
                {
                    sparsearray = ((SparseArray) (((am) (obj3)).aa));
                }
            } else
            {
                sparsearray = null;
            }
            if (sparsearray == null)
            {
                sparsearray = null;
            } else
            {
                sparsearray1 = (Transition)sparsearray;
                if (sparsearray1 == null)
                {
                    sparsearray = null;
                } else
                {
                    sparsearray = new TransitionSet();
                    sparsearray.addTransition(sparsearray1);
                }
            }
        }
        do
        {
            Object obj1;
            ArrayList arraylist;
            if (obj3 == null)
            {
                obj1 = null;
            } else
            {
                if (flag)
                {
                    if (((am) (obj3)).Y == am.i)
                    {
                        sparsearray1 = null;
                    } else
                    {
                        sparsearray1 = ((SparseArray) (((am) (obj3)).Y));
                    }
                } else
                {
                    sparsearray1 = null;
                }
                obj1 = b.a(sparsearray1);
            }
            sparsearray1 = null;
            arraylist = new ArrayList();
            if (sparsearray != null)
            {
                sparsearray1 = a(ag1, ((am) (obj3)), flag);
                if (sparsearray1.isEmpty())
                {
                    sparsearray1 = null;
                    sparsearray = null;
                } else
                {
                    du du;
                    if (flag)
                    {
                        du = ((am) (obj3)).ab;
                    } else
                    {
                        du = ((am) (obj2)).ab;
                    }
                    viewgroup.getViewTreeObserver().addOnPreDrawListener(new ad(this, viewgroup, sparsearray, arraylist, ag1, flag, ((am) (obj2)), ((am) (obj3))));
                }
            }
            if (obj == null && sparsearray == null && obj1 == null)
            {
                return false;
            }
            ArrayList arraylist1 = new ArrayList();
            Object obj4 = a(obj1, ((am) (obj3)), arraylist1, ((jk) (sparsearray1)), ag1.d);
            if (m != null && sparsearray1 != null)
            {
                obj1 = (View)sparsearray1.get(m.get(0));
                if (obj1 != null)
                {
                    if (obj4 != null)
                    {
                        b.a(obj4, ((View) (obj1)));
                    }
                    if (sparsearray != null)
                    {
                        b.a(sparsearray, ((View) (obj1)));
                    }
                }
            }
            Object obj5 = new ac(this, ((am) (obj2)));
            obj1 = new ArrayList();
            obj3 = new jk();
            if (obj2 == null);
            Transition transition = (Transition)obj;
            Transition transition1 = (Transition)obj4;
            Transition transition2 = (Transition)sparsearray;
            if (transition != null)
            {
                if (transition1 == null);
            }
            obj2 = new TransitionSet();
            if (transition != null)
            {
                ((TransitionSet) (obj2)).addTransition(transition);
            }
            if (transition1 != null)
            {
                ((TransitionSet) (obj2)).addTransition(transition1);
            }
            if (transition2 != null)
            {
                ((TransitionSet) (obj2)).addTransition(transition2);
            }
            if (obj2 != null)
            {
                b.a(obj, sparsearray, viewgroup, ((bv) (obj5)), ag1.d, ag1.c, ag1.a, ((ArrayList) (obj1)), sparsearray1, ((Map) (obj3)), arraylist);
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new ae(this, viewgroup, ag1, i1, obj2));
                b.a(obj2, ag1.d, true);
                a(ag1, i1, obj2);
                TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj2);
                sparsearray1 = ag1.d;
                ag1 = ag1.b;
                obj = (Transition)obj;
                obj4 = (Transition)obj4;
                sparsearray = (Transition)sparsearray;
                obj5 = (Transition)obj2;
                if (obj5 != null)
                {
                    viewgroup.getViewTreeObserver().addOnPreDrawListener(new bt(viewgroup, ((Transition) (obj)), ((ArrayList) (obj1)), ((Transition) (obj4)), arraylist1, sparsearray, arraylist, ((Map) (obj3)), ag1, ((Transition) (obj5)), sparsearray1));
                }
            }
            if (obj2 != null)
            {
                return true;
            }
            return false;
        } while (true);
    }

    private static void b(ag ag1, jk jk1, boolean flag)
    {
        int j1 = jk1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)jk1.b(i1);
            String s2 = ((View)jk1.c(i1)).getTransitionName();
            if (flag)
            {
                a(ag1.a, s1, s2);
            } else
            {
                a(ag1.a, s2, s1);
            }
            i1++;
        }
    }

    private static void b(SparseArray sparsearray, am am1)
    {
        if (am1 != null)
        {
            int i1 = am1.G;
            if (i1 != 0)
            {
                sparsearray.put(i1, am1);
            }
        }
    }

    private void b(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (o.i.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        af af1 = a;
_L12:
        if (af1 == null) goto _L1; else goto _L3
_L3:
        af1.c;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 82
    //                   2 94
    //                   3 212
    //                   4 224
    //                   5 236
    //                   6 248
    //                   7 260;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_260;
_L13:
        af1 = af1.a;
          goto _L12
_L5:
        b(sparsearray1, af1.d);
          goto _L13
_L6:
        am am1 = af1.d;
        am am2;
        if (o.c != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    am2 = am1;
                    if (i1 >= o.c.size())
                    {
                        break label0;
                    }
                    am am3 = (am)o.c.get(i1);
                    if (am1 != null)
                    {
                        am2 = am1;
                        if (am3.G != am1.G)
                        {
                            break label1;
                        }
                    }
                    if (am3 == am1)
                    {
                        am2 = null;
                    } else
                    {
                        a(sparsearray, am3);
                        am2 = am1;
                    }
                }
                i1++;
                am1 = am2;
            } while (true);
        } else
        {
            am2 = am1;
        }
        b(sparsearray1, am2);
          goto _L13
_L7:
        a(sparsearray, af1.d);
          goto _L13
_L8:
        a(sparsearray, af1.d);
          goto _L13
_L9:
        b(sparsearray1, af1.d);
          goto _L13
_L10:
        a(sparsearray, af1.d);
          goto _L13
        b(sparsearray1, af1.d);
          goto _L13
    }

    public final ag a(boolean flag, ag ag1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        Object obj;
        boolean flag1 = bb.a;
        obj = ag1;
        if (!n) goto _L2; else goto _L1
_L1:
        if (ag1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        obj = ag1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        obj = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int k1;
        int l1;
        b(-1);
        String s1;
        if (obj != null)
        {
            i1 = 0;
        } else
        {
            i1 = d;
        }
        if (obj != null)
        {
            j1 = 0;
        } else
        {
            j1 = c;
        }
        ag1 = p;
_L17:
        if (ag1 == null) goto _L8; else goto _L7
_L7:
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((af) (ag1)).g;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((af) (ag1)).h;
        }
        ((af) (ag1)).c;
        JVM INSTR tableswitch 1 7: default 140
    //                   1 287
    //                   2 321
    //                   3 410
    //                   4 433
    //                   5 462
    //                   6 491
    //                   7 520;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((af) (ag1)).c).toString());
_L4:
        obj = ag1;
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        sparsearray = m;
        sparsearray1 = l;
        obj = ag1;
        if (sparsearray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
        do
        {
            obj = ag1;
            if (i1 >= sparsearray.size())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (String)sparsearray.get(i1);
            s1 = (String)sparsearray1.get(i1);
            a(ag1.a, ((String) (obj)), s1);
            i1++;
        } while (true);
        continue; /* Loop/switch isn't completed */
_L10:
        sparsearray = ((af) (ag1)).d;
        sparsearray.P = l1;
        o.a(sparsearray, bb.c(j1), i1);
_L18:
        ag1 = ((af) (ag1)).b;
          goto _L17
_L11:
        sparsearray = ((af) (ag1)).d;
        if (sparsearray != null)
        {
            sparsearray.P = l1;
            o.a(sparsearray, bb.c(j1), i1);
        }
        if (((af) (ag1)).i != null)
        {
            l1 = 0;
            while (l1 < ((af) (ag1)).i.size()) 
            {
                sparsearray = (am)((af) (ag1)).i.get(l1);
                sparsearray.P = k1;
                o.a(sparsearray, false);
                l1++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((af) (ag1)).d;
        sparsearray.P = k1;
        o.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((af) (ag1)).d;
        sparsearray.P = k1;
        o.c(sparsearray, bb.c(j1), i1);
          goto _L18
_L14:
        sparsearray = ((af) (ag1)).d;
        sparsearray.P = l1;
        o.b(sparsearray, bb.c(j1), i1);
          goto _L18
_L15:
        sparsearray = ((af) (ag1)).d;
        sparsearray.P = k1;
        o.e(sparsearray, bb.c(j1), i1);
          goto _L18
_L16:
        sparsearray = ((af) (ag1)).d;
        sparsearray.P = k1;
        o.d(sparsearray, bb.c(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            o.a(o.g, bb.c(j1), i1, true);
            obj = null;
        }
        if (g < 0) goto _L20; else goto _L19
_L19:
        ag1 = o;
        i1 = g;
        ag1;
        JVM INSTR monitorenter ;
        ((bb) (ag1)).e.set(i1, null);
        if (((bb) (ag1)).f == null)
        {
            ag1.f = new ArrayList();
        }
        ((bb) (ag1)).f.add(Integer.valueOf(i1));
        ag1;
        JVM INSTR monitorexit ;
        g = -1;
_L20:
        return ((ag) (obj));
        sparsearray;
        ag1;
        JVM INSTR monitorexit ;
        throw sparsearray;
        if (true) goto _L2; else goto _L21
_L21:
    }

    public final bp a()
    {
        if (e)
        {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        } else
        {
            u = false;
            return this;
        }
    }

    public final bp a(int i1)
    {
        c = 0;
        return this;
    }

    public final bp a(int i1, int j1)
    {
        return a(i1, j1, 0, 0);
    }

    public final bp a(int i1, int j1, int k1, int l1)
    {
        q = i1;
        r = j1;
        s = k1;
        t = l1;
        return this;
    }

    public final bp a(int i1, am am1)
    {
        a(i1, am1, ((String) (null)), 1);
        return this;
    }

    public final bp a(int i1, am am1, String s1)
    {
        a(i1, am1, s1, 1);
        return this;
    }

    public final bp a(am am1)
    {
        af af1 = new af();
        af1.c = 3;
        af1.d = am1;
        a(af1);
        return this;
    }

    public final bp a(am am1, String s1)
    {
        a(0, am1, s1, 1);
        return this;
    }

    public final bp a(String s1)
    {
        if (!u)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            e = true;
            f = s1;
            return this;
        }
    }

    final void a(af af1)
    {
        if (a == null)
        {
            p = af1;
            a = af1;
        } else
        {
            af1.b = p;
            p.a = af1;
            p = af1;
        }
        af1.e = q;
        af1.f = r;
        af1.g = s;
        af1.h = t;
        b = b + 1;
    }

    public final void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (o.i.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        af af1 = a;
_L12:
        if (af1 == null) goto _L1; else goto _L3
_L3:
        af1.c;
        JVM INSTR tableswitch 1 7: default 68
    //                   1 76
    //                   2 87
    //                   3 146
    //                   4 157
    //                   5 168
    //                   6 179
    //                   7 190;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_190;
_L13:
        af1 = af1.a;
          goto _L12
_L5:
        a(sparsearray, af1.d);
          goto _L13
_L6:
        if (af1.i != null)
        {
            for (int i1 = af1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (am)af1.i.get(i1));
            }

        }
        a(sparsearray, af1.d);
          goto _L13
_L7:
        b(sparsearray1, af1.d);
          goto _L13
_L8:
        b(sparsearray1, af1.d);
          goto _L13
_L9:
        a(sparsearray, af1.d);
          goto _L13
_L10:
        b(sparsearray1, af1.d);
          goto _L13
        a(sparsearray, af1.d);
          goto _L13
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        af af1;
        String s3;
        int i1;
        printwriter.print(s1);
        printwriter.print("mName=");
        printwriter.print(f);
        printwriter.print(" mIndex=");
        printwriter.print(g);
        printwriter.print(" mCommitted=");
        printwriter.println(v);
        if (c != 0)
        {
            printwriter.print(s1);
            printwriter.print("mTransition=#");
            printwriter.print(Integer.toHexString(c));
            printwriter.print(" mTransitionStyle=#");
            printwriter.println(Integer.toHexString(d));
        }
        if (q != 0 || r != 0)
        {
            printwriter.print(s1);
            printwriter.print("mEnterAnim=#");
            printwriter.print(Integer.toHexString(q));
            printwriter.print(" mExitAnim=#");
            printwriter.println(Integer.toHexString(r));
        }
        if (s != 0 || t != 0)
        {
            printwriter.print(s1);
            printwriter.print("mPopEnterAnim=#");
            printwriter.print(Integer.toHexString(s));
            printwriter.print(" mPopExitAnim=#");
            printwriter.println(Integer.toHexString(t));
        }
        if (h != 0 || i != null)
        {
            printwriter.print(s1);
            printwriter.print("mBreadCrumbTitleRes=#");
            printwriter.print(Integer.toHexString(h));
            printwriter.print(" mBreadCrumbTitleText=");
            printwriter.println(i);
        }
        if (j != 0 || k != null)
        {
            printwriter.print(s1);
            printwriter.print("mBreadCrumbShortTitleRes=#");
            printwriter.print(Integer.toHexString(j));
            printwriter.print(" mBreadCrumbShortTitleText=");
            printwriter.println(k);
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_802;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        af1 = a;
        i1 = 0;
_L13:
        if (af1 == null) goto _L2; else goto _L1
_L1:
        af1.c;
        JVM INSTR tableswitch 0 7: default 420
    //                   0 689
    //                   1 696
    //                   2 703
    //                   3 710
    //                   4 717
    //                   5 724
    //                   6 731
    //                   7 738;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_738;
_L3:
        String s2 = (new StringBuilder("cmd=")).append(af1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(af1.d);
        if (af1.e != 0 || af1.f != 0)
        {
            printwriter.print(s1);
            printwriter.print("enterAnim=#");
            printwriter.print(Integer.toHexString(af1.e));
            printwriter.print(" exitAnim=#");
            printwriter.println(Integer.toHexString(af1.f));
        }
        if (af1.g != 0 || af1.h != 0)
        {
            printwriter.print(s1);
            printwriter.print("popEnterAnim=#");
            printwriter.print(Integer.toHexString(af1.g));
            printwriter.print(" popExitAnim=#");
            printwriter.println(Integer.toHexString(af1.h));
        }
        if (af1.i != null && af1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < af1.i.size()) 
            {
                printwriter.print(s3);
                if (af1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (j1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s3);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                }
                printwriter.println(af1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_786;
_L4:
        s2 = "NULL";
          goto _L12
_L5:
        s2 = "ADD";
          goto _L12
_L6:
        s2 = "REPLACE";
          goto _L12
_L7:
        s2 = "REMOVE";
          goto _L12
_L8:
        s2 = "HIDE";
          goto _L12
_L9:
        s2 = "SHOW";
          goto _L12
_L10:
        s2 = "DETACH";
          goto _L12
        s2 = "ATTACH";
          goto _L12
        af1 = af1.a;
        i1++;
          goto _L13
_L2:
    }

    public final int b()
    {
        return a(false);
    }

    public final bp b(int i1, am am1)
    {
        return b(i1, am1, ((String) (null)));
    }

    public final bp b(int i1, am am1, String s1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, am1, s1, 2);
            return this;
        }
    }

    public final bp b(am am1)
    {
        af af1 = new af();
        af1.c = 4;
        af1.d = am1;
        a(af1);
        return this;
    }

    final void b(int i1)
    {
        if (e)
        {
            boolean flag = bb.a;
            af af1 = a;
            while (af1 != null) 
            {
                if (af1.d != null)
                {
                    am am1 = af1.d;
                    am1.A = am1.A + i1;
                    boolean flag1 = bb.a;
                }
                if (af1.i != null)
                {
                    for (int j1 = af1.i.size() - 1; j1 >= 0; j1--)
                    {
                        am am2 = (am)af1.i.get(j1);
                        am2.A = am2.A + i1;
                        boolean flag2 = bb.a;
                    }

                }
                af1 = af1.a;
            }
        }
    }

    public final int c()
    {
        return a(true);
    }

    public final bp c(am am1)
    {
        af af1 = new af();
        af1.c = 5;
        af1.d = am1;
        a(af1);
        return this;
    }

    public final bp d(am am1)
    {
        af af1 = new af();
        af1.c = 6;
        af1.d = am1;
        a(af1);
        return this;
    }

    public final String d()
    {
        return f;
    }

    public final bp e(am am1)
    {
        af af1 = new af();
        af1.c = 7;
        af1.d = am1;
        a(af1);
        return this;
    }

    public final boolean e()
    {
        return b == 0;
    }

    public final void run()
    {
        boolean flag = bb.a;
        if (e && g < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        b(1);
        Object obj;
        Object obj1;
        af af1;
        am am1;
        am am2;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (n)
        {
            SparseArray sparsearray = new SparseArray();
            obj1 = new SparseArray();
            b(sparsearray, ((SparseArray) (obj1)));
            obj1 = a(sparsearray, ((SparseArray) (obj1)), false);
        } else
        {
            obj1 = null;
        }
        if (obj1 != null)
        {
            i1 = 0;
        } else
        {
            i1 = d;
        }
        if (obj1 != null)
        {
            j1 = 0;
        } else
        {
            j1 = c;
        }
        af1 = a;
        if (af1 == null)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        if (obj1 != null)
        {
            k1 = 0;
        } else
        {
            k1 = af1.e;
        }
        if (obj1 != null)
        {
            l1 = 0;
        } else
        {
            l1 = af1.f;
        }
        af1.c;
        JVM INSTR tableswitch 1 7: default 156
    //                   1 220
    //                   2 248
    //                   3 457
    //                   4 483
    //                   5 509
    //                   6 535
    //                   7 561;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_561;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(af1.c).toString());
_L2:
        obj = af1.d;
        obj.P = k1;
        o.a(((am) (obj)), false);
_L12:
        af1 = af1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_90;
_L9:
        obj = af1.d;
        j2 = ((am) (obj)).G;
        if (o.c != null)
        {
            i2 = 0;
            do
            {
                am1 = ((am) (obj));
                if (i2 >= o.c.size())
                {
                    break;
                }
                am2 = (am)o.c.get(i2);
                flag = bb.a;
                am1 = ((am) (obj));
                if (am2.G == j2)
                {
                    if (am2 == obj)
                    {
                        af1.d = null;
                        am1 = null;
                    } else
                    {
                        if (af1.i == null)
                        {
                            af1.i = new ArrayList();
                        }
                        af1.i.add(am2);
                        am2.P = l1;
                        if (e)
                        {
                            am2.A = am2.A + 1;
                            flag = bb.a;
                        }
                        o.a(am2, j1, i1);
                        am1 = ((am) (obj));
                    }
                }
                i2++;
                obj = am1;
            } while (true);
        } else
        {
            am1 = ((am) (obj));
        }
        if (am1 != null)
        {
            am1.P = k1;
            o.a(am1, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = af1.d;
        obj.P = l1;
        o.a(((am) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = af1.d;
        obj.P = l1;
        o.b(((am) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = af1.d;
        obj.P = k1;
        o.c(((am) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = af1.d;
        obj.P = l1;
        o.d(((am) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
        obj = af1.d;
        obj.P = k1;
        o.e(((am) (obj)), j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        o.a(o.g, j1, i1, true);
        if (e)
        {
            obj = o;
            if (((bb) (obj)).d == null)
            {
                obj.d = new ArrayList();
            }
            ((bb) (obj)).d.add(this);
            ((bb) (obj)).j();
        }
        return;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (g >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(g);
        }
        if (f != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(f);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
    }
}
