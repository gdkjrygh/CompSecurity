// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import java.util.List;

public final class GamesDataChangeUris
{

    public static final Uri URI_INVITATIONS;
    public static final Uri URI_PLAYERS;
    private static final Uri URI_ROOT;

    public static void validateUri(Uri uri)
    {
        boolean flag;
        if (uri.getAuthority().equals("com.google.android.gms.games") && ((String)uri.getPathSegments().get(0)).equals("data_change"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "URI to notify must start with \"com.google.android.gms.games/data_change\"");
    }

    static 
    {
        Uri uri = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        URI_ROOT = uri;
        URI_INVITATIONS = uri.buildUpon().appendPath("invitations").build();
        URI_PLAYERS = URI_ROOT.buildUpon().appendEncodedPath("players").build();
    }
}
