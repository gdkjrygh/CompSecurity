// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.platform.capture.FpsRange;
import java.util.Comparator;

// Referenced classes of package com.skype.android.video.capture:
//            AbstractPlatformCapturer

class this._cls0
    implements Comparator
{

    final AbstractPlatformCapturer this$0;

    public int compare(FpsRange fpsrange, FpsRange fpsrange1)
    {
        int i = fpsrange.b() - fpsrange.a() - (fpsrange1.b() - fpsrange1.a());
        if (i > 0)
        {
            return -1;
        }
        return i >= 0 ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((FpsRange)obj, (FpsRange)obj1);
    }

    ()
    {
        this$0 = AbstractPlatformCapturer.this;
        super();
    }
}
