// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.video.hw.format.Resolution;
import java.io.File;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            SourceVideoFileList

public static class e
{

    public final String a;
    public final ImageFormat b;
    public final Resolution c;
    public final int d;
    public final File e;

    public String toString()
    {
        return e.getAbsolutePath();
    }

    public (String s, ImageFormat imageformat, Resolution resolution, int i, File file)
    {
        a = s;
        b = imageformat;
        c = resolution;
        d = i;
        e = file;
    }
}
