// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            at

public class AmsEntityUpdateParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new at();
    final int a;
    private byte b;
    private final byte c;
    private final String d;

    AmsEntityUpdateParcelable(int i, byte byte0, byte byte1, String s)
    {
        b = byte0;
        a = i;
        c = byte1;
        d = s;
    }

    public final byte a()
    {
        return b;
    }

    public final byte b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AmsEntityUpdateParcelable)obj;
            if (b != ((AmsEntityUpdateParcelable) (obj)).b)
            {
                return false;
            }
            if (a != ((AmsEntityUpdateParcelable) (obj)).a)
            {
                return false;
            }
            if (c != ((AmsEntityUpdateParcelable) (obj)).c)
            {
                return false;
            }
            if (!d.equals(((AmsEntityUpdateParcelable) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((a * 31 + b) * 31 + c) * 31 + d.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("AmsEntityUpdateParcelable{mVersionCode=")).append(a).append(", mEntityId=").append(b).append(", mAttributeId=").append(c).append(", mValue='").append(d).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        at.a(this, parcel);
    }

}
