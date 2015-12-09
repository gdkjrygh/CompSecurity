// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            RequestQueue, Request

class val.tag
    implements questFilter
{

    final RequestQueue this$0;
    final Object val$tag;

    public boolean apply(Request request)
    {
        return request.getTag() == val$tag;
    }

    questFilter()
    {
        this$0 = final_requestqueue;
        val$tag = Object.this;
        super();
    }
}
