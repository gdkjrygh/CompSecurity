// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    private static final Uri aan;
    public static final Uri aao;
    public static final Uri aap;

    public GamesDataChangeUris()
    {
    }

    static 
    {
        aan = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        aao = aan.buildUpon().appendPath("invitations").build();
        aap = aan.buildUpon().appendEncodedPath("players").build();
    }
}
