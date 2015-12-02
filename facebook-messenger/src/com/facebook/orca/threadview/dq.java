// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;

// Referenced classes of package com.facebook.orca.threadview:
//            dr, ds

public class dq extends Overlay
{

    private final GestureDetector a;
    private final MapView b;

    dq(Context context, MapView mapview)
    {
        dr dr1 = new dr(this);
        ds ds1 = new ds(this);
        b = mapview;
        a = new GestureDetector(context, dr1);
        a.setOnDoubleTapListener(dr1);
        mapview.setOnTouchListener(ds1);
    }

    static GestureDetector a(dq dq1)
    {
        return dq1.a;
    }

    private boolean a(MotionEvent motionevent)
    {
        b.getController().zoomInFixing((int)motionevent.getX(), (int)motionevent.getY());
        return true;
    }

    static boolean a(dq dq1, MotionEvent motionevent)
    {
        return dq1.a(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent, MapView mapview)
    {
        return a.onTouchEvent(motionevent);
    }
}
