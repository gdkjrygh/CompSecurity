// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            Trackable

public class TrackableObject
    implements Trackable
{

    private final int listPos;
    private final String reqId;
    private final int trackId;

    public TrackableObject(String s, int i, int j)
    {
        reqId = s;
        trackId = i;
        listPos = j;
    }

    public int getListPos()
    {
        return listPos;
    }

    public String getRequestId()
    {
        return reqId;
    }

    public int getTrackId()
    {
        return trackId;
    }
}
