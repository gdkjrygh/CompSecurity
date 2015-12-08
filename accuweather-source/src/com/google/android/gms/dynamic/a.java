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


    private LifecycleDelegate LU;
    private Bundle LV;
    private LinkedList LW;
    private final f LX = new f() {

        final com.google.android.gms.dynamic.a LY;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(LY, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(LY).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(LY))) { }
            com.google.android.gms.dynamic.a.a(LY).clear();
            com.google.android.gms.dynamic.a.a(LY, null);
        }

            
            {
                LY = com.google.android.gms.dynamic.a.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.a()
    {
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.LV = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.LU = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.LW;
    }

    private void a(Bundle bundle, a a1)
    {
        if (LU != null)
        {
            a1.b(LU);
            return;
        }
        if (LW == null)
        {
            LW = new LinkedList();
        }
        LW.add(a1);
        if (bundle != null)
        {
            if (LV == null)
            {
                LV = (Bundle)bundle.clone();
            } else
            {
                LV.putAll(bundle);
            }
        }
        a(LX);
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.LU;
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

                final int Mf;
                final Context qr;

                public void onClick(View view)
                {
                    qr.startActivity(GooglePlayServicesUtil.c(qr, Mf));
                }

            
            {
                qr = context;
                Mf = i;
                super();
            }
            });
        }
    }

    private void ca(int i)
    {
        for (; !LW.isEmpty() && ((a)LW.getLast()).getState() >= i; LW.removeLast()) { }
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(f f);

    public LifecycleDelegate gC()
    {
        return LU;
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final com.google.android.gms.dynamic.a LY;
            final Bundle Mb;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(LY).onCreate(Mb);
            }

            public int getState()
            {
                return 1;
            }

            
            {
                LY = com.google.android.gms.dynamic.a.this;
                Mb = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.a LY;
            final Bundle Mb;
            final FrameLayout Mc;
            final LayoutInflater Md;
            final ViewGroup Me;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                Mc.removeAllViews();
                Mc.addView(com.google.android.gms.dynamic.a.b(LY).onCreateView(Md, Me, Mb));
            }

            public int getState()
            {
                return 2;
            }

            
            {
                LY = com.google.android.gms.dynamic.a.this;
                Mc = framelayout;
                Md = layoutinflater;
                Me = viewgroup;
                Mb = bundle;
                super();
            }
        });
        if (LU == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (LU != null)
        {
            LU.onDestroy();
            return;
        } else
        {
            ca(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (LU != null)
        {
            LU.onDestroyView();
            return;
        } else
        {
            ca(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final com.google.android.gms.dynamic.a LY;
            final Activity LZ;
            final Bundle Ma;
            final Bundle Mb;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(LY).onInflate(LZ, Ma, Mb);
            }

            public int getState()
            {
                return 0;
            }

            
            {
                LY = com.google.android.gms.dynamic.a.this;
                LZ = activity;
                Ma = bundle;
                Mb = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (LU != null)
        {
            LU.onLowMemory();
        }
    }

    public void onPause()
    {
        if (LU != null)
        {
            LU.onPause();
            return;
        } else
        {
            ca(5);
            return;
        }
    }

    public void onResume()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a LY;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(LY).onResume();
            }

            public int getState()
            {
                return 5;
            }

            
            {
                LY = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (LU != null)
        {
            LU.onSaveInstanceState(bundle);
        } else
        if (LV != null)
        {
            bundle.putAll(LV);
            return;
        }
    }

    public void onStart()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a LY;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(LY).onStart();
            }

            public int getState()
            {
                return 4;
            }

            
            {
                LY = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (LU != null)
        {
            LU.onStop();
            return;
        } else
        {
            ca(4);
            return;
        }
    }
}
