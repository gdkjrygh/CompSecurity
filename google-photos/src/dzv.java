// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class dzv
{

    private static Map a;

    public static String a(int i)
    {
        return (String)a.get(Integer.valueOf(i));
    }

    public static Set a()
    {
        return a.keySet();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(Integer.valueOf(5), "com.google.android.apps.photos.assistant.remote.movies");
        a.put(Integer.valueOf(4), "com.google.android.apps.photos.assistant.remote.autoawesome_add");
        a.put(Integer.valueOf(8), "com.google.android.apps.photos.assistant.remote.system");
        a.put(Integer.valueOf(10), "com.google.android.apps.photos.assistant.remote.album_add");
        a.put(Integer.valueOf(6), "com.google.android.apps.photos.assistant.remote.stories_add");
        a.put(Integer.valueOf(3), "com.google.android.apps.photos.assistant.remote.stories_share");
        a.put(Integer.valueOf(1), "com.google.android.apps.photos.assistant.remote.autoawesome_share");
        a.put(Integer.valueOf(9), "com.google.android.apps.photos.assistant.remote.time_machine");
        a.put(Integer.valueOf(13), "com.google.android.apps.photos.assistant.remote.time_machine");
        a.put(Integer.valueOf(11), "com.google.android.apps.photos.assistant.remote.envelope.single_activity");
        a.put(Integer.valueOf(12), "com.google.android.apps.photos.assistant.remote.envelope.multiple_activity");
    }
}
