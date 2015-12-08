// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            SourceVideoFileList

public static class 
{

    public String a;
    public ImageFormat b;
    public Resolution c;
    public FpsRange d;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [name=").append(a).append(", imageFormat=").append(b).append(", resolution=").append(c).append(", fpsRange=").append(d).append("]").toString();
    }

    public ()
    {
    }
}
