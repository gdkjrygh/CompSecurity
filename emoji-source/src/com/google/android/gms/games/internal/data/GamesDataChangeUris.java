// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    private static final Uri Rj;
    public static final Uri Rk;
    public static final Uri Rl;

    public GamesDataChangeUris()
    {
    }

    static 
    {
        Rj = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        Rk = Rj.buildUpon().appendPath("invitations").build();
        Rl = Rj.buildUpon().appendEncodedPath("players").build();
    }
}
