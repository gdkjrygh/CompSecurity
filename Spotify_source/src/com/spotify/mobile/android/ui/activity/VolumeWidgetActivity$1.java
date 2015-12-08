// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;


// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            VolumeWidgetActivity

final class a
    implements Runnable
{

    private VolumeWidgetActivity a;

    public final void run()
    {
        a.finish();
    }

    (VolumeWidgetActivity volumewidgetactivity)
    {
        a = volumewidgetactivity;
        super();
    }
}
