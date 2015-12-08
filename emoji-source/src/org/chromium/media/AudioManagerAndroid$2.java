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
        intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
        JVM INSTR tableswitch 0 3: default 36
    //                   0 59
    //                   1 41
    //                   2 89
    //                   3 41;
           goto _L1 _L2 _L3 _L4 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        AudioManagerAndroid.access$400("Invalid state");
_L6:
        if (AudioManagerAndroid.access$500(AudioManagerAndroid.this))
        {
            AudioManagerAndroid.access$600(AudioManagerAndroid.this);
        }
        return;
_L2:
        synchronized (AudioManagerAndroid.access$100(AudioManagerAndroid.this))
        {
            AudioManagerAndroid.access$200(AudioManagerAndroid.this)[3] = false;
        }
        continue; /* Loop/switch isn't completed */
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
_L4:
        synchronized (AudioManagerAndroid.access$100(AudioManagerAndroid.this))
        {
            AudioManagerAndroid.access$200(AudioManagerAndroid.this)[3] = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
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
