// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import bph;
import bpp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class ApplicationStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bph();
    public final int a;
    public String b;

    public ApplicationStatus()
    {
        this(1, null);
    }

    public ApplicationStatus(int i, String s)
    {
        a = i;
        b = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ApplicationStatus))
        {
            return false;
        } else
        {
            obj = (ApplicationStatus)obj;
            return bpp.a(b, ((ApplicationStatus) (obj)).b);
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
        bph.a(this, parcel);
    }

}
