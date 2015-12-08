// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;

import java.util.Comparator;

// Referenced classes of package com.microsoft.dl.video.capture:
//            Capturer, CapturerMode

static final class e
    implements Comparator
{

    public final int compare(CapturerMode capturermode, CapturerMode capturermode1)
    {
        int i = Capturer.a(capturermode1) - Capturer.a(capturermode);
        if (i > 0)
        {
            return 1;
        }
        return i >= 0 ? 0 : -1;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((CapturerMode)obj, (CapturerMode)obj1);
    }

    e()
    {
    }
}
