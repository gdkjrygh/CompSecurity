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
//            LifecycleDelegate, f

public abstract class com.google.android.gms.dynamic.a
{
    private static interface a
    {

        public abstract void b(LifecycleDelegate lifecycledelegate);

        public abstract int getState();
    }


    private LifecycleDelegate RX;
    private Bundle RY;
    private LinkedList RZ;
    private final f Sa = new f() {

        final com.google.android.gms.dynamic.a Sb;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(Sb, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Sb).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Sb))) { }
            com.google.android.gms.dynamic.a.a(Sb).clear();
            com.google.android.gms.dynamic.a.a(Sb, null);
        }

            
            {
                Sb = com.google.android.gms.dynamic.a.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.a()
    {
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.RY = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.RX = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.RZ;
    }

    private void a(Bundle bundle, a a1)
    {
        if (RX != null)
        {
            a1.b(RX);
            return;
        }
        if (RZ == null)
        {
            RZ = new LinkedList();
        }
        RZ.add(a1);
        if (bundle != null)
        {
            if (RY == null)
            {
                RY = (Bundle)bundle.clone();
            } else
            {
                RY.putAll(bundle);
            }
        }
        a(Sa);
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.RX;
    }

    public static void b(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = GooglePlayServicesUtil.d(context, i);
        String s = GooglePlayServicesUtil.e(context, i);
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

                final int Si;
                final Context mV;

                public void onClick(View view)
                {
                    mV.startActivity(GooglePlayServicesUtil.c(mV, Si));
                }

            
            {
                mV = context;
                Si = i;
                super();
            }
            });
        }
    }

    private void cv(int i)
    {
        for (; !RZ.isEmpty() && ((a)RZ.getLast()).getState() >= i; RZ.removeLast()) { }
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(f f);

    public LifecycleDelegate it()
    {
        return RX;
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final com.google.android.gms.dynamic.a Sb;
            final Bundle Se;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Sb).onCreate(Se);
            }

            public int getState()
            {
                return 1;
            }

            
            {
                Sb = com.google.android.gms.dynamic.a.this;
                Se = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.a Sb;
            final Bundle Se;
            final FrameLayout Sf;
            final LayoutInflater Sg;
            final ViewGroup Sh;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                Sf.removeAllViews();
                Sf.addView(com.google.android.gms.dynamic.a.b(Sb).onCreateView(Sg, Sh, Se));
            }

            public int getState()
            {
                return 2;
            }

            
            {
                Sb = com.google.android.gms.dynamic.a.this;
                Sf = framelayout;
                Sg = layoutinflater;
                Sh = viewgroup;
                Se = bundle;
                super();
            }
        });
        if (RX == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (RX != null)
        {
            RX.onDestroy();
            return;
        } else
        {
            cv(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (RX != null)
        {
            RX.onDestroyView();
            return;
        } else
        {
            cv(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final com.google.android.gms.dynamic.a Sb;
            final Activity Sc;
            final Bundle Sd;
            final Bundle Se;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Sb).onInflate(Sc, Sd, Se);
            }

            public int getState()
            {
                return 0;
            }

            
            {
                Sb = com.google.android.gms.dynamic.a.this;
                Sc = activity;
                Sd = bundle;
                Se = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (RX != null)
        {
            RX.onLowMemory();
        }
    }

    public void onPause()
    {
        if (RX != null)
        {
            RX.onPause();
            return;
        } else
        {
            cv(5);
            return;
        }
    }

    public void onResume()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Sb;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Sb).onResume();
            }

            public int getState()
            {
                return 5;
            }

            
            {
                Sb = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (RX != null)
        {
            RX.onSaveInstanceState(bundle);
        } else
        if (RY != null)
        {
            bundle.putAll(RY);
            return;
        }
    }

    public void onStart()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Sb;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Sb).onStart();
            }

            public int getState()
            {
                return 4;
            }

            
            {
                Sb = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (RX != null)
        {
            RX.onStop();
            return;
        } else
        {
            cv(4);
            return;
        }
    }
}
