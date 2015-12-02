// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.annotation.a;
import com.facebook.ipc.annotation.b;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.messages.ipc:
//            a

public class FrozenGroupMessageInfo
    implements Parcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new com.facebook.messages.ipc.a();
    private final int a;
    private final es b;
    private final String c;
    private final String d;

    public FrozenGroupMessageInfo(int i, es es1, String s, String s1)
    {
        a = i;
        b = (es)Preconditions.checkNotNull(es1);
        c = s;
        d = s1;
    }

    public void a(Parcel parcel, int i)
    {
        parcel.writeInt(1);
        parcel.writeInt(a);
        parcel.writeList(b);
        parcel.writeString(c);
        parcel.writeString(d);
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
