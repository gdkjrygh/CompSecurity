// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            PublicApi, Env

class this._cls0
    implements ConnPerRoute
{

    final PublicApi this$0;

    public int getMaxForRoute(HttpRoute httproute)
    {
        return !env.isApiHost(httproute.getTargetHost()) ? 2 : 10;
    }

    ()
    {
        this$0 = PublicApi.this;
        super();
    }
}
