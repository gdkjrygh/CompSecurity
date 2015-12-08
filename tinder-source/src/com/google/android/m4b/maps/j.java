// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.da.a;
import com.google.android.m4b.maps.da.c;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.da.e;
import com.google.android.m4b.maps.df.m;
import com.google.android.m4b.maps.df.n;
import com.google.android.m4b.maps.df.o;
import com.google.android.m4b.maps.df.s;
import com.google.android.m4b.maps.df.t;
import com.google.android.m4b.maps.df.x;
import com.google.android.m4b.maps.g.f;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.j.h;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps:
//            c, GoogleMapOptions, f, e

public class j extends Fragment
{
    static final class a
        implements m
    {

        final x a;
        private final Fragment b;

        public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                x x1 = a;
                layoutinflater = com.google.android.m4b.maps.da.d.a(layoutinflater);
                com.google.android.m4b.maps.da.d.a(viewgroup);
                layoutinflater = x1.a(layoutinflater, bundle);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new RuntimeRemoteException(layoutinflater);
            }
            return (View)com.google.android.m4b.maps.da.d.a(layoutinflater);
        }

        public final void a()
        {
            try
            {
                a.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void a(Activity activity, Bundle bundle)
        {
            bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
            try
            {
                x x1 = a;
                com.google.android.m4b.maps.da.d.a(activity);
                x1.a(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw new RuntimeRemoteException(activity);
            }
        }

        public final void a(Bundle bundle)
        {
            Bundle bundle1;
            bundle1 = bundle;
            if (bundle != null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            bundle1 = new Bundle();
            bundle = b.getArguments();
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            if (bundle.containsKey("MapOptions"))
            {
                n.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
            }
            a.a(bundle1);
            return;
            bundle;
            throw new RuntimeRemoteException(bundle);
        }

        public final void b()
        {
            try
            {
                a.c();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void b(Bundle bundle)
        {
            try
            {
                a.b(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public final void c()
        {
            try
            {
                a.d();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void d()
        {
            try
            {
                a.e();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public final void e()
        {
            try
            {
                a.f();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public a(Fragment fragment, x x1)
        {
            a = (x)com.google.android.m4b.maps.j.x.a(x1);
            b = (Fragment)com.google.android.m4b.maps.j.x.a(fragment);
        }
    }

    static final class b extends com.google.android.m4b.maps.da.a
    {

        private final Fragment d;
        private e e;
        private Activity f;
        private final List g = new ArrayList();

        static void a(b b1, Activity activity)
        {
            b1.f = activity;
            b1.a();
        }

        public final void a()
        {
            if (f == null || e == null || super.a != null)
            {
                break MISSING_BLOCK_LABEL_164;
            }
            Object obj;
            com.google.android.m4b.maps.e.a(f);
            obj = o.a(f).b(com.google.android.m4b.maps.da.d.a(f));
            if (obj == null)
            {
                return;
            }
            e.a(new a(d, ((x) (obj))));
            obj = g.iterator();
_L1:
            com.google.android.m4b.maps.f f2;
            a a1;
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_153;
            }
            f2 = (com.google.android.m4b.maps.f)((Iterator) (obj)).next();
            a1 = (a)super.a;
            try
            {
                a1.a.a(new com.google.android.m4b.maps.df.ah.a(a1, f2) {

                    private com.google.android.m4b.maps.f a;
                    private a b;

                    public final void a(t t1)
                    {
                        new com.google.android.m4b.maps.c(t1);
                    }

            
            {
                b = a1;
                a = f;
                super();
            }
                });
            }
            catch (RemoteException remoteexception)
            {
                try
                {
                    throw new RuntimeRemoteException(remoteexception);
                }
                catch (RemoteException remoteexception1)
                {
                    throw new RuntimeRemoteException(remoteexception1);
                }
                catch (f f1) { }
                break MISSING_BLOCK_LABEL_164;
            }
              goto _L1
            g.clear();
            return;
        }

        protected final void a(e e1)
        {
            e = e1;
            a();
        }

        b(Fragment fragment)
        {
            d = fragment;
        }
    }


    private final b a = new b(this);
    private com.google.android.m4b.maps.c b;

    public j()
    {
    }

    public final com.google.android.m4b.maps.c a()
    {
        a.a();
        Object obj;
        if (((com.google.android.m4b.maps.da.a) (a)).a == null)
        {
            obj = null;
        } else
        {
            obj = ((a)((com.google.android.m4b.maps.da.a) (a)).a).a;
        }
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = ((x) (obj)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        if (obj == null)
        {
            return null;
        }
        if (b == null || b.a.asBinder() != ((t) (obj)).asBinder())
        {
            b = new com.google.android.m4b.maps.c(((t) (obj)));
        }
        return b;
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/m4b/maps/j.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        com.google.android.m4b.maps.b.a(a, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b b1 = a;
        b1.a(bundle, new com.google.android.m4b.maps.da.a._cls3(b1, bundle));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b b1 = a;
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        b1.a(bundle, new com.google.android.m4b.maps.da.a._cls4(b1, framelayout, layoutinflater, viewgroup, bundle));
        if (((com.google.android.m4b.maps.da.a) (b1)).a == null)
        {
            layoutinflater = framelayout.getContext();
            int i = g.a(layoutinflater);
            String s = h.a(layoutinflater, i, g.c(layoutinflater));
            viewgroup = h.a(layoutinflater, i);
            bundle = new LinearLayout(framelayout.getContext());
            bundle.setOrientation(1);
            bundle.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.addView(bundle);
            TextView textview = new TextView(framelayout.getContext());
            textview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            textview.setText(s);
            bundle.addView(textview);
            if (viewgroup != null)
            {
                Button button = new Button(layoutinflater);
                button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                button.setText(viewgroup);
                bundle.addView(button);
                button.setOnClickListener(new com.google.android.m4b.maps.da.a._cls5(layoutinflater, i));
            }
        }
        framelayout.setClickable(true);
        return framelayout;
    }

    public void onDestroy()
    {
        b b1 = a;
        if (((com.google.android.m4b.maps.da.a) (b1)).a != null)
        {
            ((com.google.android.m4b.maps.da.a) (b1)).a.d();
        } else
        {
            b1.a(1);
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        b b1 = a;
        if (((com.google.android.m4b.maps.da.a) (b1)).a != null)
        {
            ((com.google.android.m4b.maps.da.a) (b1)).a.c();
        } else
        {
            b1.a(2);
        }
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        com.google.android.m4b.maps.b.a(a, activity);
        Object obj = com.google.android.m4b.maps.GoogleMapOptions.a(activity, attributeset);
        attributeset = new Bundle();
        attributeset.putParcelable("MapOptions", ((android.os.Parcelable) (obj)));
        obj = a;
        ((com.google.android.m4b.maps.da.a) (obj)).a(bundle, new com.google.android.m4b.maps.da.a._cls2(((com.google.android.m4b.maps.da.a) (obj)), activity, attributeset, bundle));
    }

    public void onLowMemory()
    {
        b b1 = a;
        if (((com.google.android.m4b.maps.da.a) (b1)).a != null)
        {
            ((com.google.android.m4b.maps.da.a) (b1)).a.e();
        }
        super.onLowMemory();
    }

    public void onPause()
    {
        b b1 = a;
        if (((com.google.android.m4b.maps.da.a) (b1)).a != null)
        {
            ((com.google.android.m4b.maps.da.a) (b1)).a.b();
        } else
        {
            b1.a(5);
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        b b1 = a;
        b1.a(null, new com.google.android.m4b.maps.da.a._cls6(b1));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/m4b/maps/j.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        b b1 = a;
        if (((com.google.android.m4b.maps.da.a) (b1)).a != null)
        {
            ((com.google.android.m4b.maps.da.a) (b1)).a.b(bundle);
        } else
        if (((com.google.android.m4b.maps.da.a) (b1)).b != null)
        {
            bundle.putAll(((com.google.android.m4b.maps.da.a) (b1)).b);
            return;
        }
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }
}
