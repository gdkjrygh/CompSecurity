// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.facebook.inject.t;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;

// Referenced classes of package com.facebook.maps:
//            n, b

public class a extends MapView
{

    private GeoPoint a;
    private n b;
    private GeoPoint c;
    private boolean d;
    private int e;
    private com.facebook.common.executors.a f;

    public a(Context context, String s)
    {
        super(context, s);
        a = new GeoPoint(0, 0);
        c = new GeoPoint(0, 0);
        f = (com.facebook.common.executors.a)t.a(getContext()).a(com/facebook/common/executors/a);
    }

    static n a(a a1)
    {
        return a1.b;
    }

    public void computeScroll()
    {
        super.computeScroll();
        GeoPoint geopoint = getMapCenter();
        if (d && c.equals(geopoint))
        {
            if (b != null)
            {
                b.a();
            }
            d = false;
            return;
        } else
        {
            c = geopoint;
            return;
        }
    }

    public void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        int i = getZoomLevel();
        if (i != e)
        {
            e = i;
            if (b != null && !d)
            {
                f.a(new b(this), 500L);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        GeoPoint geopoint;
        boolean flag;
        flag = true;
        geopoint = getMapCenter();
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        a = geopoint;
        d = false;
_L4:
        return super.onTouchEvent(motionevent);
_L2:
        if (motionevent.getAction() == 1)
        {
            if (a.equals(geopoint))
            {
                flag = false;
            }
            d = flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setOnMovementListener(n n1)
    {
        b = n1;
    }
}
