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
    static interface a
    {

        public abstract void b(LifecycleDelegate lifecycledelegate);

        public abstract int getState();
    }


    private final f afA = new f() {

        final com.google.android.gms.dynamic.a afB;

        public final void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(afB, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(afB).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(afB))) { }
            com.google.android.gms.dynamic.a.a(afB).clear();
            com.google.android.gms.dynamic.a.a(afB, null);
        }

            
            {
                afB = com.google.android.gms.dynamic.a.this;
                super();
            }
    };
    private LifecycleDelegate afx;
    private Bundle afy;
    private LinkedList afz;

    public com.google.android.gms.dynamic.a()
    {
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.afy = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.afx = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.afz;
    }

    private void a(Bundle bundle, a a1)
    {
        if (afx != null)
        {
            a1.b(afx);
            return;
        }
        if (afz == null)
        {
            afz = new LinkedList();
        }
        afz.add(a1);
        if (bundle != null)
        {
            if (afy == null)
            {
                afy = (Bundle)bundle.clone();
            } else
            {
                afy.putAll(bundle);
            }
        }
        a(afA);
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.afx;
    }

    private static void b(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = GooglePlayServicesUtil.c(context, i);
        String s = GooglePlayServicesUtil.d(context, i);
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

                final int afH;
                final Context ni;

                public final void onClick(View view)
                {
                    ni.startActivity(GooglePlayServicesUtil.getGooglePlayServicesAvailabilityRecoveryIntent(afH));
                }

            
            {
                ni = context;
                afH = i;
                super();
            }
            });
        }
    }

    private void fr(int i)
    {
        for (; !afz.isEmpty() && ((a)afz.getLast()).getState() >= i; afz.removeLast()) { }
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(f f);

    public final LifecycleDelegate lf()
    {
        return afx;
    }

    public final void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final Bundle Jy;
            final com.google.android.gms.dynamic.a afB;

            public final void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(afB).onCreate(Jy);
            }

            public final int getState()
            {
                return 1;
            }

            
            {
                afB = com.google.android.gms.dynamic.a.this;
                Jy = bundle;
                super();
            }
        });
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final Bundle Jy;
            final com.google.android.gms.dynamic.a afB;
            final FrameLayout afE;
            final LayoutInflater afF;
            final ViewGroup afG;

            public final void b(LifecycleDelegate lifecycledelegate)
            {
                afE.removeAllViews();
                afE.addView(com.google.android.gms.dynamic.a.b(afB).onCreateView(afF, afG, Jy));
            }

            public final int getState()
            {
                return 2;
            }

            
            {
                afB = com.google.android.gms.dynamic.a.this;
                afE = framelayout;
                afF = layoutinflater;
                afG = viewgroup;
                Jy = bundle;
                super();
            }
        });
        if (afx == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public final void onDestroy()
    {
        if (afx != null)
        {
            afx.onDestroy();
            return;
        } else
        {
            fr(1);
            return;
        }
    }

    public final void onDestroyView()
    {
        if (afx != null)
        {
            afx.onDestroyView();
            return;
        } else
        {
            fr(2);
            return;
        }
    }

    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final Bundle Jy;
            final com.google.android.gms.dynamic.a afB;
            final Activity afC;
            final Bundle afD;

            public final void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(afB).onInflate(afC, afD, Jy);
            }

            public final int getState()
            {
                return 0;
            }

            
            {
                afB = com.google.android.gms.dynamic.a.this;
                afC = activity;
                afD = bundle;
                Jy = bundle1;
                super();
            }
        });
    }

    public final void onLowMemory()
    {
        if (afx != null)
        {
            afx.onLowMemory();
        }
    }

    public final void onPause()
    {
        if (afx != null)
        {
            afx.onPause();
            return;
        } else
        {
            fr(5);
            return;
        }
    }

    public final void onResume()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a afB;

            public final void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(afB).onResume();
            }

            public final int getState()
            {
                return 5;
            }

            
            {
                afB = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        if (afx != null)
        {
            afx.onSaveInstanceState(bundle);
        } else
        if (afy != null)
        {
            bundle.putAll(afy);
            return;
        }
    }

    public final void onStart()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a afB;

            public final void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(afB).onStart();
            }

            public final int getState()
            {
                return 4;
            }

            
            {
                afB = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public final void onStop()
    {
        if (afx != null)
        {
            afx.onStop();
            return;
        } else
        {
            fr(4);
            return;
        }
    }
}
