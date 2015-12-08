// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.e.a;
import android.support.v4.e.e;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ah, v, x, k, 
//            Fragment, ai, j, an, 
//            t, g, h, ak, 
//            al, i, am

final class f extends ah
    implements v, Runnable
{

    static final boolean a;
    final x b;
    j c;
    j d;
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

    public f(x x1)
    {
        m = true;
        p = -1;
        b = x1;
    }

    private int a(boolean flag)
    {
        if (o)
        {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.x.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Commit: ")).append(this).toString());
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        o = true;
        if (l)
        {
            p = b.a(this);
        } else
        {
            p = -1;
        }
        b.a(this, flag);
        return p;
    }

    private k a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        k k1 = new k(this);
        k1.d = new View(b.o);
        int i1 = 0;
        boolean flag1 = false;
        int l1;
        boolean flag3;
        do
        {
            l1 = ((flag4) ? 1 : 0);
            flag3 = flag1;
            if (i1 >= sparsearray.size())
            {
                break;
            }
            if (a(sparsearray.keyAt(i1), k1, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
            i1++;
        } while (true);
        while (l1 < sparsearray1.size()) 
        {
            int j1 = sparsearray1.keyAt(l1);
            boolean flag2 = flag3;
            if (sparsearray.get(j1) == null)
            {
                flag2 = flag3;
                if (a(j1, k1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            l1++;
            flag3 = flag2;
        }
        sparsearray = k1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    static a a(f f1, k k1, boolean flag, Fragment fragment)
    {
        a a2 = new a();
        View view = fragment.getView();
        a a1 = a2;
        if (view != null)
        {
            a1 = a2;
            if (f1.u != null)
            {
                android.support.v4.app.ai.a(a2, view);
                if (flag)
                {
                    a1 = a(f1.u, f1.v, a2);
                } else
                {
                    a2.a(f1.v);
                    a1 = a2;
                }
            }
        }
        if (flag)
        {
            if (fragment.mExitTransitionCallback != null)
            {
                fragment = fragment.mExitTransitionCallback;
            }
            f1.a(k1, a1, true);
            return a1;
        }
        if (fragment.mEnterTransitionCallback != null)
        {
            f1 = fragment.mEnterTransitionCallback;
        }
        b(k1, a1, true);
        return a1;
    }

    private a a(k k1, Fragment fragment, boolean flag)
    {
        a a2 = new a();
        a a1 = a2;
        if (u != null)
        {
            android.support.v4.app.ai.a(a2, fragment.getView());
            if (flag)
            {
                a2.a(v);
                a1 = a2;
            } else
            {
                a1 = a(u, v, a2);
            }
        }
        if (flag)
        {
            if (fragment.mEnterTransitionCallback != null)
            {
                fragment = fragment.mEnterTransitionCallback;
            }
            a(k1, a1, false);
            return a1;
        }
        if (fragment.mExitTransitionCallback != null)
        {
            fragment = fragment.mExitTransitionCallback;
        }
        b(k1, a1, false);
        return a1;
    }

    private static a a(ArrayList arraylist, ArrayList arraylist1, a a1)
    {
        if (a1.isEmpty())
        {
            return a1;
        }
        a a2 = new a();
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

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        fragment.mFragmentManager = b;
        if (s1 != null)
        {
            if (fragment.mTag != null && !s1.equals(fragment.mTag))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.mTag).append(" now ").append(s1).toString());
            }
            fragment.mTag = s1;
        }
        if (i1 != 0)
        {
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.mFragmentId).append(" now ").append(i1).toString());
            }
            fragment.mFragmentId = i1;
            fragment.mContainerId = i1;
        }
        s1 = new j();
        s1.c = j1;
        s1.d = fragment;
        a(((j) (s1)));
    }

    static void a(Fragment fragment, Fragment fragment1, boolean flag, a a1)
    {
        if (flag)
        {
            fragment = fragment1.mEnterTransitionCallback;
        } else
        {
            fragment = fragment.mEnterTransitionCallback;
        }
        if (fragment != null)
        {
            new ArrayList(a1.keySet());
            new ArrayList(a1.values());
        }
    }

    static void a(f f1, k k1, int i1, Object obj)
    {
        f1.a(k1, i1, obj);
    }

    static void a(f f1, a a1, k k1)
    {
        if (f1.v != null && !a1.isEmpty())
        {
            f1 = (View)a1.get(f1.v.get(0));
            if (f1 != null)
            {
                k1.c.a = f1;
            }
        }
    }

    private void a(k k1, int i1, Object obj)
    {
        if (b.g != null)
        {
            int j1 = 0;
            while (j1 < b.g.size()) 
            {
                Fragment fragment = (Fragment)b.g.get(j1);
                if (fragment.mView != null && fragment.mContainer != null && fragment.mContainerId == i1)
                {
                    if (fragment.mHidden)
                    {
                        if (!k1.b.contains(fragment.mView))
                        {
                            android.support.v4.app.ai.a(obj, fragment.mView, true);
                            k1.b.add(fragment.mView);
                        }
                    } else
                    {
                        android.support.v4.app.ai.a(obj, fragment.mView, false);
                        k1.b.remove(fragment.mView);
                    }
                }
                j1++;
            }
        }
    }

    private void a(k k1, a a1, boolean flag)
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
                    a(k1.a, s1, ((String) (obj)));
                } else
                {
                    a(k1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private static void a(k k1, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null)
        {
            for (int i1 = 0; i1 < arraylist.size(); i1++)
            {
                String s1 = (String)arraylist.get(i1);
                String s2 = (String)arraylist1.get(i1);
                a(k1.a, s1, s2);
            }

        }
    }

    private static void a(a a1, String s1, String s2)
    {
        if (s1 == null || s2 == null || s1.equals(s2)) goto _L2; else goto _L1
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
            int i1 = fragment.mContainerId;
            if (i1 != 0 && !fragment.isHidden() && fragment.isAdded() && fragment.getView() != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private boolean a(int i1, k k1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)b.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj4 = (Fragment)sparsearray1.get(i1);
        Object obj5 = (Fragment)sparsearray.get(i1);
        Object obj;
        if (obj4 == null)
        {
            sparsearray1 = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getReenterTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getEnterTransition()));
            }
            sparsearray1 = ((SparseArray) (android.support.v4.app.ai.a(sparsearray)));
        }
        if (obj4 == null || obj5 == null)
        {
            obj = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj5)).getSharedElementReturnTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getSharedElementEnterTransition()));
            }
            obj = android.support.v4.app.ai.a(sparsearray);
        }
        if (obj5 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj5)).getReturnTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj5)).getExitTransition()));
            }
            sparsearray = ((SparseArray) (android.support.v4.app.ai.a(sparsearray)));
        }
        if (sparsearray1 == null && obj == null && sparsearray == null)
        {
            return false;
        }
        Object obj2 = null;
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            Object obj3 = a(k1, ((Fragment) (obj5)), flag);
            arraylist.add(k1.d);
            arraylist.addAll(((a) (obj3)).values());
            Object obj1;
            ArrayList arraylist1;
            a a1;
            g g1;
            Transition transition;
            if (flag)
            {
                obj1 = ((Fragment) (obj5)).mEnterTransitionCallback;
            } else
            {
                obj1 = ((Fragment) (obj4)).mEnterTransitionCallback;
            }
            obj2 = obj3;
            if (obj1 != null)
            {
                new ArrayList(((a) (obj3)).keySet());
                new ArrayList(((a) (obj3)).values());
                obj2 = obj3;
            }
        }
        arraylist1 = new ArrayList();
        obj3 = k1.d;
        obj1 = sparsearray;
        if (sparsearray != null)
        {
            obj1 = android.support.v4.app.ai.a(sparsearray, ((Fragment) (obj5)).getView(), arraylist1, ((java.util.Map) (obj2)), ((View) (obj3)));
        }
        if (v != null && obj2 != null)
        {
            sparsearray = (View)((a) (obj2)).get(v.get(0));
            if (sparsearray != null)
            {
                if (obj1 != null)
                {
                    android.support.v4.app.ai.a(obj1, sparsearray);
                }
                if (obj != null)
                {
                    android.support.v4.app.ai.a(obj, sparsearray);
                }
            }
        }
        g1 = new g(this, ((Fragment) (obj4)));
        if (obj != null)
        {
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new h(this, viewgroup, obj, arraylist, k1, flag, ((Fragment) (obj4)), ((Fragment) (obj5))));
        }
        obj5 = new ArrayList();
        a1 = new a();
        if (flag)
        {
            flag = ((Fragment) (obj4)).getAllowReturnTransitionOverlap();
        } else
        {
            flag = ((Fragment) (obj4)).getAllowEnterTransitionOverlap();
        }
        obj2 = (Transition)sparsearray1;
        sparsearray = (Transition)obj1;
        obj4 = (Transition)obj;
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
            sparsearray = ((SparseArray) (obj3));
            if (obj4 != null)
            {
                ((TransitionSet) (obj3)).addTransition(((Transition) (obj4)));
                sparsearray = ((SparseArray) (obj3));
            }
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
            if (obj4 != null)
            {
                obj2 = new TransitionSet();
                if (sparsearray != null)
                {
                    ((TransitionSet) (obj2)).addTransition(sparsearray);
                }
                ((TransitionSet) (obj2)).addTransition(((Transition) (obj4)));
                sparsearray = ((SparseArray) (obj2));
            }
        }
        if (sparsearray != null)
        {
            obj2 = k1.d;
            obj3 = k1.c;
            obj4 = k1.a;
            if (sparsearray1 != null || obj != null)
            {
                transition = (Transition)sparsearray1;
                if (transition != null)
                {
                    transition.addTarget(((View) (obj2)));
                }
                if (obj != null)
                {
                    ai.b((Transition)obj, arraylist);
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new ak(viewgroup, g1, ((java.util.Map) (obj4)), a1, transition, ((ArrayList) (obj5)), ((View) (obj2))));
                if (transition != null)
                {
                    transition.setEpicenterCallback(new al(((an) (obj3))));
                }
            }
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new i(this, viewgroup, k1, i1, sparsearray));
            android.support.v4.app.ai.a(sparsearray, k1.d, true);
            a(k1, i1, sparsearray);
            TransitionManager.beginDelayedTransition(viewgroup, (Transition)sparsearray);
            obj2 = k1.d;
            k1 = k1.b;
            sparsearray1 = (Transition)sparsearray1;
            obj1 = (Transition)obj1;
            obj = (Transition)obj;
            obj3 = (Transition)sparsearray;
            if (obj3 != null)
            {
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new am(viewgroup, sparsearray1, ((View) (obj2)), ((ArrayList) (obj5)), ((Transition) (obj1)), arraylist1, ((Transition) (obj)), arraylist, a1, k1, ((Transition) (obj3))));
            }
        }
        return sparsearray != null;
    }

    private static void b(k k1, a a1, boolean flag)
    {
        int j1 = a1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)a1.b(i1);
            String s2 = ((View)a1.c(i1)).getTransitionName();
            if (flag)
            {
                a(k1.a, s1, s2);
            } else
            {
                a(k1.a, s2, s1);
            }
            i1++;
        }
    }

    private static void b(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.mContainerId;
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
        j j1 = c;
_L12:
        if (j1 == null) goto _L1; else goto _L3
_L3:
        j1.c;
        JVM INSTR tableswitch 1 7: default 76
    //                   1 86
    //                   2 98
    //                   3 216
    //                   4 228
    //                   5 240
    //                   6 252
    //                   7 264;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_264;
_L13:
        j1 = j1.a;
          goto _L12
_L5:
        b(sparsearray1, j1.d);
          goto _L13
_L6:
        Fragment fragment = j1.d;
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
                        if (fragment2.mContainerId != fragment.mContainerId)
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
        a(sparsearray, j1.d);
          goto _L13
_L8:
        a(sparsearray, j1.d);
          goto _L13
_L9:
        b(sparsearray1, j1.d);
          goto _L13
_L10:
        a(sparsearray, j1.d);
          goto _L13
        b(sparsearray1, j1.d);
          goto _L13
    }

    public final int a()
    {
        return a(false);
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
        j j1 = new j();
        j1.c = 3;
        j1.d = fragment;
        a(j1);
        return this;
    }

    public final ah a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public final ah a(String s1)
    {
        if (!m)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            l = true;
            n = s1;
            return this;
        }
    }

    public final k a(boolean flag, k k1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        k k2;
        if (android.support.v4.app.x.a)
        {
            Log.v("FragmentManager", (new StringBuilder("popFromBackStack: ")).append(this).toString());
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        k2 = k1;
        if (!a) goto _L2; else goto _L1
_L1:
        if (k1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        k2 = k1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        k2 = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int l1;
        int i2;
        a(-1);
        if (k2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (k2 != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        k1 = d;
_L17:
        if (k1 == null) goto _L8; else goto _L7
_L7:
        if (k2 != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((j) (k1)).g;
        }
        if (k2 != null)
        {
            i2 = 0;
        } else
        {
            i2 = ((j) (k1)).h;
        }
        ((j) (k1)).c;
        JVM INSTR tableswitch 1 7: default 184
    //                   1 273
    //                   2 307
    //                   3 396
    //                   4 419
    //                   5 448
    //                   6 477
    //                   7 506;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((j) (k1)).c).toString());
_L4:
        k2 = k1;
        if (!flag)
        {
            a(k1, v, u);
            k2 = k1;
        }
          goto _L2
_L10:
        sparsearray = ((j) (k1)).d;
        sparsearray.mNextAnim = i2;
        b.a(sparsearray, android.support.v4.app.x.e(j1), i1);
_L18:
        k1 = ((j) (k1)).b;
          goto _L17
_L11:
        sparsearray = ((j) (k1)).d;
        if (sparsearray != null)
        {
            sparsearray.mNextAnim = i2;
            b.a(sparsearray, android.support.v4.app.x.e(j1), i1);
        }
        if (((j) (k1)).i != null)
        {
            i2 = 0;
            while (i2 < ((j) (k1)).i.size()) 
            {
                sparsearray = (Fragment)((j) (k1)).i.get(i2);
                sparsearray.mNextAnim = l1;
                b.a(sparsearray, false);
                i2++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((j) (k1)).d;
        sparsearray.mNextAnim = l1;
        b.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((j) (k1)).d;
        sparsearray.mNextAnim = l1;
        b.c(sparsearray, android.support.v4.app.x.e(j1), i1);
          goto _L18
_L14:
        sparsearray = ((j) (k1)).d;
        sparsearray.mNextAnim = i2;
        b.b(sparsearray, android.support.v4.app.x.e(j1), i1);
          goto _L18
_L15:
        sparsearray = ((j) (k1)).d;
        sparsearray.mNextAnim = l1;
        b.e(sparsearray, android.support.v4.app.x.e(j1), i1);
          goto _L18
_L16:
        sparsearray = ((j) (k1)).d;
        sparsearray.mNextAnim = l1;
        b.d(sparsearray, android.support.v4.app.x.e(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            b.a(b.n, android.support.v4.app.x.e(j1), i1, true);
            k2 = null;
        }
        if (p < 0) goto _L20; else goto _L19
_L19:
        k1 = b;
        i1 = p;
        k1;
        JVM INSTR monitorenter ;
        ((x) (k1)).k.set(i1, null);
        if (((x) (k1)).l == null)
        {
            k1.l = new ArrayList();
        }
        if (android.support.v4.app.x.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Freeing back stack index ")).append(i1).toString());
        }
        ((x) (k1)).l.add(Integer.valueOf(i1));
        k1;
        JVM INSTR monitorexit ;
        p = -1;
_L20:
        return k2;
        sparsearray;
        k1;
        JVM INSTR monitorexit ;
        throw sparsearray;
    }

    final void a(int i1)
    {
        if (l)
        {
            if (android.support.v4.app.x.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1).toString());
            }
            j j1 = c;
            while (j1 != null) 
            {
                if (j1.d != null)
                {
                    Fragment fragment = j1.d;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i1;
                    if (android.support.v4.app.x.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(j1.d).append(" to ").append(j1.d.mBackStackNesting).toString());
                    }
                }
                if (j1.i != null)
                {
                    for (int k1 = j1.i.size() - 1; k1 >= 0; k1--)
                    {
                        Fragment fragment1 = (Fragment)j1.i.get(k1);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i1;
                        if (android.support.v4.app.x.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting).toString());
                        }
                    }

                }
                j1 = j1.a;
            }
        }
    }

    final void a(j j1)
    {
        if (c == null)
        {
            d = j1;
            c = j1;
        } else
        {
            j1.b = d;
            d.a = j1;
            d = j1;
        }
        j1.e = f;
        j1.f = g;
        j1.g = h;
        j1.h = i;
        e = e + 1;
    }

    public final void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        j j1 = c;
_L12:
        if (j1 == null) goto _L1; else goto _L3
_L3:
        j1.c;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 80
    //                   2 91
    //                   3 150
    //                   4 161
    //                   5 172
    //                   6 183
    //                   7 194;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_194;
_L13:
        j1 = j1.a;
          goto _L12
_L5:
        a(sparsearray, j1.d);
          goto _L13
_L6:
        if (j1.i != null)
        {
            for (int i1 = j1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (Fragment)j1.i.get(i1));
            }

        }
        a(sparsearray, j1.d);
          goto _L13
_L7:
        b(sparsearray1, j1.d);
          goto _L13
_L8:
        b(sparsearray1, j1.d);
          goto _L13
_L9:
        a(sparsearray, j1.d);
          goto _L13
_L10:
        b(sparsearray1, j1.d);
          goto _L13
        a(sparsearray, j1.d);
          goto _L13
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        a(s1, printwriter, true);
    }

    public final void a(String s1, PrintWriter printwriter, boolean flag)
    {
        j j1;
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
        j1 = c;
        i1 = 0;
_L13:
        if (j1 == null) goto _L2; else goto _L1
_L1:
        j1.c;
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
        String s2 = (new StringBuilder("cmd=")).append(j1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(j1.d);
        if (flag)
        {
            if (j1.e != 0 || j1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(j1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(j1.f));
            }
            if (j1.g != 0 || j1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(j1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(j1.h));
            }
        }
        if (j1.i != null && j1.i.size() > 0)
        {
            int k1 = 0;
            while (k1 < j1.i.size()) 
            {
                printwriter.print(s3);
                if (j1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (k1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s3);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                }
                printwriter.println(j1.i.get(k1));
                k1++;
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
        j1 = j1.a;
        i1++;
          goto _L13
_L2:
    }

    public final int b()
    {
        return a(true);
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
        j j1 = new j();
        j1.c = 4;
        j1.d = fragment;
        a(j1);
        return this;
    }

    public final ah c(Fragment fragment)
    {
        j j1 = new j();
        j1.c = 5;
        j1.d = fragment;
        a(j1);
        return this;
    }

    public final String c()
    {
        return n;
    }

    public final ah d(Fragment fragment)
    {
        j j1 = new j();
        j1.c = 6;
        j1.d = fragment;
        a(j1);
        return this;
    }

    public final ah e(Fragment fragment)
    {
        j j1 = new j();
        j1.c = 7;
        j1.d = fragment;
        a(j1);
        return this;
    }

    public final void run()
    {
        if (android.support.v4.app.x.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Run: ")).append(this).toString());
        }
        if (l && p < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        Object obj;
        Object obj1;
        j j1;
        Fragment fragment;
        Fragment fragment1;
        int i1;
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
            k1 = 0;
        } else
        {
            k1 = j;
        }
        j1 = c;
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_685;
        }
        if (obj1 != null)
        {
            l1 = 0;
        } else
        {
            l1 = j1.e;
        }
        if (obj1 != null)
        {
            i2 = 0;
        } else
        {
            i2 = j1.f;
        }
        j1.c;
        JVM INSTR tableswitch 1 7: default 180
    //                   1 244
    //                   2 272
    //                   3 555
    //                   4 581
    //                   5 607
    //                   6 633
    //                   7 659;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_659;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(j1.c).toString());
_L2:
        obj = j1.d;
        obj.mNextAnim = l1;
        b.a(((Fragment) (obj)), false);
_L12:
        j1 = j1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_114;
_L9:
        obj = j1.d;
        if (b.g != null)
        {
            j2 = 0;
label0:
            do
            {
label1:
                {
                    fragment = ((Fragment) (obj));
                    if (j2 >= b.g.size())
                    {
                        break label0;
                    }
                    fragment1 = (Fragment)b.g.get(j2);
                    if (android.support.v4.app.x.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("OP_REPLACE: adding=")).append(obj).append(" old=").append(fragment1).toString());
                    }
                    if (obj != null)
                    {
                        fragment = ((Fragment) (obj));
                        if (fragment1.mContainerId != ((Fragment) (obj)).mContainerId)
                        {
                            break label1;
                        }
                    }
                    if (fragment1 == obj)
                    {
                        j1.d = null;
                        fragment = null;
                    } else
                    {
                        if (j1.i == null)
                        {
                            j1.i = new ArrayList();
                        }
                        j1.i.add(fragment1);
                        fragment1.mNextAnim = i2;
                        if (l)
                        {
                            fragment1.mBackStackNesting = fragment1.mBackStackNesting + 1;
                            if (android.support.v4.app.x.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting).toString());
                            }
                        }
                        b.a(fragment1, k1, i1);
                        fragment = ((Fragment) (obj));
                    }
                }
                j2++;
                obj = fragment;
            } while (true);
        } else
        {
            fragment = ((Fragment) (obj));
        }
        if (fragment != null)
        {
            fragment.mNextAnim = l1;
            b.a(fragment, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = j1.d;
        obj.mNextAnim = i2;
        b.a(((Fragment) (obj)), k1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = j1.d;
        obj.mNextAnim = i2;
        b.b(((Fragment) (obj)), k1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = j1.d;
        obj.mNextAnim = l1;
        b.c(((Fragment) (obj)), k1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = j1.d;
        obj.mNextAnim = i2;
        b.d(((Fragment) (obj)), k1, i1);
        continue; /* Loop/switch isn't completed */
        obj = j1.d;
        obj.mNextAnim = l1;
        b.e(((Fragment) (obj)), k1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        b.a(b.n, k1, i1, true);
        if (l)
        {
            obj = b;
            if (((x) (obj)).i == null)
            {
                obj.i = new ArrayList();
            }
            ((x) (obj)).i.add(this);
            ((x) (obj)).i();
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
