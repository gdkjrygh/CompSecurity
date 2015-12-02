// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.messages.model.threads:
//            g

public class ParticipantInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final UserKey a;
    private final String b;
    private final String c;

    private ParticipantInfo(Parcel parcel)
    {
        c = parcel.readString();
        b = parcel.readString();
        a = UserKey.a(parcel.readString());
    }

    ParticipantInfo(Parcel parcel, g g1)
    {
        this(parcel);
    }

    public ParticipantInfo(UserKey userkey, String s)
    {
        this(userkey, s, null);
    }

    public ParticipantInfo(UserKey userkey, String s, String s1)
    {
        Preconditions.checkNotNull(userkey);
        a = userkey;
        b = s;
        c = s1;
    }

    public String a()
    {
        return c;
    }

    public boolean b()
    {
        return a.a() == n.FACEBOOK;
    }

    public boolean c()
    {
        return a.a() == n.PHONE_NUMBER;
    }

    public String d()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public UserKey e()
    {
        return a;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/messages/model/threads/ParticipantInfo).add("userKey", a.c()).add("name", b).add("emailAddress", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(c);
        parcel.writeString(b);
        parcel.writeString(a.c());
    }

}
