// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class vice extends BroadcastReceiver
{

    public final void onReceive(Context context, Intent intent)
    {
        CollectionService.a(context, intent);
    }

    vice()
    {
    }
}
