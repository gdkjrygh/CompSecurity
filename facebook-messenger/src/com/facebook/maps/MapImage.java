// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.location.Location;
import android.util.AttributeSet;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;
import com.facebook.widget.f;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.maps:
//            p, q

public class MapImage extends f
{

    public static final Location a = new Location("");
    private Location b;
    private int c;
    private List d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private UrlImage i;

    public MapImage(Context context)
    {
        this(context, null);
    }

    public MapImage(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MapImage(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = false;
        setContentView(k.map_image);
        i = (UrlImage)getView(i.map_url_image);
        d = hq.a();
        context = context.obtainStyledAttributes(attributeset, q.MapImage);
        f = context.getBoolean(q.MapImage_keepMarkerAtCenter, false);
        g = context.getBoolean(q.MapImage_retainMapDuringUpdate, false);
        i.setRetainImageDuringUpdate(g);
        i.setPlaceHolderDrawable(null);
        i.setPlaceholderBackgroundResourceId(h.map_placeholder_background_repeat);
        c = context.getInteger(q.MapImage_zoom, 12);
        e = context.getString(q.MapImage_markerColor);
        if (e != null && e.startsWith("#"))
        {
            e = (new StringBuilder()).append("0x").append(e.substring(1)).toString();
        }
        context.recycle();
    }

    static void a(MapImage mapimage)
    {
        mapimage.c();
    }

    static boolean a(MapImage mapimage, boolean flag)
    {
        mapimage.h = flag;
        return flag;
    }

    private void b()
    {
        if (h)
        {
            return;
        } else
        {
            post(new p(this));
            h = true;
            return;
        }
    }

    private void c()
    {
        if (b != null || !d.isEmpty())
        {
            d();
        }
    }

    private void d()
    {
        int j = getWidth() - getPaddingLeft() - getPaddingRight();
        int l = getHeight() - getPaddingBottom() - getPaddingTop();
        Object obj = d;
        if (f)
        {
            obj = hq.a(d);
            ((List) (obj)).add(b);
        }
        if (l > 0 && j > 0)
        {
            obj = q.a(getContext()).a(j, l).a(e, ((List) (obj))).a(b).a(c);
            i.setImageParams(((com.facebook.maps.q) (obj)).a());
        }
    }

    public void a()
    {
        d.clear();
        b();
    }

    public void a(Location location)
    {
        d.add(location);
        b();
    }

    public Location getCenter()
    {
        return b;
    }

    public boolean getKeepMarkerAtCenter()
    {
        return f;
    }

    public String getMarkerColor()
    {
        return e;
    }

    public boolean getRetainMapDuringUpdate()
    {
        return g;
    }

    public int getZoom()
    {
        return c;
    }

    protected void onLayout(boolean flag, int j, int l, int i1, int j1)
    {
        super.onLayout(flag, j, l, i1, j1);
        if (flag)
        {
            b();
        }
    }

    public void setCenter(Location location)
    {
        b = location;
        b();
    }

    public void setKeepMarkerAtCenter(boolean flag)
    {
        f = flag;
        b();
    }

    public void setMarkerColor(String s)
    {
        e = s;
        b();
    }

    public void setRetainMapDuringUpdate(boolean flag)
    {
        g = flag;
        i.setRetainImageDuringUpdate(flag);
    }

    public void setZoom(int j)
    {
        c = j;
        b();
    }

}
