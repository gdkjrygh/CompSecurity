// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import am;
import an;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import cc;
import cj;
import cv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l;
import m;
import n;
import s;
import t;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{
    public static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        final Bundle a;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeBundle(a);
        }


        public SavedState(Bundle bundle)
        {
            a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            a = parcel.readBundle();
            if (classloader != null && a != null)
            {
                a.setClassLoader(classloader);
            }
        }
    }

    public static class a extends RuntimeException
    {

        public a(String s1, Exception exception)
        {
            super(s1, exception);
        }
    }


    private static final cj a = new cj();
    static final Object j = new Object();
    public boolean A;
    public int B;
    public n C;
    public FragmentActivity D;
    public n E;
    public Fragment F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ViewGroup R;
    public View S;
    public View T;
    public boolean U;
    public boolean V;
    public t W;
    boolean X;
    boolean Y;
    Object Z;
    Object aa;
    Object ab;
    Object ac;
    Object ad;
    Object ae;
    Boolean af;
    Boolean ag;
    public am ah;
    public am ai;
    public int k;
    public View l;
    public int m;
    public Bundle n;
    public SparseArray o;
    public int p;
    public String q;
    Bundle r;
    public Fragment s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Fragment()
    {
        k = 0;
        p = -1;
        t = -1;
        O = true;
        V = true;
        Z = null;
        aa = j;
        ab = null;
        ac = j;
        ad = null;
        ae = j;
        ah = null;
        ai = null;
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
            throw new a((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
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

    public static boolean b(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)a.get(s1);
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
        a.put(s1, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public void A()
    {
        P = true;
    }

    public void B()
    {
        P = true;
        if (!Y)
        {
            Y = true;
            W = D.getLoaderManager(q, X, false);
        }
        if (W != null)
        {
            W.h();
        }
    }

    public void C()
    {
        p = -1;
        q = null;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = 0;
        C = null;
        E = null;
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

    public void D()
    {
    }

    public Object E()
    {
        return Z;
    }

    public Object F()
    {
        if (aa == j)
        {
            return E();
        } else
        {
            return aa;
        }
    }

    public Object G()
    {
        return ab;
    }

    public Object H()
    {
        if (ac == j)
        {
            return G();
        } else
        {
            return ac;
        }
    }

    public Object I()
    {
        return ad;
    }

    public Object J()
    {
        if (ae == j)
        {
            return I();
        } else
        {
            return ae;
        }
    }

    public boolean K()
    {
        if (ag == null)
        {
            return true;
        } else
        {
            return ag.booleanValue();
        }
    }

    public boolean L()
    {
        if (af == null)
        {
            return true;
        } else
        {
            return af.booleanValue();
        }
    }

    void M()
    {
        E = new n();
        E.a(D, new l() {

            final Fragment a;

            public View a(int i1)
            {
                if (a.S == null)
                {
                    throw new IllegalStateException("Fragment does not have a view");
                } else
                {
                    return a.S.findViewById(i1);
                }
            }

            public boolean a()
            {
                return a.S != null;
            }

            
            {
                a = Fragment.this;
                super();
            }
        }, this);
    }

    public void N()
    {
        if (E != null)
        {
            E.l();
            E.h();
        }
        P = false;
        g();
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onStart()").toString());
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

    public void O()
    {
        if (E != null)
        {
            E.l();
            E.h();
        }
        P = false;
        z();
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onResume()").toString());
        }
        if (E != null)
        {
            E.p();
            E.h();
        }
    }

    public void P()
    {
        onLowMemory();
        if (E != null)
        {
            E.v();
        }
    }

    public void Q()
    {
        if (E != null)
        {
            E.q();
        }
        P = false;
        A();
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }

    public void R()
    {
        if (E != null)
        {
            E.r();
        }
        P = false;
        h();
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    public void S()
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
                    W = D.getLoaderManager(q, X, false);
                }
                if (W != null)
                {
                    if (D.mRetaining)
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

    public void T()
    {
        if (E != null)
        {
            E.t();
        }
        P = false;
        i();
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (W != null)
        {
            W.f();
        }
    }

    public void U()
    {
        if (E != null)
        {
            E.u();
        }
        P = false;
        B();
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onDestroy()").toString());
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

    public void a(int i1, int j1, Intent intent)
    {
    }

    public final void a(int i1, Fragment fragment)
    {
        p = i1;
        if (fragment != null)
        {
            q = (new StringBuilder()).append(fragment.q).append(":").append(p).toString();
            return;
        } else
        {
            q = (new StringBuilder()).append("android:fragment:").append(p).toString();
            return;
        }
    }

    public void a(Activity activity)
    {
        P = true;
    }

    public void a(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        P = true;
    }

    public void a(Intent intent)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            D.startActivityFromFragment(this, intent, -1);
            return;
        }
    }

    public void a(Intent intent, int i1)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            D.startActivityFromFragment(this, intent, i1);
            return;
        }
    }

    public void a(Configuration configuration)
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

    public void a(SavedState savedstate)
    {
        if (p >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (savedstate != null && savedstate.a != null)
        {
            savedstate = savedstate.a;
        } else
        {
            savedstate = null;
        }
        n = savedstate;
    }

    public void a(Fragment fragment, int i1)
    {
        s = fragment;
        u = i1;
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
        printwriter.print(k);
        printwriter.print(" mIndex=");
        printwriter.print(p);
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
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(n);
        }
        if (o != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(o);
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
        if (l != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(l);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(m);
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

    public LayoutInflater b(Bundle bundle)
    {
        bundle = D.getLayoutInflater().cloneInContext(D);
        q();
        cv.a(bundle, E.w());
        return bundle;
    }

    public View b(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
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

    public boolean b(Menu menu, MenuInflater menuinflater)
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

    public final String b_(int i1)
    {
        return o().getString(i1);
    }

    public boolean c(Menu menu)
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

    public boolean c(MenuItem menuitem)
    {
        while (!J && (N && O && a(menuitem) || E != null && E.a(menuitem))) 
        {
            return true;
        }
        return false;
    }

    public final boolean c_()
    {
        return B > 0;
    }

    public void d(Bundle bundle)
    {
        P = true;
    }

    public void d(Menu menu)
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
    }

    public boolean d(MenuItem menuitem)
    {
        while (!J && (b(menuitem) || E != null && E.b(menuitem))) 
        {
            return true;
        }
        return false;
    }

    public void e(Bundle bundle)
    {
    }

    public void e(boolean flag)
    {
        if (flag && F != null)
        {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        } else
        {
            L = flag;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public void f()
    {
        P = true;
    }

    public final void f(Bundle bundle)
    {
        if (o != null)
        {
            T.restoreHierarchyState(o);
            o = null;
        }
        P = false;
        h(bundle);
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onViewStateRestored()").toString());
        } else
        {
            return;
        }
    }

    public void f(boolean flag)
    {
        if (N != flag)
        {
            N = flag;
            if (r() && !v())
            {
                D.supportInvalidateOptionsMenu();
            }
        }
    }

    public void g()
    {
        P = true;
        if (!X)
        {
            X = true;
            if (!Y)
            {
                Y = true;
                W = D.getLoaderManager(q, X, false);
            }
            if (W != null)
            {
                W.b();
            }
        }
    }

    public void g(Bundle bundle)
    {
        if (p >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            r = bundle;
            return;
        }
    }

    public void g(boolean flag)
    {
        if (O != flag)
        {
            O = flag;
            if (N && r() && !v())
            {
                D.supportInvalidateOptionsMenu();
            }
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

    public void h(boolean flag)
    {
        if (!V && flag && k < 4)
        {
            C.b(this);
        }
        V = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        U = flag;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public void i()
    {
        P = true;
    }

    public void i(Bundle bundle)
    {
        if (E != null)
        {
            E.l();
        }
        P = false;
        a(bundle);
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                if (E == null)
                {
                    M();
                }
                E.a(bundle, null);
                E.m();
            }
        }
    }

    public void j(Bundle bundle)
    {
        if (E != null)
        {
            E.l();
        }
        P = false;
        d(bundle);
        if (!P)
        {
            throw new an((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (E != null)
        {
            E.n();
        }
    }

    public final String k()
    {
        return I;
    }

    public void k(Bundle bundle)
    {
        e(bundle);
        if (E != null)
        {
            Parcelable parcelable = E.k();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final Bundle l()
    {
        return r;
    }

    public final Fragment m()
    {
        return s;
    }

    public final FragmentActivity n()
    {
        return D;
    }

    public final Resources o()
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            return D.getResources();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        P = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        n().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        P = true;
    }

    public final m p()
    {
        return C;
    }

    public final m q()
    {
        if (E != null) goto _L2; else goto _L1
_L1:
        M();
        if (k < 5) goto _L4; else goto _L3
_L3:
        E.p();
_L2:
        return E;
_L4:
        if (k >= 4)
        {
            E.o();
        } else
        if (k >= 2)
        {
            E.n();
        } else
        if (k >= 1)
        {
            E.m();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean r()
    {
        return D != null && v;
    }

    public final boolean s()
    {
        return K;
    }

    public final boolean t()
    {
        return w;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        cc.a(this, stringbuilder);
        if (p >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(p);
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
        return r() && !v() && S != null && S.getWindowToken() != null && S.getVisibility() == 0;
    }

    public final boolean v()
    {
        return J;
    }

    public final boolean w()
    {
        return L;
    }

    public s x()
    {
        if (W != null)
        {
            return W;
        }
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            Y = true;
            W = D.getLoaderManager(q, X, true);
            return W;
        }
    }

    public View y()
    {
        return S;
    }

    public void z()
    {
        P = true;
    }

}
