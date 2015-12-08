// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.av.a;

// Referenced classes of package com.google.android.m4b.maps.bm:
//            j, d

public final class k
{

    public j a[];

    public k(Resources resources, d d1)
    {
        com.google.android.m4b.maps.av.a.a();
        a = new j[31];
        a(d1, resources, 0, com.google.android.m4b.maps.h.e.maps_dav_one_way_16_256, true, false, true, false);
        a(d1, resources, 25, com.google.android.m4b.maps.h.e.maps_dav_road_8_128, true, false, false, true);
        a(d1, resources, 26, com.google.android.m4b.maps.h.e.maps_dav_road_10_128, true, false, false, true);
        a(d1, resources, 27, com.google.android.m4b.maps.h.e.maps_dav_road_12_128, true, false, false, true);
        a(d1, resources, 28, com.google.android.m4b.maps.h.e.maps_dav_road_14_128, true, false, false, true);
        a(d1, resources, 29, com.google.android.m4b.maps.h.e.maps_dav_road_22_128, true, false, false, true);
        a(d1, resources, 30, com.google.android.m4b.maps.h.e.maps_dav_dashed_highlight_16_256, true, false, true, false);
        a(d1, resources, 1, com.google.android.m4b.maps.h.e.maps_dav_road_32_128, true, false, false, true);
        a(d1, resources, 2, com.google.android.m4b.maps.h.e.maps_dav_road_40_128, true, false, false, true);
        a(d1, resources, 3, com.google.android.m4b.maps.h.e.maps_dav_road_48_128, true, false, false, true);
        a(d1, resources, 4, com.google.android.m4b.maps.h.e.maps_dav_road_56_128, true, false, false, true);
        a(d1, resources, 5, com.google.android.m4b.maps.h.e.maps_dav_road_32_64, true, false, false, true);
        a(d1, resources, 6, com.google.android.m4b.maps.h.e.maps_dav_road_44_64, true, false, false, true);
        a(d1, resources, 22, com.google.android.m4b.maps.h.e.maps_dav_road_48_64, true, false, false, true);
        a(d1, resources, 7, com.google.android.m4b.maps.h.e.maps_dav_road_hybrid_6_32_low_zoom, true, false, false, true);
        a(d1, resources, 21, com.google.android.m4b.maps.h.e.maps_dav_road_hybrid_6_32_high_zoom, true, false, false, true);
        a(d1, resources, 8, com.google.android.m4b.maps.h.e.maps_dav_route_line, false, false, false, false);
        a(d1, resources, 9, com.google.android.m4b.maps.h.e.maps_dav_route_line_bright, false, false, false, false);
        a(d1, resources, 10, com.google.android.m4b.maps.h.e.maps_dav_traffic_bg, false, false, true, true);
        a(d1, resources, 20, com.google.android.m4b.maps.h.e.maps_dav_background_grid, false, true, true, true);
        a(d1, resources, 23, com.google.android.m4b.maps.h.e.maps_dav_drop_shadow_gradient, false, false, false, false);
        a(d1, resources, 24, com.google.android.m4b.maps.h.e.maps_dav_colored_polyline, false, false, false, false);
        a(d1, resources, 11, com.google.android.m4b.maps.h.e.maps_dav_traffic_fill, false, false, true, true);
        com.google.android.m4b.maps.av.a.b();
    }

    private void a(d d1, Resources resources, int i, int l, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3)
    {
        j j1;
        j1 = new j(d1);
        j1.b = flag1;
        j1.c = flag2;
        j1.d = true;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!flag3) goto _L4; else goto _L3
_L3:
        d1 = j.b(resources, l);
        j1.a(d1, d1.getWidth(), d1.getHeight(), true, true, false);
        if (!j1.i)
        {
            d1.recycle();
        }
_L6:
        a[i] = j1;
        return;
_L4:
        resources = j.b(resources, l);
        int i1 = resources.getWidth();
        int k1 = resources.getHeight();
        if (!j.c(resources))
        {
            d1 = com.google.android.m4b.maps.bm.j.a(resources, android.graphics.Bitmap.Config.ALPHA_8, j1.a().c);
            l = 1;
        } else
        {
            l = 0;
            d1 = resources;
        }
        j1.a(d1.extractAlpha(), i1, k1, true, false, false);
        if (l != 0 && !j1.i)
        {
            d1.recycle();
        }
        if (!j1.i)
        {
            resources.recycle();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag3)
        {
            d1 = j.b(resources, l);
            j1.a(d1, d1.getWidth(), d1.getHeight(), false, true, false);
            if (!j1.i)
            {
                d1.recycle();
            }
        } else
        {
            j1.a(resources, l);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
