// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.os.Looper;

// Referenced classes of package com.brightcove.player.event:
//            BackgroundEventListener

final class a
    implements Runnable
{

    private BackgroundEventListener a;

    public final void run()
    {
        Looper.prepare();
        BackgroundEventListener.a(a, new <init>(a));
        Looper.loop();
    }

    (BackgroundEventListener backgroundeventlistener)
    {
        a = backgroundeventlistener;
        super();
    }
}
