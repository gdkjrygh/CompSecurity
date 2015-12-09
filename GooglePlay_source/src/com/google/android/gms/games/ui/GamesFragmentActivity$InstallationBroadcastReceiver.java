// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

private final class <init> extends BroadcastReceiver
{

    final GamesFragmentActivity this$0;

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()))
        {
            context = intent.getData();
            if (context != null && context.getSchemeSpecificPart().equals(GamesFragmentActivity.access$100(GamesFragmentActivity.this)))
            {
                boolean _tmp = GamesFragmentActivity.access$202$5c9b38a9(GamesFragmentActivity.this);
                onFinskyLightInstallationCompleted(GamesFragmentActivity.access$100(GamesFragmentActivity.this));
                String _tmp1 = GamesFragmentActivity.access$102$35e9d659(GamesFragmentActivity.this);
            }
        }
    }

    private Y()
    {
        this$0 = GamesFragmentActivity.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
