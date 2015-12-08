// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.chromium.media:
//            AudioManagerAndroid

class this._cls0 extends BroadcastReceiver
{

    final AudioManagerAndroid this$0;

    public void onReceive(Context context, Intent intent)
    {
        switch (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0))
        {
        default:
            AudioManagerAndroid.access$400("Invalid state");
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            AudioManagerAndroid.access$702(AudioManagerAndroid.this, 1);
            return;

        case 0: // '\0'
            AudioManagerAndroid.access$702(AudioManagerAndroid.this, 0);
            return;
        }
    }

    ()
    {
        this$0 = AudioManagerAndroid.this;
        super();
    }
}
