// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lgz;

public class ClientIdentity
    implements SafeParcelable
{

    public static final lgz CREATOR = new lgz();
    public final int a;
    public final int b;
    public final String c;

    public ClientIdentity(int i, int j, String s)
    {
        a = i;
        b = j;
        c = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || !(obj instanceof ClientIdentity))
            {
                return false;
            }
            obj = (ClientIdentity)obj;
            if (((ClientIdentity) (obj)).b != b || !c.b(((ClientIdentity) (obj)).c, c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b;
    }

    public String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(b), c
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lgz.a(this, parcel);
    }

}
