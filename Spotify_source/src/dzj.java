// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.googlenow.GoogleNowService;

public final class dzj
{

    public static AlarmManager a(Context context)
    {
        return (AlarmManager)context.getSystemService("alarm");
    }

    public static PendingIntent a(Context context, int i)
    {
        return PendingIntent.getService(context, 0, new Intent(context, com/spotify/mobile/android/service/googlenow/GoogleNowService), i);
    }
}
