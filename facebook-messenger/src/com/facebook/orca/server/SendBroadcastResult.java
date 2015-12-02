// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.ev;

// Referenced classes of package com.facebook.orca.server:
//            av

public class SendBroadcastResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new av();
    private final ev a;
    private final es b;
    private final String c;
    private final int d;

    public SendBroadcastResult(Parcel parcel)
    {
        super(parcel);
        a = ev.a(parcel.readHashMap(com/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult.getClassLoader()));
        b = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        c = parcel.readString();
        d = parcel.readInt();
    }

    public SendBroadcastResult(b b1, long l, ev ev1, es es1, String s, int i)
    {
        super(b1, l);
        a = ev1;
        b = es1;
        c = s;
        d = i;
    }

    public ev a()
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

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeMap(a);
        parcel.writeList(b);
        parcel.writeString(c);
        parcel.writeInt(d);
    }

}
