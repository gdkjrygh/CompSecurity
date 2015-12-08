// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.os.Bundle;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcovePlayerFragment

final class a
    implements EventListener
{

    private Bundle a;
    private BrightcovePlayerFragment b;

    public final void processEvent(Event event)
    {
        BrightcovePlayerFragment.a(b, a);
    }

    (BrightcovePlayerFragment brightcoveplayerfragment, Bundle bundle)
    {
        b = brightcoveplayerfragment;
        a = bundle;
        super();
    }
}
