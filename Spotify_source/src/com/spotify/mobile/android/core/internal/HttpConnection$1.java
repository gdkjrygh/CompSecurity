// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.spotify.mobile.android.core.internal:
//            HttpConnection

class this._cls0 extends HttpGet
{

    final HttpConnection this$0;

    public String getMethod()
    {
        return "UPDATE";
    }

    (String s)
    {
        this$0 = HttpConnection.this;
        super(s);
    }
}
