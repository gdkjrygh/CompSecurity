// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.zero.protocol:
//            b, a

public class b
    implements Parcelable
{

    public static final android.os.cMnc.MccMncPair.b CREATOR = new b();
    private final String a;
    private final String b;

    public String a()
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

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof b))
        {
            return false;
        }
        return a.equals(((a)obj).a()) && b.equals(((b)obj).b());
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }


    private (Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    b(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public <init>(String s, String s1)
    {
        a = s;
        b = s1;
    }
}
