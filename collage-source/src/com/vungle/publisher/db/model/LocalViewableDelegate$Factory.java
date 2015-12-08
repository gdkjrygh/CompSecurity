// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.net.http.DownloadHttpGateway;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            LocalViewableDelegate

static class A
{

    Provider a;
    DownloadHttpGateway b;

    final LocalViewableDelegate a(A a1)
    {
        LocalViewableDelegate localviewabledelegate = (LocalViewableDelegate)a.get();
        localviewabledelegate.a = a1;
        localviewabledelegate.d = b;
        return localviewabledelegate;
    }

    A()
    {
    }
}
