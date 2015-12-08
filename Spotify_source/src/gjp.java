// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class gjp
{

    private static final List a = Collections.unmodifiableList(Arrays.asList(new String[] {
        "spblackbolt.s3.amazonaws.com", "d24rpqtr39o6l1.cloudfront.net"
    }));
    private static final List b = Collections.unmodifiableList(Arrays.asList(new String[] {
        "www.spotify.com", "www.google-analytics.com", "auth.api.sonyentertainmentnetwork.com", "account.sonyentertainmentnetwork.com", "link.playstationmusic.com", "auth.api.sp-int.sonyentertainmentnetwork.com", "account.sp-int.sonyentertainmentnetwork.com", "link.sp-int.playstationmusic.com", "auth.api.e1-np.sonyentertainmentnetwork.com", "account.e1-np.sonyentertainmentnetwork.com", 
        "link.e1-np.playstationmusic.com", "auth.api.q1-np.sonyentertainmentnetwork.com", "account.q1-np.sonyentertainmentnetwork.com", "link.q1-np.playstationmusic.com"
    }));

    public static Boolean a(Uri uri)
    {
        boolean flag;
        if ("spotify.c".equals(uri.getHost()) && "https".equals(uri.getScheme()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public static boolean b(Uri uri)
    {
        boolean flag;
        if (a.contains(uri.getHost()) || b.contains(uri.getHost()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && uri.getScheme().equals("https");
    }

    public static boolean c(Uri uri)
    {
        return b.contains(uri.getHost());
    }

}
