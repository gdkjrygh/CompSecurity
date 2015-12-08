// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            RequestListener, MMLog, MMException, MMAd

public static class 
    implements RequestListener
{

    public void MMAdOverlayClosed(MMAd mmad)
    {
        MMLog.i("MMSDK", "Millennial Media Ad View overlay closed");
    }

    public void MMAdOverlayLaunched(MMAd mmad)
    {
        MMLog.i("MMSDK", "Millennial Media Ad View overlay launched");
    }

    public void MMAdRequestIsCaching(MMAd mmad)
    {
        MMLog.i("MMSDK", "Millennial Media Ad View caching request");
    }

    public void onSingleTap(MMAd mmad)
    {
        MMLog.i("MMSDK", "Ad tapped");
    }

    public void requestCompleted(MMAd mmad)
    {
        MMLog.i("MMSDK", "Ad request succeeded");
    }

    public void requestFailed(MMAd mmad, MMException mmexception)
    {
        MMLog.i("MMSDK", String.format("Ad request failed with error: %d %s.", new Object[] {
            Integer.valueOf(mmexception.getCode()), mmexception.getMessage()
        }));
    }

    public ()
    {
    }
}
