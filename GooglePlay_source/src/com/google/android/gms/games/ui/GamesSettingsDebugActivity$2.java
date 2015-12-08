// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsDebugActivity

final class val.serverName
    implements android.content.er
{

    final GamesSettingsDebugActivity this$0;
    final CharSequence val$serverName;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        dialoginterface = new Intent("com.google.android.gms.games.CLEAR_DATA");
        sendBroadcast(dialoginterface);
        setSelectedServer(val$serverName);
    }

    ()
    {
        this$0 = final_gamessettingsdebugactivity;
        val$serverName = CharSequence.this;
        super();
    }
}
