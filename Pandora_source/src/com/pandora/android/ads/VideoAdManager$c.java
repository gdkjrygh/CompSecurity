// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.android.ads:
//            VideoAdManager

public static class  extends b
{

    private static volatile VideoAdManager a = null;

    public static VideoAdManager a()
    {
        com/pandora/android/ads/VideoAdManager$c;
        JVM INSTR monitorenter ;
        VideoAdManager videoadmanager = a;
        if (VideoAdManager.r())
        {
            throw new IllegalStateException("ViewAdManager is already shutdown, cannot re-initialize again.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        com/pandora/android/ads/VideoAdManager$c;
        JVM INSTR monitorexit ;
        throw exception;
        VideoAdManager videoadmanager1;
        if (a == null)
        {
            a = new VideoAdManager();
        }
        videoadmanager1 = a;
        com/pandora/android/ads/VideoAdManager$c;
        JVM INSTR monitorexit ;
        return videoadmanager1;
    }

    public static void b()
    {
        com/pandora/android/ads/VideoAdManager$c;
        JVM INSTR monitorenter ;
        VideoAdManager videoadmanager = a;
        if (videoadmanager == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        videoadmanager.a();
        a = null;
        com/pandora/android/ads/VideoAdManager$c;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/pandora/android/ads/VideoAdManager$c;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void c()
    {
        a();
    }


    public ()
    {
    }
}
