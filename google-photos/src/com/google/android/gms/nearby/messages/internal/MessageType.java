// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lks;

public class MessageType
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lks();
    public final int a;
    public final String b;
    public final String c;

    public MessageType(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public MessageType(String s, String s1)
    {
        this(1, s, s1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MessageType))
            {
                return false;
            }
            obj = (MessageType)obj;
            if (!c.b(b, ((MessageType) (obj)).b) || !c.b(c, ((MessageType) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c
        });
    }

    public String toString()
    {
        return (new StringBuilder("namespace=")).append(b).append(", type=").append(c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lks.a(this, parcel);
    }

}
