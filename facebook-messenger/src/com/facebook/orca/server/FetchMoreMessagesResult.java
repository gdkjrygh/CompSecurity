// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.threads.MessagesCollection;

// Referenced classes of package com.facebook.orca.server:
//            p

public class FetchMoreMessagesResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    public static final FetchMoreMessagesResult a;
    private final MessagesCollection b;

    private FetchMoreMessagesResult(Parcel parcel)
    {
        super(parcel);
        b = (MessagesCollection)parcel.readParcelable(com/facebook/orca/threads/MessagesCollection.getClassLoader());
    }

    FetchMoreMessagesResult(Parcel parcel, p p1)
    {
        this(parcel);
    }

    public FetchMoreMessagesResult(b b1, MessagesCollection messagescollection, long l)
    {
        super(b1, l);
        b = messagescollection;
    }

    public MessagesCollection a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(b, i);
    }

    static 
    {
        a = new FetchMoreMessagesResult(b.NO_DATA, null, -1L);
    }
}
