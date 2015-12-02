// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.TimeRange;

// Referenced classes of package com.google.android.exoplayer.dash:
//            DashChunkSource

class a
    implements Runnable
{

    final TimeRange a;
    final DashChunkSource b;

    public void run()
    {
    }

    _cls9(DashChunkSource dashchunksource, TimeRange timerange)
    {
        b = dashchunksource;
        a = timerange;
        super();
    }
}
