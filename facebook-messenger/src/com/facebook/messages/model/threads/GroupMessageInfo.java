// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.messages.model.threads:
//            a, ParticipantInfo

public class GroupMessageInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final es b;
    private final String c;
    private final String d;

    public GroupMessageInfo(int i, es es1, String s, String s1)
    {
        a = i;
        b = (es)Preconditions.checkNotNull(es1);
        c = s;
        d = s1;
    }

    private GroupMessageInfo(Parcel parcel)
    {
        a = parcel.readInt();
        b = es.a(parcel.readArrayList(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader()));
        c = parcel.readString();
        d = parcel.readString();
    }

    GroupMessageInfo(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public int a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeList(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
