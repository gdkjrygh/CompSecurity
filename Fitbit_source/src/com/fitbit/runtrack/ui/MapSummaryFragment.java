// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.maps.FitbitMapOptions;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.LatLngBounds;
import com.fitbit.maps.MarkerOptions;
import com.fitbit.maps.e;
import com.fitbit.maps.h;
import com.fitbit.maps.o;
import com.fitbit.maps.v;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.util.f.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            PathTrackingMapFragment, g, l, k

public class MapSummaryFragment extends Fragment
    implements android.support.v4.app.FragmentManager.OnBackStackChangedListener, com.fitbit.maps.h.f, com.fitbit.maps.h.i, Callable
{

    private static final String a = "MapSummaryFragment";
    private static final String b = "session";
    private static final String c = "splits";
    private static final String d = "events";
    private static final String e = "stats";
    private static final String f = "is-full-screen";
    private static final String g = "duration";
    private static final String h = "distance";
    private static final String i = "h:mm a, EEE, MMMM dd, yyyy";
    private ExerciseSession j;
    private List k;
    private List l;
    private ExerciseStat m;
    private Duration n;
    private Length o;
    private boolean p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;

    public MapSummaryFragment()
    {
    }

    public static MapSummaryFragment a(ActivityLogEntry activitylogentry, ExerciseSession exercisesession, List list, List list1, ExerciseStat exercisestat)
    {
        return a(activitylogentry, exercisesession, list, list1, exercisestat, false);
    }

    public static MapSummaryFragment a(ActivityLogEntry activitylogentry, ExerciseSession exercisesession, List list, List list1, ExerciseStat exercisestat, boolean flag)
    {
        MapSummaryFragment mapsummaryfragment = new MapSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("session", exercisesession);
        bundle.putParcelableArrayList("splits", new ArrayList(list1));
        bundle.putParcelable("stats", exercisestat);
        bundle.putParcelableArrayList("events", new ArrayList(list));
        bundle.putBoolean("is-full-screen", flag);
        bundle.putLong("duration", exercisestat.c().a(TimeUnit.MILLISECONDS));
        bundle.putDouble("distance", activitylogentry.b().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b());
        mapsummaryfragment.setArguments(bundle);
        return mapsummaryfragment;
    }

    private void b()
    {
        if (isVisible())
        {
            Object obj = getActivity();
            if (obj instanceof ActionBarActivity)
            {
                ActionBar actionbar = ((ActionBarActivity)obj).getSupportActionBar();
                if (actionbar != null)
                {
                    if (p)
                    {
                        actionbar.hide();
                    } else
                    {
                        actionbar.show();
                    }
                }
            }
            obj = ((FragmentActivity) (obj)).getWindow();
            if (p)
            {
                ((Window) (obj)).setFlags(1024, 1024);
            } else
            {
                ((Window) (obj)).clearFlags(1024);
            }
            obj = (PathTrackingMapFragment)getChildFragmentManager().findFragmentByTag("map");
            if (obj != null && ((PathTrackingMapFragment) (obj)).b() != null)
            {
                ((PathTrackingMapFragment) (obj)).b().m().i(p);
                return;
            }
        }
    }

    private void c()
    {
        PathTrackingMapFragment pathtrackingmapfragment = (PathTrackingMapFragment)getChildFragmentManager().findFragmentByTag("map");
        com.fitbit.maps.LatLngBounds.a a1 = LatLngBounds.b();
        Iterator iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ExerciseEvent exerciseevent = (ExerciseEvent)iterator.next();
            if (exerciseevent.type != com.fitbit.runtrack.data.ExerciseEvent.Type.a)
            {
                a1.a(new LatLng(exerciseevent.location.getLatitude(), exerciseevent.location.getLongitude()));
            }
        } while (true);
        float f2 = (float)getView().findViewById(0x7f1102d0).getMeasuredHeight() * 1.75F;
        float f1 = f2;
        if (f2 <= 0.0F)
        {
            f1 = (float)getResources().getDimensionPixelOffset(0x7f0a00b6) * 1.75F;
        }
        int i1 = Math.round(f1);
        pathtrackingmapfragment.b().a(com.fitbit.maps.e.a(a1.a(), i1));
    }

    private void d()
    {
        (new g()).a(SupportedActivity.a(j)).f();
        p = true;
        getChildFragmentManager().beginTransaction().addToBackStack("fullscreen").commit();
        getChildFragmentManager().addOnBackStackChangedListener(this);
    }

    public Boolean a()
    {
        Object obj = (PathTrackingMapFragment)getChildFragmentManager().findFragmentByTag("map");
        Profile profile = an.a().b();
        l l1 = new l(profile);
        if (obj == null || ((PathTrackingMapFragment) (obj)).b() == null || !((PathTrackingMapFragment) (obj)).isVisible() || l.isEmpty())
        {
            return Boolean.valueOf(false);
        }
        ((PathTrackingMapFragment) (obj)).b().e();
        ((PathTrackingMapFragment) (obj)).a(l);
        int j1 = k.size() - 1;
        k k1 = new k(getActivity(), 0x7f0202dc);
        k1.a(getResources().getDimension(0x7f0a00fb));
        k k2 = new k(getActivity(), 0x7f0202db);
        k2.a(getResources().getDimension(0x7f0a00fb));
        int i1 = 0;
        while (i1 <= j1) 
        {
            Object obj1 = (Split)k.get(i1);
            MarkerOptions markeroptions = new MarkerOptions();
            markeroptions.a(false);
            obj1 = ((Split) (obj1)).a();
            markeroptions.a(new LatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude()));
            if (i1 == j1)
            {
                markeroptions.a(k2.a(l1.a(getActivity(), o.a(profile.t()).b())));
            } else
            {
                markeroptions.a(k1.a(String.valueOf(i1 + 1)));
            }
            if (SupportedActivity.a(j) != SupportedActivity.d || i1 == j1)
            {
                ((PathTrackingMapFragment) (obj)).b().a(markeroptions);
            }
            i1++;
        }
        c();
        ((PathTrackingMapFragment) (obj)).b().a(this);
        ((PathTrackingMapFragment) (obj)).b().a(this);
        if (SupportedActivity.a(j) == SupportedActivity.d)
        {
            obj = l1.b(getActivity(), m);
        } else
        {
            obj = getString(0x7f0805ab, new Object[] {
                l1.a(getActivity(), m)
            });
        }
        q.setText(((CharSequence) (obj)));
        s.setText(l1.a(m));
        r.setText(getString(0x7f0805a5, new Object[] {
            DateUtils.formatElapsedTime(n.a(TimeUnit.SECONDS))
        }));
        return Boolean.valueOf(true);
    }

    public void a(LatLng latlng)
    {
        if (!p)
        {
            d();
        }
    }

    public boolean a(o o1)
    {
        if (!p)
        {
            d();
        }
        return true;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    public void onBackStackChanged()
    {
        if (getChildFragmentManager().getBackStackEntryCount() == 0)
        {
            p = false;
        }
        b();
        c();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = (ExerciseSession)getArguments().getParcelable("session");
        k = getArguments().getParcelableArrayList("splits");
        l = getArguments().getParcelableArrayList("events");
        m = (ExerciseStat)getArguments().getParcelable("stats");
        n = new Duration(getArguments().getLong("duration"));
        o = new Length(getArguments().getDouble("distance"), com.fitbit.data.domain.Length.LengthUnits.METERS);
        p = getArguments().getBoolean("is-full-screen");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400b5, viewgroup, false);
        t = (TextView)layoutinflater.findViewById(0x7f1102d5);
        viewgroup = new SimpleDateFormat("h:mm a, EEE, MMMM dd, yyyy", Locale.getDefault());
        t.setText(viewgroup.format(j.c()));
        r = (TextView)layoutinflater.findViewById(0x7f1102d3);
        q = (TextView)layoutinflater.findViewById(0x7f1102d4);
        s = (TextView)layoutinflater.findViewById(0x7f1102d2);
        boolean flag;
        if (bundle != null)
        {
            flag = bundle.getBoolean("is-full-screen", p);
        } else
        {
            flag = p;
        }
        p = flag;
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is-full-screen", p);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = getChildFragmentManager().findFragmentById(0x7f1102cf);
        view = getChildFragmentManager().beginTransaction();
        if (bundle != null)
        {
            view.remove(bundle);
        }
        bundle = com.fitbit.runtrack.ui.PathTrackingMapFragment.a();
        if (p)
        {
            bundle.f(true);
            bundle.e(true);
        }
        b();
        view.add(0x7f1102cf, (new PathTrackingMapFragment.c()).a(bundle).c(), "map").commit();
        com.fitbit.util.f.a.a(getView(), this);
    }
}
