// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class ah
    implements android.content.DialogInterface.OnClickListener
{

    final TrackSelector a;

    ah(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (TrackSelector.k(a).getVisibility() == 0)
        {
            TrackSelector.r(a).setVisibility(0);
            TrackSelector.q(a).setVisibility(8);
        }
        TrackSelector.v(a);
    }
}
