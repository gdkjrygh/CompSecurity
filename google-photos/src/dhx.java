// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class dhx
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dhy();
    public boolean a;
    public boolean b;

    public dhx()
    {
        a = true;
        b = true;
    }

    dhx(Parcel parcel)
    {
        a = b.c(parcel);
        b = b.c(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dhx)
        {
            obj = (dhx)obj;
            flag = flag1;
            if (b == ((dhx) (obj)).b)
            {
                flag = flag1;
                if (a == ((dhx) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(b, c.a(a, 17));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
        b.a(parcel, b);
    }

}
