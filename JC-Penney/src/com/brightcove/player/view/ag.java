// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.os.Bundle;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcovePlayer

class ag
    implements EventListener
{

    final Bundle a;
    final BrightcovePlayer b;

    ag(BrightcovePlayer brightcoveplayer, Bundle bundle)
    {
        b = brightcoveplayer;
        a = bundle;
        super();
    }

    public void processEvent(Event event)
    {
        BrightcovePlayer.a(b, a);
    }
}
