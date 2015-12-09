// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.actions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import fos;

public class a extends ResultReceiver
{

    private Activity a;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        intent.putExtra("android.media.extra.AUDIO_SESSION", bundle.getInt("audio_session_id"));
        a.startActivityForResult(intent, 0);
    }

    public (Handler handler, Activity activity)
    {
        a = activity;
        super(handler);
    }
}
