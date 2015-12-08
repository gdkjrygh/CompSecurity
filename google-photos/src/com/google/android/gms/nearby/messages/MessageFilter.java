// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import b;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lkg;
import llc;

public class MessageFilter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new llc();
    public final int a;
    public final List b;

    public MessageFilter(int i, List list)
    {
        a = i;
        b = Collections.unmodifiableList((List)b.d(list));
    }

    MessageFilter(List list)
    {
        this(1, list);
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
        if (!(obj instanceof MessageFilter))
        {
            return false;
        } else
        {
            obj = (MessageFilter)obj;
            return c.b(b, ((MessageFilter) (obj)).b);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b
        });
    }

    public String toString()
    {
        return (new StringBuilder("MessageFilter")).append(b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        llc.a(this, parcel);
    }

    static 
    {
        lkg lkg1 = new lkg();
        lkg1.a.add(new MessageType("", ""));
        boolean flag;
        if (!lkg1.a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "At least one of the include methods must be called.");
        new MessageFilter(lkg1.a);
    }
}
