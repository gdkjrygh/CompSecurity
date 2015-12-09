// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtp
{

    public static final Uri a;
    public static final Uri b;
    public static final Uri c;

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/inbox").toString());
        b = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/inbox/items").toString());
        c = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/inbox/tracks").toString());
    }
}
