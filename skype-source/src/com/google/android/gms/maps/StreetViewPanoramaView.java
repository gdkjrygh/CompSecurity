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
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.a.ak;
import com.google.android.gms.maps.a.g;
import com.google.android.gms.maps.a.i;
import com.google.android.gms.maps.a.l;
import com.google.android.gms.maps.a.o;
import com.google.android.gms.maps.model.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            f, g, StreetViewPanoramaOptions

public class StreetViewPanoramaView extends FrameLayout
{
    static final class a
        implements l
    {

        private final ViewGroup a;
        private final i b;
        private View c;

        public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
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
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
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

        public final void a(f f)
        {
            try
            {
                b.a(new com.google.android.gms.maps.a.ah.a(this, f) {

                    final f a;
                    final a b;

                    public final void a(g g1)
                        throws RemoteException
                    {
                        new com.google.android.gms.maps.g(g1);
                    }

            
            {
                b = a1;
                a = f;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (f f)
            {
                throw new c(f);
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
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
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

        public a(ViewGroup viewgroup, i j)
        {
            b = (i)y.a(j);
            a = (ViewGroup)y.a(viewgroup);
        }
    }

    static final class b extends com.google.android.gms.b.b
    {

        protected e a;
        private final ViewGroup b;
        private final Context c;
        private final StreetViewPanoramaOptions d = null;
        private final List e = new ArrayList();

        protected final void a(e e1)
        {
            a = e1;
            if (a == null || a() != null)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            try
            {
                e1 = ak.a(c).a(com.google.android.gms.b.d.a(c), d);
                a.a(new a(b, e1));
                f f1;
                for (e1 = e.iterator(); e1.hasNext(); ((a)a()).a(f1))
                {
                    f1 = (f)e1.next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw new c(e1);
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                return;
            }
            e.clear();
        }

        b(ViewGroup viewgroup, Context context)
        {
            b = viewgroup;
            c = context;
        }
    }


    private final b a;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        a = new b(this, context);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new b(this, context);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new b(this, context);
    }
}
