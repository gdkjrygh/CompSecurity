// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.maps:
//            m

class g extends ItemizedOverlay
{

    private final boolean a;
    private m b;
    private List c;

    public g(Drawable drawable, boolean flag)
    {
        super(drawable);
        c = hq.a();
        populate();
        a = flag;
    }

    public void a(m m1)
    {
        b = m1;
    }

    public void a(OverlayItem overlayitem)
    {
        c.add(overlayitem);
        setFocus(null);
        setLastFocusedIndex(-1);
        populate();
    }

    protected OverlayItem createItem(int i)
    {
        return (OverlayItem)c.get(i);
    }

    public void draw(Canvas canvas, MapView mapview, boolean flag)
    {
        if (flag && !a)
        {
            return;
        } else
        {
            super.draw(canvas, mapview, flag);
            return;
        }
    }

    protected boolean onTap(int i)
    {
        super.onTap(i);
        return true;
    }

    public boolean onTap(GeoPoint geopoint, MapView mapview)
    {
        if (!super.onTap(geopoint, mapview) && b != null)
        {
            b.a();
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return c.size();
    }
}
