// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.push.c2dm:
//            ab, z

public class RegisterPushTokenParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    private final z a;
    private final String b;
    private final String c;
    private final boolean d;
    private final int e;
    private final int f;

    private RegisterPushTokenParams(Parcel parcel)
    {
        a = (z)parcel.readSerializable();
        b = parcel.readString();
        c = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = parcel.readInt();
        f = parcel.readInt();
    }

    RegisterPushTokenParams(Parcel parcel, ab ab1)
    {
        this(parcel);
    }

    public RegisterPushTokenParams(z z1, String s, String s1, boolean flag, int i, int j)
    {
        a = z1;
        b = s;
        c = s1;
        d = flag;
        e = i;
        f = j;
    }

    public z a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        parcel.writeString(b);
        parcel.writeString(c);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(e);
        parcel.writeInt(f);
    }

}
