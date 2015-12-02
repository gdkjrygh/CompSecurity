// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.mqtt.messages:
//            t

public class SubscribeTopic
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    private final String a;
    private final int b;

    public SubscribeTopic(String s, int i)
    {
        a = s;
        b = i;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
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
            obj = (SubscribeTopic)obj;
            if (b != ((SubscribeTopic) (obj)).b)
            {
                return false;
            }
            if (!Objects.equal(a, ((SubscribeTopic) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, Integer.valueOf(b)
        });
    }

    public String toString()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
    }

}
