// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.video.hw.format.Resolution;
import java.util.Comparator;

// Referenced classes of package com.skype.android.video.capture:
//            AbstractPlatformCapturer

class this._cls0
    implements Comparator
{

    final AbstractPlatformCapturer this$0;

    public int compare(Resolution resolution, Resolution resolution1)
    {
        return Long.signum(resolution.getWidth() * resolution.getHeight() - resolution1.getWidth() * resolution1.getHeight());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Resolution)obj, (Resolution)obj1);
    }

    ()
    {
        this$0 = AbstractPlatformCapturer.this;
        super();
    }
}
