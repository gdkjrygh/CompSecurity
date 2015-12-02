// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.j;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.orca.j:
//            c

public class a extends IntentService
{

    public a()
    {
        super("Orca:TempFileCleanupService");
    }

    public static void a(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getService(context, 0, new Intent(context, com/facebook/orca/j/a), 0);
        ((AlarmManager)context.getSystemService("alarm")).setInexactRepeating(3, SystemClock.elapsedRealtime() + 0x927c0L, 0x2932e00L, pendingintent);
    }

    protected void onHandleIntent(Intent intent)
    {
        ((c)t.a(this).a(com/facebook/orca/j/c)).a();
    }
}
