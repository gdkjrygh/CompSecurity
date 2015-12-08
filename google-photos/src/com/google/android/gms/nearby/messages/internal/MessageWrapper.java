// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import b;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import lkt;

public class MessageWrapper
    implements SafeParcelable
{

    public static final lkt CREATOR = new lkt();
    public final int a;
    public final Message b;

    public MessageWrapper(int i, Message message)
    {
        a = i;
        b = (Message)b.d(message);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MessageWrapper))
        {
            return false;
        } else
        {
            obj = (MessageWrapper)obj;
            return c.b(b, ((MessageWrapper) (obj)).b);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lkt.a(this, parcel, i);
    }

}
