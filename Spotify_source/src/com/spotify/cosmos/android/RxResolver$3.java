// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import java.util.Map;

// Referenced classes of package com.spotify.cosmos.android:
//            RxResolver, Router

final class backReceiver
    implements uterStrategy
{

    public final int performRequest(Router router, String s, String s1, Map map, byte abyte0[], backReceiver backreceiver)
    {
        return router.subscribe(s, s1, map, abyte0, backreceiver);
    }

    backReceiver()
    {
    }
}
