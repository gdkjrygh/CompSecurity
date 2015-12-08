// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.spotify.mobile.android.core.internal:
//            SoundDriver

class <init> extends Handler
{

    private final SoundDriver mSoundDriver;

    public void handleMessage(Message message)
    {
        synchronized (SoundDriver.access$700(mSoundDriver))
        {
            if (message.what == 1 && SoundDriver.access$000(mSoundDriver) != null)
            {
                SoundDriver.access$800(((Float)message.obj).floatValue(), SoundDriver.access$000(mSoundDriver));
            }
        }
        super.handleMessage(message);
        return;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }

    private (Looper looper, SoundDriver sounddriver)
    {
        super(looper);
        mSoundDriver = sounddriver;
    }

    mSoundDriver(Looper looper, SoundDriver sounddriver, mSoundDriver msounddriver)
    {
        this(looper, sounddriver);
    }
}
