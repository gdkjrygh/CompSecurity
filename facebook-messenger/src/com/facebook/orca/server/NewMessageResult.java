// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.threads.MessagesCollection;

// Referenced classes of package com.facebook.orca.server:
//            ap

public class NewMessageResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ap();
    private final String a;
    private final Message b;
    private final MessagesCollection c;

    private NewMessageResult(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
        b = (Message)parcel.readParcelable(com/facebook/messages/model/threads/Message.getClassLoader());
        c = (MessagesCollection)parcel.readParcelable(com/facebook/orca/threads/MessagesCollection.getClassLoader());
    }

    NewMessageResult(Parcel parcel, ap ap1)
    {
        this(parcel);
    }

    public NewMessageResult(b b1, String s, Message message, MessagesCollection messagescollection, long l)
    {
        super(b1, l);
        a = s;
        b = message;
        c = messagescollection;
    }

    public String a()
    {
        return a;
    }

    public Message b()
    {
        return b;
    }

    public MessagesCollection c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
