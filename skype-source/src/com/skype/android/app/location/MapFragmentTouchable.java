// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.SupportMapFragment;

// Referenced classes of package com.skype.android.app.location:
//            a

public class MapFragmentTouchable extends SupportMapFragment
{
    public static interface OnMapTouchListener
    {

        public abstract void onMapTouch(MotionEvent motionevent);
    }


    public View originalContentView;
    private a touchDispatcher;

    public MapFragmentTouchable()
    {
    }

    public void addOnMapTouchListener(OnMapTouchListener onmaptouchlistener)
    {
        touchDispatcher.addOnMapTouchListener(onmaptouchlistener);
    }

    public View getView()
    {
        return originalContentView;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        originalContentView = super.onCreateView(layoutinflater, viewgroup, bundle);
        touchDispatcher = new a(getActivity());
        touchDispatcher.addView(originalContentView);
        return touchDispatcher;
    }
}
