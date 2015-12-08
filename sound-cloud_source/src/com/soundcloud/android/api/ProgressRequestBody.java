// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import c.g;
import c.o;
import com.c.a.r;
import com.c.a.x;
import java.io.IOException;

class ProgressRequestBody extends x
{

    private final ApiRequest.ProgressListener progressListener;
    private final x requestBody;

    public ProgressRequestBody(x x1, ApiRequest.ProgressListener progresslistener)
    {
        requestBody = x1;
        progressListener = progresslistener;
    }

    public long contentLength()
        throws IOException
    {
        return requestBody.contentLength();
    }

    public r contentType()
    {
        return requestBody.contentType();
    }

    public void writeTo(final g final_x1)
        throws IOException
    {
        final_x1 = o.a(new _cls1(contentLength()));
        requestBody.writeTo(final_x1);
        final_x1.flush();
    }


    private class _cls1 extends k
    {

        private long bytesWritten;
        final ProgressRequestBody this$0;
        final long val$totalBytes;

        public void write(e e, long l)
            throws IOException
        {
            bytesWritten = bytesWritten + l;
            progressListener.update(bytesWritten, totalBytes);
            super.write(e, l);
        }

        _cls1(long l)
        {
            this$0 = ProgressRequestBody.this;
            totalBytes = l;
            super(final_x1);
        }
    }

}
