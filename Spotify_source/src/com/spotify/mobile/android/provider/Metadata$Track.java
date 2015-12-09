// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import com.spotify.music.internal.provider.SpotifyProvider;

public final class 
    implements BaseColumns
{

    public static Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/track/").append(s).toString());
    }
}
