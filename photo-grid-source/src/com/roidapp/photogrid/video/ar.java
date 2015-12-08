// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class ar
    implements android.content.DialogInterface.OnKeyListener
{

    final TrackSelector a;

    ar(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1)
        {
            dialoginterface.dismiss();
        }
        return false;
    }
}
