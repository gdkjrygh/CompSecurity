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

public final class Q extends V
    implements S.a, Runnable
{
    public static final class a
    {

        public a a;
        a b;
        public int c;
        public Fragment d;
        public int e;
        public int f;
        public int g;
        public int h;
        public ArrayList i;

        public a()
        {
        }
    }

    public final class b
    {

        public av a;
        public ArrayList b;
        public W.a c;
        public View d;

        public b()
        {
            a = new av();
            b = new ArrayList();
            c = new W.a();
        }
    }


    private static boolean n;
    public a a;
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
    private T o;
    private a p;
    private boolean q;
    private boolean r;

    public Q(T t)
    {
        q = true;
        g = -1;
        o = t;
    }

    private int a(boolean flag)
    {
        if (r)
        {
            throw new IllegalStateException("commit already called");
        }
        r = true;
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

    private b a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        b b1 = new b();
        b1.d = new View(o.g);
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

    private av a(b b1, Fragment fragment, boolean flag)
    {
        av av2 = new av();
        av av1 = av2;
        if (l != null)
        {
            W.a(av2, fragment.getView());
            if (flag)
            {
                aB.a(av2, m);
                av1 = av2;
            } else
            {
                av1 = a(l, m, av2);
            }
        }
        if (flag)
        {
            if (fragment.mEnterTransitionCallback != null)
            {
                fragment = fragment.mEnterTransitionCallback;
            }
            a(b1, av1, false);
            return av1;
        }
        if (fragment.mExitTransitionCallback != null)
        {
            fragment = fragment.mExitTransitionCallback;
        }
        b(b1, av1, false);
        return av1;
    }

    static av a(Q q1, b b1, boolean flag, Fragment fragment)
    {
        av av2 = new av();
        View view = fragment.getView();
        av av1 = av2;
        if (view != null)
        {
            av1 = av2;
            if (q1.l != null)
            {
                W.a(av2, view);
                if (flag)
                {
                    av1 = a(q1.l, q1.m, av2);
                } else
                {
                    aB.a(av2, q1.m);
                    av1 = av2;
                }
            }
        }
        if (flag)
        {
            if (fragment.mExitTransitionCallback != null)
            {
                fragment = fragment.mExitTransitionCallback;
            }
            q1.a(b1, av1, true);
            return av1;
        }
        if (fragment.mEnterTransitionCallback != null)
        {
            q1 = fragment.mEnterTransitionCallback;
        }
        b(b1, av1, true);
        return av1;
    }

    private static av a(ArrayList arraylist, ArrayList arraylist1, av av1)
    {
        if (av1.isEmpty())
        {
            return av1;
        }
        av av2 = new av();
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = (View)av1.get(arraylist.get(i1));
            if (view != null)
            {
                av2.put(arraylist1.get(i1), view);
            }
        }

        return av2;
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, av av1, View view)
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
                    W.a(arraylist, fragment);
                    if (av1 != null)
                    {
                        arraylist.removeAll(av1.values());
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
        W.b((Transition)obj, arraylist);
        return obj;
    }

    private void a(int i1, Fragment fragment, String s, int j1)
    {
        fragment.mFragmentManager = o;
        if (s != null)
        {
            if (fragment.mTag != null && !s.equals(fragment.mTag))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.mTag).append(" now ").append(s).toString());
            }
            fragment.mTag = s;
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
        s = new a();
        s.c = j1;
        s.d = fragment;
        a(((a) (s)));
    }

    private void a(b b1, int i1, Object obj)
    {
        if (o.b != null)
        {
            int j1 = 0;
            while (j1 < o.b.size()) 
            {
                Fragment fragment = (Fragment)o.b.get(j1);
                if (fragment.mView != null && fragment.mContainer != null && fragment.mContainerId == i1)
                {
                    if (fragment.mHidden)
                    {
                        if (!b1.b.contains(fragment.mView))
                        {
                            W.a(obj, fragment.mView, true);
                            b1.b.add(fragment.mView);
                        }
                    } else
                    {
                        W.a(obj, fragment.mView, false);
                        b1.b.remove(fragment.mView);
                    }
                }
                j1++;
            }
        }
    }

    private void a(b b1, av av1, boolean flag)
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
            String s = (String)l.get(j1);
            Object obj = (View)av1.get((String)m.get(j1));
            if (obj != null)
            {
                obj = ((View) (obj)).getTransitionName();
                if (flag)
                {
                    a(b1.a, s, ((String) (obj)));
                } else
                {
                    a(b1.a, ((String) (obj)), s);
                }
            }
            j1++;
        }
    }

    static void a(Q q1, b b1, int i1, Object obj)
    {
        q1.a(b1, i1, obj);
    }

    static void a(Q q1, av av1, b b1)
    {
        if (q1.m != null && !av1.isEmpty())
        {
            q1 = (View)av1.get(q1.m.get(0));
            if (q1 != null)
            {
                b1.c.a = q1;
            }
        }
    }

    static void a(Fragment fragment, Fragment fragment1, boolean flag, av av1)
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
            new ArrayList(av1.keySet());
            new ArrayList(av1.values());
        }
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

    private static void a(av av1, String s, String s1)
    {
        if (s == null || s1 == null || s.equals(s1)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= av1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s.equals(av1.c(i1))) goto _L4; else goto _L3
_L3:
        av1.a(i1, s1);
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        av1.put(s, s1);
        return;
    }

    private boolean a(int i1, b b1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)o.h.a(i1);
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
            sparsearray1 = ((SparseArray) (W.a(sparsearray)));
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
            obj = W.a(sparsearray);
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
            sparsearray = ((SparseArray) (W.a(sparsearray)));
        }
        if (sparsearray1 == null && obj == null && sparsearray == null)
        {
            return false;
        }
        Object obj1 = null;
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            Object obj3 = a(b1, ((Fragment) (obj5)), flag);
            arraylist.add(b1.d);
            arraylist.addAll(((av) (obj3)).values());
            Object obj2;
            Object obj6;
            av av1;
            W.b b2;
            Transition transition;
            if (flag)
            {
                obj2 = ((Fragment) (obj5)).mEnterTransitionCallback;
            } else
            {
                obj2 = ((Fragment) (obj4)).mEnterTransitionCallback;
            }
            obj1 = obj3;
            if (obj2 != null)
            {
                new ArrayList(((av) (obj3)).keySet());
                new ArrayList(((av) (obj3)).values());
                obj1 = obj3;
            }
        }
        obj3 = new ArrayList();
        obj6 = a(sparsearray, ((Fragment) (obj5)), ((ArrayList) (obj3)), ((av) (obj1)), b1.d);
        if (m != null && obj1 != null)
        {
            sparsearray = (View)((av) (obj1)).get(m.get(0));
            if (sparsearray != null)
            {
                if (obj6 != null)
                {
                    W.a(obj6, sparsearray);
                }
                if (obj != null)
                {
                    W.a(obj, sparsearray);
                }
            }
        }
        b2 = new W.b(((Fragment) (obj4))) {

            private Fragment a;

            public final View a()
            {
                return a.getView();
            }

            
            {
                a = fragment;
                super();
            }
        };
        if (obj != null)
        {
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(viewgroup, obj, arraylist, b1, flag, ((Fragment) (obj4)), ((Fragment) (obj5))) {

                private View a;
                private Object b;
                private ArrayList c;
                private b d;
                private boolean e;
                private Fragment f;
                private Fragment g;
                private Q h;

                public final boolean onPreDraw()
                {
                    a.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (b != null)
                    {
                        W.a(b, c);
                        c.clear();
                        av av2 = Q.a(h, d, e, f);
                        c.add(d.d);
                        c.addAll(av2.values());
                        W.b(b, c);
                        Q.a(h, av2, d);
                        Q.a(f, g, e, av2);
                    }
                    return true;
                }

            
            {
                h = Q.this;
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
        }
        obj5 = new ArrayList();
        av1 = new av();
        if (flag)
        {
            flag = ((Fragment) (obj4)).getAllowReturnTransitionOverlap();
        } else
        {
            flag = ((Fragment) (obj4)).getAllowEnterTransitionOverlap();
        }
        obj1 = (Transition)sparsearray1;
        sparsearray = (Transition)obj6;
        obj4 = (Transition)obj;
        if (obj1 == null || sparsearray == null)
        {
            flag = true;
        }
        if (flag)
        {
            obj2 = new TransitionSet();
            if (obj1 != null)
            {
                ((TransitionSet) (obj2)).addTransition(((Transition) (obj1)));
            }
            if (sparsearray != null)
            {
                ((TransitionSet) (obj2)).addTransition(sparsearray);
            }
            sparsearray = ((SparseArray) (obj2));
            if (obj4 != null)
            {
                ((TransitionSet) (obj2)).addTransition(((Transition) (obj4)));
                sparsearray = ((SparseArray) (obj2));
            }
        } else
        {
            if (sparsearray != null && obj1 != null)
            {
                sparsearray = (new TransitionSet()).addTransition(sparsearray).addTransition(((Transition) (obj1))).setOrdering(1);
            } else
            if (sparsearray == null)
            {
                sparsearray = ((SparseArray) (obj1));
                if (obj1 == null)
                {
                    sparsearray = null;
                }
            }
            if (obj4 != null)
            {
                obj1 = new TransitionSet();
                if (sparsearray != null)
                {
                    ((TransitionSet) (obj1)).addTransition(sparsearray);
                }
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj4)));
                sparsearray = ((SparseArray) (obj1));
            }
        }
        if (sparsearray != null)
        {
            obj1 = b1.d;
            obj2 = b1.c;
            obj4 = b1.a;
            if (sparsearray1 != null || obj != null)
            {
                transition = (Transition)sparsearray1;
                if (transition != null)
                {
                    transition.addTarget(((View) (obj1)));
                }
                if (obj != null)
                {
                    W.b((Transition)obj, arraylist);
                }
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new W._cls2(viewgroup, b2, ((Map) (obj4)), av1, transition, ((ArrayList) (obj5)), ((View) (obj1))));
                if (transition != null)
                {
                    transition.setEpicenterCallback(new W._cls3(((W.a) (obj2))));
                }
            }
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(viewgroup, b1, i1, sparsearray) {

                private View a;
                private b b;
                private int c;
                private Object d;
                private Q e;

                public final boolean onPreDraw()
                {
                    a.getViewTreeObserver().removeOnPreDrawListener(this);
                    Q.a(e, b, c, d);
                    return true;
                }

            
            {
                e = Q.this;
                a = view;
                b = b1;
                c = i1;
                d = obj;
                super();
            }
            });
            W.a(sparsearray, b1.d, true);
            a(b1, i1, sparsearray);
            TransitionManager.beginDelayedTransition(viewgroup, (Transition)sparsearray);
            obj1 = b1.d;
            b1 = b1.b;
            sparsearray1 = (Transition)sparsearray1;
            obj2 = (Transition)obj6;
            obj = (Transition)obj;
            obj4 = (Transition)sparsearray;
            if (obj4 != null)
            {
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new W._cls4(viewgroup, sparsearray1, ((View) (obj1)), ((ArrayList) (obj5)), ((Transition) (obj2)), ((ArrayList) (obj3)), ((Transition) (obj)), arraylist, av1, b1, ((Transition) (obj4))));
            }
        }
        return sparsearray != null;
    }

    private static void b(b b1, av av1, boolean flag)
    {
        int j1 = av1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = (String)av1.b(i1);
            String s1 = ((View)av1.c(i1)).getTransitionName();
            if (flag)
            {
                a(b1.a, s, s1);
            } else
            {
                a(b1.a, s1, s);
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
        if (o.h.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1 = a;
_L12:
        if (a1 == null) goto _L1; else goto _L3
_L3:
        a1.c;
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
        a1 = a1.a;
          goto _L12
_L5:
        b(sparsearray1, a1.d);
          goto _L13
_L6:
        Fragment fragment = a1.d;
        Fragment fragment1;
        if (o.b != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i1 >= o.b.size())
                    {
                        break label0;
                    }
                    Fragment fragment2 = (Fragment)o.b.get(i1);
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

    public final int a()
    {
        return a(false);
    }

    public final b a(boolean flag, b b1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        Object obj = b1;
        if (!n) goto _L2; else goto _L1
_L1:
        if (b1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        obj = b1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        obj = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int k1;
        int l1;
        a(-1);
        String s;
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
        b1 = p;
_L17:
        if (b1 == null) goto _L8; else goto _L7
_L7:
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((a) (b1)).g;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((a) (b1)).h;
        }
        ((a) (b1)).c;
        JVM INSTR tableswitch 1 7: default 132
    //                   1 279
    //                   2 313
    //                   3 402
    //                   4 425
    //                   5 454
    //                   6 483
    //                   7 512;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((a) (b1)).c).toString());
_L4:
        obj = b1;
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        sparsearray = m;
        sparsearray1 = l;
        obj = b1;
        if (sparsearray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
        do
        {
            obj = b1;
            if (i1 >= sparsearray.size())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (String)sparsearray.get(i1);
            s = (String)sparsearray1.get(i1);
            a(b1.a, ((String) (obj)), s);
            i1++;
        } while (true);
        continue; /* Loop/switch isn't completed */
_L10:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        o.a(sparsearray, T.e(j1), i1);
_L18:
        b1 = ((a) (b1)).b;
          goto _L17
_L11:
        sparsearray = ((a) (b1)).d;
        if (sparsearray != null)
        {
            sparsearray.mNextAnim = l1;
            o.a(sparsearray, T.e(j1), i1);
        }
        if (((a) (b1)).i != null)
        {
            l1 = 0;
            while (l1 < ((a) (b1)).i.size()) 
            {
                sparsearray = (Fragment)((a) (b1)).i.get(l1);
                sparsearray.mNextAnim = k1;
                o.a(sparsearray, false);
                l1++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        o.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        o.c(sparsearray, T.e(j1), i1);
          goto _L18
_L14:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        o.b(sparsearray, T.e(j1), i1);
          goto _L18
_L15:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        o.e(sparsearray, T.e(j1), i1);
          goto _L18
_L16:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        o.d(sparsearray, T.e(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            o.a(o.f, T.e(j1), i1, true);
            obj = null;
        }
        if (g < 0) goto _L20; else goto _L19
_L19:
        b1 = o;
        i1 = g;
        b1;
        JVM INSTR monitorenter ;
        ((T) (b1)).d.set(i1, null);
        if (((T) (b1)).e == null)
        {
            b1.e = new ArrayList();
        }
        ((T) (b1)).e.add(Integer.valueOf(i1));
        b1;
        JVM INSTR monitorexit ;
        g = -1;
_L20:
        return ((b) (obj));
        sparsearray;
        b1;
        JVM INSTR monitorexit ;
        throw sparsearray;
        if (true) goto _L2; else goto _L21
_L21:
    }

    public final V a(int i1, Fragment fragment)
    {
        a(i1, fragment, ((String) (null)), 1);
        return this;
    }

    public final V a(int i1, Fragment fragment, String s)
    {
        a(i1, fragment, s, 1);
        return this;
    }

    public final V a(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 3;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final V a(Fragment fragment, String s)
    {
        a(0, fragment, s, 1);
        return this;
    }

    public final V a(String s)
    {
        if (!q)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            e = true;
            f = s;
            return this;
        }
    }

    public final void a(int i1)
    {
        if (e)
        {
            a a1 = a;
            while (a1 != null) 
            {
                if (a1.d != null)
                {
                    Fragment fragment = a1.d;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i1;
                }
                if (a1.i != null)
                {
                    for (int j1 = a1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)a1.i.get(j1);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i1;
                    }

                }
                a1 = a1.a;
            }
        }
    }

    public final void a(a a1)
    {
        if (a == null)
        {
            p = a1;
            a = a1;
        } else
        {
            a1.b = p;
            p.a = a1;
            p = a1;
        }
        a1.e = 0;
        a1.f = 0;
        a1.g = 0;
        a1.h = 0;
        b = b + 1;
    }

    public final void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (o.h.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1 = a;
_L12:
        if (a1 == null) goto _L1; else goto _L3
_L3:
        a1.c;
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

    public final void a(String s, PrintWriter printwriter)
    {
        a a1;
        String s2;
        int i1;
        printwriter.print(s);
        printwriter.print("mName=");
        printwriter.print(f);
        printwriter.print(" mIndex=");
        printwriter.print(g);
        printwriter.print(" mCommitted=");
        printwriter.println(r);
        if (c != 0)
        {
            printwriter.print(s);
            printwriter.print("mTransition=#");
            printwriter.print(Integer.toHexString(c));
            printwriter.print(" mTransitionStyle=#");
            printwriter.println(Integer.toHexString(d));
        }
        if (h != 0 || i != null)
        {
            printwriter.print(s);
            printwriter.print("mBreadCrumbTitleRes=#");
            printwriter.print(Integer.toHexString(h));
            printwriter.print(" mBreadCrumbTitleText=");
            printwriter.println(i);
        }
        if (j != 0 || k != null)
        {
            printwriter.print(s);
            printwriter.print("mBreadCrumbShortTitleRes=#");
            printwriter.print(Integer.toHexString(j));
            printwriter.print(" mBreadCrumbShortTitleText=");
            printwriter.println(k);
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_690;
        }
        printwriter.print(s);
        printwriter.println("Operations:");
        s2 = (new StringBuilder()).append(s).append("    ").toString();
        a1 = a;
        i1 = 0;
_L13:
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1.c;
        JVM INSTR tableswitch 0 7: default 308
    //                   0 577
    //                   1 584
    //                   2 591
    //                   3 598
    //                   4 605
    //                   5 612
    //                   6 619
    //                   7 626;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_626;
_L3:
        String s1 = (new StringBuilder("cmd=")).append(a1.c).toString();
_L12:
        printwriter.print(s);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s1);
        printwriter.print(" ");
        printwriter.println(a1.d);
        if (a1.e != 0 || a1.f != 0)
        {
            printwriter.print(s);
            printwriter.print("enterAnim=#");
            printwriter.print(Integer.toHexString(a1.e));
            printwriter.print(" exitAnim=#");
            printwriter.println(Integer.toHexString(a1.f));
        }
        if (a1.g != 0 || a1.h != 0)
        {
            printwriter.print(s);
            printwriter.print("popEnterAnim=#");
            printwriter.print(Integer.toHexString(a1.g));
            printwriter.print(" popExitAnim=#");
            printwriter.println(Integer.toHexString(a1.h));
        }
        if (a1.i != null && a1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < a1.i.size()) 
            {
                printwriter.print(s2);
                if (a1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (j1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s2);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                }
                printwriter.println(a1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_674;
_L4:
        s1 = "NULL";
          goto _L12
_L5:
        s1 = "ADD";
          goto _L12
_L6:
        s1 = "REPLACE";
          goto _L12
_L7:
        s1 = "REMOVE";
          goto _L12
_L8:
        s1 = "HIDE";
          goto _L12
_L9:
        s1 = "SHOW";
          goto _L12
_L10:
        s1 = "DETACH";
          goto _L12
        s1 = "ATTACH";
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

    public final V b(int i1, Fragment fragment, String s)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, fragment, s, 2);
            return this;
        }
    }

    public final V b(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 4;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final V c(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 6;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final String c()
    {
        return f;
    }

    public final V d(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 7;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public final void run()
    {
        if (e && g < 0)
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
        a1 = a;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_569;
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
        JVM INSTR tableswitch 1 7: default 148
    //                   1 212
    //                   2 240
    //                   3 439
    //                   4 465
    //                   5 491
    //                   6 517
    //                   7 543;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_543;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(a1.c).toString());
_L2:
        obj = a1.d;
        obj.mNextAnim = k1;
        o.a(((Fragment) (obj)), false);
_L12:
        a1 = a1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_85;
_L9:
        obj = a1.d;
        if (o.b != null)
        {
            i2 = 0;
label0:
            do
            {
label1:
                {
                    fragment = ((Fragment) (obj));
                    if (i2 >= o.b.size())
                    {
                        break label0;
                    }
                    fragment1 = (Fragment)o.b.get(i2);
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
                        a1.d = null;
                        fragment = null;
                    } else
                    {
                        if (a1.i == null)
                        {
                            a1.i = new ArrayList();
                        }
                        a1.i.add(fragment1);
                        fragment1.mNextAnim = l1;
                        if (e)
                        {
                            fragment1.mBackStackNesting = fragment1.mBackStackNesting + 1;
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
            fragment.mNextAnim = k1;
            o.a(fragment, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = a1.d;
        obj.mNextAnim = l1;
        o.a(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = a1.d;
        obj.mNextAnim = l1;
        o.b(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = a1.d;
        obj.mNextAnim = k1;
        o.c(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = a1.d;
        obj.mNextAnim = l1;
        o.d(((Fragment) (obj)), j1, i1);
        continue; /* Loop/switch isn't completed */
        obj = a1.d;
        obj.mNextAnim = k1;
        o.e(((Fragment) (obj)), j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        o.a(o.f, j1, i1, true);
        if (e)
        {
            obj = o;
            if (((T) (obj)).c == null)
            {
                obj.c = new ArrayList();
            }
            ((T) (obj)).c.add(this);
            ((T) (obj)).i();
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
