// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;
import com.netflix.mediaclient.servicemgr.Trackable;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            ListSummary

public class TrackableListSummary extends ListSummary
    implements Trackable
{

    private int listPos;
    private String requestId;
    private int trackId;

    protected TrackableListSummary(int i, int j, int k, String s)
    {
        super(i);
        trackId = j;
        listPos = k;
        requestId = s;
    }

    protected TrackableListSummary(Parcel parcel)
    {
        super(parcel);
        trackId = parcel.readInt();
        listPos = parcel.readInt();
        requestId = parcel.readString();
    }

    public int getListPos()
    {
        return listPos;
    }

    public String getRequestId()
    {
        return requestId;
    }

    public int getTrackId()
    {
        return trackId;
    }

    public void setListPos(int i)
    {
        listPos = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TrackableListSummary [trackId=").append(trackId).append(", listPos=").append(listPos).append(", requestId=").append(requestId).append("]").toString();
    }

    protected void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(trackId);
        parcel.writeInt(listPos);
        parcel.writeString(requestId);
    }
}
