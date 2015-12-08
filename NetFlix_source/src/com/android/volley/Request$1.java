// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            Request

class val.threadId
    implements Runnable
{

    final Request this$0;
    final String val$tag;
    final long val$threadId;

    public void run()
    {
        Request.access$000(Request.this).add(val$tag, val$threadId);
        Request.access$000(Request.this).finish(toString());
    }

    MarkerLog()
    {
        this$0 = final_request;
        val$tag = s;
        val$threadId = J.this;
        super();
    }
}
