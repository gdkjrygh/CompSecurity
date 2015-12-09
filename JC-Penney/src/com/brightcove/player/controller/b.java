// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.brightcove.player.captioning.BrightcoveCaptionPropertiesActivity;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

class b
    implements android.content.DialogInterface.OnClickListener
{

    final BrightcoveClosedCaptioningController a;

    b(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        a = brightcoveclosedcaptioningcontroller;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Log.d(BrightcoveClosedCaptioningController.a(), "Showing the captions preference activity.");
        a.a.startActivity(new Intent(a.a, com/brightcove/player/captioning/BrightcoveCaptionPropertiesActivity));
    }
}
