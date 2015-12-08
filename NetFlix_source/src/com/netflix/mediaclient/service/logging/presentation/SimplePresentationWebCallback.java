// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.logging.presentation:
//            PresentationWebCallback

public class SimplePresentationWebCallback
    implements PresentationWebCallback
{

    private static final String TAG = "nf_log";

    public SimplePresentationWebCallback()
    {
    }

    public void onEventsDelivered(String s)
    {
        Log.v("nf_log", String.format("onEventsDelivered: %s", new Object[] {
            s
        }));
    }

    public void onEventsDeliveryFailed(String s)
    {
        Log.v("nf_log", String.format("onEventsDeliveryFailed: %s", new Object[] {
            s
        }));
    }
}
