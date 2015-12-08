// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.e.a;
import com.fitbit.maps.CameraPosition;
import com.fitbit.maps.FitbitMapOptions;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.g;
import com.fitbit.maps.h;
import com.fitbit.runtrack.ExerciseLocationService;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import com.fitbit.runtrack.j;
import com.fitbit.savedstate.MobileRunSavedState;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity, PathTrackingMapFragment, LiveExerciseTrackingFragment, ExerciseSessionStateBroadcaster

private static class a extends FragmentStatePagerAdapter
{

    final ExerciseSession a;
    final Context b;
    final b c;
    final ExerciseSessionStateBroadcaster d;
    final g e;
    private LiveExerciseTrackingFragment f;
    private PathTrackingMapFragment g;

    static PathTrackingMapFragment a(a a1)
    {
        return a1.g;
    }

    public LiveExerciseTrackingFragment a()
    {
        if (f == null)
        {
            LiveExerciseTrackingFragment liveexercisetrackingfragment = d();
            f = liveexercisetrackingfragment;
            return liveexercisetrackingfragment;
        } else
        {
            return f;
        }
    }

    public PathTrackingMapFragment b()
    {
        if (g == null)
        {
            PathTrackingMapFragment pathtrackingmapfragment = c();
            g = pathtrackingmapfragment;
            return pathtrackingmapfragment;
        } else
        {
            return g;
        }
    }

    public PathTrackingMapFragment c()
    {
        Object obj = com.fitbit.runtrack.ui.PathTrackingMapFragment.a();
        Location location = e.e();
        if (location != null)
        {
            ((FitbitMapOptions) (obj)).a(CameraPosition.a(new LatLng(location.getLatitude(), location.getLongitude()), 20F));
        }
        obj = (new ()).(((FitbitMapOptions) (obj))).().().();
        ((PathTrackingMapFragment) (obj)).a(new Runnable() {

            final RecordExerciseSessionActivity.a a;

            public void run()
            {
                com.fitbit.e.a.a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), "Registering Session State Callbacks for live mapview", new Object[0]);
                a.d.a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.a.a(a), a.c);
            }

            
            {
                a = RecordExerciseSessionActivity.a.this;
                super();
            }
        });
        return ((PathTrackingMapFragment) (obj));
    }

    public LiveExerciseTrackingFragment d()
    {
        Location location = null;
        LiveExerciseTrackingFragment liveexercisetrackingfragment = new LiveExerciseTrackingFragment();
        liveexercisetrackingfragment.a(new Runnable(liveexercisetrackingfragment) {

            final LiveExerciseTrackingFragment a;
            final RecordExerciseSessionActivity.a b;

            public void run()
            {
                com.fitbit.e.a.a(com.fitbit.runtrack.ui.RecordExerciseSessionActivity.g(), "Registering Session State Callbacks for live stats view", new Object[0]);
                b.d.a(a, b.c);
            }

            
            {
                b = RecordExerciseSessionActivity.a.this;
                a = liveexercisetrackingfragment;
                super();
            }
        });
        b b1 = new b();
        Object obj = b();
        if (obj != null)
        {
            obj = ((PathTrackingMapFragment) (obj)).b();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            location = ((h) (obj)).l();
        }
        b1.a(a, location);
        b.startService(ExerciseLocationService.a(b, a));
        if (MobileRunSavedState.h())
        {
            obj = MobileRunSavedState.c();
            if (com.fitbit.savedstate.e.b.equals(obj))
            {
                (new j(b)).a(a);
            } else
            if (com.fitbit.savedstate.e.a.equals(obj))
            {
                LocalBroadcastManager.getInstance(b).registerReceiver(RecordExerciseSessionActivity.i(), new IntentFilter("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE"));
                return liveexercisetrackingfragment;
            }
        }
        return liveexercisetrackingfragment;
    }

    public int getCount()
    {
        return 2;
    }

    public Fragment getItem(int i)
    {
        if (i == 0)
        {
            return a();
        } else
        {
            return b();
        }
    }

    public _cls2.a(Context context, FragmentManager fragmentmanager, b b1, ExerciseSessionStateBroadcaster exercisesessionstatebroadcaster, g g1, ExerciseSession exercisesession)
    {
        super(fragmentmanager);
        b = context;
        c = b1;
        d = exercisesessionstatebroadcaster;
        e = g1;
        a = exercisesession;
    }
}
