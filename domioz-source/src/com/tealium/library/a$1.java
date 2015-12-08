// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.tealium.library:
//            Tealium

final class ium extends BroadcastReceiver
{

    public final void onReceive(Context context, Intent intent)
    {
        Tealium.track(intent, Tealium.map(new String[] {
            "tealium_id", "PUSH", "autotracked", "true"
        }), "link");
    }

    ium()
    {
    }
}
