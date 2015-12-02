// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;

// Referenced classes of package com.facebook.orca.server:
//            d

public class ConfirmPhoneAndRegisterPartialAccountResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    private ConfirmPhoneAndRegisterPartialAccountResult(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        e = flag;
    }

    ConfirmPhoneAndRegisterPartialAccountResult(Parcel parcel, d d1)
    {
        this(parcel);
    }

    public ConfirmPhoneAndRegisterPartialAccountResult(b b1, String s, String s1, String s2, String s3, boolean flag, long l)
    {
        super(b1, l);
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = flag;
    }

    public String a()
    {
        return b;
    }

    public String b()
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
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
