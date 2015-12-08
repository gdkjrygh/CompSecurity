// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.Sink;

// Referenced classes of package com.squareup.okhttp.internal:
//            FaultHidingSink, DiskLruCache

class  extends FaultHidingSink
{

    static final boolean $assertionsDisabled;
    final DiskLruCache this$0;

    protected void onException(IOException ioexception)
    {
        if (!$assertionsDisabled && !Thread.holdsLock(DiskLruCache.this))
        {
            throw new AssertionError();
        } else
        {
            DiskLruCache.access$602(DiskLruCache.this, true);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/DiskLruCache.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    (Sink sink)
    {
        this$0 = DiskLruCache.this;
        super(sink);
    }
}
