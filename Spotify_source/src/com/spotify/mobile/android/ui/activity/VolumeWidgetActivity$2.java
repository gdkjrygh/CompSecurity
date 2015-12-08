// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.widget.SeekBar;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import dwh;
import fpl;
import gar;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            VolumeWidgetActivity

final class a
    implements gar
{

    private VolumeWidgetActivity a;

    public final void a()
    {
        VolumeWidgetActivity.a(a, true);
    }

    public final void a(int i)
    {
        if (a.f.c())
        {
            ConnectManager connectmanager = (ConnectManager)a.f.f();
            int j = VolumeWidgetActivity.b(a).getMax();
            connectmanager.b((float)(i - 6) / (float)j);
            VolumeWidgetActivity.a(a);
        }
    }

    public final void a(SeekBar seekbar)
    {
        if (a.f.c())
        {
            ((ConnectManager)a.f.f()).b(fpl.a(seekbar));
        }
        VolumeWidgetActivity.a(a, false);
    }

    public final void b(int i)
    {
        if (a.f.c())
        {
            ConnectManager connectmanager = (ConnectManager)a.f.f();
            int j = VolumeWidgetActivity.b(a).getMax();
            connectmanager.b((float)(i + 6) / (float)j);
            VolumeWidgetActivity.a(a);
        }
    }

    public final void b(SeekBar seekbar)
    {
        if (a.f.c())
        {
            ((ConnectManager)a.f.f()).b(fpl.a(seekbar));
            VolumeWidgetActivity.a(a);
        }
    }

    (VolumeWidgetActivity volumewidgetactivity)
    {
        a = volumewidgetactivity;
        super();
    }
}
