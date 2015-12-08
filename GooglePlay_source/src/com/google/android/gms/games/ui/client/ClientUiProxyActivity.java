// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;

public final class ClientUiProxyActivity extends Activity
{

    public ClientUiProxyActivity()
    {
    }

    public static void launchProxyIntent(Context context, Intent intent)
    {
        Intent intent1 = new Intent("com.google.android.gms.games.CLIENT_PROXY");
        intent1.setPackage("com.google.android.play.games");
        intent1.putExtra("com.google.android.gms.games.PROXY_INTENT", intent);
        intent1.addFlags(0x10000000);
        intent1.addFlags(0x800000);
        intent1.addFlags(32768);
        if (PlatformVersion.checkVersion(16))
        {
            context.startActivity(intent1, ActivityOptions.makeCustomAnimation(context, 0, 0).toBundle());
            return;
        } else
        {
            context.startActivity(intent1);
            return;
        }
    }

    protected final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Intent)getIntent().getParcelableExtra("com.google.android.gms.games.PROXY_INTENT");
        if (bundle != null)
        {
            startActivityForResult(bundle, 1000);
            return;
        } else
        {
            GamesLog.e("ClientUiProxyActivity", "Cannot proxy null intent!");
            finish();
            return;
        }
    }
}
