// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.util.a;
import android.support.v4.util.d;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            o, m, k, Fragment, 
//            p, i

final class e extends o
    implements Runnable
{
    static final class a
    {

        a a;
        a b;
        int c;
        Fragment d;
        int e;
        int f;
        int g;
        int h;
        ArrayList i;

        a()
        {
        }
    }

    public final class b
    {

        public android.support.v4.util.a a;
        public ArrayList b;
        public p.a c;
        public View d;
        final e e;

        public b()
        {
            e = e.this;
            super();
            a = new android.support.v4.util.a();
            b = new ArrayList();
            c = new p.a();
        }
    }


    static final boolean a;
    final m b;
    a c;
    a d;
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

    public e(m m1)
    {
        m = true;
        p = -1;
        b = m1;
    }

    private int a(boolean flag)
    {
        if (o)
        {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.m.a)
        {
            (new StringBuilder("Commit: ")).append(this);
            a("  ", new PrintWriter(new d("FragmentManager")));
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

    private b a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        b b1 = new b();
        b1.d = new View(b.o.b);
        boolean flag1 = false;
        for (int i1 = 0; i1 < sparsearray.size(); i1++)
        {
            if (a(sparsearray.keyAt(i1), b1, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
        }

        for (int j1 = 0; j1 < sparsearray1.size();)
        {
            int k1 = sparsearray1.keyAt(j1);
            boolean flag2 = flag1;
            if (sparsearray.get(k1) == null)
            {
                flag2 = flag1;
                if (a(k1, b1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            j1++;
            flag1 = flag2;
        }

        sparsearray = b1;
        if (!flag1)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    private android.support.v4.util.a a(b b1, Fragment fragment, boolean flag)
    {
        android.support.v4.util.a a2 = new android.support.v4.util.a();
        android.support.v4.util.a a1 = a2;
        if (u != null)
        {
            android.support.v4.app.p.a(a2, fragment.getView());
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
            a(b1, a1, false);
            return a1;
        }
        if (fragment.mExitTransitionCallback != null)
        {
            fragment = fragment.mExitTransitionCallback;
        }
        b(b1, a1, false);
        return a1;
    }

    static android.support.v4.util.a a(e e1, b b1, boolean flag, Fragment fragment)
    {
        android.support.v4.util.a a2 = new android.support.v4.util.a();
        View view = fragment.getView();
        android.support.v4.util.a a1 = a2;
        if (view != null)
        {
            a1 = a2;
            if (e1.u != null)
            {
                android.support.v4.app.p.a(a2, view);
                if (flag)
                {
                    a1 = a(e1.u, e1.v, a2);
                } else
                {
                    a2.a(e1.v);
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
            e1.a(b1, a1, true);
            return a1;
        }
        if (fragment.mEnterTransitionCallback != null)
        {
            e1 = fragment.mEnterTransitionCallback;
        }
        b(b1, a1, true);
        return a1;
    }

    private static android.support.v4.util.a a(ArrayList arraylist, ArrayList arraylist1, android.support.v4.util.a a1)
    {
        if (a1.isEmpty())
        {
            return a1;
        }
        android.support.v4.util.a a2 = new android.support.v4.util.a();
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
        s1 = new a();
        s1.c = j1;
        s1.d = fragment;
        a(((a) (s1)));
    }

    static void a(Fragment fragment, Fragment fragment1, boolean flag, android.support.v4.util.a a1)
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

    private void a(b b1, int i1, Object obj)
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
                        if (!b1.b.contains(fragment.mView))
                        {
                            android.support.v4.app.p.a(obj, fragment.mView, true);
                            b1.b.add(fragment.mView);
                        }
                    } else
                    {
                        android.support.v4.app.p.a(obj, fragment.mView, false);
                        b1.b.remove(fragment.mView);
                    }
                }
                j1++;
            }
        }
    }

    private void a(b b1, android.support.v4.util.a a1, boolean flag)
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
                    a(b1.a, s1, ((String) (obj)));
                } else
                {
                    a(b1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private static void a(b b1, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null)
        {
            for (int i1 = 0; i1 < arraylist.size(); i1++)
            {
                String s1 = (String)arraylist.get(i1);
                String s2 = (String)arraylist1.get(i1);
                a(b1.a, s1, s2);
            }

        }
    }

    static void a(e e1, b b1, int i1, Object obj)
    {
        e1.a(b1, i1, obj);
    }

    static void a(e e1, android.support.v4.util.a a1, b b1)
    {
        if (e1.v != null && !a1.isEmpty())
        {
            e1 = (View)a1.get(e1.v.get(0));
            if (e1 != null)
            {
                b1.c.a = e1;
            }
        }
    }

    private static void a(android.support.v4.util.a a1, String s1, String s2)
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
            int i1 = fragment.mContainerId;
            if (i1 != 0 && !fragment.isHidden() && fragment.isAdded() && fragment.getView() != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private boolean a(int i1, b b1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)b.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj4 = (Fragment)sparsearray1.get(i1);
        Object obj5 = (Fragment)sparsearray.get(i1);
        Object obj;
        Object obj1;
        Object obj2;
        ArrayList arraylist;
        if (obj4 == null)
        {
            obj1 = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getReenterTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getEnterTransition()));
            }
            obj1 = android.support.v4.app.p.a(sparsearray);
        }
        if (obj4 == null || obj5 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj5)).getSharedElementReturnTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getSharedElementEnterTransition()));
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
        if (obj5 == null)
        {
            obj = null;
        } else
        {
            if (flag)
            {
                sparsearray1 = ((SparseArray) (((Fragment) (obj5)).getReturnTransition()));
            } else
            {
                sparsearray1 = ((SparseArray) (((Fragment) (obj5)).getExitTransition()));
            }
            obj = android.support.v4.app.p.a(sparsearray1);
        }
        sparsearray1 = null;
        arraylist = new ArrayList();
        obj2 = sparsearray;
        if (sparsearray != null)
        {
            android.support.v4.util.a a1 = a(b1, ((Fragment) (obj5)), flag);
            if (a1.isEmpty())
            {
                obj2 = null;
                sparsearray1 = null;
            } else
            {
                if (flag)
                {
                    sparsearray1 = ((Fragment) (obj5)).mEnterTransitionCallback;
                } else
                {
                    sparsearray1 = ((Fragment) (obj4)).mEnterTransitionCallback;
                }
                if (sparsearray1 != null)
                {
                    new ArrayList(a1.keySet());
                    new ArrayList(a1.values());
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(viewgroup, sparsearray, arraylist, b1, flag, ((Fragment) (obj4)), ((Fragment) (obj5))) {

                    final View a;
                    final Object b;
                    final ArrayList c;
                    final b d;
                    final boolean e;
                    final Fragment f;
                    final Fragment g;
                    final e h;

                    public final boolean onPreDraw()
                    {
                        a.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (b != null)
                        {
                            android.support.v4.app.p.a(b, c);
                            c.clear();
                            android.support.v4.util.a a3 = android.support.v4.app.e.a(h, d, e, f);
                            android.support.v4.app.p.a(b, d.d, a3, c);
                            android.support.v4.app.e.a(h, a3, d);
                            android.support.v4.app.e.a(f, g, e, a3);
                        }
                        return true;
                    }

            
            {
                h = e.this;
                a = view;
                b = obj;
                c = arraylist;
                d = b1;
                e = flag;
                f = fragment;
                g = fragment1;
                super();
            }
                });
                obj2 = sparsearray;
                sparsearray1 = a1;
            }
        }
        if (obj1 == null && obj2 == null && obj == null)
        {
            return false;
        }
        ArrayList arraylist1 = new ArrayList();
        sparsearray = b1.d;
        Object obj3 = obj;
        if (obj != null)
        {
            obj3 = android.support.v4.app.p.a(obj, ((Fragment) (obj5)).getView(), arraylist1, sparsearray1, sparsearray);
        }
        if (v != null && sparsearray1 != null)
        {
            sparsearray = (View)sparsearray1.get(v.get(0));
            if (sparsearray != null)
            {
                if (obj3 != null)
                {
                    android.support.v4.app.p.a(obj3, sparsearray);
                }
                if (obj2 != null)
                {
                    android.support.v4.app.p.a(obj2, sparsearray);
                }
            }
        }
        p.b b2 = new p.b(((Fragment) (obj4))) {

            final Fragment a;
            final e b;

            public final View a()
            {
                return a.getView();
            }

            
            {
                b = e.this;
                a = fragment;
                super();
            }
        };
        obj5 = new ArrayList();
        android.support.v4.util.a a2 = new android.support.v4.util.a();
        boolean flag1 = true;
        Object obj6;
        if (obj4 != null)
        {
            if (flag)
            {
                flag1 = ((Fragment) (obj4)).getAllowReturnTransitionOverlap();
            } else
            {
                flag1 = ((Fragment) (obj4)).getAllowEnterTransitionOverlap();
            }
        }
        obj = (Transition)obj1;
        sparsearray = (Transition)obj3;
        obj6 = (Transition)obj2;
        if (obj == null || sparsearray == null)
        {
            flag1 = true;
        }
        if (flag1)
        {
            obj4 = new TransitionSet();
            if (obj != null)
            {
                ((TransitionSet) (obj4)).addTransition(((Transition) (obj)));
            }
            if (sparsearray != null)
            {
                ((TransitionSet) (obj4)).addTransition(sparsearray);
            }
            sparsearray = ((SparseArray) (obj4));
            if (obj6 != null)
            {
                ((TransitionSet) (obj4)).addTransition(((Transition) (obj6)));
                sparsearray = ((SparseArray) (obj4));
            }
        } else
        {
            if (sparsearray != null && obj != null)
            {
                sparsearray = (new TransitionSet()).addTransition(sparsearray).addTransition(((Transition) (obj))).setOrdering(1);
            } else
            if (sparsearray == null)
            {
                sparsearray = ((SparseArray) (obj));
                if (obj == null)
                {
                    sparsearray = null;
                }
            }
            if (obj6 != null)
            {
                obj = new TransitionSet();
                if (sparsearray != null)
                {
                    ((TransitionSet) (obj)).addTransition(sparsearray);
                }
                ((TransitionSet) (obj)).addTransition(((Transition) (obj6)));
                sparsearray = ((SparseArray) (obj));
            }
        }
        if (sparsearray != null)
        {
            obj = b1.d;
            obj4 = b1.c;
            obj6 = b1.a;
            if (obj1 != null || obj2 != null)
            {
                Transition transition = (Transition)obj1;
                if (transition != null)
                {
                    transition.addTarget(((View) (obj)));
                }
                if (obj2 != null)
                {
                    android.support.v4.app.p.a(obj2, ((View) (obj)), sparsearray1, arraylist);
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new p._cls2(viewgroup, transition, ((View) (obj)), b2, ((java.util.Map) (obj6)), a2, ((ArrayList) (obj5))));
                if (transition != null)
                {
                    transition.setEpicenterCallback(new p._cls3(((p.a) (obj4))));
                }
            }
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(viewgroup, b1, i1, sparsearray) {

                final View a;
                final b b;
                final int c;
                final Object d;
                final e e;

                public final boolean onPreDraw()
                {
                    a.getViewTreeObserver().removeOnPreDrawListener(this);
                    android.support.v4.app.e.a(e, b, c, d);
                    return true;
                }

            
            {
                e = e.this;
                a = view;
                b = b1;
                c = i1;
                d = obj;
                super();
            }
            });
            android.support.v4.app.p.a(sparsearray, b1.d, true);
            a(b1, i1, sparsearray);
            TransitionManager.beginDelayedTransition(viewgroup, (Transition)sparsearray);
            sparsearray1 = b1.d;
            b1 = b1.b;
            obj = (Transition)obj1;
            obj1 = (Transition)obj3;
            obj2 = (Transition)obj2;
            obj3 = (Transition)sparsearray;
            if (obj3 != null)
            {
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new p._cls4(viewgroup, ((Transition) (obj)), ((ArrayList) (obj5)), ((Transition) (obj1)), arraylist1, ((Transition) (obj2)), arraylist, a2, b1, ((Transition) (obj3)), sparsearray1));
            }
        }
        return sparsearray != null;
    }

    private static void b(b b1, android.support.v4.util.a a1, boolean flag)
    {
        int j1 = a1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)a1.b(i1);
            String s2 = ((View)a1.c(i1)).getTransitionName();
            if (flag)
            {
                a(b1.a, s1, s2);
            } else
            {
                a(b1.a, s2, s1);
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
        a a1 = c;
_L12:
        if (a1 == null) goto _L1; else goto _L3
_L3:
        a1.c;
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
        a1 = a1.a;
          goto _L12
_L5:
        b(sparsearray1, a1.d);
          goto _L13
_L6:
        Fragment fragment = a1.d;
        Fragment fragment1 = fragment;
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
        }
        b(sparsearray1, fragment1);
          goto _L13
_L7:
        a(sparsearray, a1.d);
          goto _L13
_L8:
        a(sparsearray, a1.d);
          goto _L13
_L9:
        b(sparsearray1, a1.d);
          goto _L13
_L10:
        a(sparsearray, a1.d);
          goto _L13
        b(sparsearray1, a1.d);
          goto _L13
    }

    public final int a()
    {
        return a(false);
    }

    public final b a(boolean flag, b b1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        b b2;
        if (android.support.v4.app.m.a)
        {
            (new StringBuilder("popFromBackStack: ")).append(this);
            a("  ", new PrintWriter(new d("FragmentManager")));
        }
        b2 = b1;
        if (!a) goto _L2; else goto _L1
_L1:
        if (b1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        b2 = b1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        b2 = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int k1;
        int l1;
        a(-1);
        if (b2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (b2 != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        b1 = d;
_L17:
        if (b1 == null) goto _L8; else goto _L7
_L7:
        if (b2 != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((a) (b1)).g;
        }
        if (b2 != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((a) (b1)).h;
        }
        ((a) (b1)).c;
        JVM INSTR tableswitch 1 7: default 176
    //                   1 265
    //                   2 299
    //                   3 388
    //                   4 411
    //                   5 440
    //                   6 469
    //                   7 498;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((a) (b1)).c).toString());
_L4:
        b2 = b1;
        if (!flag)
        {
            a(b1, v, u);
            b2 = b1;
        }
          goto _L2
_L10:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        b.a(sparsearray, android.support.v4.app.m.d(j1), i1);
_L18:
        b1 = ((a) (b1)).b;
          goto _L17
_L11:
        sparsearray = ((a) (b1)).d;
        if (sparsearray != null)
        {
            sparsearray.mNextAnim = l1;
            b.a(sparsearray, android.support.v4.app.m.d(j1), i1);
        }
        if (((a) (b1)).i != null)
        {
            l1 = 0;
            while (l1 < ((a) (b1)).i.size()) 
            {
                sparsearray = (Fragment)((a) (b1)).i.get(l1);
                sparsearray.mNextAnim = k1;
                b.a(sparsearray, false);
                l1++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        b.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        b.c(sparsearray, android.support.v4.app.m.d(j1), i1);
          goto _L18
_L14:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        b.b(sparsearray, android.support.v4.app.m.d(j1), i1);
          goto _L18
_L15:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        b.e(sparsearray, android.support.v4.app.m.d(j1), i1);
          goto _L18
_L16:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        b.d(sparsearray, android.support.v4.app.m.d(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            b.a(b.n, android.support.v4.app.m.d(j1), i1, true);
            b2 = null;
        }
        if (p < 0) goto _L20; else goto _L19
_L19:
        b1 = b;
        i1 = p;
        b1;
        JVM INSTR monitorenter ;
        ((m) (b1)).k.set(i1, null);
        if (((m) (b1)).l == null)
        {
            b1.l = new ArrayList();
        }
        flag = android.support.v4.app.m.a;
        ((m) (b1)).l.add(Integer.valueOf(i1));
        b1;
        JVM INSTR monitorexit ;
        p = -1;
_L20:
        return b2;
        sparsearray;
        b1;
        JVM INSTR monitorexit ;
        throw sparsearray;
    }

    public final o a(int i1, Fragment fragment)
    {
        return b(i1, fragment, ((String) (null)));
    }

    public final o a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public final o a(Fragment fragment)
    {
        a(0x7f1003a5, fragment, ((String) (null)), 1);
        return this;
    }

    public final o a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public final o a(String s1)
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

    final void a(int i1)
    {
        if (l)
        {
            if (android.support.v4.app.m.a)
            {
                (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1);
            }
            a a1 = c;
            while (a1 != null) 
            {
                if (a1.d != null)
                {
                    Fragment fragment = a1.d;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i1;
                    if (android.support.v4.app.m.a)
                    {
                        (new StringBuilder("Bump nesting of ")).append(a1.d).append(" to ").append(a1.d.mBackStackNesting);
                    }
                }
                if (a1.i != null)
                {
                    for (int j1 = a1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)a1.i.get(j1);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i1;
                        if (android.support.v4.app.m.a)
                        {
                            (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting);
                        }
                    }

                }
                a1 = a1.a;
            }
        }
    }

    final void a(a a1)
    {
        if (c == null)
        {
            d = a1;
            c = a1;
        } else
        {
            a1.b = d;
            d.a = a1;
            d = a1;
        }
        a1.e = f;
        a1.f = g;
        a1.g = h;
        a1.h = i;
        e = e + 1;
    }

    public final void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1 = c;
_L12:
        if (a1 == null) goto _L1; else goto _L3
_L3:
        a1.c;
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
        a1 = a1.a;
          goto _L12
_L5:
        a(sparsearray, a1.d);
          goto _L13
_L6:
        if (a1.i != null)
        {
            for (int i1 = a1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (Fragment)a1.i.get(i1));
            }

        }
        a(sparsearray, a1.d);
          goto _L13
_L7:
        b(sparsearray1, a1.d);
          goto _L13
_L8:
        b(sparsearray1, a1.d);
          goto _L13
_L9:
        a(sparsearray, a1.d);
          goto _L13
_L10:
        b(sparsearray1, a1.d);
          goto _L13
        a(sparsearray, a1.d);
          goto _L13
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        a(s1, printwriter, true);
    }

    public final void a(String s1, PrintWriter printwriter, boolean flag)
    {
        a a1;
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
        a1 = c;
        i1 = 0;
_L13:
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1.c;
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
        String s2 = (new StringBuilder("cmd=")).append(a1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(a1.d);
        if (flag)
        {
            if (a1.e != 0 || a1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(a1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(a1.f));
            }
            if (a1.g != 0 || a1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(a1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(a1.h));
            }
        }
        if (a1.i != null && a1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < a1.i.size()) 
            {
                printwriter.print(s3);
                if (a1.i.size() == 1)
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
                printwriter.println(a1.i.get(j1));
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
        a1 = a1.a;
        i1++;
          goto _L13
_L2:
    }

    public final int b()
    {
        return a(true);
    }

    public final o b(int i1, Fragment fragment, String s1)
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

    public final o b(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 3;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final o c(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 6;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final o d(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 7;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final void run()
    {
        a a1;
        int i1;
        int j1;
        int k1;
        int l1;
        if (android.support.v4.app.m.a)
        {
            (new StringBuilder("Run: ")).append(this);
        }
        if (l && p < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        Object obj = null;
        if (a)
        {
            SparseArray sparsearray = new SparseArray();
            obj = new SparseArray();
            b(sparsearray, ((SparseArray) (obj)));
            obj = a(sparsearray, ((SparseArray) (obj)), false);
        }
        if (obj != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (obj != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        a1 = c;
_L10:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = a1.e;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = a1.f;
        }
        a1.c;
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
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(a1.c).toString());
_L2:
        Fragment fragment = a1.d;
        fragment.mNextAnim = k1;
        b.a(fragment, false);
_L11:
        a1 = a1.a;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = a1.d;
        int j2 = fragment1.mContainerId;
        Fragment fragment7 = fragment1;
        if (b.g != null)
        {
            int i2 = 0;
            do
            {
                fragment7 = fragment1;
                if (i2 >= b.g.size())
                {
                    break;
                }
                Fragment fragment8 = (Fragment)b.g.get(i2);
                if (android.support.v4.app.m.a)
                {
                    (new StringBuilder("OP_REPLACE: adding=")).append(fragment1).append(" old=").append(fragment8);
                }
                fragment7 = fragment1;
                if (fragment8.mContainerId == j2)
                {
                    if (fragment8 == fragment1)
                    {
                        fragment7 = null;
                        a1.d = null;
                    } else
                    {
                        if (a1.i == null)
                        {
                            a1.i = new ArrayList();
                        }
                        a1.i.add(fragment8);
                        fragment8.mNextAnim = l1;
                        if (l)
                        {
                            fragment8.mBackStackNesting = fragment8.mBackStackNesting + 1;
                            if (android.support.v4.app.m.a)
                            {
                                (new StringBuilder("Bump nesting of ")).append(fragment8).append(" to ").append(fragment8.mBackStackNesting);
                            }
                        }
                        b.a(fragment8, j1, i1);
                        fragment7 = fragment1;
                    }
                }
                i2++;
                fragment1 = fragment7;
            } while (true);
        }
        if (fragment7 != null)
        {
            fragment7.mNextAnim = k1;
            b.a(fragment7, false);
        }
          goto _L11
_L4:
        Fragment fragment2 = a1.d;
        fragment2.mNextAnim = l1;
        b.a(fragment2, j1, i1);
          goto _L11
_L5:
        Fragment fragment3 = a1.d;
        fragment3.mNextAnim = l1;
        b.b(fragment3, j1, i1);
          goto _L11
_L6:
        Fragment fragment4 = a1.d;
        fragment4.mNextAnim = k1;
        b.c(fragment4, j1, i1);
          goto _L11
_L7:
        Fragment fragment5 = a1.d;
        fragment5.mNextAnim = l1;
        b.d(fragment5, j1, i1);
          goto _L11
        Fragment fragment6 = a1.d;
        fragment6.mNextAnim = k1;
        b.e(fragment6, j1, i1);
          goto _L11
        b.a(b.n, j1, i1, true);
        if (l)
        {
            m m1 = b;
            if (m1.i == null)
            {
                m1.i = new ArrayList();
            }
            m1.i.add(this);
            m1.j();
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
