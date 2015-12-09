// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;
import flb;
import flc;
import fld;
import fle;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            BackgroundableVideoPlayerActivity

final class a
    implements ServiceConnection
{

    private BackgroundableVideoPlayerActivity a;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        BackgroundableVideoPlayerActivity.a(a, ((flc)ibinder).a);
        BackgroundableVideoPlayerActivity.b(a).a(BackgroundableVideoPlayerActivity.g(a));
        componentname = BackgroundableVideoPlayerActivity.c(a);
        componentname.b = BackgroundableVideoPlayerActivity.b(a);
        if (((fld) (componentname)).b != null)
        {
            ((fld) (componentname)).d.setText(componentname.a(((fld) (componentname)).b.f()));
            componentname.c();
        }
        componentname = a.getIntent().getStringExtra("com.spotify.mobile.android.spotlets.video.BackgroundableVideoPlayerActivityEXTRA_TITLE");
        BackgroundableVideoPlayerActivity.c(a).f.setText(componentname);
        if (BackgroundableVideoPlayerActivity.b(a).a())
        {
            BackgroundableVideoPlayerActivity.e(a).setVisibility(8);
        }
        a.a();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        BackgroundableVideoPlayerActivity.a(a, null);
    }

    (BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        a = backgroundablevideoplayeractivity;
        super();
    }
}
