// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.contacts.server:
//            ac, ad, ContactInteractionEvent

public class UploadBulkContactChange
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ac();
    private final String a;
    private final User b;
    private final ad c;
    private final es d;

    public UploadBulkContactChange(Parcel parcel)
    {
        a = parcel.readString();
        b = (User)parcel.readParcelable(com/facebook/user/User.getClassLoader());
        c = (ad)Enum.valueOf(com/facebook/contacts/server/ad, parcel.readString());
        d = es.a(parcel.readArrayList(com/facebook/contacts/server/ContactInteractionEvent.getClassLoader()));
    }

    public UploadBulkContactChange(String s, User user, ad ad1, List list)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (user != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (ad1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (list != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = s;
        b = user;
        c = ad1;
        d = es.a(list);
    }

    public String a()
    {
        return a;
    }

    public User b()
    {
        return b;
    }

    public ad c()
    {
        return c;
    }

    public es d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeString(c.toString());
        parcel.writeList(d);
    }

}
