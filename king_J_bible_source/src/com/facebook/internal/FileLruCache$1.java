// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

class val.key
    implements reamCloseCallback
{

    final FileLruCache this$0;
    private final File val$buffer;
    private final long val$bufferFileCreateTime;
    private final String val$key;

    public void onClose()
    {
        if (val$bufferFileCreateTime < FileLruCache.access$1(FileLruCache.this).get())
        {
            val$buffer.delete();
            return;
        } else
        {
            FileLruCache.access$2(FileLruCache.this, val$key, val$buffer);
            return;
        }
    }

    g()
    {
        this$0 = final_filelrucache;
        val$bufferFileCreateTime = l;
        val$buffer = file;
        val$key = String.this;
        super();
    }
}
