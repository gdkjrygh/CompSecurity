// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, q

final class au
    implements android.content.DialogInterface.OnClickListener
{

    final TrackSelector a;

    au(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (a.a != null)
        {
            a.a.c();
        }
        TrackSelector.b(a, TrackSelector.e(a));
        dialoginterface.dismiss();
    }
}
