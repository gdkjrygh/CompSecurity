// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import android.os.Parcel;
import b;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kct;
import lnp;

public final class AvatarReference
    implements SafeParcelable
{

    public static final lnp CREATOR = new lnp();
    public final int a;
    public final int b;
    public final String c;

    public AvatarReference(int i, int j, String s)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag);
        a = i;
        b = j;
        c = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return c.b(this).a("source", Integer.valueOf(b)).a("location", c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lnp.a(this, parcel);
    }

}
