// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.PublishCallback;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl

private static final class callback extends callback
{

    private final PublishCallback callback;

    public final void onExpired()
    {
    }


/*
    static  access$300(PublishCallback publishcallback)
    {
        if (publishcallback == null)
        {
            return null;
        } else
        {
            return new <init>(publishcallback);
        }
    }

*/

    private <init>(PublishCallback publishcallback)
    {
        callback = publishcallback;
    }
}
