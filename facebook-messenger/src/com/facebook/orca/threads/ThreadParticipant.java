// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.user.UserKey;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.threads:
//            o, p

public class ThreadParticipant
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    private final ParticipantInfo a;
    private final String b;
    private final NotificationSetting c;
    private final long d;
    private final String e;

    private ThreadParticipant(Parcel parcel)
    {
        a = (ParticipantInfo)parcel.readParcelable(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader());
        b = parcel.readString();
        c = (NotificationSetting)parcel.readParcelable(com/facebook/orca/notify/NotificationSetting.getClassLoader());
        d = parcel.readLong();
        e = parcel.readString();
    }

    ThreadParticipant(Parcel parcel, o o1)
    {
        this(parcel);
    }

    ThreadParticipant(p p1)
    {
        a = p1.a();
        b = p1.b();
        c = p1.c();
        d = p1.d();
        e = p1.e();
    }

    public ParticipantInfo a()
    {
        return a;
    }

    public boolean b()
    {
        return a.b();
    }

    public boolean c()
    {
        return a.c();
    }

    public UserKey d()
    {
        return a.e();
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return a.a();
    }

    public String f()
    {
        return a.d();
    }

    public String g()
    {
        return b;
    }

    public NotificationSetting h()
    {
        return c;
    }

    public long i()
    {
        return d;
    }

    public String j()
    {
        return e;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/orca/threads/ThreadParticipant).add("participantInfo", a).add("threadId", b).add("lastReadReceiptTimestampMs", Long.valueOf(d)).add("lastDeliveredReceiptMsgId", e).toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeParcelable(a, k);
        parcel.writeString(b);
        parcel.writeParcelable(c, k);
        parcel.writeLong(d);
        parcel.writeString(e);
    }

}
