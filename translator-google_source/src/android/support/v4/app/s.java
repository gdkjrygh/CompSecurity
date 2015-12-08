// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.d.d;
import android.support.v4.d.e;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            r, t, Fragment, q, 
//            v, a, y, ao, 
//            FragmentManagerState, FragmentState, BackStackState, SuperNotCalledException, 
//            o, NoSaveStateFrameLayout, u, ae

final class s extends r
    implements ai
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
    q o;
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
        k1 = fragment.H;
        Fragment.h();
        if (fragment.H != 0)
        {
            fragment = AnimationUtils.loadAnimation(o.c, fragment.H);
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
        JVM INSTR lookupswitch 3: default 84
    //                   4097: 93
    //                   4099: 121
    //                   8194: 107;
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
                if (o.e())
                {
                    i1 = o.f();
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
            return a(1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return a(1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return a(0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return a(1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return a(0.0F, 1.0F);

        case 6: // '\006'
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
            (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(a1);
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
        l.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        if (a)
        {
            (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(a1);
        }
        k.add(a1);
          goto _L4
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private void a(RuntimeException runtimeexception)
    {
        runtimeexception.getMessage();
        PrintWriter printwriter = new PrintWriter(new e("FragmentManager"));
        if (o != null)
        {
            try
            {
                o.a("  ", printwriter, new String[0]);
            }
            catch (Exception exception1) { }
        } else
        {
            try
            {
                a("  ", ((FileDescriptor) (null)), printwriter, new String[0]);
            }
            catch (Exception exception) { }
        }
        throw runtimeexception;
    }

    static boolean a(View view, Animation animation)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (bt.d(view) != 0) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!bt.t(view)) goto _L2; else goto _L3
_L3:
        if (!(animation instanceof AlphaAnimation)) goto _L5; else goto _L4
_L4:
        int i1 = 1;
_L7:
        flag = flag1;
        if (i1 != 0)
        {
            flag = true;
        }
_L2:
        return flag;
_L5:
        if (animation instanceof AnimationSet)
        {
            view = ((AnimationSet)animation).getAnimations();
            i1 = 0;
            do
            {
                if (i1 >= view.size())
                {
                    break;
                }
                if (view.get(i1) instanceof AlphaAnimation)
                {
                    i1 = 1;
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int b(int i1)
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

    private static void b(View view, Animation animation)
    {
        while (view == null || animation == null || !a(view, animation)) 
        {
            return;
        }
        animation.setAnimationListener(new v(view, animation));
    }

    private Fragment c(int i1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        int j1 = g.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(j1);
        if (fragment == null || fragment.x != i1) goto _L5; else goto _L4
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
        if (fragment1.x == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void c(Fragment fragment)
    {
        a(fragment, n, 0, 0, false);
    }

    private void d(Fragment fragment)
    {
        if (fragment.K != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            fragment.K.saveHierarchyState(x);
            if (x.size() > 0)
            {
                fragment.f = x;
                x = null;
                return;
            }
        }
    }

    private Bundle e(Fragment fragment)
    {
        if (w == null)
        {
            w = new Bundle();
        }
        fragment.c(w);
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
        if (fragment.J != null)
        {
            d(fragment);
        }
        bundle = bundle1;
        if (fragment.f != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f);
        }
        bundle1 = bundle;
        if (!fragment.M)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", fragment.M);
        }
        return bundle1;
    }

    public final int a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (l != null && l.size() > 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (k == null)
        {
            k = new ArrayList();
        }
        i1 = k.size();
        if (a)
        {
            (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(a1);
        }
        k.add(a1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)l.remove(l.size() - 1)).intValue();
        if (a)
        {
            (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(a1);
        }
        k.set(i1, a1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final Fragment.SavedState a(Fragment fragment)
    {
        Object obj = null;
        if (fragment.g < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        Fragment.SavedState savedstate = obj;
        if (fragment.b > 0)
        {
            fragment = e(fragment);
            savedstate = obj;
            if (fragment != null)
            {
                savedstate = new Fragment.SavedState(fragment);
            }
        }
        return savedstate;
    }

    public final Fragment a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= f.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
            }
            Fragment fragment = (Fragment)f.get(i1);
            bundle = fragment;
            if (fragment == null)
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
                return fragment;
            }
        }
        return bundle;
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
        if (fragment == null || !s1.equals(fragment.z)) goto _L5; else goto _L4
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
        if (s1.equals(fragment1.z)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final ae a()
    {
        return new a(this);
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        if (!"fragment".equals(s1))
        {
            return null;
        }
        String s2 = attributeset.getAttributeValue(null, "class");
        s1 = context.obtainStyledAttributes(attributeset, y.a);
        if (s2 == null)
        {
            s2 = s1.getString(0);
        }
        int k1 = s1.getResourceId(1, -1);
        String s3 = s1.getString(2);
        s1.recycle();
        if (!Fragment.b(o.c, s2))
        {
            return null;
        }
        int i1;
        if (view != null)
        {
            i1 = view.getId();
        } else
        {
            i1 = 0;
        }
        if (i1 == -1 && k1 == -1 && s3 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s2).toString());
        }
        if (k1 != -1)
        {
            s1 = c(k1);
        } else
        {
            s1 = null;
        }
        view = s1;
        if (s1 == null)
        {
            view = s1;
            if (s3 != null)
            {
                view = a(s3);
            }
        }
        s1 = view;
        if (view == null)
        {
            s1 = view;
            if (i1 != -1)
            {
                s1 = c(i1);
            }
        }
        if (a)
        {
            (new StringBuilder("onCreateView: id=0x")).append(Integer.toHexString(k1)).append(" fname=").append(s2).append(" existing=").append(s1);
        }
        if (s1 == null)
        {
            view = Fragment.a(context, s2);
            view.p = true;
            int j1;
            if (k1 != 0)
            {
                j1 = k1;
            } else
            {
                j1 = i1;
            }
            view.x = j1;
            view.y = i1;
            view.z = s3;
            view.q = true;
            view.t = this;
            view.u = o;
            s1 = ((Fragment) (view)).e;
            view.g();
            a(((Fragment) (view)), true);
        } else
        {
            if (((Fragment) (s1)).q)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k1)).append(", tag ").append(s3).append(", or parent id 0x").append(Integer.toHexString(i1)).append(" with another fragment for ").append(s2).toString());
            }
            s1.q = true;
            if (!((Fragment) (s1)).D)
            {
                view = ((Fragment) (s1)).e;
                s1.g();
            }
            view = s1;
        }
        if (n <= 0 && ((Fragment) (view)).p)
        {
            a(((Fragment) (view)), 1, 0, 0, false);
        } else
        {
            c(view);
        }
        if (((Fragment) (view)).J == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(s2).append(" did not create a view.").toString());
        }
        if (k1 != 0)
        {
            ((Fragment) (view)).J.setId(k1);
        }
        if (((Fragment) (view)).J.getTag() == null)
        {
            ((Fragment) (view)).J.setTag(s3);
        }
        return ((Fragment) (view)).J;
    }

    final void a(int i1)
    {
        a(i1, 0, 0, false);
    }

    final void a(int i1, int j1, int k1, boolean flag)
    {
        if (o == null && i1 != 0)
        {
            throw new IllegalStateException("No host");
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
                    if (fragment.N != null)
                    {
                        flag1 |= fragment.N.b();
                    }
                }

                if (!flag1)
                {
                    d();
                }
                if (r && o != null && n == 5)
                {
                    o.d();
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
                if (fragment == null)
                {
                    continue;
                }
                fragment.onConfigurationChanged(configuration);
                if (fragment.v != null)
                {
                    fragment.v.a(configuration);
                }
            }

        }
    }

    public final void a(Bundle bundle, String s1, Fragment fragment)
    {
        if (fragment.g < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        bundle.putInt(s1, fragment.g);
    }

    final void a(Parcelable parcelable, List list)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((FragmentManagerState) (parcelable = (FragmentManagerState)parcelable)).a != null)
        {
            if (list != null)
            {
                for (int i1 = 0; i1 < list.size(); i1++)
                {
                    Fragment fragment = (Fragment)list.get(i1);
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: re-attaching retained ")).append(fragment);
                    }
                    FragmentState fragmentstate1 = ((FragmentManagerState) (parcelable)).a[fragment.g];
                    fragmentstate1.k = fragment;
                    fragment.f = null;
                    fragment.s = 0;
                    fragment.q = false;
                    fragment.m = false;
                    fragment.j = null;
                    if (fragmentstate1.j != null)
                    {
                        fragmentstate1.j.setClassLoader(o.c.getClassLoader());
                        fragment.f = fragmentstate1.j.getSparseParcelableArray("android:view_state");
                        fragment.e = fragmentstate1.j;
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
                    Object obj = o;
                    Fragment fragment2 = q;
                    if (fragmentstate.k == null)
                    {
                        Context context = ((q) (obj)).c;
                        if (fragmentstate.i != null)
                        {
                            fragmentstate.i.setClassLoader(context.getClassLoader());
                        }
                        fragmentstate.k = Fragment.a(context, fragmentstate.a, fragmentstate.i);
                        if (fragmentstate.j != null)
                        {
                            fragmentstate.j.setClassLoader(context.getClassLoader());
                            fragmentstate.k.e = fragmentstate.j;
                        }
                        fragmentstate.k.a(fragmentstate.b, fragment2);
                        fragmentstate.k.p = fragmentstate.c;
                        fragmentstate.k.r = true;
                        fragmentstate.k.x = fragmentstate.d;
                        fragmentstate.k.y = fragmentstate.e;
                        fragmentstate.k.z = fragmentstate.f;
                        fragmentstate.k.C = fragmentstate.g;
                        fragmentstate.k.B = fragmentstate.h;
                        fragmentstate.k.t = ((q) (obj)).f;
                        if (a)
                        {
                            (new StringBuilder("Instantiated fragment ")).append(fragmentstate.k);
                        }
                    }
                    obj = fragmentstate.k;
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: active #")).append(j1).append(": ").append(obj);
                    }
                    f.add(obj);
                    fragmentstate.k = null;
                } else
                {
                    f.add(null);
                    if (h == null)
                    {
                        h = new ArrayList();
                    }
                    h.add(Integer.valueOf(j1));
                }
                j1++;
            }
            if (list != null)
            {
                int k1 = 0;
                while (k1 < list.size()) 
                {
                    Fragment fragment1 = (Fragment)list.get(k1);
                    if (fragment1.k >= 0)
                    {
                        if (fragment1.k < f.size())
                        {
                            fragment1.j = (Fragment)f.get(fragment1.k);
                        } else
                        {
                            (new StringBuilder("Re-attaching retained fragment ")).append(fragment1).append(" target no longer exists: ").append(fragment1.k);
                            fragment1.j = null;
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
                    list = (Fragment)f.get(((FragmentManagerState) (parcelable)).b[l1]);
                    if (list == null)
                    {
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(((FragmentManagerState) (parcelable)).b[l1]).toString()))));
                    }
                    list.m = true;
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: added #")).append(l1).append(": ").append(list);
                    }
                    if (g.contains(list))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    g.add(list);
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
                    list = ((FragmentManagerState) (parcelable)).c[i2].a(this);
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: back stack #")).append(i2).append(" (index ").append(((a) (list)).p).append("): ").append(list);
                        list.a("  ", new PrintWriter(new e("FragmentManager")), false);
                    }
                    i.add(list);
                    if (((a) (list)).p >= 0)
                    {
                        a(((a) (list)).p, ((a) (list)));
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

    public final void a(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("remove: ")).append(fragment).append(" nesting=").append(fragment.s);
        }
        int k1;
        if (fragment.s > 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!fragment.B || k1 != 0)
        {
            if (g != null)
            {
                g.remove(fragment);
            }
            if (fragment.E && fragment.F)
            {
                r = true;
            }
            fragment.m = false;
            fragment.n = true;
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
            if (fragment.m)
            {
                l1 = i1;
                if (!fragment.B)
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
        if (fragment.n)
        {
            j2 = l1;
            if (l1 > fragment.b)
            {
                j2 = fragment.b;
            }
        }
        i1 = j2;
        if (fragment.L)
        {
            i1 = j2;
            if (fragment.b < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (fragment.b >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (fragment.p && !fragment.q)
        {
            return;
        }
        if (fragment.c != null)
        {
            fragment.c = null;
            a(fragment, fragment.d, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        fragment.b;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 710
    //                   2 1229
    //                   3 1229
    //                   4 1268;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        fragment.b = i2;
        return;
_L4:
        if (a)
        {
            (new StringBuilder("moveto CREATED: ")).append(fragment);
        }
        k2 = i1;
        if (fragment.e != null)
        {
            fragment.e.setClassLoader(o.c.getClassLoader());
            fragment.f = fragment.e.getSparseParcelableArray("android:view_state");
            fragment.j = a(fragment.e, "android:target_state");
            if (fragment.j != null)
            {
                fragment.l = fragment.e.getInt("android:target_req_state", 0);
            }
            fragment.M = fragment.e.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!fragment.M)
            {
                fragment.L = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        fragment.u = o;
        fragment.w = q;
        Object obj;
        if (q != null)
        {
            obj = q.v;
        } else
        {
            obj = o.f;
        }
        fragment.t = ((s) (obj));
        fragment.G = false;
        fragment.G = true;
        if (fragment.u == null)
        {
            obj = null;
        } else
        {
            obj = fragment.u.b;
        }
        if (obj != null)
        {
            fragment.G = false;
            fragment.G = true;
        }
        if (!fragment.G)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        obj = fragment.w;
        if (!fragment.D)
        {
            Object obj1 = fragment.e;
            if (fragment.v != null)
            {
                fragment.v.s = false;
            }
            fragment.G = false;
            fragment.a(((Bundle) (obj1)));
            if (!fragment.G)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onCreate()").toString());
            }
            if (obj1 != null)
            {
                obj1 = ((Bundle) (obj1)).getParcelable("android:support:fragments");
                if (obj1 != null)
                {
                    if (fragment.v == null)
                    {
                        fragment.k();
                    }
                    fragment.v.a(((Parcelable) (obj1)), ((List) (null)));
                    fragment.v.i();
                }
            }
        }
        fragment.D = false;
        i2 = k2;
        if (fragment.p)
        {
            Object obj2 = fragment.e;
            obj2 = fragment.f();
            Bundle bundle = fragment.e;
            fragment.J = fragment.b(((android.view.LayoutInflater) (obj2)), null);
            if (fragment.J != null)
            {
                fragment.K = fragment.J;
                Object obj3;
                Object obj5;
                Bundle bundle1;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    bt.s(fragment.J);
                } else
                {
                    fragment.J = NoSaveStateFrameLayout.a(fragment.J);
                }
                if (fragment.A)
                {
                    fragment.J.setVisibility(8);
                }
                obj3 = fragment.J;
                obj3 = fragment.e;
                Fragment.i();
                i2 = k2;
            } else
            {
                fragment.K = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (a)
            {
                (new StringBuilder("moveto ACTIVITY_CREATED: ")).append(fragment);
            }
            if (!fragment.p)
            {
                Object obj4;
                if (fragment.y != 0)
                {
                    obj5 = (ViewGroup)p.a(fragment.y);
                    obj4 = obj5;
                    if (obj5 == null)
                    {
                        obj4 = obj5;
                        if (!fragment.r)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.y)).append(" (").append(fragment.a().getResourceName(fragment.y)).append(") for fragment ").append(fragment).toString()))));
                            obj4 = obj5;
                        }
                    }
                } else
                {
                    obj4 = null;
                }
                fragment.I = ((ViewGroup) (obj4));
                obj5 = fragment.e;
                obj5 = fragment.f();
                bundle1 = fragment.e;
                fragment.J = fragment.b(((android.view.LayoutInflater) (obj5)), ((ViewGroup) (obj4)));
                if (fragment.J != null)
                {
                    fragment.K = fragment.J;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        bt.s(fragment.J);
                    } else
                    {
                        fragment.J = NoSaveStateFrameLayout.a(fragment.J);
                    }
                    if (obj4 != null)
                    {
                        obj5 = a(fragment, j1, true, k1);
                        if (obj5 != null)
                        {
                            b(fragment.J, ((Animation) (obj5)));
                            fragment.J.startAnimation(((Animation) (obj5)));
                        }
                        ((ViewGroup) (obj4)).addView(fragment.J);
                    }
                    if (fragment.A)
                    {
                        fragment.J.setVisibility(8);
                    }
                    obj4 = fragment.J;
                    obj4 = fragment.e;
                    Fragment.i();
                } else
                {
                    fragment.K = null;
                }
            }
            obj4 = fragment.e;
            if (fragment.v != null)
            {
                fragment.v.s = false;
            }
            fragment.G = false;
            fragment.b(((Bundle) (obj4)));
            if (!fragment.G)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onActivityCreated()").toString());
            }
            if (fragment.v != null)
            {
                fragment.v.j();
            }
            if (fragment.J != null)
            {
                obj4 = fragment.e;
                if (fragment.f != null)
                {
                    fragment.K.restoreHierarchyState(fragment.f);
                    fragment.f = null;
                }
                fragment.G = false;
                fragment.G = true;
                if (!fragment.G)
                {
                    throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onViewStateRestored()").toString());
                }
            }
            fragment.e = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (a)
            {
                (new StringBuilder("moveto STARTED: ")).append(fragment);
            }
            fragment.l();
            k2 = l2;
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            if (a)
            {
                (new StringBuilder("moveto RESUMED: ")).append(fragment);
            }
            fragment.o = true;
            if (fragment.v != null)
            {
                fragment.v.s = false;
                fragment.v.f();
            }
            fragment.G = false;
            fragment.G = true;
            if (!fragment.G)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onResume()").toString());
            }
            if (fragment.v != null)
            {
                fragment.v.l();
                fragment.v.f();
            }
            fragment.e = null;
            fragment.f = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (fragment.b <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.b;
        JVM INSTR tableswitch 1 5: default 1464
    //                   1 1470
    //                   2 1737
    //                   3 1707
    //                   4 1619
    //                   5 1525;
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
        if (t && fragment.c != null)
        {
            obj4 = fragment.c;
            fragment.c = null;
            ((View) (obj4)).clearAnimation();
        }
        if (fragment.c != null)
        {
            fragment.d = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (a)
            {
                (new StringBuilder("movefrom RESUMED: ")).append(fragment);
            }
            if (fragment.v != null)
            {
                fragment.v.a(4);
            }
            fragment.G = false;
            fragment.G = true;
            if (!fragment.G)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onPause()").toString());
            }
            fragment.o = false;
        }
_L12:
        if (i1 < 4)
        {
            if (a)
            {
                (new StringBuilder("movefrom STARTED: ")).append(fragment);
            }
            if (fragment.v != null)
            {
                fragment.v.m();
            }
            fragment.G = false;
            fragment.G = true;
            if (!fragment.G)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onStop()").toString());
            }
        }
_L11:
        if (i1 < 3)
        {
            if (a)
            {
                (new StringBuilder("movefrom STOPPED: ")).append(fragment);
            }
            fragment.m();
        }
_L10:
        if (i1 < 2)
        {
            if (a)
            {
                (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(fragment);
            }
            if (fragment.J != null && o.b() && fragment.f == null)
            {
                d(fragment);
            }
            if (fragment.v != null)
            {
                fragment.v.a(1);
            }
            fragment.G = false;
            fragment.G = true;
            if (!fragment.G)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDestroyView()").toString());
            }
            if (fragment.N != null)
            {
                fragment.N.f();
            }
            if (fragment.J != null && fragment.I != null)
            {
                if (n > 0 && !t)
                {
                    obj4 = a(fragment, j1, false, k1);
                } else
                {
                    obj4 = null;
                }
                if (obj4 != null)
                {
                    fragment.c = fragment.J;
                    fragment.d = i1;
                    ((Animation) (obj4)).setAnimationListener(new u(this, fragment.J, ((Animation) (obj4)), fragment));
                    fragment.J.startAnimation(((Animation) (obj4)));
                }
                fragment.I.removeView(fragment.J);
            }
            fragment.I = null;
            fragment.J = null;
            fragment.K = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (a)
        {
            (new StringBuilder("movefrom CREATED: ")).append(fragment);
        }
        if (!fragment.D)
        {
            fragment.n();
        }
        fragment.G = false;
        fragment.G = true;
        if (!fragment.G)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!fragment.D)
        {
            i2 = i1;
            if (fragment.g >= 0)
            {
                if (a)
                {
                    (new StringBuilder("Freeing fragment index ")).append(fragment);
                }
                f.set(fragment.g, null);
                if (h == null)
                {
                    h = new ArrayList();
                }
                h.add(Integer.valueOf(fragment.g));
                o.a(fragment.h);
                fragment.g = -1;
                fragment.h = null;
                fragment.m = false;
                fragment.n = false;
                fragment.o = false;
                fragment.p = false;
                fragment.q = false;
                fragment.r = false;
                fragment.s = 0;
                fragment.t = null;
                fragment.v = null;
                fragment.u = null;
                fragment.x = 0;
                fragment.y = 0;
                fragment.z = null;
                fragment.A = false;
                fragment.B = false;
                fragment.D = false;
                fragment.N = null;
                fragment.O = false;
                fragment.P = false;
                i2 = i1;
            }
        } else
        {
            fragment.u = null;
            fragment.w = null;
            fragment.t = null;
            fragment.v = null;
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
            (new StringBuilder("add: ")).append(fragment);
        }
        if (fragment.g < 0)
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
                f.set(fragment.g, fragment);
            }
            if (a)
            {
                (new StringBuilder("Allocated fragment index ")).append(fragment);
            }
        }
        if (!fragment.B)
        {
            if (g.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            g.add(fragment);
            fragment.m = true;
            fragment.n = false;
            if (fragment.E && fragment.F)
            {
                r = true;
            }
            if (flag)
            {
                c(fragment);
            }
        }
    }

    public final void a(q q1, o o1, Fragment fragment)
    {
        if (o != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            o = q1;
            p = o1;
            q = fragment;
            return;
        }
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
                    if (fragment == null)
                    {
                        continue;
                    }
                    printwriter.print(s2);
                    printwriter.print("mFragmentId=#");
                    printwriter.print(Integer.toHexString(fragment.x));
                    printwriter.print(" mContainerId=#");
                    printwriter.print(Integer.toHexString(fragment.y));
                    printwriter.print(" mTag=");
                    printwriter.println(fragment.z);
                    printwriter.print(s2);
                    printwriter.print("mState=");
                    printwriter.print(fragment.b);
                    printwriter.print(" mIndex=");
                    printwriter.print(fragment.g);
                    printwriter.print(" mWho=");
                    printwriter.print(fragment.h);
                    printwriter.print(" mBackStackNesting=");
                    printwriter.println(fragment.s);
                    printwriter.print(s2);
                    printwriter.print("mAdded=");
                    printwriter.print(fragment.m);
                    printwriter.print(" mRemoving=");
                    printwriter.print(fragment.n);
                    printwriter.print(" mResumed=");
                    printwriter.print(fragment.o);
                    printwriter.print(" mFromLayout=");
                    printwriter.print(fragment.p);
                    printwriter.print(" mInLayout=");
                    printwriter.println(fragment.q);
                    printwriter.print(s2);
                    printwriter.print("mHidden=");
                    printwriter.print(fragment.A);
                    printwriter.print(" mDetached=");
                    printwriter.print(fragment.B);
                    printwriter.print(" mMenuVisible=");
                    printwriter.print(fragment.F);
                    printwriter.print(" mHasMenu=");
                    printwriter.println(fragment.E);
                    printwriter.print(s2);
                    printwriter.print("mRetainInstance=");
                    printwriter.print(fragment.C);
                    printwriter.print(" mRetaining=");
                    printwriter.print(fragment.D);
                    printwriter.print(" mUserVisibleHint=");
                    printwriter.println(fragment.M);
                    if (fragment.t != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mFragmentManager=");
                        printwriter.println(fragment.t);
                    }
                    if (fragment.u != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mHost=");
                        printwriter.println(fragment.u);
                    }
                    if (fragment.w != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mParentFragment=");
                        printwriter.println(fragment.w);
                    }
                    if (fragment.i != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mArguments=");
                        printwriter.println(fragment.i);
                    }
                    if (fragment.e != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mSavedFragmentState=");
                        printwriter.println(fragment.e);
                    }
                    if (fragment.f != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mSavedViewState=");
                        printwriter.println(fragment.f);
                    }
                    if (fragment.j != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mTarget=");
                        printwriter.print(fragment.j);
                        printwriter.print(" mTargetRequestCode=");
                        printwriter.println(fragment.l);
                    }
                    if (fragment.H != 0)
                    {
                        printwriter.print(s2);
                        printwriter.print("mNextAnim=");
                        printwriter.println(fragment.H);
                    }
                    if (fragment.I != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mContainer=");
                        printwriter.println(fragment.I);
                    }
                    if (fragment.J != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mView=");
                        printwriter.println(fragment.J);
                    }
                    if (fragment.K != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mInnerView=");
                        printwriter.println(fragment.J);
                    }
                    if (fragment.c != null)
                    {
                        printwriter.print(s2);
                        printwriter.print("mAnimatingAway=");
                        printwriter.println(fragment.c);
                        printwriter.print(s2);
                        printwriter.print("mStateAfterAnimating=");
                        printwriter.println(fragment.d);
                    }
                    if (fragment.N != null)
                    {
                        printwriter.print(s2);
                        printwriter.println("Loader Manager:");
                        fragment.N.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
                    }
                    if (fragment.v != null)
                    {
                        printwriter.print(s2);
                        printwriter.println((new StringBuilder("Child ")).append(fragment.v).append(":").toString());
                        fragment.v.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
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
        break MISSING_BLOCK_LABEL_1557;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        printwriter.print(s1);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s1);
        printwriter.print("  mHost=");
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
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1;
        boolean flag2;
        i1 = 0;
        flag2 = false;
_L5:
        boolean flag3 = flag2;
        if (i1 >= g.size()) goto _L4; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        flag3 = flag2;
        if (fragment != null)
        {
            boolean flag1;
            if (!fragment.A)
            {
                boolean flag;
                if (fragment.E && fragment.F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
                if (fragment.v != null)
                {
                    flag1 = flag | fragment.v.a(menu);
                }
            } else
            {
                flag1 = false;
            }
            flag3 = flag2;
            if (flag1)
            {
                flag3 = true;
            }
        }
        i1++;
        flag2 = flag3;
        if (true) goto _L5; else goto _L4
_L2:
        flag3 = false;
_L4:
        return flag3;
    }

    public final boolean a(Menu menu, MenuInflater menuinflater)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag1;
        flag1 = false;
        arraylist1 = null;
        arraylist = null;
        if (g == null) goto _L2; else goto _L1
_L1:
        int j1;
        boolean flag2;
        j1 = 0;
        flag2 = false;
_L5:
        boolean flag3;
        arraylist1 = arraylist;
        flag3 = flag2;
        if (j1 >= g.size()) goto _L4; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(j1);
        if (fragment != null)
        {
            boolean flag;
            if (!fragment.A)
            {
                int i1;
                if (fragment.E && fragment.F)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                flag = i1;
                if (fragment.v != null)
                {
                    flag = i1 | fragment.v.a(menu, menuinflater);
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList();
                }
                arraylist1.add(fragment);
                flag2 = true;
                arraylist = arraylist1;
            }
        }
        j1++;
        if (true) goto _L5; else goto _L4
_L2:
        flag3 = false;
_L4:
        if (j != null)
        {
            for (i1 = ((flag1) ? 1 : 0); i1 < j.size(); i1++)
            {
                menu = (Fragment)j.get(i1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    Fragment.j();
                }
            }

        }
        j = arraylist1;
        return flag3;
    }

    public final boolean a(MenuItem menuitem)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L8:
        flag1 = flag2;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (!fragment.A && fragment.v != null && fragment.v.a(menuitem))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L5; else goto _L6
_L6:
        flag1 = true;
_L2:
        return flag1;
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b(Fragment fragment)
    {
label0:
        {
            if (fragment.L)
            {
                if (!e)
                {
                    break label0;
                }
                v = true;
            }
            return;
        }
        fragment.L = false;
        a(fragment, n, 0, 0, false);
    }

    public final void b(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("hide: ")).append(fragment);
        }
        if (!fragment.A)
        {
            fragment.A = true;
            if (fragment.J != null)
            {
                Animation animation = a(fragment, i1, false, j1);
                if (animation != null)
                {
                    b(fragment.J, animation);
                    fragment.J.startAnimation(animation);
                }
                fragment.J.setVisibility(8);
            }
            if (fragment.m && fragment.E && fragment.F)
            {
                r = true;
            }
            Fragment.c();
        }
    }

    public final void b(Menu menu)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null && !fragment.A && fragment.v != null)
                {
                    fragment.v.b(menu);
                }
            }

        }
    }

    public final boolean b()
    {
        return f();
    }

    public final boolean b(MenuItem menuitem)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L8:
        flag1 = flag2;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)g.get(i1);
        if (fragment == null) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (!fragment.A && fragment.v != null && fragment.v.b(menuitem))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L5; else goto _L6
_L6:
        flag1 = true;
_L2:
        return flag1;
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void c(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("show: ")).append(fragment);
        }
        if (fragment.A)
        {
            fragment.A = false;
            if (fragment.J != null)
            {
                Animation animation = a(fragment, i1, true, j1);
                if (animation != null)
                {
                    b(fragment.J, animation);
                    fragment.J.startAnimation(animation);
                }
                fragment.J.setVisibility(0);
            }
            if (fragment.m && fragment.E && fragment.F)
            {
                r = true;
            }
            Fragment.c();
        }
    }

    public final boolean c()
    {
        e();
        f();
        int i1;
        if (i != null)
        {
            if ((i1 = i.size() - 1) >= 0)
            {
                a a1 = (a)i.remove(i1);
                SparseArray sparsearray = new SparseArray();
                SparseArray sparsearray1 = new SparseArray();
                a1.a(sparsearray, sparsearray1);
                a1.a(null, sparsearray, sparsearray1);
                g();
                return true;
            }
        }
        return false;
    }

    final void d()
    {
        if (f != null)
        {
            int i1 = 0;
            while (i1 < f.size()) 
            {
                Fragment fragment = (Fragment)f.get(i1);
                if (fragment != null)
                {
                    b(fragment);
                }
                i1++;
            }
        }
    }

    public final void d(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("detach: ")).append(fragment);
        }
        if (!fragment.B)
        {
            fragment.B = true;
            if (fragment.m)
            {
                if (g != null)
                {
                    if (a)
                    {
                        (new StringBuilder("remove from detach: ")).append(fragment);
                    }
                    g.remove(fragment);
                }
                if (fragment.E && fragment.F)
                {
                    r = true;
                }
                fragment.m = false;
                a(fragment, 1, i1, j1, false);
            }
        }
    }

    final void e()
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

    public final void e(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("attach: ")).append(fragment);
        }
        if (fragment.B)
        {
            fragment.B = false;
            if (!fragment.m)
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
                    (new StringBuilder("add from attach: ")).append(fragment);
                }
                g.add(fragment);
                fragment.m = true;
                if (fragment.E && fragment.F)
                {
                    r = true;
                }
                a(fragment, n, i1, j1, false);
            }
        }
    }

    public final boolean f()
    {
        if (e)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != o.d.getLooper())
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
                if (fragment.N != null)
                {
                    l1 = k1 | fragment.N.b();
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
        o.d.removeCallbacks(y);
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
            d();
        }
        return flag;
    }

    final void g()
    {
        if (m != null)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                m.get(i1);
            }

        }
    }

    final Parcelable h()
    {
        FragmentManagerState fragmentmanagerstate = null;
        f();
        if (b)
        {
            s = true;
        }
        if (f != null && f.size() > 0)
        {
            int j2 = f.size();
            FragmentState afragmentstate[] = new FragmentState[j2];
            int k1 = 0;
            boolean flag = false;
            while (k1 < j2) 
            {
                Fragment fragment = (Fragment)f.get(k1);
                if (fragment == null)
                {
                    continue;
                }
                if (fragment.g < 0)
                {
                    a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment).append(" has cleared index: ").append(fragment.g).toString()));
                }
                FragmentState fragmentstate = new FragmentState(fragment);
                afragmentstate[k1] = fragmentstate;
                if (fragment.b > 0 && fragmentstate.j == null)
                {
                    fragmentstate.j = e(fragment);
                    if (fragment.j != null)
                    {
                        if (fragment.j.g < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment).append(" has target not in fragment manager: ").append(fragment.j).toString()));
                        }
                        if (fragmentstate.j == null)
                        {
                            fragmentstate.j = new Bundle();
                        }
                        a(fragmentstate.j, "android:target_state", fragment.j);
                        if (fragment.l != 0)
                        {
                            fragmentstate.j.putInt("android:target_req_state", fragment.l);
                        }
                    }
                } else
                {
                    fragmentstate.j = fragment.e;
                }
                if (a)
                {
                    (new StringBuilder("Saved state of ")).append(fragment).append(": ").append(fragmentstate.j);
                }
                flag = true;
                k1++;
            }
            if (flag)
            {
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
                                ai2[i1] = ((Fragment)g.get(i1)).g;
                                if (ai2[i1] < 0)
                                {
                                    a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(g.get(i1)).append(" has cleared index: ").append(ai2[i1]).toString()));
                                }
                                if (a)
                                {
                                    (new StringBuilder("saveAllState: adding fragment #")).append(i1).append(": ").append(g.get(i1));
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
                            abackstackstate1[j1] = new BackStackState((a)i.get(j1));
                            if (a)
                            {
                                (new StringBuilder("saveAllState: adding back stack #")).append(j1).append(": ").append(i.get(j1));
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
        }
        return null;
    }

    public final void i()
    {
        s = false;
        a(1);
    }

    public final void j()
    {
        s = false;
        a(2);
    }

    public final void k()
    {
        s = false;
        a(4);
    }

    public final void l()
    {
        s = false;
        a(5);
    }

    public final void m()
    {
        s = true;
        a(3);
    }

    public final void n()
    {
        t = true;
        f();
        a(0);
        o = null;
        p = null;
        q = null;
    }

    public final void o()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment == null)
                {
                    continue;
                }
                fragment.onLowMemory();
                if (fragment.v != null)
                {
                    fragment.v.o();
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
            android.support.v4.d.d.a(q, stringbuilder);
        } else
        {
            android.support.v4.d.d.a(o, stringbuilder);
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
