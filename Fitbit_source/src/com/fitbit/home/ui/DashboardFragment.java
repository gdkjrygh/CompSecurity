// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.LongSparseArray;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.activity.ui.ActivityChart;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.f;
import com.fitbit.activity.ui.landing.ActivityLandingActivity;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.SyncDataForDayOperation;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.ay;
import com.fitbit.data.bl.cq;
import com.fitbit.data.bl.gb;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.Type;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.device.ui.DevicesListFragment;
import com.fitbit.device.ui.GuideActivity_;
import com.fitbit.food.ui.landing.FoodLoggingLandingActivity;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.heartrate.landing.HeartRateLandingActivity;
import com.fitbit.home.ui.tiles.HeartRateTile;
import com.fitbit.home.ui.tiles.d;
import com.fitbit.home.ui.tiles.e;
import com.fitbit.home.ui.tiles.h;
import com.fitbit.home.ui.tiles.i;
import com.fitbit.home.ui.tiles.k;
import com.fitbit.home.ui.tiles.m;
import com.fitbit.home.ui.tiles.r;
import com.fitbit.home.ui.tiles.s;
import com.fitbit.home.ui.tiles.t;
import com.fitbit.home.ui.tiles.u;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.livedata.LiveDataState;
import com.fitbit.multipledevice.a;
import com.fitbit.multipledevice.b;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.ui.ExerciseListActivity;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.l;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.sleep.ui.landing.SleepLoggingLandingActivity;
import com.fitbit.ui.DayFragment;
import com.fitbit.ui.DayPagerFragment;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.drawer.NavigationDrawerActivity;
import com.fitbit.ui.views.DragListView;
import com.fitbit.util.ar;
import com.fitbit.util.bg;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import com.fitbit.util.z;
import com.fitbit.water.Water;
import com.fitbit.water.ui.WaterListActivity;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fitbit.home.ui:
//            DeviceView, HomeNavigationDrawerActivity, HomeNavigationItem, DeviceView_, 
//            a, DetailActivity_, DashboardPagerFragment

public class DashboardFragment extends DayFragment
    implements android.widget.AdapterView.OnItemClickListener, com.fitbit.activity.ui.f.a, DeviceView.a, com.fitbit.util.ar.a
{
    public static final class Tile extends Enum
        implements com.fitbit.ui.k.b
    {

        public static final Tile a;
        public static final Tile b;
        public static final Tile c;
        public static final Tile d;
        public static final Tile e;
        public static final Tile f;
        public static final Tile g;
        public static final Tile h;
        public static final Tile i;
        public static final Tile j;
        public static final Tile k;
        public static final Tile l;
        public static final Tile m;
        public static final Tile n;
        public static final Tile o;
        public static final Tile p;
        private static final Tile q[];
        private final Class clazz;

        public static Tile valueOf(String s1)
        {
            return (Tile)Enum.valueOf(com/fitbit/home/ui/DashboardFragment$Tile, s1);
        }

        public static Tile[] values()
        {
            return (Tile[])q.clone();
        }

        public d a()
        {
            if (clazz != null)
            {
                d d1;
                try
                {
                    d1 = (d)clazz.newInstance();
                }
                catch (InstantiationException instantiationexception)
                {
                    throw new RuntimeException(instantiationexception);
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    throw new RuntimeException(illegalaccessexception);
                }
                return d1;
            } else
            {
                return null;
            }
        }

        public boolean b()
        {
            return this != b && this != p && this != c && this != a;
        }

        static 
        {
            a = new Tile("guide", 0, com/fitbit/home/ui/tiles/k);
            b = new Tile("device", 1);
            c = new Tile("information", 2, com/fitbit/home/ui/tiles/m);
            d = new Tile("steps", 3, com/fitbit/home/ui/tiles/s);
            e = new Tile("heartRate", 4, com/fitbit/home/ui/tiles/HeartRateTile);
            f = new Tile("distance", 5, com/fitbit/home/ui/tiles/f);
            g = new Tile("calories", 6, com/fitbit/home/ui/tiles/b);
            h = new Tile("floors", 7, com/fitbit/home/ui/tiles/h);
            i = new Tile("activeMinutes", 8, com/fitbit/home/ui/tiles/a);
            j = new Tile("workouts", 9, com/fitbit/home/ui/tiles/g);
            k = new Tile("weight", 10, com/fitbit/home/ui/tiles/u);
            l = new Tile("sleep", 11, com/fitbit/home/ui/tiles/r);
            m = new Tile("caloriesInOut", 12, com/fitbit/home/ui/tiles/c);
            n = new Tile("food", 13, com/fitbit/home/ui/tiles/i);
            o = new Tile("water", 14, com/fitbit/home/ui/tiles/t);
            p = new Tile("hidden", 15, com/fitbit/home/ui/tiles/l);
            q = (new Tile[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p
            });
        }

        private Tile(String s1, int i1)
        {
            this(s1, i1, null);
        }

        private Tile(String s1, int i1, Class class1)
        {
            super(s1, i1);
            clazz = class1;
        }
    }

    public static class a
        implements Callable
    {

        private final Calendar a;
        private final Date b;
        private final boolean c;
        private final boolean d;

        private com.fitbit.home.ui.tiles.e.a a(Date date, Profile profile)
        {
            profile = new com.fitbit.home.ui.tiles.e.a();
            gd gd1 = gd.a();
            com.fitbit.data.bl.f f1 = com.fitbit.data.bl.f.a();
            Object obj = new GregorianCalendar();
            ((Calendar) (obj)).setTime(date);
            ((Calendar) (obj)).add(5, -1);
            obj = ((Calendar) (obj)).getTime();
            profile.a = com.fitbit.data.bl.t.a().b();
            profile.b = gd1.e(date);
            profile.c = gd1.e(((Date) (obj)));
            profile.d = f1.d(date);
            return profile;
        }

        private void a(e e1)
        {
            Iterator iterator = gb.a().a(b).iterator();
            double d1;
            for (d1 = 0.0D; iterator.hasNext(); d1 = ((WaterLogEntry)iterator.next()).e().a(com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML).b() + d1) { }
            e1.o = new Water(d1, com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
        }

        public e a()
            throws Exception
        {
            bg bg1 = new bg("DashboardFragment", true);
            e e1 = new e();
            e1.b = a;
            e1.c = an.a().b();
            e1.d = d;
            e1.a = c;
            e1.g = com.fitbit.data.bl.t.a().e(b);
            e1.h = com.fitbit.data.bl.t.a().f(b);
            e1.e = com.fitbit.data.bl.t.a().c(b);
            e1.f = com.fitbit.data.bl.t.a().a(b);
            e1.i = com.fitbit.data.bl.t.a().d(b);
            e1.m = com.fitbit.data.bl.t.a().b(b);
            e1.j = com.fitbit.data.bl.t.a().g(b);
            e1.k = com.fitbit.data.bl.t.a().h(b);
            e1.n = a(b, e1.c);
            e1.p = ay.a().b(b);
            e1.q = ActivityBusinessLogic.a().a(b);
            e1.r.clear();
            Iterator iterator = e1.q.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ActivityLogEntry activitylogentry = (ActivityLogEntry)iterator.next();
                if (activitylogentry.f())
                {
                    Object obj = activitylogentry.p();
                    if (obj != null)
                    {
                        Type type = ((com.fitbit.data.domain.b) (obj)).b();
                        static class _cls2
                        {

                            static final int a[];
                            static final int b[];

                            static 
                            {
                                b = new int[Type.values().length];
                                try
                                {
                                    b[Type.MOBILE_RUN.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror14) { }
                                a = new int[Tile.values().length];
                                try
                                {
                                    a[Tile.j.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror13) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.i.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror12) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.k.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror11) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.g.ordinal()] = 4;
                                }
                                catch (NoSuchFieldError nosuchfielderror10) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.f.ordinal()] = 5;
                                }
                                catch (NoSuchFieldError nosuchfielderror9) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.h.ordinal()] = 6;
                                }
                                catch (NoSuchFieldError nosuchfielderror8) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.m.ordinal()] = 7;
                                }
                                catch (NoSuchFieldError nosuchfielderror7) { }
                                try
                                {
                                    a[Tile.n.ordinal()] = 8;
                                }
                                catch (NoSuchFieldError nosuchfielderror6) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.l.ordinal()] = 9;
                                }
                                catch (NoSuchFieldError nosuchfielderror5) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.d.ordinal()] = 10;
                                }
                                catch (NoSuchFieldError nosuchfielderror4) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.b.ordinal()] = 11;
                                }
                                catch (NoSuchFieldError nosuchfielderror3) { }
                                try
                                {
                                    a[Tile.o.ordinal()] = 12;
                                }
                                catch (NoSuchFieldError nosuchfielderror2) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.e.ordinal()] = 13;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    a[com.fitbit.home.ui.Tile.a.ordinal()] = 14;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        switch (com.fitbit.home.ui._cls2.b[type.ordinal()])
                        {
                        case 1: // '\001'
                            Object obj1 = new com.fitbit.runtrack.data.b();
                            obj = ((com.fitbit.runtrack.data.b) (obj1)).a(UUID.fromString(((com.fitbit.data.domain.b) (obj)).a()));
                            if (obj != null)
                            {
                                obj1 = (ExerciseStat)((com.fitbit.runtrack.data.b) (obj1)).g(((com.fitbit.runtrack.data.ExerciseSession) (obj))).first;
                                e1.r.put(activitylogentry.getEntityId().longValue(), new com.fitbit.home.ui.tiles.e.b(((com.fitbit.runtrack.data.ExerciseSession) (obj)), ((ExerciseStat) (obj1))));
                            }
                            break;
                        }
                    }
                }
            } while (true);
            boolean flag;
            if (com.fitbit.data.bl.b.a().c() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e1.t = flag;
            e1.s = com.fitbit.data.bl.u.a().a(b);
            a(e1);
            com.fitbit.e.a.a("DashboardFragment", "Current device timezone: %s", new Object[] {
                TimeZone.getDefault().getDisplayName()
            });
            if (e1.c != null && e1.c.L() != null)
            {
                com.fitbit.e.a.a("DashboardFragment", "Current profile timezone: %s", new Object[] {
                    e1.c.L().c()
                });
            }
            bg1.a("dashboard data", com.fitbit.util.format.e.a(a));
            return e1;
        }

        public Object call()
            throws Exception
        {
            return a();
        }

        public a(Calendar calendar, boolean flag, boolean flag1)
        {
            a = calendar;
            b = calendar.getTime();
            c = flag;
            d = flag1;
        }
    }

    private class b extends com.fitbit.ui.k
    {

        final DashboardFragment a;
        private final c b;
        private final Set c = new HashSet();
        private e d;
        private Date e;

        public void a()
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((DataSetObserver)iterator.next()).onChanged()) { }
        }

        public void a(e e1, Date date)
        {
            d = e1;
            e = date;
            a();
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            Tile tile = (Tile)a(i1);
            switch (com.fitbit.home.ui._cls2.a[tile.ordinal()])
            {
            default:
                View view1 = view;
                if (view == null)
                {
                    view = tile.a();
                    view.a(viewgroup.getContext());
                    view1 = view.a(viewgroup);
                    view1.setTag(0x7f11001d, view);
                }
                view = (d)view1.getTag(0x7f11001d);
                view.a(e);
                if (d != null)
                {
                    view.b(d);
                    return view1;
                } else
                {
                    view.O_();
                    return view1;
                }

            case 11: // '\013'
                return b.b;
            }
        }

        public void registerDataSetObserver(DataSetObserver datasetobserver)
        {
            super.registerDataSetObserver(datasetobserver);
            c.add(datasetobserver);
        }

        public void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
            super.unregisterDataSetObserver(datasetobserver);
            c.remove(datasetobserver);
        }

        public b(Context context, c c1)
        {
            a = DashboardFragment.this;
            super(context, "dashboard-layout", com/fitbit/home/ui/DashboardFragment$Tile);
            d = null;
            b = c1;
        }
    }

    private static class c
    {

        View a;
        DeviceView b;
        DragListView c;

        private c()
        {
        }

    }


    private static final String c = "DashboardFragment";
    private static Map e = new HashMap();
    private static Queue f = new LinkedList();
    private static Configuration g = null;
    private static final String h = "unpair_device_action";
    private static IntentFilter i = new IntentFilter("unpair_device_action");
    private Runnable A;
    protected GalileoServicesStateListener a;
    com.fitbit.util.threading.c b;
    private Handler j;
    private AtomicBoolean k;
    private e l;
    private TextView m;
    private DeviceView n;
    private ar o;
    private BroadcastReceiver p;
    private BroadcastReceiver q;
    private com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener r;
    private Runnable s;
    private DragListView t;
    private b u;
    private f v;
    private c w;
    private boolean x;
    private boolean y;
    private boolean z;

    public DashboardFragment()
    {
        j = new Handler();
        k = new AtomicBoolean(false);
        o = new ar(this);
        p = new BroadcastReceiver() {

            final DashboardFragment a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (!"com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED".equals(context)) goto _L2; else goto _L1
_L1:
                if (a.a.c() == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
                {
                    com.fitbit.home.ui.DashboardFragment.a(a, false, true);
                }
_L4:
                return;
_L2:
                if ("com.fitbit.galileo.GALILEO_SYNC_SERVICE_CURRENT_DEVICE_CHANGED".equals(context))
                {
                    com.fitbit.home.ui.DashboardFragment.a(a).b();
                    com.fitbit.home.ui.DashboardFragment.a(a, false, true);
                    return;
                }
                if ("com.fitbit.galileo.GALILEO_DAILY_TOTALS_UPDATED".equals(context))
                {
                    com.fitbit.home.ui.DashboardFragment.a(a, false, false);
                    return;
                }
                if ("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED".equals(context))
                {
                    context = (LiveDataPacket)intent.getParcelableExtra("com.fitbit.livedata.LiveDataBroadcaster.EXTRA_LIVE_DATA_PACKET");
                    com.fitbit.home.ui.DashboardFragment.a(a, context);
                    return;
                }
                if (!com.fitbit.multipledevice.a.a.equals(context))
                {
                    break; /* Loop/switch isn't completed */
                }
                if (com.fitbit.multipledevice.a.a().j().b())
                {
                    com.fitbit.home.ui.DashboardFragment.a(a, null);
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
                if ("SavedState.GalileoState.LIVE_DATA_PACKET_INVALIDATED".equals(context))
                {
                    com.fitbit.home.ui.DashboardFragment.a(a, null);
                    return;
                }
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(context))
                {
                    context = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_OLD_STATUS");
                    intent = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS");
                    boolean flag = com.fitbit.bluetooth.connection.e.a(context);
                    boolean flag1 = com.fitbit.bluetooth.connection.e.a(intent);
                    if (!flag && flag1)
                    {
                        com.fitbit.home.ui.DashboardFragment.a(a, false, true);
                        return;
                    }
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        };
        q = new BroadcastReceiver() {

            final DashboardFragment a;

            public void onReceive(Context context, Intent intent)
            {
                if (intent.getAction().equals("unpair_device_action"))
                {
                    com.fitbit.home.ui.DashboardFragment.a(a).b();
                    com.fitbit.home.ui.DashboardFragment.a(a, false, true);
                }
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        };
        b = new com.fitbit.util.threading.c() {

            final DashboardFragment a;

            protected void a(Intent intent)
            {
                if (a.isResumed() && com.fitbit.home.ui.DashboardFragment.a(a) != null)
                {
                    com.fitbit.home.ui.DashboardFragment.a(a).n();
                }
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        };
        r = new com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener() {

            final DashboardFragment a;
            private Runnable b;

            static Runnable a(_cls5 _pcls5, Runnable runnable)
            {
                _pcls5.b = runnable;
                return runnable;
            }

            private void b()
            {
                FragmentActivity fragmentactivity = a.getActivity();
                if (fragmentactivity != null && b == null)
                {
                    Runnable runnable = new Runnable(this) {

                        final _cls5 a;

                        public void run()
                        {
                            com.fitbit.home.ui.DashboardFragment.a(a.a, false, false);
                            com.fitbit.home.ui._cls5.a(a, null);
                        }

            
            {
                a = _pcls5;
                super();
            }
                    };
                    b = runnable;
                    fragmentactivity.runOnUiThread(runnable);
                }
            }

            public void a()
            {
                if (com.fitbit.home.ui.DashboardFragment.b(a).compareAndSet(false, true))
                {
                    b();
                }
            }

            public void a(com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason offlinereason)
            {
                if (com.fitbit.home.ui.DashboardFragment.b(a).compareAndSet(true, false))
                {
                    b();
                }
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        };
        s = new Runnable() {

            final DashboardFragment a;

            public void run()
            {
                if (a.getActivity() != null)
                {
                    com.fitbit.home.ui.DashboardFragment.a(a, false, false);
                    com.fitbit.home.ui.DashboardFragment.c(a);
                }
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        };
        x = false;
        y = false;
        z = false;
        A = new Runnable() {

            final DashboardFragment a;

            public void run()
            {
                Intent intent = null;
                if (a.isResumed())
                {
                    if (com.fitbit.home.ui.DashboardFragment.d(a) != null)
                    {
                        com.fitbit.home.ui.DashboardFragment.d(a).f();
                        com.fitbit.home.ui.DashboardFragment.d(a).a(null);
                        com.fitbit.home.ui.DashboardFragment.a(a, null);
                    }
                    if (a.u())
                    {
                        com.fitbit.home.ui.DashboardFragment.a(a, true);
                    } else
                    {
                        FragmentActivity fragmentactivity = a.getActivity();
                        if (fragmentactivity != null)
                        {
                            com.fitbit.home.ui.DashboardFragment.a(a, new f(a, fragmentactivity.getApplication()));
                            a a1 = new a(com.fitbit.home.ui.DashboardFragment.e(a), a.s(), com.fitbit.home.ui.DashboardFragment.b(a).get());
                            com.fitbit.home.ui.DashboardFragment.d(a).a(a1);
                            if (com.fitbit.home.ui.DashboardFragment.f(a))
                            {
                                intent = cq.a(fragmentactivity, com.fitbit.home.ui.DashboardFragment.g(a).getTime(), com.fitbit.home.ui.DashboardFragment.h(a), SyncDataForDayOperation.f);
                            }
                            com.fitbit.home.ui.DashboardFragment.d(a).a(intent, UUID.randomUUID());
                            if (fragmentactivity instanceof NavigationDrawerActivity)
                            {
                                ((NavigationDrawerActivity)fragmentactivity).l();
                                return;
                            }
                        }
                    }
                }
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        };
    }

    private void A()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED");
        intentfilter.addAction("com.fitbit.galileo.GALILEO_DAILY_TOTALS_UPDATED");
        intentfilter.addAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_CURRENT_DEVICE_CHANGED");
        intentfilter.addAction("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED");
        intentfilter.addAction(com.fitbit.multipledevice.a.a);
        intentfilter.addAction("SavedState.GalileoState.LIVE_DATA_PACKET_INVALIDATED");
        intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
        com.fitbit.util.z.a(p, intentfilter);
    }

    private void B()
    {
        com.fitbit.util.z.a(p);
    }

    private void C()
    {
        Object obj;
label0:
        {
            if (l != null && l.c != null)
            {
                obj = n.c();
                if (obj != null)
                {
                    if (!com.fitbit.multipledevice.b.a() || l.c.s().size() == 0)
                    {
                        break label0;
                    }
                    if (getActivity() instanceof HomeNavigationDrawerActivity)
                    {
                        ((HomeNavigationDrawerActivity)getActivity()).a(com.fitbit.home.ui.HomeNavigationItem.f);
                    }
                }
            }
            return;
        }
        Intent intent = DevicesListFragment.a(getActivity(), ((Device) (obj)));
        obj = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), n.findViewById(0x7f1103d7), (new StringBuilder()).append("trackerImage").append(((Device) (obj)).c()).toString());
        ActivityCompat.startActivity(getActivity(), intent, ((ActivityOptionsCompat) (obj)).toBundle());
    }

    static f a(DashboardFragment dashboardfragment, f f1)
    {
        dashboardfragment.v = f1;
        return f1;
    }

    private c a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        bg bg1 = new bg("DashboardFragment", true);
        c c1 = new c();
        c1.a = layoutinflater.inflate(0x7f040093, viewgroup, false);
        c1.b = com.fitbit.home.ui.DeviceView_.b(layoutinflater.getContext());
        c1.c = (DragListView)c1.a.findViewById(0x7f11027a);
        bg1.a("create dashboard view");
        return c1;
    }

    static DeviceView a(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.n;
    }

    private void a(c c1)
    {
        bg bg1 = new bg("DashboardFragment", true);
        t = c1.c;
        t.setOnItemClickListener(this);
        u = new b(c1.a.getContext(), c1);
        t.a(new com.fitbit.ui.views.DragListView.a() {

            final DashboardFragment a;

            public void a()
            {
                ((DashboardPagerFragment)a.getParentFragment()).d();
            }

            public void a(android.view.View.DragShadowBuilder dragshadowbuilder)
            {
                ((DashboardPagerFragment)a.getParentFragment()).c();
            }

            public boolean a(int i1, int j1)
            {
                if (i1 == j1)
                {
                    return false;
                }
                Tile tile = (Tile)com.fitbit.home.ui.DashboardFragment.i(a).a(i1);
                if (com.fitbit.home.ui.DashboardFragment.i(a).a(com.fitbit.home.ui.Tile.p) == j1)
                {
                    return false;
                }
                if (i1 < j1)
                {
                    com.fitbit.home.ui.DashboardFragment.i(a).b().h(tile);
                } else
                {
                    com.fitbit.home.ui.DashboardFragment.i(a).b().e(tile);
                }
                return true;
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        });
        m = (TextView)c1.a.findViewById(0x7f110279);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final DashboardFragment a;

            public void onClick(View view)
            {
                ((DayPagerFragment)a.getParentFragment()).h();
            }

            
            {
                a = DashboardFragment.this;
                super();
            }
        });
        t.setAdapter(u);
        n = c1.b;
        n.a(this);
        c1 = (e)e.get(getTag());
        u.a(c1, d.getTime());
        if (c1 != null)
        {
            l = c1;
            K_();
        } else
        {
            n.j();
            n.a(an.a().b());
        }
        bg1.a("reuse dashboard view");
    }

    static void a(DashboardFragment dashboardfragment, LiveDataPacket livedatapacket)
    {
        dashboardfragment.a(livedatapacket);
    }

    static void a(DashboardFragment dashboardfragment, boolean flag, boolean flag1)
    {
        dashboardfragment.a(flag, flag1);
    }

    private void a(e e1)
    {
        if (l != null && e1 != null)
        {
            e1.l = l.l;
        }
        l = e1;
        u.a(l, d.getTime());
    }

    private void a(LiveDataPacket livedatapacket)
    {
        if (l != null)
        {
            com.fitbit.e.a.a("DashboardFragment", "setting new live data packet = %s", new Object[] {
                livedatapacket
            });
            l.a(livedatapacket);
            u.a(l, d.getTime());
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        x = flag;
        y = flag1;
        j.removeCallbacks(A);
        j.postDelayed(A, 100L);
    }

    static boolean a(DashboardFragment dashboardfragment, boolean flag)
    {
        dashboardfragment.z = flag;
        return flag;
    }

    static AtomicBoolean b(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.k;
    }

    static void c(DashboardFragment dashboardfragment)
    {
        dashboardfragment.n();
    }

    static f d(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.v;
    }

    static Calendar e(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.d;
    }

    static boolean f(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.y;
    }

    static Calendar g(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.d;
    }

    static boolean h(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.x;
    }

    static b i(DashboardFragment dashboardfragment)
    {
        return dashboardfragment.u;
    }

    public static void k()
    {
        e.clear();
    }

    private void n()
    {
        j.removeCallbacks(s);
        j.postDelayed(s, 30000L);
    }

    private void v()
    {
        j.removeCallbacks(s);
    }

    private void w()
    {
        if (l != null && l.c != null)
        {
            Object obj = com.fitbit.util.p.a(DeviceVersion.parse(UISavedState.n()));
            if (!((List) (obj)).isEmpty())
            {
                obj = ((Device)((List) (obj)).get(0)).z();
                if (obj != null)
                {
                    UISavedState.j();
                    GuideActivity_.a(getActivity()).a(((com.fitbit.data.domain.device.GuideInfo) (obj))).b();
                }
            }
        }
    }

    private boolean x()
    {
        return com.fitbit.util.p.a(com.fitbit.util.p.b()) && UISavedState.h();
    }

    private void y()
    {
        if (isAdded())
        {
            m.setText(com.fitbit.util.format.e.a(getActivity(), d, r()));
        }
    }

    private void z()
    {
        while (isRemoving() || isDetached() || l == null || com.fitbit.util.p.j() == null) 
        {
            return;
        }
        n.a(l.c);
    }

    public void K_()
    {
        if (q())
        {
            z();
            a(getView());
            TrackerSyncPreferencesSavedState.b(getActivity());
        }
    }

    public View a(int i1, ListView listview)
    {
        int j1 = listview.getFirstVisiblePosition();
        int k1 = listview.getChildCount();
        if (i1 < j1 || i1 > (k1 + j1) - 1)
        {
            return listview.getAdapter().getView(i1, null, listview);
        } else
        {
            return listview.getChildAt(i1 - j1);
        }
    }

    protected void a()
    {
        t.a();
        Profile profile = an.a().b();
        boolean flag1 = n.a(profile);
        u.b().a(flag1, new Tile[] {
            com.fitbit.home.ui.Tile.b
        });
        DragListView draglistview = t;
        int i1;
        if (flag1)
        {
            i1 = 0;
        } else
        {
            i1 = -1;
        }
        draglistview.a(i1);
        if (profile != null)
        {
            boolean flag = x();
            u.b().a(x(), new Tile[] {
                com.fitbit.home.ui.Tile.a
            });
            if (flag)
            {
                Object obj = t;
                if (flag1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                ((DragListView) (obj)).a(i1);
            }
            if (!flag1 && com.fitbit.home.ui.tiles.m.a((FitbitActivity)getActivity()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.c
            });
            if (flag)
            {
                obj = t;
                if (flag1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                ((DragListView) (obj)).a(i1);
            }
            u.b().c(new Tile[] {
                Tile.j, com.fitbit.home.ui.Tile.g, Tile.n, Tile.o
            });
            obj = com.fitbit.util.p.b(DeviceType.TRACKER);
            if (!((List) (obj)).isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.d, com.fitbit.home.ui.Tile.f
            });
            if (flag && (!com.fitbit.util.p.j(((List) (obj))) || ((List) (obj)).size() > 1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.i
            });
            flag = com.fitbit.util.p.a(DeviceFeature.FLOORS);
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.h
            });
            flag = com.fitbit.util.p.a(DeviceFeature.SLEEP);
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.l
            });
            if (profile.a() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.m
            });
            u.b().c(new Tile[] {
                com.fitbit.home.ui.Tile.k
            });
            flag = com.fitbit.util.p.a(DeviceFeature.HEART_RATE);
            u.b().a(flag, new Tile[] {
                com.fitbit.home.ui.Tile.e
            });
        }
    }

    public void a(int i1)
    {
        if (t != null)
        {
            t.setSelection(i1);
        }
    }

    protected void a(View view)
    {
        a();
    }

    public void a(Device device)
    {
        boolean flag1 = com.fitbit.bluetooth.g.a(this, new com.fitbit.util.EnableBluetoothDialog.a(device) {

            final Device a;
            final DashboardFragment b;

            public void a()
            {
                com.fitbit.ui.s.a(b.getActivity(), 0x7f08008e, 1).i();
            }

            public void b()
            {
                b.a(a);
            }

            public void c()
            {
                com.fitbit.ui.s.a(b.getActivity(), 0x7f08008e, 1).i();
            }

            
            {
                b = DashboardFragment.this;
                a = device;
                super();
            }
        }, "BluetoothUtils.REQUEST_ENABLE_BLUETOOTH_FOR_SYNC", true);
        boolean flag = flag1;
        if (flag1)
        {
            flag = flag1;
            if (com.fitbit.bluetooth.g.c(getActivity()))
            {
                flag = false;
            }
        }
        if (flag && device != null)
        {
            com.fitbit.multipledevice.a.a().a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b, true);
        }
    }

    protected void a(boolean flag)
    {
        if (!flag && z)
        {
            z = false;
            a(x, y);
        }
    }

    public void c()
    {
        b.a(new IntentFilter(com.fitbit.home.ui.a.a));
        o.a(getActivity(), true);
        if (com.fitbit.util.p.j() != null)
        {
            n.l();
        }
        A();
        k.set(ServerGateway.a().d());
        ServerGateway.a().b().c(r);
        y();
        a(com.fitbit.savedstate.l.h());
        a();
        if (!p())
        {
            a(false, false);
        }
        n();
        com.fitbit.util.z.a(q, i);
    }

    protected void d()
    {
        super.d();
        a(false, true);
    }

    public void f()
    {
    }

    public void g()
    {
        h();
    }

    public void h()
    {
        if (v.h() || v.c() == null || !q())
        {
            return;
        } else
        {
            a((e)v.c());
            e.put(getTag(), l);
            K_();
            n();
            return;
        }
    }

    public void i()
    {
        b.d();
        if (v != null)
        {
            v.f();
        }
        if (com.fitbit.util.p.j() != null)
        {
            n.m();
        }
        ServerGateway.a().b().a(r);
        B();
        v();
        com.fitbit.util.z.a(q);
        o.b(getActivity());
    }

    public void j()
    {
    }

    public int l()
    {
        if (t == null)
        {
            return 0;
        } else
        {
            return t.getFirstVisiblePosition();
        }
    }

    public void l_()
    {
        k.set(true);
        a(com.fitbit.savedstate.l.h());
        a();
        a(true, true);
        n();
    }

    public void m()
    {
        Tile tile = (Tile)u.a(t.b());
        u.b().i(tile).b(new Tile[] {
            tile
        });
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        v = new f(this, activity.getApplication());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.cloneInContext(new ContextThemeWrapper(getActivity(), 0x7f0c01df));
        bundle = layoutinflater.getContext().getResources().getConfiguration();
        if (g == null || bundle.compareTo(g) != 0)
        {
            if (g != null)
            {
                com.fitbit.e.a.a("DashboardFragment", "Configuration has changed, removing cached views", new Object[0]);
            }
            g = new Configuration(bundle);
            f.clear();
        }
        w = (c)f.poll();
        if (w == null)
        {
            w = a(layoutinflater, viewgroup);
        }
        a(w);
        getActivity().setTitle(0x7f0802d8);
        y();
        a();
        return w.a;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        bg bg1 = new bg("DashboardFragment", true);
        android.view.ViewParent viewparent = w.a.getParent();
        if (viewparent == null || (viewparent instanceof ViewGroup))
        {
            if (viewparent != null)
            {
                ((ViewGroup)viewparent).removeView(w.a);
            }
            f.offer(w);
            bg1.a("recycle dashboard view");
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (isResumed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.fitbit.home.ui._cls2.a[((Tile)u.a(l1)).ordinal()];
        JVM INSTR tableswitch 1 14: default 96
    //                   1 97
    //                   2 126
    //                   3 153
    //                   4 164
    //                   5 191
    //                   6 218
    //                   7 245
    //                   8 245
    //                   9 260
    //                   10 275
    //                   11 302
    //                   12 307
    //                   13 326
    //                   14 341;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L16:
        break; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        (new com.fitbit.runtrack.ui.e()).f();
        startActivity(new Intent(getActivity(), com/fitbit/runtrack/ui/ExerciseListActivity));
        return;
_L5:
        com.fitbit.savedstate.b.a(ActivityChart.d.b());
        getActivity().startActivity(ActivityLandingActivity.a(getActivity(), ActivityType.d));
        return;
_L6:
        com.fitbit.home.ui.DetailActivity_.b(getActivity()).b();
        return;
_L7:
        com.fitbit.savedstate.b.a(ActivityChart.b.b());
        getActivity().startActivity(ActivityLandingActivity.a(getActivity(), ActivityType.b));
        return;
_L8:
        com.fitbit.savedstate.b.a(ActivityChart.c.b());
        getActivity().startActivity(ActivityLandingActivity.a(getActivity(), ActivityType.c));
        return;
_L9:
        com.fitbit.savedstate.b.a(ActivityChart.e.b());
        getActivity().startActivity(ActivityLandingActivity.a(getActivity(), ActivityType.e));
        return;
_L10:
        if (isResumed())
        {
            FoodLoggingLandingActivity.a(getActivity());
            return;
        }
        break; /* Loop/switch isn't completed */
_L11:
        getActivity().startActivity(SleepLoggingLandingActivity.a(getActivity()));
        return;
_L12:
        com.fitbit.savedstate.b.a(ActivityChart.a.b());
        getActivity().startActivity(ActivityLandingActivity.a(getActivity(), ActivityType.a));
        return;
_L13:
        C();
        return;
_L14:
        startActivity(new Intent(getActivity(), com/fitbit/water/ui/WaterListActivity));
        return;
_L15:
        if (!isResumed()) goto _L18; else goto _L17
_L18:
        if (true) goto _L1; else goto _L19
_L17:
        HeartRateLandingActivity.a(getActivity());
        return;
_L19:
        w();
        return;
    }

    public void onPause()
    {
        super.onPause();
        i();
    }

    public void onResume()
    {
        super.onResume();
        c();
    }

    protected void w_()
    {
        super.w_();
        y();
    }

}
