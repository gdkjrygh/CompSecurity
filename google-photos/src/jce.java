// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.concurrent.TimeUnit;

final class jce
    implements hqh
{

    private final Context a;

    jce(Context context)
    {
        a = context;
    }

    public final String a()
    {
        return "GetGservicesFlagsJob";
    }

    public final void a(int i, hqo hqo)
    {
        Object obj = a.getContentResolver();
        hqo = lvd.a(((android.content.ContentResolver) (obj)), "photos:minimum_required_version", null);
        long l = lvd.a(((android.content.ContentResolver) (obj)), "photos:required_update_timestamp_ms", 0L);
        obj = (jch)olm.a(a, jch);
        if (!((jch) (obj)).a(hqo))
        {
            PreferenceManager.getDefaultSharedPreferences(((jch) (obj)).a).edit().remove("com.google.android.apps.photos.update.minimumVersionCode").remove("com.google.android.apps.photos.update.updateTimestampMs").apply();
            return;
        } else
        {
            PreferenceManager.getDefaultSharedPreferences(((jch) (obj)).a).edit().putString("com.google.android.apps.photos.update.minimumVersionCode", hqo).putLong("com.google.android.apps.photos.update.updateTimestampMs", l).apply();
            return;
        }
    }

    public final String b()
    {
        return "com.google.android.apps.photos.update.GetGservicesFlagsJob";
    }

    public final long c()
    {
        return TimeUnit.DAYS.toMillis(1L);
    }
}
