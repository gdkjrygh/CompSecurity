// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.fi;

// Referenced classes of package com.facebook.orca.server:
//            e

public class DeleteMessagesParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final String a;
    private final fi b;

    DeleteMessagesParams(Parcel parcel)
    {
        a = parcel.readString();
        b = fi.a(parcel.createStringArrayList());
    }

    public DeleteMessagesParams(String s, fi fi1)
    {
        a = s;
        b = fi1;
    }

    public String a()
    {
        return a;
    }

    public fi b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeList(b.h());
    }

}
