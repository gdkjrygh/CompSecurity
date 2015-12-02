// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.inject.t;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.ui.media.cache:
//            g

public class MediaCacheCleanupService extends IntentService
{

    public MediaCacheCleanupService()
    {
        super("orca:MediaCacheCleanupService");
    }

    public static void a(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getService(context, 0, new Intent(context, com/facebook/ui/media/cache/MediaCacheCleanupService), 0);
        ((AlarmManager)context.getSystemService("alarm")).setInexactRepeating(3, SystemClock.elapsedRealtime() + 0x493e0L, 0x5265c00L, pendingintent);
    }

    protected void onHandleIntent(Intent intent)
    {
        for (intent = t.a(this).c(com/facebook/ui/media/cache/g).iterator(); intent.hasNext(); ((g)intent.next()).a()) { }
    }
}
