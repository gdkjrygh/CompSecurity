// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesContractInternal

public static final class 
    implements BaseColumns, com.google.android.gms.games.internal.
{

    public static Uri getContentUri(ClientContext clientcontext)
    {
        return etBuilder(clientcontext, "milestones").Context();
    }

    public static Uri getUriForExternalMilestoneId(Uri uri, String s)
    {
        return etBuilder(uri, "milestones").getBuilder("ext_milestone").er(s).er();
    }

    public static Uri getUriForExternalMilestoneId(ClientContext clientcontext, String s)
    {
        return getUriForExternalMilestoneId(getContentUri(clientcontext), s);
    }

    public static Uri getUriForId(ClientContext clientcontext, long l)
    {
        return etBuilder(clientcontext, "milestones").Context(String.valueOf(l)).Context();
    }
}
