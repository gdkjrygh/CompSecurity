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
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            LifecycleDelegate, d

public abstract class com.google.android.gms.dynamic.a
{
    private static interface a
    {

        public abstract void b(LifecycleDelegate lifecycledelegate);

        public abstract int getState();
    }


    private LifecycleDelegate lV;
    private Bundle lW;
    private LinkedList lX;
    private final d lY = new d() {

        final com.google.android.gms.dynamic.a lZ;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(lZ, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(lZ).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(lZ))) { }
            com.google.android.gms.dynamic.a.a(lZ).clear();
            com.google.android.gms.dynamic.a.a(lZ, null);
        }

            
            {
                lZ = com.google.android.gms.dynamic.a.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.a()
    {
    }

    private void J(int i)
    {
        for (; !lX.isEmpty() && ((a)lX.getLast()).getState() >= i; lX.removeLast()) { }
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.lW = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.lV = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.lX;
    }

    private void a(Bundle bundle, a a1)
    {
        if (lV != null)
        {
            a1.b(lV);
            return;
        }
        if (lX == null)
        {
            lX = new LinkedList();
        }
        lX.add(a1);
        if (bundle != null)
        {
            if (lW == null)
            {
                lW = (Bundle)bundle.clone();
            } else
            {
                lW.putAll(bundle);
            }
        }
        a(lY);
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.lV;
    }

    public void a(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = GooglePlayServicesUtil.b(context, i, -1);
        String s = GooglePlayServicesUtil.b(context, i);
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

                final Context gO;
                final com.google.android.gms.dynamic.a lZ;
                final int mg;

                public void onClick(View view)
                {
                    gO.startActivity(GooglePlayServicesUtil.a(gO, mg, -1));
                }

            
            {
                lZ = com.google.android.gms.dynamic.a.this;
                gO = context;
                mg = i;
                super();
            }
            });
        }
    }

    protected abstract void a(d d);

    public LifecycleDelegate bP()
    {
        return lV;
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final com.google.android.gms.dynamic.a lZ;
            final Bundle mc;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(lZ).onCreate(mc);
            }

            public int getState()
            {
                return 1;
            }

            
            {
                lZ = com.google.android.gms.dynamic.a.this;
                mc = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.a lZ;
            final Bundle mc;
            final FrameLayout md;
            final LayoutInflater me;
            final ViewGroup mf;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                md.removeAllViews();
                md.addView(com.google.android.gms.dynamic.a.b(lZ).onCreateView(me, mf, mc));
            }

            public int getState()
            {
                return 2;
            }

            
            {
                lZ = com.google.android.gms.dynamic.a.this;
                md = framelayout;
                me = layoutinflater;
                mf = viewgroup;
                mc = bundle;
                super();
            }
        });
        if (lV == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (lV != null)
        {
            lV.onDestroy();
            return;
        } else
        {
            J(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (lV != null)
        {
            lV.onDestroyView();
            return;
        } else
        {
            J(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final com.google.android.gms.dynamic.a lZ;
            final Activity ma;
            final Bundle mb;
            final Bundle mc;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(lZ).onInflate(ma, mb, mc);
            }

            public int getState()
            {
                return 0;
            }

            
            {
                lZ = com.google.android.gms.dynamic.a.this;
                ma = activity;
                mb = bundle;
                mc = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (lV != null)
        {
            lV.onLowMemory();
        }
    }

    public void onPause()
    {
        if (lV != null)
        {
            lV.onPause();
            return;
        } else
        {
            J(3);
            return;
        }
    }

    public void onResume()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a lZ;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(lZ).onResume();
            }

            public int getState()
            {
                return 3;
            }

            
            {
                lZ = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (lV != null)
        {
            lV.onSaveInstanceState(bundle);
        } else
        if (lW != null)
        {
            bundle.putAll(lW);
            return;
        }
    }
}
