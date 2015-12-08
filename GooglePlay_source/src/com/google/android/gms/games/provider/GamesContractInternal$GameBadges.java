// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesContractInternal

public static final class 
    implements BaseColumns, com.google.android.gms.games.internal.
{

    public static Uri getContentUri(ClientContext clientcontext)
    {
        return etBuilder(clientcontext, "game_badges").Context();
    }

    public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return etBuilder(clientcontext, "game_badges").Context("ext_game").Context(s).Context();
    }
}
