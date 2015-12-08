// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            BasicMapInfoView

public class 
{

    public static void inject(butterknife.oView oview, BasicMapInfoView basicmapinfoview, Object obj)
    {
        basicmapinfoview._title = (TextView)oview._title(obj, 0x7f0f0077, "field '_title'");
        basicmapinfoview._location = (TextView)oview._location(obj, 0x7f0f0464, "field '_location'");
        basicmapinfoview._mapAttribution = (TextView)oview._mapAttribution(obj, 0x7f0f0465, "field '_mapAttribution'");
    }

    public static void reset(BasicMapInfoView basicmapinfoview)
    {
        basicmapinfoview._title = null;
        basicmapinfoview._location = null;
        basicmapinfoview._mapAttribution = null;
    }

    public ()
    {
    }
}
