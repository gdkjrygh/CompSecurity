// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//            cw, cu

public final class bI extends cw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cu();
    private boolean c;
    private String d;

    public bI(Parcel parcel)
    {
        super(parcel);
        d = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    public bI(String s, String s1, long l, boolean flag)
    {
        super.a = s;
        super.b = l;
        d = s1;
        c = flag;
    }

    public final boolean a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(com/paypal/android/sdk/bI.getSimpleName()).append("(mToken:").append(a).append(", mGoodUntil:").append(b).append(", isCreatedInternally:").append(c).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeLong(b);
        parcel.writeString(d);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

    static 
    {
        com/paypal/android/sdk/bI.getSimpleName();
    }
}
