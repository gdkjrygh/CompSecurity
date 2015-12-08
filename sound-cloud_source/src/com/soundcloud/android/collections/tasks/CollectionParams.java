// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections.tasks;

import android.net.Uri;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.storage.provider.Content;

public class CollectionParams
{

    public Uri contentUri;
    public boolean isRefresh;
    public Class loadModel;
    public int maxToLoad;
    public boolean refreshPageItems;
    private Request request;
    public int startIndex;
    public long timestamp;

    public CollectionParams()
    {
    }

    public Content getContent()
    {
        return Content.match(contentUri);
    }

    public Request getRequest()
    {
        return request;
    }

    public boolean isRefresh()
    {
        return isRefresh;
    }

    public void setRequest(Request request1)
    {
        request = request1;
    }

    public String toString()
    {
        return (new StringBuilder("CollectionParams{loadModel=")).append(loadModel).append(", contentUri=").append(contentUri).append(", isRefresh=").append(isRefresh).append(", request=").append(request).append(", refreshPageItems=").append(refreshPageItems).append(", startIndex=").append(startIndex).append(", maxToLoad=").append(maxToLoad).append(", timestamp=").append(timestamp).append('}').toString();
    }
}
