// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterPoint, MarkerOptionsChooser, AnimatedTransition, Options, 
//            ClusterTransitions

class ClusterTransitionsAnimation
    implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener
{

    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;
    private ObjectAnimator d;
    private AnimatedTransitionState e;
    private ClusterTransitions f;
    private Marker g[];
    private Marker h[];
    private final HashMap i = new HashMap();
    private final HashMap j = new HashMap();

    ClusterTransitionsAnimation(GoogleMap googlemap, Options options, Host host)
    {
        a = new WeakReference(googlemap);
        b = new WeakReference(options);
        c = new WeakReference(host);
    }

    private static Marker a(GoogleMap googlemap, MarkerOptionsChooser markeroptionschooser, ClusterPoint clusterpoint)
    {
        MarkerOptions markeroptions = new MarkerOptions();
        markeroptions.position(clusterpoint.a());
        if (markeroptionschooser != null)
        {
            markeroptionschooser.choose(markeroptions, clusterpoint);
        }
        googlemap = googlemap.addMarker(markeroptions);
        clusterpoint.a(googlemap);
        return googlemap;
    }

    final ClusterPoint a(Marker marker)
    {
        marker = (AnimatedTransition)i.get(marker);
        if (marker != null)
        {
            return marker.b();
        } else
        {
            return null;
        }
    }

    final void a()
    {
        if (d != null)
        {
            d.cancel();
        }
    }

    final void a(ClusterTransitions clustertransitions)
    {
        if (e == null)
        {
            Options options = (Options)b.get();
            Host host = (Host)c.get();
            if (options != null && host != null)
            {
                e = new AnimatedTransitionState(clustertransitions.a, (byte)0);
                f = clustertransitions;
                d = ObjectAnimator.ofFloat(e, "value", new float[] {
                    0.0F, 1.0F
                });
                d.addListener(this);
                d.addUpdateListener(this);
                d.setDuration(options.a());
                d.setInterpolator(options.b());
                host.onClusterTransitionStarting();
                d.start();
            }
        }
    }

    final ClusterPoint b(Marker marker)
    {
        return (ClusterPoint)j.get(marker);
    }

    final void b()
    {
        boolean flag = false;
        if (g != null && g.length > 0)
        {
            Marker amarker[] = g;
            int i1 = amarker.length;
            for (int k = 0; k < i1; k++)
            {
                amarker[k].remove();
            }

            g = null;
        }
        if (h != null && h.length > 0)
        {
            Marker amarker1[] = h;
            int j1 = amarker1.length;
            for (int l = ((flag) ? 1 : 0); l < j1; l++)
            {
                amarker1[l].remove();
            }

            h = null;
        }
        e = null;
        f = null;
        i.clear();
        j.clear();
        d = null;
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        animator = (Host)c.get();
        if (animator != null)
        {
            animator.onClusterTransitionFinished();
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        boolean flag = false;
        animator = (GoogleMap)a.get();
        Object obj = (Options)b.get();
        if (animator != null && obj != null)
        {
            obj = ((Options) (obj)).e();
            ArrayList arraylist = e.a();
            int i1 = arraylist.size();
            g = new Marker[i1];
            for (int k = 0; k < i1; k++)
            {
                AnimatedTransition animatedtransition = (AnimatedTransition)arraylist.get(k);
                Marker marker = a(animator, ((MarkerOptionsChooser) (obj)), animatedtransition.a());
                g[k] = marker;
                i.put(marker, animatedtransition);
            }

            arraylist = f.b;
            i1 = arraylist.size();
            if (i1 > 0)
            {
                h = new Marker[i1];
                for (int l = ((flag) ? 1 : 0); l < i1; l++)
                {
                    ClusterPoint clusterpoint = (ClusterPoint)arraylist.get(l);
                    Marker marker1 = a(animator, ((MarkerOptionsChooser) (obj)), clusterpoint);
                    h[l] = marker1;
                    j.put(marker1, clusterpoint);
                }

            }
        }
        ((Host)c.get()).onClusterTransitionStarted();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (e != null && g != null)
        {
            valueanimator = AnimatedTransitionState.a(e);
            for (int k = 0; k < g.length; k++)
            {
                g[k].setPosition(valueanimator[k]);
            }

        }
    }

    private class Host
    {

        public abstract void onClusterTransitionFinished();

        public abstract void onClusterTransitionStarted();

        public abstract void onClusterTransitionStarting();
    }


    private class AnimatedTransitionState
    {

        final ClusterTransitionsAnimation a;
        private final ArrayList b;
        private float c;

        static LatLng[] a(AnimatedTransitionState animatedtransitionstate)
        {
            LatLng alatlng[] = new LatLng[animatedtransitionstate.b.size()];
            Iterator iterator = animatedtransitionstate.b.iterator();
            int k = 0;
            while (iterator.hasNext()) 
            {
                AnimatedTransition animatedtransition = (AnimatedTransition)iterator.next();
                LatLng latlng = animatedtransition.a().a();
                LatLng latlng1 = animatedtransition.b().a();
                double d4 = latlng.latitude;
                double d5 = animatedtransitionstate.c;
                double d6 = latlng1.latitude;
                double d7 = latlng.latitude;
                double d1;
                if (!animatedtransition.c())
                {
                    d1 = latlng.longitude;
                    double d2 = animatedtransitionstate.c;
                    d1 = (latlng1.longitude - latlng.longitude) * d2 + d1;
                } else
                {
                    double d3;
                    if (latlng.longitude < 0.0D)
                    {
                        d1 = latlng.longitude + 360D;
                    } else
                    {
                        d1 = latlng.longitude;
                    }
                    if (latlng1.longitude < 0.0D)
                    {
                        d3 = latlng1.longitude + 360D;
                    } else
                    {
                        d3 = latlng1.longitude;
                    }
                    d1 = (d1 + (d3 - d1) * (double)animatedtransitionstate.c) - 360D;
                }
                alatlng[k] = new LatLng(d4 + d5 * (d6 - d7), d1);
                k++;
            }
            return alatlng;
        }

        public final ArrayList a()
        {
            return b;
        }

        private AnimatedTransitionState(ArrayList arraylist)
        {
            a = ClusterTransitionsAnimation.this;
            super();
            b = arraylist;
        }

        AnimatedTransitionState(ArrayList arraylist, byte byte0)
        {
            this(arraylist);
        }
    }

}
