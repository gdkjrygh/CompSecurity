// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.b.d;
import android.support.v4.b.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package android.support.v4.app:
//            l, n, Fragment, FragmentActivity, 
//            a, w, FragmentManagerState, FragmentState, 
//            BackStackState, an, y, k, 
//            o, t

final class m extends l
{

    static final Interpolator A = new DecelerateInterpolator(1.5F);
    static final Interpolator B = new AccelerateInterpolator(2.5F);
    static final Interpolator C = new AccelerateInterpolator(1.5F);
    static boolean a = false;
    static final boolean b;
    static final Interpolator z = new DecelerateInterpolator(2.5F);
    ArrayList c;
    Runnable d[];
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    int n;
    FragmentActivity o;
    k p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w;
    SparseArray x;
    Runnable y;

    m()
    {
        n = 0;
        w = null;
        x = null;
        y = new n(this);
    }

    private Fragment a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= f.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragement no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
            }
            Fragment fragment = (Fragment)f.get(i1);
            bundle = fragment;
            if (fragment == null)
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragement no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
                return fragment;
            }
        }
        return bundle;
    }

    private static Animation a(float f1, float f2)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f1, f2);
        alphaanimation.setInterpolator(A);
        alphaanimation.setDuration(220L);
        return alphaanimation;
    }

    private static Animation a(float f1, float f2, float f3, float f4)
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(z);
        ((ScaleAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f3, f4);
        ((AlphaAnimation) (obj)).setInterpolator(A);
        ((AlphaAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation a(Fragment fragment, int i1, boolean flag, int j1)
    {
        int k1;
        k1 = fragment.G;
        Fragment.j();
        if (fragment.G != 0)
        {
            fragment = AnimationUtils.loadAnimation(o, fragment.G);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (i1 == 0)
        {
            return null;
        }
        k1 = -1;
        i1;
        JVM INSTR lookupswitch 3: default 80
    //                   4097: 89
    //                   4099: 117
    //                   8194: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = k1;
_L6:
        if (i1 < 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            i1 = 5;
        } else
        {
            i1 = 6;
        }
        if (true) goto _L6; else goto _L5
_L5:
        switch (i1)
        {
        default:
            i1 = j1;
            if (j1 == 0)
            {
                i1 = j1;
                if (o.getWindow() != null)
                {
                    i1 = o.getWindow().getAttributes().windowAnimations;
                }
            }
            if (i1 == 0)
            {
                return null;
            } else
            {
                return null;
            }

        case 1: // '\001'
            fragment = o;
            return a(1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            fragment = o;
            return a(1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            fragment = o;
            return a(0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            fragment = o;
            return a(1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            fragment = o;
            return a(0.0F, 1.0F);

        case 6: // '\006'
            fragment = o;
            return a(1.0F, 0.0F);
        }
    }

    private void a(int i1, a a1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        if (k == null)
        {
            k = new ArrayList();
        }
        k1 = k.size();
        int j1 = k1;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(a1).toString());
        }
        k.set(i1, a1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k.add(null);
        if (l == null)
        {
            l = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding available back stack index ")).append(j1).toString());
        }
        l.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(a1).toString());
        }
        k.add(a1);
          goto _L4
        a1;
        throw a1;
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new e("FragmentManager"));
        if (o != null)
        {
            try
            {
                o.dump("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
            }
        } else
        {
            try
            {
                a("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
            }
            catch (Exception exception)
            {
                Log.e("FragmentManager", "Failed dumping state", exception);
            }
        }
        throw runtimeexception;
    }

    private void b(Fragment fragment)
    {
        if (fragment.J != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            fragment.J.saveHierarchyState(x);
            if (x.size() > 0)
            {
                fragment.e = x;
                x = null;
                return;
            }
        }
    }

    public static int c(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 4097: 
            return 8194;

        case 8194: 
            return 4097;

        case 4099: 
            return 4099;
        }
    }

    private void d(int i1)
    {
        a(i1, 0, 0, false);
    }

    private void r()
    {
        if (f != null)
        {
            int i1 = 0;
            while (i1 < f.size()) 
            {
                Fragment fragment = (Fragment)f.get(i1);
                if (fragment != null && fragment.K)
                {
                    if (e)
                    {
                        v = true;
                    } else
                    {
                        fragment.K = false;
                        a(fragment, n, 0, 0, false);
                    }
                }
                i1++;
            }
        }
    }

    private void s()
    {
        if (s)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (u != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(u).toString());
        } else
        {
            return;
        }
    }

    private void t()
    {
        if (m != null)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                m.get(i1);
            }

        }
    }

    public final int a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (l != null && l.size() > 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (k == null)
        {
            k = new ArrayList();
        }
        i1 = k.size();
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(a1).toString());
        }
        k.add(a1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)l.remove(l.size() - 1)).intValue();
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(a1).toString());
        }
        k.set(i1, a1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        a1;
        throw a1;
    }

    public final Fragment a(int i1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        int j1 = g.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(j1);
        if (fragment == null || fragment.w != i1) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        j1 = f.size() - 1;
_L9:
        if (j1 < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)f.get(j1);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (fragment1.w == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final Fragment a(String s1)
    {
        if (g == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = g.size() - 1;
_L11:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !s1.equals(fragment.y)) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        i1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (f == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = f.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)f.get(i1);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (s1.equals(fragment1.y)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final t a()
    {
        return new a(this);
    }

    final void a(int i1, int j1, int k1, boolean flag)
    {
        if (o == null && i1 != 0)
        {
            throw new IllegalStateException("No activity");
        }
        if (flag || n != i1)
        {
            n = i1;
            if (f != null)
            {
                int l1 = 0;
                boolean flag1 = false;
                for (; l1 < f.size(); l1++)
                {
                    Fragment fragment = (Fragment)f.get(l1);
                    if (fragment == null)
                    {
                        continue;
                    }
                    a(fragment, i1, j1, k1, false);
                    if (fragment.M != null)
                    {
                        flag1 |= fragment.M.a();
                    }
                }

                if (!flag1)
                {
                    r();
                }
                if (r && o != null && n == 5)
                {
                    o.b();
                    r = false;
                    return;
                }
            }
        }
    }

    public final void a(Configuration configuration)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.a(configuration);
                }
            }

        }
    }

    final void a(Parcelable parcelable, ArrayList arraylist)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((FragmentManagerState) (parcelable = (FragmentManagerState)parcelable)).a != null)
        {
            if (arraylist != null)
            {
                for (int i1 = 0; i1 < arraylist.size(); i1++)
                {
                    Fragment fragment = (Fragment)arraylist.get(i1);
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: re-attaching retained ")).append(fragment).toString());
                    }
                    FragmentState fragmentstate1 = ((FragmentManagerState) (parcelable)).a[fragment.f];
                    fragmentstate1.k = fragment;
                    fragment.e = null;
                    fragment.r = 0;
                    fragment.p = false;
                    fragment.l = false;
                    fragment.i = null;
                    if (fragmentstate1.j != null)
                    {
                        fragmentstate1.j.setClassLoader(o.getClassLoader());
                        fragment.e = fragmentstate1.j.getSparseParcelableArray("android:view_state");
                    }
                }

            }
            f = new ArrayList(((FragmentManagerState) (parcelable)).a.length);
            if (h != null)
            {
                h.clear();
            }
            int j1 = 0;
            while (j1 < ((FragmentManagerState) (parcelable)).a.length) 
            {
                FragmentState fragmentstate = ((FragmentManagerState) (parcelable)).a[j1];
                if (fragmentstate != null)
                {
                    Fragment fragment2 = fragmentstate.a(o, q);
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: active #")).append(j1).append(": ").append(fragment2).toString());
                    }
                    f.add(fragment2);
                    fragmentstate.k = null;
                } else
                {
                    f.add(null);
                    if (h == null)
                    {
                        h = new ArrayList();
                    }
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: avail #")).append(j1).toString());
                    }
                    h.add(Integer.valueOf(j1));
                }
                j1++;
            }
            if (arraylist != null)
            {
                int k1 = 0;
                while (k1 < arraylist.size()) 
                {
                    Fragment fragment1 = (Fragment)arraylist.get(k1);
                    if (fragment1.j >= 0)
                    {
                        if (fragment1.j < f.size())
                        {
                            fragment1.i = (Fragment)f.get(fragment1.j);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(fragment1).append(" target no longer exists: ").append(fragment1.j).toString());
                            fragment1.i = null;
                        }
                    }
                    k1++;
                }
            }
            if (((FragmentManagerState) (parcelable)).b != null)
            {
                g = new ArrayList(((FragmentManagerState) (parcelable)).b.length);
                for (int l1 = 0; l1 < ((FragmentManagerState) (parcelable)).b.length; l1++)
                {
                    arraylist = (Fragment)f.get(((FragmentManagerState) (parcelable)).b[l1]);
                    if (arraylist == null)
                    {
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(((FragmentManagerState) (parcelable)).b[l1]).toString()))));
                    }
                    arraylist.l = true;
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: added #")).append(l1).append(": ").append(arraylist).toString());
                    }
                    if (g.contains(arraylist))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    g.add(arraylist);
                }

            } else
            {
                g = null;
            }
            if (((FragmentManagerState) (parcelable)).c != null)
            {
                i = new ArrayList(((FragmentManagerState) (parcelable)).c.length);
                int i2 = 0;
                while (i2 < ((FragmentManagerState) (parcelable)).c.length) 
                {
                    arraylist = ((FragmentManagerState) (parcelable)).c[i2].a(this);
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("restoreAllState: back stack #")).append(i2).append(" (index ").append(((a) (arraylist)).o).append("): ").append(arraylist).toString());
                        arraylist.a("  ", new PrintWriter(new e("FragmentManager")), false);
                    }
                    i.add(arraylist);
                    if (((a) (arraylist)).o >= 0)
                    {
                        a(((a) (arraylist)).o, ((a) (arraylist)));
                    }
                    i2++;
                }
            } else
            {
                i = null;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    final void a(Fragment fragment)
    {
        a(fragment, n, 0, 0, false);
    }

    public final void a(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("remove: ")).append(fragment).append(" nesting=").append(fragment.r).toString());
        }
        int k1;
        if (!fragment.b())
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!fragment.A || k1 != 0)
        {
            if (g != null)
            {
                g.remove(fragment);
            }
            if (fragment.D && fragment.E)
            {
                r = true;
            }
            fragment.l = false;
            fragment.m = true;
            if (k1 != 0)
            {
                k1 = 0;
            } else
            {
                k1 = 1;
            }
            a(fragment, k1, i1, j1, false);
        }
    }

    final void a(Fragment fragment, int i1, int j1, int k1, boolean flag)
    {
        int l1;
label0:
        {
            if (fragment.l)
            {
                l1 = i1;
                if (!fragment.A)
                {
                    break label0;
                }
            }
            l1 = i1;
            if (i1 > 1)
            {
                l1 = 1;
            }
        }
        int j2 = l1;
        if (fragment.m)
        {
            j2 = l1;
            if (l1 > fragment.a)
            {
                j2 = fragment.a;
            }
        }
        i1 = j2;
        if (fragment.K)
        {
            i1 = j2;
            if (fragment.a < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (fragment.a >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (fragment.o && !fragment.p)
        {
            return;
        }
        if (fragment.b != null)
        {
            fragment.b = null;
            a(fragment, fragment.c, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        fragment.a;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 561
    //                   2 883
    //                   3 883
    //                   4 930;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        fragment.a = i2;
        return;
_L4:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("moveto CREATED: ")).append(fragment).toString());
        }
        k2 = i1;
        if (fragment.d != null)
        {
            fragment.e = fragment.d.getSparseParcelableArray("android:view_state");
            fragment.i = a(fragment.d, "android:target_state");
            if (fragment.i != null)
            {
                fragment.k = fragment.d.getInt("android:target_req_state", 0);
            }
            fragment.L = fragment.d.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!fragment.L)
            {
                fragment.K = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        fragment.t = o;
        fragment.v = q;
        Object obj;
        if (q != null)
        {
            obj = q.u;
        } else
        {
            obj = o.b;
        }
        fragment.s = ((m) (obj));
        fragment.F = false;
        obj = o;
        fragment.i();
        if (!fragment.F)
        {
            throw new an((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        if (fragment.v == null)
        {
            FragmentActivity fragmentactivity = o;
            FragmentActivity.c();
        }
        if (!fragment.C)
        {
            fragment.a(fragment.d);
        }
        fragment.C = false;
        i2 = k2;
        if (fragment.o)
        {
            Bundle bundle = fragment.d;
            fragment.g();
            bundle = fragment.d;
            fragment.I = fragment.o();
            Object obj3;
            if (fragment.I != null)
            {
                fragment.J = fragment.I;
                fragment.I = android.support.v4.app.y.a(fragment.I);
                if (fragment.z)
                {
                    fragment.I.setVisibility(8);
                }
                Object obj1 = fragment.I;
                obj1 = fragment.d;
                Fragment.k();
                i2 = k2;
            } else
            {
                fragment.J = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto ACTIVITY_CREATED: ")).append(fragment).toString());
            }
            if (!fragment.o)
            {
                Object obj2;
                if (fragment.x != 0)
                {
                    obj3 = (ViewGroup)p.a(fragment.x);
                    obj2 = obj3;
                    if (obj3 == null)
                    {
                        obj2 = obj3;
                        if (!fragment.q)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.x)).append(" (").append(fragment.c().getResourceName(fragment.x)).append(") for fragment ").append(fragment).toString()))));
                            obj2 = obj3;
                        }
                    }
                } else
                {
                    obj2 = null;
                }
                fragment.H = ((ViewGroup) (obj2));
                obj3 = fragment.d;
                fragment.g();
                obj3 = fragment.d;
                fragment.I = fragment.o();
                if (fragment.I != null)
                {
                    fragment.J = fragment.I;
                    fragment.I = android.support.v4.app.y.a(fragment.I);
                    if (obj2 != null)
                    {
                        obj3 = a(fragment, j1, true, k1);
                        if (obj3 != null)
                        {
                            fragment.I.startAnimation(((Animation) (obj3)));
                        }
                        ((ViewGroup) (obj2)).addView(fragment.I);
                    }
                    if (fragment.z)
                    {
                        fragment.I.setVisibility(8);
                    }
                    obj2 = fragment.I;
                    obj2 = fragment.d;
                    Fragment.k();
                } else
                {
                    fragment.J = null;
                }
            }
            obj2 = fragment.d;
            fragment.p();
            if (fragment.I != null)
            {
                obj2 = fragment.d;
                fragment.a();
            }
            fragment.d = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto STARTED: ")).append(fragment).toString());
            }
            fragment.q();
            k2 = l2;
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("moveto RESUMED: ")).append(fragment).toString());
            }
            fragment.n = true;
            fragment.r();
            fragment.d = null;
            fragment.e = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (fragment.a <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.a;
        JVM INSTR tableswitch 1 5: default 1064
    //                   1 1070
    //                   2 1244
    //                   3 1206
    //                   4 1168
    //                   5 1125;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L9:
        i2 = i1;
        if (i1 > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (t && fragment.b != null)
        {
            obj2 = fragment.b;
            fragment.b = null;
            ((View) (obj2)).clearAnimation();
        }
        if (fragment.b != null)
        {
            fragment.c = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom RESUMED: ")).append(fragment).toString());
            }
            fragment.t();
            fragment.n = false;
        }
_L12:
        if (i1 < 4)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom STARTED: ")).append(fragment).toString());
            }
            fragment.u();
        }
_L11:
        if (i1 < 3)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom STOPPED: ")).append(fragment).toString());
            }
            fragment.v();
        }
_L10:
        if (i1 < 2)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(fragment).toString());
            }
            if (fragment.I != null && !o.isFinishing() && fragment.e == null)
            {
                b(fragment);
            }
            fragment.w();
            if (fragment.I != null && fragment.H != null)
            {
                if (n > 0 && !t)
                {
                    obj2 = a(fragment, j1, false, k1);
                } else
                {
                    obj2 = null;
                }
                if (obj2 != null)
                {
                    fragment.b = fragment.I;
                    fragment.c = i1;
                    ((Animation) (obj2)).setAnimationListener(new o(this, fragment));
                    fragment.I.startAnimation(((Animation) (obj2)));
                }
                fragment.H.removeView(fragment.I);
            }
            fragment.H = null;
            fragment.I = null;
            fragment.J = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("movefrom CREATED: ")).append(fragment).toString());
        }
        if (!fragment.C)
        {
            fragment.x();
        }
        fragment.F = false;
        fragment.m();
        if (!fragment.F)
        {
            throw new an((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!fragment.C)
        {
            i2 = i1;
            if (fragment.f >= 0)
            {
                if (a)
                {
                    Log.v("FragmentManager", (new StringBuilder("Freeing fragment index ")).append(fragment).toString());
                }
                f.set(fragment.f, null);
                if (h == null)
                {
                    h = new ArrayList();
                }
                h.add(Integer.valueOf(fragment.f));
                o.a(fragment.g);
                fragment.l();
                i2 = i1;
            }
        } else
        {
            fragment.t = null;
            fragment.s = null;
            i2 = i1;
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void a(Fragment fragment, boolean flag)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("add: ")).append(fragment).toString());
        }
        if (fragment.f < 0)
        {
            if (h == null || h.size() <= 0)
            {
                if (f == null)
                {
                    f = new ArrayList();
                }
                fragment.a(f.size(), q);
                f.add(fragment);
            } else
            {
                fragment.a(((Integer)h.remove(h.size() - 1)).intValue(), q);
                f.set(fragment.f, fragment);
            }
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("Allocated fragment index ")).append(fragment).toString());
            }
        }
        if (!fragment.A)
        {
            if (g.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            g.add(fragment);
            fragment.l = true;
            fragment.m = false;
            if (fragment.D && fragment.E)
            {
                r = true;
            }
            if (flag)
            {
                a(fragment);
            }
        }
    }

    public final void a(FragmentActivity fragmentactivity, k k1, Fragment fragment)
    {
        if (o != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            o = fragmentactivity;
            p = k1;
            q = fragment;
            return;
        }
    }

    public final void a(Runnable runnable)
    {
        s();
        this;
        JVM INSTR monitorenter ;
        if (t || o == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_36;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (c == null)
        {
            c = new ArrayList();
        }
        c.add(runnable);
        if (c.size() == 1)
        {
            o.a.removeCallbacks(y);
            o.a.post(y);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        flag = false;
        String s2 = (new StringBuilder()).append(s1).append("    ").toString();
        if (f != null)
        {
            int k2 = f.size();
            if (k2 > 0)
            {
                printwriter.print(s1);
                printwriter.print("Active Fragments in ");
                printwriter.print(Integer.toHexString(System.identityHashCode(this)));
                printwriter.println(":");
                for (int i1 = 0; i1 < k2; i1++)
                {
                    Fragment fragment = (Fragment)f.get(i1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(i1);
                    printwriter.print(": ");
                    printwriter.println(fragment);
                    if (fragment != null)
                    {
                        fragment.a(s2, filedescriptor, printwriter, as);
                    }
                }

            }
        }
        if (g != null)
        {
            int l2 = g.size();
            if (l2 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Added Fragments:");
                for (int j1 = 0; j1 < l2; j1++)
                {
                    filedescriptor = (Fragment)g.get(j1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (j != null)
        {
            int i3 = j.size();
            if (i3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Fragments Created Menus:");
                for (int k1 = 0; k1 < i3; k1++)
                {
                    filedescriptor = (Fragment)j.get(k1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (i != null)
        {
            int j3 = i.size();
            if (j3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Back Stack:");
                for (int l1 = 0; l1 < j3; l1++)
                {
                    filedescriptor = (a)i.get(l1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(l1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                    filedescriptor.a(s2, printwriter);
                }

            }
        }
        this;
        JVM INSTR monitorenter ;
        if (k == null) goto _L2; else goto _L1
_L1:
        int k3 = k.size();
        if (k3 <= 0) goto _L2; else goto _L3
_L3:
        printwriter.print(s1);
        printwriter.println("Back Stack Indices:");
        int i2 = 0;
_L4:
        if (i2 >= k3)
        {
            break; /* Loop/switch isn't completed */
        }
        filedescriptor = (a)k.get(i2);
        printwriter.print(s1);
        printwriter.print("  #");
        printwriter.print(i2);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i2++;
        if (true) goto _L4; else goto _L2
_L2:
        if (l != null && l.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(l.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (c != null)
        {
            int l3 = c.size();
            if (l3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Pending Actions:");
                for (int j2 = ((flag) ? 1 : 0); j2 < l3; j2++)
                {
                    filedescriptor = (Runnable)c.get(j2);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j2);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor);
                }

            }
        }
        break MISSING_BLOCK_LABEL_700;
        s1;
        throw s1;
        printwriter.print(s1);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s1);
        printwriter.print("  mActivity=");
        printwriter.println(o);
        printwriter.print(s1);
        printwriter.print("  mContainer=");
        printwriter.println(p);
        if (q != null)
        {
            printwriter.print(s1);
            printwriter.print("  mParent=");
            printwriter.println(q);
        }
        printwriter.print(s1);
        printwriter.print("  mCurState=");
        printwriter.print(n);
        printwriter.print(" mStateSaved=");
        printwriter.print(s);
        printwriter.print(" mDestroyed=");
        printwriter.println(t);
        if (r)
        {
            printwriter.print(s1);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(r);
        }
        if (u != null)
        {
            printwriter.print(s1);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(u);
        }
        if (h != null && h.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(h.toArray()));
        }
        return;
    }

    public final boolean a(Menu menu)
    {
        boolean flag1;
        if (g != null)
        {
            int i1 = 0;
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (i1 >= g.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)g.get(i1);
                flag1 = flag;
                if (fragment != null)
                {
                    flag1 = flag;
                    if (fragment.a(menu))
                    {
                        flag1 = true;
                    }
                }
                i1++;
                flag = flag1;
            } while (true);
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public final boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag = false;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        boolean flag2;
        if (g != null)
        {
            int i1 = 0;
            boolean flag1 = false;
            do
            {
                arraylist1 = arraylist;
                flag2 = flag1;
                if (i1 >= g.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)g.get(i1);
                arraylist1 = arraylist;
                flag2 = flag1;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    flag2 = flag1;
                    if (fragment.a(menu, menuinflater))
                    {
                        flag2 = true;
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                    }
                }
                i1++;
                flag1 = flag2;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            flag2 = false;
        }
        if (j != null)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < j.size(); j1++)
            {
                menu = (Fragment)j.get(j1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    Fragment.n();
                }
            }

        }
        j = arraylist1;
        return flag2;
    }

    public final boolean a(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !fragment.a(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(i1, null);
        if (l == null)
        {
            l = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("Freeing back stack index ")).append(i1).toString());
        }
        l.add(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("hide: ")).append(fragment).toString());
        }
        if (!fragment.z)
        {
            fragment.z = true;
            if (fragment.I != null)
            {
                Animation animation = a(fragment, i1, false, j1);
                if (animation != null)
                {
                    fragment.I.startAnimation(animation);
                }
                fragment.I.setVisibility(8);
            }
            if (fragment.l && fragment.D && fragment.E)
            {
                r = true;
            }
            android.support.v4.app.Fragment.e();
        }
    }

    final void b(a a1)
    {
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(a1);
        t();
    }

    public final void b(Menu menu)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.b(menu);
                }
            }

        }
    }

    public final boolean b()
    {
        return d();
    }

    public final boolean b(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !fragment.b(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void c(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("show: ")).append(fragment).toString());
        }
        if (fragment.z)
        {
            fragment.z = false;
            if (fragment.I != null)
            {
                Animation animation = a(fragment, i1, true, j1);
                if (animation != null)
                {
                    fragment.I.startAnimation(animation);
                }
                fragment.I.setVisibility(0);
            }
            if (fragment.l && fragment.D && fragment.E)
            {
                r = true;
            }
            android.support.v4.app.Fragment.e();
        }
    }

    public final boolean c()
    {
        s();
        d();
        Handler handler = o.a;
        int i1;
        if (i != null)
        {
            if ((i1 = i.size() - 1) >= 0)
            {
                ((a)i.remove(i1)).b();
                t();
                return true;
            }
        }
        return false;
    }

    public final void d(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("detach: ")).append(fragment).toString());
        }
        if (!fragment.A)
        {
            fragment.A = true;
            if (fragment.l)
            {
                if (g != null)
                {
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("remove from detach: ")).append(fragment).toString());
                    }
                    g.remove(fragment);
                }
                if (fragment.D && fragment.E)
                {
                    r = true;
                }
                fragment.l = false;
                a(fragment, 1, i1, j1, false);
            }
        }
    }

    public final boolean d()
    {
        if (e)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != o.a.getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (c != null && c.size() != 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        this;
        JVM INSTR monitorexit ;
        int k1;
        if (!v)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        int i1 = 0;
        int l1;
        for (k1 = 0; i1 < f.size(); k1 = l1)
        {
            Fragment fragment = (Fragment)f.get(i1);
            l1 = k1;
            if (fragment != null)
            {
                l1 = k1;
                if (fragment.M != null)
                {
                    l1 = k1 | fragment.M.a();
                }
            }
            i1++;
        }

        break; /* Loop/switch isn't completed */
        k1 = c.size();
        if (d == null || d.length < k1)
        {
            d = new Runnable[k1];
        }
        c.toArray(d);
        c.clear();
        o.a.removeCallbacks(y);
        this;
        JVM INSTR monitorexit ;
        e = true;
        for (int j1 = 0; j1 < k1; j1++)
        {
            d[j1].run();
            d[j1] = null;
        }

        break MISSING_BLOCK_LABEL_250;
        Exception exception;
        exception;
        throw exception;
        e = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 0)
        {
            v = false;
            r();
        }
        return flag;
    }

    final ArrayList e()
    {
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (f != null)
        {
            int i1 = 0;
            do
            {
                arraylist1 = arraylist;
                if (i1 >= f.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)f.get(i1);
                ArrayList arraylist2 = arraylist;
                if (fragment != null)
                {
                    arraylist2 = arraylist;
                    if (fragment.B)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.C = true;
                        int j1;
                        if (fragment.i != null)
                        {
                            j1 = fragment.i.f;
                        } else
                        {
                            j1 = -1;
                        }
                        fragment.j = j1;
                        arraylist2 = arraylist1;
                        if (a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment).toString());
                            arraylist2 = arraylist1;
                        }
                    }
                }
                i1++;
                arraylist = arraylist2;
            } while (true);
        }
        return arraylist1;
    }

    public final void e(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder("attach: ")).append(fragment).toString());
        }
        if (fragment.A)
        {
            fragment.A = false;
            if (!fragment.l)
            {
                if (g == null)
                {
                    g = new ArrayList();
                }
                if (g.contains(fragment))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
                }
                if (a)
                {
                    Log.v("FragmentManager", (new StringBuilder("add from attach: ")).append(fragment).toString());
                }
                g.add(fragment);
                fragment.l = true;
                if (fragment.D && fragment.E)
                {
                    r = true;
                }
                a(fragment, n, i1, j1, false);
            }
        }
    }

    final Parcelable f()
    {
        BackStackState abackstackstate[];
        abackstackstate = null;
        d();
        if (b)
        {
            s = true;
        }
        if (f != null && f.size() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int k1 = f.size();
        FragmentState afragmentstate[] = new FragmentState[k1];
        int j1 = 0;
        boolean flag = false;
        while (j1 < k1) 
        {
            Fragment fragment = (Fragment)f.get(j1);
            if (fragment == null)
            {
                continue;
            }
            if (fragment.f < 0)
            {
                a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment).append(" has cleared index: ").append(fragment.f).toString()));
            }
            FragmentState fragmentstate = new FragmentState(fragment);
            afragmentstate[j1] = fragmentstate;
            if (fragment.a > 0 && fragmentstate.j == null)
            {
                if (w == null)
                {
                    w = new Bundle();
                }
                fragment.b(w);
                Bundle bundle;
                int ai[];
                Object obj;
                FragmentManagerState fragmentmanagerstate;
                int i1;
                if (!w.isEmpty())
                {
                    obj = w;
                    w = null;
                } else
                {
                    obj = null;
                }
                if (fragment.I != null)
                {
                    b(fragment);
                }
                bundle = ((Bundle) (obj));
                if (fragment.e != null)
                {
                    bundle = ((Bundle) (obj));
                    if (obj == null)
                    {
                        bundle = new Bundle();
                    }
                    bundle.putSparseParcelableArray("android:view_state", fragment.e);
                }
                obj = bundle;
                if (!fragment.L)
                {
                    obj = bundle;
                    if (bundle == null)
                    {
                        obj = new Bundle();
                    }
                    ((Bundle) (obj)).putBoolean("android:user_visible_hint", fragment.L);
                }
                fragmentstate.j = ((Bundle) (obj));
                if (fragment.i != null)
                {
                    if (fragment.i.f < 0)
                    {
                        a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment).append(" has target not in fragment manager: ").append(fragment.i).toString()));
                    }
                    if (fragmentstate.j == null)
                    {
                        fragmentstate.j = new Bundle();
                    }
                    Bundle bundle1 = fragmentstate.j;
                    obj = fragment.i;
                    if (((Fragment) (obj)).f < 0)
                    {
                        a(new IllegalStateException((new StringBuilder("Fragment ")).append(obj).append(" is not currently in the FragmentManager").toString()));
                    }
                    bundle1.putInt("android:target_state", ((Fragment) (obj)).f);
                    if (fragment.k != 0)
                    {
                        fragmentstate.j.putInt("android:target_req_state", fragment.k);
                    }
                }
            } else
            {
                fragmentstate.j = fragment.d;
            }
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder("Saved state of ")).append(fragment).append(": ").append(fragmentstate.j).toString());
            }
            flag = true;
            j1++;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
label0:
        {
            if (g != null)
            {
                j1 = g.size();
                if (j1 > 0)
                {
                    obj = new int[j1];
                    i1 = 0;
                    do
                    {
                        ai = ((int []) (obj));
                        if (i1 >= j1)
                        {
                            break;
                        }
                        obj[i1] = ((Fragment)g.get(i1)).f;
                        if (obj[i1] < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(g.get(i1)).append(" has cleared index: ").append(obj[i1]).toString()));
                        }
                        if (a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("saveAllState: adding fragment #")).append(i1).append(": ").append(g.get(i1)).toString());
                        }
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            ai = null;
        }
        obj = abackstackstate;
        if (i != null)
        {
            j1 = i.size();
            obj = abackstackstate;
            if (j1 > 0)
            {
                abackstackstate = new BackStackState[j1];
                i1 = 0;
                do
                {
                    obj = abackstackstate;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    abackstackstate[i1] = new BackStackState((a)i.get(i1));
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("saveAllState: adding back stack #")).append(i1).append(": ").append(i.get(i1)).toString());
                    }
                    i1++;
                } while (true);
            }
        }
        fragmentmanagerstate = new FragmentManagerState();
        fragmentmanagerstate.a = afragmentstate;
        fragmentmanagerstate.b = ai;
        fragmentmanagerstate.c = ((BackStackState []) (obj));
        return fragmentmanagerstate;
    }

    public final void g()
    {
        s = false;
    }

    public final void h()
    {
        s = false;
        d(1);
    }

    public final void i()
    {
        s = false;
        d(2);
    }

    public final void j()
    {
        s = false;
        d(4);
    }

    public final void k()
    {
        s = false;
        d(5);
    }

    public final void l()
    {
        d(4);
    }

    public final void m()
    {
        s = true;
        d(3);
    }

    public final void n()
    {
        d(2);
    }

    public final void o()
    {
        d(1);
    }

    public final void p()
    {
        t = true;
        d();
        d(0);
        o = null;
        p = null;
        q = null;
    }

    public final void q()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.s();
                }
            }

        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (q != null)
        {
            android.support.v4.b.d.a(q, stringbuilder);
        } else
        {
            android.support.v4.b.d.a(o, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        b = flag;
    }
}
