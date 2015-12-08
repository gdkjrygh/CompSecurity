// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.LatLng;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.map:
//            GoogleMapFragment

public final class GoogleMapFragment_ extends GoogleMapFragment
    implements a
{

    public static final String M_IS_ZOOM_AND_GESTURES_ARG = "mIsZoomAndGestures";
    public static final String M_LAT_LNG_ARG = "mLatLng";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public GoogleMapFragment_()
    {
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        injectFragmentArguments_();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("mIsZoomAndGestures"))
            {
                mIsZoomAndGestures = bundle.getBoolean("mIsZoomAndGestures");
            }
            if (bundle.containsKey("mLatLng"))
            {
                mLatLng = (LatLng)bundle.getParcelable("mLatLng");
            }
        }
    }

    public final View findViewById(int i)
    {
        if (contentView_ == null)
        {
            return null;
        } else
        {
            return contentView_.findViewById(i);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        contentView_ = super.onCreateView(layoutinflater, viewgroup, bundle);
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public GoogleMapFragment build()
        {
            GoogleMapFragment_ googlemapfragment_ = new GoogleMapFragment_();
            googlemapfragment_.setArguments(args);
            return googlemapfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mIsZoomAndGestures(boolean flag)
        {
            args.putBoolean("mIsZoomAndGestures", flag);
            return this;
        }

        public FragmentBuilder_ mLatLng(LatLng latlng)
        {
            args.putParcelable("mLatLng", latlng);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }

}
