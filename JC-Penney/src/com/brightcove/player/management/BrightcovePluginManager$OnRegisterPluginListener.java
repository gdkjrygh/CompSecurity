// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.management;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.management:
//            BrightcovePluginManager

public class a
    implements EventListener
{

    final BrightcovePluginManager a;

    public void processEvent(Event event)
    {
        if (event.properties.containsKey("pluginName"))
        {
            event = (String)event.properties.get("pluginName");
            Log.v(BrightcovePluginManager.e(), (new StringBuilder()).append("OnRegisterPluginListener: plugin: ").append(event).toString());
            if (!BrightcovePluginManager.a(a).contains(event))
            {
                BrightcovePluginManager.a(a).add(event);
            }
        }
    }

    protected (BrightcovePluginManager brightcovepluginmanager)
    {
        a = brightcovepluginmanager;
        super();
    }
}
