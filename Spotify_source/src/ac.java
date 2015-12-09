// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.support.v4.app.SuperNotCalledException;
import android.util.AttributeSet;
import android.util.Log;
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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ac extends aa
    implements jd
{

    private static Interpolator A = new DecelerateInterpolator(2.5F);
    private static Interpolator B = new DecelerateInterpolator(1.5F);
    public static boolean a = false;
    private static boolean l;
    private static Field t = null;
    public ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    int g;
    z h;
    x i;
    public boolean j;
    String k;
    private ArrayList m;
    private Runnable n[];
    private boolean o;
    private ArrayList p;
    private ArrayList q;
    private ArrayList r;
    private Fragment s;
    private boolean u;
    private boolean v;
    private boolean w;
    private Bundle x;
    private SparseArray y;
    private Runnable z;

    public ac()
    {
        g = 0;
        x = null;
        y = null;
        z = new Runnable() {

            private ac a;

            public final void run()
            {
                a.i();
            }

            
            {
                a = ac.this;
                super();
            }
        };
    }

    private static Animation a(float f1, float f2)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f1, f2);
        alphaanimation.setInterpolator(B);
        alphaanimation.setDuration(220L);
        return alphaanimation;
    }

    private static Animation a(float f1, float f2, float f3, float f4)
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(A);
        ((ScaleAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f3, f4);
        ((AlphaAnimation) (obj)).setInterpolator(B);
        ((AlphaAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation a(Fragment fragment, int i1, boolean flag, int j1)
    {
        int k1;
        k1 = fragment.K;
        Fragment.x();
        if (fragment.K != 0)
        {
            fragment = AnimationUtils.loadAnimation(h.b, fragment.K);
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
                if (h.e())
                {
                    i1 = h.f();
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

    private void a(int i1, o o1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        if (e == null)
        {
            e = new ArrayList();
        }
        k1 = e.size();
        int j1 = k1;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        e.set(i1, o1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        e.add(null);
        if (f == null)
        {
            f = new ArrayList();
        }
        f.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        e.add(o1);
          goto _L4
        o1;
        this;
        JVM INSTR monitorexit ;
        throw o1;
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new hf("FragmentManager"));
        if (h != null)
        {
            try
            {
                h.a("  ", ((PrintWriter) (obj)), new String[0]);
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

    static boolean a(View view, Animation animation)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (km.g(view) != 0) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (!km.y(view)) goto _L2; else goto _L4
_L4:
        if (!(animation instanceof AlphaAnimation)) goto _L6; else goto _L5
_L5:
        int i1 = 1;
_L8:
        flag = flag1;
        if (i1 != 0)
        {
            flag = true;
        }
_L2:
        return flag;
_L6:
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
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void b(View view, Animation animation)
    {
        while (view == null || animation == null || !a(view, animation)) 
        {
            return;
        }
        android.view.animation.Animation.AnimationListener animationlistener;
        try
        {
            if (t == null)
            {
                Field field = android/view/animation/Animation.getDeclaredField("mListener");
                t = field;
                field.setAccessible(true);
            }
            animationlistener = (android.view.animation.Animation.AnimationListener)t.get(animation);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", nosuchfieldexception);
            nosuchfieldexception = null;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", illegalaccessexception);
            illegalaccessexception = null;
        }
        animation.setAnimationListener(new ad(view, animation, animationlistener));
    }

    private void c(Fragment fragment)
    {
        a(fragment, g, 0, 0, false);
    }

    public static int d(int i1)
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

    private void d(Fragment fragment)
    {
        if (fragment.N != null)
        {
            if (y == null)
            {
                y = new SparseArray();
            } else
            {
                y.clear();
            }
            fragment.N.saveHierarchyState(y);
            if (y.size() > 0)
            {
                fragment.h = y;
                y = null;
                return;
            }
        }
    }

    private Bundle e(Fragment fragment)
    {
        if (x == null)
        {
            x = new Bundle();
        }
        fragment.g(x);
        Bundle bundle;
        Bundle bundle1;
        if (!x.isEmpty())
        {
            bundle1 = x;
            x = null;
        } else
        {
            bundle1 = null;
        }
        if (fragment.M != null)
        {
            d(fragment);
        }
        bundle = bundle1;
        if (fragment.h != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.h);
        }
        bundle1 = bundle;
        if (!fragment.P)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", fragment.P);
        }
        return bundle1;
    }

    private void s()
    {
        if (j)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (k != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(k).toString());
        } else
        {
            return;
        }
    }

    public final int a(o o1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (f != null && f.size() > 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (e == null)
        {
            e = new ArrayList();
        }
        i1 = e.size();
        e.add(o1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)f.remove(f.size() - 1)).intValue();
        e.set(i1, o1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        o1;
        this;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final ah a()
    {
        return new o(this);
    }

    public final android.support.v4.app.Fragment.SavedState a(Fragment fragment)
    {
        Object obj = null;
        if (fragment.i < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        android.support.v4.app.Fragment.SavedState savedstate = obj;
        if (fragment.d > 0)
        {
            fragment = e(fragment);
            savedstate = obj;
            if (fragment != null)
            {
                savedstate = new android.support.v4.app.Fragment.SavedState(fragment);
            }
        }
        return savedstate;
    }

    public final Fragment a(int i1)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        int j1 = c.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)c.get(j1);
        if (fragment == null || fragment.z != i1) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        j1 = b.size() - 1;
_L9:
        if (j1 < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)b.get(j1);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (fragment1.z == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final Fragment a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= b.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
            }
            Fragment fragment = (Fragment)b.get(i1);
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
        if (c == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = c.size() - 1;
_L11:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)c.get(i1);
        if (fragment == null || !s1.equals(fragment.B)) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        i1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (b == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = b.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)b.get(i1);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (s1.equals(fragment1.B)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        if (!"fragment".equals(s1))
        {
            return null;
        }
        String s2 = attributeset.getAttributeValue(null, "class");
        s1 = context.obtainStyledAttributes(attributeset, ae.a);
        if (s2 == null)
        {
            s2 = s1.getString(0);
        }
        int k1 = s1.getResourceId(1, -1);
        String s3 = s1.getString(2);
        s1.recycle();
        if (!Fragment.b(h.b, s2))
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
            s1 = a(k1);
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
                s1 = a(i1);
            }
        }
        if (s1 == null)
        {
            view = Fragment.a(context, s2);
            view.r = true;
            int j1;
            if (k1 != 0)
            {
                j1 = k1;
            } else
            {
                j1 = i1;
            }
            view.z = j1;
            view.A = i1;
            view.B = s3;
            view.s = true;
            view.v = this;
            view.w = h;
            s1 = ((Fragment) (view)).g;
            view.w();
            a(((Fragment) (view)), true);
        } else
        {
            if (((Fragment) (s1)).s)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k1)).append(", tag ").append(s3).append(", or parent id 0x").append(Integer.toHexString(i1)).append(" with another fragment for ").append(s2).toString());
            }
            s1.s = true;
            if (!((Fragment) (s1)).F)
            {
                view = ((Fragment) (s1)).g;
                s1.w();
            }
            view = s1;
        }
        if (g <= 0 && ((Fragment) (view)).r)
        {
            a(((Fragment) (view)), 1, 0, 0, false);
        } else
        {
            c(view);
        }
        if (((Fragment) (view)).M == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(s2).append(" did not create a view.").toString());
        }
        if (k1 != 0)
        {
            ((Fragment) (view)).M.setId(k1);
        }
        if (((Fragment) (view)).M.getTag() == null)
        {
            ((Fragment) (view)).M.setTag(s3);
        }
        return ((Fragment) (view)).M;
    }

    final void a(int i1, int j1, int k1, boolean flag)
    {
        if (h == null && i1 != 0)
        {
            throw new IllegalStateException("No host");
        }
        if (flag || g != i1)
        {
            g = i1;
            if (b != null)
            {
                int l1 = 0;
                boolean flag1 = false;
                for (; l1 < b.size(); l1++)
                {
                    Fragment fragment = (Fragment)b.get(l1);
                    if (fragment == null)
                    {
                        continue;
                    }
                    a(fragment, i1, j1, k1, false);
                    if (fragment.Q != null)
                    {
                        flag1 |= fragment.Q.a();
                    }
                }

                if (!flag1)
                {
                    h();
                }
                if (u && h != null && g == 5)
                {
                    h.d();
                    u = false;
                    return;
                }
            }
        }
    }

    public final void a(ab ab1)
    {
        if (r == null)
        {
            r = new ArrayList();
        }
        r.add(ab1);
    }

    public final void a(Configuration configuration)
    {
        if (c != null)
        {
            for (int i1 = 0; i1 < c.size(); i1++)
            {
                Fragment fragment = (Fragment)c.get(i1);
                if (fragment == null)
                {
                    continue;
                }
                fragment.onConfigurationChanged(configuration);
                if (fragment.x != null)
                {
                    fragment.x.a(configuration);
                }
            }

        }
    }

    public final void a(Bundle bundle, String s1, Fragment fragment)
    {
        if (fragment.i < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        bundle.putInt(s1, fragment.i);
    }

    final void a(Parcelable parcelable, List list)
    {
        boolean flag = false;
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        FragmentManagerState fragmentmanagerstate;
        return;
_L2:
        if ((fragmentmanagerstate = (FragmentManagerState)parcelable).a != null)
        {
            if (list != null)
            {
                for (int i1 = 0; i1 < list.size(); i1++)
                {
                    parcelable = (Fragment)list.get(i1);
                    FragmentState fragmentstate = fragmentmanagerstate.a[((Fragment) (parcelable)).i];
                    fragmentstate.k = parcelable;
                    parcelable.h = null;
                    parcelable.u = 0;
                    parcelable.s = false;
                    parcelable.o = false;
                    parcelable.l = null;
                    if (fragmentstate.j != null)
                    {
                        fragmentstate.j.setClassLoader(h.b.getClassLoader());
                        parcelable.h = fragmentstate.j.getSparseParcelableArray("android:view_state");
                        parcelable.g = fragmentstate.j;
                    }
                }

            }
            b = new ArrayList(fragmentmanagerstate.a.length);
            if (p != null)
            {
                p.clear();
            }
            int j1 = 0;
            while (j1 < fragmentmanagerstate.a.length) 
            {
                FragmentState fragmentstate1 = fragmentmanagerstate.a[j1];
                if (fragmentstate1 != null)
                {
                    parcelable = h;
                    Fragment fragment = s;
                    if (fragmentstate1.k != null)
                    {
                        parcelable = fragmentstate1.k;
                    } else
                    {
                        Context context = ((z) (parcelable)).b;
                        if (fragmentstate1.i != null)
                        {
                            fragmentstate1.i.setClassLoader(context.getClassLoader());
                        }
                        fragmentstate1.k = Fragment.a(context, fragmentstate1.a, fragmentstate1.i);
                        if (fragmentstate1.j != null)
                        {
                            fragmentstate1.j.setClassLoader(context.getClassLoader());
                            fragmentstate1.k.g = fragmentstate1.j;
                        }
                        fragmentstate1.k.a(fragmentstate1.b, fragment);
                        fragmentstate1.k.r = fragmentstate1.c;
                        fragmentstate1.k.t = true;
                        fragmentstate1.k.z = fragmentstate1.d;
                        fragmentstate1.k.A = fragmentstate1.e;
                        fragmentstate1.k.B = fragmentstate1.f;
                        fragmentstate1.k.E = fragmentstate1.g;
                        fragmentstate1.k.D = fragmentstate1.h;
                        fragmentstate1.k.v = ((z) (parcelable)).d;
                        parcelable = fragmentstate1.k;
                    }
                    b.add(parcelable);
                    fragmentstate1.k = null;
                } else
                {
                    b.add(null);
                    if (p == null)
                    {
                        p = new ArrayList();
                    }
                    p.add(Integer.valueOf(j1));
                }
                j1++;
            }
            if (list != null)
            {
                int k1 = 0;
                while (k1 < list.size()) 
                {
                    parcelable = (Fragment)list.get(k1);
                    if (((Fragment) (parcelable)).m >= 0)
                    {
                        if (((Fragment) (parcelable)).m < b.size())
                        {
                            parcelable.l = (Fragment)b.get(((Fragment) (parcelable)).m);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(parcelable).append(" target no longer exists: ").append(((Fragment) (parcelable)).m).toString());
                            parcelable.l = null;
                        }
                    }
                    k1++;
                }
            }
            if (fragmentmanagerstate.b != null)
            {
                c = new ArrayList(fragmentmanagerstate.b.length);
                for (int l1 = 0; l1 < fragmentmanagerstate.b.length; l1++)
                {
                    parcelable = (Fragment)b.get(fragmentmanagerstate.b[l1]);
                    if (parcelable == null)
                    {
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(fragmentmanagerstate.b[l1]).toString()))));
                    }
                    parcelable.o = true;
                    if (c.contains(parcelable))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    c.add(parcelable);
                }

            } else
            {
                c = null;
            }
            if (fragmentmanagerstate.c != null)
            {
                d = new ArrayList(fragmentmanagerstate.c.length);
                int i2 = ((flag) ? 1 : 0);
                while (i2 < fragmentmanagerstate.c.length) 
                {
                    parcelable = fragmentmanagerstate.c[i2].a(this);
                    d.add(parcelable);
                    if (((o) (parcelable)).g >= 0)
                    {
                        a(((o) (parcelable)).g, ((o) (parcelable)));
                    }
                    i2++;
                }
            } else
            {
                d = null;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(Fragment fragment, int i1, int j1)
    {
        int k1;
        if (fragment.u > 0)
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
        if (!fragment.D || k1 != 0)
        {
            if (c != null)
            {
                c.remove(fragment);
            }
            if (fragment.H && fragment.I)
            {
                u = true;
            }
            fragment.o = false;
            fragment.p = true;
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
            if (fragment.o)
            {
                l1 = i1;
                if (!fragment.D)
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
        if (fragment.p)
        {
            j2 = l1;
            if (l1 > fragment.d)
            {
                j2 = fragment.d;
            }
        }
        i1 = j2;
        if (fragment.O)
        {
            i1 = j2;
            if (fragment.d < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (fragment.d >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (fragment.r && !fragment.s)
        {
            return;
        }
        if (fragment.e != null)
        {
            fragment.e = null;
            a(fragment, fragment.f, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        fragment.d;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 647
    //                   2 1134
    //                   3 1134
    //                   4 1250;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        fragment.d = i2;
        return;
_L4:
        k2 = i1;
        if (fragment.g != null)
        {
            fragment.g.setClassLoader(h.b.getClassLoader());
            fragment.h = fragment.g.getSparseParcelableArray("android:view_state");
            fragment.l = a(fragment.g, "android:target_state");
            if (fragment.l != null)
            {
                fragment.n = fragment.g.getInt("android:target_req_state", 0);
            }
            fragment.P = fragment.g.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!fragment.P)
            {
                fragment.O = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        fragment.w = h;
        fragment.y = s;
        Object obj;
        if (s != null)
        {
            obj = s.x;
        } else
        {
            obj = h.d;
        }
        fragment.v = ((ac) (obj));
        fragment.J = false;
        fragment.a(h.b);
        if (!fragment.J)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        obj = fragment.y;
        if (!fragment.F)
        {
            Object obj1 = fragment.g;
            if (fragment.x != null)
            {
                fragment.x.j = false;
            }
            fragment.J = false;
            fragment.a(((Bundle) (obj1)));
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onCreate()").toString());
            }
            if (obj1 != null)
            {
                obj1 = ((Bundle) (obj1)).getParcelable("android:support:fragments");
                if (obj1 != null)
                {
                    if (fragment.x == null)
                    {
                        fragment.D();
                    }
                    fragment.x.a(((Parcelable) (obj1)), ((List) (null)));
                    fragment.x.l();
                }
            }
        }
        fragment.F = false;
        i2 = k2;
        if (fragment.r)
        {
            fragment.M = fragment.b(fragment.b(fragment.g), null, fragment.g);
            if (fragment.M != null)
            {
                fragment.N = fragment.M;
                Object obj3;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    km.w(fragment.M);
                } else
                {
                    fragment.M = au.a(fragment.M);
                }
                if (fragment.C)
                {
                    fragment.M.setVisibility(8);
                }
                fragment.a(fragment.M, fragment.g);
                i2 = k2;
            } else
            {
                fragment.N = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (!fragment.r)
            {
                Object obj2;
                if (fragment.A != 0)
                {
                    obj3 = (ViewGroup)i.a(fragment.A);
                    obj2 = obj3;
                    if (obj3 == null)
                    {
                        obj2 = obj3;
                        if (!fragment.t)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.A)).append(" (").append(fragment.l().getResourceName(fragment.A)).append(") for fragment ").append(fragment).toString()))));
                            obj2 = obj3;
                        }
                    }
                } else
                {
                    obj2 = null;
                }
                fragment.L = ((ViewGroup) (obj2));
                fragment.M = fragment.b(fragment.b(fragment.g), ((ViewGroup) (obj2)), fragment.g);
                if (fragment.M != null)
                {
                    fragment.N = fragment.M;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        km.w(fragment.M);
                    } else
                    {
                        fragment.M = au.a(fragment.M);
                    }
                    if (obj2 != null)
                    {
                        obj3 = a(fragment, j1, true, k1);
                        if (obj3 != null)
                        {
                            b(fragment.M, ((Animation) (obj3)));
                            fragment.M.startAnimation(((Animation) (obj3)));
                        }
                        ((ViewGroup) (obj2)).addView(fragment.M);
                    }
                    if (fragment.C)
                    {
                        fragment.M.setVisibility(8);
                    }
                    fragment.a(fragment.M, fragment.g);
                } else
                {
                    fragment.N = null;
                }
            }
            obj2 = fragment.g;
            if (fragment.x != null)
            {
                fragment.x.j = false;
            }
            fragment.J = false;
            fragment.d(((Bundle) (obj2)));
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onActivityCreated()").toString());
            }
            if (fragment.x != null)
            {
                fragment.x.m();
            }
            if (fragment.M != null)
            {
                obj2 = fragment.g;
                if (fragment.h != null)
                {
                    fragment.N.restoreHierarchyState(fragment.h);
                    fragment.h = null;
                }
                fragment.J = false;
                fragment.J = true;
                if (!fragment.J)
                {
                    throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onViewStateRestored()").toString());
                }
            }
            fragment.g = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (fragment.x != null)
            {
                fragment.x.j = false;
                fragment.x.i();
            }
            fragment.J = false;
            fragment.c();
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onStart()").toString());
            }
            if (fragment.x != null)
            {
                fragment.x.n();
            }
            k2 = l2;
            if (fragment.Q != null)
            {
                fragment.Q.f();
                k2 = l2;
            }
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            fragment.q = true;
            if (fragment.x != null)
            {
                fragment.x.j = false;
                fragment.x.i();
            }
            fragment.J = false;
            fragment.z();
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onResume()").toString());
            }
            if (fragment.x != null)
            {
                fragment.x.o();
                fragment.x.i();
            }
            fragment.g = null;
            fragment.h = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (fragment.d <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.d;
        JVM INSTR tableswitch 1 5: default 1424
    //                   1 1430
    //                   2 1632
    //                   3 1623
    //                   4 1557
    //                   5 1485;
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
        if (v && fragment.e != null)
        {
            obj2 = fragment.e;
            fragment.e = null;
            ((View) (obj2)).clearAnimation();
        }
        if (fragment.e != null)
        {
            fragment.f = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (fragment.x != null)
            {
                fragment.x.c(4);
            }
            fragment.J = false;
            fragment.A();
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onPause()").toString());
            }
            fragment.q = false;
        }
_L12:
        if (i1 < 4)
        {
            if (fragment.x != null)
            {
                fragment.x.p();
            }
            fragment.J = false;
            fragment.d();
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onStop()").toString());
            }
        }
_L11:
        if (i1 < 3)
        {
            fragment.E();
        }
_L10:
        if (i1 < 2)
        {
            if (fragment.M != null && h.b() && fragment.h == null)
            {
                d(fragment);
            }
            if (fragment.x != null)
            {
                fragment.x.c(1);
            }
            fragment.J = false;
            fragment.e();
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDestroyView()").toString());
            }
            if (fragment.Q != null)
            {
                fragment.Q.e();
            }
            if (fragment.M != null && fragment.L != null)
            {
                if (g > 0 && !v)
                {
                    obj2 = a(fragment, j1, false, k1);
                } else
                {
                    obj2 = null;
                }
                if (obj2 != null)
                {
                    fragment.e = fragment.M;
                    fragment.f = i1;
                    ((Animation) (obj2)).setAnimationListener(new ad(fragment.M, ((Animation) (obj2)), fragment) {

                        private Fragment a;
                        private ac b;

                        public final void onAnimationEnd(Animation animation)
                        {
                            super.onAnimationEnd(animation);
                            if (a.e != null)
                            {
                                a.e = null;
                                b.a(a, a.f, 0, 0, false);
                            }
                        }

            
            {
                b = ac.this;
                a = fragment;
                super(view, animation);
            }
                    });
                    fragment.M.startAnimation(((Animation) (obj2)));
                }
                fragment.L.removeView(fragment.M);
            }
            fragment.L = null;
            fragment.M = null;
            fragment.N = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (!fragment.F)
        {
            if (fragment.x != null)
            {
                fragment.x.q();
            }
            fragment.J = false;
            fragment.B();
            if (!fragment.J)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDestroy()").toString());
            }
        }
        fragment.J = false;
        fragment.t_();
        if (!fragment.J)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!fragment.F)
        {
            i2 = i1;
            if (fragment.i >= 0)
            {
                b.set(fragment.i, null);
                if (p == null)
                {
                    p = new ArrayList();
                }
                p.add(Integer.valueOf(fragment.i));
                h.a(fragment.j);
                fragment.i = -1;
                fragment.j = null;
                fragment.o = false;
                fragment.p = false;
                fragment.q = false;
                fragment.r = false;
                fragment.s = false;
                fragment.t = false;
                fragment.u = 0;
                fragment.v = null;
                fragment.x = null;
                fragment.w = null;
                fragment.z = 0;
                fragment.A = 0;
                fragment.B = null;
                fragment.C = false;
                fragment.D = false;
                fragment.F = false;
                fragment.Q = null;
                fragment.R = false;
                fragment.S = false;
                i2 = i1;
            }
        } else
        {
            fragment.w = null;
            fragment.y = null;
            fragment.v = null;
            fragment.x = null;
            i2 = i1;
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void a(Fragment fragment, boolean flag)
    {
        if (c == null)
        {
            c = new ArrayList();
        }
        if (fragment.i < 0)
        {
            if (p == null || p.size() <= 0)
            {
                if (b == null)
                {
                    b = new ArrayList();
                }
                fragment.a(b.size(), s);
                b.add(fragment);
            } else
            {
                fragment.a(((Integer)p.remove(p.size() - 1)).intValue(), s);
                b.set(fragment.i, fragment);
            }
        }
        if (!fragment.D)
        {
            if (c.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            c.add(fragment);
            fragment.o = true;
            fragment.p = false;
            if (fragment.H && fragment.I)
            {
                u = true;
            }
            if (flag)
            {
                c(fragment);
            }
        }
    }

    public final void a(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            s();
        }
        this;
        JVM INSTR monitorenter ;
        if (v || h == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (m == null)
        {
            m = new ArrayList();
        }
        m.add(runnable);
        if (m.size() == 1)
        {
            h.c.removeCallbacks(z);
            h.c.post(z);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        flag = false;
        String s2 = (new StringBuilder()).append(s1).append("    ").toString();
        if (b != null)
        {
            int k2 = b.size();
            if (k2 > 0)
            {
                printwriter.print(s1);
                printwriter.print("Active Fragments in ");
                printwriter.print(Integer.toHexString(System.identityHashCode(this)));
                printwriter.println(":");
                for (int i1 = 0; i1 < k2; i1++)
                {
                    Fragment fragment = (Fragment)b.get(i1);
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
        if (c != null)
        {
            int l2 = c.size();
            if (l2 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Added Fragments:");
                for (int j1 = 0; j1 < l2; j1++)
                {
                    filedescriptor = (Fragment)c.get(j1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (q != null)
        {
            int i3 = q.size();
            if (i3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Fragments Created Menus:");
                for (int k1 = 0; k1 < i3; k1++)
                {
                    filedescriptor = (Fragment)q.get(k1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (d != null)
        {
            int j3 = d.size();
            if (j3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Back Stack:");
                for (int l1 = 0; l1 < j3; l1++)
                {
                    filedescriptor = (o)d.get(l1);
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
        if (e == null) goto _L2; else goto _L1
_L1:
        int k3 = e.size();
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
        filedescriptor = (o)e.get(i2);
        printwriter.print(s1);
        printwriter.print("  #");
        printwriter.print(i2);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i2++;
        if (true) goto _L4; else goto _L2
_L2:
        if (f != null && f.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(f.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (m != null)
        {
            int l3 = m.size();
            if (l3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Pending Actions:");
                for (int j2 = ((flag) ? 1 : 0); j2 < l3; j2++)
                {
                    filedescriptor = (Runnable)m.get(j2);
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
        this;
        JVM INSTR monitorexit ;
        throw s1;
        printwriter.print(s1);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s1);
        printwriter.print("  mHost=");
        printwriter.println(h);
        printwriter.print(s1);
        printwriter.print("  mContainer=");
        printwriter.println(i);
        if (s != null)
        {
            printwriter.print(s1);
            printwriter.print("  mParent=");
            printwriter.println(s);
        }
        printwriter.print(s1);
        printwriter.print("  mCurState=");
        printwriter.print(g);
        printwriter.print(" mStateSaved=");
        printwriter.print(j);
        printwriter.print(" mDestroyed=");
        printwriter.println(v);
        if (u)
        {
            printwriter.print(s1);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(u);
        }
        if (k != null)
        {
            printwriter.print(s1);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(k);
        }
        if (p != null && p.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(p.toArray()));
        }
        return;
    }

    public final void a(z z1, x x1, Fragment fragment)
    {
        if (h != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            h = z1;
            i = x1;
            s = fragment;
            return;
        }
    }

    final boolean a(int i1, int j1)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i1 >= 0 || (j1 & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i1 = d.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        o o1 = (o)d.remove(i1);
        SparseArray sparsearray = new SparseArray();
        SparseArray sparsearray1 = new SparseArray();
        o1.a(sparsearray, sparsearray1);
        o1.a(true, null, sparsearray, sparsearray1);
_L8:
        j();
        return true;
_L4:
        int k1;
        int l1;
        k1 = -1;
        if (i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = d.size() - 1;
        do
        {
            if (l1 < 0)
            {
                break;
            }
            o o2 = (o)d.get(l1);
            if (i1 >= 0 && i1 == o2.g)
            {
                break;
            }
            l1--;
        } while (true);
        if (l1 < 0) goto _L1; else goto _L6
_L6:
        k1 = l1;
        if ((j1 & 1) != 0)
        {
            j1 = l1 - 1;
            do
            {
                k1 = j1;
                if (j1 < 0)
                {
                    break;
                }
                o o3 = (o)d.get(j1);
                k1 = j1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = j1;
                if (i1 != o3.g)
                {
                    break;
                }
                j1--;
            } while (true);
        }
        if (k1 == d.size() - 1) goto _L1; else goto _L7
_L7:
        ArrayList arraylist = new ArrayList();
        for (i1 = d.size() - 1; i1 > k1; i1--)
        {
            arraylist.add(d.remove(i1));
        }

        j1 = arraylist.size() - 1;
        SparseArray sparsearray2 = new SparseArray();
        SparseArray sparsearray3 = new SparseArray();
        for (i1 = 0; i1 <= j1; i1++)
        {
            ((o)arraylist.get(i1)).a(sparsearray2, sparsearray3);
        }

        q q1 = null;
        i1 = 0;
        while (i1 <= j1) 
        {
            o o4 = (o)arraylist.get(i1);
            boolean flag;
            if (i1 == j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q1 = o4.a(flag, q1, sparsearray2, sparsearray3);
            i1++;
        }
          goto _L8
    }

    public final boolean a(Menu menu)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1;
        boolean flag2;
        i1 = 0;
        flag2 = false;
_L5:
        boolean flag3 = flag2;
        if (i1 >= c.size()) goto _L4; else goto _L3
_L3:
        Fragment fragment = (Fragment)c.get(i1);
        flag3 = flag2;
        if (fragment != null)
        {
            boolean flag1;
            if (!fragment.C)
            {
                boolean flag;
                if (fragment.H && fragment.I)
                {
                    fragment.a(menu);
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
                if (fragment.x != null)
                {
                    flag1 = flag | fragment.x.a(menu);
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
        if (c == null) goto _L2; else goto _L1
_L1:
        int j1;
        boolean flag2;
        j1 = 0;
        flag2 = false;
_L5:
        boolean flag3;
        arraylist1 = arraylist;
        flag3 = flag2;
        if (j1 >= c.size()) goto _L4; else goto _L3
_L3:
        Fragment fragment = (Fragment)c.get(j1);
        if (fragment != null)
        {
            boolean flag;
            if (!fragment.C)
            {
                int i1;
                if (fragment.H && fragment.I)
                {
                    fragment.a(menu, menuinflater);
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                flag = i1;
                if (fragment.x != null)
                {
                    flag = i1 | fragment.x.a(menu, menuinflater);
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
        if (q != null)
        {
            for (i1 = ((flag1) ? 1 : 0); i1 < q.size(); i1++)
            {
                menu = (Fragment)q.get(i1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    Fragment.C();
                }
            }

        }
        q = arraylist1;
        return flag3;
    }

    public final boolean a(MenuItem menuitem)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L8:
        flag1 = flag2;
        if (i1 >= c.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)c.get(i1);
        if (fragment == null) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (!fragment.C && fragment.x != null && fragment.x.a(menuitem))
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

    public final void b(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i1).toString());
        } else
        {
            a(new Runnable(i1) {

                private int a;
                private int b;
                private ac c;

                public final void run()
                {
                    ac ac1 = c;
                    z z1 = c.h;
                    ac1.a(a, b);
                }

            
            {
                c = ac.this;
                a = i1;
                b = 1;
                super();
            }
            }, false);
            return;
        }
    }

    public final void b(Fragment fragment)
    {
label0:
        {
            if (fragment.O)
            {
                if (!o)
                {
                    break label0;
                }
                w = true;
            }
            return;
        }
        fragment.O = false;
        a(fragment, g, 0, 0, false);
    }

    public final void b(Fragment fragment, int i1, int j1)
    {
        if (!fragment.C)
        {
            fragment.C = true;
            if (fragment.M != null)
            {
                Animation animation = a(fragment, i1, false, j1);
                if (animation != null)
                {
                    b(fragment.M, animation);
                    fragment.M.startAnimation(animation);
                }
                fragment.M.setVisibility(8);
            }
            if (fragment.o && fragment.H && fragment.I)
            {
                u = true;
            }
            Fragment.r();
        }
    }

    public final void b(Menu menu)
    {
        if (c != null)
        {
            for (int i1 = 0; i1 < c.size(); i1++)
            {
                Fragment fragment = (Fragment)c.get(i1);
                if (fragment != null && !fragment.C && fragment.x != null)
                {
                    fragment.x.b(menu);
                }
            }

        }
    }

    public final boolean b()
    {
        return i();
    }

    public final boolean b(MenuItem menuitem)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L8:
        flag1 = flag2;
        if (i1 >= c.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)c.get(i1);
        if (fragment == null) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (!fragment.C && fragment.x != null && fragment.x.b(menuitem))
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

    public final void c()
    {
        a(new Runnable() {

            private ac a;

            public final void run()
            {
                ac ac1 = a;
                z z1 = a.h;
                ac1.a(-1, 0);
            }

            
            {
                a = ac.this;
                super();
            }
        }, false);
    }

    public final void c(int i1)
    {
        a(i1, 0, 0, false);
    }

    public final void c(Fragment fragment, int i1, int j1)
    {
        if (fragment.C)
        {
            fragment.C = false;
            if (fragment.M != null)
            {
                Animation animation = a(fragment, i1, true, j1);
                if (animation != null)
                {
                    b(fragment.M, animation);
                    fragment.M.startAnimation(animation);
                }
                fragment.M.setVisibility(0);
            }
            if (fragment.o && fragment.H && fragment.I)
            {
                u = true;
            }
            Fragment.r();
        }
    }

    public final void d(Fragment fragment, int i1, int j1)
    {
        if (!fragment.D)
        {
            fragment.D = true;
            if (fragment.o)
            {
                if (c != null)
                {
                    c.remove(fragment);
                }
                if (fragment.H && fragment.I)
                {
                    u = true;
                }
                fragment.o = false;
                a(fragment, 1, i1, j1, false);
            }
        }
    }

    public final boolean d()
    {
        s();
        i();
        return a(-1, 0);
    }

    public final void e(Fragment fragment, int i1, int j1)
    {
        if (fragment.D)
        {
            fragment.D = false;
            if (!fragment.o)
            {
                if (c == null)
                {
                    c = new ArrayList();
                }
                if (c.contains(fragment))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
                }
                c.add(fragment);
                fragment.o = true;
                if (fragment.H && fragment.I)
                {
                    u = true;
                }
                a(fragment, g, i1, j1, false);
            }
        }
    }

    public final boolean e()
    {
        s();
        i();
        return a(-1, 1);
    }

    public final List f()
    {
        return b;
    }

    public final boolean g()
    {
        return v;
    }

    final void h()
    {
        if (b != null)
        {
            int i1 = 0;
            while (i1 < b.size()) 
            {
                Fragment fragment = (Fragment)b.get(i1);
                if (fragment != null)
                {
                    b(fragment);
                }
                i1++;
            }
        }
    }

    public final boolean i()
    {
        if (o)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != h.c.getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (m != null && m.size() != 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        this;
        JVM INSTR monitorexit ;
        int k1;
        if (!w)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        int i1 = 0;
        int l1;
        for (k1 = 0; i1 < b.size(); k1 = l1)
        {
            Fragment fragment = (Fragment)b.get(i1);
            l1 = k1;
            if (fragment != null)
            {
                l1 = k1;
                if (fragment.Q != null)
                {
                    l1 = k1 | fragment.Q.a();
                }
            }
            i1++;
        }

        break; /* Loop/switch isn't completed */
        k1 = m.size();
        if (n == null || n.length < k1)
        {
            n = new Runnable[k1];
        }
        m.toArray(n);
        m.clear();
        h.c.removeCallbacks(z);
        this;
        JVM INSTR monitorexit ;
        o = true;
        for (int j1 = 0; j1 < k1; j1++)
        {
            n[j1].run();
            n[j1] = null;
        }

        break MISSING_BLOCK_LABEL_250;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        o = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 0)
        {
            w = false;
            h();
        }
        return flag;
    }

    final void j()
    {
        if (r != null)
        {
            for (int i1 = 0; i1 < r.size(); i1++)
            {
                ((ab)r.get(i1)).a();
            }

        }
    }

    public final Parcelable k()
    {
        FragmentManagerState fragmentmanagerstate;
        fragmentmanagerstate = null;
        i();
        if (l)
        {
            j = true;
        }
        if (b != null && b.size() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        FragmentState afragmentstate[];
        boolean flag;
        int k1;
        int j2;
        j2 = b.size();
        afragmentstate = new FragmentState[j2];
        k1 = 0;
        flag = false;
_L4:
        Fragment fragment;
        FragmentState fragmentstate;
        if (k1 >= j2)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = (Fragment)b.get(k1);
        if (fragment != null)
        {
            if (fragment.i < 0)
            {
                a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment).append(" has cleared index: ").append(fragment.i).toString()));
            }
            fragmentstate = new FragmentState(fragment);
            afragmentstate[k1] = fragmentstate;
            if (fragment.d <= 0 || fragmentstate.j != null)
            {
                break; /* Loop/switch isn't completed */
            }
            fragmentstate.j = e(fragment);
            if (fragment.l == null)
            {
                break MISSING_BLOCK_LABEL_301;
            }
            if (fragment.l.i < 0)
            {
                a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment).append(" has target not in fragment manager: ").append(fragment.l).toString()));
            }
            if (fragmentstate.j == null)
            {
                fragmentstate.j = new Bundle();
            }
            a(fragmentstate.j, "android:target_state", fragment.l);
            if (fragment.n == 0)
            {
                break MISSING_BLOCK_LABEL_301;
            }
            fragmentstate.j.putInt("android:target_req_state", fragment.n);
            flag = true;
        }
_L5:
        k1++;
        if (true) goto _L4; else goto _L3
_L3:
        fragmentstate.j = fragment.g;
        flag = true;
          goto _L5
        if (!flag) goto _L1; else goto _L6
_L6:
        int ai[];
label0:
        {
            if (c != null)
            {
                int l1 = c.size();
                if (l1 > 0)
                {
                    int ai1[] = new int[l1];
                    int i1 = 0;
                    do
                    {
                        ai = ai1;
                        if (i1 >= l1)
                        {
                            break;
                        }
                        ai1[i1] = ((Fragment)c.get(i1)).i;
                        if (ai1[i1] < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(c.get(i1)).append(" has cleared index: ").append(ai1[i1]).toString()));
                        }
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            ai = null;
        }
        BackStackState abackstackstate[] = fragmentmanagerstate;
        if (d != null)
        {
            int i2 = d.size();
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
                    abackstackstate1[j1] = new BackStackState((o)d.get(j1));
                    j1++;
                } while (true);
            }
        }
        abackstackstate1 = new FragmentManagerState();
        abackstackstate1.a = afragmentstate;
        abackstackstate1.b = ai;
        abackstackstate1.c = abackstackstate;
        return abackstackstate1;
    }

    public final void l()
    {
        j = false;
        c(1);
    }

    public final void m()
    {
        j = false;
        c(2);
    }

    public final void n()
    {
        j = false;
        c(4);
    }

    public final void o()
    {
        j = false;
        c(5);
    }

    public final void p()
    {
        j = true;
        c(3);
    }

    public final void q()
    {
        v = true;
        i();
        c(0);
        h = null;
        i = null;
        s = null;
    }

    public final void r()
    {
        if (c != null)
        {
            for (int i1 = 0; i1 < c.size(); i1++)
            {
                Fragment fragment = (Fragment)c.get(i1);
                if (fragment == null)
                {
                    continue;
                }
                fragment.onLowMemory();
                if (fragment.x != null)
                {
                    fragment.x.r();
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
        if (s != null)
        {
            he.a(s, stringbuilder);
        } else
        {
            he.a(h, stringbuilder);
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
        l = flag;
        new AccelerateInterpolator(2.5F);
        new AccelerateInterpolator(1.5F);
    }
}
