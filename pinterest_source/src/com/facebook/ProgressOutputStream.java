// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook:
//            RequestOutputStream, Settings, RequestProgress, RequestBatch, 
//            Request

class ProgressOutputStream extends FilterOutputStream
    implements RequestOutputStream
{

    private long batchProgress;
    private RequestProgress currentRequestProgress;
    private long lastReportedProgress;
    private long maxProgress;
    private final Map progressMap;
    private final RequestBatch requests;
    private final long threshold = Settings.getOnProgressThreshold();

    ProgressOutputStream(OutputStream outputstream, RequestBatch requestbatch, Map map, long l)
    {
        super(outputstream);
        requests = requestbatch;
        progressMap = map;
        maxProgress = l;
    }

    private void addProgress(long l)
    {
        if (currentRequestProgress != null)
        {
            currentRequestProgress.addProgress(l);
        }
        batchProgress = batchProgress + l;
        if (batchProgress >= lastReportedProgress + threshold || batchProgress >= maxProgress)
        {
            reportBatchProgress();
        }
    }

    private void reportBatchProgress()
    {
        if (batchProgress > lastReportedProgress)
        {
            Iterator iterator = requests.getCallbacks().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                final RequestBatch.OnProgressCallback progressCallback = (RequestBatch.Callback)iterator.next();
                if (progressCallback instanceof RequestBatch.OnProgressCallback)
                {
                    Handler handler = requests.getCallbackHandler();
                    progressCallback = (RequestBatch.OnProgressCallback)progressCallback;
                    if (handler == null)
                    {
                        progressCallback.onBatchProgress(requests, batchProgress, maxProgress);
                    } else
                    {
                        handler.post(new _cls1());
                    }
                }
            } while (true);
            lastReportedProgress = batchProgress;
        }
    }

    public void close()
    {
        super.close();
        for (Iterator iterator = progressMap.values().iterator(); iterator.hasNext(); ((RequestProgress)iterator.next()).reportProgress()) { }
        reportBatchProgress();
    }

    long getBatchProgress()
    {
        return batchProgress;
    }

    long getMaxProgress()
    {
        return maxProgress;
    }

    public void setCurrentRequest(Request request)
    {
        if (request != null)
        {
            request = (RequestProgress)progressMap.get(request);
        } else
        {
            request = null;
        }
        currentRequestProgress = request;
    }

    public void write(int i)
    {
        out.write(i);
        addProgress(1L);
    }

    public void write(byte abyte0[])
    {
        out.write(abyte0);
        addProgress(abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        addProgress(j);
    }




    private class _cls1
        implements Runnable
    {

        final ProgressOutputStream this$0;
        final RequestBatch.OnProgressCallback val$progressCallback;

        public void run()
        {
            progressCallback.onBatchProgress(requests, batchProgress, maxProgress);
        }

        _cls1()
        {
            this$0 = ProgressOutputStream.this;
            progressCallback = onprogresscallback;
            super();
        }
    }

}
