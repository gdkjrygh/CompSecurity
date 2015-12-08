// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//            StreamSense

class b extends TimerTask
{

    final StreamSense a;

    b(StreamSense streamsense)
    {
        a = streamsense;
        super();
    }

    public void run()
    {
        a.a();
    }
}
