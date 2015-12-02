// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.google.common.base.Objects;
import java.util.Comparator;

// Referenced classes of package com.facebook.orca.threadview:
//            ag, ah

public class RowReceiptParticipant
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ah();
    public static final Comparator a = new ag();
    private final ParticipantInfo b;
    private final long c;

    public RowReceiptParticipant(Parcel parcel)
    {
        b = (ParticipantInfo)parcel.readValue(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader());
        c = parcel.readLong();
    }

    public RowReceiptParticipant(ParticipantInfo participantinfo, long l)
    {
        b = participantinfo;
        c = l;
    }

    public ParticipantInfo a()
    {
        return b;
    }

    public long b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/orca/threadview/RowReceiptParticipant).add("participantInfo", b).add("readTimestampMs", Long.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeLong(c);
    }

}
