// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.brightcove.player.captioning.BrightcoveCaptionPropertiesActivity;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

final class a
    implements android.content.ningController._cls2
{

    private BrightcoveClosedCaptioningController a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        BrightcoveClosedCaptioningController.a();
        a.a.startActivity(new Intent(a.a, com/brightcove/player/captioning/BrightcoveCaptionPropertiesActivity));
        BrightcoveClosedCaptioningController.e(a).emit("captionsDialogSettings");
    }

    (BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        a = brightcoveclosedcaptioningcontroller;
        super();
    }
}
