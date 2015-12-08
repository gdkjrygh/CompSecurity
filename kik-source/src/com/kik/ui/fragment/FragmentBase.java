// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.ui.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.h.a;
import com.kik.h.d;
import com.kik.sdkutils.y;
import kik.android.chat.KikApplication;
import kik.android.util.an;
import kik.android.util.bx;
import kik.android.widget.cw;

// Referenced classes of package com.kik.ui.fragment:
//            d, b, c, a

public abstract class FragmentBase extends Fragment
    implements com.kik.h.a, d
{
    public static class a extends an
    {

        public final a a(int l)
        {
            int i1 = l;
            if (l == 0)
            {
                i1 = com.kik.ui.fragment.a.a;
            }
            a("com.kik.ui.fragment.FragmentBundle.onWebStack", i1 - 1);
            return this;
        }

        public final int h()
        {
            int l = b("com.kik.ui.fragment.FragmentBundle.onWebStack", com.kik.ui.fragment.a.a - 1);
            if (l >= 0 && l < com.kik.ui.fragment.a.a().length)
            {
                return com.kik.ui.fragment.a.a()[l];
            } else
            {
                return com.kik.ui.fragment.a.a;
            }
        }

        public a()
        {
        }
    }

    public static final class a.a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private Bundle a;
    private boolean b;
    private p c;
    private int d;
    private View e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private f j;
    private boolean k;
    protected final int u = 1;
    protected InputMethodManager v;
    protected cw w;

    public FragmentBase()
    {
        b = false;
        c = new p();
        d = 2;
        e = null;
        f = false;
        g = false;
        h = false;
        i = false;
        j = new f();
        k = false;
    }

    public static transient String a(int l, Object aobj[])
    {
        return KikApplication.a(l, aobj);
    }

    static void a(FragmentBase fragmentbase)
    {
        if (fragmentbase.f) goto _L2; else goto _L1
_L1:
        fragmentbase.D();
        fragmentbase.d;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 42
    //                   2 60;
           goto _L3 _L4 _L5
_L3:
        fragmentbase.f = true;
_L2:
        return;
_L4:
        if (fragmentbase.e != null)
        {
            fragmentbase.a(fragmentbase.e);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        View view1 = fragmentbase.e;
        View view = view1;
        if (view1 == null)
        {
            view = fragmentbase.getView();
        }
        fragmentbase.b(view);
        if (true) goto _L3; else goto _L6
_L6:
    }

    public static String b(int l)
    {
        return KikApplication.f(l);
    }

    private void c()
    {
        if (g || h)
        {
            return;
        }
        g = true;
        if (b)
        {
            c.a(a);
            return;
        } else
        {
            c.e();
            return;
        }
    }

    public boolean A()
    {
        return false;
    }

    public boolean B()
    {
        return false;
    }

    protected int C()
    {
        return 16;
    }

    public final void D()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.getWindow().setSoftInputMode(C());
        }
    }

    public final p E()
    {
        return c;
    }

    public final void F()
    {
        f = true;
    }

    protected final void G()
    {
        f = false;
    }

    public final p H()
    {
        h = true;
        return c;
    }

    protected boolean I()
    {
        return i;
    }

    public final void J()
    {
        c();
        FragmentManager fragmentmanager = getFragmentManager();
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentmanager != null && fragmentmanager.getBackStackEntryCount() > 0)
        {
            fragmentmanager.popBackStack();
        } else
        if (fragmentactivity != null)
        {
            fragmentactivity.finish();
            return;
        }
    }

    protected int K()
    {
        return 0;
    }

    protected void L()
    {
        if (w != null)
        {
            w.a(this);
            b(((View) (null)));
        }
    }

    public boolean M()
    {
        return false;
    }

    public final int N()
    {
        boolean flag = false;
        int l = ((flag) ? 1 : 0);
        if (com.kik.sdkutils.y.a(19))
        {
            l = ((flag) ? 1 : 0);
            if (M())
            {
                int i1 = getResources().getIdentifier("status_bar_height", "dimen", "android");
                l = ((flag) ? 1 : 0);
                if (i1 > 0)
                {
                    l = getResources().getDimensionPixelSize(i1);
                }
            }
        }
        return l;
    }

    protected final boolean O()
    {
        return k;
    }

    protected final void P()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.onWindowAttributesChanged(fragmentactivity.getWindow().getAttributes());
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        a = bundle;
        b = true;
    }

    public void a(View view)
    {
        a(view, false);
    }

    public final void a(View view, int l)
    {
        e = view;
        d = l;
    }

    public final void a(View view, boolean flag)
    {
        if (v == null || view == null)
        {
            return;
        } else
        {
            view.post(new com.kik.ui.fragment.d(this, view, flag));
            return;
        }
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public void b(View view)
    {
        Object obj = getActivity();
        if (obj != null && v != null)
        {
            obj = ((Activity) (obj)).getCurrentFocus();
            if (obj != null)
            {
                view = ((View) (obj));
            }
            if (view != null && v != null)
            {
                v.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
                v.hideSoftInputFromWindow(null, 0);
                return;
            }
        }
    }

    protected final void c(int l)
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.setRequestedOrientation(l);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        a(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        v = (InputMethodManager)getActivity().getSystemService("input_method");
    }

    public void onDestroy()
    {
        j.a();
        c();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        f = false;
        super.onDestroyView();
    }

    public void onResume()
    {
        super.onResume();
        if (f)
        {
            return;
        }
        View view = getView();
        if (view != null)
        {
            view.post(new b(this));
            view.postDelayed(new c(this), 200L);
            return;
        } else
        {
            bx.f(new IllegalStateException("Trying to handle keyboard for fragment without view"));
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (view != null)
        {
            bundle = view.findViewById(0x7f0e001d);
            if (bundle != null)
            {
                bundle.setOnClickListener(new com.kik.ui.fragment.a(this));
            }
            view = (TextView)view.findViewById(0x7f0e0078);
            if (view != null && K() != 0)
            {
                view.setText(K());
            }
        }
    }

    public boolean v()
    {
        J();
        return true;
    }

    public int y()
    {
        return KikApplication.e(0x7f0c0078);
    }
}
