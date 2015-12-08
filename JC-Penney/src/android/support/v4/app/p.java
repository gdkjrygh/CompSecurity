// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.f.a;
import android.support.v4.f.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ay, ak, u, am, 
//            ai, Fragment, az, bl, 
//            t, r, be, s, 
//            ag, q

final class p extends ay
    implements ak, Runnable
{

    static final boolean a;
    final am b;
    t c;
    t d;
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

    public p(am am1)
    {
        m = true;
        p = -1;
        b = am1;
    }

    private u a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        u u1 = new u(this);
        u1.d = new View(b.o.g());
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
            if (a(sparsearray.keyAt(i1), u1, flag, sparsearray, sparsearray1))
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
                if (a(j1, u1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k1++;
            flag3 = flag2;
        }
        sparsearray = u1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    static a a(p p1, u u1, boolean flag, Fragment fragment)
    {
        return p1.a(u1, flag, fragment);
    }

    private a a(u u1, Fragment fragment, boolean flag)
    {
        a a2 = new a();
        a a1 = a2;
        if (u != null)
        {
            android.support.v4.app.az.a(a2, fragment.r());
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
            if (fragment.ah != null)
            {
                fragment.ah.a(v, a1);
            }
            a(u1, a1, false);
            return a1;
        }
        if (fragment.ai != null)
        {
            fragment.ai.a(v, a1);
        }
        b(u1, a1, false);
        return a1;
    }

    private a a(u u1, boolean flag, Fragment fragment)
    {
        a a1 = b(u1, fragment, flag);
        if (flag)
        {
            if (fragment.ai != null)
            {
                fragment.ai.a(v, a1);
            }
            a(u1, a1, true);
            return a1;
        }
        if (fragment.ah != null)
        {
            fragment.ah.a(v, a1);
        }
        b(u1, a1, true);
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

    private static Object a(Fragment fragment, Fragment fragment1, boolean flag)
    {
        if (fragment == null || fragment1 == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment1.C()));
        } else
        {
            fragment = ((Fragment) (fragment.B()));
        }
        return az.b(fragment);
    }

    private static Object a(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.A()));
        } else
        {
            fragment = ((Fragment) (fragment.x()));
        }
        return android.support.v4.app.az.a(fragment);
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, a a1, View view)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = android.support.v4.app.az.a(obj, fragment.r(), arraylist, a1, view);
        }
        return obj1;
    }

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        fragment.C = b;
        if (s1 != null)
        {
            if (fragment.I != null && !s1.equals(fragment.I))
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change tag of fragment ").append(fragment).append(": was ").append(fragment.I).append(" now ").append(s1).toString());
            }
            fragment.I = s1;
        }
        if (i1 != 0)
        {
            if (fragment.G != 0 && fragment.G != i1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change container ID of fragment ").append(fragment).append(": was ").append(fragment.G).append(" now ").append(i1).toString());
            }
            fragment.G = i1;
            fragment.H = i1;
        }
        s1 = new t();
        s1.c = j1;
        s1.d = fragment;
        a(((t) (s1)));
    }

    static void a(p p1, u u1, int i1, Object obj)
    {
        p1.a(u1, i1, obj);
    }

    static void a(p p1, u u1, Fragment fragment, Fragment fragment1, boolean flag, a a1)
    {
        p1.a(u1, fragment, fragment1, flag, a1);
    }

    static void a(p p1, a a1, u u1)
    {
        p1.a(a1, u1);
    }

    private void a(u u1, int i1, Object obj)
    {
        if (b.g != null)
        {
            int j1 = 0;
            while (j1 < b.g.size()) 
            {
                Fragment fragment = (Fragment)b.g.get(j1);
                if (fragment.S != null && fragment.R != null && fragment.H == i1)
                {
                    if (fragment.J)
                    {
                        if (!u1.b.contains(fragment.S))
                        {
                            android.support.v4.app.az.a(obj, fragment.S, true);
                            u1.b.add(fragment.S);
                        }
                    } else
                    {
                        android.support.v4.app.az.a(obj, fragment.S, false);
                        u1.b.remove(fragment.S);
                    }
                }
                j1++;
            }
        }
    }

    private void a(u u1, Fragment fragment, Fragment fragment1, boolean flag, a a1)
    {
        if (flag)
        {
            u1 = fragment1.ah;
        } else
        {
            u1 = fragment.ah;
        }
        if (u1 != null)
        {
            u1.b(new ArrayList(a1.keySet()), new ArrayList(a1.values()), null);
        }
    }

    private void a(u u1, a a1, boolean flag)
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
                obj = android.support.v4.app.az.a(((View) (obj)));
                if (flag)
                {
                    a(u1.a, s1, ((String) (obj)));
                } else
                {
                    a(u1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private void a(u u1, View view, Object obj, Fragment fragment, Fragment fragment1, boolean flag, ArrayList arraylist)
    {
        view.getViewTreeObserver().addOnPreDrawListener(new r(this, view, obj, arraylist, u1, flag, fragment, fragment1));
    }

    private static void a(u u1, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null)
        {
            for (int i1 = 0; i1 < arraylist.size(); i1++)
            {
                String s1 = (String)arraylist.get(i1);
                String s2 = (String)arraylist1.get(i1);
                a(u1.a, s1, s2);
            }

        }
    }

    private void a(a a1, u u1)
    {
        if (v != null && !a1.isEmpty())
        {
            a1 = (View)a1.get(v.get(0));
            if (a1 != null)
            {
                u1.c.a = a1;
            }
        }
    }

    private static void a(a a1, String s1, String s2)
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
            int i1 = fragment.H;
            if (i1 != 0 && !fragment.p() && fragment.n() && fragment.r() != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private void a(View view, u u1, int i1, Object obj)
    {
        view.getViewTreeObserver().addOnPreDrawListener(new s(this, view, u1, i1, obj));
    }

    private boolean a(int i1, u u1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)b.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj = (Fragment)sparsearray1.get(i1);
        Object obj2 = (Fragment)sparsearray.get(i1);
        Object obj1 = a(((Fragment) (obj)), flag);
        sparsearray1 = ((SparseArray) (a(((Fragment) (obj)), ((Fragment) (obj2)), flag)));
        Object obj3 = b(((Fragment) (obj2)), flag);
        sparsearray = null;
        ArrayList arraylist1 = new ArrayList();
        if (sparsearray1 != null)
        {
            a a1 = a(u1, ((Fragment) (obj2)), flag);
            if (a1.isEmpty())
            {
                sparsearray = null;
                sparsearray1 = null;
            } else
            {
                if (flag)
                {
                    sparsearray = ((Fragment) (obj2)).ah;
                } else
                {
                    sparsearray = ((Fragment) (obj)).ah;
                }
                if (sparsearray != null)
                {
                    sparsearray.a(new ArrayList(a1.keySet()), new ArrayList(a1.values()), null);
                }
                a(u1, ((View) (viewgroup)), sparsearray1, ((Fragment) (obj)), ((Fragment) (obj2)), flag, arraylist1);
                sparsearray = a1;
            }
        }
        if (obj1 == null && sparsearray1 == null && obj3 == null)
        {
            return false;
        }
        ArrayList arraylist = new ArrayList();
        obj2 = a(obj3, ((Fragment) (obj2)), arraylist, ((a) (sparsearray)), u1.d);
        if (v != null && sparsearray != null)
        {
            obj3 = (View)sparsearray.get(v.get(0));
            if (obj3 != null)
            {
                if (obj2 != null)
                {
                    android.support.v4.app.az.a(obj2, ((View) (obj3)));
                }
                if (sparsearray1 != null)
                {
                    android.support.v4.app.az.a(sparsearray1, ((View) (obj3)));
                }
            }
        }
        obj3 = new q(this, ((Fragment) (obj)));
        ArrayList arraylist2 = new ArrayList();
        a a2 = new a();
        boolean flag1 = true;
        if (obj != null)
        {
            if (flag)
            {
                flag1 = ((Fragment) (obj)).E();
            } else
            {
                flag1 = ((Fragment) (obj)).D();
            }
        }
        obj = android.support.v4.app.az.a(obj1, obj2, sparsearray1, flag1);
        if (obj != null)
        {
            android.support.v4.app.az.a(obj1, sparsearray1, viewgroup, ((bf) (obj3)), u1.d, u1.c, u1.a, arraylist2, sparsearray, a2, arraylist1);
            a(((View) (viewgroup)), u1, i1, obj);
            android.support.v4.app.az.a(obj, u1.d, true);
            a(u1, i1, obj);
            android.support.v4.app.az.a(viewgroup, obj);
            android.support.v4.app.az.a(viewgroup, u1.d, obj1, arraylist2, obj2, arraylist, sparsearray1, arraylist1, obj, u1.b, a2);
        }
        return obj != null;
    }

    private a b(u u1, Fragment fragment, boolean flag)
    {
        a a1;
label0:
        {
            a1 = new a();
            fragment = fragment.r();
            u1 = a1;
            if (fragment != null)
            {
                u1 = a1;
                if (u != null)
                {
                    android.support.v4.app.az.a(a1, fragment);
                    if (!flag)
                    {
                        break label0;
                    }
                    u1 = a(u, v, a1);
                }
            }
            return u1;
        }
        a1.a(v);
        return a1;
    }

    private static Object b(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.y()));
        } else
        {
            fragment = ((Fragment) (fragment.z()));
        }
        return android.support.v4.app.az.a(fragment);
    }

    private void b(u u1, a a1, boolean flag)
    {
        int j1 = a1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)a1.b(i1);
            String s2 = android.support.v4.app.az.a((View)a1.c(i1));
            if (flag)
            {
                a(u1.a, s1, s2);
            } else
            {
                a(u1.a, s2, s1);
            }
            i1++;
        }
    }

    private void b(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.H;
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
        t t1 = c;
_L12:
        if (t1 == null) goto _L1; else goto _L3
_L3:
        t1.c;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 82
    //                   2 95
    //                   3 214
    //                   4 226
    //                   5 238
    //                   6 251
    //                   7 263;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_263;
_L13:
        t1 = t1.a;
          goto _L12
_L5:
        b(sparsearray1, t1.d);
          goto _L13
_L6:
        Fragment fragment = t1.d;
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
                        if (fragment2.H != fragment.H)
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
        a(sparsearray, t1.d);
          goto _L13
_L8:
        a(sparsearray, t1.d);
          goto _L13
_L9:
        b(sparsearray1, t1.d);
          goto _L13
_L10:
        a(sparsearray, t1.d);
          goto _L13
        b(sparsearray1, t1.d);
          goto _L13
    }

    public int a()
    {
        return a(false);
    }

    int a(boolean flag)
    {
        if (o)
        {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.am.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Commit: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new e("FragmentManager")), ((String []) (null)));
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

    public ay a(int i1, Fragment fragment)
    {
        a(i1, fragment, ((String) (null)), 1);
        return this;
    }

    public ay a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public ay a(Fragment fragment)
    {
        t t1 = new t();
        t1.c = 3;
        t1.d = fragment;
        a(t1);
        return this;
    }

    public ay a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public ay a(String s1)
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

    public u a(boolean flag, u u1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        u u2;
        if (android.support.v4.app.am.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("popFromBackStack: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new e("FragmentManager")), ((String []) (null)));
        }
        u2 = u1;
        if (!a) goto _L2; else goto _L1
_L1:
        if (u1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        u2 = u1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        u2 = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int k1;
        int l1;
        a(-1);
        if (u2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (u2 != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        u1 = d;
_L17:
        if (u1 == null) goto _L8; else goto _L7
_L7:
        if (u2 != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((t) (u1)).g;
        }
        if (u2 != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((t) (u1)).h;
        }
        ((t) (u1)).c;
        JVM INSTR tableswitch 1 7: default 192
    //                   1 284
    //                   2 318
    //                   3 407
    //                   4 430
    //                   5 459
    //                   6 488
    //                   7 517;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(((t) (u1)).c).toString());
_L4:
        u2 = u1;
        if (!flag)
        {
            a(u1, v, u);
            u2 = u1;
        }
          goto _L2
_L10:
        sparsearray = ((t) (u1)).d;
        sparsearray.Q = l1;
        b.a(sparsearray, am.d(j1), i1);
_L18:
        u1 = ((t) (u1)).b;
          goto _L17
_L11:
        sparsearray = ((t) (u1)).d;
        if (sparsearray != null)
        {
            sparsearray.Q = l1;
            b.a(sparsearray, am.d(j1), i1);
        }
        if (((t) (u1)).i != null)
        {
            l1 = 0;
            while (l1 < ((t) (u1)).i.size()) 
            {
                sparsearray = (Fragment)((t) (u1)).i.get(l1);
                sparsearray.Q = k1;
                b.a(sparsearray, false);
                l1++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((t) (u1)).d;
        sparsearray.Q = k1;
        b.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((t) (u1)).d;
        sparsearray.Q = k1;
        b.c(sparsearray, am.d(j1), i1);
          goto _L18
_L14:
        sparsearray = ((t) (u1)).d;
        sparsearray.Q = l1;
        b.b(sparsearray, am.d(j1), i1);
          goto _L18
_L15:
        sparsearray = ((t) (u1)).d;
        sparsearray.Q = k1;
        b.e(sparsearray, am.d(j1), i1);
          goto _L18
_L16:
        sparsearray = ((t) (u1)).d;
        sparsearray.Q = k1;
        b.d(sparsearray, am.d(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            b.a(b.n, am.d(j1), i1, true);
            u2 = null;
        }
        if (p >= 0)
        {
            b.c(p);
            p = -1;
        }
        return u2;
    }

    void a(int i1)
    {
        if (l)
        {
            if (android.support.v4.app.am.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting in ").append(this).append(" by ").append(i1).toString());
            }
            t t1 = c;
            while (t1 != null) 
            {
                if (t1.d != null)
                {
                    Fragment fragment = t1.d;
                    fragment.B = fragment.B + i1;
                    if (android.support.v4.app.am.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(t1.d).append(" to ").append(t1.d.B).toString());
                    }
                }
                if (t1.i != null)
                {
                    for (int j1 = t1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)t1.i.get(j1);
                        fragment1.B = fragment1.B + i1;
                        if (android.support.v4.app.am.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment1).append(" to ").append(fragment1.B).toString());
                        }
                    }

                }
                t1 = t1.a;
            }
        }
    }

    void a(t t1)
    {
        if (c == null)
        {
            d = t1;
            c = t1;
        } else
        {
            t1.b = d;
            d.a = t1;
            d = t1;
        }
        t1.e = f;
        t1.f = g;
        t1.g = h;
        t1.h = i;
        e = e + 1;
    }

    public void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        t t1 = c;
_L12:
        if (t1 == null) goto _L1; else goto _L3
_L3:
        t1.c;
        JVM INSTR tableswitch 1 7: default 68
    //                   1 76
    //                   2 87
    //                   3 147
    //                   4 159
    //                   5 171
    //                   6 182
    //                   7 194;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_194;
_L13:
        t1 = t1.a;
          goto _L12
_L5:
        a(sparsearray, t1.d);
          goto _L13
_L6:
        if (t1.i != null)
        {
            for (int i1 = t1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (Fragment)t1.i.get(i1));
            }

        }
        a(sparsearray, t1.d);
          goto _L13
_L7:
        b(sparsearray1, t1.d);
          goto _L13
_L8:
        b(sparsearray1, t1.d);
          goto _L13
_L9:
        a(sparsearray, t1.d);
          goto _L13
_L10:
        b(sparsearray1, t1.d);
          goto _L13
        a(sparsearray, t1.d);
          goto _L13
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a(s1, printwriter, true);
    }

    public void a(String s1, PrintWriter printwriter, boolean flag)
    {
        t t1;
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
            break MISSING_BLOCK_LABEL_823;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        t1 = c;
        i1 = 0;
_L13:
        if (t1 == null) goto _L2; else goto _L1
_L1:
        t1.c;
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
        String s2 = (new StringBuilder()).append("cmd=").append(t1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(t1.d);
        if (flag)
        {
            if (t1.e != 0 || t1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(t1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(t1.f));
            }
            if (t1.g != 0 || t1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(t1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(t1.h));
            }
        }
        if (t1.i != null && t1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < t1.i.size()) 
            {
                printwriter.print(s3);
                if (t1.i.size() == 1)
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
                printwriter.println(t1.i.get(j1));
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
        t1 = t1.a;
        i1++;
          goto _L13
_L2:
    }

    public int b()
    {
        return a(true);
    }

    public ay b(int i1, Fragment fragment)
    {
        return b(i1, fragment, ((String) (null)));
    }

    public ay b(int i1, Fragment fragment, String s1)
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

    public ay b(Fragment fragment)
    {
        t t1 = new t();
        t1.c = 6;
        t1.d = fragment;
        a(t1);
        return this;
    }

    public ay c(Fragment fragment)
    {
        t t1 = new t();
        t1.c = 7;
        t1.d = fragment;
        a(t1);
        return this;
    }

    public String c()
    {
        return n;
    }

    public void run()
    {
        if (android.support.v4.app.am.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Run: ").append(this).toString());
        }
        if (l && p < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        Fragment fragment;
        Object obj;
        t t1;
        Fragment fragment1;
        Fragment fragment2;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (a)
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
            i1 = k;
        }
        if (obj != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        t1 = c;
        if (t1 == null)
        {
            break MISSING_BLOCK_LABEL_700;
        }
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = t1.e;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = t1.f;
        }
        t1.c;
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
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(t1.c).toString());
_L2:
        fragment = t1.d;
        fragment.Q = k1;
        b.a(fragment, false);
_L12:
        t1 = t1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_118;
_L9:
        fragment = t1.d;
        j2 = fragment.H;
        if (b.g != null)
        {
            i2 = 0;
            do
            {
                fragment1 = fragment;
                if (i2 >= b.g.size())
                {
                    break;
                }
                fragment2 = (Fragment)b.g.get(i2);
                if (android.support.v4.app.am.a)
                {
                    Log.v("FragmentManager", (new StringBuilder()).append("OP_REPLACE: adding=").append(fragment).append(" old=").append(fragment2).toString());
                }
                fragment1 = fragment;
                if (fragment2.H == j2)
                {
                    if (fragment2 == fragment)
                    {
                        fragment1 = null;
                        t1.d = null;
                    } else
                    {
                        if (t1.i == null)
                        {
                            t1.i = new ArrayList();
                        }
                        t1.i.add(fragment2);
                        fragment2.Q = l1;
                        if (l)
                        {
                            fragment2.B = fragment2.B + 1;
                            if (android.support.v4.app.am.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment2).append(" to ").append(fragment2.B).toString());
                            }
                        }
                        b.a(fragment2, j1, i1);
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
            fragment1.Q = k1;
            b.a(fragment1, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        fragment = t1.d;
        fragment.Q = l1;
        b.a(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        fragment = t1.d;
        fragment.Q = l1;
        b.b(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        fragment = t1.d;
        fragment.Q = k1;
        b.c(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        fragment = t1.d;
        fragment.Q = l1;
        b.d(fragment, j1, i1);
        continue; /* Loop/switch isn't completed */
        fragment = t1.d;
        fragment.Q = k1;
        b.e(fragment, j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        b.a(b.n, j1, i1, true);
        if (l)
        {
            b.b(this);
        }
        return;
    }

    public String toString()
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
