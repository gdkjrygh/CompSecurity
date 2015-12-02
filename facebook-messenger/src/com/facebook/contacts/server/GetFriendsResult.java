// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.user.User;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.server:
//            y

public class GetFriendsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    private final es a;
    private final boolean b;
    private final es c;
    private final String d;

    private GetFriendsResult(Parcel parcel)
    {
        super(parcel);
        a = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = es.a(parcel.createStringArrayList());
        d = parcel.readString();
    }

    GetFriendsResult(Parcel parcel, y y1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeList(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeList(c);
        parcel.writeString(d);
    }

}
