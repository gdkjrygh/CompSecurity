// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            BatchUnparsedResponse

class this._cls0 extends FilterInputStream
{

    final BatchUnparsedResponse this$0;

    public void close()
    {
    }

    (InputStream inputstream)
    {
        this$0 = BatchUnparsedResponse.this;
        super(inputstream);
    }
}
