// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsSampleSource

class a
    implements Runnable
{

    final IOException a;
    final HlsSampleSource b;

    public void run()
    {
    }

    (HlsSampleSource hlssamplesource, IOException ioexception)
    {
        b = hlssamplesource;
        a = ioexception;
        super();
    }
}
