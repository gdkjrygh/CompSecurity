// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    private static final Uri Rg;
    public static final Uri Rh;
    public static final Uri Ri;

    public GamesDataChangeUris()
    {
    }

    static 
    {
        Rg = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        Rh = Rg.buildUpon().appendPath("invitations").build();
        Ri = Rg.buildUpon().appendEncodedPath("players").build();
    }
}
