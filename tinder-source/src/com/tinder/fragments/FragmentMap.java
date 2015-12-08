// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.m;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;
import com.google.android.m4b.maps.a;
import com.google.android.m4b.maps.c;
import com.google.android.m4b.maps.df.l;
import com.google.android.m4b.maps.df.t;
import com.google.android.m4b.maps.g;
import com.google.android.m4b.maps.j;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.b;
import com.google.android.m4b.maps.model.internal.k;
import com.tinder.a.f;
import com.tinder.activities.ActivityPassport;
import com.tinder.adapters.h;
import com.tinder.e.au;
import com.tinder.e.o;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.y;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;
import com.tinder.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FragmentMap extends j
    implements com.google.android.m4b.maps.c.b, com.google.android.m4b.maps.c.c, com.google.android.m4b.maps.c.d, o
{

    public y a;
    public com.tinder.managers.g b;
    private c c;
    private s d;
    private h e;
    private List f;

    public FragmentMap()
    {
    }

    static s a(FragmentMap fragmentmap)
    {
        return fragmentmap.d;
    }

    private static MarkerOptions b(LatLng latlng)
    {
        MarkerOptions markeroptions = new MarkerOptions();
        markeroptions.b = latlng;
        markeroptions.e = com.google.android.m4b.maps.model.b.a();
        return markeroptions;
    }

    private void b()
    {
        if (c == null)
        {
            c = ((j)((AppCompatActivity)getActivity()).getSupportFragmentManager().a(0x7f0e0218)).a();
        }
    }

    public final com.google.android.m4b.maps.model.j a(LatLng latlng, boolean flag)
    {
        Object obj = f.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            com.google.android.m4b.maps.model.j j1 = (com.google.android.m4b.maps.model.j)((Iterator) (obj)).next();
            try
            {
                j1.a.b();
            }
            // Misplaced declaration of an exception variable
            catch (LatLng latlng)
            {
                throw new RuntimeRemoteException(latlng);
            }
            ManagerApp.b().a(j1);
        }
        f.clear();
        e.a.clear();
        obj = c.c().a(latlng);
        obj.y = 0;
        obj = c.c().a(((Point) (obj)));
        if (flag)
        {
            com.google.android.m4b.maps.model.j j2 = c.a(b(((LatLng) (obj))));
            f.add(j2);
            ValueAnimator valueanimator = new ValueAnimator();
            valueanimator.setFloatValues(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setInterpolator(new DecelerateInterpolator());
            valueanimator.setDuration(240L);
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(j2, ((LatLng) (obj)), latlng) {

                final com.google.android.m4b.maps.model.j a;
                final LatLng b;
                final LatLng c;
                final FragmentMap d;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    com.google.android.m4b.maps.model.j j3 = a;
                    valueanimator1 = com.tinder.fragments.FragmentMap.a(d).a(valueanimator1.getAnimatedFraction(), b, c);
                    try
                    {
                        j3.a.a(valueanimator1);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ValueAnimator valueanimator1)
                    {
                        throw new RuntimeRemoteException(valueanimator1);
                    }
                }

            
            {
                d = FragmentMap.this;
                a = j1;
                b = latlng;
                c = latlng1;
                super();
            }
            });
            valueanimator.addListener(new au(j2) {

                final com.google.android.m4b.maps.model.j a;
                final FragmentMap b;

                public final void onAnimationEnd(Animator animator)
                {
                    a.b();
                    a.d();
                }

            
            {
                b = FragmentMap.this;
                a = j1;
                super();
            }
            });
            valueanimator.start();
            return j2;
        } else
        {
            latlng = c.a(b(latlng));
            f.add(latlng);
            latlng.b();
            return latlng;
        }
    }

    public final void a(LatLng latlng)
    {
        c.c().a(latlng);
        AsyncTask.execute(new Runnable(latlng) {

            final LatLng a;
            final FragmentMap b;

            public final void run()
            {
                SparksEvent sparksevent = new SparksEvent("Passport.MapPinDrop");
                sparksevent.put("pinLat", Double.valueOf(a.b));
                sparksevent.put("pinLon", Double.valueOf(a.c));
                sparksevent.put("myLocation", Boolean.valueOf(false));
                com.tinder.managers.a.a(sparksevent);
            }

            
            {
                b = FragmentMap.this;
                a = latlng;
                super();
            }
        });
        a(latlng, 400, false);
        com.google.android.m4b.maps.model.j j1 = a(latlng, true);
        a.a(latlng.b, latlng.c, this, j1);
    }

    public final void a(LatLng latlng, int i, boolean flag)
    {
        c c1;
        if (flag && c.a().c < 10F)
        {
            latlng = com.google.android.m4b.maps.b.b(latlng);
        } else
        {
            latlng = com.google.android.m4b.maps.b.a(latlng);
        }
        c1 = c;
        try
        {
            c1.a.a(((a) (latlng)).a, i, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public final void a(com.google.android.m4b.maps.model.j j1)
    {
        TinderLocation tinderlocation = e.b(j1);
        if (tinderlocation.getCountryShort() != null && tinderlocation.getCountryShort().equals("\"Indeed...\""))
        {
            Toast.makeText(getActivity(), "\"Indeed...\"", 0).show();
        } else
        {
            AsyncTask.execute(new Runnable(j1.a()) {

                final LatLng a;
                final FragmentMap b;

                public final void run()
                {
                    SparksEvent sparksevent = new SparksEvent("Passport.PinSelect");
                    sparksevent.put("newLat", Double.valueOf(a.b));
                    sparksevent.put("newLon", Double.valueOf(a.c));
                    com.tinder.managers.a.a(sparksevent);
                }

            
            {
                b = FragmentMap.this;
                a = latlng;
                super();
            }
            });
            ActivityPassport activitypassport = (ActivityPassport)getActivity();
            j1 = e.b(j1);
            if (j1 != null && j1.hasGeoData())
            {
                Intent intent = new Intent();
                intent.putExtra("tinderlocation", j1);
                activitypassport.setResult(-1, intent);
                activitypassport.finish();
                return;
            }
        }
    }

    public final void a(com.google.android.m4b.maps.model.j j1, TinderLocation tinderlocation)
    {
        if (j1 != null && f.contains(j1))
        {
            h h1 = e;
            if (j1 != null)
            {
                h1.a.put(j1, tinderlocation);
            }
            if (j1.c())
            {
                j1.d();
            }
        }
    }

    public final void a(TinderLocation tinderlocation, com.google.android.m4b.maps.model.j j1)
    {
        a(j1, tinderlocation);
    }

    public final void b(com.google.android.m4b.maps.model.j j1)
    {
        try
        {
            j1.a.s();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.m4b.maps.model.j j1)
        {
            throw new RuntimeRemoteException(j1);
        }
    }

    public final void c(com.google.android.m4b.maps.model.j j1)
    {
        LatLng latlng = j1.a();
        a(latlng, 200, false);
        e.a.remove(j1);
        j1.d();
        a.a(latlng.b, latlng.c, this, j1);
    }

    public final void d(com.google.android.m4b.maps.model.j j1)
    {
        a(j1, new TinderLocation());
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
    }

    public void onResume()
    {
        super.onResume();
        b();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b();
        d = new com.tinder.utils.s.a();
        c = a();
        view = c;
        try
        {
            ((c) (view)).a.a(3);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        view = c.b();
        try
        {
            ((com.google.android.m4b.maps.k) (view)).a.h(true);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        try
        {
            ((com.google.android.m4b.maps.k) (view)).a.f(false);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        try
        {
            ((com.google.android.m4b.maps.k) (view)).a.n(true);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        view = c;
        if (this != null) goto _L2; else goto _L1
_L1:
        try
        {
            ((c) (view)).a.a(null);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
_L7:
        view = c;
        if (this != null) goto _L4; else goto _L3
_L3:
        try
        {
            ((c) (view)).a.a(null);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        view = c;
        if (this != null) goto _L6; else goto _L5
_L5:
        try
        {
            ((c) (view)).a.a(null);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        f = new ArrayList();
        e = new h(ManagerApp.c());
        view = c;
        bundle = e;
        if (bundle == null)
        {
            try
            {
                ((c) (view)).a.a(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw new RuntimeRemoteException(view);
            }
        }
        break MISSING_BLOCK_LABEL_322;
_L2:
        ((c) (view)).a.a(new com.google.android.m4b.maps.c._cls1(view, this));
        break MISSING_BLOCK_LABEL_101;
_L4:
        ((c) (view)).a.a(new com.google.android.m4b.maps.c._cls3(view, this));
        break MISSING_BLOCK_LABEL_120;
_L6:
        ((c) (view)).a.a(new com.google.android.m4b.maps.c._cls2(view, this));
        break MISSING_BLOCK_LABEL_139;
          goto _L7
        ((c) (view)).a.a(new com.google.android.m4b.maps.c._cls4(view, bundle));
        return;
          goto _L7
    }

    // Unreferenced inner class com/tinder/fragments/FragmentMap$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final double a;
        final double b;
        final FragmentMap c;

        public final void run()
        {
            SparksEvent sparksevent = new SparksEvent("Passport.MapPinDrop");
            sparksevent.put("pinLat", Double.valueOf(a));
            sparksevent.put("pinLon", Double.valueOf(b));
            sparksevent.put("myLocation", Boolean.valueOf(true));
            com.tinder.managers.a.a(sparksevent);
        }

            public 
            {
                c = FragmentMap.this;
                a = d1;
                b = d2;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/FragmentMap$2

/* anonymous class */
    public final class _cls2
        implements Runnable
    {

        final LatLng a;
        final TinderLocation b;
        final FragmentMap c;

        public final void run()
        {
            com.google.android.m4b.maps.model.j j1 = c.a(a, false);
            c.a(j1, b);
        }

            public 
            {
                c = FragmentMap.this;
                a = latlng;
                b = tinderlocation;
                super();
            }
    }

}
