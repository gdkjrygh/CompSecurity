// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.b.b;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.ak;
import com.google.android.gms.maps.a.e;
import com.google.android.gms.maps.a.k;
import com.google.android.gms.maps.a.o;
import com.google.android.gms.maps.model.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, e, b, d

public class MapView extends FrameLayout
{
    static final class a
        implements k
    {

        private final ViewGroup a;
        private final e b;
        private View c;

        public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public final void a()
        {
            try
            {
                b.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void a(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public final void a(Bundle bundle)
        {
            try
            {
                b.a(bundle);
                c = (View)com.google.android.gms.b.d.a(b.f());
                a.removeAllViews();
                a.addView(c);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new c(bundle);
            }
        }

        public final void a(com.google.android.gms.maps.e e1)
        {
            try
            {
                b.a(new com.google.android.gms.maps.a.x.a(this, e1) {

                    final com.google.android.gms.maps.e a;
                    final a b;

                    public final void a(com.google.android.gms.maps.a.b b1)
                        throws RemoteException
                    {
                        a.onMapReady(new com.google.android.gms.maps.b(b1));
                    }

            
            {
                b = a1;
                a = e1;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.maps.e e1)
            {
                throw new c(e1);
            }
        }

        public final void b()
        {
            try
            {
                b.c();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void b(Bundle bundle)
        {
            try
            {
                b.b(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new c(bundle);
            }
        }

        public final void c()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public final void d()
        {
            try
            {
                b.d();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public final void e()
        {
            try
            {
                b.e();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new c(remoteexception);
            }
        }

        public a(ViewGroup viewgroup, e e1)
        {
            b = (e)y.a(e1);
            a = (ViewGroup)y.a(viewgroup);
        }
    }

    static final class b extends com.google.android.gms.b.b
    {

        protected com.google.android.gms.b.e a;
        private final ViewGroup b;
        private final Context c;
        private final GoogleMapOptions d;
        private final List e = new ArrayList();

        protected final void a(com.google.android.gms.b.e e1)
        {
            a = e1;
            if (a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            com.google.android.gms.maps.d.a(c);
            e1 = ak.a(c).a(com.google.android.gms.b.d.a(c), d);
            if (e1 == null)
            {
                return;
            }
            a.a(new a(b, e1));
            com.google.android.gms.maps.e e2;
            for (e1 = e.iterator(); e1.hasNext(); ((a)a()).a(e2))
            {
                e2 = (com.google.android.gms.maps.e)e1.next();
            }

            try
            {
                e.clear();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.b.e e1)
            {
                throw new c(e1);
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.b.e e1) { }
        }

        public final void a(com.google.android.gms.maps.e e1)
        {
            if (a() != null)
            {
                ((a)a()).a(e1);
                return;
            } else
            {
                e.add(e1);
                return;
            }
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            b = viewgroup;
            c = context;
            d = googlemapoptions;
        }
    }


    private final b a;

    public MapView(Context context)
    {
        super(context);
        a = new b(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new b(this, context, GoogleMapOptions.a(context, attributeset));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new b(this, context, GoogleMapOptions.a(context, attributeset));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        a = new b(this, context, googlemapoptions);
        setClickable(true);
    }

    public final void a()
    {
        a.a(null);
        if (a.a() == null)
        {
            com.google.android.gms.b.b.a(this);
        }
    }

    public final void a(com.google.android.gms.maps.e e)
    {
        y.b("getMapAsync() must be called on the main thread");
        a.a(e);
    }
}
