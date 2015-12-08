// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.wearable.Channel;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            bd

public class ChannelImpl
    implements SafeParcelable, Channel
{

    public static final android.os.Parcelable.Creator CREATOR = new bd();
    final int a;
    final String b;
    final String c;
    final String d;

    ChannelImpl(int i, String s, String s1, String s2)
    {
        a = i;
        b = (String)u.a(s);
        c = (String)u.a(s1);
        d = (String)u.a(s2);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ChannelImpl))
            {
                return false;
            }
            obj = (ChannelImpl)obj;
            if (!b.equals(((ChannelImpl) (obj)).b) || !t.a(((ChannelImpl) (obj)).c, c) || !t.a(((ChannelImpl) (obj)).d, d) || ((ChannelImpl) (obj)).a != a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("ChannelImpl{versionCode=")).append(a).append(", token='").append(b).append('\'').append(", nodeId='").append(c).append('\'').append(", path='").append(d).append('\'').append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bd.a(this, parcel);
    }

}
