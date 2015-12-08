// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, ad

final class ai
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final TrackSelector b;

    ai(TrackSelector trackselector, int i)
    {
        b = trackselector;
        a = i;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        TrackSelector.k(b).setVisibility(8);
        if (TrackSelector.g(b) != null && TrackSelector.g(b).getCount() > 0)
        {
            TrackSelector.g(b).a(0);
        }
        dialoginterface = new Intent("android.settings.WIFI_SETTINGS");
        b.startActivityForResult(dialoginterface, a);
    }
}
