// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.DialogInterface;
import android.net.Uri;
import android.util.Pair;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.LoadCaptionsService;
import java.util.List;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

class d
    implements android.content.DialogInterface.OnClickListener
{

    final BrightcoveClosedCaptioningController a;

    d(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        a = brightcoveclosedcaptioningcontroller;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        BrightcoveClosedCaptioningController.a(a, i);
        if (i == 0)
        {
            a.saveClosedCaptioningState(false);
        } else
        {
            a.saveClosedCaptioningState(true);
            dialoginterface = (String)BrightcoveClosedCaptioningController.b(a).get(i - 1);
            if (BrightcoveClosedCaptioningController.c(a) != null)
            {
                dialoginterface = BrightcoveClosedCaptioningController.a(a, dialoginterface);
                BrightcoveClosedCaptioningController.c(a).loadCaptions((Uri)((Pair) (dialoginterface)).first, ((BrightcoveCaptionFormat)((Pair) (dialoginterface)).second).type());
                return;
            }
        }
    }
}
