// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ejv
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "application/sdp", "audio/x-mpegurl", "audio/mpegurl", "application/vnd.apple.mpegurl", "application/x-mpegurl"
    })));

    public static String a(euv euv1)
    {
        switch (ejw.a[euv1.ordinal()])
        {
        default:
            euv1 = String.valueOf(euv1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(euv1).length() + 17)).append("Unknown av type: ").append(euv1).toString());

        case 1: // '\001'
        case 2: // '\002'
            return "image/jpeg";

        case 3: // '\003'
            return "video/mpeg";

        case 4: // '\004'
            return "image/gif";
        }
    }

    public static boolean a(String s)
    {
        return s != null && s.startsWith("image/");
    }

    public static boolean b(String s)
    {
        return s != null && (s.startsWith("video/") || a.contains(s));
    }

    public static boolean c(String s)
    {
        return s.equals("application/vnd.google.panorama360+jpg");
    }

    public static euv d(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return euv.a;
        }
        if (a(s))
        {
            return euv.b;
        }
        if (b(s))
        {
            return euv.c;
        }
        if (s.equals("application/vnd.google.panorama360+jpg"))
        {
            return euv.d;
        } else
        {
            return euv.a;
        }
    }

}
