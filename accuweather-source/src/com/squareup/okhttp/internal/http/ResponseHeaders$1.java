// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;


// Referenced classes of package com.squareup.okhttp.internal.http:
//            ResponseHeaders, HeaderParser

class this._cls0
    implements ControlHandler
{

    final ResponseHeaders this$0;

    public void handle(String s, String s1)
    {
        if ("no-cache".equalsIgnoreCase(s))
        {
            ResponseHeaders.access$002(ResponseHeaders.this, true);
        } else
        {
            if ("no-store".equalsIgnoreCase(s))
            {
                ResponseHeaders.access$102(ResponseHeaders.this, true);
                return;
            }
            if ("max-age".equalsIgnoreCase(s))
            {
                ResponseHeaders.access$202(ResponseHeaders.this, HeaderParser.parseSeconds(s1));
                return;
            }
            if ("s-maxage".equalsIgnoreCase(s))
            {
                ResponseHeaders.access$302(ResponseHeaders.this, HeaderParser.parseSeconds(s1));
                return;
            }
            if ("public".equalsIgnoreCase(s))
            {
                ResponseHeaders.access$402(ResponseHeaders.this, true);
                return;
            }
            if ("must-revalidate".equalsIgnoreCase(s))
            {
                ResponseHeaders.access$502(ResponseHeaders.this, true);
                return;
            }
        }
    }

    ControlHandler()
    {
        this$0 = ResponseHeaders.this;
        super();
    }
}
