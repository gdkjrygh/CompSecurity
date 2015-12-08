// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.g.a;
import android.support.v4.g.d;
import android.support.v4.g.f;
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
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//            q, n, l, Fragment, 
//            r, j

final class e extends q
    implements m.a, Runnable
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

        public android.support.v4.g.a a;
        public ArrayList b;
        public r.a c;
        public View d;
        final e e;

        public b()
        {
            e = e.this;
            super();
            a = new android.support.v4.g.a();
            b = new ArrayList();
            c = new r.a();
        }
    }


    static final boolean a;
    final n b;
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

    public e(n n1)
    {
        m = true;
        p = -1;
        b = n1;
    }

    private int a(boolean flag)
    {
        if (o)
        {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.n.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Commit: ")).append(this).toString());
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
        boolean flag4 = false;
        b b1 = new b();
        b1.d = new View(b.o.c);
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
            if (a(sparsearray.keyAt(i1), b1, flag, sparsearray, sparsearray1))
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
                if (a(j1, b1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k1++;
            flag3 = flag2;
        }
        sparsearray = b1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    private android.support.v4.g.a a(b b1, Fragment fragment, boolean flag)
    {
        android.support.v4.g.a a2 = new android.support.v4.g.a();
        android.support.v4.g.a a1 = a2;
        if (u != null)
        {
            android.support.v4.app.r.a(a2, fragment.getView());
            if (flag)
            {
                android.support.v4.g.f.a(a2, v);
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

    static android.support.v4.g.a a(e e1, b b1, boolean flag, Fragment fragment)
    {
        android.support.v4.g.a a2 = new android.support.v4.g.a();
        View view = fragment.getView();
        android.support.v4.g.a a1 = a2;
        if (view != null)
        {
            a1 = a2;
            if (e1.u != null)
            {
                android.support.v4.app.r.a(a2, view);
                if (flag)
                {
                    a1 = a(e1.u, e1.v, a2);
                } else
                {
                    android.support.v4.g.f.a(a2, e1.v);
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

    private static android.support.v4.g.a a(ArrayList arraylist, ArrayList arraylist1, android.support.v4.g.a a1)
    {
        if (a1.isEmpty())
        {
            return a1;
        }
        android.support.v4.g.a a2 = new android.support.v4.g.a();
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

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, android.support.v4.g.a a1, View view)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                fragment = fragment.getView();
                obj1 = obj;
                if (obj != null)
                {
                    android.support.v4.app.r.a(arraylist, fragment);
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
        android.support.v4.app.r.b((Transition)obj, arraylist);
        return obj;
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

    static void a(Fragment fragment, Fragment fragment1, boolean flag, android.support.v4.g.a a1)
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
                            android.support.v4.app.r.a(obj, fragment.mView, true);
                            b1.b.add(fragment.mView);
                        }
                    } else
                    {
                        android.support.v4.app.r.a(obj, fragment.mView, false);
                        b1.b.remove(fragment.mView);
                    }
                }
                j1++;
            }
        }
    }

    private void a(b b1, android.support.v4.g.a a1, boolean flag)
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

    static void a(e e1, android.support.v4.g.a a1, b b1)
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

    private static void a(android.support.v4.g.a a1, String s1, String s2)
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
                sparsearray = ((SparseArray) (((Fragment) (obj3)).getReenterTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj3)).getEnterTransition()));
            }
            obj1 = android.support.v4.app.r.a(sparsearray);
        }
        if (obj3 == null || obj4 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((Fragment) (obj4)).getSharedElementReturnTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((Fragment) (obj3)).getSharedElementEnterTransition()));
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
                sparsearray1 = ((SparseArray) (((Fragment) (obj4)).getReturnTransition()));
            } else
            {
                sparsearray1 = ((SparseArray) (((Fragment) (obj4)).getExitTransition()));
            }
            obj2 = android.support.v4.app.r.a(sparsearray1);
        }
        arraylist = new ArrayList();
        ArrayList arraylist1;
        android.support.v4.g.a a1;
        Object obj5;
        r.b b2;
        Object obj6;
        if (sparsearray != null)
        {
            obj = a(b1, ((Fragment) (obj4)), flag);
            if (((android.support.v4.g.a) (obj)).isEmpty())
            {
                obj = null;
                sparsearray1 = null;
            } else
            {
                if (flag)
                {
                    sparsearray1 = ((Fragment) (obj4)).mEnterTransitionCallback;
                } else
                {
                    sparsearray1 = ((Fragment) (obj3)).mEnterTransitionCallback;
                }
                if (sparsearray1 != null)
                {
                    new ArrayList(((android.support.v4.g.a) (obj)).keySet());
                    new ArrayList(((android.support.v4.g.a) (obj)).values());
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(viewgroup, sparsearray, arraylist, b1, flag, ((Fragment) (obj3)), ((Fragment) (obj4))) {

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
                            android.support.v4.app.r.a(b, c);
                            c.clear();
                            android.support.v4.g.a a2 = android.support.v4.app.e.a(h, d, e, f);
                            android.support.v4.app.r.a(b, d.d, a2, c);
                            android.support.v4.app.e.a(h, a2, d);
                            android.support.v4.app.e.a(f, g, e, a2);
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
        obj5 = a(obj2, ((Fragment) (obj4)), arraylist1, ((android.support.v4.g.a) (obj)), b1.d);
        if (v != null && obj != null)
        {
            sparsearray = (View)((android.support.v4.g.a) (obj)).get(v.get(0));
            if (sparsearray != null)
            {
                if (obj5 != null)
                {
                    android.support.v4.app.r.a(obj5, sparsearray);
                }
                if (sparsearray1 != null)
                {
                    android.support.v4.app.r.a(sparsearray1, sparsearray);
                }
            }
        }
        b2 = new r.b(((Fragment) (obj3))) {

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
        obj4 = new ArrayList();
        a1 = new android.support.v4.g.a();
        if (obj3 != null)
        {
            if (flag)
            {
                flag = ((Fragment) (obj3)).getAllowReturnTransitionOverlap();
            } else
            {
                flag = ((Fragment) (obj3)).getAllowEnterTransitionOverlap();
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
            obj2 = b1.d;
            obj3 = b1.c;
            obj6 = b1.a;
            if (obj1 != null || sparsearray1 != null)
            {
                Transition transition = (Transition)obj1;
                if (transition != null)
                {
                    transition.addTarget(((View) (obj2)));
                }
                if (sparsearray1 != null)
                {
                    android.support.v4.app.r.a(sparsearray1, ((View) (obj2)), ((Map) (obj)), arraylist);
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new r._cls2(viewgroup, transition, ((View) (obj2)), b2, ((Map) (obj6)), a1, ((ArrayList) (obj4))));
                if (transition != null)
                {
                    transition.setEpicenterCallback(new r._cls3(((r.a) (obj3))));
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
            android.support.v4.app.r.a(sparsearray, b1.d, true);
            a(b1, i1, sparsearray);
            TransitionManager.beginDelayedTransition(viewgroup, (Transition)sparsearray);
            obj = b1.d;
            b1 = b1.b;
            obj1 = (Transition)obj1;
            obj2 = (Transition)obj5;
            sparsearray1 = (Transition)sparsearray1;
            obj3 = (Transition)sparsearray;
            if (obj3 != null)
            {
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new r._cls4(viewgroup, ((Transition) (obj1)), ((ArrayList) (obj4)), ((Transition) (obj2)), arraylist1, sparsearray1, arraylist, a1, b1, ((Transition) (obj3)), ((View) (obj))));
            }
        }
        return sparsearray != null;
    }

    private static void b(b b1, android.support.v4.g.a a1, boolean flag)
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

    public final b a(boolean flag, b b1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        b b2;
        if (android.support.v4.app.n.a)
        {
            Log.v("FragmentManager", (new StringBuilder("popFromBackStack: ")).append(this).toString());
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
        b.a(sparsearray, android.support.v4.app.n.e(j1), i1);
_L18:
        b1 = ((a) (b1)).b;
          goto _L17
_L11:
        sparsearray = ((a) (b1)).d;
        if (sparsearray != null)
        {
            sparsearray.mNextAnim = l1;
            b.a(sparsearray, android.support.v4.app.n.e(j1), i1);
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
        b.c(sparsearray, android.support.v4.app.n.e(j1), i1);
          goto _L18
_L14:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        b.b(sparsearray, android.support.v4.app.n.e(j1), i1);
          goto _L18
_L15:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        b.e(sparsearray, android.support.v4.app.n.e(j1), i1);
          goto _L18
_L16:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        b.d(sparsearray, android.support.v4.app.n.e(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            b.a(b.n, android.support.v4.app.n.e(j1), i1, true);
            b2 = null;
        }
        if (p < 0) goto _L20; else goto _L19
_L19:
        b1 = b;
        i1 = p;
        b1;
        JVM INSTR monitorenter ;
        ((n) (b1)).k.set(i1, null);
        if (((n) (b1)).l == null)
        {
            b1.l = new ArrayList();
        }
        if (android.support.v4.app.n.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Freeing back stack index ")).append(i1).toString());
        }
        ((n) (b1)).l.add(Integer.valueOf(i1));
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

    public final q a()
    {
        f = 0x7f040015;
        g = 0x7f040018;
        h = 0x7f040014;
        i = 0x7f040017;
        return this;
    }

    public final q a(int i1, Fragment fragment)
    {
        a(i1, fragment, ((String) (null)), 1);
        return this;
    }

    public final q a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public final q a(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 3;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final q a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public final q a(String s1)
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
            if (android.support.v4.app.n.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1).toString());
            }
            a a1 = c;
            while (a1 != null) 
            {
                if (a1.d != null)
                {
                    Fragment fragment = a1.d;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i1;
                    if (android.support.v4.app.n.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(a1.d).append(" to ").append(a1.d.mBackStackNesting).toString());
                    }
                }
                if (a1.i != null)
                {
                    for (int j1 = a1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)a1.i.get(j1);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i1;
                        if (android.support.v4.app.n.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting).toString());
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

    public final q b()
    {
        if (l)
        {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        } else
        {
            m = false;
            return this;
        }
    }

    public final q b(int i1, Fragment fragment)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, fragment, ((String) (null)), 2);
            return this;
        }
    }

    public final q b(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 6;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final int c()
    {
        return a(false);
    }

    public final q c(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 7;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final int d()
    {
        return a(true);
    }

    public final String e()
    {
        return n;
    }

    public final boolean f()
    {
        return e == 0;
    }

    public final void run()
    {
        if (android.support.v4.app.n.a)
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
        a a1;
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
        a1 = c;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_685;
        }
        if (obj1 != null)
        {
            k1 = 0;
        } else
        {
            k1 = a1.e;
        }
        if (obj1 != null)
        {
            l1 = 0;
        } else
        {
            l1 = a1.f;
        }
        a1.c;
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
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(a1.c).toString());
_L2:
        obj = a1.d;
        obj.mNextAnim = k1;
        b.a(((Fragment) (obj)), false);
_L12:
        a1 = a1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_114;
_L9:
        obj = a1.d;
        j2 = ((Fragment) (obj)).mContainerId;
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
                if (android.support.v4.app.n.a)
                {
                    Log.v("FragmentManager", (new StringBuilder("OP_REPLACE: adding=")).append(obj).append(" old=").append(fragment1).toString());
                }
                fragment = ((Fragment) (obj));
                if (fragment1.mContainerId == j2)
                {
                    if (fragment1 == obj)
                    {
                        fragment = null;
                        a1.d = null;
                    } else
                    {
                        if (a1.i == null)
                        {
                            a1.i = new ArrayList();
                        }
                        a1.i.add(fragment1);
                        fragment1.mNextAnim = l1;
                        if (l)
                        {
                            fragment1.mBackStackNesting = fragment1.mBackStackNesting + 1;
                            if (android.support.v4.app.n.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting).toString());
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
            fragment.mNextAnim = k1;
            b.a(fragment, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = a1.d;
        obj.mNextAnim = l1;
        b.a(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = a1.d;
        obj.mNextAnim = l1;
        b.b(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = a1.d;
        obj.mNextAnim = k1;
        b.c(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = a1.d;
        obj.mNextAnim = l1;
        b.d(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
        obj = a1.d;
        obj.mNextAnim = k1;
        b.e(((Fragment) (obj)), j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        b.a(b.n, j1, i1, true);
        if (l)
        {
            obj = b;
            if (((n) (obj)).i == null)
            {
                obj.i = new ArrayList();
            }
            ((n) (obj)).i.add(this);
            ((n) (obj)).j();
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
