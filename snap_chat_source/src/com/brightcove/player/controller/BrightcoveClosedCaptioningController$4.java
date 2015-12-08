// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Pair;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.LoadCaptionsService;
import com.brightcove.player.event.EventEmitter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

final class a
    implements android.content.ningController._cls4
{

    private List a;
    private BrightcoveClosedCaptioningController b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        BrightcoveClosedCaptioningController.a(b, i);
        if (i == 0)
        {
            b.saveClosedCaptioningState(false);
        } else
        {
            b.saveClosedCaptioningState(true);
            dialoginterface = (String)a.get(i - 1);
            PreferenceManager.getDefaultSharedPreferences(b.a).edit().a("captioning_locale", dialoginterface).a();
            if (BrightcoveClosedCaptioningController.b(b) != null)
            {
                dialoginterface = BrightcoveClosedCaptioningController.a(b, dialoginterface);
                if (((Pair) (dialoginterface)).first != null)
                {
                    BrightcoveClosedCaptioningController.b(b).loadCaptions((Uri)((Pair) (dialoginterface)).first, ((BrightcoveCaptionFormat)((Pair) (dialoginterface)).second).type());
                    return;
                } else
                {
                    dialoginterface = new HashMap();
                    dialoginterface.put("boolean", Boolean.valueOf(true));
                    BrightcoveClosedCaptioningController.g(b).emit("toggleClosedCaptions", dialoginterface);
                    return;
                }
            }
        }
    }

    (BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller, List list)
    {
        b = brightcoveclosedcaptioningcontroller;
        a = list;
        super();
    }
}
