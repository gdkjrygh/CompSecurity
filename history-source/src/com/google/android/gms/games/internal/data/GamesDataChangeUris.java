// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    private static final Uri ach;
    public static final Uri aci;
    public static final Uri acj;

    public GamesDataChangeUris()
    {
    }

    static 
    {
        ach = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        aci = ach.buildUpon().appendPath("invitations").build();
        acj = ach.buildUpon().appendEncodedPath("players").build();
    }
}
