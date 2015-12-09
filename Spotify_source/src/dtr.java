// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class dtr
{

    public static final Uri a;

    static 
    {
        a = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/playhistory/tracks").toString());
    }
}
