// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.SpotifyService;

public final class dvv
{

    public static PendingIntent a(Context context)
    {
        ctz.a(context);
        return PendingIntent.getActivity(context, 0, gms.a(context, "spotify:internal:preferences").a("Settings").a, 0);
    }

    public static Intent a(Context context, String s)
    {
        ctz.a(context);
        s = new Intent(s);
        s.setClass(context, com/spotify/mobile/android/service/SpotifyService);
        return s;
    }
}
