// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.b.d;
import android.support.v4.b.l;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            e, an, m, d, 
//            w, FragmentActivity

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final l P = new l();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    int G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    boolean L;
    w M;
    boolean N;
    boolean O;
    int a;
    View b;
    int c;
    Bundle d;
    SparseArray e;
    int f;
    String g;
    Bundle h;
    Fragment i;
    int j;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    m s;
    FragmentActivity t;
    m u;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    public Fragment()
    {
        a = 0;
        f = -1;
        j = -1;
        E = true;
        L = true;
    }

    public static Fragment a(Context context, String s1)
    {
        return a(context, s1, null);
    }

    public static Fragment a(Context context, String s1, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)P.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new e((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new e((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new e((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        P.put(s1, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.h = bundle;
        return context;
    }

    static boolean b(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)P.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        class1 = context.getClassLoader().loadClass(s1);
        P.put(s1, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public static void e()
    {
    }

    public static void f()
    {
    }

    public static Animation j()
    {
        return null;
    }

    public static void k()
    {
    }

    public static void n()
    {
    }

    final void a()
    {
        if (e != null)
        {
            J.restoreHierarchyState(e);
            e = null;
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onViewStateRestored()").toString());
        } else
        {
            return;
        }
    }

    final void a(int i1, Fragment fragment)
    {
        f = i1;
        if (fragment != null)
        {
            g = (new StringBuilder()).append(fragment.g).append(":").append(f).toString();
            return;
        } else
        {
            g = (new StringBuilder("android:fragment:")).append(f).toString();
            return;
        }
    }

    final void a(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        if (u != null)
        {
            u.a(configuration);
        }
    }

    final void a(Bundle bundle)
    {
        if (u != null)
        {
            u.g();
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                if (u == null)
                {
                    u = new m();
                    u.a(t, new android.support.v4.app.d(this), this);
                }
                u.a(bundle, null);
                u.h();
            }
        }
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(w));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(x));
        printwriter.print(" mTag=");
        printwriter.println(y);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(a);
        printwriter.print(" mIndex=");
        printwriter.print(f);
        printwriter.print(" mWho=");
        printwriter.print(g);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(r);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(l);
        printwriter.print(" mRemoving=");
        printwriter.print(m);
        printwriter.print(" mResumed=");
        printwriter.print(n);
        printwriter.print(" mFromLayout=");
        printwriter.print(o);
        printwriter.print(" mInLayout=");
        printwriter.println(p);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(z);
        printwriter.print(" mDetached=");
        printwriter.print(A);
        printwriter.print(" mMenuVisible=");
        printwriter.print(E);
        printwriter.print(" mHasMenu=");
        printwriter.println(D);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(B);
        printwriter.print(" mRetaining=");
        printwriter.print(C);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(L);
        if (s != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(s);
        }
        if (t != null)
        {
            printwriter.print(s1);
            printwriter.print("mActivity=");
            printwriter.println(t);
        }
        if (v != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(v);
        }
        if (h != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(h);
        }
        if (d != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(d);
        }
        if (e != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(e);
        }
        if (i != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(i);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(k);
        }
        if (G != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(G);
        }
        if (H != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(H);
        }
        if (I != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(I);
        }
        if (J != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(I);
        }
        if (b != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(b);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(c);
        }
        if (M != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            M.a((new StringBuilder()).append(s1).append("  ").toString(), printwriter);
        }
        if (u != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder("Child ")).append(u).append(":").toString());
            u.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    final boolean a(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!z)
        {
            boolean flag = flag2;
            if (D)
            {
                flag = flag2;
                if (E)
                {
                    flag = true;
                }
            }
            flag1 = flag;
            if (u != null)
            {
                flag1 = flag | u.a(menu);
            }
        }
        return flag1;
    }

    final boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!z)
        {
            boolean flag = flag2;
            if (D)
            {
                flag = flag2;
                if (E)
                {
                    flag = true;
                }
            }
            flag1 = flag;
            if (u != null)
            {
                flag1 = flag | u.a(menu, menuinflater);
            }
        }
        return flag1;
    }

    final boolean a(MenuItem menuitem)
    {
        if (!z)
        {
            boolean flag;
            if (D)
            {
                flag = E;
            }
            if (u != null && u.a(menuitem))
            {
                return true;
            }
        }
        return false;
    }

    final void b(Bundle bundle)
    {
        if (u != null)
        {
            android.os.Parcelable parcelable = u.f();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    final void b(Menu menu)
    {
        if (!z)
        {
            boolean flag;
            if (D)
            {
                flag = E;
            }
            if (u != null)
            {
                u.b(menu);
            }
        }
    }

    final boolean b()
    {
        return r > 0;
    }

    final boolean b(MenuItem menuitem)
    {
        return !z && u != null && u.b(menuitem);
    }

    public final Resources c()
    {
        if (t == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return t.getResources();
        }
    }

    public final boolean d()
    {
        return A;
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final LayoutInflater g()
    {
        return t.getLayoutInflater();
    }

    public final void h()
    {
        F = true;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public final void i()
    {
        F = true;
    }

    final void l()
    {
        f = -1;
        g = null;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = 0;
        s = null;
        t = null;
        w = 0;
        x = 0;
        y = null;
        z = false;
        A = false;
        C = false;
        M = null;
        N = false;
        O = false;
    }

    public final void m()
    {
        F = true;
    }

    final View o()
    {
        if (u != null)
        {
            u.g();
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        F = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        t.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        F = true;
    }

    final void p()
    {
        if (u != null)
        {
            u.g();
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (u != null)
        {
            u.i();
        }
    }

    final void q()
    {
        if (u != null)
        {
            u.g();
            u.d();
        }
        F = false;
        F = true;
        if (!N)
        {
            N = true;
            if (!O)
            {
                O = true;
                FragmentActivity fragmentactivity = t;
                String s1 = g;
                boolean flag = N;
                M = fragmentactivity.b(s1);
            }
            if (M != null)
            {
                M.b();
            }
        }
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStart()").toString());
        }
        if (u != null)
        {
            u.j();
        }
        if (M != null)
        {
            M.g();
        }
    }

    final void r()
    {
        if (u != null)
        {
            u.g();
            u.d();
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onResume()").toString());
        }
        if (u != null)
        {
            u.k();
            u.d();
        }
    }

    final void s()
    {
        onLowMemory();
        if (u != null)
        {
            u.q();
        }
    }

    final void t()
    {
        if (u != null)
        {
            u.l();
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        android.support.v4.b.d.a(this, stringbuilder);
        if (f >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(f);
        }
        if (w != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(w));
        }
        if (y != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(y);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    final void u()
    {
        if (u != null)
        {
            u.m();
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    final void v()
    {
label0:
        {
            if (u != null)
            {
                u.n();
            }
            if (N)
            {
                N = false;
                if (!O)
                {
                    O = true;
                    FragmentActivity fragmentactivity = t;
                    String s1 = g;
                    boolean flag = N;
                    M = fragmentactivity.b(s1);
                }
                if (M != null)
                {
                    if (t.h)
                    {
                        break label0;
                    }
                    M.c();
                }
            }
            return;
        }
        M.d();
    }

    final void w()
    {
        if (u != null)
        {
            u.o();
        }
        F = false;
        F = true;
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (M != null)
        {
            M.f();
        }
    }

    final void x()
    {
        if (u != null)
        {
            u.p();
        }
        F = false;
        F = true;
        if (!O)
        {
            O = true;
            FragmentActivity fragmentactivity = t;
            String s1 = g;
            boolean flag = N;
            M = fragmentactivity.b(s1);
        }
        if (M != null)
        {
            M.h();
        }
        if (!F)
        {
            throw new an((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

}
