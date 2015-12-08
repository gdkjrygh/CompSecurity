// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            SimpleManagerCallback, ServiceManager, AddToMyListWrapper, ManagerCallback, 
//            MovieDetails, ShowDetails

private class videoId extends SimpleManagerCallback
{

    private final ManagerCallback cb;
    final ServiceManager this$0;
    private final String videoId;

    private void updateListeners(int i, boolean flag, boolean flag1)
    {
        AddToMyListWrapper addtomylistwrapper = ServiceManager.access$700(ServiceManager.this);
        if (addtomylistwrapper == null)
        {
            return;
        }
        if (i == 0)
        {
            addtomylistwrapper.updateState(videoId, flag);
            return;
        } else
        {
            addtomylistwrapper.updateToError(i, videoId, flag1);
            return;
        }
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        super.onMovieDetailsFetched(moviedetails, i);
        cb.onMovieDetailsFetched(moviedetails, i);
        boolean flag;
        if (moviedetails == null)
        {
            flag = false;
        } else
        {
            flag = moviedetails.isInQueue();
        }
        updateListeners(i, flag, false);
    }

    public void onQueueAdd(int i)
    {
        onQueueAdd(i);
        cb.onQueueAdd(i);
        updateListeners(i, true, true);
    }

    public void onQueueRemove(int i)
    {
        onQueueRemove(i);
        cb.onQueueRemove(i);
        updateListeners(i, false, true);
    }

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        super.onShowDetailsFetched(showdetails, i);
        cb.onShowDetailsFetched(showdetails, i);
        boolean flag;
        if (showdetails == null)
        {
            flag = false;
        } else
        {
            flag = showdetails.isInQueue();
        }
        updateListeners(i, flag, false);
    }



    public (ManagerCallback managercallback, String s)
    {
        this$0 = ServiceManager.this;
        super();
        cb = managercallback;
        videoId = s;
        servicemanager = ServiceManager.access$700(ServiceManager.this);
        if (ServiceManager.this != null)
        {
            updateToLoading(s);
        }
    }
}
