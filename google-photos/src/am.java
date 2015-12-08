// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
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

public class am
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final jz a = new jz();
    static final Object i = new Object();
    int A;
    public bb B;
    ax C;
    bb D;
    public am E;
    public int F;
    int G;
    public String H;
    boolean I;
    public boolean J;
    public boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    int P;
    ViewGroup Q;
    public View R;
    View S;
    boolean T;
    public boolean U;
    cb V;
    boolean W;
    boolean X;
    Object Y;
    Object Z;
    Object aa;
    du ab;
    du ac;
    private Object b;
    private Object c;
    private Object d;
    int j;
    View k;
    int l;
    Bundle m;
    SparseArray n;
    int o;
    String p;
    public Bundle q;
    public am r;
    int s;
    public int t;
    boolean u;
    public boolean v;
    public boolean w;
    boolean x;
    boolean y;
    boolean z;

    public am()
    {
        j = 0;
        o = -1;
        s = -1;
        N = true;
        U = true;
        b = null;
        Y = i;
        c = null;
        Z = i;
        d = null;
        aa = i;
        ab = null;
        ac = null;
    }

    public static void P_()
    {
    }

    public static void Q_()
    {
    }

    public static am a(Context context, String s1)
    {
        return a(context, s1, ((Bundle) (null)));
    }

    public static am a(Context context, String s1, Bundle bundle)
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
            throw new ao((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new ao((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new ao((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        context = (am)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.q = bundle;
        return context;
    }

    static boolean b(Context context, String s1)
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
        flag = am.isAssignableFrom(class1);
        return flag;
    }

    public Context G_()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.b;
        }
    }

    public final ar O_()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return (ar)C.a;
        }
    }

    final void R_()
    {
        D = new bb();
        D.a(C, new an(this), this);
    }

    final void S_()
    {
label0:
        {
            if (D != null)
            {
                D.a(2, false);
            }
            if (W)
            {
                W = false;
                if (!X)
                {
                    X = true;
                    V = C.a(p, W, false);
                }
                if (V != null)
                {
                    if (L)
                    {
                        break label0;
                    }
                    V.c();
                }
            }
            return;
        }
        V.d();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public final String a(int i1)
    {
        return g().getString(i1);
    }

    public final transient String a(int i1, Object aobj[])
    {
        return g().getString(i1, aobj);
    }

    public void a(int i1, int j1, Intent intent)
    {
    }

    final void a(int i1, am am1)
    {
        o = i1;
        if (am1 != null)
        {
            p = (new StringBuilder()).append(am1.p).append(":").append(o).toString();
            return;
        } else
        {
            p = (new StringBuilder("android:fragment:")).append(o).toString();
            return;
        }
    }

    public void a(int i1, String as[], int ai[])
    {
    }

    public void a(am am1, int i1)
    {
        r = am1;
        t = i1;
    }

    public void a(Activity activity)
    {
        O = true;
    }

    public final void a(Intent intent)
    {
        if (C == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            C.a(this, intent, -1);
            return;
        }
    }

    public final void a(Intent intent, int i1)
    {
        if (C == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            C.a(this, intent, i1);
            return;
        }
    }

    public void a(Bundle bundle)
    {
        O = true;
    }

    public final void a(AttributeSet attributeset, Bundle bundle)
    {
        O = true;
        if (C == null)
        {
            attributeset = null;
        } else
        {
            attributeset = C.a;
        }
        if (attributeset != null)
        {
            O = false;
            O = true;
        }
    }

    public void a(Menu menu)
    {
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
    }

    public void a(View view, Bundle bundle)
    {
    }

    public final void a(ap ap1)
    {
        if (o >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (ap1 != null && ap1.a != null)
        {
            ap1 = ap1.a;
        } else
        {
            ap1 = null;
        }
        m = ap1;
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(F));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(G));
        printwriter.print(" mTag=");
        printwriter.println(H);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(j);
        printwriter.print(" mIndex=");
        printwriter.print(o);
        printwriter.print(" mWho=");
        printwriter.print(p);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(A);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(u);
        printwriter.print(" mRemoving=");
        printwriter.print(v);
        printwriter.print(" mResumed=");
        printwriter.print(w);
        printwriter.print(" mFromLayout=");
        printwriter.print(x);
        printwriter.print(" mInLayout=");
        printwriter.println(y);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(I);
        printwriter.print(" mDetached=");
        printwriter.print(J);
        printwriter.print(" mMenuVisible=");
        printwriter.print(N);
        printwriter.print(" mHasMenu=");
        printwriter.println(M);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(K);
        printwriter.print(" mRetaining=");
        printwriter.print(L);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(U);
        if (B != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(B);
        }
        if (C != null)
        {
            printwriter.print(s1);
            printwriter.print("mHost=");
            printwriter.println(C);
        }
        if (E != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(E);
        }
        if (q != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(q);
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
        if (r != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(r);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(t);
        }
        if (P != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(P);
        }
        if (Q != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(Q);
        }
        if (R != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(R);
        }
        if (S != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(R);
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
        if (V != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            V.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (D != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder("Child ")).append(D).append(":").toString());
            D.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public boolean a_(MenuItem menuitem)
    {
        return false;
    }

    public void aj_()
    {
        O = true;
    }

    public void ak_()
    {
        O = true;
    }

    public void au_()
    {
        O = true;
        if (!W)
        {
            W = true;
            if (!X)
            {
                X = true;
                V = C.a(p, W, false);
            }
            if (V != null)
            {
                V.b();
            }
        }
    }

    public LayoutInflater b(Bundle bundle)
    {
        bundle = C.c();
        h();
        lc.a(bundle, D);
        return bundle;
    }

    final View b(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (D != null)
        {
            D.noteStateNotSaved();
        }
        return a(layoutinflater, viewgroup, bundle);
    }

    public boolean b(MenuItem menuitem)
    {
        return false;
    }

    public final void c(boolean flag)
    {
        if (E != null)
        {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        } else
        {
            K = true;
            return;
        }
    }

    public void d(Bundle bundle)
    {
        O = true;
    }

    public final void d(boolean flag)
    {
        if (!M)
        {
            M = true;
            if (i() && !I)
            {
                C.d();
            }
        }
    }

    public void e(Bundle bundle)
    {
    }

    public final void e(boolean flag)
    {
        if (N != flag)
        {
            N = flag;
            if (M && i() && !I)
            {
                C.d();
            }
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final void f(Bundle bundle)
    {
        if (o >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            q = bundle;
            return;
        }
    }

    public final Resources g()
    {
        if (C == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return C.b.getResources();
        }
    }

    public Animation g(boolean flag)
    {
        return null;
    }

    public void g(Bundle bundle)
    {
        O = true;
    }

    public void g_(boolean flag)
    {
        if (!U && flag && j < 4)
        {
            B.b(this);
        }
        U = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        T = flag;
    }

    public final ay h()
    {
        if (D != null) goto _L2; else goto _L1
_L1:
        R_();
        if (j < 5) goto _L4; else goto _L3
_L3:
        D.o();
_L2:
        return D;
_L4:
        if (j >= 4)
        {
            D.n();
        } else
        if (j >= 2)
        {
            D.m();
        } else
        if (j > 0)
        {
            D.l();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final void h(Bundle bundle)
    {
        e(bundle);
        if (D != null)
        {
            android.os.Parcelable parcelable = D.k();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public final boolean i()
    {
        return C != null && u;
    }

    public final bz k()
    {
        if (V != null)
        {
            return V;
        }
        if (C == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            X = true;
            V = C.a(p, W, true);
            return V;
        }
    }

    public void l()
    {
        O = true;
    }

    public void m()
    {
        O = true;
    }

    public void n()
    {
        O = true;
        if (!X)
        {
            X = true;
            V = C.a(p, W, false);
        }
        if (V != null)
        {
            V.g();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        O = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        O_().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        O = true;
    }

    public void s_()
    {
        O = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        b.a(this, stringbuilder);
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (F != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(F));
        }
        if (H != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(H);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
