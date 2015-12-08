// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;

// Referenced classes of package com.dropbox.client2.session:
//            AbstractSession

class this._cls0
    implements ConnPerRoute
{

    final AbstractSession this$0;

    public int getMaxForRoute(HttpRoute httproute)
    {
        return 10;
    }

    ()
    {
        this$0 = AbstractSession.this;
        super();
    }
}
