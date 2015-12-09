// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.e;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.b:
//            c, i, f, g, 
//            d, e, h, a, 
//            n

public abstract class b
{

    private a a;
    private Bundle b;
    private LinkedList c;
    private final n d = new c(this);

    public b()
    {
    }

    static a a(b b1, a a1)
    {
        b1.a = a1;
        return a1;
    }

    static LinkedList a(b b1)
    {
        return b1.c;
    }

    private void a(int j)
    {
        for (; !c.isEmpty() && ((i)c.getLast()).a() >= j; c.removeLast()) { }
    }

    private void a(Bundle bundle, i j)
    {
        if (a != null)
        {
            j.b();
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(j);
        if (bundle != null)
        {
            if (b == null)
            {
                b = (Bundle)bundle.clone();
            } else
            {
                b.putAll(bundle);
            }
        }
        a(d);
    }

    static a b(b b1)
    {
        return b1.a;
    }

    static Bundle c(b b1)
    {
        b1.b = null;
        return null;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, ((i) (new f(this, framelayout, layoutinflater, viewgroup, bundle))));
        if (a == null)
        {
            layoutinflater = framelayout.getContext();
            int j = com.google.android.gms.common.e.a(layoutinflater);
            String s = com.google.android.gms.common.e.b(layoutinflater, j);
            viewgroup = com.google.android.gms.common.e.c(layoutinflater, j);
            bundle = new LinearLayout(framelayout.getContext());
            bundle.setOrientation(1);
            bundle.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.addView(bundle);
            TextView textview = new TextView(framelayout.getContext());
            textview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            textview.setText(s);
            bundle.addView(textview);
            if (viewgroup != null)
            {
                Button button = new Button(layoutinflater);
                button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                button.setText(viewgroup);
                bundle.addView(button);
                button.setOnClickListener(new g(layoutinflater, j));
            }
        }
        return framelayout;
    }

    public final a a()
    {
        return a;
    }

    public final void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, ((i) (new d(this, activity, bundle, bundle1))));
    }

    public final void a(Bundle bundle)
    {
        a(bundle, ((i) (new com.google.android.gms.b.e(this, bundle))));
    }

    protected abstract void a(n n);

    public final void b()
    {
        a(((Bundle) (null)), new h(this));
    }

    public final void b(Bundle bundle)
    {
        if (a != null)
        {
            a.b(bundle);
        } else
        if (b != null)
        {
            bundle.putAll(b);
            return;
        }
    }

    public final void c()
    {
        if (a != null)
        {
            a.b();
            return;
        } else
        {
            a(5);
            return;
        }
    }

    public final void d()
    {
        if (a != null)
        {
            a.c();
            return;
        } else
        {
            a(2);
            return;
        }
    }

    public final void e()
    {
        if (a != null)
        {
            a.d();
            return;
        } else
        {
            a(1);
            return;
        }
    }

    public final void f()
    {
        if (a != null)
        {
            a.e();
        }
    }
}
