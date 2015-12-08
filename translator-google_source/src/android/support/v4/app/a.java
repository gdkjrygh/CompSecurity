// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Handler;
import android.support.v4.d.e;
import android.support.v4.d.g;
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

// Referenced classes of package android.support.v4.app:
//            ae, s, q, f, 
//            Fragment, af, ak, o, 
//            c, b, ah, ai, 
//            d, aj, e

final class a extends ae
    implements Runnable
{

    static final boolean a;
    final s b;
    android.support.v4.app.e c;
    android.support.v4.app.e d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    boolean m;
    String n;
    boolean o;
    int p;
    int q;
    CharSequence r;
    int s;
    CharSequence t;
    ArrayList u;
    ArrayList v;

    public a(s s1)
    {
        m = true;
        p = -1;
        b = s1;
    }

    private int a(boolean flag)
    {
        s s1;
        if (o)
        {
            throw new IllegalStateException("commit already called");
        }
        if (s.a)
        {
            (new StringBuilder("Commit: ")).append(this);
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        o = true;
        Exception exception;
        if (l)
        {
            p = b.a(this);
        } else
        {
            p = -1;
        }
        s1 = b;
        if (!flag)
        {
            s1.e();
        }
        s1;
        JVM INSTR monitorenter ;
        if (s1.t || s1.o == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_135;
        exception;
        s1;
        JVM INSTR monitorexit ;
        throw exception;
        if (s1.c == null)
        {
            s1.c = new ArrayList();
        }
        s1.c.add(this);
        if (s1.c.size() == 1)
        {
            s1.o.d.removeCallbacks(s1.y);
            s1.o.d.post(s1.y);
        }
        s1;
        JVM INSTR monitorexit ;
        return p;
    }

    private f a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        f f1 = new f(this);
        f1.d = new View(b.o.c);
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
            if (a(sparsearray.keyAt(i1), f1, flag, sparsearray, sparsearray1))
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
                if (a(j1, f1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k1++;
            flag3 = flag2;
        }
        sparsearray = f1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    static android.support.v4.d.a a(a a1, f f1, boolean flag, Fragment fragment)
    {
        android.support.v4.d.a a3 = new android.support.v4.d.a();
        View view = fragment.J;
        android.support.v4.d.a a2 = a3;
        if (view != null)
        {
            a2 = a3;
            if (a1.u != null)
            {
                af.a(a3, view);
                if (flag)
                {
                    a2 = a(a1.u, a1.v, a3);
                } else
                {
                    android.support.v4.d.g.a(a3, a1.v);
                    a2 = a3;
                }
            }
        }
        if (flag)
        {
            if (fragment.Z != null)
            {
                fragment = fragment.Z;
            }
            a1.a(f1, a2, true);
            return a2;
        }
        if (fragment.Y != null)
        {
            a1 = fragment.Y;
        }
        b(f1, a2, true);
        return a2;
    }

    private android.support.v4.d.a a(f f1, Fragment fragment, boolean flag)
    {
        android.support.v4.d.a a2 = new android.support.v4.d.a();
        android.support.v4.d.a a1 = a2;
        if (u != null)
        {
            af.a(a2, fragment.J);
            if (flag)
            {
                android.support.v4.d.g.a(a2, v);
                a1 = a2;
            } else
            {
                a1 = a(u, v, a2);
            }
        }
        if (flag)
        {
            if (fragment.Y != null)
            {
                fragment = fragment.Y;
            }
            a(f1, a1, false);
            return a1;
        }
        if (fragment.Z != null)
        {
            fragment = fragment.Z;
        }
        b(f1, a1, false);
        return a1;
    }

    private static android.support.v4.d.a a(ArrayList arraylist, ArrayList arraylist1, android.support.v4.d.a a1)
    {
        if (a1.isEmpty())
        {
            return a1;
        }
        android.support.v4.d.a a2 = new android.support.v4.d.a();
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = (View)a1.get(arraylist.get(i1));
            if (view != null)
            {
                a2.put(arraylist1.get(i1), view);
            }
        }

        return a2;
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, android.support.v4.d.a a1, View view)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                fragment = fragment.J;
                obj1 = obj;
                if (obj != null)
                {
                    af.a(arraylist, fragment);
                    if (a1 != null)
                    {
                        arraylist.removeAll(a1.values());
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
        af.b((Transition)obj, arraylist);
        return obj;
    }

    static void a(Fragment fragment, Fragment fragment1, boolean flag, android.support.v4.d.a a1)
    {
        if (flag)
        {
            fragment = fragment1.Y;
        } else
        {
            fragment = fragment.Y;
        }
        if (fragment != null)
        {
            new ArrayList(a1.keySet());
            new ArrayList(a1.values());
        }
    }

    static void a(a a1, f f1, int i1, Object obj)
    {
        a1.a(f1, i1, obj);
    }

    static void a(a a1, android.support.v4.d.a a2, f f1)
    {
        if (a1.v != null && !a2.isEmpty())
        {
            a1 = (View)a2.get(a1.v.get(0));
            if (a1 != null)
            {
                f1.c.a = a1;
            }
        }
    }

    private void a(f f1, int i1, Object obj)
    {
        if (b.g != null)
        {
            int j1 = 0;
            while (j1 < b.g.size()) 
            {
                Fragment fragment = (Fragment)b.g.get(j1);
                if (fragment.J != null && fragment.I != null && fragment.y == i1)
                {
                    if (fragment.A)
                    {
                        if (!f1.b.contains(fragment.J))
                        {
                            af.a(obj, fragment.J, true);
                            f1.b.add(fragment.J);
                        }
                    } else
                    {
                        af.a(obj, fragment.J, false);
                        f1.b.remove(fragment.J);
                    }
                }
                j1++;
            }
        }
    }

    private void a(f f1, android.support.v4.d.a a1, boolean flag)
    {
        int i1;
        int j1;
        if (v == null)
        {
            i1 = 0;
        } else
        {
            i1 = v.size();
        }
        j1 = 0;
        while (j1 < i1) 
        {
            String s1 = (String)u.get(j1);
            Object obj = (View)a1.get((String)v.get(j1));
            if (obj != null)
            {
                obj = ((View) (obj)).getTransitionName();
                if (flag)
                {
                    a(f1.a, s1, ((String) (obj)));
                } else
                {
                    a(f1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private static void a(android.support.v4.d.a a1, String s1, String s2)
    {
        if (s1 == null || s2 == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= a1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.equals(a1.c(i1))) goto _L4; else goto _L3
_L3:
        a1.a(i1, s2);
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        a1.put(s1, s2);
        return;
    }

    private static void a(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.y;
            if (i1 != 0 && !fragment.A && fragment.b() && fragment.J != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private boolean a(int i1, f f1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)b.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj3 = (Fragment)sparsearray1.get(i1);
        Object obj4 = (Fragment)sparsearray.get(i1);
        Object obj;
        Object obj1;
        Object obj2;
        ArrayList arraylist;
        if (obj3 == null)
        {
            obj1 = null;
        } else
        {
            if (flag)
            {
                if (((Fragment) (obj3)).T == Fragment.a)
                {
                    sparsearray = ((SparseArray) (((Fragment) (obj3)).S));
                } else
                {
                    sparsearray = ((SparseArray) (((Fragment) (obj3)).T));
                }
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj3)).Q));
            }
            obj1 = af.a(sparsearray);
        }
        if (obj3 == null || obj4 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag)
            {
                if (((Fragment) (obj4)).V == Fragment.a)
                {
                    sparsearray = ((SparseArray) (((Fragment) (obj4)).U));
                } else
                {
                    sparsearray = ((SparseArray) (((Fragment) (obj4)).V));
                }
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj3)).U));
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
        if (obj4 == null)
        {
            obj2 = null;
        } else
        {
            if (flag)
            {
                if (((Fragment) (obj4)).R == Fragment.a)
                {
                    sparsearray1 = ((SparseArray) (((Fragment) (obj4)).Q));
                } else
                {
                    sparsearray1 = ((SparseArray) (((Fragment) (obj4)).R));
                }
            } else
            {
                sparsearray1 = ((SparseArray) (((Fragment) (obj4)).S));
            }
            obj2 = af.a(sparsearray1);
        }
        arraylist = new ArrayList();
        ArrayList arraylist1;
        android.support.v4.d.a a1;
        Object obj5;
        b b1;
        Object obj6;
        if (sparsearray != null)
        {
            obj = a(f1, ((Fragment) (obj4)), flag);
            if (((android.support.v4.d.a) (obj)).isEmpty())
            {
                obj = null;
                sparsearray1 = null;
            } else
            {
                if (flag)
                {
                    sparsearray1 = ((Fragment) (obj4)).Y;
                } else
                {
                    sparsearray1 = ((Fragment) (obj3)).Y;
                }
                if (sparsearray1 != null)
                {
                    new ArrayList(((android.support.v4.d.a) (obj)).keySet());
                    new ArrayList(((android.support.v4.d.a) (obj)).values());
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new c(this, viewgroup, sparsearray, arraylist, f1, flag, ((Fragment) (obj3)), ((Fragment) (obj4))));
                sparsearray1 = sparsearray;
            }
        } else
        {
            obj = null;
            sparsearray1 = sparsearray;
        }
        if (obj1 == null && sparsearray1 == null && obj2 == null)
        {
            return false;
        }
        arraylist1 = new ArrayList();
        obj5 = a(obj2, ((Fragment) (obj4)), arraylist1, ((android.support.v4.d.a) (obj)), f1.d);
        if (v != null && obj != null)
        {
            sparsearray = (View)((android.support.v4.d.a) (obj)).get(v.get(0));
            if (sparsearray != null)
            {
                if (obj5 != null)
                {
                    af.a(obj5, sparsearray);
                }
                if (sparsearray1 != null)
                {
                    af.a(sparsearray1, sparsearray);
                }
            }
        }
        b1 = new b(this, ((Fragment) (obj3)));
        obj4 = new ArrayList();
        a1 = new android.support.v4.d.a();
        if (obj3 != null)
        {
            if (flag)
            {
                if (((Fragment) (obj3)).W == null)
                {
                    flag = true;
                } else
                {
                    flag = ((Fragment) (obj3)).W.booleanValue();
                }
            } else
            if (((Fragment) (obj3)).X == null)
            {
                flag = true;
            } else
            {
                flag = ((Fragment) (obj3)).X.booleanValue();
            }
        } else
        {
            flag = true;
        }
        obj2 = (Transition)obj1;
        sparsearray = (Transition)obj5;
        obj6 = (Transition)sparsearray1;
        if (obj2 == null || sparsearray == null)
        {
            flag = true;
        }
        if (flag)
        {
            obj3 = new TransitionSet();
            if (obj2 != null)
            {
                ((TransitionSet) (obj3)).addTransition(((Transition) (obj2)));
            }
            if (sparsearray != null)
            {
                ((TransitionSet) (obj3)).addTransition(sparsearray);
            }
            if (obj6 != null)
            {
                ((TransitionSet) (obj3)).addTransition(((Transition) (obj6)));
            }
            sparsearray = ((SparseArray) (obj3));
        } else
        {
            if (sparsearray != null && obj2 != null)
            {
                sparsearray = (new TransitionSet()).addTransition(sparsearray).addTransition(((Transition) (obj2))).setOrdering(1);
            } else
            if (sparsearray == null)
            {
                sparsearray = ((SparseArray) (obj2));
                if (obj2 == null)
                {
                    sparsearray = null;
                }
            }
            if (obj6 != null)
            {
                obj2 = new TransitionSet();
                if (sparsearray != null)
                {
                    ((TransitionSet) (obj2)).addTransition(sparsearray);
                }
                ((TransitionSet) (obj2)).addTransition(((Transition) (obj6)));
                sparsearray = ((SparseArray) (obj2));
            }
        }
        if (sparsearray != null)
        {
            obj2 = f1.d;
            obj3 = f1.c;
            obj6 = f1.a;
            if (obj1 != null || sparsearray1 != null)
            {
                Transition transition = (Transition)obj1;
                if (transition != null)
                {
                    transition.addTarget(((View) (obj2)));
                }
                if (sparsearray1 != null)
                {
                    af.a(sparsearray1, ((View) (obj2)), ((Map) (obj)), arraylist);
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new ah(viewgroup, transition, ((View) (obj2)), b1, ((Map) (obj6)), a1, ((ArrayList) (obj4))));
                if (transition != null)
                {
                    transition.setEpicenterCallback(new ai(((ak) (obj3))));
                }
            }
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new d(this, viewgroup, f1, i1, sparsearray));
            af.a(sparsearray, f1.d, true);
            a(f1, i1, sparsearray);
            TransitionManager.beginDelayedTransition(viewgroup, (Transition)sparsearray);
            obj = f1.d;
            f1 = f1.b;
            obj1 = (Transition)obj1;
            obj2 = (Transition)obj5;
            sparsearray1 = (Transition)sparsearray1;
            obj3 = (Transition)sparsearray;
            if (obj3 != null)
            {
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new aj(viewgroup, ((Transition) (obj1)), ((ArrayList) (obj4)), ((Transition) (obj2)), arraylist1, sparsearray1, arraylist, a1, f1, ((Transition) (obj3)), ((View) (obj))));
            }
        }
        return sparsearray != null;
    }

    private void b(int i1, Fragment fragment, String s1)
    {
        fragment.t = b;
        if (s1 != null)
        {
            if (fragment.z != null && !s1.equals(fragment.z))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.z).append(" now ").append(s1).toString());
            }
            fragment.z = s1;
        }
        if (i1 != 0)
        {
            if (fragment.x != 0 && fragment.x != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.x).append(" now ").append(i1).toString());
            }
            fragment.x = i1;
            fragment.y = i1;
        }
        s1 = new android.support.v4.app.e();
        s1.c = 1;
        s1.d = fragment;
        a(s1);
    }

    private static void b(f f1, android.support.v4.d.a a1, boolean flag)
    {
        int j1 = a1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)a1.b(i1);
            String s2 = ((View)a1.c(i1)).getTransitionName();
            if (flag)
            {
                a(f1.a, s1, s2);
            } else
            {
                a(f1.a, s2, s1);
            }
            i1++;
        }
    }

    private static void b(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.y;
            if (i1 != 0)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private void b(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.support.v4.app.e e1 = c;
_L12:
        if (e1 == null) goto _L1; else goto _L3
_L3:
        e1.c;
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
        e1 = e1.a;
          goto _L12
_L5:
        b(sparsearray1, e1.d);
          goto _L13
_L6:
        Fragment fragment = e1.d;
        Fragment fragment1;
        if (b.g != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i1 >= b.g.size())
                    {
                        break label0;
                    }
                    Fragment fragment2 = (Fragment)b.g.get(i1);
                    if (fragment != null)
                    {
                        fragment1 = fragment;
                        if (fragment2.y != fragment.y)
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
        a(sparsearray, e1.d);
          goto _L13
_L8:
        a(sparsearray, e1.d);
          goto _L13
_L9:
        b(sparsearray1, e1.d);
          goto _L13
_L10:
        a(sparsearray, e1.d);
          goto _L13
        b(sparsearray1, e1.d);
          goto _L13
    }

    public final int a()
    {
        return a(false);
    }

    public final ae a(int i1, Fragment fragment)
    {
        b(i1, fragment, ((String) (null)));
        return this;
    }

    public final ae a(int i1, Fragment fragment, String s1)
    {
        b(i1, fragment, s1);
        return this;
    }

    public final ae a(Fragment fragment)
    {
        android.support.v4.app.e e1 = new android.support.v4.app.e();
        e1.c = 3;
        e1.d = fragment;
        a(e1);
        return this;
    }

    public final f a(f f1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        f f2;
label0:
        {
            if (s.a)
            {
                (new StringBuilder("popFromBackStack: ")).append(this);
                a("  ", new PrintWriter(new e("FragmentManager")));
            }
            f2 = f1;
            if (!a)
            {
                break label0;
            }
            if (sparsearray.size() == 0)
            {
                f2 = f1;
                if (sparsearray1.size() == 0)
                {
                    break label0;
                }
            }
            f2 = a(sparsearray, sparsearray1, true);
        }
        a(-1);
        if (f2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (f2 != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        f1 = d;
_L10:
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_498;
        }
        if (f2 != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((android.support.v4.app.e) (f1)).g;
        }
        if (f2 != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((android.support.v4.app.e) (f1)).h;
        }
        ((android.support.v4.app.e) (f1)).c;
        JVM INSTR tableswitch 1 7: default 172
    //                   1 236
    //                   2 270
    //                   3 359
    //                   4 382
    //                   5 411
    //                   6 440
    //                   7 469;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_469;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((android.support.v4.app.e) (f1)).c).toString());
_L2:
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        sparsearray.H = l1;
        b.a(sparsearray, android.support.v4.app.s.b(j1), i1);
_L11:
        f1 = ((android.support.v4.app.e) (f1)).b;
        if (true) goto _L10; else goto _L9
_L9:
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        if (sparsearray != null)
        {
            sparsearray.H = l1;
            b.a(sparsearray, android.support.v4.app.s.b(j1), i1);
        }
        if (((android.support.v4.app.e) (f1)).i != null)
        {
            l1 = 0;
            while (l1 < ((android.support.v4.app.e) (f1)).i.size()) 
            {
                sparsearray = (Fragment)((android.support.v4.app.e) (f1)).i.get(l1);
                sparsearray.H = k1;
                b.a(sparsearray, false);
                l1++;
            }
        }
          goto _L11
_L4:
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        sparsearray.H = k1;
        b.a(sparsearray, false);
          goto _L11
_L5:
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        sparsearray.H = k1;
        b.c(sparsearray, android.support.v4.app.s.b(j1), i1);
          goto _L11
_L6:
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        sparsearray.H = l1;
        b.b(sparsearray, android.support.v4.app.s.b(j1), i1);
          goto _L11
_L7:
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        sparsearray.H = k1;
        b.e(sparsearray, android.support.v4.app.s.b(j1), i1);
          goto _L11
        sparsearray = ((android.support.v4.app.e) (f1)).d;
        sparsearray.H = k1;
        b.d(sparsearray, android.support.v4.app.s.b(j1), i1);
          goto _L11
        b.a(b.n, android.support.v4.app.s.b(j1), i1, true);
        if (p < 0)
        {
            break MISSING_BLOCK_LABEL_594;
        }
        f1 = b;
        i1 = p;
        f1;
        JVM INSTR monitorenter ;
        ((s) (f1)).k.set(i1, null);
        if (((s) (f1)).l == null)
        {
            f1.l = new ArrayList();
        }
        boolean flag = s.a;
        ((s) (f1)).l.add(Integer.valueOf(i1));
        f1;
        JVM INSTR monitorexit ;
        p = -1;
        return null;
        sparsearray;
        f1;
        JVM INSTR monitorexit ;
        throw sparsearray;
    }

    final void a(int i1)
    {
        if (l)
        {
            if (s.a)
            {
                (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1);
            }
            android.support.v4.app.e e1 = c;
            while (e1 != null) 
            {
                if (e1.d != null)
                {
                    Fragment fragment = e1.d;
                    fragment.s = fragment.s + i1;
                    if (s.a)
                    {
                        (new StringBuilder("Bump nesting of ")).append(e1.d).append(" to ").append(e1.d.s);
                    }
                }
                if (e1.i != null)
                {
                    for (int j1 = e1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)e1.i.get(j1);
                        fragment1.s = fragment1.s + i1;
                        if (s.a)
                        {
                            (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.s);
                        }
                    }

                }
                e1 = e1.a;
            }
        }
    }

    final void a(android.support.v4.app.e e1)
    {
        if (c == null)
        {
            d = e1;
            c = e1;
        } else
        {
            e1.b = d;
            d.a = e1;
            d = e1;
        }
        e1.e = f;
        e1.f = g;
        e1.g = h;
        e1.h = i;
        e = e + 1;
    }

    public final void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.support.v4.app.e e1 = c;
_L12:
        if (e1 == null) goto _L1; else goto _L3
_L3:
        e1.c;
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
        e1 = e1.a;
          goto _L12
_L5:
        a(sparsearray, e1.d);
          goto _L13
_L6:
        if (e1.i != null)
        {
            for (int i1 = e1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (Fragment)e1.i.get(i1));
            }

        }
        a(sparsearray, e1.d);
          goto _L13
_L7:
        b(sparsearray1, e1.d);
          goto _L13
_L8:
        b(sparsearray1, e1.d);
          goto _L13
_L9:
        a(sparsearray, e1.d);
          goto _L13
_L10:
        b(sparsearray1, e1.d);
          goto _L13
        a(sparsearray, e1.d);
          goto _L13
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        a(s1, printwriter, true);
    }

    public final void a(String s1, PrintWriter printwriter, boolean flag)
    {
        android.support.v4.app.e e1;
        String s3;
        int i1;
        if (flag)
        {
            printwriter.print(s1);
            printwriter.print("mName=");
            printwriter.print(n);
            printwriter.print(" mIndex=");
            printwriter.print(p);
            printwriter.print(" mCommitted=");
            printwriter.println(o);
            if (j != 0)
            {
                printwriter.print(s1);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(j));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(k));
            }
            if (f != 0 || g != 0)
            {
                printwriter.print(s1);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(f));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(g));
            }
            if (h != 0 || i != 0)
            {
                printwriter.print(s1);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(h));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(i));
            }
            if (q != 0 || r != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(q));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(r);
            }
            if (s != 0 || t != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(s));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(t);
            }
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        e1 = c;
        i1 = 0;
_L13:
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1.c;
        JVM INSTR tableswitch 0 7: default 424
    //                   0 699
    //                   1 707
    //                   2 715
    //                   3 723
    //                   4 731
    //                   5 739
    //                   6 747
    //                   7 755;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_755;
_L3:
        String s2 = (new StringBuilder("cmd=")).append(e1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(e1.d);
        if (flag)
        {
            if (e1.e != 0 || e1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(e1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(e1.f));
            }
            if (e1.g != 0 || e1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(e1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(e1.h));
            }
        }
        if (e1.i != null && e1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < e1.i.size()) 
            {
                printwriter.print(s3);
                if (e1.i.size() == 1)
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
                printwriter.println(e1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_804;
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
        e1 = e1.a;
        i1++;
          goto _L13
_L2:
    }

    public final int b()
    {
        return a(true);
    }

    public final ae b(Fragment fragment)
    {
        android.support.v4.app.e e1 = new android.support.v4.app.e();
        e1.c = 6;
        e1.d = fragment;
        a(e1);
        return this;
    }

    public final ae c(Fragment fragment)
    {
        android.support.v4.app.e e1 = new android.support.v4.app.e();
        e1.c = 7;
        e1.d = fragment;
        a(e1);
        return this;
    }

    public final void run()
    {
        if (s.a)
        {
            (new StringBuilder("Run: ")).append(this);
        }
        if (l && p < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        Object obj;
        Object obj1;
        android.support.v4.app.e e1;
        Fragment fragment;
        Fragment fragment1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (a)
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
            i1 = k;
        }
        if (obj1 != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        e1 = c;
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        if (obj1 != null)
        {
            k1 = 0;
        } else
        {
            k1 = e1.e;
        }
        if (obj1 != null)
        {
            l1 = 0;
        } else
        {
            l1 = e1.f;
        }
        e1.c;
        JVM INSTR tableswitch 1 7: default 172
    //                   1 236
    //                   2 264
    //                   3 531
    //                   4 557
    //                   5 583
    //                   6 609
    //                   7 635;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_635;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(e1.c).toString());
_L2:
        obj = e1.d;
        obj.H = k1;
        b.a(((Fragment) (obj)), false);
_L12:
        e1 = e1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_106;
_L9:
        obj = e1.d;
        j2 = ((Fragment) (obj)).y;
        if (b.g != null)
        {
            i2 = 0;
            do
            {
                fragment = ((Fragment) (obj));
                if (i2 >= b.g.size())
                {
                    break;
                }
                fragment1 = (Fragment)b.g.get(i2);
                if (s.a)
                {
                    (new StringBuilder("OP_REPLACE: adding=")).append(obj).append(" old=").append(fragment1);
                }
                fragment = ((Fragment) (obj));
                if (fragment1.y == j2)
                {
                    if (fragment1 == obj)
                    {
                        e1.d = null;
                        fragment = null;
                    } else
                    {
                        if (e1.i == null)
                        {
                            e1.i = new ArrayList();
                        }
                        e1.i.add(fragment1);
                        fragment1.H = l1;
                        if (l)
                        {
                            fragment1.s = fragment1.s + 1;
                            if (s.a)
                            {
                                (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.s);
                            }
                        }
                        b.a(fragment1, j1, i1);
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
            fragment.H = k1;
            b.a(fragment, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = e1.d;
        obj.H = l1;
        b.a(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = e1.d;
        obj.H = l1;
        b.b(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = e1.d;
        obj.H = k1;
        b.c(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = e1.d;
        obj.H = l1;
        b.d(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
        obj = e1.d;
        obj.H = k1;
        b.e(((Fragment) (obj)), j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        b.a(b.n, j1, i1, true);
        if (l)
        {
            obj = b;
            if (((s) (obj)).i == null)
            {
                obj.i = new ArrayList();
            }
            ((s) (obj)).i.add(this);
            ((s) (obj)).g();
        }
        return;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (p >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(p);
        }
        if (n != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(n);
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
        a = flag;
    }
}
