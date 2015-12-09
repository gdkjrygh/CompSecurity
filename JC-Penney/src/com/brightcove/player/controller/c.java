// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.DialogInterface;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

class c
    implements android.content.DialogInterface.OnClickListener
{

    final BrightcoveClosedCaptioningController a;

    c(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        a = brightcoveclosedcaptioningcontroller;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        BrightcoveClosedCaptioningController.f(a).emit("captionsDialogOk");
        dialoginterface.dismiss();
    }
}
