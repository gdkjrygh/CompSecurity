// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;


// Referenced classes of package com.dropbox.client2:
//            ProgressListener

public final class adjustedTotal extends ProgressListener
{

    private final long adjustedTotal;
    private final long bytesOffset;
    private final ProgressListener relay;

    public final void onProgress(long l, long l1)
    {
        relay.onProgress(bytesOffset + l, adjustedTotal);
    }

    public final long progressInterval()
    {
        return relay.progressInterval();
    }

    public (ProgressListener progresslistener, long l, long l1)
    {
        relay = progresslistener;
        bytesOffset = l;
        adjustedTotal = l1;
    }
}
