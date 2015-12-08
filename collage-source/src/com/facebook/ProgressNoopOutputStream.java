// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook:
//            RequestOutputStream, RequestProgress, GraphRequest

class ProgressNoopOutputStream extends OutputStream
    implements RequestOutputStream
{

    private int batchMax;
    private final Handler callbackHandler;
    private GraphRequest currentRequest;
    private RequestProgress currentRequestProgress;
    private final Map progressMap = new HashMap();

    ProgressNoopOutputStream(Handler handler)
    {
        callbackHandler = handler;
    }

    void addProgress(long l)
    {
        if (currentRequestProgress == null)
        {
            currentRequestProgress = new RequestProgress(callbackHandler, currentRequest);
            progressMap.put(currentRequest, currentRequestProgress);
        }
        currentRequestProgress.addToMax(l);
        batchMax = (int)((long)batchMax + l);
    }

    int getMaxProgress()
    {
        return batchMax;
    }

    Map getProgressMap()
    {
        return progressMap;
    }

    public void setCurrentRequest(GraphRequest graphrequest)
    {
        currentRequest = graphrequest;
        if (graphrequest != null)
        {
            graphrequest = (RequestProgress)progressMap.get(graphrequest);
        } else
        {
            graphrequest = null;
        }
        currentRequestProgress = graphrequest;
    }

    public void write(int i)
    {
        addProgress(1L);
    }

    public void write(byte abyte0[])
    {
        addProgress(abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        addProgress(j);
    }
}
