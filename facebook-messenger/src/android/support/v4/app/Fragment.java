// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.c.a;
import android.util.AttributeSet;
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
import java.util.HashMap;

// Referenced classes of package android.support.v4.app:
//            g, p, ai, s, 
//            f, ba, e, i, 
//            q, ag

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final HashMap a = new HashMap();
    boolean A;
    int B;
    s C;
    p D;
    s E;
    Fragment F;
    int G;
    int H;
    String I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    int Q;
    ViewGroup R;
    View S;
    View T;
    boolean U;
    boolean V;
    ai W;
    boolean X;
    boolean Y;
    private LayoutInflater b;
    int j;
    View k;
    int l;
    Bundle m;
    SparseArray n;
    int o;
    int p;
    String q;
    Bundle r;
    Fragment s;
    int t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public Fragment()
    {
        j = 0;
        o = -1;
        t = -1;
        O = true;
        V = true;
    }

    public static Fragment a(Context context, String s1)
    {
        return a(context, s1, ((Bundle) (null)));
    }

    public static Fragment a(Context context, String s1, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new g((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new g((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new g((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.r = bundle;
        return context;
    }

    public void A()
    {
        P = true;
    }

    public void B()
    {
        P = true;
    }

    public void C()
    {
        P = true;
        if (!Y)
        {
            Y = true;
            W = D.a(q, X, false);
        }
        if (W != null)
        {
            W.h();
        }
    }

    void D()
    {
        o = -1;
        q = null;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = 0;
        C = null;
        D = null;
        G = 0;
        H = 0;
        I = null;
        J = false;
        K = false;
        M = false;
        W = null;
        X = false;
        Y = false;
    }

    public void E()
    {
    }

    void F()
    {
        E = new s();
        E.a(D, new f(this), this);
    }

    void G()
    {
        if (E != null)
        {
            E.l();
            E.h();
        }
        P = false;
        f();
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onStart()").toString());
        }
        if (E != null)
        {
            E.o();
        }
        if (W != null)
        {
            W.g();
        }
    }

    void H()
    {
        if (E != null)
        {
            E.l();
            E.h();
        }
        P = false;
        A();
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onResume()").toString());
        }
        if (E != null)
        {
            E.p();
            E.h();
        }
    }

    void I()
    {
        onLowMemory();
        if (E != null)
        {
            E.v();
        }
    }

    void J()
    {
        if (E != null)
        {
            E.q();
        }
        P = false;
        B();
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }

    void K()
    {
        if (E != null)
        {
            E.r();
        }
        P = false;
        g();
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    void L()
    {
label0:
        {
            if (E != null)
            {
                E.s();
            }
            if (X)
            {
                X = false;
                if (!Y)
                {
                    Y = true;
                    W = D.a(q, X, false);
                }
                if (W != null)
                {
                    if (D.h())
                    {
                        break label0;
                    }
                    W.c();
                }
            }
            return;
        }
        W.d();
    }

    void M()
    {
        if (E != null)
        {
            E.t();
        }
        P = false;
        h();
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (W != null)
        {
            W.f();
        }
    }

    void N()
    {
        if (E != null)
        {
            E.u();
            E = null;
        }
        P = false;
        C();
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public Animation a(int i1, boolean flag, int j1)
    {
        return null;
    }

    public final String a(int i1)
    {
        return o().getString(i1);
    }

    public final transient String a(int i1, Object aobj[])
    {
        return o().getString(i1, aobj);
    }

    public void a(int i1, int j1, Intent intent)
    {
    }

    final void a(int i1, Fragment fragment)
    {
        o = i1;
        if (fragment != null)
        {
            q = (new StringBuilder()).append(fragment.q).append(":").append(o).toString();
            return;
        } else
        {
            q = (new StringBuilder()).append("android:fragment:").append(o).toString();
            return;
        }
    }

    public void a(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        P = true;
    }

    public void a(Context context)
    {
        P = true;
    }

    public void a(Intent intent)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to FragmentHost").toString());
        } else
        {
            D.a(this, intent, -1);
            return;
        }
    }

    public void a(Intent intent, int i1)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to FragmentHost").toString());
        } else
        {
            D.a(this, intent, i1);
            return;
        }
    }

    void a(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        if (E != null)
        {
            E.a(configuration);
        }
    }

    public void a(Bundle bundle)
    {
        P = true;
    }

    public void a(Fragment fragment)
    {
    }

    public void a(Menu menu)
    {
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
    }

    public void a(View view)
    {
        view.setOnCreateContextMenuListener(this);
    }

    public void a(View view, Bundle bundle)
    {
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(G));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(H));
        printwriter.print(" mTag=");
        printwriter.println(I);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(j);
        printwriter.print(" mIndex=");
        printwriter.print(o);
        printwriter.print(" mWho=");
        printwriter.print(q);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(B);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(v);
        printwriter.print(" mRemoving=");
        printwriter.print(w);
        printwriter.print(" mResumed=");
        printwriter.print(x);
        printwriter.print(" mFromLayout=");
        printwriter.print(y);
        printwriter.print(" mInLayout=");
        printwriter.println(z);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(J);
        printwriter.print(" mDetached=");
        printwriter.print(K);
        printwriter.print(" mMenuVisible=");
        printwriter.print(O);
        printwriter.print(" mHasMenu=");
        printwriter.println(N);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(L);
        printwriter.print(" mRetaining=");
        printwriter.print(M);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(V);
        if (C != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(C);
        }
        if (D != null)
        {
            printwriter.print(s1);
            printwriter.print("mActivity=");
            printwriter.println(D);
        }
        if (F != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(F);
        }
        if (r != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(r);
        }
        if (m != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(m);
        }
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(n);
        }
        if (s != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(s);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(u);
        }
        if (Q != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(Q);
        }
        if (R != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(R);
        }
        if (S != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(S);
        }
        if (T != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(S);
        }
        if (k != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(k);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(l);
        }
        if (W != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            W.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (E != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder()).append("Child ").append(E).append(":").toString());
            E.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public boolean a(MenuItem menuitem)
    {
        return false;
    }

    public int b(int i1)
    {
        if (E != null)
        {
            p = E.b(i1) + 1;
        } else
        {
            p = i1 + 1;
        }
        return p;
    }

    public LayoutInflater b(Bundle bundle)
    {
        if (b == null)
        {
            b = new e(D.e(), this);
        }
        return b;
    }

    View b(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (E != null)
        {
            E.l();
        }
        return a(layoutinflater, viewgroup, bundle);
    }

    public void b(Menu menu)
    {
    }

    boolean b(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!J)
        {
            boolean flag = flag2;
            if (N)
            {
                flag = flag2;
                if (O)
                {
                    flag = true;
                    a(menu, menuinflater);
                }
            }
            flag1 = flag;
            if (E != null)
            {
                flag1 = flag | E.a(menu, menuinflater);
            }
        }
        return flag1;
    }

    public boolean b(MenuItem menuitem)
    {
        return false;
    }

    public Fragment c(int i1)
    {
        if (p == i1)
        {
            return this;
        }
        if (E != null)
        {
            return E.c(i1);
        } else
        {
            return null;
        }
    }

    public void c(boolean flag)
    {
    }

    boolean c(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!J)
        {
            boolean flag = flag2;
            if (N)
            {
                flag = flag2;
                if (O)
                {
                    flag = true;
                    a(menu);
                }
            }
            flag1 = flag;
            if (E != null)
            {
                flag1 = flag | E.a(menu);
            }
        }
        return flag1;
    }

    boolean c(MenuItem menuitem)
    {
        while (!J && (N && O && a(menuitem) || E != null && E.a(menuitem))) 
        {
            return true;
        }
        return false;
    }

    public void d(Bundle bundle)
    {
        P = true;
    }

    void d(Menu menu)
    {
        if (!J)
        {
            if (N && O)
            {
                b(menu);
            }
            if (E != null)
            {
                E.b(menu);
            }
        }
    }

    public void d(boolean flag)
    {
        if (N != flag)
        {
            N = flag;
            if (s() && !w())
            {
                D.j();
            }
        }
    }

    boolean d(MenuItem menuitem)
    {
        while (!J && (b(menuitem) || E != null && E.b(menuitem))) 
        {
            return true;
        }
        return false;
    }

    public void e()
    {
        P = true;
    }

    public void e(Bundle bundle)
    {
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public void f()
    {
        P = true;
        if (!X)
        {
            X = true;
            if (!Y)
            {
                Y = true;
                W = D.a(q, X, false);
            }
            if (W != null)
            {
                W.b();
            }
        }
    }

    final void f(Bundle bundle)
    {
        if (n != null)
        {
            T.restoreHierarchyState(n);
            n = null;
        }
        P = false;
        h(bundle);
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onViewStateRestored()").toString());
        } else
        {
            return;
        }
    }

    public void g()
    {
        P = true;
    }

    public void g(Bundle bundle)
    {
        if (o >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            r = bundle;
            return;
        }
    }

    public void h()
    {
        P = true;
    }

    public void h(Bundle bundle)
    {
        P = true;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    void i(Bundle bundle)
    {
        if (E != null)
        {
            E.l();
        }
        P = false;
        a(bundle);
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (E == null)
        {
            F();
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                E.a(bundle, null);
            }
        }
        E.m();
    }

    final boolean i()
    {
        return B > 0;
    }

    public final int j()
    {
        return G;
    }

    void j(Bundle bundle)
    {
        if (E != null)
        {
            E.l();
        }
        P = false;
        d(bundle);
        if (!P)
        {
            throw new ba((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (E != null)
        {
            E.n();
        }
    }

    public final Bundle k()
    {
        return r;
    }

    void k(Bundle bundle)
    {
        e(bundle);
        if (E != null)
        {
            android.os.Parcelable parcelable = E.k();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final i l()
    {
        Context context = n();
        if (context != null && !(context instanceof i))
        {
            throw new IllegalStateException("Fragment is not hosted in an activity");
        } else
        {
            return (i)context;
        }
    }

    public final p m()
    {
        return D;
    }

    public final Context n()
    {
        if (D == null)
        {
            return null;
        } else
        {
            return D.a();
        }
    }

    public final Resources o()
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to FragmentHost").toString());
        } else
        {
            return D.d();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        P = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        m().a(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        P = true;
    }

    public final q p()
    {
        return C;
    }

    public final q q()
    {
        if (E != null) goto _L2; else goto _L1
_L1:
        F();
        if (j < 5) goto _L4; else goto _L3
_L3:
        E.p();
_L2:
        return E;
_L4:
        if (j >= 4)
        {
            E.o();
        } else
        if (j >= 2)
        {
            E.n();
        } else
        if (j >= 1)
        {
            E.m();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final Fragment r()
    {
        return F;
    }

    public final boolean s()
    {
        return D != null && v;
    }

    public final boolean t()
    {
        return K;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        android.support.v4.c.a.a(this, stringbuilder);
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (G != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(G));
        }
        if (I != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(I);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public final boolean u()
    {
        return x;
    }

    public final boolean v()
    {
        return s() && !w() && S != null && S.getWindowToken() != null && S.getVisibility() == 0;
    }

    public final boolean w()
    {
        return J;
    }

    public void x()
    {
        if (D != null)
        {
            D.j();
        }
    }

    public ag y()
    {
        if (W != null)
        {
            return W;
        }
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to FragmentHost").toString());
        } else
        {
            Y = true;
            W = D.a(q, X, true);
            return W;
        }
    }

    public View z()
    {
        return S;
    }

}
