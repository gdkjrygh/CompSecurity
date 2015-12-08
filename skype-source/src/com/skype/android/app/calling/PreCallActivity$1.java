// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;

// Referenced classes of package com.skype.android.app.calling:
//            PreCallActivity

final class this._cls0 extends BroadcastReceiver
{

    final PreCallActivity this$0;

    public final void onReceive(Context context, Intent intent)
    {
        unregisterReceiver(this);
        audioManager.setStreamVolume(getVolumeControlStream(), ((Integer)intent.getExtras().get("android.media.EXTRA_VOLUME_STREAM_VALUE")).intValue(), 0);
        registerReceiver(this, PreCallActivity.access$000(PreCallActivity.this));
    }

    ()
    {
        this$0 = PreCallActivity.this;
        super();
    }
}
