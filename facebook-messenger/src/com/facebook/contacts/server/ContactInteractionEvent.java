// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.contacts.server:
//            b, c

public final class ContactInteractionEvent
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final c a;
    private final int b;
    private final es c;

    public ContactInteractionEvent(Parcel parcel)
    {
        a = (c)Enum.valueOf(com/facebook/contacts/server/c, parcel.readString());
        b = parcel.readInt();
        c = es.a(parcel.readArrayList(java/lang/Long.getClassLoader()));
    }

    public ContactInteractionEvent(c c1, int i, List list)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = c1;
        b = i;
        c = es.a(list);
    }

    public c a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public es c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" ").append(b).append(" events, type: ").append(a).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeInt(b);
        parcel.writeList(c);
    }

}
