// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil

public static class status
{

    private boolean isFromNetwork;
    private Object media;
    private com.skype.etMediaLinkResult.status status;

    public Object getMedia()
    {
        return media;
    }

    public com.skype.etMediaLinkResult getStatus()
    {
        return status;
    }

    public boolean isFromNetwork()
    {
        return isFromNetwork;
    }

    public void setMedia(Object obj)
    {
        media = obj;
    }

    public void setNetworkStatus(boolean flag)
    {
        isFromNetwork = flag;
    }

    public void setStatus(com.skype.etMediaLinkResult etmedialinkresult)
    {
        status = etmedialinkresult;
    }

    public ()
    {
        isFromNetwork = false;
    }

    public isFromNetwork(Object obj, com.skype.etMediaLinkResult etmedialinkresult)
    {
        isFromNetwork = false;
        media = obj;
        status = etmedialinkresult;
    }
}
