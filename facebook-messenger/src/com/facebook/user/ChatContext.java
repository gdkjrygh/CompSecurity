// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.user:
//            b, d, c

public class ChatContext
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final d b;
    private final float c;

    private ChatContext(Parcel parcel)
    {
        a = parcel.readString();
        b = d.valueOf(parcel.readString());
        c = parcel.readFloat();
    }

    ChatContext(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public ChatContext(String s, d d1, float f)
    {
        a = s;
        b = d1;
        c = f;
    }

    public boolean a()
    {
        switch (c.a[b.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public float getDistanceMeters()
    {
        return c;
    }

    public String getSubtext()
    {
        return a;
    }

    public d getType()
    {
        return b;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("type", b).add("subtext", a).add("distance", Float.valueOf(c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b.name());
        parcel.writeFloat(c);
    }

}
