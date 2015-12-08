// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtw
{

    public static final Uri a;

    public static boolean a(int i)
    {
        return i == 1;
    }

    public static boolean a(String s)
    {
        return "basic".equalsIgnoreCase(s) || "premium".equalsIgnoreCase(s);
    }

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/session").toString());
    }
}
