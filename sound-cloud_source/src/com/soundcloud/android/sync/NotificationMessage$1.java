// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.soundcloud.android.service.sync.NotificationImageDownloader;

// Referenced classes of package com.soundcloud.android.sync:
//            NotificationMessage

final class ageDownloader extends NotificationImageDownloader
{

    final Context val$context;
    final int val$id;
    final Intent val$intent;
    final CharSequence val$message;
    final CharSequence val$ticker;
    final CharSequence val$title;

    protected final void onPostExecute(Bitmap bitmap)
    {
        NotificationMessage.showDashboardNotification(val$context, val$ticker, val$intent, val$title, val$message, val$id, bitmap);
    }

    protected final volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    ageDownloader()
    {
        val$context = context1;
        val$ticker = charsequence;
        val$intent = intent1;
        val$title = charsequence1;
        val$message = charsequence2;
        val$id = i;
        super();
    }
}
