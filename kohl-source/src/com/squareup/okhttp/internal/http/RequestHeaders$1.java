// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;


// Referenced classes of package com.squareup.okhttp.internal.http:
//            RequestHeaders, HeaderParser

class this._cls0
    implements eControlHandler
{

    final RequestHeaders this$0;

    public void handle(String s, String s1)
    {
        if ("no-cache".equalsIgnoreCase(s))
        {
            RequestHeaders.access$002(RequestHeaders.this, true);
        } else
        {
            if ("max-age".equalsIgnoreCase(s))
            {
                RequestHeaders.access$102(RequestHeaders.this, HeaderParser.parseSeconds(s1));
                return;
            }
            if ("max-stale".equalsIgnoreCase(s))
            {
                RequestHeaders.access$202(RequestHeaders.this, HeaderParser.parseSeconds(s1));
                return;
            }
            if ("min-fresh".equalsIgnoreCase(s))
            {
                RequestHeaders.access$302(RequestHeaders.this, HeaderParser.parseSeconds(s1));
                return;
            }
            if ("only-if-cached".equalsIgnoreCase(s))
            {
                RequestHeaders.access$402(RequestHeaders.this, true);
                return;
            }
        }
    }

    eControlHandler()
    {
        this$0 = RequestHeaders.this;
        super();
    }
}
