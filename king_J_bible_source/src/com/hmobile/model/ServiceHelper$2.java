// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.hmobile.model:
//            ServiceHelper

class this._cls0
    implements ConnectionKeepAliveStrategy
{

    final ServiceHelper this$0;

    public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return 0x30d40L;
    }

    xt()
    {
        this$0 = ServiceHelper.this;
        super();
    }
}
