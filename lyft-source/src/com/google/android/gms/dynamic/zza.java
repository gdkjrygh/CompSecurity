// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzf;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            LifecycleDelegate, zzf

public abstract class zza
{

    private LifecycleDelegate a;
    private Bundle b;
    private LinkedList c;
    private final com.google.android.gms.dynamic.zzf d = new com.google.android.gms.dynamic.zzf() {

        final com.google.android.gms.dynamic.zza a;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.zza.a(a, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.zza.a(a).iterator(); lifecycledelegate.hasNext(); ((zza)lifecycledelegate.next()).a(com.google.android.gms.dynamic.zza.b(a))) { }
            com.google.android.gms.dynamic.zza.a(a).clear();
            com.google.android.gms.dynamic.zza.a(a, null);
        }

            
            {
                a = zza.this;
                super();
            }
    };

    public zza()
    {
    }

    static Bundle a(zza zza1, Bundle bundle)
    {
        zza1.b = bundle;
        return bundle;
    }

    static LifecycleDelegate a(zza zza1, LifecycleDelegate lifecycledelegate)
    {
        zza1.a = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(zza zza1)
    {
        return zza1.c;
    }

    private void a(int i)
    {
        for (; !c.isEmpty() && ((zza)c.getLast()).a() >= i; c.removeLast()) { }
    }

    private void a(Bundle bundle, zza zza1)
    {
        if (a != null)
        {
            zza1.a(a);
            return;
        }
        if (c == null)
        {
            c = new LinkedList();
        }
        c.add(zza1);
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

    static LifecycleDelegate b(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.a;
    }

    public static void b(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.a(context);
        String s1 = zzf.a(context, i, GooglePlayServicesUtil.e(context));
        String s = zzf.b(context, i);
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

                public void onClick(View view)
                {
                    a.startActivity(GooglePlayServicesUtil.b(b));
                }

            
            {
                a = context;
                b = i;
                super();
            }
            });
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new zza(framelayout, layoutinflater, viewgroup, bundle) {

            final FrameLayout a;
            final LayoutInflater b;
            final ViewGroup c;
            final Bundle d;
            final com.google.android.gms.dynamic.zza e;

            public int a()
            {
                return 2;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                a.removeAllViews();
                a.addView(com.google.android.gms.dynamic.zza.b(e).a(b, c, d));
            }

            
            {
                e = zza.this;
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

    public LifecycleDelegate a()
    {
        return a;
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new zza(activity, bundle, bundle1) {

            final Activity a;
            final Bundle b;
            final Bundle c;
            final com.google.android.gms.dynamic.zza d;

            public int a()
            {
                return 0;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.b(d).a(a, b, c);
            }

            
            {
                d = zza.this;
                a = activity;
                b = bundle;
                c = bundle1;
                super();
            }
        });
    }

    public void a(Bundle bundle)
    {
        a(bundle, new zza(bundle) {

            final Bundle a;
            final com.google.android.gms.dynamic.zza b;

            public int a()
            {
                return 1;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.b(b).a(a);
            }

            
            {
                b = zza.this;
                a = bundle;
                super();
            }
        });
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(com.google.android.gms.dynamic.zzf zzf1);

    public void b()
    {
        a(((Bundle) (null)), new zza() {

            final com.google.android.gms.dynamic.zza a;

            public int a()
            {
                return 4;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.b(a).a();
            }

            
            {
                a = zza.this;
                super();
            }
        });
    }

    public void b(Bundle bundle)
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

    public void c()
    {
        a(((Bundle) (null)), new zza() {

            final com.google.android.gms.dynamic.zza a;

            public int a()
            {
                return 5;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.b(a).b();
            }

            
            {
                a = zza.this;
                super();
            }
        });
    }

    public void d()
    {
        if (a != null)
        {
            a.c();
            return;
        } else
        {
            a(5);
            return;
        }
    }

    public void e()
    {
        if (a != null)
        {
            a.d();
            return;
        } else
        {
            a(4);
            return;
        }
    }

    public void f()
    {
        if (a != null)
        {
            a.e();
            return;
        } else
        {
            a(2);
            return;
        }
    }

    public void g()
    {
        if (a != null)
        {
            a.f();
            return;
        } else
        {
            a(1);
            return;
        }
    }

    public void h()
    {
        if (a != null)
        {
            a.g();
        }
    }

    private class zza
    {

        public abstract int a();

        public abstract void a(LifecycleDelegate lifecycledelegate);
    }

}
