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

    private static final int HAS_MIC = 1;
    private static final int HAS_NO_MIC = 0;
    private static final int STATE_PLUGGED = 1;
    private static final int STATE_UNPLUGGED = 0;
    final AudioManagerAndroid this$0;

    public void onReceive(Context context, Intent intent)
    {
        intent.getIntExtra("state", 0);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 51
    //                   1 101;
           goto _L1 _L2 _L3
_L1:
        AudioManagerAndroid.access$400("Invalid state");
_L5:
        if (AudioManagerAndroid.access$500(AudioManagerAndroid.this))
        {
            AudioManagerAndroid.access$600(AudioManagerAndroid.this);
        }
        return;
_L2:
        synchronized (AudioManagerAndroid.access$100(AudioManagerAndroid.this))
        {
            AudioManagerAndroid.access$200(AudioManagerAndroid.this)[1] = false;
            if (AudioManagerAndroid.access$300(AudioManagerAndroid.this))
            {
                AudioManagerAndroid.access$200(AudioManagerAndroid.this)[2] = true;
            }
        }
        continue; /* Loop/switch isn't completed */
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
_L3:
        synchronized (AudioManagerAndroid.access$100(AudioManagerAndroid.this))
        {
            AudioManagerAndroid.access$200(AudioManagerAndroid.this)[1] = true;
            AudioManagerAndroid.access$200(AudioManagerAndroid.this)[2] = false;
        }
        if (true) goto _L5; else goto _L4
_L4:
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
    }

    ()
    {
        this$0 = AudioManagerAndroid.this;
        super();
    }
}
