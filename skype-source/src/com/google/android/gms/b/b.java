// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.j;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.b:
//            a, e

public abstract class b
{
    private static interface a
    {

        public abstract int a();

        public abstract void b();
    }


    private com.google.android.gms.b.a a;
    private Bundle b;
    private LinkedList c;
    private final com.google.android.gms.b.e d = new com.google.android.gms.b.e() {

        final b a;

        public final void a(com.google.android.gms.b.a a1)
        {
            b.a(a, a1);
            for (a1 = b.a(a).iterator(); a1.hasNext(); ((a)a1.next()).b()) { }
            b.a(a).clear();
            b.c(a);
        }

            
            {
                a = b.this;
                super();
            }
    };

    public b()
    {
    }

    static com.google.android.gms.b.a a(b b1, com.google.android.gms.b.a a1)
    {
        b1.a = a1;
        return a1;
    }

    static LinkedList a(b b1)
    {
        return b1.c;
    }

    private void a(int i)
    {
        for (; !c.isEmpty() && ((a)c.getLast()).a() >= i; c.removeLast()) { }
    }

    private void a(Bundle bundle, a a1)
    {
        if (a != null)
        {
            a1.b();
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(a1);
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

    public static void a(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = com.google.android.gms.common.e.a(context);
        String s1 = j.a(context, i, com.google.android.gms.common.e.g(context));
        String s = j.a(context, i);
        LinearLayout linearlayout = new LinearLayout(framelayout.getContext());
        linearlayout.setOrientation(1);
        linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.addView(linearlayout);
        framelayout = new TextView(framelayout.getContext());
        framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.setText(s1);
        linearlayout.addView(framelayout);
        if (s != null)
        {
            framelayout = new Button(context);
            framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.setText(s);
            linearlayout.addView(framelayout);
            framelayout.setOnClickListener(new android.view.View.OnClickListener(context, i) {

                final Context a;
                final int b;

                public final void onClick(View view)
                {
                    a.startActivity(com.google.android.gms.common.e.a(b));
                }

            
            {
                a = context;
                b = i;
                super();
            }
            });
        }
    }

    static com.google.android.gms.b.a b(b b1)
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
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final FrameLayout a;
            final LayoutInflater b;
            final ViewGroup c;
            final Bundle d;
            final b e;

            public final int a()
            {
                return 2;
            }

            public final void b()
            {
                a.removeAllViews();
                a.addView(b.b(e).a(b, c, d));
            }

            
            {
                e = b.this;
                a = framelayout;
                b = layoutinflater;
                c = viewgroup;
                d = bundle;
                super();
            }
        });
        if (a == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public final com.google.android.gms.b.a a()
    {
        return a;
    }

    public final void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final Activity a;
            final Bundle b;
            final Bundle c;
            final b d;

            public final int a()
            {
                return 0;
            }

            public final void b()
            {
                b.b(d).a(a, b, c);
            }

            
            {
                d = b.this;
                a = activity;
                b = bundle;
                c = bundle1;
                super();
            }
        });
    }

    public final void a(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final Bundle a;
            final b b;

            public final int a()
            {
                return 1;
            }

            public final void b()
            {
                b.b(b).a(a);
            }

            
            {
                b = b.this;
                a = bundle;
                super();
            }
        });
    }

    protected abstract void a(com.google.android.gms.b.e e1);

    public final void b()
    {
        a(((Bundle) (null)), new a() {

            final b a;

            public final int a()
            {
                return 5;
            }

            public final void b()
            {
                b.b(a).a();
            }

            
            {
                a = b.this;
                super();
            }
        });
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
