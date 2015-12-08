// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

class this._cls1
    implements ConnectionKeepAliveStrategy
{

    final  this$1;

    public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return 20000L;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
