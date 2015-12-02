// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.ev;
import java.util.Map;

// Referenced classes of package com.facebook.user:
//            g

public class MobileAppData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final ev a;
    private final ev b;
    private final ev c;

    public MobileAppData(Parcel parcel)
    {
        a = ev.a((Map)parcel.readSerializable());
        b = ev.a((Map)parcel.readSerializable());
        c = ev.a((Map)parcel.readSerializable());
    }

    public MobileAppData(ev ev1, ev ev2, ev ev3)
    {
        a = ev1;
        b = ev2;
        c = ev3;
    }

    public ev a()
    {
        return a;
    }

    public Boolean a(Long long1)
    {
        if (!b.containsKey(long1))
        {
            return Boolean.valueOf(false);
        } else
        {
            return (Boolean)b.get(long1);
        }
    }

    public ev b()
    {
        return b;
    }

    public ev c()
    {
        return c;
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
            obj = (MobileAppData)obj;
            if (!a.equals(((MobileAppData) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((MobileAppData) (obj)).b))
            {
                return false;
            }
            if (!c.equals(((MobileAppData) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        parcel.writeSerializable(b);
        parcel.writeSerializable(c);
    }

}
