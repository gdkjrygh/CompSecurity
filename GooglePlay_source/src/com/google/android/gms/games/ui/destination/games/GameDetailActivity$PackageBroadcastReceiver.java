// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.games.Game;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

private final class <init> extends BroadcastReceiver
{

    final GameDetailActivity this$0;

    public final void onReceive(Context context, Intent intent)
    {
        if (GameDetailActivity.access$3200(GameDetailActivity.this) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((context = intent.getData()) != null && context.getSchemeSpecificPart().equals(GameDetailActivity.access$3200(GameDetailActivity.this).getInstancePackageName()))
        {
            GameDetailActivity.access$1400(GameDetailActivity.this).sInstalled = true;
            GameDetailActivity.access$3502$1b0751c8(GameDetailActivity.this);
            GameDetailActivity.access$1400(GameDetailActivity.this).pulateViews();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) goto _L1; else goto _L3
_L3:
        context = intent.getData();
        if (context != null && context.getSchemeSpecificPart().equals(GameDetailActivity.access$3200(GameDetailActivity.this).getInstancePackageName()))
        {
            GameDetailActivity.access$1400(GameDetailActivity.this).sInstalled = false;
            GameDetailActivity.access$1400(GameDetailActivity.this).pulateViews();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private ()
    {
        this$0 = GameDetailActivity.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
