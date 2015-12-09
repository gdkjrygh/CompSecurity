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
    private static interface a
    {

        public abstract int a();

        public abstract void a(LifecycleDelegate lifecycledelegate);
    }


    private LifecycleDelegate zzacd;
    private Bundle zzace;
    private LinkedList zzacf;
    private final com.google.android.gms.dynamic.zzf zzacg = new com.google.android.gms.dynamic.zzf() {

        final zza a;

        public void zza(LifecycleDelegate lifecycledelegate)
        {
            zza.zza(a, lifecycledelegate);
            for (lifecycledelegate = zza.zza(a).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).a(zza.zzb(a))) { }
            zza.zza(a).clear();
            zza.zza(a, null);
        }

            
            {
                a = zza.this;
                super();
            }
    };

    public zza()
    {
    }

    static Bundle zza(zza zza1, Bundle bundle)
    {
        zza1.zzace = bundle;
        return bundle;
    }

    static LifecycleDelegate zza(zza zza1, LifecycleDelegate lifecycledelegate)
    {
        zza1.zzacd = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList zza(zza zza1)
    {
        return zza1.zzacf;
    }

    private void zza(Bundle bundle, a a1)
    {
        if (zzacd != null)
        {
            a1.a(zzacd);
            return;
        }
        if (zzacf == null)
        {
            zzacf = new LinkedList();
        }
        zzacf.add(a1);
        if (bundle != null)
        {
            if (zzace == null)
            {
                zzace = (Bundle)bundle.clone();
            } else
            {
                zzace.putAll(bundle);
            }
        }
        zza(zzacg);
    }

    static LifecycleDelegate zzb(zza zza1)
    {
        return zza1.zzacd;
    }

    public static void zzb(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = zzf.zzh(context, i);
        String s = zzf.zzi(context, i);
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
                    a.startActivity(GooglePlayServicesUtil.zzar(b));
                }

            
            {
                a = context;
                b = i;
                super();
            }
            });
        }
    }

    private void zzdu(int i)
    {
        for (; !zzacf.isEmpty() && ((a)zzacf.getLast()).a() >= i; zzacf.removeLast()) { }
    }

    public void onCreate(Bundle bundle)
    {
        zza(bundle, new a(bundle) {

            final Bundle a;
            final zza b;

            public int a()
            {
                return 1;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                zza.zzb(b).onCreate(a);
            }

            
            {
                b = zza.this;
                a = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        zza(bundle, new a(framelayout, layoutinflater, viewgroup, bundle) {

            final FrameLayout a;
            final LayoutInflater b;
            final ViewGroup c;
            final Bundle d;
            final zza e;

            public int a()
            {
                return 2;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                a.removeAllViews();
                a.addView(zza.zzb(e).onCreateView(b, c, d));
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
        if (zzacd == null)
        {
            zza(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (zzacd != null)
        {
            zzacd.onDestroy();
            return;
        } else
        {
            zzdu(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (zzacd != null)
        {
            zzacd.onDestroyView();
            return;
        } else
        {
            zzdu(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        zza(bundle1, new a(activity, bundle, bundle1) {

            final Activity a;
            final Bundle b;
            final Bundle c;
            final zza d;

            public int a()
            {
                return 0;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                zza.zzb(d).onInflate(a, b, c);
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

    public void onLowMemory()
    {
        if (zzacd != null)
        {
            zzacd.onLowMemory();
        }
    }

    public void onPause()
    {
        if (zzacd != null)
        {
            zzacd.onPause();
            return;
        } else
        {
            zzdu(5);
            return;
        }
    }

    public void onResume()
    {
        zza(((Bundle) (null)), new a() {

            final zza a;

            public int a()
            {
                return 5;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                zza.zzb(a).onResume();
            }

            
            {
                a = zza.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (zzacd != null)
        {
            zzacd.onSaveInstanceState(bundle);
        } else
        if (zzace != null)
        {
            bundle.putAll(zzace);
            return;
        }
    }

    public void onStart()
    {
        zza(((Bundle) (null)), new a() {

            final zza a;

            public int a()
            {
                return 4;
            }

            public void a(LifecycleDelegate lifecycledelegate)
            {
                zza.zzb(a).onStart();
            }

            
            {
                a = zza.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (zzacd != null)
        {
            zzacd.onStop();
            return;
        } else
        {
            zzdu(4);
            return;
        }
    }

    protected void zza(FrameLayout framelayout)
    {
        zzb(framelayout);
    }

    protected abstract void zza(com.google.android.gms.dynamic.zzf zzf1);

    public LifecycleDelegate zzou()
    {
        return zzacd;
    }
}
