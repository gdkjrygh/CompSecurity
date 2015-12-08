// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dty
{

    public static final Uri a;

    public static Uri a(String s)
    {
        ctz.a(s);
        return Uri.withAppendedPath(Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/social/request_permissions").toString()), Uri.encode(s));
    }

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/social").toString());
    }
}
