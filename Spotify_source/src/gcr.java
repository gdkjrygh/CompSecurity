// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class gcr
    implements dmx
{

    public String a;
    public long b;
    private final gcz c;

    public gcr(gcz gcz1)
    {
        c = gcz1;
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("product", "spotify-android");
        hashmap.put("platform", "android");
        hashmap.put("core_version", "");
        hashmap.put("version", "4.2.0.739");
        hashmap.put("revision", Integer.toString(0x1908b3e3));
        hashmap.put("uptime", Long.toString(SystemClock.elapsedRealtime() - b));
        hashmap.put("country", Locale.getDefault().getCountry());
        hashmap.put("device_id", c.e());
        hashmap.put("uuid", UUID.randomUUID().toString());
        hashmap.put("hardware_model", Build.MODEL);
        hashmap.put("hardware_vendor", Build.MANUFACTURER);
        hashmap.put("os", android.os.Build.VERSION.RELEASE);
        hashmap.put("user_id", a);
        hashmap.put("crash_timestamp", Long.toString(System.currentTimeMillis()));
        hashmap.put("crash_handler", "Crashlytics");
        return hashmap;
    }
}
