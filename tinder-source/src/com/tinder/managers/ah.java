// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.SharedPreferences;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.EventUnregisterManagers;
import com.tinder.model.GlobalConfig;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.managers:
//            ae

public final class ah
{

    int a;
    private final ae b;
    private c c;

    public ah(ae ae1, c c1)
    {
        b = ae1;
        c = c1;
        c.a(this, false);
        a = ae.a.getInt("UPDATES_INTERVAL", 4000);
    }

    public final void onEvent(EventGlobalsLoaded eventglobalsloaded)
    {
        int i = eventglobalsloaded.getGlobalConfig().updatesInterval;
        a = i;
        ae.b.putInt("UPDATES_INTERVAL", i);
        ae.b.commit();
    }

    public final void onEvent(EventUnregisterManagers eventunregistermanagers)
    {
        c.b(this);
    }
}
