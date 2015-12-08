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


    private LifecycleDelegate LX;
    private Bundle LY;
    private LinkedList LZ;
    private final f Ma = new f() {

        final com.google.android.gms.dynamic.a Mb;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(Mb, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Mb).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Mb))) { }
            com.google.android.gms.dynamic.a.a(Mb).clear();
            com.google.android.gms.dynamic.a.a(Mb, null);
        }

            
            {
                Mb = com.google.android.gms.dynamic.a.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.a()
    {
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.LY = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.LX = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.LZ;
    }

    private void a(Bundle bundle, a a1)
    {
        if (LX != null)
        {
            a1.b(LX);
            return;
        }
        if (LZ == null)
        {
            LZ = new LinkedList();
        }
        LZ.add(a1);
        if (bundle != null)
        {
            if (LY == null)
            {
                LY = (Bundle)bundle.clone();
            } else
            {
                LY.putAll(bundle);
            }
        }
        a(Ma);
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.LX;
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

                final int Mi;
                final Context qu;

                public void onClick(View view)
                {
                    qu.startActivity(GooglePlayServicesUtil.c(qu, Mi));
                }

            
            {
                qu = context;
                Mi = i;
                super();
            }
            });
        }
    }

    private void ca(int i)
    {
        for (; !LZ.isEmpty() && ((a)LZ.getLast()).getState() >= i; LZ.removeLast()) { }
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(f f);

    public LifecycleDelegate gH()
    {
        return LX;
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final com.google.android.gms.dynamic.a Mb;
            final Bundle Me;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Mb).onCreate(Me);
            }

            public int getState()
            {
                return 1;
            }

            
            {
                Mb = com.google.android.gms.dynamic.a.this;
                Me = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.a Mb;
            final Bundle Me;
            final FrameLayout Mf;
            final LayoutInflater Mg;
            final ViewGroup Mh;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                Mf.removeAllViews();
                Mf.addView(com.google.android.gms.dynamic.a.b(Mb).onCreateView(Mg, Mh, Me));
            }

            public int getState()
            {
                return 2;
            }

            
            {
                Mb = com.google.android.gms.dynamic.a.this;
                Mf = framelayout;
                Mg = layoutinflater;
                Mh = viewgroup;
                Me = bundle;
                super();
            }
        });
        if (LX == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (LX != null)
        {
            LX.onDestroy();
            return;
        } else
        {
            ca(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (LX != null)
        {
            LX.onDestroyView();
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

            final com.google.android.gms.dynamic.a Mb;
            final Activity Mc;
            final Bundle Md;
            final Bundle Me;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Mb).onInflate(Mc, Md, Me);
            }

            public int getState()
            {
                return 0;
            }

            
            {
                Mb = com.google.android.gms.dynamic.a.this;
                Mc = activity;
                Md = bundle;
                Me = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (LX != null)
        {
            LX.onLowMemory();
        }
    }

    public void onPause()
    {
        if (LX != null)
        {
            LX.onPause();
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

            final com.google.android.gms.dynamic.a Mb;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Mb).onResume();
            }

            public int getState()
            {
                return 5;
            }

            
            {
                Mb = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (LX != null)
        {
            LX.onSaveInstanceState(bundle);
        } else
        if (LY != null)
        {
            bundle.putAll(LY);
            return;
        }
    }

    public void onStart()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Mb;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Mb).onStart();
            }

            public int getState()
            {
                return 4;
            }

            
            {
                Mb = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (LX != null)
        {
            LX.onStop();
            return;
        } else
        {
            ca(4);
            return;
        }
    }
}
