// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.config.ecs.EcsConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContentRoster, PackInfo

final class a
    implements Runnable
{

    final ckInfoRequestCallback a;
    final MediaContentRoster b;

    public final void run()
    {
        if (MediaContentRoster.a(b).size() == 0) goto _L2; else goto _L1
_L1:
        MediaContentRoster.g().info("packs ready");
        MediaContentRoster.a(b, a);
_L4:
        a.onAllPacksReady();
        return;
_L2:
        int ai[];
        ai = MediaContentRoster.b(b);
        if (ai.length != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        MediaContentRoster.g().info("no packs found, returning default emoticons pack");
        MediaContentRoster.a(b, MediaContentRoster.b(b, a));
        MediaContentRoster.c(b).c(AnalyticsEvent.bV);
        if (true) goto _L4; else goto _L3
_L3:
        MediaContentRoster.g().info(String.format("%d packs available", new Object[] {
            Integer.valueOf(ai.length)
        }));
        for (int i = 0; i < ai.length; i++)
        {
            MediaContentRoster.a(b, ai[i], i, a);
        }

        Iterator iterator = MediaContentRoster.a(b).iterator();
        while (iterator.hasNext()) 
        {
            PackInfo packinfo = (PackInfo)iterator.next();
            MediaContentRoster.b(b, packinfo);
            packinfo.a(MediaContentRoster.d(b).isMojiSectionEnabled());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ckInfoRequestCallback(MediaContentRoster mediacontentroster, ckInfoRequestCallback ckinforequestcallback)
    {
        b = mediacontentroster;
        a = ckinforequestcallback;
        super();
    }
}
