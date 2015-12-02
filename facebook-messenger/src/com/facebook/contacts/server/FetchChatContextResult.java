// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.user.ChatContext;
import com.google.common.a.ev;

// Referenced classes of package com.facebook.contacts.server:
//            j

public class FetchChatContextResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    private final ev a;

    private FetchChatContextResult(Parcel parcel)
    {
        super(parcel);
        a = ev.a(parcel.readHashMap(com/facebook/user/ChatContext.getClassLoader()));
    }

    FetchChatContextResult(Parcel parcel, j j1)
    {
        this(parcel);
    }

    public FetchChatContextResult(b b, long l, ev ev1)
    {
        super(b, l);
        a = ev1;
    }

    public ev a()
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
        parcel.writeMap(a);
    }

}
