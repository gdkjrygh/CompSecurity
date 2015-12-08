// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            LoggingManagerCallback

public class FetchVideosHandler extends LoggingManagerCallback
{
    public static interface FetchCallback
    {

        public abstract long getRequestId();

        public abstract void onErrorResponse();

        public abstract void onNoVideosInResponse();

        public abstract void updateDataSet(List list, String s, int i, int j);
    }


    private final FetchCallback callback;
    private final int end;
    private final long requestId;
    private final int start;
    private final String title;

    public FetchVideosHandler(String s, FetchCallback fetchcallback, String s1, int i, int j)
    {
        super(s);
        callback = fetchcallback;
        requestId = fetchcallback.getRequestId();
        title = s1;
        start = i;
        end = j;
    }

    private void handleResponse(List list, int i)
    {
        if (requestId != callback.getRequestId())
        {
            Log.v(tag, "Ignoring stale onVideosFetched callback");
            return;
        }
        if (i != 0)
        {
            Log.w(tag, "Invalid status code");
            callback.onErrorResponse();
            return;
        }
        if (list == null || list.size() <= 0)
        {
            Log.d(tag, "No videos in response");
            callback.onNoVideosInResponse();
            return;
        } else
        {
            callback.updateDataSet(list, title, start, end);
            return;
        }
    }

    public void onCWVideosFetched(List list, int i)
    {
        super.onCWVideosFetched(list, i);
        handleResponse(list, i);
    }

    public void onVideosFetched(List list, int i)
    {
        super.onVideosFetched(list, i);
        handleResponse(list, i);
    }
}
