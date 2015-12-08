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
import android.support.v4.util.c;
import android.support.v4.util.d;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.x;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            l, Fragment, k, e, 
//            s, FragmentManagerState, FragmentState, BackStackState, 
//            ai, i, u, o

final class m extends l
    implements LayoutInflaterFactory
{
    static class a
        implements android.view.animation.Animation.AnimationListener
    {

        private boolean a;
        private View b;

        static View a(a a1)
        {
            return a1.b;
        }

        public void onAnimationEnd(Animation animation)
        {
            if (a)
            {
                b.post(new Runnable(this) {

                    final a a;

                    public final void run()
                    {
                        android.support.v4.view.x.a(a.a(a), 0, null);
                    }

            
            {
                a = a1;
                super();
            }
                });
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            a = m.a(b, animation);
            if (a)
            {
                b.post(new Runnable(this) {

                    final a a;

                    public final void run()
                    {
                        android.support.v4.view.x.a(a.a(a), 2, null);
                    }

            
            {
                a = a1;
                super();
            }
                });
            }
        }

        public a(View view, Animation animation)
        {
            a = false;
            if (view == null || animation == null)
            {
                return;
            } else
            {
                b = view;
                return;
            }
        }
    }

    static final class b
    {

        public static final int a[] = {
            0x1010003, 0x10100d0, 0x10100d1
        };

    }


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
    k o;
    i p;
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
        y = new Runnable() {

            final m a;

            public final void run()
            {
                a.i();
            }

            
            {
                a = m.this;
                super();
            }
        };
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
        Animation animation = fragment.onCreateAnimation(i1, flag, fragment.mNextAnim);
        if (animation != null)
        {
            return animation;
        }
        if (fragment.mNextAnim != 0)
        {
            fragment = AnimationUtils.loadAnimation(o.b, fragment.mNextAnim);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (i1 == 0)
        {
            return null;
        }
        i1;
        JVM INSTR lookupswitch 3: default 88
    //                   4097: 96
    //                   4099: 124
    //                   8194: 110;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = -1;
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

    private void a(int i1, e e1)
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
            (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(e1);
        }
        k.set(i1, e1);
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
            (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(e1);
        }
        k.add(e1);
          goto _L4
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new d("FragmentManager"));
        if (o != null)
        {
            try
            {
                o.a("  ", ((PrintWriter) (obj)), new String[0]);
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
        if (android.support.v4.view.x.g(view) != 0) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!android.support.v4.view.x.A(view)) goto _L2; else goto _L3
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

    private void b(Fragment fragment)
    {
        a(fragment, n, 0, 0, false);
    }

    private static void b(View view, Animation animation)
    {
        while (view == null || animation == null || !a(view, animation)) 
        {
            return;
        }
        animation.setAnimationListener(new a(view, animation));
    }

    private void c(Fragment fragment)
    {
        if (fragment.mInnerView != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            fragment.mInnerView.saveHierarchyState(x);
            if (x.size() > 0)
            {
                fragment.mSavedViewState = x;
                x = null;
                return;
            }
        }
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

    public final int a(e e1)
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
            (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(e1);
        }
        k.add(e1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)l.remove(l.size() - 1)).intValue();
        if (a)
        {
            (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(e1);
        }
        k.set(i1, e1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
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
        if (fragment == null || fragment.mFragmentId != i1) goto _L5; else goto _L4
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
        if (fragment1.mFragmentId == i1) goto _L4; else goto _L8
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
        if (fragment == null || !s1.equals(fragment.mTag)) goto _L5; else goto _L4
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
        if (s1.equals(fragment1.mTag)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final o a()
    {
        return new e(this);
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
                boolean flag1 = false;
                for (int l1 = 0; l1 < f.size();)
                {
                    Fragment fragment = (Fragment)f.get(l1);
                    boolean flag2 = flag1;
                    if (fragment != null)
                    {
                        a(fragment, i1, j1, k1, false);
                        flag2 = flag1;
                        if (fragment.mLoaderManager != null)
                        {
                            flag2 = flag1 | fragment.mLoaderManager.b();
                        }
                    }
                    l1++;
                    flag1 = flag2;
                }

                if (!flag1)
                {
                    h();
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
                if (fragment != null)
                {
                    fragment.performConfigurationChanged(configuration);
                }
            }

        }
    }

    public final void a(Bundle bundle, String s1, Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()))));
        }
        bundle.putInt(s1, fragment.mIndex);
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
                    FragmentState fragmentstate1 = ((FragmentManagerState) (parcelable)).a[fragment.mIndex];
                    fragmentstate1.k = fragment;
                    fragment.mSavedViewState = null;
                    fragment.mBackStackNesting = 0;
                    fragment.mInLayout = false;
                    fragment.mAdded = false;
                    fragment.mTarget = null;
                    if (fragmentstate1.j != null)
                    {
                        fragmentstate1.j.setClassLoader(o.b.getClassLoader());
                        fragment.mSavedViewState = fragmentstate1.j.getSparseParcelableArray("android:view_state");
                        fragment.mSavedFragmentState = fragmentstate1.j;
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
                        Context context = ((k) (obj)).b;
                        if (fragmentstate.i != null)
                        {
                            fragmentstate.i.setClassLoader(context.getClassLoader());
                        }
                        fragmentstate.k = Fragment.instantiate(context, fragmentstate.a, fragmentstate.i);
                        if (fragmentstate.j != null)
                        {
                            fragmentstate.j.setClassLoader(context.getClassLoader());
                            fragmentstate.k.mSavedFragmentState = fragmentstate.j;
                        }
                        fragmentstate.k.setIndex(fragmentstate.b, fragment2);
                        fragmentstate.k.mFromLayout = fragmentstate.c;
                        fragmentstate.k.mRestored = true;
                        fragmentstate.k.mFragmentId = fragmentstate.d;
                        fragmentstate.k.mContainerId = fragmentstate.e;
                        fragmentstate.k.mTag = fragmentstate.f;
                        fragmentstate.k.mRetainInstance = fragmentstate.g;
                        fragmentstate.k.mDetached = fragmentstate.h;
                        fragmentstate.k.mFragmentManager = ((k) (obj)).d;
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
                    if (fragment1.mTargetIndex >= 0)
                    {
                        if (fragment1.mTargetIndex < f.size())
                        {
                            fragment1.mTarget = (Fragment)f.get(fragment1.mTargetIndex);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(fragment1).append(" target no longer exists: ").append(fragment1.mTargetIndex).toString());
                            fragment1.mTarget = null;
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
                    list.mAdded = true;
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
                        (new StringBuilder("restoreAllState: back stack #")).append(i2).append(" (index ").append(((e) (list)).p).append("): ").append(list);
                        list.a("  ", new PrintWriter(new d("FragmentManager")), false);
                    }
                    i.add(list);
                    if (((e) (list)).p >= 0)
                    {
                        a(((e) (list)).p, ((e) (list)));
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

    public final void a(Fragment fragment)
    {
label0:
        {
            if (fragment.mDeferStart)
            {
                if (!e)
                {
                    break label0;
                }
                v = true;
            }
            return;
        }
        fragment.mDeferStart = false;
        a(fragment, n, 0, 0, false);
    }

    public final void a(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("remove: ")).append(fragment).append(" nesting=").append(fragment.mBackStackNesting);
        }
        int k1;
        if (!fragment.isInBackStack())
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!fragment.mDetached || k1 != 0)
        {
            if (g != null)
            {
                g.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible)
            {
                r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
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
            if (fragment.mAdded)
            {
                l1 = i1;
                if (!fragment.mDetached)
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
        if (fragment.mRemoving)
        {
            j2 = l1;
            if (l1 > fragment.mState)
            {
                j2 = fragment.mState;
            }
        }
        i1 = j2;
        if (fragment.mDeferStart)
        {
            i1 = j2;
            if (fragment.mState < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (fragment.mState >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (fragment.mFromLayout && !fragment.mInLayout)
        {
            return;
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mAnimatingAway = null;
            a(fragment, fragment.mStateAfterAnimating, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        fragment.mState;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 567
    //                   2 885
    //                   3 885
    //                   4 924;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        fragment.mState = i2;
        return;
_L4:
        if (a)
        {
            (new StringBuilder("moveto CREATED: ")).append(fragment);
        }
        k2 = i1;
        if (fragment.mSavedFragmentState != null)
        {
            fragment.mSavedFragmentState.setClassLoader(o.b.getClassLoader());
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            fragment.mTarget = a(fragment.mSavedFragmentState, "android:target_state");
            if (fragment.mTarget != null)
            {
                fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!fragment.mUserVisibleHint)
            {
                fragment.mDeferStart = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        fragment.mHost = o;
        fragment.mParentFragment = q;
        m m1;
        if (q != null)
        {
            m1 = q.mChildFragmentManager;
        } else
        {
            m1 = o.d;
        }
        fragment.mFragmentManager = m1;
        fragment.mCalled = false;
        fragment.onAttach(o.b);
        if (!fragment.mCalled)
        {
            throw new ai((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        if (fragment.mParentFragment == null)
        {
            o.a(fragment);
        }
        if (!fragment.mRetaining)
        {
            fragment.performCreate(fragment.mSavedFragmentState);
        }
        fragment.mRetaining = false;
        i2 = k2;
        if (fragment.mFromLayout)
        {
            fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null)
            {
                fragment.mInnerView = fragment.mView;
                ViewGroup viewgroup;
                Object obj;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    android.support.v4.view.x.z(fragment.mView);
                } else
                {
                    fragment.mView = android.support.v4.app.u.a(fragment.mView);
                }
                if (fragment.mHidden)
                {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                i2 = k2;
            } else
            {
                fragment.mInnerView = null;
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
            if (!fragment.mFromLayout)
            {
                viewgroup = null;
                if (fragment.mContainerId != 0)
                {
                    obj = (ViewGroup)p.a(fragment.mContainerId);
                    viewgroup = ((ViewGroup) (obj));
                    if (obj == null)
                    {
                        viewgroup = ((ViewGroup) (obj));
                        if (!fragment.mRestored)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.mContainerId)).append(" (").append(fragment.getResources().getResourceName(fragment.mContainerId)).append(") for fragment ").append(fragment).toString()))));
                            viewgroup = ((ViewGroup) (obj));
                        }
                    }
                }
                fragment.mContainer = viewgroup;
                fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), viewgroup, fragment.mSavedFragmentState);
                if (fragment.mView != null)
                {
                    fragment.mInnerView = fragment.mView;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        android.support.v4.view.x.z(fragment.mView);
                    } else
                    {
                        fragment.mView = android.support.v4.app.u.a(fragment.mView);
                    }
                    if (viewgroup != null)
                    {
                        obj = a(fragment, j1, true, k1);
                        if (obj != null)
                        {
                            b(fragment.mView, ((Animation) (obj)));
                            fragment.mView.startAnimation(((Animation) (obj)));
                        }
                        viewgroup.addView(fragment.mView);
                    }
                    if (fragment.mHidden)
                    {
                        fragment.mView.setVisibility(8);
                    }
                    fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                } else
                {
                    fragment.mInnerView = null;
                }
            }
            fragment.performActivityCreated(fragment.mSavedFragmentState);
            if (fragment.mView != null)
            {
                fragment.restoreViewState(fragment.mSavedFragmentState);
            }
            fragment.mSavedFragmentState = null;
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
            fragment.performStart();
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
            fragment.mResumed = true;
            fragment.performResume();
            fragment.mSavedFragmentState = null;
            fragment.mSavedViewState = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (fragment.mState <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.mState;
        JVM INSTR tableswitch 1 5: default 1080
    //                   1 1086
    //                   2 1236
    //                   3 1206
    //                   4 1176
    //                   5 1141;
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
        if (t && fragment.mAnimatingAway != null)
        {
            View view = fragment.mAnimatingAway;
            fragment.mAnimatingAway = null;
            view.clearAnimation();
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mStateAfterAnimating = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L13:
        if (i1 < 5)
        {
            if (a)
            {
                (new StringBuilder("movefrom RESUMED: ")).append(fragment);
            }
            fragment.performPause();
            fragment.mResumed = false;
        }
_L12:
        if (i1 < 4)
        {
            if (a)
            {
                (new StringBuilder("movefrom STARTED: ")).append(fragment);
            }
            fragment.performStop();
        }
_L11:
        if (i1 < 3)
        {
            if (a)
            {
                (new StringBuilder("movefrom STOPPED: ")).append(fragment);
            }
            fragment.performReallyStop();
        }
_L10:
        if (i1 < 2)
        {
            if (a)
            {
                (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(fragment);
            }
            if (fragment.mView != null && o.b() && fragment.mSavedViewState == null)
            {
                c(fragment);
            }
            fragment.performDestroyView();
            if (fragment.mView != null && fragment.mContainer != null)
            {
                Object obj1 = null;
                Animation animation = obj1;
                if (n > 0)
                {
                    animation = obj1;
                    if (!t)
                    {
                        animation = a(fragment, j1, false, k1);
                    }
                }
                if (animation != null)
                {
                    fragment.mAnimatingAway = fragment.mView;
                    fragment.mStateAfterAnimating = i1;
                    animation.setAnimationListener(new a(fragment.mView, animation, fragment) {

                        final Fragment a;
                        final m b;

                        public final void onAnimationEnd(Animation animation1)
                        {
                            super.onAnimationEnd(animation1);
                            if (a.mAnimatingAway != null)
                            {
                                a.mAnimatingAway = null;
                                b.a(a, a.mStateAfterAnimating, 0, 0, false);
                            }
                        }

            
            {
                b = m.this;
                a = fragment;
                super(view, animation);
            }
                    });
                    fragment.mView.startAnimation(animation);
                }
                fragment.mContainer.removeView(fragment.mView);
            }
            fragment.mContainer = null;
            fragment.mView = null;
            fragment.mInnerView = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (a)
        {
            (new StringBuilder("movefrom CREATED: ")).append(fragment);
        }
        if (!fragment.mRetaining)
        {
            fragment.performDestroy();
        }
        fragment.mCalled = false;
        fragment.onDetach();
        if (!fragment.mCalled)
        {
            throw new ai((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!fragment.mRetaining)
        {
            i2 = i1;
            if (fragment.mIndex >= 0)
            {
                if (a)
                {
                    (new StringBuilder("Freeing fragment index ")).append(fragment);
                }
                f.set(fragment.mIndex, null);
                if (h == null)
                {
                    h = new ArrayList();
                }
                h.add(Integer.valueOf(fragment.mIndex));
                o.b(fragment.mWho);
                fragment.initState();
                i2 = i1;
            }
        } else
        {
            fragment.mHost = null;
            fragment.mParentFragment = null;
            fragment.mFragmentManager = null;
            fragment.mChildFragmentManager = null;
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
        if (fragment.mIndex < 0)
        {
            if (h == null || h.size() <= 0)
            {
                if (f == null)
                {
                    f = new ArrayList();
                }
                fragment.setIndex(f.size(), q);
                f.add(fragment);
            } else
            {
                fragment.setIndex(((Integer)h.remove(h.size() - 1)).intValue(), q);
                f.set(fragment.mIndex, fragment);
            }
            if (a)
            {
                (new StringBuilder("Allocated fragment index ")).append(fragment);
            }
        }
        if (!fragment.mDetached)
        {
            if (g.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            g.add(fragment);
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mHasMenu && fragment.mMenuVisible)
            {
                r = true;
            }
            if (flag)
            {
                b(fragment);
            }
        }
    }

    public final void a(k k1, i i1, Fragment fragment)
    {
        if (o != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            o = k1;
            p = i1;
            q = fragment;
            return;
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
        if (t || o == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
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
            o.i().removeCallbacks(y);
            o.i().post(y);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
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
                        fragment.dump(s2, filedescriptor, printwriter, as);
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
                    filedescriptor = (e)i.get(l1);
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
        filedescriptor = (e)k.get(i2);
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
                for (int j2 = 0; j2 < l3; j2++)
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
        break MISSING_BLOCK_LABEL_696;
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

    final boolean a(int i1, int j1)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i1 >= 0 || (j1 & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i1 = i.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        e e1 = (e)i.remove(i1);
        SparseArray sparsearray = new SparseArray();
        SparseArray sparsearray1 = new SparseArray();
        e1.a(sparsearray, sparsearray1);
        e1.a(true, null, sparsearray, sparsearray1);
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
        l1 = i.size() - 1;
        do
        {
            if (l1 < 0)
            {
                break;
            }
            e e2 = (e)i.get(l1);
            if (i1 >= 0 && i1 == e2.p)
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
                e e3 = (e)i.get(j1);
                k1 = j1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = j1;
                if (i1 != e3.p)
                {
                    break;
                }
                j1--;
            } while (true);
        }
        if (k1 == i.size() - 1) goto _L1; else goto _L7
_L7:
        ArrayList arraylist = new ArrayList();
        for (i1 = i.size() - 1; i1 > k1; i1--)
        {
            arraylist.add(i.remove(i1));
        }

        j1 = arraylist.size() - 1;
        SparseArray sparsearray2 = new SparseArray();
        SparseArray sparsearray3 = new SparseArray();
        for (i1 = 0; i1 <= j1; i1++)
        {
            ((e)arraylist.get(i1)).a(sparsearray2, sparsearray3);
        }

        e.b b1 = null;
        i1 = 0;
        while (i1 <= j1) 
        {
            if (a)
            {
                (new StringBuilder("Popping back stack state: ")).append(arraylist.get(i1));
            }
            e e4 = (e)arraylist.get(i1);
            boolean flag;
            if (i1 == j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b1 = e4.a(flag, b1, sparsearray2, sparsearray3);
            i1++;
        }
          goto _L8
    }

    public final boolean a(Menu menu)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (g != null)
        {
            int i1 = 0;
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
                    if (fragment.performPrepareOptionsMenu(menu))
                    {
                        flag1 = true;
                    }
                }
                i1++;
                flag = flag1;
            } while (true);
        }
        return flag1;
    }

    public final boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag = false;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (g != null)
        {
            int i1 = 0;
            do
            {
                arraylist1 = arraylist;
                flag1 = flag;
                if (i1 >= g.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)g.get(i1);
                arraylist1 = arraylist;
                flag1 = flag;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    flag1 = flag;
                    if (fragment.performCreateOptionsMenu(menu, menuinflater))
                    {
                        flag1 = true;
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                    }
                }
                i1++;
                arraylist = arraylist1;
                flag = flag1;
            } while (true);
        }
        if (j != null)
        {
            for (int j1 = 0; j1 < j.size(); j1++)
            {
                menu = (Fragment)j.get(j1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    menu.onDestroyOptionsMenu();
                }
            }

        }
        j = arraylist1;
        return flag1;
    }

    public final boolean a(MenuItem menuitem)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null && fragment.performOptionsItemSelected(menuitem))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public final void b(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i1).toString());
        } else
        {
            a(new Runnable(i1) {

                final int a;
                final int b = 1;
                final m c;

                public final void run()
                {
                    m m1 = c;
                    k k1 = c.o;
                    m1.a(a, b);
                }

            
            {
                c = m.this;
                a = i1;
                super();
            }
            }, false);
            return;
        }
    }

    public final void b(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("hide: ")).append(fragment);
        }
        if (!fragment.mHidden)
        {
            fragment.mHidden = true;
            if (fragment.mView != null)
            {
                Animation animation = a(fragment, i1, false, j1);
                if (animation != null)
                {
                    b(fragment.mView, animation);
                    fragment.mView.startAnimation(animation);
                }
                fragment.mView.setVisibility(8);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
            {
                r = true;
            }
            fragment.onHiddenChanged(true);
        }
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
                    fragment.performOptionsMenuClosed(menu);
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
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null && fragment.performContextItemSelected(menuitem))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public final void c()
    {
        a(new Runnable() {

            final m a;

            public final void run()
            {
                m m1 = a;
                k k1 = a.o;
                m1.a(-1, 0);
            }

            
            {
                a = m.this;
                super();
            }
        }, false);
    }

    final void c(int i1)
    {
        a(i1, 0, 0, false);
    }

    public final void c(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("show: ")).append(fragment);
        }
        if (fragment.mHidden)
        {
            fragment.mHidden = false;
            if (fragment.mView != null)
            {
                Animation animation = a(fragment, i1, true, j1);
                if (animation != null)
                {
                    b(fragment.mView, animation);
                    fragment.mView.startAnimation(animation);
                }
                fragment.mView.setVisibility(0);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
            {
                r = true;
            }
            fragment.onHiddenChanged(false);
        }
    }

    public final void d(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("detach: ")).append(fragment);
        }
        if (!fragment.mDetached)
        {
            fragment.mDetached = true;
            if (fragment.mAdded)
            {
                if (g != null)
                {
                    if (a)
                    {
                        (new StringBuilder("remove from detach: ")).append(fragment);
                    }
                    g.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible)
                {
                    r = true;
                }
                fragment.mAdded = false;
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

    public final int e()
    {
        if (i != null)
        {
            return i.size();
        } else
        {
            return 0;
        }
    }

    public final void e(Fragment fragment, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("attach: ")).append(fragment);
        }
        if (fragment.mDetached)
        {
            fragment.mDetached = false;
            if (!fragment.mAdded)
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
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible)
                {
                    r = true;
                }
                a(fragment, n, i1, j1, false);
            }
        }
    }

    public final List f()
    {
        return f;
    }

    public final boolean g()
    {
        return t;
    }

    final void h()
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

    public final boolean i()
    {
        if (e)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != o.i().getLooper())
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
        k1 = 0;
        for (int i1 = 0; i1 < f.size();)
        {
            Fragment fragment = (Fragment)f.get(i1);
            int l1 = k1;
            if (fragment != null)
            {
                l1 = k1;
                if (fragment.mLoaderManager != null)
                {
                    l1 = k1 | fragment.mLoaderManager.b();
                }
            }
            i1++;
            k1 = l1;
        }

        break; /* Loop/switch isn't completed */
        k1 = c.size();
        if (d == null || d.length < k1)
        {
            d = new Runnable[k1];
        }
        c.toArray(d);
        c.clear();
        o.i().removeCallbacks(y);
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
            h();
        }
        return flag;
    }

    final void j()
    {
        if (m != null)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                m.get(i1);
            }

        }
    }

    final Parcelable k()
    {
        i();
        if (b)
        {
            s = true;
        }
        if (f != null && f.size() > 0)
        {
            int k1 = f.size();
            FragmentState afragmentstate[] = new FragmentState[k1];
            boolean flag = false;
            int i1 = 0;
            while (i1 < k1) 
            {
                Object obj1 = (Fragment)f.get(i1);
                if (obj1 == null)
                {
                    continue;
                }
                if (((Fragment) (obj1)).mIndex < 0)
                {
                    a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(obj1).append(" has cleared index: ").append(((Fragment) (obj1)).mIndex).toString()));
                }
                boolean flag1 = true;
                FragmentState fragmentstate = new FragmentState(((Fragment) (obj1)));
                afragmentstate[i1] = fragmentstate;
                if (((Fragment) (obj1)).mState > 0 && fragmentstate.j == null)
                {
                    if (w == null)
                    {
                        w = new Bundle();
                    }
                    ((Fragment) (obj1)).performSaveInstanceState(w);
                    Bundle bundle;
                    int ai1[];
                    Object obj;
                    BackStackState abackstackstate[];
                    int j1;
                    if (!w.isEmpty())
                    {
                        obj = w;
                        w = null;
                    } else
                    {
                        obj = null;
                    }
                    if (((Fragment) (obj1)).mView != null)
                    {
                        c(((Fragment) (obj1)));
                    }
                    bundle = ((Bundle) (obj));
                    if (((Fragment) (obj1)).mSavedViewState != null)
                    {
                        bundle = ((Bundle) (obj));
                        if (obj == null)
                        {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", ((Fragment) (obj1)).mSavedViewState);
                    }
                    obj = bundle;
                    if (!((Fragment) (obj1)).mUserVisibleHint)
                    {
                        obj = bundle;
                        if (bundle == null)
                        {
                            obj = new Bundle();
                        }
                        ((Bundle) (obj)).putBoolean("android:user_visible_hint", ((Fragment) (obj1)).mUserVisibleHint);
                    }
                    fragmentstate.j = ((Bundle) (obj));
                    if (((Fragment) (obj1)).mTarget != null)
                    {
                        if (((Fragment) (obj1)).mTarget.mIndex < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(obj1).append(" has target not in fragment manager: ").append(((Fragment) (obj1)).mTarget).toString()));
                        }
                        if (fragmentstate.j == null)
                        {
                            fragmentstate.j = new Bundle();
                        }
                        a(fragmentstate.j, "android:target_state", ((Fragment) (obj1)).mTarget);
                        if (((Fragment) (obj1)).mTargetRequestCode != 0)
                        {
                            fragmentstate.j.putInt("android:target_req_state", ((Fragment) (obj1)).mTargetRequestCode);
                        }
                    }
                } else
                {
                    fragmentstate.j = ((Fragment) (obj1)).mSavedFragmentState;
                }
                flag = flag1;
                if (a)
                {
                    (new StringBuilder("Saved state of ")).append(obj1).append(": ").append(fragmentstate.j);
                    flag = flag1;
                }
                i1++;
            }
            if (flag)
            {
                obj = null;
                obj1 = null;
                ai1 = ((int []) (obj));
                if (g != null)
                {
                    j1 = g.size();
                    ai1 = ((int []) (obj));
                    if (j1 > 0)
                    {
                        obj = new int[j1];
                        i1 = 0;
                        do
                        {
                            ai1 = ((int []) (obj));
                            if (i1 >= j1)
                            {
                                break;
                            }
                            obj[i1] = ((Fragment)g.get(i1)).mIndex;
                            if (obj[i1] < 0)
                            {
                                a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(g.get(i1)).append(" has cleared index: ").append(obj[i1]).toString()));
                            }
                            if (a)
                            {
                                (new StringBuilder("saveAllState: adding fragment #")).append(i1).append(": ").append(g.get(i1));
                            }
                            i1++;
                        } while (true);
                    }
                }
                obj = obj1;
                if (i != null)
                {
                    j1 = i.size();
                    obj = obj1;
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
                            abackstackstate[i1] = new BackStackState((e)i.get(i1));
                            if (a)
                            {
                                (new StringBuilder("saveAllState: adding back stack #")).append(i1).append(": ").append(i.get(i1));
                            }
                            i1++;
                        } while (true);
                    }
                }
                abackstackstate = new FragmentManagerState();
                abackstackstate.a = afragmentstate;
                abackstackstate.b = ai1;
                abackstackstate.c = ((BackStackState []) (obj));
                return abackstackstate;
            }
        }
        return null;
    }

    public final void l()
    {
        s = false;
        c(1);
    }

    public final void m()
    {
        s = false;
        c(2);
    }

    public final void n()
    {
        s = false;
        c(4);
    }

    public final void o()
    {
        s = false;
        c(5);
    }

    public final View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
    {
        if ("fragment".equals(s1))
        {
            s1 = attributeset.getAttributeValue(null, "class");
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, b.a);
            String s2 = s1;
            if (s1 == null)
            {
                s2 = typedarray.getString(0);
            }
            int k1 = typedarray.getResourceId(1, -1);
            String s3 = typedarray.getString(2);
            typedarray.recycle();
            if (Fragment.isSupportFragmentClass(o.b, s2))
            {
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
                if (a)
                {
                    (new StringBuilder("onCreateView: id=0x")).append(Integer.toHexString(k1)).append(" fname=").append(s2).append(" existing=").append(s1);
                }
                if (s1 == null)
                {
                    view = Fragment.instantiate(context, s2);
                    view.mFromLayout = true;
                    int j1;
                    if (k1 != 0)
                    {
                        j1 = k1;
                    } else
                    {
                        j1 = i1;
                    }
                    view.mFragmentId = j1;
                    view.mContainerId = i1;
                    view.mTag = s3;
                    view.mInLayout = true;
                    view.mFragmentManager = this;
                    view.mHost = o;
                    view.onInflate(o.b, attributeset, ((Fragment) (view)).mSavedFragmentState);
                    a(view, true);
                } else
                {
                    if (((Fragment) (s1)).mInLayout)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k1)).append(", tag ").append(s3).append(", or parent id 0x").append(Integer.toHexString(i1)).append(" with another fragment for ").append(s2).toString());
                    }
                    s1.mInLayout = true;
                    view = s1;
                    if (!((Fragment) (s1)).mRetaining)
                    {
                        s1.onInflate(o.b, attributeset, ((Fragment) (s1)).mSavedFragmentState);
                        view = s1;
                    }
                }
                if (n <= 0 && ((Fragment) (view)).mFromLayout)
                {
                    a(view, 1, 0, 0, false);
                } else
                {
                    b(view);
                }
                if (((Fragment) (view)).mView == null)
                {
                    throw new IllegalStateException((new StringBuilder("Fragment ")).append(s2).append(" did not create a view.").toString());
                }
                if (k1 != 0)
                {
                    ((Fragment) (view)).mView.setId(k1);
                }
                if (((Fragment) (view)).mView.getTag() == null)
                {
                    ((Fragment) (view)).mView.setTag(s3);
                }
                return ((Fragment) (view)).mView;
            }
        }
        return null;
    }

    public final void p()
    {
        s = true;
        c(3);
    }

    public final void q()
    {
        t = true;
        i();
        c(0);
        o = null;
        p = null;
        q = null;
    }

    public final void r()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                Fragment fragment = (Fragment)g.get(i1);
                if (fragment != null)
                {
                    fragment.performLowMemory();
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
            android.support.v4.util.c.a(q, stringbuilder);
        } else
        {
            android.support.v4.util.c.a(o, stringbuilder);
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
