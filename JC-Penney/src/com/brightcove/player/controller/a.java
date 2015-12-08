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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            BrightcoveClosedCaptioningController

class a
    implements EventListener
{

    final BrightcoveClosedCaptioningController a;

    a(BrightcoveClosedCaptioningController brightcoveclosedcaptioningcontroller)
    {
        a = brightcoveclosedcaptioningcontroller;
        super();
    }

    public void processEvent(Event event)
    {
label0:
        {
            BrightcoveClosedCaptioningController.a(a, (Video)event.properties.get("video"));
            event = PreferenceManager.getDefaultSharedPreferences(a.a).getString("captioning_locale", Locale.getDefault().getLanguage());
            BrightcoveClosedCaptioningController.a(a, new ArrayList());
            Object obj = BrightcoveClosedCaptioningController.b(a, BrightcoveClosedCaptioningController.a(a));
            if (obj == null)
            {
                break label0;
            }
            Object obj1 = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Pair pair = (Pair)((Iterator) (obj1)).next();
                if (pair.first != null && pair.second != null)
                {
                    BrightcoveClosedCaptioningController.b(a).add(((BrightcoveCaptionFormat)pair.second).language());
                }
            } while (true);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                obj1 = (Pair)((Iterator) (obj)).next();
            } while (!((BrightcoveCaptionFormat)((Pair) (obj1)).second).language().equals(event));
            BrightcoveClosedCaptioningController.c(a).loadCaptions((Uri)((Pair) (obj1)).first, ((BrightcoveCaptionFormat)((Pair) (obj1)).second).type());
        }
        if (android.os.Build.VERSION.SDK_INT >= 19 && BrightcoveClosedCaptioningController.d(a))
        {
            BrightcoveClosedCaptioningController.e(a);
        }
    }
}
