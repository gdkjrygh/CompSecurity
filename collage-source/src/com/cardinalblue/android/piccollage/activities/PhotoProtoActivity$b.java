// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.amazon.headtracking.HeadTrackingEvent;
import com.amazon.headtracking.HeadTrackingListener;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

public static class a
    implements HeadTrackingListener
{

    PhotoProtoView a;

    public void onHeadTrackingEvent(HeadTrackingEvent headtrackingevent)
    {
        if (a != null)
        {
            a.a(headtrackingevent.x_mm, headtrackingevent.y_mm, headtrackingevent.z_mm);
        }
    }

    public I(PhotoProtoView photoprotoview)
    {
        a = photoprotoview;
    }
}
