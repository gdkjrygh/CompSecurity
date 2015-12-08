// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//            g

public class f
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private String a;

    public f(Parcel parcel)
    {
        a = parcel.readString();
    }

    public f(String s)
    {
        if (!s.equals("OTHER") && s.length() != 2)
        {
            a = "US";
            return;
        } else
        {
            a = s;
            return;
        }
    }

    public final String a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (f)obj;
                    return a.equals(((f) (obj)).a);
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
