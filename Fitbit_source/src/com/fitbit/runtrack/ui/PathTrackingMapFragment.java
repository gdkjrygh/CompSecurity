// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.maps.CameraPosition;
import com.fitbit.maps.FitbitMapFragment;
import com.fitbit.maps.FitbitMapOptions;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.e;
import com.fitbit.maps.h;
import com.fitbit.maps.l;
import com.fitbit.maps.v;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.ap;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            FitbitFragment, f, h, GpsStatus

public class PathTrackingMapFragment extends FitbitFragment
    implements android.view.View.OnClickListener, com.fitbit.maps.h.c, l, f
{
    public static class a extends com.fitbit.ui.a.c
    {

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
            }
            ((TextView)view).setText(((ActivityItem)((Pair)getItem(i)).second).a());
            return view;
        }

        public a(Collection collection)
        {
            addAll(collection);
        }
    }

    public static interface b
    {

        public abstract void a();
    }

    public static class c
    {

        private FitbitMapOptions a;
        private boolean b;
        private boolean c;

        public c a()
        {
            c = true;
            return this;
        }

        public c a(FitbitMapOptions fitbitmapoptions)
        {
            a = fitbitmapoptions;
            return this;
        }

        public c b()
        {
            b = true;
            return this;
        }

        public PathTrackingMapFragment c()
        {
            PathTrackingMapFragment pathtrackingmapfragment = new PathTrackingMapFragment();
            Bundle bundle = new Bundle();
            if (a == null)
            {
                a = PathTrackingMapFragment.a();
            }
            bundle.putParcelable("map-options", a);
            bundle.putBoolean("my-location-enabled", b);
            bundle.putBoolean("allow-unlock", c);
            pathtrackingmapfragment.setArguments(bundle);
            return pathtrackingmapfragment;
        }

        public c()
        {
        }
    }


    private static final String a = "map-options";
    private static final String b = "my-location-enabled";
    private static final String c = "allow-unlock";
    private TextView d;
    private ImageButton e;
    private FitbitMapFragment f;
    private com.fitbit.runtrack.ui.h g;

    public PathTrackingMapFragment()
    {
        setArguments(new Bundle());
    }

    static FitbitMapFragment a(PathTrackingMapFragment pathtrackingmapfragment)
    {
        return pathtrackingmapfragment.f;
    }

    public static FitbitMapOptions a()
    {
        return (new FitbitMapOptions()).d(true).e(false).h(false).c(false).f(false).g(false);
    }

    static TextView b(PathTrackingMapFragment pathtrackingmapfragment)
    {
        return pathtrackingmapfragment.d;
    }

    private void b(Location location)
    {
        h h1 = b();
        h1.b(com.fitbit.maps.e.a(new CameraPosition(new LatLng(location.getLatitude(), location.getLongitude()), h1.b() - 2.0F, 0.0F, 0.0F)));
    }

    private void c()
    {
        e.setImageResource(0x7f0202d2);
        b().m().i(false);
        b(g.b());
    }

    private void d()
    {
        e.setImageResource(0x7f0203b5);
        b().m().i(true);
    }

    public void a(Location location)
    {
        if (d != null)
        {
            d.setOnClickListener(null);
            d.setEnabled(location.hasAccuracy());
            android.graphics.drawable.Drawable drawable = GpsStatus.a(location).a(getActivity());
            d.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            if (drawable == null)
            {
                d.setText(getResources().getString(0x7f080419));
                d.setTextColor(getResources().getColor(0x7f0f0172));
                d.setPadding(0, 0, 0, 0);
                d.setBackgroundResource(0x7f0202f8);
            } else
            {
                d.setText(getResources().getString(0x7f08023c));
                d.setTextColor(getResources().getColor(0x7f0f0029));
                int i = Math.round(ap.b(10F));
                int j = Math.round(ap.b(7F));
                d.setPadding(0, i, 0, j);
                d.setBackgroundResource(0x7f02021b);
            }
            if (!Boolean.valueOf(String.valueOf(e.getTag())).booleanValue())
            {
                b(location);
                return;
            }
        }
    }

    public void a(CameraPosition cameraposition)
    {
        g.a();
    }

    public void a(ExerciseSession exercisesession)
    {
    }

    public void a(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
    }

    public void a(ExerciseSession exercisesession, com.fitbit.runtrack.data.b b1)
    {
        a(b1, b1.d(exercisesession), b1.i(exercisesession));
    }

    public void a(com.fitbit.runtrack.data.b b1, ExerciseEvent exerciseevent, List list)
    {
        if (f.b() != null)
        {
            f.b().a(this);
        }
        g.a(f.b());
        g.a(b1, exerciseevent, list);
    }

    public void a(List list)
    {
        if (f.b() != null)
        {
            f.b().a(this);
        }
        g.a(f.b());
        g.a(list);
    }

    public h b()
    {
        h h1 = null;
        if (f != null)
        {
            h1 = f.b();
        }
        return h1;
    }

    public void b(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131821261: 
            if (Boolean.valueOf(String.valueOf(e.getTag())).booleanValue())
            {
                c();
                e.setTag(Boolean.FALSE);
                return;
            } else
            {
                e.setTag(Boolean.TRUE);
                d();
                return;
            }

        case 2131820832: 
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getResources();
        g = new com.fitbit.runtrack.ui.h(bundle.getColor(0x7f0f010c), bundle.getDimensionPixelSize(0x7f0a00fa), bundle.getDimensionPixelSize(0x7f0a00f8));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400b3, viewgroup, false);
        d = (TextView)layoutinflater.findViewById(0x7f110120);
        e = (ImageButton)layoutinflater.findViewById(0x7f1102cd);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        Object obj = getChildFragmentManager().findFragmentById(0x7f1102cb);
        if (obj != null)
        {
            fragmenttransaction.remove(((android.support.v4.app.Fragment) (obj)));
        }
        obj = (FitbitMapOptions)getArguments().getParcelable("map-options");
        if (obj != null)
        {
            obj = FitbitMapFragment.a(((FitbitMapOptions) (obj)));
        } else
        {
            obj = FitbitMapFragment.a();
        }
        f = ((FitbitMapFragment) (obj));
        fragmenttransaction.add(0x7f1102cb, f).commit();
        if (getArguments().getBoolean("my-location-enabled"))
        {
            d.setVisibility(0);
            d.setOnClickListener(this);
        }
        d.post(new Runnable() {

            final PathTrackingMapFragment a;

            public void run()
            {
                h h1 = PathTrackingMapFragment.a(a).b();
                if (h1 != null)
                {
                    h1.d(a.getArguments().getBoolean("my-location-enabled"));
                    h1.m().c(false);
                    h1.c(false);
                    h1.b(false);
                    h1.a(false);
                    return;
                } else
                {
                    com.fitbit.runtrack.ui.PathTrackingMapFragment.b(a).postDelayed(this, 100L);
                    return;
                }
            }

            
            {
                a = PathTrackingMapFragment.this;
                super();
            }
        });
        if (getArguments().getBoolean("allow-unlock"))
        {
            e.setVisibility(0);
            e.setOnClickListener(this);
        }
        super.onViewCreated(view, bundle);
    }
}
