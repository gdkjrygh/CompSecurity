// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.io.FilterOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.dropbox.client2:
//            ProgressListener

class intervalMs extends FilterOutputStream
{

    private long intervalMs;
    private long lastListened;
    final this._cls0 this$0;
    private long transferred;

    public void write(int i)
    {
        super.write(i);
        transferred = transferred + 1L;
        long l = System.currentTimeMillis();
        if (l - lastListened > intervalMs)
        {
            lastListened = l;
            lastListened(this._cls0.this).onProgress(transferred, transferred(this._cls0.this));
        }
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        transferred = transferred + (long)j;
        long l = System.currentTimeMillis();
        if (l - lastListened > intervalMs)
        {
            lastListened = l;
            lastListened(this._cls0.this).onProgress(transferred, transferred(this._cls0.this));
        }
    }

    public (OutputStream outputstream)
    {
        this$0 = this._cls0.this;
        super(outputstream);
        lastListened = 0L;
        intervalMs = 0L;
        transferred = 0L;
        intervalMs = intervalMs(intervalMs.this).progressInterval();
    }
}
