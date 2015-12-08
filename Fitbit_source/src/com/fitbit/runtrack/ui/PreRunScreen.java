// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.e;
import com.fitbit.maps.h;
import com.fitbit.maps.l;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.savedstate.MobileRunSavedState;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.runtrack.ui:
//            FitbitFragment, PathTrackingMapFragment, GpsStatus, GpsModal, 
//            RunOptions

public class PreRunScreen extends FitbitFragment
    implements android.view.View.OnClickListener, l
{

    private static final String a = "Log GPS Exercise";
    private static final short b = 797;
    private View c;
    private PathTrackingMapFragment d;
    private GpsStatus e;

    public PreRunScreen()
    {
    }

    private void a(Context context)
    {
        (new RecordExerciseSessionActivity.f(getActivity(), d, SupportedActivity.a(MobileRunSavedState.b()))).execute(new Void[0]);
    }

    public void a(Location location)
    {
        if (d != null && d.b() != null)
        {
            d.b().a(com.fitbit.maps.e.a(new LatLng(location.getLatitude(), location.getLongitude())));
            d.a(location);
        }
        e = GpsStatus.a(location);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 797 797: default 20
    //                   797 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i, j, intent);
_L4:
        return;
_L2:
        if (j == -1)
        {
            a(getActivity());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131821341: 
            break;
        }
        if (EnumSet.of(GpsStatus.a, GpsStatus.b, GpsStatus.c).contains(e))
        {
            a(view.getContext());
            return;
        } else
        {
            startActivityForResult(GpsModal.a(view.getContext(), e), 797);
            return;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400d0, viewgroup, false);
        c = layoutinflater.findViewById(0x7f11031d);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        FitBitApplication.a().c().a(0x7f11000a).a("Log GPS Exercise");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c.setOnClickListener(this);
        view = getChildFragmentManager().beginTransaction();
        bundle = getChildFragmentManager().findFragmentById(0x7f11031c);
        if (bundle != null)
        {
            view.remove(bundle);
        }
        d = (new PathTrackingMapFragment.c()).b().c();
        bundle = new RunOptions();
        view.add(0x7f11031c, d).add(0x7f11031b, bundle).commit();
    }
}
