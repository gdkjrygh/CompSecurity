// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.server:
//            aw

public class SendMessageByRecipientsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aw();
    private final String a;
    private final Message b;
    private final es c;

    public SendMessageByRecipientsParams(Parcel parcel)
    {
        a = parcel.readString();
        b = (Message)parcel.readParcelable(com/facebook/messages/model/threads/Message.getClassLoader());
        c = es.a(parcel.readArrayList(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader()));
    }

    public SendMessageByRecipientsParams(String s, Message message, List list)
    {
        a = s;
        b = message;
        c = es.a(list);
    }

    public Message a()
    {
        return b;
    }

    public String b()
    {
        return a;
    }

    public boolean c()
    {
        return a != null;
    }

    public es d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeList(c);
    }

}
