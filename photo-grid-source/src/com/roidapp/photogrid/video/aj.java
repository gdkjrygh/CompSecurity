// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class aj
    implements android.view.View.OnClickListener
{

    final TrackSelector a;

    aj(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(View view)
    {
        if (TrackSelector.A(a) != null)
        {
            TrackSelector.A(a).dismiss();
            TrackSelector.B(a);
        }
    }
}
