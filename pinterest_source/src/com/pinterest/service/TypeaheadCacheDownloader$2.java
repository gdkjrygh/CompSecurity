// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.api.ByteApiResponseHandler;

// Referenced classes of package com.pinterest.service:
//            TypeaheadCacheDownloader

class this._cls0 extends ByteApiResponseHandler
{

    final TypeaheadCacheDownloader this$0;

    public volatile void onResponse(Object obj)
    {
        onResponse((byte[])obj);
    }

    public void onResponse(byte abyte0[])
    {
        (new pulatePartitionIntoDBTask(TypeaheadCacheDownloader.this, abyte0)).execute();
    }

    pulatePartitionIntoDBTask()
    {
        this$0 = TypeaheadCacheDownloader.this;
        super();
    }
}
