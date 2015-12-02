// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.messages.model.threads.Message;

// Referenced classes of package com.facebook.orca.server:
//            n

public class FetchMessageResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    private final Message a;

    private FetchMessageResult(Parcel parcel)
    {
        super(parcel);
        a = (Message)parcel.readParcelable(com/facebook/messages/model/threads/Message.getClassLoader());
    }

    FetchMessageResult(Parcel parcel, n n1)
    {
        this(parcel);
    }

    public FetchMessageResult(b b, Message message, long l)
    {
        super(b, l);
        a = message;
    }

    public Message a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(a, i);
    }

}
