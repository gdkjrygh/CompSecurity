// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

// Referenced classes of package com.amazon.device.associates:
//            ae

public class RequestId
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    private final String a;

    RequestId()
    {
        a = UUID.randomUUID().toString();
    }

    private RequestId(Parcel parcel)
    {
        a = parcel.readString();
    }

    RequestId(Parcel parcel, ae ae1)
    {
        this(parcel);
    }

    private RequestId(String s)
    {
        a = s;
    }

    static RequestId a(String s)
    {
        return new RequestId(s);
    }

    public int describeContents()
    {
        return hashCode();
    }

    public boolean equals(Object obj)
    {
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return a.equals(((RequestId)obj).a);
        }
    }

    public String toString()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }


    // Unreferenced inner class com/amazon/device/associates/ae
    static final class ae
        implements android.os.Parcelable.Creator
    {

        public RequestId a(Parcel parcel)
        {
            return new RequestId(parcel, null);
        }

        public RequestId[] a(int i)
        {
            return new RequestId[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            ae()
            {
            }
    }

}
