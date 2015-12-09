// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.os.Parcel;
import com.netflix.mediaclient.servicemgr.Trackable;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            PlayContext

public class PlayContextImp
    implements PlayContext
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PlayContextImp createFromParcel(Parcel parcel)
        {
            return new PlayContextImp(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PlayContextImp[] newArray(int i)
        {
            return new PlayContextImp[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final int listPos;
    private final String requestId;
    private final int trackId;
    private final int videoPos;

    PlayContextImp()
    {
        this("", -1, -1, -1);
    }

    public PlayContextImp(Parcel parcel)
    {
        this(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public PlayContextImp(Trackable trackable, int i)
    {
        this(trackable.getRequestId(), trackable.getTrackId(), trackable.getListPos(), i);
    }

    public PlayContextImp(String s, int i, int j, int k)
    {
        requestId = s;
        trackId = i;
        listPos = j;
        videoPos = k;
    }

    public int describeContents()
    {
        return 0;
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

    public int getVideoPos()
    {
        return videoPos;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayContextImp [requestId=").append(requestId).append(", trackId=").append(trackId).append(", listPos=").append(listPos).append(", videoPos=").append(videoPos).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(requestId);
        parcel.writeInt(trackId);
        parcel.writeInt(listPos);
        parcel.writeInt(videoPos);
    }

}
