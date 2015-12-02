// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.json.jsonmirror.JMStaticKeysDictDestination;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.zero.ui:
//            g

public class CarrierBottomBannerData
    implements Parcelable, JMStaticKeysDictDestination
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public CarrierBottomBannerData()
    {
        this(null, null, null, null, null);
    }

    private CarrierBottomBannerData(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
    }

    CarrierBottomBannerData(Parcel parcel, g g1)
    {
        this(parcel);
    }

    public CarrierBottomBannerData(String s, String s1, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof CarrierBottomBannerData)
        {
            if (a.equals(((CarrierBottomBannerData) (obj = (CarrierBottomBannerData)obj)).a) && b.equals(((CarrierBottomBannerData) (obj)).b) && c.equals(((CarrierBottomBannerData) (obj)).c) && d.equals(((CarrierBottomBannerData) (obj)).d) && e.equals(((CarrierBottomBannerData) (obj)).e))
            {
                return true;
            }
        }
        return false;
    }

    public String getActionTitle()
    {
        return d;
    }

    public String getActionUrl()
    {
        return e;
    }

    public String getContent()
    {
        return c;
    }

    public String getId()
    {
        return a;
    }

    public String getTitle()
    {
        return b;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            b, c, d, e
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
    }

}
