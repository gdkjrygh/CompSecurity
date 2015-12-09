// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import android.view.View;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            PlayButtonController, r

class s
    implements android.view.View.OnClickListener
{

    final PlayButtonController a;

    private s(PlayButtonController playbuttoncontroller)
    {
        a = playbuttoncontroller;
        super();
    }

    s(PlayButtonController playbuttoncontroller, r r)
    {
        this(playbuttoncontroller);
    }

    public void onClick(View view)
    {
        Log.d(PlayButtonController.a(), "Resuming play...");
        a.c.start();
    }
}
