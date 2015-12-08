// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class njy
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new njz();
    final long a;
    private final String b;

    njy(Parcel parcel)
    {
        b = parcel.readString();
        a = parcel.readLong();
    }

    public njy(String s, long l)
    {
        b = s;
        a = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof njy)
        {
            obj = (njy)obj;
            flag = flag1;
            if (a == ((njy) (obj)).a)
            {
                flag = flag1;
                if (TextUtils.equals(b, ((njy) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int j = (int)(a ^ a >>> 32);
        int i = j;
        if (b != null)
        {
            i = j ^ b.hashCode();
        }
        return i;
    }

    public final String toString()
    {
        String s = b;
        long l = a;
        return (new StringBuilder(String.valueOf(s).length() + 26)).append("g-").append(s).append(", p-").append(l).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeLong(a);
    }

}
