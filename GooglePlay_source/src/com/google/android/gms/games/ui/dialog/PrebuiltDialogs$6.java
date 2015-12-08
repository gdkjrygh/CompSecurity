// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.ui.G;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            PrebuiltDialogs

static final class val.activity
    implements android.content.ClickListener
{

    final Activity val$activity;
    final Invitation val$invitation;
    final com.google.android.gms.games.ui.util.aringOnClickListener val$listener;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -3 -1: default 28
    //                   -3 72
    //                   -2 28
    //                   -1 56;
           goto _L1 _L2 _L1 _L3
_L1:
        GamesLog.e("GamesDialogs", (new StringBuilder("Unhandled dialog action ")).append(i).toString());
_L5:
        dialoginterface.dismiss();
        return;
_L3:
        val$listener.onIdentitySharingAccepted(val$invitation);
        continue; /* Loop/switch isn't completed */
_L2:
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)G.playGamesIdSharingWebpageUrl.get()));
        val$activity.startActivity(intent);
        if (true) goto _L5; else goto _L4
_L4:
    }

    (com.google.android.gms.games.ui.util.aringOnClickListener aringonclicklistener, Invitation invitation1, Activity activity1)
    {
        val$listener = aringonclicklistener;
        val$invitation = invitation1;
        val$activity = activity1;
        super();
    }
}
