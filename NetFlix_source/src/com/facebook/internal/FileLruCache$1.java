// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

class val.buffer
    implements reamCloseCallback
{

    final FileLruCache this$0;
    final File val$buffer;
    final String val$key;

    public void onClose()
    {
        FileLruCache.access$000(FileLruCache.this, val$key, val$buffer);
    }

    reamCloseCallback()
    {
        this$0 = final_filelrucache;
        val$key = s;
        val$buffer = File.this;
        super();
    }
}
