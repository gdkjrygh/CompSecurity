// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gsf:
//            a

public class GoogleLoginCredentialsResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private String a;
    private String b;
    private Intent c;

    public GoogleLoginCredentialsResult()
    {
        b = null;
        c = null;
        a = null;
    }

    GoogleLoginCredentialsResult(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        int i = parcel.readInt();
        c = null;
        if (i == 1)
        {
            c = new Intent();
            c.readFromParcel(parcel);
            c.setExtrasClassLoader(getClass().getClassLoader());
        }
    }

    public int describeContents()
    {
        if (c != null)
        {
            return c.describeContents();
        } else
        {
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        if (c != null)
        {
            parcel.writeInt(1);
            c.writeToParcel(parcel, 0);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }

}
