// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.c.a;
import android.support.v4.c.b;
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
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            q, t, p, Fragment, 
//            b, w, ai, FragmentManagerState, 
//            FragmentState, BackStackState, ba, ak, 
//            o, x, v, u, 
//            r, ad

final class s extends q
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
    p o;
    o p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w;
    SparseArray x;
    Runnable y;

    s()
    {
        n = 0;
        w = null;
        x = null;
        y = new t(this);
    }

    static Animation a(Context context, float f1, float f2)
    {
        context = new AlphaAnimation(f1, f2);
        context.setInterpolator(A);
        context.setDuration(220L);
        return context;
    }

    static Animation a(Context context, float f1, float f2, float f3, float f4)
    {
        context = new AnimationSet(false);
        Object obj = new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(z);
        ((ScaleAnimation) (obj)).setDuration(220L);
        context.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f3, f4);
        ((AlphaAnimation) (obj)).setInterpolator(A);
        ((AlphaAnimation) (obj)).setDuration(220L);
        context.addAnimation(((Animation) (obj)));
        return context;
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new b("FragmentManager"));
        if (o != null)
        {
            try
            {
                o.a("  ", null, ((PrintWriter) (obj)), new String[0]);
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

    public static int b(int i1, boolean flag)
    {
        switch (i1)
        {
        default:
            return -1;

        case 4097: 
            return !flag ? 2 : 1;

        case 8194: 
            return !flag ? 4 : 3;

        case 4099: 
            break;
        }
        return !flag ? 6 : 5;
    }

    public static int e(int i1)
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

    private void w()
    {
        if (s)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (u != null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Can not perform this action inside of ").append(u).toString());
        } else
        {
            return;
        }
    }

    public int a(android.support.v4.app.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (l != null && l.size() > 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (k == null)
        {
            k = new ArrayList();
        }
        i1 = k.size();
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Setting back stack index ").append(i1).append(" to ").append(b1).toString());
        }
        k.add(b1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)l.remove(l.size() - 1)).intValue();
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Adding back stack index ").append(i1).append(" with ").append(b1).toString());
        }
        k.set(i1, b1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public Fragment a(int i1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        int j1 = g.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(j1);
        if (fragment == null || fragment.G != i1) goto _L5; else goto _L4
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
        if (fragment1.G == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public Fragment a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= f.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragement no longer exists for key ").append(s1).append(": index ").append(i1).toString()))));
            }
            Fragment fragment = (Fragment)f.get(i1);
            bundle = fragment;
            if (fragment == null)
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragement no longer exists for key ").append(s1).append(": index ").append(i1).toString()))));
                return fragment;
            }
        }
        return bundle;
    }

    public Fragment a(String s1)
    {
        if (g == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = g.size() - 1;
_L11:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null || !s1.equals(fragment.I)) goto _L5; else goto _L4
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
        if (s1.equals(fragment1.I)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public ad a()
    {
        return new android.support.v4.app.b(this);
    }

    Animation a(Fragment fragment, int i1, boolean flag, int j1)
    {
        Animation animation = fragment.a(i1, flag, fragment.Q);
        if (animation == null) goto _L2; else goto _L1
_L1:
        fragment = animation;
_L4:
        return fragment;
_L2:
        if (fragment.Q == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        animation = AnimationUtils.loadAnimation(o.a(), fragment.Q);
        fragment = animation;
        if (animation != null) goto _L4; else goto _L3
_L3:
        if (i1 == 0)
        {
            return null;
        }
        i1 = b(i1, flag);
        if (i1 < 0)
        {
            return null;
        }
        switch (i1)
        {
        default:
            i1 = j1;
            if (j1 == 0)
            {
                i1 = j1;
                if (o.c() != null)
                {
                    i1 = o.c().getAttributes().windowAnimations;
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
            return a(o.a(), 1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return a(o.a(), 1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return a(o.a(), 0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return a(o.a(), 1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return a(o.a(), 0.0F, 1.0F);

        case 6: // '\006'
            return a(o.a(), 1.0F, 0.0F);
        }
    }

    public void a(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad id: ").append(i1).toString());
        } else
        {
            a(((Runnable) (new w(this, i1, j1))), false);
            return;
        }
    }

    void a(int i1, int j1, int k1, boolean flag)
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
                    if (fragment.W != null)
                    {
                        flag1 |= fragment.W.a();
                    }
                }

                if (!flag1)
                {
                    g();
                }
                if (r && o != null && n == 5)
                {
                    o.j();
                    r = false;
                    return;
                }
            }
        }
    }

    public void a(int i1, android.support.v4.app.b b1)
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
            Log.v("FragmentManager", (new StringBuilder()).append("Setting back stack index ").append(i1).append(" to ").append(b1).toString());
        }
        k.set(i1, b1);
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
            Log.v("FragmentManager", (new StringBuilder()).append("Adding available back stack index ").append(j1).toString());
        }
        l.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Adding back stack index ").append(i1).append(" with ").append(b1).toString());
        }
        k.add(b1);
          goto _L4
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    void a(int i1, boolean flag)
    {
        a(i1, 0, 0, flag);
    }

    public void a(Configuration configuration)
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

    public void a(Bundle bundle, String s1, Fragment fragment)
    {
        if (fragment.o < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("Fragment ").append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        bundle.putInt(s1, fragment.o);
    }

    void a(Parcelable parcelable, ArrayList arraylist)
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
                        Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: re-attaching retained ").append(fragment).toString());
                    }
                    FragmentState fragmentstate1 = ((FragmentManagerState) (parcelable)).a[fragment.o];
                    fragmentstate1.l = fragment;
                    fragment.n = null;
                    fragment.B = 0;
                    fragment.z = false;
                    fragment.v = false;
                    fragment.s = null;
                    if (fragmentstate1.k != null)
                    {
                        fragmentstate1.k.setClassLoader(o.a().getClassLoader());
                        fragment.n = fragmentstate1.k.getSparseParcelableArray("android:view_state");
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
                        Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: active #").append(j1).append(": ").append(fragment2).toString());
                    }
                    f.add(fragment2);
                    fragmentstate.l = null;
                } else
                {
                    f.add(null);
                    if (h == null)
                    {
                        h = new ArrayList();
                    }
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: avail #").append(j1).toString());
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
                    if (fragment1.t >= 0)
                    {
                        if (fragment1.t < f.size())
                        {
                            fragment1.s = (Fragment)f.get(fragment1.t);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder()).append("Re-attaching retained fragment ").append(fragment1).append(" target no longer exists: ").append(fragment1.t).toString());
                            fragment1.s = null;
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
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder()).append("No instantiated fragment for index #").append(((FragmentManagerState) (parcelable)).b[l1]).toString()))));
                    }
                    arraylist.v = true;
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: added #").append(l1).append(": ").append(arraylist).toString());
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
                        Log.v("FragmentManager", (new StringBuilder()).append("restoreAllState: back stack #").append(i2).append(" (index ").append(((android.support.v4.app.b) (arraylist)).o).append("): ").append(arraylist).toString());
                        arraylist.a("  ", new PrintWriter(new b("FragmentManager")), false);
                    }
                    i.add(arraylist);
                    if (((android.support.v4.app.b) (arraylist)).o >= 0)
                    {
                        a(((android.support.v4.app.b) (arraylist)).o, ((android.support.v4.app.b) (arraylist)));
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

    public void a(Fragment fragment)
    {
label0:
        {
            if (fragment.U)
            {
                if (!e)
                {
                    break label0;
                }
                v = true;
            }
            return;
        }
        fragment.U = false;
        a(fragment, n, 0, 0, false);
    }

    public void a(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("remove: ").append(fragment).append(" nesting=").append(fragment.B).toString());
        }
        int k1;
        if (!fragment.i())
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!fragment.K || k1 != 0)
        {
            if (g != null)
            {
                g.remove(fragment);
            }
            if (fragment.N && fragment.O)
            {
                r = true;
            }
            fragment.v = false;
            fragment.w = true;
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

    void a(Fragment fragment, int i1, int j1, int k1, boolean flag)
    {
        int l1;
label0:
        {
            if (fragment.v)
            {
                l1 = i1;
                if (!fragment.K)
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
        if (fragment.w)
        {
            j2 = l1;
            if (l1 > fragment.j)
            {
                j2 = fragment.j;
            }
        }
        i1 = j2;
        if (fragment.U)
        {
            i1 = j2;
            if (fragment.j < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (fragment.j >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (fragment.y && !fragment.z)
        {
            return;
        }
        if (fragment.k != null)
        {
            fragment.k = null;
            a(fragment, fragment.l, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        fragment.j;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 560
    //                   2 878
    //                   3 878
    //                   4 928;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        fragment.j = i2;
        return;
_L4:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("moveto CREATED: ").append(fragment).toString());
        }
        k2 = i1;
        if (fragment.m != null)
        {
            fragment.n = fragment.m.getSparseParcelableArray("android:view_state");
            fragment.s = a(fragment.m, "android:target_state");
            if (fragment.s != null)
            {
                fragment.u = fragment.m.getInt("android:target_req_state", 0);
            }
            fragment.V = fragment.m.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!fragment.V)
            {
                fragment.U = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        fragment.D = o;
        fragment.F = q;
        s s1;
        if (q != null)
        {
            s1 = q.E;
        } else
        {
            s1 = o.g();
        }
        fragment.C = s1;
        fragment.P = false;
        fragment.a(o.a());
        if (!fragment.P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        if (fragment.F == null)
        {
            o.a(fragment);
        } else
        {
            q.a(fragment);
        }
        if (!fragment.M)
        {
            fragment.i(fragment.m);
        }
        fragment.M = false;
        i2 = k2;
        if (fragment.y)
        {
            fragment.S = fragment.b(fragment.b(fragment.m), null, fragment.m);
            Object obj1;
            if (fragment.S != null)
            {
                fragment.T = fragment.S;
                fragment.S = android.support.v4.app.ak.a(fragment.S);
                if (fragment.J)
                {
                    fragment.S.setVisibility(8);
                }
                fragment.a(fragment.S, fragment.m);
                i2 = k2;
            } else
            {
                fragment.T = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("moveto ACTIVITY_CREATED: ").append(fragment).toString());
            }
            if (!fragment.y)
            {
                Object obj;
                if (fragment.H != 0)
                {
                    obj1 = (ViewGroup)p.a(fragment.H);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = obj1;
                        if (!fragment.A)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder()).append("No view found for id 0x").append(Integer.toHexString(fragment.H)).append(" (").append(fragment.o().getResourceName(fragment.H)).append(") for fragment ").append(fragment).toString()))));
                            obj = obj1;
                        }
                    }
                } else
                {
                    obj = null;
                }
                fragment.R = ((ViewGroup) (obj));
                fragment.S = fragment.b(fragment.b(fragment.m), ((ViewGroup) (obj)), fragment.m);
                if (fragment.S != null)
                {
                    fragment.T = fragment.S;
                    fragment.S = android.support.v4.app.ak.a(fragment.S);
                    if (obj != null)
                    {
                        obj1 = a(fragment, j1, true, k1);
                        if (obj1 != null)
                        {
                            fragment.S.startAnimation(((Animation) (obj1)));
                        }
                        ((ViewGroup) (obj)).addView(fragment.S);
                    }
                    if (fragment.J)
                    {
                        fragment.S.setVisibility(8);
                    }
                    fragment.a(fragment.S, fragment.m);
                } else
                {
                    fragment.T = null;
                }
            }
            fragment.j(fragment.m);
            if (fragment.S != null)
            {
                fragment.f(fragment.m);
            }
            fragment.m = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("moveto STARTED: ").append(fragment).toString());
            }
            fragment.G();
            k2 = l2;
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("moveto RESUMED: ").append(fragment).toString());
            }
            fragment.x = true;
            fragment.H();
            fragment.m = null;
            fragment.n = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (fragment.j <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.j;
        JVM INSTR tableswitch 1 5: default 1076
    //                   1 1082
    //                   2 1266
    //                   3 1225
    //                   4 1184
    //                   5 1138;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L9:
        i2 = i1;
        if (i1 >= 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (t && fragment.k != null)
        {
            obj = fragment.k;
            fragment.k = null;
            ((View) (obj)).clearAnimation();
        }
        if (fragment.k != null)
        {
            fragment.l = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("movefrom RESUMED: ").append(fragment).toString());
            }
            fragment.J();
            fragment.x = false;
        }
_L12:
        if (i1 < 4)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("movefrom STARTED: ").append(fragment).toString());
            }
            fragment.K();
        }
_L11:
        if (i1 < 3)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("movefrom STOPPED: ").append(fragment).toString());
            }
            fragment.L();
        }
_L10:
        if (i1 < 2)
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("movefrom ACTIVITY_CREATED: ").append(fragment).toString());
            }
            if (fragment.S != null && !o.f() && fragment.n == null)
            {
                e(fragment);
            }
            fragment.M();
            if (fragment.S != null && fragment.R != null)
            {
                if (n > 0 && !t)
                {
                    obj = a(fragment, j1, false, k1);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    fragment.k = fragment.S;
                    fragment.l = i1;
                    ((Animation) (obj)).setAnimationListener(new x(this, fragment));
                    fragment.S.startAnimation(((Animation) (obj)));
                }
                fragment.R.removeView(fragment.S);
            }
            fragment.R = null;
            fragment.S = null;
            fragment.T = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("movefrom CREATED: ").append(fragment).toString());
        }
        if (!fragment.M)
        {
            fragment.N();
        }
        fragment.P = false;
        fragment.e();
        if (!fragment.P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (!flag)
        {
            if (!fragment.M)
            {
                d(fragment);
                i2 = i1;
            } else
            {
                fragment.D = null;
                fragment.C = null;
                i2 = i1;
            }
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void a(Fragment fragment, boolean flag)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("add: ").append(fragment).toString());
        }
        c(fragment);
        if (!fragment.K)
        {
            if (g.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder()).append("Fragment already added: ").append(fragment).toString());
            }
            g.add(fragment);
            fragment.v = true;
            fragment.w = false;
            if (fragment.N && fragment.O)
            {
                r = true;
            }
            if (flag)
            {
                b(fragment);
            }
        }
    }

    public void a(p p1, o o1, Fragment fragment)
    {
        if (o != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            o = p1;
            p = o1;
            q = fragment;
            return;
        }
    }

    public void a(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            w();
        }
        this;
        JVM INSTR monitorenter ;
        if (o == null)
        {
            throw new IllegalStateException("FragmentHost has been destroyed");
        }
        break MISSING_BLOCK_LABEL_33;
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
            o.b().removeCallbacks(y);
            o.b().post(y);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void a(String s1, int i1)
    {
        a(((Runnable) (new v(this, s1, i1))), false);
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
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
                    Fragment fragment1 = (Fragment)g.get(j1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(fragment1.toString());
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
                    Fragment fragment2 = (Fragment)j.get(k1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                    printwriter.println(fragment2.toString());
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
                    android.support.v4.app.b b1 = (android.support.v4.app.b)i.get(l1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(l1);
                    printwriter.print(": ");
                    printwriter.println(b1.toString());
                    b1.a(s2, filedescriptor, printwriter, as);
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
        filedescriptor = (android.support.v4.app.b)k.get(i2);
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
        break MISSING_BLOCK_LABEL_710;
        s1;
        this;
        JVM INSTR monitorexit ;
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

    boolean a(Handler handler, String s1, int i1, int j1)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s1 != null || i1 >= 0 || (j1 & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i1 = i.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        ((android.support.v4.app.b)i.remove(i1)).b(true);
        i();
_L8:
        return true;
_L4:
        int k1;
        int l1;
        k1 = -1;
        if (s1 == null && i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i.size() - 1;
        break MISSING_BLOCK_LABEL_81;
        if (l1 < 0) goto _L1; else goto _L6
_L6:
        k1 = l1;
        if ((j1 & 1) == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = l1 - 1;
        do
        {
            k1 = j1;
            if (j1 < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            handler = (android.support.v4.app.b)i.get(j1);
            if (s1 == null || !s1.equals(handler.c()))
            {
                k1 = j1;
                if (i1 < 0)
                {
                    continue; /* Loop/switch isn't completed */
                }
                k1 = j1;
                if (i1 != ((android.support.v4.app.b) (handler)).o)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            j1--;
        } while (true);
        do
        {
            if (l1 < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            handler = (android.support.v4.app.b)i.get(l1);
            if (s1 != null && s1.equals(handler.c()) || i1 >= 0 && i1 == ((android.support.v4.app.b) (handler)).o)
            {
                continue; /* Loop/switch isn't completed */
            }
            l1--;
        } while (true);
        if (k1 == i.size() - 1) goto _L1; else goto _L7
_L7:
        handler = new ArrayList();
        for (i1 = i.size() - 1; i1 > k1; i1--)
        {
            handler.add(i.remove(i1));
        }

        j1 = handler.size() - 1;
        i1 = 0;
        while (i1 <= j1) 
        {
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Popping back stack state: ").append(handler.get(i1)).toString());
            }
            s1 = (android.support.v4.app.b)handler.get(i1);
            boolean flag;
            if (i1 == j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1.b(flag);
            i1++;
        }
        i();
          goto _L8
    }

    public boolean a(Menu menu)
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
                    if (fragment.c(menu))
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

    public boolean a(Menu menu, MenuInflater menuinflater)
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
                    if (fragment.b(menu, menuinflater))
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
                    menu.E();
                }
            }

        }
        j = arraylist1;
        return flag2;
    }

    public boolean a(MenuItem menuitem)
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
        if (fragment == null || !fragment.c(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int b(int i1)
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        int j1 = i1;
_L4:
        return j1;
_L2:
        Iterator iterator = f.iterator();
        do
        {
            j1 = i1;
            if (!iterator.hasNext())
            {
                continue;
            }
            Fragment fragment = (Fragment)iterator.next();
            if (fragment != null)
            {
                i1 = fragment.b(i1);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void b(Fragment fragment)
    {
        a(fragment, n, 0, 0, false);
    }

    public void b(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("hide: ").append(fragment).toString());
        }
        if (!fragment.J)
        {
            fragment.J = true;
            if (fragment.S != null)
            {
                Animation animation = a(fragment, i1, false, j1);
                if (animation != null)
                {
                    fragment.S.startAnimation(animation);
                }
                fragment.S.setVisibility(8);
            }
            if (fragment.v && fragment.N && fragment.O)
            {
                r = true;
            }
            fragment.c(true);
        }
    }

    void b(android.support.v4.app.b b1)
    {
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(b1);
        i();
    }

    public void b(Menu menu)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.d(menu);
                }
            }

        }
    }

    public boolean b()
    {
        return h();
    }

    public boolean b(MenuItem menuitem)
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
        if (fragment == null || !fragment.d(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Fragment c(int i1)
    {
        if (f == null)
        {
            return null;
        }
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            Fragment fragment = (Fragment)iterator.next();
            if (fragment != null && fragment.p >= i1)
            {
                return fragment.c(i1);
            }
        }

        return null;
    }

    void c(Fragment fragment)
    {
        if (fragment.o < 0)
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
                f.set(fragment.o, fragment);
            }
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Allocated fragment index ").append(fragment).toString());
                return;
            }
        }
    }

    public void c(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("show: ").append(fragment).toString());
        }
        if (fragment.J)
        {
            fragment.J = false;
            if (fragment.S != null)
            {
                Animation animation = a(fragment, i1, true, j1);
                if (animation != null)
                {
                    fragment.S.startAnimation(animation);
                }
                fragment.S.setVisibility(0);
            }
            if (fragment.v && fragment.N && fragment.O)
            {
                r = true;
            }
            fragment.c(false);
        }
    }

    public boolean c()
    {
        return !s && u == null;
    }

    public void d()
    {
        a(new u(this), false);
    }

    public void d(int i1)
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
            Log.v("FragmentManager", (new StringBuilder()).append("Freeing back stack index ").append(i1).toString());
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

    void d(Fragment fragment)
    {
        if (fragment.o < 0)
        {
            return;
        }
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Freeing fragment index ").append(fragment).toString());
        }
        f.set(fragment.o, null);
        fragment.p = -1;
        if (h == null)
        {
            h = new ArrayList();
        }
        h.add(Integer.valueOf(fragment.o));
        o.a(fragment.q);
        fragment.D();
    }

    public void d(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("detach: ").append(fragment).toString());
        }
        if (!fragment.K)
        {
            fragment.K = true;
            if (fragment.v)
            {
                if (g != null)
                {
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("remove from detach: ").append(fragment).toString());
                    }
                    g.remove(fragment);
                }
                if (fragment.N && fragment.O)
                {
                    r = true;
                }
                fragment.v = false;
                a(fragment, 1, i1, j1, false);
            }
        }
    }

    void e(Fragment fragment)
    {
        if (fragment.T != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            fragment.T.saveHierarchyState(x);
            if (x.size() > 0)
            {
                fragment.n = x;
                x = null;
                return;
            }
        }
    }

    public void e(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("attach: ").append(fragment).toString());
        }
        if (fragment.K)
        {
            fragment.K = false;
            if (!fragment.v)
            {
                if (g == null)
                {
                    g = new ArrayList();
                }
                if (g.contains(fragment))
                {
                    throw new IllegalStateException((new StringBuilder()).append("Fragment already added: ").append(fragment).toString());
                }
                if (a)
                {
                    Log.v("FragmentManager", (new StringBuilder()).append("add from attach: ").append(fragment).toString());
                }
                g.add(fragment);
                fragment.v = true;
                if (fragment.N && fragment.O)
                {
                    r = true;
                }
                a(fragment, n, i1, j1, false);
            }
        }
    }

    public boolean e()
    {
        w();
        b();
        return a(o.b(), ((String) (null)), -1, 0);
    }

    public int f()
    {
        if (i != null)
        {
            return i.size();
        } else
        {
            return 0;
        }
    }

    Bundle f(Fragment fragment)
    {
        if (w == null)
        {
            w = new Bundle();
        }
        fragment.k(w);
        Bundle bundle;
        Bundle bundle1;
        if (!w.isEmpty())
        {
            bundle1 = w;
            w = null;
        } else
        {
            bundle1 = null;
        }
        if (fragment.S != null)
        {
            e(fragment);
        }
        bundle = bundle1;
        if (fragment.n != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.n);
        }
        bundle1 = bundle;
        if (!fragment.V)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", fragment.V);
        }
        return bundle1;
    }

    void g()
    {
        if (f != null)
        {
            int i1 = 0;
            while (i1 < f.size()) 
            {
                Fragment fragment = (Fragment)f.get(i1);
                if (fragment != null)
                {
                    a(fragment);
                }
                i1++;
            }
        }
    }

    public boolean h()
    {
        if (e)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != o.b().getLooper())
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
                if (fragment.W != null)
                {
                    l1 = k1 | fragment.W.a();
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
        o.b().removeCallbacks(y);
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
        this;
        JVM INSTR monitorexit ;
        throw exception;
        e = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 0)
        {
            v = false;
            g();
        }
        return flag;
    }

    void i()
    {
        if (m != null)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                ((r)m.get(i1)).a();
            }

        }
    }

    ArrayList j()
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
                    if (fragment.L)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.M = true;
                        int j1;
                        if (fragment.s != null)
                        {
                            j1 = fragment.s.o;
                        } else
                        {
                            j1 = -1;
                        }
                        fragment.t = j1;
                        arraylist2 = arraylist1;
                        if (a)
                        {
                            Log.v("FragmentManager", (new StringBuilder()).append("retainNonConfig: keeping retained ").append(fragment).toString());
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

    Parcelable k()
    {
        FragmentManagerState fragmentmanagerstate;
        fragmentmanagerstate = null;
        h();
        if (b)
        {
            s = true;
        }
        if (f != null && f.size() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        FragmentState afragmentstate[];
        int j2 = f.size();
        afragmentstate = new FragmentState[j2];
        int k1 = 0;
        boolean flag = false;
        while (k1 < j2) 
        {
            Fragment fragment = (Fragment)f.get(k1);
            if (fragment == null)
            {
                continue;
            }
            if (fragment.o < 0)
            {
                a(new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(fragment).append(" has cleared index: ").append(fragment.o).toString()));
            }
            FragmentState fragmentstate = new FragmentState(fragment);
            afragmentstate[k1] = fragmentstate;
            if (fragment.j > 0 && fragmentstate.k == null)
            {
                fragmentstate.k = f(fragment);
                if (fragment.s != null)
                {
                    if (fragment.s.o < 0)
                    {
                        a(new IllegalStateException((new StringBuilder()).append("Failure saving state: ").append(fragment).append(" has target not in fragment manager: ").append(fragment.s).toString()));
                    }
                    if (fragmentstate.k == null)
                    {
                        fragmentstate.k = new Bundle();
                    }
                    a(fragmentstate.k, "android:target_state", fragment.s);
                    if (fragment.u != 0)
                    {
                        fragmentstate.k.putInt("android:target_req_state", fragment.u);
                    }
                }
            } else
            {
                fragmentstate.k = fragment.m;
            }
            if (a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Saved state of ").append(fragment).append(": ").append(fragmentstate.k).toString());
            }
            flag = true;
            k1++;
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
        int ai1[];
label0:
        {
            if (g != null)
            {
                int l1 = g.size();
                if (l1 > 0)
                {
                    int ai2[] = new int[l1];
                    int i1 = 0;
                    do
                    {
                        ai1 = ai2;
                        if (i1 >= l1)
                        {
                            break;
                        }
                        ai2[i1] = ((Fragment)g.get(i1)).o;
                        if (ai2[i1] < 0)
                        {
                            a(new IllegalStateException((new StringBuilder()).append("Failure saving state: active ").append(g.get(i1)).append(" has cleared index: ").append(ai2[i1]).toString()));
                        }
                        if (a)
                        {
                            Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding fragment #").append(i1).append(": ").append(g.get(i1)).toString());
                        }
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            ai1 = null;
        }
        BackStackState abackstackstate[] = fragmentmanagerstate;
        if (i != null)
        {
            int i2 = i.size();
            abackstackstate = fragmentmanagerstate;
            if (i2 > 0)
            {
                BackStackState abackstackstate1[] = new BackStackState[i2];
                int j1 = 0;
                do
                {
                    abackstackstate = abackstackstate1;
                    if (j1 >= i2)
                    {
                        break;
                    }
                    abackstackstate1[j1] = new BackStackState(this, (android.support.v4.app.b)i.get(j1));
                    if (a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("saveAllState: adding back stack #").append(j1).append(": ").append(i.get(j1)).toString());
                    }
                    j1++;
                } while (true);
            }
        }
        abackstackstate1 = new FragmentManagerState();
        abackstackstate1.a = afragmentstate;
        abackstackstate1.b = ai1;
        abackstackstate1.c = abackstackstate;
        return abackstackstate1;
    }

    public void l()
    {
        s = false;
    }

    public void m()
    {
        s = false;
        a(1, false);
    }

    public void n()
    {
        s = false;
        a(2, false);
    }

    public void o()
    {
        s = false;
        a(4, false);
    }

    public void p()
    {
        s = false;
        a(5, false);
    }

    public void q()
    {
        a(4, false);
    }

    public void r()
    {
        s = true;
        a(3, false);
    }

    public void s()
    {
        a(2, false);
    }

    public void t()
    {
        a(1, false);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (q != null)
        {
            android.support.v4.c.a.a(q, stringbuilder);
        } else
        {
            android.support.v4.c.a.a(o, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    public void u()
    {
        t = true;
        h();
        a(0, false);
        o = null;
        p = null;
        q = null;
    }

    public void v()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.I();
                }
            }

        }
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
