// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.d.d;
import android.support.v4.d.m;
import android.support.v4.view.z;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            q, s, j, ao, 
//            SuperNotCalledException, FragmentActivity, au

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    static final Object a = new Object();
    private static final m aa = new m();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    int H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    boolean M;
    ao N;
    boolean O;
    boolean P;
    Object Q;
    Object R;
    Object S;
    Object T;
    Object U;
    Object V;
    Boolean W;
    Boolean X;
    au Y;
    au Z;
    int b;
    View c;
    int d;
    Bundle e;
    SparseArray f;
    public int g;
    String h;
    public Bundle i;
    Fragment j;
    int k;
    int l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    s t;
    q u;
    s v;
    Fragment w;
    int x;
    int y;
    String z;

    public Fragment()
    {
        b = 0;
        g = -1;
        k = -1;
        F = true;
        M = true;
        Q = null;
        R = a;
        S = null;
        T = a;
        U = null;
        V = a;
        Y = null;
        Z = null;
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
            class2 = (Class)aa.get(s1);
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
        aa.put(s1, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.i = bundle;
        return context;
    }

    static boolean b(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)aa.get(s1);
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
        aa.put(s1, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public static void c()
    {
    }

    public static void d()
    {
    }

    public static void e()
    {
    }

    public static Animation h()
    {
        return null;
    }

    public static void i()
    {
    }

    public static void j()
    {
    }

    public final Resources a()
    {
        if (u == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return u.c.getResources();
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return null;
    }

    final void a(int i1, Fragment fragment)
    {
        g = i1;
        if (fragment != null)
        {
            h = (new StringBuilder()).append(fragment.h).append(":").append(g).toString();
            return;
        } else
        {
            h = (new StringBuilder("android:fragment:")).append(g).toString();
            return;
        }
    }

    public void a(Bundle bundle)
    {
        G = true;
    }

    public final void a(boolean flag)
    {
        if (F != flag)
        {
            F = flag;
            if (E && b() && !A)
            {
                u.d();
            }
        }
    }

    final View b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        if (v != null)
        {
            v.s = false;
        }
        return a(layoutinflater, viewgroup);
    }

    public void b(Bundle bundle)
    {
        G = true;
    }

    public final void b(boolean flag)
    {
        if (!M && flag && b < 4)
        {
            t.b(this);
        }
        M = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        L = flag;
    }

    public final boolean b()
    {
        return u != null && m;
    }

    final void c(Bundle bundle)
    {
        if (v != null)
        {
            android.os.Parcelable parcelable = v.h();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final LayoutInflater f()
    {
        LayoutInflater layoutinflater = u.c();
        if (v != null) goto _L2; else goto _L1
_L1:
        k();
        if (b < 5) goto _L4; else goto _L3
_L3:
        v.l();
_L2:
        android.support.v4.view.z.a(layoutinflater, v);
        return layoutinflater;
_L4:
        if (b >= 4)
        {
            v.k();
        } else
        if (b >= 2)
        {
            v.j();
        } else
        if (b > 0)
        {
            v.i();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void g()
    {
        G = true;
        android.app.Activity activity;
        if (u == null)
        {
            activity = null;
        } else
        {
            activity = u.b;
        }
        if (activity != null)
        {
            G = false;
            G = true;
        }
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    final void k()
    {
        v = new s();
        v.a(u, new j(this), this);
    }

    final void l()
    {
        if (v != null)
        {
            v.s = false;
            v.f();
        }
        G = false;
        G = true;
        if (!O)
        {
            O = true;
            if (!P)
            {
                P = true;
                N = u.a(h, O, false);
            }
            if (N != null)
            {
                N.c();
            }
        }
        if (!G)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStart()").toString());
        }
        if (v != null)
        {
            v.k();
        }
        if (N != null)
        {
            N.g();
        }
    }

    final void m()
    {
label0:
        {
            if (v != null)
            {
                v.a(2);
            }
            if (O)
            {
                O = false;
                if (!P)
                {
                    P = true;
                    N = u.a(h, O, false);
                }
                if (N != null)
                {
                    if (D)
                    {
                        break label0;
                    }
                    N.d();
                }
            }
            return;
        }
        N.e();
    }

    final void n()
    {
        if (v != null)
        {
            v.n();
        }
        G = false;
        G = true;
        if (!P)
        {
            P = true;
            N = u.a(h, O, false);
        }
        if (N != null)
        {
            N.h();
        }
        if (!G)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        G = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        FragmentActivity fragmentactivity;
        if (u == null)
        {
            fragmentactivity = null;
        } else
        {
            fragmentactivity = (FragmentActivity)u.b;
        }
        fragmentactivity.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        G = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        android.support.v4.d.d.a(this, stringbuilder);
        if (g >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(g);
        }
        if (x != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(x));
        }
        if (z != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(z);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }


    private class InstantiationException extends RuntimeException
    {

        public InstantiationException(String s1, Exception exception)
        {
            super(s1, exception);
        }
    }

}
