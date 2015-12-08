// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;


// Referenced classes of package com.microsoft.media:
//            AudioDeviceUtils, AudioPal

class this._cls0
    implements Runnable
{

    final AudioDeviceUtils this$0;

    public void run()
    {
        AudioPal.onVolumeChange();
    }

    ()
    {
        this$0 = AudioDeviceUtils.this;
        super();
    }
}
