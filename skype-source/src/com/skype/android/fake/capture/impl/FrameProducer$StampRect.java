// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            FrameProducer

public static class p.b
{

    public final int a;
    public final int b;
    public final int c;

    public p(p p, Resolution resolution)
    {
        int i = Math.max(resolution.getWidth(), resolution.getHeight());
        int j = Math.min(resolution.getWidth(), resolution.getHeight());
        c = Math.min((int)((p.c() * (float)i) / 100F), j);
        a = Math.min(i - c, (int)(p.a() * (float)i) / 100);
        b = Math.min(j - c, (int)(p.b() * (float)i) / 100);
    }
}
