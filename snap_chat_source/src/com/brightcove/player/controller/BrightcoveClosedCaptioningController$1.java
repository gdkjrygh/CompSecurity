// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Pair;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.LoadCaptionsService;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

final class a
    implements EventListener
{

    private BrightcoveClosedCaptioningController a;

    public final void processEvent(Event event)
    {
label0:
        {
            BrightcoveClosedCaptioningController.a(a, (Video)event.properties.get("video"));
            event = PreferenceManager.getDefaultSharedPreferences(a.a).getString("captioning_locale", Locale.getDefault().getLanguage());
            Object obj = BrightcoveClosedCaptioningController.b(a, BrightcoveClosedCaptioningController.a(a));
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            Pair pair;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                pair = (Pair)((Iterator) (obj)).next();
            } while (pair.first == null || !((BrightcoveCaptionFormat)pair.second).language().equals(event));
            BrightcoveClosedCaptioningController.b(a).loadCaptions((Uri)pair.first, ((BrightcoveCaptionFormat)pair.second).type());
        }
        if (android.os.Format.type >= 19 && BrightcoveClosedCaptioningController.c(a))
        {
            BrightcoveClosedCaptioningController.d(a);
        }
    }

    (BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        a = brightcoveclosedcaptioningcontroller;
        super();
    }
}
