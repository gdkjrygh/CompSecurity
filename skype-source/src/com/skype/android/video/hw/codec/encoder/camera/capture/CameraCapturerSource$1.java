// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import java.util.Comparator;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CameraCapturerSource

static final class 
    implements Comparator
{

    private int getSize(int ai[])
    {
        return ai[1] - ai[0];
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((int[])obj, (int[])obj1);
    }

    public final int compare(int ai[], int ai1[])
    {
        int i = getSize(ai);
        int j = getSize(ai1);
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    ()
    {
    }
}
