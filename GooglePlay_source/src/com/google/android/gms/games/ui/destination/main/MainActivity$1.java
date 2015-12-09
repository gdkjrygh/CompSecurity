// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            MainActivity

final class val.emailAddress
    implements android.content..OnClickListener
{

    final MainActivity this$0;
    final String val$emailAddress;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        SharedPrefsConfig.setBoolean(MainActivity.this, "showDogfoodInvite", false);
        dialoginterface = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "join-play-games-dogfood@google.com", null));
        dialoginterface.putExtra("android.intent.extra.SUBJECT", "Please add me to the Play Games dogfood");
        dialoginterface.putExtra("android.intent.extra.TEXT", (new StringBuilder("Google email: ")).append(val$emailAddress).toString());
        startActivity(Intent.createChooser(dialoginterface, "Send email using..."));
    }

    efsConfig()
    {
        this$0 = final_mainactivity;
        val$emailAddress = String.this;
        super();
    }
}
