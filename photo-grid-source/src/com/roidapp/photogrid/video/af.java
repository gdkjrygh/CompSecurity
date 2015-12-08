// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, ad

final class af
    implements android.content.DialogInterface.OnKeyListener
{

    final TrackSelector a;

    af(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1)
        {
            dialoginterface.dismiss();
            if (TrackSelector.g(a) != null && TrackSelector.g(a).getCount() > 0)
            {
                TrackSelector.g(a).a(0);
            }
            if (TrackSelector.k(a).getVisibility() == 0)
            {
                TrackSelector.r(a).setVisibility(0);
                TrackSelector.q(a).setVisibility(8);
            }
            TrackSelector.v(a);
        }
        return false;
    }
}
