// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.pandora.radio.provider.StationProvider;

public class StationLiveFolderActivity extends Activity
{

    public StationLiveFolderActivity()
    {
    }

    private static Intent a(Context context, Uri uri, String s, int i)
    {
        Intent intent = new Intent();
        intent.setData(uri);
        intent.putExtra("android.intent.extra.livefolder.BASE_INTENT", new Intent("android.intent.action.VIEW", StationProvider.f));
        intent.putExtra("android.intent.extra.livefolder.NAME", s);
        intent.putExtra("android.intent.extra.livefolder.ICON", android.content.Intent.ShortcutIconResource.fromContext(context, i));
        intent.putExtra("android.intent.extra.livefolder.DISPLAY_MODE", 2);
        return intent;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if ("android.intent.action.CREATE_LIVE_FOLDER".equals(getIntent().getAction()))
        {
            setResult(-1, a(this, StationProvider.j, getResources().getString(0x7f0801bf), 0x7f0201fe));
        } else
        {
            setResult(0);
        }
        finish();
    }
}
