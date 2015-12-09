// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class CheckInResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private List messages;

    public CheckInResponse()
    {
    }

    protected CheckInResponse(Parcel parcel)
    {
        messages = new ArrayList();
        parcel.readList(messages, java/util/List.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public List getMessages()
    {
        return messages;
    }

    public void setMessages(List list)
    {
        messages = list;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(messages);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CheckInResponse createFromParcel(Parcel parcel)
        {
            return new CheckInResponse(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CheckInResponse[] newArray(int i)
        {
            return new CheckInResponse[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
