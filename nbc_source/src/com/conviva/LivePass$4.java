// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva;

import com.conviva.session.Session;
import com.conviva.session.SessionFactory;
import java.util.concurrent.Callable;

// Referenced classes of package com.conviva:
//            LivePass

static final class 
    implements Callable
{

    final int val$bitrateKbps;
    final int val$sessionId;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        LivePass.access$400().getSession(val$sessionId).setBitrate(val$bitrateKbps);
        return null;
    }

    sion(int i, int j)
    {
        val$sessionId = i;
        val$bitrateKbps = j;
        super();
    }
}
