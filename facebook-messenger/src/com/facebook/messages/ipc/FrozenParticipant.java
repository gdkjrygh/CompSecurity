// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.annotation.a;
import com.facebook.ipc.annotation.b;

// Referenced classes of package com.facebook.messages.ipc:
//            d

public class FrozenParticipant
    implements Parcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final String a;
    private final String b;

    public FrozenParticipant(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public void a(Parcel parcel, int i)
    {
        parcel.writeInt(1);
        parcel.writeString(a);
        parcel.writeString(b);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.facebook.ipc.annotation.b.a(parcel, i, this);
    }

}
