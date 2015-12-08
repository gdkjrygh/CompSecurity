// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterTransitionsAnimation, Options, ClusterPoint, MarkerOptionsChooser, 
//            ClusteringOnCameraChangeListener, ClusterTransitions

public class Clusterkraf
{

    private final WeakReference a;
    private final Options b;
    private final ClusterTransitionsAnimation c;
    private final InnerCallbackListener d = new InnerCallbackListener((byte)0);
    private final ArrayList e = new ArrayList();
    private ArrayList f;
    private ArrayList g;
    private HashMap h;
    private ArrayList i;
    private ArrayList j;
    private BaseClusteringTaskHost k;
    private ClusterTransitionsBuildingTaskHost l;

    public Clusterkraf(GoogleMap googlemap, Options options, ArrayList arraylist)
    {
        h = new HashMap();
        a = new WeakReference(googlemap);
        b = options;
        c = new ClusterTransitionsAnimation(googlemap, options, d);
        e.addAll(arraylist);
        if (googlemap != null)
        {
            googlemap.setOnCameraChangeListener(InnerCallbackListener.a(d));
            googlemap.setOnMarkerClickListener(d);
            googlemap.setOnInfoWindowClickListener(d);
            googlemap.setInfoWindowAdapter(d);
        }
        e();
    }

    static Options a(Clusterkraf clusterkraf)
    {
        return clusterkraf.b;
    }

    static ArrayList a(Clusterkraf clusterkraf, ArrayList arraylist)
    {
        clusterkraf.f = arraylist;
        return arraylist;
    }

    static void a(Clusterkraf clusterkraf, Projection projection)
    {
        clusterkraf.l = clusterkraf. new ClusterTransitionsBuildingTaskHost();
        clusterkraf.l.a(projection);
        clusterkraf.k = null;
    }

    static void a(Clusterkraf clusterkraf, ClusterTransitions clustertransitions)
    {
        if (clustertransitions != null)
        {
            clusterkraf.c.a(clustertransitions);
        }
        clusterkraf.l = null;
    }

    static WeakReference b(Clusterkraf clusterkraf)
    {
        return clusterkraf.a;
    }

    static HashMap c(Clusterkraf clusterkraf)
    {
        return clusterkraf.h;
    }

    private void c()
    {
        GoogleMap googlemap = (GoogleMap)a.get();
        if (googlemap != null && f != null)
        {
            g = new ArrayList(f.size());
            h = new HashMap(f.size());
            MarkerOptionsChooser markeroptionschooser = b.e();
            ClusterPoint clusterpoint;
            Object obj;
            for (Iterator iterator = f.iterator(); iterator.hasNext(); h.put(obj, clusterpoint))
            {
                clusterpoint = (ClusterPoint)iterator.next();
                obj = new MarkerOptions();
                ((MarkerOptions) (obj)).position(clusterpoint.a());
                if (markeroptionschooser != null)
                {
                    markeroptionschooser.choose(((MarkerOptions) (obj)), clusterpoint);
                }
                obj = googlemap.addMarker(((MarkerOptions) (obj)));
                clusterpoint.a(((Marker) (obj)));
                g.add(obj);
            }

        }
    }

    static InnerCallbackListener d(Clusterkraf clusterkraf)
    {
        return clusterkraf.d;
    }

    private void d()
    {
        i = f;
        j = g;
        k = new UpdateClustersAndTransitionClusteringTaskHost((byte)0);
        k.b();
    }

    static BaseClusteringTaskHost e(Clusterkraf clusterkraf)
    {
        return clusterkraf.k;
    }

    private void e()
    {
        if (k != null)
        {
            c();
            k = null;
            return;
        } else
        {
            k = new ShowAllClustersClusteringTaskHost((byte)0);
            k.b();
            return;
        }
    }

    static BaseClusteringTaskHost f(Clusterkraf clusterkraf)
    {
        clusterkraf.k = null;
        return null;
    }

    static ClusterTransitionsBuildingTaskHost g(Clusterkraf clusterkraf)
    {
        return clusterkraf.l;
    }

    static ClusterTransitionsBuildingTaskHost h(Clusterkraf clusterkraf)
    {
        clusterkraf.l = null;
        return null;
    }

    static ClusterTransitionsAnimation i(Clusterkraf clusterkraf)
    {
        return clusterkraf.c;
    }

    static void j(Clusterkraf clusterkraf)
    {
        clusterkraf.d();
    }

    static void k(Clusterkraf clusterkraf)
    {
        if ((GoogleMap)clusterkraf.a.get() != null && clusterkraf.i != null && clusterkraf.j != null)
        {
            for (Iterator iterator = clusterkraf.j.iterator(); iterator.hasNext(); ((Marker)iterator.next()).remove()) { }
            clusterkraf.j = null;
            clusterkraf.i = null;
        }
    }

    static void l(Clusterkraf clusterkraf)
    {
        clusterkraf.c();
    }

    static ArrayList m(Clusterkraf clusterkraf)
    {
        return clusterkraf.e;
    }

    static ArrayList n(Clusterkraf clusterkraf)
    {
        return clusterkraf.i;
    }

    static void o(Clusterkraf clusterkraf)
    {
        clusterkraf.e();
    }

    static ArrayList p(Clusterkraf clusterkraf)
    {
        return clusterkraf.f;
    }

    public final void a()
    {
        if (g != null)
        {
            Iterator iterator = g.iterator();
            while (iterator.hasNext()) 
            {
                ((Marker)iterator.next()).hideInfoWindow();
            }
        }
    }

    public final void a(Marker marker, ClusterPoint clusterpoint)
    {
        GoogleMap googlemap = (GoogleMap)a.get();
        if (googlemap != null && marker != null && clusterpoint != null)
        {
            long l1 = System.currentTimeMillis();
            long l2 = b.m();
            InnerCallbackListener.a(d).a(l1 + l2);
            googlemap.animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()), b.m(), new _cls1());
            marker.showInfoWindow();
        }
    }

    public final void a(ClusterPoint clusterpoint)
    {
        GoogleMap googlemap = (GoogleMap)a.get();
        if (googlemap != null && clusterpoint != null)
        {
            InnerCallbackListener.a(d).a(System.currentTimeMillis());
            googlemap.animateCamera(CameraUpdateFactory.newLatLngBounds(clusterpoint.f(), b.k()), b.l(), null);
        }
    }

    public final void a(ArrayList arraylist)
    {
        e.addAll(arraylist);
        d();
    }

    public final void b()
    {
        if (k != null)
        {
            k.a();
            k = null;
        }
        if (l != null)
        {
            l.a();
            l = null;
        }
        if (g != null)
        {
            for (Iterator iterator = g.iterator(); iterator.hasNext(); ((Marker)iterator.next()).remove()) { }
        }
        f = null;
        h = null;
        g = null;
        i = null;
        j = null;
        e.clear();
    }

    private class InnerCallbackListener
        implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, ClusterTransitionsAnimation.Host, ClusteringOnCameraChangeListener.Host
    {

        private final WeakReference a;
        private final Handler b;
        private final ClusteringOnCameraChangeListener c;

        static ClusteringOnCameraChangeListener a(InnerCallbackListener innercallbacklistener)
        {
            return innercallbacklistener.c;
        }

        static Handler b(InnerCallbackListener innercallbacklistener)
        {
            return innercallbacklistener.b;
        }

        public View getInfoContents(Marker marker)
        {
            Object obj = (Clusterkraf)a.get();
            if (obj != null)
            {
                ClusterPoint clusterpoint = (ClusterPoint)Clusterkraf.c(((Clusterkraf) (obj))).get(marker);
                obj = Clusterkraf.a(((Clusterkraf) (obj))).h();
                if (obj != null)
                {
                    return ((InfoWindowDownstreamAdapter) (obj)).getInfoContents(marker, clusterpoint);
                }
            }
            return null;
        }

        public View getInfoWindow(Marker marker)
        {
            Object obj = (Clusterkraf)a.get();
            if (obj != null)
            {
                ClusterPoint clusterpoint = (ClusterPoint)Clusterkraf.c(((Clusterkraf) (obj))).get(marker);
                obj = Clusterkraf.a(((Clusterkraf) (obj))).h();
                if (obj != null)
                {
                    return ((InfoWindowDownstreamAdapter) (obj)).getInfoWindow(marker, clusterpoint);
                }
            }
            return null;
        }

        public void onClusterTransitionFinished()
        {
            Clusterkraf clusterkraf = (Clusterkraf)a.get();
            if (clusterkraf != null)
            {
                Clusterkraf.l(clusterkraf);
                try
                {
                    Clusterkraf.i(clusterkraf).b();
                }
                catch (Exception exception)
                {
                    PLog.error(exception, "exception occurred", new Object[0]);
                }
            }
            c.a(0L);
        }

        public void onClusterTransitionStarted()
        {
            Clusterkraf clusterkraf = (Clusterkraf)a.get();
            if (clusterkraf != null)
            {
                Clusterkraf.k(clusterkraf);
            }
        }

        public void onClusterTransitionStarting()
        {
            c.a(System.currentTimeMillis());
        }

        public void onClusteringCameraChange()
        {
            Clusterkraf clusterkraf = (Clusterkraf)a.get();
            if (clusterkraf != null)
            {
                if (Clusterkraf.e(clusterkraf) != null)
                {
                    Clusterkraf.e(clusterkraf).a();
                    Clusterkraf.f(clusterkraf);
                }
                if (Clusterkraf.g(clusterkraf) != null)
                {
                    Clusterkraf.g(clusterkraf).a();
                    Clusterkraf.h(clusterkraf);
                }
                Clusterkraf.i(clusterkraf).a();
                Clusterkraf.j(clusterkraf);
            }
        }

        public void onInfoWindowClick(Marker marker)
        {
            Clusterkraf clusterkraf = (Clusterkraf)a.get();
            if (clusterkraf == null) goto _L2; else goto _L1
_L1:
            ClusterPoint clusterpoint;
            boolean flag;
            flag = false;
            clusterpoint = (ClusterPoint)Clusterkraf.c(clusterkraf).get(marker);
            OnInfoWindowClickDownstreamListener oninfowindowclickdownstreamlistener = Clusterkraf.a(clusterkraf).g();
            if (oninfowindowclickdownstreamlistener != null)
            {
                flag = oninfowindowclickdownstreamlistener.onInfoWindowClick(marker, clusterpoint);
            }
            if (flag || clusterpoint == null) goto _L2; else goto _L3
_L3:
            if (clusterpoint.e() <= 1) goto _L5; else goto _L4
_L4:
            _cls2.c[Clusterkraf.a(clusterkraf).j().ordinal()];
            JVM INSTR tableswitch 1 2: default 108
        //                       1 109
        //                       2 115;
               goto _L2 _L6 _L7
_L2:
            return;
_L6:
            clusterkraf.a(clusterpoint);
            return;
_L7:
            marker.hideInfoWindow();
            return;
_L5:
            switch (_cls2.d[Clusterkraf.a(clusterkraf).o().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                marker.hideInfoWindow();
                break;
            }
            return;
        }

        public boolean onMarkerClick(Marker marker)
        {
            Clusterkraf clusterkraf;
            boolean flag4;
            flag4 = false;
            clusterkraf = (Clusterkraf)a.get();
            if (clusterkraf == null) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag2;
            ClusterPoint clusterpoint = (ClusterPoint)Clusterkraf.c(clusterkraf).get(marker);
            OnMarkerClickDownstreamListener onmarkerclickdownstreamlistener;
            boolean flag;
            boolean flag3;
            if (clusterpoint == null)
            {
                if (Clusterkraf.i(clusterkraf).a(marker) != null)
                {
                    flag = true;
                } else
                {
                    clusterpoint = Clusterkraf.i(clusterkraf).b(marker);
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            onmarkerclickdownstreamlistener = Clusterkraf.a(clusterkraf).f();
            if (!flag && onmarkerclickdownstreamlistener != null)
            {
                flag3 = onmarkerclickdownstreamlistener.onMarkerClick(marker, clusterpoint);
            } else
            {
                flag3 = false;
            }
            flag1 = flag;
            flag2 = flag3;
            if (flag) goto _L4; else goto _L3
_L3:
            flag1 = flag;
            flag2 = flag3;
            if (flag3) goto _L4; else goto _L5
_L5:
            flag1 = flag;
            flag2 = flag3;
            if (clusterpoint == null) goto _L4; else goto _L6
_L6:
            if (clusterpoint.e() <= 1) goto _L8; else goto _L7
_L7:
            _cls2.a[Clusterkraf.a(clusterkraf).i().ordinal()];
            JVM INSTR tableswitch 1 2: default 160
        //                       1 203
        //                       2 218;
               goto _L9 _L10 _L11
_L9:
            flag2 = flag3;
_L14:
            flag1 = flag;
_L4:
label0:
            {
                if (!flag2)
                {
                    flag2 = flag4;
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            return flag2;
_L10:
            clusterkraf.a(clusterpoint);
            flag2 = true;
            flag1 = flag;
            if (true) goto _L4; else goto _L11
_L11:
            clusterkraf.a(marker, clusterpoint);
            flag2 = true;
            continue; /* Loop/switch isn't completed */
_L8:
            switch (_cls2.b[Clusterkraf.a(clusterkraf).n().ordinal()])
            {
            default:
                flag1 = flag;
                flag2 = flag3;
                break;

            case 1: // '\001'
                clusterkraf.a(marker, clusterpoint);
                flag2 = true;
                flag1 = flag;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            flag1 = false;
            flag2 = false;
            if (true) goto _L4; else goto _L12
_L12:
            if (true) goto _L14; else goto _L13
_L13:
        }

        private InnerCallbackListener()
        {
            b = new Handler();
            a = new WeakReference(Clusterkraf.this);
            c = new ClusteringOnCameraChangeListener(this, Clusterkraf.a(Clusterkraf.this));
        }

        InnerCallbackListener(byte byte0)
        {
            this();
        }

        private class _cls2
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];

            static 
            {
                d = new int[Options.SinglePointInfoWindowClickBehavior.values().length];
                try
                {
                    d[Options.SinglePointInfoWindowClickBehavior.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    d[Options.SinglePointInfoWindowClickBehavior.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                c = new int[Options.ClusterInfoWindowClickBehavior.values().length];
                try
                {
                    c[Options.ClusterInfoWindowClickBehavior.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    c[Options.ClusterInfoWindowClickBehavior.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    c[Options.ClusterInfoWindowClickBehavior.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                b = new int[Options.SinglePointClickBehavior.values().length];
                try
                {
                    b[Options.SinglePointClickBehavior.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[Options.SinglePointClickBehavior.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[Options.ClusterClickBehavior.values().length];
                try
                {
                    a[Options.ClusterClickBehavior.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Options.ClusterClickBehavior.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Options.ClusterClickBehavior.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class ClusterTransitionsBuildingTaskHost
        implements ClusterTransitionsBuildingTask.Host
    {

        final Clusterkraf a;
        private ClusterTransitionsBuildingTask b;

        public final void a()
        {
            b.cancel(true);
            b = null;
        }

        public final void a(Projection projection)
        {
            ClusterTransitionsBuildingTask.Argument argument;
label0:
            {
                if (projection != null)
                {
                    argument = new ClusterTransitionsBuildingTask.Argument();
                    argument.c = Clusterkraf.p(a);
                    argument.b = Clusterkraf.n(a);
                    argument.a = projection;
                    if (android.os.Build.VERSION.SDK_INT < 11)
                    {
                        break label0;
                    }
                    b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ClusterTransitionsBuildingTask.Argument[] {
                        argument
                    });
                }
                return;
            }
            b.execute(new ClusterTransitionsBuildingTask.Argument[] {
                argument
            });
        }

        public void onClusterTransitionsBuildingTaskPostExecute(ClusterTransitionsBuildingTask.Result result)
        {
            ProcessingListener processinglistener = Clusterkraf.a(a).q();
            if (processinglistener != null)
            {
                processinglistener.onClusteringFinished();
            }
            if (result != null)
            {
                Clusterkraf.a(a, result.a);
            }
            b = null;
        }

        ClusterTransitionsBuildingTaskHost()
        {
            a = Clusterkraf.this;
            super();
            b = new ClusterTransitionsBuildingTask(this);
        }

        private class ProcessingListener
        {

            public abstract void onClusteringFinished();

            public abstract void onClusteringStarted();
        }

    }


    private class UpdateClustersAndTransitionClusteringTaskHost extends BaseClusteringTaskHost
    {
        private class BaseClusteringTaskHost
            implements ClusteringTask.Host
        {

            final Clusterkraf a;
            private ClusteringTask b;

            public final void a()
            {
                ProcessingListener processinglistener = Clusterkraf.a(a).q();
                if (processinglistener != null)
                {
                    processinglistener.onClusteringFinished();
                }
                b.cancel(true);
                b = null;
            }

            protected abstract void a(ClusteringTask.Result result);

            public final void b()
            {
                Object obj;
label0:
                {
                    GoogleMap googlemap = (GoogleMap)Clusterkraf.b(a).get();
                    if (googlemap != null)
                    {
                        obj = Clusterkraf.a(a).q();
                        if (obj != null)
                        {
                            ((ProcessingListener) (obj)).onClusteringStarted();
                        }
                        obj = new ClusteringTask.Argument();
                        obj.a = googlemap.getProjection();
                        obj.b = Clusterkraf.a(a);
                        obj.c = Clusterkraf.m(a);
                        obj.d = Clusterkraf.n(a);
                        if (android.os.Build.VERSION.SDK_INT < 11)
                        {
                            break label0;
                        }
                        b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ClusteringTask.Argument[] {
                            obj
                        });
                    }
                    return;
                }
                b.execute(new ClusteringTask.Argument[] {
                    obj
                });
            }

            public void onClusteringTaskPostExecute(ClusteringTask.Result result)
            {
                Clusterkraf.a(a, result.b);
                a(result);
                b = null;
            }

            BaseClusteringTaskHost()
            {
                a = Clusterkraf.this;
                super();
                b = new ClusteringTask(this);
            }
        }


        final Clusterkraf b;

        protected final void a(ClusteringTask.Result result)
        {
            Clusterkraf.a(b, result.a);
        }

        private UpdateClustersAndTransitionClusteringTaskHost()
        {
            b = Clusterkraf.this;
            super();
        }

        UpdateClustersAndTransitionClusteringTaskHost(byte byte0)
        {
            this();
        }
    }


    private class ShowAllClustersClusteringTaskHost extends BaseClusteringTaskHost
    {

        final Clusterkraf b;

        protected final void a(ClusteringTask.Result result)
        {
            result = Clusterkraf.a(b).q();
            if (result != null)
            {
                result.onClusteringFinished();
            }
            Clusterkraf.o(b);
        }

        private ShowAllClustersClusteringTaskHost()
        {
            b = Clusterkraf.this;
            super();
        }

        ShowAllClustersClusteringTaskHost(byte byte0)
        {
            this();
        }
    }


    private class _cls1
        implements com.google.android.gms.maps.GoogleMap.CancelableCallback
    {

        final Clusterkraf a;

        public void onCancel()
        {
            InnerCallbackListener.a(Clusterkraf.d(a)).a(0L);
        }

        public void onFinish()
        {
            class _cls1
                implements Runnable
            {

                final _cls1 a;

                public void run()
                {
                    InnerCallbackListener.a(Clusterkraf.d(a.a)).a(0L);
                }

                _cls1()
                {
                    a = _cls1.this;
                    super();
                }
            }

            InnerCallbackListener.b(Clusterkraf.d(a)).post(new _cls1());
        }

        _cls1()
        {
            a = Clusterkraf.this;
            super();
        }
    }

}
