// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import aa;
import ac;
import am;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import ao;
import ci;
import he;
import hs;
import iu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import u;
import x;
import z;

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final hs a = new hs();
    public static final Object c = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public ViewGroup L;
    public View M;
    public View N;
    public boolean O;
    public boolean P;
    public ao Q;
    public boolean R;
    public boolean S;
    public Object T;
    public Object U;
    public Object V;
    public ci W;
    public ci X;
    public int d;
    public View e;
    public int f;
    public Bundle g;
    public SparseArray h;
    public int i;
    public String j;
    public Bundle k;
    public Fragment l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public ac v;
    public z w;
    public ac x;
    public Fragment y;
    public int z;

    public Fragment()
    {
        d = 0;
        i = -1;
        m = -1;
        I = true;
        P = true;
        T = c;
        U = c;
        V = c;
        W = null;
        X = null;
    }

    public static void C()
    {
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
            throw new InstantiationException((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new InstantiationException((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
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
        context.k = bundle;
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

    public static void r()
    {
    }

    public static void v()
    {
    }

    public static Animation x()
    {
        return null;
    }

    public void A()
    {
        J = true;
    }

    public void B()
    {
        J = true;
        if (!S)
        {
            S = true;
            Q = w.a(j, R, false);
        }
        if (Q != null)
        {
            Q.g();
        }
    }

    public final void D()
    {
        x = new ac();
        x.a(w, new x() {

            private Fragment a;

            public final View a(int i1)
            {
                if (a.M == null)
                {
                    throw new IllegalStateException("Fragment does not have a view");
                } else
                {
                    return a.M.findViewById(i1);
                }
            }

            public final boolean a()
            {
                return a.M != null;
            }

            
            {
                a = Fragment.this;
                super();
            }
        }, this);
    }

    public final void E()
    {
label0:
        {
            if (x != null)
            {
                x.c(2);
            }
            if (R)
            {
                R = false;
                if (!S)
                {
                    S = true;
                    Q = w.a(j, R, false);
                }
                if (Q != null)
                {
                    if (!G)
                    {
                        break label0;
                    }
                    Q.d();
                }
            }
            return;
        }
        Q.c();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public final CharSequence a(int i1)
    {
        return l().getText(i1);
    }

    public final transient String a(int i1, Object aobj[])
    {
        return l().getString(i1, aobj);
    }

    public void a(int i1, int j1, Intent intent)
    {
    }

    public final void a(int i1, Fragment fragment)
    {
        i = i1;
        if (fragment != null)
        {
            j = (new StringBuilder()).append(fragment.j).append(":").append(i).toString();
            return;
        } else
        {
            j = (new StringBuilder("android:fragment:")).append(i).toString();
            return;
        }
    }

    public void a(Activity activity)
    {
        J = true;
    }

    public void a(Context context)
    {
        J = true;
        if (w == null)
        {
            context = null;
        } else
        {
            context = w.a;
        }
        if (context != null)
        {
            J = false;
            a(((Activity) (context)));
        }
    }

    public final void a(Intent intent)
    {
        if (w == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            w.a(this, intent, -1);
            return;
        }
    }

    public final void a(Intent intent, int i1)
    {
        if (w == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            w.a(this, intent, i1);
            return;
        }
    }

    public void a(Bundle bundle)
    {
        J = true;
    }

    public final void a(SavedState savedstate)
    {
        if (i >= 0)
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
        g = savedstate;
    }

    public void a(Fragment fragment, int i1)
    {
        l = fragment;
        n = i1;
    }

    public void a(Menu menu)
    {
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
    }

    public final void a(View view)
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
        printwriter.print(Integer.toHexString(z));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(A));
        printwriter.print(" mTag=");
        printwriter.println(B);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(d);
        printwriter.print(" mIndex=");
        printwriter.print(i);
        printwriter.print(" mWho=");
        printwriter.print(j);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(u);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(o);
        printwriter.print(" mRemoving=");
        printwriter.print(p);
        printwriter.print(" mResumed=");
        printwriter.print(q);
        printwriter.print(" mFromLayout=");
        printwriter.print(r);
        printwriter.print(" mInLayout=");
        printwriter.println(s);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(C);
        printwriter.print(" mDetached=");
        printwriter.print(D);
        printwriter.print(" mMenuVisible=");
        printwriter.print(I);
        printwriter.print(" mHasMenu=");
        printwriter.println(H);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(E);
        printwriter.print(" mRetaining=");
        printwriter.print(F);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(P);
        if (v != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(v);
        }
        if (w != null)
        {
            printwriter.print(s1);
            printwriter.print("mHost=");
            printwriter.println(w);
        }
        if (y != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(y);
        }
        if (k != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(k);
        }
        if (g != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(g);
        }
        if (h != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(h);
        }
        if (l != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(l);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(n);
        }
        if (K != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(K);
        }
        if (L != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(L);
        }
        if (M != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(M);
        }
        if (N != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(M);
        }
        if (e != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(e);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(f);
        }
        if (Q != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            Q.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (x != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder("Child ")).append(x).append(":").toString());
            x.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public final void a(boolean flag)
    {
        if (H != flag)
        {
            H = flag;
            if (o() && !C)
            {
                w.d();
            }
        }
    }

    public LayoutInflater b(Bundle bundle)
    {
        bundle = w.c();
        n();
        iu.a(bundle, x);
        return bundle;
    }

    public final View b(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (x != null)
        {
            x.j = false;
        }
        return a(layoutinflater, viewgroup, bundle);
    }

    public final String b(int i1)
    {
        return l().getString(i1);
    }

    public final void b(boolean flag)
    {
        if (I != flag)
        {
            I = flag;
            if (H && o() && !C)
            {
                w.d();
            }
        }
    }

    public void c()
    {
        J = true;
        if (!R)
        {
            R = true;
            if (!S)
            {
                S = true;
                Q = w.a(j, R, false);
            }
            if (Q != null)
            {
                Q.b();
            }
        }
    }

    public final void c_(boolean flag)
    {
        if (!P && flag && d < 4)
        {
            v.b(this);
        }
        P = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        O = flag;
    }

    public void d()
    {
        J = true;
    }

    public void d(Bundle bundle)
    {
        J = true;
    }

    public void e()
    {
        J = true;
    }

    public void e(Bundle bundle)
    {
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final String f()
    {
        return B;
    }

    public final void f(Bundle bundle)
    {
        if (i >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            k = bundle;
            return;
        }
    }

    public final Bundle g()
    {
        return k;
    }

    public final void g(Bundle bundle)
    {
        e(bundle);
        if (x != null)
        {
            Parcelable parcelable = x.k();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final Fragment h()
    {
        return l;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public final int i()
    {
        return n;
    }

    public Context j()
    {
        if (w == null)
        {
            return null;
        } else
        {
            return w.b;
        }
    }

    public final u k()
    {
        if (w == null)
        {
            return null;
        } else
        {
            return (u)w.a;
        }
    }

    public final Resources l()
    {
        if (w == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return w.b.getResources();
        }
    }

    public final aa m()
    {
        return v;
    }

    public final aa n()
    {
        if (x != null) goto _L2; else goto _L1
_L1:
        D();
        if (d < 5) goto _L4; else goto _L3
_L3:
        x.o();
_L2:
        return x;
_L4:
        if (d >= 4)
        {
            x.n();
        } else
        if (d >= 2)
        {
            x.m();
        } else
        if (d > 0)
        {
            x.l();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean o()
    {
        return w != null && o;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        J = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        k().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        J = true;
    }

    public final boolean p()
    {
        return D;
    }

    public final boolean q()
    {
        return q;
    }

    public final void s()
    {
        if (y != null)
        {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        } else
        {
            E = true;
            return;
        }
    }

    public final boolean t()
    {
        return E;
    }

    public void t_()
    {
        J = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        he.a(this, stringbuilder);
        if (i >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(i);
        }
        if (z != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(z));
        }
        if (B != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(B);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public final am u()
    {
        if (Q != null)
        {
            return Q;
        }
        if (w == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            S = true;
            Q = w.a(j, R, true);
            return Q;
        }
    }

    public final void w()
    {
        J = true;
        Activity activity;
        if (w == null)
        {
            activity = null;
        } else
        {
            activity = w.a;
        }
        if (activity != null)
        {
            J = false;
            J = true;
        }
    }

    public final View y()
    {
        return M;
    }

    public void z()
    {
        J = true;
    }


    private class InstantiationException extends RuntimeException
    {

        public InstantiationException(String s1, Exception exception)
        {
            super(s1, exception);
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        public final Bundle a;

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

        SavedState(Parcel parcel)
        {
            a = parcel.readBundle();
        }
    }

}
