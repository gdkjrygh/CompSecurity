// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.server:
//            am

public class UsersInviteParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    private final es a;
    private final String b;

    UsersInviteParams(Parcel parcel)
    {
        a = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
        b = parcel.readString();
    }

    public UsersInviteParams(es es1, String s)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (es1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (!es1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (s.length() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = es1;
        b = s;
    }

    public es a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(a);
        parcel.writeString(b);
    }

}
