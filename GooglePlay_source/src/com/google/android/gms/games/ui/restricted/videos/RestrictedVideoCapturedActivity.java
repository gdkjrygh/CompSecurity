// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.restricted.videos;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.logging.GamesPlayLogger;
import java.text.SimpleDateFormat;

public final class RestrictedVideoCapturedActivity extends FragmentActivity
    implements android.view.View.OnClickListener
{

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private String mAccountName;
    private Game mGame;
    private Uri mUri;

    public RestrictedVideoCapturedActivity()
    {
    }

    private void logAction(int i)
    {
        GamesPlayLogger.logVideoUiAction(this, mGame.getInstancePackageName(), mGame.getApplicationId(), mAccountName, i, false, false, false, false);
    }

    public final void onClick(View view)
    {
        int i;
        i = view.getId();
        view = null;
        if (i != 0x7f0d02c7) goto _L2; else goto _L1
_L1:
        logAction(10);
        view = new Intent("android.intent.action.VIEW", mUri);
_L4:
        if (view != null)
        {
            startActivity(view);
            finish();
        }
        return;
_L2:
        if (i == 0x7f0d02c8)
        {
            logAction(11);
            if (getPackageManager().getLaunchIntentForPackage("com.google.android.youtube") == null)
            {
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse("market://details?id=com.google.android.youtube"));
            } else
            {
                view = new Intent("android.intent.action.SEND");
                view.setType("video/*");
                view.putExtra("android.intent.extra.STREAM", mUri);
                view.putExtra("android.intent.extra.TITLE", getString(0x7f1002d8, new Object[] {
                    mGame.getDisplayName(), DATE_FORMAT.format(Long.valueOf(System.currentTimeMillis()))
                }));
                view.putExtra("android.intent.extra.SUBJECT", getString(0x7f1002d6, new Object[] {
                    mGame.getDisplayName()
                }));
                view.putExtra("android.intent.extra.TEXT", getString(0x7f1002d7, new Object[] {
                    mGame.getDisplayName()
                }));
                view.setPackage("com.google.android.youtube");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0400eb);
        bundle = getIntent();
        mAccountName = bundle.getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        mGame = (Game)bundle.getParcelableExtra("com.google.android.gms.games.GAME");
        mUri = (Uri)bundle.getParcelableExtra("com.google.android.gms.games.VIDEO_URI");
        findViewById(0x7f0d02c7).setOnClickListener(this);
        findViewById(0x7f0d02c8).setOnClickListener(this);
    }

}
