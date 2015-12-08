// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.wearable.Channel;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            bb

public class ChannelImpl
    implements SafeParcelable, Channel
{

    public static final android.os.Parcelable.Creator CREATOR = new bb();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    ChannelImpl(int i, String s, String s1, String s2)
    {
        a = i;
        b = (String)y.a(s);
        c = (String)y.a(s1);
        d = (String)y.a(s2);
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return d;
    }

    public final String c()
    {
        return b;
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
            if (!b.equals(((ChannelImpl) (obj)).b) || !x.a(((ChannelImpl) (obj)).c, c) || !x.a(((ChannelImpl) (obj)).d, d) || ((ChannelImpl) (obj)).a != a)
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
        bb.a(this, parcel);
    }

}
