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


    private LifecycleDelegate Hj;
    private Bundle Hk;
    private LinkedList Hl;
    private final f Hm = new f() {

        final com.google.android.gms.dynamic.a Hn;

        public void a(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.a.a(Hn, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.a.a(Hn).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).b(com.google.android.gms.dynamic.a.b(Hn))) { }
            com.google.android.gms.dynamic.a.a(Hn).clear();
            com.google.android.gms.dynamic.a.a(Hn, null);
        }

            
            {
                Hn = com.google.android.gms.dynamic.a.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.a()
    {
    }

    static Bundle a(com.google.android.gms.dynamic.a a1, Bundle bundle)
    {
        a1.Hk = bundle;
        return bundle;
    }

    static LifecycleDelegate a(com.google.android.gms.dynamic.a a1, LifecycleDelegate lifecycledelegate)
    {
        a1.Hj = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList a(com.google.android.gms.dynamic.a a1)
    {
        return a1.Hl;
    }

    private void a(Bundle bundle, a a1)
    {
        if (Hj != null)
        {
            a1.b(Hj);
            return;
        }
        if (Hl == null)
        {
            Hl = new LinkedList();
        }
        Hl.add(a1);
        if (bundle != null)
        {
            if (Hk == null)
            {
                Hk = (Bundle)bundle.clone();
            } else
            {
                Hk.putAll(bundle);
            }
        }
        a(Hm);
    }

    private void aR(int i)
    {
        for (; !Hl.isEmpty() && ((a)Hl.getLast()).getState() >= i; Hl.removeLast()) { }
    }

    static LifecycleDelegate b(com.google.android.gms.dynamic.a a1)
    {
        return a1.Hj;
    }

    public static void b(FrameLayout framelayout)
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

                final int Hu;
                final Context pB;

                public void onClick(View view)
                {
                    pB.startActivity(GooglePlayServicesUtil.b(pB, Hu));
                }

            
            {
                pB = context;
                Hu = i;
                super();
            }
            });
        }
    }

    protected void a(FrameLayout framelayout)
    {
        b(framelayout);
    }

    protected abstract void a(f f);

    public LifecycleDelegate fW()
    {
        return Hj;
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle, new a(bundle) {

            final com.google.android.gms.dynamic.a Hn;
            final Bundle Hq;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Hn).onCreate(Hq);
            }

            public int getState()
            {
                return 1;
            }

            
            {
                Hn = com.google.android.gms.dynamic.a.this;
                Hq = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        a(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.a Hn;
            final Bundle Hq;
            final FrameLayout Hr;
            final LayoutInflater Hs;
            final ViewGroup Ht;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                Hr.removeAllViews();
                Hr.addView(com.google.android.gms.dynamic.a.b(Hn).onCreateView(Hs, Ht, Hq));
            }

            public int getState()
            {
                return 2;
            }

            
            {
                Hn = com.google.android.gms.dynamic.a.this;
                Hr = framelayout;
                Hs = layoutinflater;
                Ht = viewgroup;
                Hq = bundle;
                super();
            }
        });
        if (Hj == null)
        {
            a(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (Hj != null)
        {
            Hj.onDestroy();
            return;
        } else
        {
            aR(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (Hj != null)
        {
            Hj.onDestroyView();
            return;
        } else
        {
            aR(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        a(bundle1, new a(activity, bundle, bundle1) {

            final com.google.android.gms.dynamic.a Hn;
            final Activity Ho;
            final Bundle Hp;
            final Bundle Hq;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Hn).onInflate(Ho, Hp, Hq);
            }

            public int getState()
            {
                return 0;
            }

            
            {
                Hn = com.google.android.gms.dynamic.a.this;
                Ho = activity;
                Hp = bundle;
                Hq = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (Hj != null)
        {
            Hj.onLowMemory();
        }
    }

    public void onPause()
    {
        if (Hj != null)
        {
            Hj.onPause();
            return;
        } else
        {
            aR(5);
            return;
        }
    }

    public void onResume()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Hn;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Hn).onResume();
            }

            public int getState()
            {
                return 5;
            }

            
            {
                Hn = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (Hj != null)
        {
            Hj.onSaveInstanceState(bundle);
        } else
        if (Hk != null)
        {
            bundle.putAll(Hk);
            return;
        }
    }

    public void onStart()
    {
        a(((Bundle) (null)), new a() {

            final com.google.android.gms.dynamic.a Hn;

            public void b(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.a.b(Hn).onStart();
            }

            public int getState()
            {
                return 4;
            }

            
            {
                Hn = com.google.android.gms.dynamic.a.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (Hj != null)
        {
            Hj.onStop();
            return;
        } else
        {
            aR(4);
            return;
        }
    }
}
