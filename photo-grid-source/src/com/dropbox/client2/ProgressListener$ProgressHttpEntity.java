// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

// Referenced classes of package com.dropbox.client2:
//            ProgressListener

public class length extends HttpEntityWrapper
{

    private final long length;
    private final ProgressListener listener;

    public void writeTo(OutputStream outputstream)
    {
        class CountingOutputStream extends FilterOutputStream
        {

            private long intervalMs;
            private long lastListened;
            final ProgressListener.ProgressHttpEntity this$0;
            private long transferred;

            public void write(int i)
            {
                super.write(i);
                transferred = transferred + 1L;
                long l = System.currentTimeMillis();
                if (l - lastListened > intervalMs)
                {
                    lastListened = l;
                    listener.onProgress(transferred, length);
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
                    listener.onProgress(transferred, length);
                }
            }

            public CountingOutputStream(OutputStream outputstream)
            {
                this$0 = ProgressListener.ProgressHttpEntity.this;
                super(outputstream);
                lastListened = 0L;
                intervalMs = 0L;
                transferred = 0L;
                intervalMs = listener.progressInterval();
            }
        }

        wrappedEntity.writeTo(new CountingOutputStream(outputstream));
    }



    public CountingOutputStream(HttpEntity httpentity, ProgressListener progresslistener)
    {
        super(httpentity);
        if (progresslistener == null)
        {
            throw new IllegalArgumentException("'listener' is null");
        } else
        {
            listener = progresslistener;
            length = httpentity.getContentLength();
            return;
        }
    }
}
