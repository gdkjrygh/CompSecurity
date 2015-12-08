// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
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

public final class o extends ah
    implements Runnable
{

    private static boolean n;
    public p a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public CharSequence i;
    public int j;
    public CharSequence k;
    public ArrayList l;
    public ArrayList m;
    private ac o;
    private p p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;

    public o(ac ac1)
    {
        s = true;
        g = -1;
        o = ac1;
    }

    private int a(boolean flag)
    {
        if (t)
        {
            throw new IllegalStateException("commit already called");
        }
        boolean flag1 = ac.a;
        t = true;
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

    private static hc a(ArrayList arraylist, ArrayList arraylist1, hc hc1)
    {
        if (hc1.isEmpty())
        {
            return hc1;
        }
        hc hc2 = new hc();
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = (View)hc1.get(arraylist.get(i1));
            if (view != null)
            {
                hc2.put(arraylist1.get(i1), view);
            }
        }

        return hc2;
    }

    static hc a(o o1, q q1, boolean flag, Fragment fragment)
    {
        hc hc2 = new hc();
        View view = fragment.M;
        hc hc1 = hc2;
        if (view != null)
        {
            hc1 = hc2;
            if (o1.l != null)
            {
                ai.a(hc2, view);
                if (flag)
                {
                    hc1 = a(o1.l, o1.m, hc2);
                } else
                {
                    hi.a(hc2, o1.m);
                    hc1 = hc2;
                }
            }
        }
        if (flag)
        {
            fragment = fragment.X;
            o1.a(q1, hc1, true);
            return hc1;
        } else
        {
            o1 = fragment.W;
            b(q1, hc1, true);
            return hc1;
        }
    }

    private hc a(q q1, Fragment fragment, boolean flag)
    {
        hc hc2 = new hc();
        hc hc1 = hc2;
        if (l != null)
        {
            ai.a(hc2, fragment.M);
            if (flag)
            {
                hi.a(hc2, m);
                hc1 = hc2;
            } else
            {
                hc1 = a(l, m, hc2);
            }
        }
        if (flag)
        {
            fragment = fragment.W;
            a(q1, hc1, false);
            return hc1;
        } else
        {
            fragment = fragment.X;
            b(q1, hc1, false);
            return hc1;
        }
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, hc hc1, View view)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                fragment = fragment.M;
                obj1 = obj;
                if (obj != null)
                {
                    ai.a(arraylist, fragment);
                    if (hc1 != null)
                    {
                        arraylist.removeAll(hc1.values());
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
        ai.b((Transition)obj, arraylist);
        return obj;
    }

    private q a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        q q1 = new q();
        q1.d = new View(o.h.b);
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
            if (a(sparsearray.keyAt(i1), q1, flag, sparsearray, sparsearray1))
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
                if (a(j1, q1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k1++;
            flag3 = flag2;
        }
        sparsearray = q1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        fragment.v = o;
        if (s1 != null)
        {
            if (fragment.B != null && !s1.equals(fragment.B))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.B).append(" now ").append(s1).toString());
            }
            fragment.B = s1;
        }
        if (i1 != 0)
        {
            if (fragment.z != 0 && fragment.z != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.z).append(" now ").append(i1).toString());
            }
            fragment.z = i1;
            fragment.A = i1;
        }
        s1 = new p();
        s1.c = j1;
        s1.d = fragment;
        a(((p) (s1)));
    }

    static void a(Fragment fragment, Fragment fragment1, boolean flag)
    {
        if (flag)
        {
            fragment = fragment1.W;
            return;
        } else
        {
            fragment = fragment.W;
            return;
        }
    }

    private static void a(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.A;
            if (i1 != 0 && !fragment.C && fragment.o() && fragment.M != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private static void a(hc hc1, String s1, String s2)
    {
        if (s1 == null || s2 == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= hc1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.equals(hc1.c(i1))) goto _L4; else goto _L3
_L3:
        hc1.a(i1, s2);
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        hc1.put(s1, s2);
        return;
    }

    static void a(o o1, hc hc1, q q1)
    {
        if (o1.m != null && !hc1.isEmpty())
        {
            o1 = (View)hc1.get(o1.m.get(0));
            if (o1 != null)
            {
                q1.c.a = o1;
            }
        }
    }

    static void a(o o1, q q1, int i1, Object obj)
    {
        o1.a(q1, i1, obj);
    }

    private void a(q q1, int i1, Object obj)
    {
        if (o.c != null)
        {
            int j1 = 0;
            while (j1 < o.c.size()) 
            {
                Fragment fragment = (Fragment)o.c.get(j1);
                if (fragment.M != null && fragment.L != null && fragment.A == i1)
                {
                    if (fragment.C)
                    {
                        if (!q1.b.contains(fragment.M))
                        {
                            ai.a(obj, fragment.M, true);
                            q1.b.add(fragment.M);
                        }
                    } else
                    {
                        ai.a(obj, fragment.M, false);
                        q1.b.remove(fragment.M);
                    }
                }
                j1++;
            }
        }
    }

    private void a(q q1, hc hc1, boolean flag)
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
            Object obj = (View)hc1.get((String)m.get(j1));
            if (obj != null)
            {
                obj = ((View) (obj)).getTransitionName();
                if (flag)
                {
                    a(q1.a, s1, ((String) (obj)));
                } else
                {
                    a(q1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private boolean a(int i1, q q1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)o.i.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj2 = (Fragment)sparsearray1.get(i1);
        Object obj3 = (Fragment)sparsearray.get(i1);
        Object obj;
        Object obj1;
        ArrayList arraylist;
        if (obj2 == null)
        {
            obj = null;
        } else
        {
            if (flag && ((Fragment) (obj2)).U != Fragment.c)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj2)).U));
            } else
            {
                sparsearray = null;
            }
            obj = ai.a(sparsearray);
        }
        if (obj2 == null || obj3 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag && ((Fragment) (obj3)).V != Fragment.c)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj3)).V));
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
        if (obj3 == null)
        {
            obj1 = null;
        } else
        {
            if (flag && ((Fragment) (obj3)).T != Fragment.c)
            {
                sparsearray1 = ((SparseArray) (((Fragment) (obj3)).T));
            } else
            {
                sparsearray1 = null;
            }
            obj1 = ai.a(sparsearray1);
        }
        arraylist = new ArrayList();
        ArrayList arraylist1;
        Object obj4;
        _cls1 _lcls1;
        Object obj5;
        Object obj6;
        Object obj7;
        if (sparsearray != null)
        {
            sparsearray1 = a(q1, ((Fragment) (obj3)), flag);
            if (sparsearray1.isEmpty())
            {
                sparsearray1 = null;
                sparsearray = null;
            } else
            {
                ci ci;
                if (flag)
                {
                    ci = ((Fragment) (obj3)).W;
                } else
                {
                    ci = ((Fragment) (obj2)).W;
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new _cls2(viewgroup, sparsearray, arraylist, q1, flag, ((Fragment) (obj2)), ((Fragment) (obj3))));
            }
        } else
        {
            sparsearray1 = null;
        }
        if (obj == null && sparsearray == null && obj1 == null)
        {
            return false;
        }
        arraylist1 = new ArrayList();
        obj3 = a(obj1, ((Fragment) (obj3)), arraylist1, ((hc) (sparsearray1)), q1.d);
        if (m != null && sparsearray1 != null)
        {
            obj1 = (View)sparsearray1.get(m.get(0));
            if (obj1 != null)
            {
                if (obj3 != null)
                {
                    ai.a(obj3, ((View) (obj1)));
                }
                if (sparsearray != null)
                {
                    ai.a(sparsearray, ((View) (obj1)));
                }
            }
        }
        _lcls1 = new _cls1(((Fragment) (obj2)));
        obj1 = new ArrayList();
        obj2 = new hc();
        obj5 = (Transition)obj;
        obj6 = (Transition)obj3;
        obj7 = (Transition)sparsearray;
        obj4 = new TransitionSet();
        if (obj5 != null)
        {
            ((TransitionSet) (obj4)).addTransition(((Transition) (obj5)));
        }
        if (obj6 != null)
        {
            ((TransitionSet) (obj4)).addTransition(((Transition) (obj6)));
        }
        if (obj7 != null)
        {
            ((TransitionSet) (obj4)).addTransition(((Transition) (obj7)));
        }
        obj5 = q1.d;
        obj6 = q1.c;
        obj7 = q1.a;
        if (obj != null || sparsearray != null)
        {
            Transition transition = (Transition)obj;
            if (transition != null)
            {
                transition.addTarget(((View) (obj5)));
            }
            if (sparsearray != null)
            {
                ai.a(sparsearray, ((View) (obj5)), sparsearray1, arraylist);
            }
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new ai._cls2(viewgroup, transition, ((View) (obj5)), _lcls1, ((Map) (obj7)), ((Map) (obj2)), ((ArrayList) (obj1))));
            if (transition != null)
            {
                transition.setEpicenterCallback(new ai._cls3(((aj) (obj6))));
            }
        }
        viewgroup.getViewTreeObserver().addOnPreDrawListener(new _cls3(viewgroup, q1, i1, obj4));
        ai.a(obj4, q1.d, true);
        a(q1, i1, obj4);
        TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj4);
        sparsearray1 = q1.d;
        q1 = q1.b;
        obj = (Transition)obj;
        obj3 = (Transition)obj3;
        sparsearray = (Transition)sparsearray;
        obj4 = (Transition)obj4;
        viewgroup.getViewTreeObserver().addOnPreDrawListener(new ai._cls4(viewgroup, ((Transition) (obj)), ((ArrayList) (obj1)), ((Transition) (obj3)), arraylist1, sparsearray, arraylist, ((Map) (obj2)), q1, ((Transition) (obj4)), sparsearray1));
        return true;
    }

    private static void b(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.A;
            if (i1 != 0)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private void b(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (o.i.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        p p1 = a;
_L12:
        if (p1 == null) goto _L1; else goto _L3
_L3:
        p1.c;
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
        p1 = p1.a;
          goto _L12
_L5:
        b(sparsearray1, p1.d);
          goto _L13
_L6:
        Fragment fragment = p1.d;
        Fragment fragment1;
        if (o.c != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i1 >= o.c.size())
                    {
                        break label0;
                    }
                    Fragment fragment2 = (Fragment)o.c.get(i1);
                    if (fragment != null)
                    {
                        fragment1 = fragment;
                        if (fragment2.A != fragment.A)
                        {
                            break label1;
                        }
                    }
                    if (fragment2 == fragment)
                    {
                        fragment1 = null;
                    } else
                    {
                        a(sparsearray, fragment2);
                        fragment1 = fragment;
                    }
                }
                i1++;
                fragment = fragment1;
            } while (true);
        } else
        {
            fragment1 = fragment;
        }
        b(sparsearray1, fragment1);
          goto _L13
_L7:
        a(sparsearray, p1.d);
          goto _L13
_L8:
        a(sparsearray, p1.d);
          goto _L13
_L9:
        b(sparsearray1, p1.d);
          goto _L13
_L10:
        a(sparsearray, p1.d);
          goto _L13
        b(sparsearray1, p1.d);
          goto _L13
    }

    private static void b(q q1, hc hc1, boolean flag)
    {
        int j1 = hc1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)hc1.b(i1);
            String s2 = ((View)hc1.c(i1)).getTransitionName();
            if (flag)
            {
                a(q1.a, s1, s2);
            } else
            {
                a(q1.a, s2, s1);
            }
            i1++;
        }
    }

    public final ah a()
    {
        q = 0x7f040000;
        r = 0x7f040001;
        return this;
    }

    public final ah a(int i1, Fragment fragment)
    {
        a(i1, fragment, ((String) (null)), 1);
        return this;
    }

    public final ah a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public final ah a(Fragment fragment)
    {
        p p1 = new p();
        p1.c = 3;
        p1.d = fragment;
        a(p1);
        return this;
    }

    public final ah a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public final q a(boolean flag, q q1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        Object obj;
        boolean flag1 = ac.a;
        obj = q1;
        if (!n) goto _L2; else goto _L1
_L1:
        if (q1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        obj = q1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        obj = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int k1;
        int l1;
        a(-1);
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
        q1 = p;
_L17:
        if (q1 == null) goto _L8; else goto _L7
_L7:
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((p) (q1)).g;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((p) (q1)).h;
        }
        ((p) (q1)).c;
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
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((p) (q1)).c).toString());
_L4:
        obj = q1;
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        sparsearray = m;
        sparsearray1 = l;
        obj = q1;
        if (sparsearray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
        do
        {
            obj = q1;
            if (i1 >= sparsearray.size())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (String)sparsearray.get(i1);
            s1 = (String)sparsearray1.get(i1);
            a(q1.a, ((String) (obj)), s1);
            i1++;
        } while (true);
        continue; /* Loop/switch isn't completed */
_L10:
        sparsearray = ((p) (q1)).d;
        sparsearray.K = l1;
        o.a(sparsearray, ac.d(j1), i1);
_L18:
        q1 = ((p) (q1)).b;
          goto _L17
_L11:
        sparsearray = ((p) (q1)).d;
        if (sparsearray != null)
        {
            sparsearray.K = l1;
            o.a(sparsearray, ac.d(j1), i1);
        }
        if (((p) (q1)).i != null)
        {
            l1 = 0;
            while (l1 < ((p) (q1)).i.size()) 
            {
                sparsearray = (Fragment)((p) (q1)).i.get(l1);
                sparsearray.K = k1;
                o.a(sparsearray, false);
                l1++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((p) (q1)).d;
        sparsearray.K = k1;
        o.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((p) (q1)).d;
        sparsearray.K = k1;
        o.c(sparsearray, ac.d(j1), i1);
          goto _L18
_L14:
        sparsearray = ((p) (q1)).d;
        sparsearray.K = l1;
        o.b(sparsearray, ac.d(j1), i1);
          goto _L18
_L15:
        sparsearray = ((p) (q1)).d;
        sparsearray.K = k1;
        o.e(sparsearray, ac.d(j1), i1);
          goto _L18
_L16:
        sparsearray = ((p) (q1)).d;
        sparsearray.K = k1;
        o.d(sparsearray, ac.d(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            o.a(o.g, ac.d(j1), i1, true);
            obj = null;
        }
        if (g < 0) goto _L20; else goto _L19
_L19:
        q1 = o;
        i1 = g;
        q1;
        JVM INSTR monitorenter ;
        ((ac) (q1)).e.set(i1, null);
        if (((ac) (q1)).f == null)
        {
            q1.f = new ArrayList();
        }
        ((ac) (q1)).f.add(Integer.valueOf(i1));
        q1;
        JVM INSTR monitorexit ;
        g = -1;
_L20:
        return ((q) (obj));
        sparsearray;
        q1;
        JVM INSTR monitorexit ;
        throw sparsearray;
        if (true) goto _L2; else goto _L21
_L21:
    }

    public final void a(int i1)
    {
        if (e)
        {
            boolean flag = ac.a;
            p p1 = a;
            while (p1 != null) 
            {
                if (p1.d != null)
                {
                    Fragment fragment = p1.d;
                    fragment.u = fragment.u + i1;
                    boolean flag1 = ac.a;
                }
                if (p1.i != null)
                {
                    for (int j1 = p1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)p1.i.get(j1);
                        fragment1.u = fragment1.u + i1;
                        boolean flag2 = ac.a;
                    }

                }
                p1 = p1.a;
            }
        }
    }

    public final void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (o.i.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        p p1 = a;
_L12:
        if (p1 == null) goto _L1; else goto _L3
_L3:
        p1.c;
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
        p1 = p1.a;
          goto _L12
_L5:
        a(sparsearray, p1.d);
          goto _L13
_L6:
        if (p1.i != null)
        {
            for (int i1 = p1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (Fragment)p1.i.get(i1));
            }

        }
        a(sparsearray, p1.d);
          goto _L13
_L7:
        b(sparsearray1, p1.d);
          goto _L13
_L8:
        b(sparsearray1, p1.d);
          goto _L13
_L9:
        a(sparsearray, p1.d);
          goto _L13
_L10:
        b(sparsearray1, p1.d);
          goto _L13
        a(sparsearray, p1.d);
          goto _L13
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        p p1;
        String s3;
        int i1;
        printwriter.print(s1);
        printwriter.print("mName=");
        printwriter.print(f);
        printwriter.print(" mIndex=");
        printwriter.print(g);
        printwriter.print(" mCommitted=");
        printwriter.println(t);
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
            break MISSING_BLOCK_LABEL_746;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        p1 = a;
        i1 = 0;
_L13:
        if (p1 == null) goto _L2; else goto _L1
_L1:
        p1.c;
        JVM INSTR tableswitch 0 7: default 364
    //                   0 633
    //                   1 640
    //                   2 647
    //                   3 654
    //                   4 661
    //                   5 668
    //                   6 675
    //                   7 682;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_682;
_L3:
        String s2 = (new StringBuilder("cmd=")).append(p1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(p1.d);
        if (p1.e != 0 || p1.f != 0)
        {
            printwriter.print(s1);
            printwriter.print("enterAnim=#");
            printwriter.print(Integer.toHexString(p1.e));
            printwriter.print(" exitAnim=#");
            printwriter.println(Integer.toHexString(p1.f));
        }
        if (p1.g != 0 || p1.h != 0)
        {
            printwriter.print(s1);
            printwriter.print("popEnterAnim=#");
            printwriter.print(Integer.toHexString(p1.g));
            printwriter.print(" popExitAnim=#");
            printwriter.println(Integer.toHexString(p1.h));
        }
        if (p1.i != null && p1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < p1.i.size()) 
            {
                printwriter.print(s3);
                if (p1.i.size() == 1)
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
                printwriter.println(p1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_730;
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
        p1 = p1.a;
        i1++;
          goto _L13
_L2:
    }

    public final void a(p p1)
    {
        if (a == null)
        {
            p = p1;
            a = p1;
        } else
        {
            p1.b = p;
            p.a = p1;
            p = p1;
        }
        p1.e = q;
        p1.f = r;
        p1.g = 0;
        p1.h = 0;
        b = b + 1;
    }

    public final ah b()
    {
        if (!s)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            e = true;
            f = null;
            return this;
        }
    }

    public final ah b(int i1, Fragment fragment)
    {
        return b(i1, fragment, ((String) (null)));
    }

    public final ah b(int i1, Fragment fragment, String s1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, fragment, s1, 2);
            return this;
        }
    }

    public final ah b(Fragment fragment)
    {
        p p1 = new p();
        p1.c = 6;
        p1.d = fragment;
        a(p1);
        return this;
    }

    public final int c()
    {
        return a(false);
    }

    public final ah c(Fragment fragment)
    {
        p p1 = new p();
        p1.c = 7;
        p1.d = fragment;
        a(p1);
        return this;
    }

    public final int d()
    {
        return a(true);
    }

    public final void run()
    {
        boolean flag = ac.a;
        if (e && g < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        Object obj;
        Object obj1;
        p p1;
        Fragment fragment;
        Fragment fragment1;
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
        p1 = a;
        if (p1 == null)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        if (obj1 != null)
        {
            k1 = 0;
        } else
        {
            k1 = p1.e;
        }
        if (obj1 != null)
        {
            l1 = 0;
        } else
        {
            l1 = p1.f;
        }
        p1.c;
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
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(p1.c).toString());
_L2:
        obj = p1.d;
        obj.K = k1;
        o.a(((Fragment) (obj)), false);
_L12:
        p1 = p1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_90;
_L9:
        obj = p1.d;
        j2 = ((Fragment) (obj)).A;
        if (o.c != null)
        {
            i2 = 0;
            do
            {
                fragment = ((Fragment) (obj));
                if (i2 >= o.c.size())
                {
                    break;
                }
                fragment1 = (Fragment)o.c.get(i2);
                flag = ac.a;
                fragment = ((Fragment) (obj));
                if (fragment1.A == j2)
                {
                    if (fragment1 == obj)
                    {
                        p1.d = null;
                        fragment = null;
                    } else
                    {
                        if (p1.i == null)
                        {
                            p1.i = new ArrayList();
                        }
                        p1.i.add(fragment1);
                        fragment1.K = l1;
                        if (e)
                        {
                            fragment1.u = fragment1.u + 1;
                            flag = ac.a;
                        }
                        o.a(fragment1, j1, i1);
                        fragment = ((Fragment) (obj));
                    }
                }
                i2++;
                obj = fragment;
            } while (true);
        } else
        {
            fragment = ((Fragment) (obj));
        }
        if (fragment != null)
        {
            fragment.K = k1;
            o.a(fragment, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = p1.d;
        obj.K = l1;
        o.a(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = p1.d;
        obj.K = l1;
        o.b(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = p1.d;
        obj.K = k1;
        o.c(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = p1.d;
        obj.K = l1;
        o.d(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
        obj = p1.d;
        obj.K = k1;
        o.e(((Fragment) (obj)), j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        o.a(o.g, j1, i1, true);
        if (e)
        {
            obj = o;
            if (((ac) (obj)).d == null)
            {
                obj.d = new ArrayList();
            }
            ((ac) (obj)).d.add(this);
            ((ac) (obj)).j();
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

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
