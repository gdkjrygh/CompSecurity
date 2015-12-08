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


    private LifecycleDelegate Tu;
    private Bundle Tv;
    private LinkedList Tw;
    private final f Tx = new f() {

        final com.google.android.gms.dynamic.a Ty;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(Ty, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Ty).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Ty))) { }
            com.google.android.gms.dynamic.a.a(Ty).clear();
            com.google.android.gms.dynamic.a.a(Ty, null);
        }

            
            {
                Ty = com.google.android.gms.dynamic.a.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.a()
    {
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.Tv = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.Tu = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.Tw;
    }

    private void a(Bundle bundle, a a1)
    {
        if (Tu != null)
        {
            a1.b(Tu);
            return;
        }
        if (Tw == null)
        {
            Tw = new LinkedList();
        }
        Tw.add(a1);
        if (bundle != null)
        {
            if (Tv == null)
            {
                Tv = (Bundle)bundle.clone();
            } else
            {
                Tv.putAll(bundle);
            }
        }
        a(Tx);
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.Tu;
    }

    public static void b(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = GooglePlayServicesUtil.b(context, i);
        String s = GooglePlayServicesUtil.c(context, i);
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

                final int TF;
                final Context nf;

                public void onClick(View view)
                {
                    nf.startActivity(GooglePlayServicesUtil.aj(TF));
                }

            
            {
                nf = context;
                TF = i;
                super();
            }
            });
        }
    }

    private void cG(int i)
    {
        for (; !Tw.isEmpty() && ((a)Tw.getLast()).getState() >= i; Tw.removeLast()) { }
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(f f);

    public LifecycleDelegate je()
    {
        return Tu;
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final Bundle TB;
            final com.google.android.gms.dynamic.a Ty;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Ty).onCreate(TB);
            }

            public int getState()
            {
                return 1;
            }

            
            {
                Ty = com.google.android.gms.dynamic.a.this;
                TB = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final Bundle TB;
            final FrameLayout TC;
            final LayoutInflater TD;
            final ViewGroup TE;
            final com.google.android.gms.dynamic.a Ty;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                TC.removeAllViews();
                TC.addView(com.google.android.gms.dynamic.a.b(Ty).onCreateView(TD, TE, TB));
            }

            public int getState()
            {
                return 2;
            }

            
            {
                Ty = com.google.android.gms.dynamic.a.this;
                TC = framelayout;
                TD = layoutinflater;
                TE = viewgroup;
                TB = bundle;
                super();
            }
        });
        if (Tu == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (Tu != null)
        {
            Tu.onDestroy();
            return;
        } else
        {
            cG(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (Tu != null)
        {
            Tu.onDestroyView();
            return;
        } else
        {
            cG(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final Bundle TA;
            final Bundle TB;
            final com.google.android.gms.dynamic.a Ty;
            final Activity Tz;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Ty).onInflate(Tz, TA, TB);
            }

            public int getState()
            {
                return 0;
            }

            
            {
                Ty = com.google.android.gms.dynamic.a.this;
                Tz = activity;
                TA = bundle;
                TB = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (Tu != null)
        {
            Tu.onLowMemory();
        }
    }

    public void onPause()
    {
        if (Tu != null)
        {
            Tu.onPause();
            return;
        } else
        {
            cG(5);
            return;
        }
    }

    public void onResume()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Ty;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Ty).onResume();
            }

            public int getState()
            {
                return 5;
            }

            
            {
                Ty = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (Tu != null)
        {
            Tu.onSaveInstanceState(bundle);
        } else
        if (Tv != null)
        {
            bundle.putAll(Tv);
            return;
        }
    }

    public void onStart()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Ty;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Ty).onStart();
            }

            public int getState()
            {
                return 4;
            }

            
            {
                Ty = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (Tu != null)
        {
            Tu.onStop();
            return;
        } else
        {
            cG(4);
            return;
        }
    }
}
