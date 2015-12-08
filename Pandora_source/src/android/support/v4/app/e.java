// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import p.e.a;
import p.e.d;

// Referenced classes of package android.support.v4.app:
//            k, i, Fragment, l, 
//            ah, g

final class e extends k
    implements h.a, Runnable
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

    public class b
    {

        public p.e.a a;
        public ArrayList b;
        public l.a c;
        public View d;
        final e e;

        public b()
        {
            e = e.this;
            super();
            a = new p.e.a();
            b = new ArrayList();
            c = new l.a();
        }
    }


    final i a;
    a b;
    a c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;
    ArrayList t;
    ArrayList u;

    public e(i i1)
    {
        l = true;
        o = -1;
        a = i1;
    }

    private b a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        b b1 = new b();
        b1.d = new View(a.o);
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

    private static Object a(Fragment fragment, Fragment fragment1, boolean flag)
    {
        if (fragment == null || fragment1 == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
        } else
        {
            fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
        }
        return android.support.v4.app.l.a(fragment);
    }

    private static Object a(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.getReenterTransition()));
        } else
        {
            fragment = ((Fragment) (fragment.getEnterTransition()));
        }
        return android.support.v4.app.l.a(fragment);
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, p.e.a a1, View view)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = android.support.v4.app.l.a(obj, fragment.getView(), arraylist, a1, view);
        }
        return obj1;
    }

    private p.e.a a(b b1, Fragment fragment, boolean flag)
    {
        p.e.a a2 = new p.e.a();
        p.e.a a1 = a2;
        if (t != null)
        {
            android.support.v4.app.l.a(a2, fragment.getView());
            if (flag)
            {
                a2.a(u);
                a1 = a2;
            } else
            {
                a1 = a(t, u, a2);
            }
        }
        if (flag)
        {
            if (fragment.mEnterTransitionCallback != null)
            {
                fragment.mEnterTransitionCallback.a(u, a1);
            }
            a(b1, a1, false);
            return a1;
        }
        if (fragment.mExitTransitionCallback != null)
        {
            fragment.mExitTransitionCallback.a(u, a1);
        }
        b(b1, a1, false);
        return a1;
    }

    private p.e.a a(b b1, boolean flag, Fragment fragment)
    {
        p.e.a a1 = b(b1, fragment, flag);
        if (flag)
        {
            if (fragment.mExitTransitionCallback != null)
            {
                fragment.mExitTransitionCallback.a(u, a1);
            }
            a(b1, a1, true);
            return a1;
        }
        if (fragment.mEnterTransitionCallback != null)
        {
            fragment.mEnterTransitionCallback.a(u, a1);
        }
        b(b1, a1, true);
        return a1;
    }

    static p.e.a a(e e1, b b1, boolean flag, Fragment fragment)
    {
        return e1.a(b1, flag, fragment);
    }

    private static p.e.a a(ArrayList arraylist, ArrayList arraylist1, p.e.a a1)
    {
        if (a1.isEmpty())
        {
            return a1;
        }
        p.e.a a2 = new p.e.a();
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
        fragment.mFragmentManager = a;
        if (s1 != null)
        {
            if (fragment.mTag != null && !s1.equals(fragment.mTag))
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change tag of fragment ").append(fragment).append(": was ").append(fragment.mTag).append(" now ").append(s1).toString());
            }
            fragment.mTag = s1;
        }
        if (i1 != 0)
        {
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change container ID of fragment ").append(fragment).append(": was ").append(fragment.mFragmentId).append(" now ").append(i1).toString());
            }
            fragment.mFragmentId = i1;
            fragment.mContainerId = i1;
        }
        s1 = new a();
        s1.c = j1;
        s1.d = fragment;
        a(((a) (s1)));
    }

    private void a(b b1, int i1, Object obj)
    {
        if (a.g != null)
        {
            int j1 = 0;
            while (j1 < a.g.size()) 
            {
                Fragment fragment = (Fragment)a.g.get(j1);
                if (fragment.mView != null && fragment.mContainer != null && fragment.mContainerId == i1)
                {
                    if (fragment.mHidden)
                    {
                        if (!b1.b.contains(fragment.mView))
                        {
                            android.support.v4.app.l.a(obj, fragment.mView, true);
                            b1.b.add(fragment.mView);
                        }
                    } else
                    {
                        android.support.v4.app.l.a(obj, fragment.mView, false);
                        b1.b.remove(fragment.mView);
                    }
                }
                j1++;
            }
        }
    }

    private void a(b b1, Fragment fragment, Fragment fragment1, boolean flag, p.e.a a1)
    {
        if (flag)
        {
            b1 = fragment1.mEnterTransitionCallback;
        } else
        {
            b1 = fragment.mEnterTransitionCallback;
        }
        if (b1 != null)
        {
            b1.b(new ArrayList(a1.keySet()), new ArrayList(a1.values()), null);
        }
    }

    private void a(b b1, View view, Object obj, Fragment fragment, Fragment fragment1, boolean flag, ArrayList arraylist)
    {
        view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, obj, arraylist, b1, flag, fragment, fragment1) {

            final View a;
            final Object b;
            final ArrayList c;
            final b d;
            final boolean e;
            final Fragment f;
            final Fragment g;
            final e h;

            public boolean onPreDraw()
            {
                a.getViewTreeObserver().removeOnPreDrawListener(this);
                if (b != null)
                {
                    android.support.v4.app.l.a(b, c);
                    c.clear();
                    p.e.a a1 = android.support.v4.app.e.a(h, d, e, f);
                    c.add(d.d);
                    c.addAll(a1.values());
                    android.support.v4.app.l.b(b, c);
                    android.support.v4.app.e.a(h, a1, d);
                    android.support.v4.app.e.a(h, d, f, g, e, a1);
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

    private void a(b b1, p.e.a a1, boolean flag)
    {
        int i1;
        int j1;
        if (u == null)
        {
            i1 = 0;
        } else
        {
            i1 = u.size();
        }
        j1 = 0;
        while (j1 < i1) 
        {
            String s1 = (String)t.get(j1);
            Object obj = (View)a1.get((String)u.get(j1));
            if (obj != null)
            {
                obj = android.support.v4.app.l.a(((View) (obj)));
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

    static void a(e e1, b b1, int i1, Object obj)
    {
        e1.a(b1, i1, obj);
    }

    static void a(e e1, b b1, Fragment fragment, Fragment fragment1, boolean flag, p.e.a a1)
    {
        e1.a(b1, fragment, fragment1, flag, a1);
    }

    static void a(e e1, p.e.a a1, b b1)
    {
        e1.a(a1, b1);
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

    private void a(View view, b b1, int i1, Object obj)
    {
        view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, b1, i1, obj) {

            final View a;
            final b b;
            final int c;
            final Object d;
            final e e;

            public boolean onPreDraw()
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
    }

    private void a(p.e.a a1, b b1)
    {
        if (u != null && !a1.isEmpty())
        {
            a1 = (View)a1.get(u.get(0));
            if (a1 != null)
            {
                b1.c.a = a1;
            }
        }
    }

    private static void a(p.e.a a1, String s1, String s2)
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

    private boolean a(int i1, b b1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)a.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj1 = (Fragment)sparsearray1.get(i1);
        Object obj4 = (Fragment)sparsearray.get(i1);
        Object obj2 = a(((Fragment) (obj1)), flag);
        Object obj3 = a(((Fragment) (obj1)), ((Fragment) (obj4)), flag);
        Object obj5 = b(((Fragment) (obj4)), flag);
        if (obj2 == null && obj3 == null && obj5 == null)
        {
            return false;
        }
        sparsearray = null;
        ArrayList arraylist = new ArrayList();
        if (obj3 != null)
        {
            Object obj = a(b1, ((Fragment) (obj4)), flag);
            arraylist.add(b1.d);
            arraylist.addAll(((p.e.a) (obj)).values());
            if (flag)
            {
                sparsearray1 = ((Fragment) (obj4)).mEnterTransitionCallback;
            } else
            {
                sparsearray1 = ((Fragment) (obj1)).mEnterTransitionCallback;
            }
            sparsearray = ((SparseArray) (obj));
            if (sparsearray1 != null)
            {
                sparsearray1.a(new ArrayList(((p.e.a) (obj)).keySet()), new ArrayList(((p.e.a) (obj)).values()), null);
                sparsearray = ((SparseArray) (obj));
            }
        }
        sparsearray1 = new ArrayList();
        obj = a(obj5, ((Fragment) (obj4)), ((ArrayList) (sparsearray1)), ((p.e.a) (sparsearray)), b1.d);
        if (u != null && sparsearray != null)
        {
            sparsearray = (View)sparsearray.get(u.get(0));
            if (sparsearray != null)
            {
                if (obj != null)
                {
                    android.support.v4.app.l.a(obj, sparsearray);
                }
                if (obj3 != null)
                {
                    android.support.v4.app.l.a(obj3, sparsearray);
                }
            }
        }
        sparsearray = new l.b(((Fragment) (obj1))) {

            final Fragment a;
            final e b;

            public View a()
            {
                return a.getView();
            }

            
            {
                b = e.this;
                a = fragment;
                super();
            }
        };
        if (obj3 != null)
        {
            a(b1, ((View) (viewgroup)), obj3, ((Fragment) (obj1)), ((Fragment) (obj4)), flag, arraylist);
        }
        obj4 = new ArrayList();
        obj5 = new p.e.a();
        if (flag)
        {
            flag = ((Fragment) (obj1)).getAllowReturnTransitionOverlap();
        } else
        {
            flag = ((Fragment) (obj1)).getAllowEnterTransitionOverlap();
        }
        obj1 = android.support.v4.app.l.a(obj2, obj, obj3, flag);
        if (obj1 != null)
        {
            android.support.v4.app.l.a(obj2, obj3, viewgroup, sparsearray, b1.d, b1.c, b1.a, ((ArrayList) (obj4)), ((java.util.Map) (obj5)), arraylist);
            a(((View) (viewgroup)), b1, i1, obj1);
            android.support.v4.app.l.a(obj1, b1.d, true);
            a(b1, i1, obj1);
            android.support.v4.app.l.a(viewgroup, obj1);
            android.support.v4.app.l.a(viewgroup, b1.d, obj2, ((ArrayList) (obj4)), obj, sparsearray1, obj3, arraylist, obj1, b1.b, ((java.util.Map) (obj5)));
        }
        return obj1 != null;
    }

    private static Object b(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.getReturnTransition()));
        } else
        {
            fragment = ((Fragment) (fragment.getExitTransition()));
        }
        return android.support.v4.app.l.a(fragment);
    }

    private p.e.a b(b b1, Fragment fragment, boolean flag)
    {
        p.e.a a1;
label0:
        {
            a1 = new p.e.a();
            fragment = fragment.getView();
            b1 = a1;
            if (fragment != null)
            {
                b1 = a1;
                if (t != null)
                {
                    android.support.v4.app.l.a(a1, fragment);
                    if (!flag)
                    {
                        break label0;
                    }
                    b1 = a(t, u, a1);
                }
            }
            return b1;
        }
        a1.a(u);
        return a1;
    }

    private void b(b b1, p.e.a a1, boolean flag)
    {
        int j1 = a1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)a1.b(i1);
            String s2 = android.support.v4.app.l.a((View)a1.c(i1));
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

    private void b(SparseArray sparsearray, Fragment fragment)
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
        if (a.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1 = b;
_L12:
        if (a1 == null) goto _L1; else goto _L3
_L3:
        a1.c;
        JVM INSTR tableswitch 1 7: default 76
    //                   1 86
    //                   2 99
    //                   3 218
    //                   4 230
    //                   5 242
    //                   6 255
    //                   7 267;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_267;
_L13:
        a1 = a1.a;
          goto _L12
_L5:
        b(sparsearray1, a1.d);
          goto _L13
_L6:
        Fragment fragment = a1.d;
        Fragment fragment1;
        if (a.g != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i1 >= a.g.size())
                    {
                        break label0;
                    }
                    Fragment fragment2 = (Fragment)a.g.get(i1);
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

    public int a()
    {
        return o;
    }

    int a(boolean flag)
    {
        if (n)
        {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.i.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Commit: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new d("FragmentManager")), ((String []) (null)));
        }
        n = true;
        if (k)
        {
            o = a.a(this);
        } else
        {
            o = -1;
        }
        a.a(this, flag);
        return o;
    }

    public b a(boolean flag, b b1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        b b2;
        int i1;
        int j1;
        int k1;
        int l1;
        if (android.support.v4.app.i.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("popFromBackStack: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new d("FragmentManager")), ((String []) (null)));
        }
        if (b1 == null)
        {
label0:
            {
                if (sparsearray.size() == 0)
                {
                    b2 = b1;
                    if (sparsearray1.size() == 0)
                    {
                        break label0;
                    }
                }
                b2 = a(sparsearray, sparsearray1, true);
            }
        } else
        {
            b2 = b1;
            if (!flag)
            {
                a(b1, u, t);
                b2 = b1;
            }
        }
        b(-1);
        if (b2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = j;
        }
        if (b2 != null)
        {
            j1 = 0;
        } else
        {
            j1 = i;
        }
        b1 = c;
_L10:
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_538;
        }
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
    //                   1 276
    //                   2 310
    //                   3 399
    //                   4 422
    //                   5 451
    //                   6 480
    //                   7 509;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_509;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(((a) (b1)).c).toString());
_L2:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        a.a(sparsearray, android.support.v4.app.i.d(j1), i1);
_L11:
        b1 = ((a) (b1)).b;
        if (true) goto _L10; else goto _L9
_L9:
        sparsearray = ((a) (b1)).d;
        if (sparsearray != null)
        {
            sparsearray.mNextAnim = l1;
            a.a(sparsearray, android.support.v4.app.i.d(j1), i1);
        }
        if (((a) (b1)).i != null)
        {
            l1 = 0;
            while (l1 < ((a) (b1)).i.size()) 
            {
                sparsearray = (Fragment)((a) (b1)).i.get(l1);
                sparsearray.mNextAnim = k1;
                a.a(sparsearray, false);
                l1++;
            }
        }
          goto _L11
_L4:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        a.a(sparsearray, false);
          goto _L11
_L5:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        a.c(sparsearray, android.support.v4.app.i.d(j1), i1);
          goto _L11
_L6:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = l1;
        a.b(sparsearray, android.support.v4.app.i.d(j1), i1);
          goto _L11
_L7:
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        a.e(sparsearray, android.support.v4.app.i.d(j1), i1);
          goto _L11
        sparsearray = ((a) (b1)).d;
        sparsearray.mNextAnim = k1;
        a.d(sparsearray, android.support.v4.app.i.d(j1), i1);
          goto _L11
        if (flag)
        {
            a.a(a.n, android.support.v4.app.i.d(j1), i1, true);
            b2 = null;
        }
        if (o >= 0)
        {
            a.c(o);
            o = -1;
        }
        return b2;
    }

    public k a(int i1)
    {
        i = i1;
        return this;
    }

    public k a(int i1, int j1)
    {
        return a(i1, j1, 0, 0);
    }

    public k a(int i1, int j1, int k1, int l1)
    {
        e = i1;
        f = j1;
        g = k1;
        h = l1;
        return this;
    }

    public k a(int i1, Fragment fragment)
    {
        return b(i1, fragment, ((String) (null)));
    }

    public k a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public k a(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 3;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public k a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public k a(String s1)
    {
        if (!l)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            k = true;
            m = s1;
            return this;
        }
    }

    void a(a a1)
    {
        if (b == null)
        {
            c = a1;
            b = a1;
        } else
        {
            a1.b = c;
            c.a = a1;
            c = a1;
        }
        a1.e = e;
        a1.f = f;
        a1.g = g;
        a1.h = h;
        d = d + 1;
    }

    public void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (a.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a a1 = b;
_L12:
        if (a1 == null) goto _L1; else goto _L3
_L3:
        a1.c;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 80
    //                   2 91
    //                   3 151
    //                   4 163
    //                   5 175
    //                   6 186
    //                   7 198;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_198;
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

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a(s1, printwriter, true);
    }

    public void a(String s1, PrintWriter printwriter, boolean flag)
    {
        a a1;
        String s3;
        int i1;
        if (flag)
        {
            printwriter.print(s1);
            printwriter.print("mName=");
            printwriter.print(m);
            printwriter.print(" mIndex=");
            printwriter.print(o);
            printwriter.print(" mCommitted=");
            printwriter.println(n);
            if (i != 0)
            {
                printwriter.print(s1);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(i));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(j));
            }
            if (e != 0 || f != 0)
            {
                printwriter.print(s1);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(e));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(f));
            }
            if (g != 0 || h != 0)
            {
                printwriter.print(s1);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(g));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(h));
            }
            if (p != 0 || q != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(p));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(q);
            }
            if (r != 0 || s != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(r));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(s);
            }
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_823;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        a1 = b;
        i1 = 0;
_L13:
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1.c;
        JVM INSTR tableswitch 0 7: default 424
    //                   0 702
    //                   1 710
    //                   2 718
    //                   3 726
    //                   4 734
    //                   5 742
    //                   6 750
    //                   7 758;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_758;
_L3:
        String s2 = (new StringBuilder()).append("cmd=").append(a1.c).toString();
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
        break MISSING_BLOCK_LABEL_807;
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

    public int b()
    {
        return a(false);
    }

    public k b(int i1, Fragment fragment, String s1)
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

    public k b(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 4;
        a1.d = fragment;
        a(a1);
        return this;
    }

    void b(int i1)
    {
        if (k)
        {
            if (android.support.v4.app.i.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting in ").append(this).append(" by ").append(i1).toString());
            }
            a a1 = b;
            while (a1 != null) 
            {
                if (a1.d != null)
                {
                    Fragment fragment = a1.d;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i1;
                    if (android.support.v4.app.i.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(a1.d).append(" to ").append(a1.d.mBackStackNesting).toString());
                    }
                }
                if (a1.i != null)
                {
                    for (int j1 = a1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)a1.i.get(j1);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i1;
                        if (android.support.v4.app.i.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment1).append(" to ").append(fragment1.mBackStackNesting).toString());
                        }
                    }

                }
                a1 = a1.a;
            }
        }
    }

    public int c()
    {
        return a(true);
    }

    public k c(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 5;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public k d(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 6;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public String d()
    {
        return m;
    }

    public k e(Fragment fragment)
    {
        a a1 = new a();
        a1.c = 7;
        a1.d = fragment;
        a(a1);
        return this;
    }

    public void run()
    {
        if (android.support.v4.app.i.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Run: ").append(this).toString());
        }
        if (k && o < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        b(1);
        Fragment fragment;
        Object obj;
        a a1;
        Fragment fragment1;
        Fragment fragment2;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            SparseArray sparsearray = new SparseArray();
            obj = new SparseArray();
            b(sparsearray, ((SparseArray) (obj)));
            obj = a(sparsearray, ((SparseArray) (obj)), false);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            i1 = 0;
        } else
        {
            i1 = j;
        }
        if (obj != null)
        {
            j1 = 0;
        } else
        {
            j1 = i;
        }
        a1 = b;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_700;
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
        JVM INSTR tableswitch 1 7: default 184
    //                   1 251
    //                   2 279
    //                   3 570
    //                   4 596
    //                   5 622
    //                   6 648
    //                   7 674;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_674;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(a1.c).toString());
_L2:
        fragment = a1.d;
        fragment.mNextAnim = k1;
        a.a(fragment, false);
_L12:
        a1 = a1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_120;
_L9:
        fragment = a1.d;
        if (a.g != null)
        {
            i2 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i2 >= a.g.size())
                    {
                        break label0;
                    }
                    fragment2 = (Fragment)a.g.get(i2);
                    if (android.support.v4.app.i.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("OP_REPLACE: adding=").append(fragment).append(" old=").append(fragment2).toString());
                    }
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
                        a1.d = null;
                        fragment1 = null;
                    } else
                    {
                        if (a1.i == null)
                        {
                            a1.i = new ArrayList();
                        }
                        a1.i.add(fragment2);
                        fragment2.mNextAnim = l1;
                        if (k)
                        {
                            fragment2.mBackStackNesting = fragment2.mBackStackNesting + 1;
                            if (android.support.v4.app.i.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment2).append(" to ").append(fragment2.mBackStackNesting).toString());
                            }
                        }
                        a.a(fragment2, j1, i1);
                        fragment1 = fragment;
                    }
                }
                i2++;
                fragment = fragment1;
            } while (true);
        } else
        {
            fragment1 = fragment;
        }
        if (fragment1 != null)
        {
            fragment1.mNextAnim = k1;
            a.a(fragment1, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        fragment = a1.d;
        fragment.mNextAnim = l1;
        a.a(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        fragment = a1.d;
        fragment.mNextAnim = l1;
        a.b(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        fragment = a1.d;
        fragment.mNextAnim = k1;
        a.c(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        fragment = a1.d;
        fragment.mNextAnim = l1;
        a.d(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
        fragment = a1.d;
        fragment.mNextAnim = k1;
        a.e(fragment, j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        a.a(a.n, j1, i1, true);
        if (k)
        {
            a.b(this);
        }
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (m != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(m);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
