// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    private static final Uri Lq;
    public static final Uri Lr;
    public static final Uri Ls;

    public GamesDataChangeUris()
    {
    }

    static 
    {
        Lq = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        Lr = Lq.buildUpon().appendPath("invitations").build();
        Ls = Lq.buildUpon().appendEncodedPath("players").build();
    }
}
