// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lmb;

public class ViewableItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lmb();
    public final int a;
    public String b[];

    private ViewableItem()
    {
        a = 1;
    }

    public ViewableItem(int i, String as[])
    {
        a = i;
        b = as;
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
        if (!(obj instanceof ViewableItem))
        {
            return false;
        } else
        {
            obj = (ViewableItem)obj;
            return c.b(b, ((ViewableItem) (obj)).b);
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
        return (new StringBuilder("ViewableItem[uris=")).append(Arrays.toString(b)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lmb.a(this, parcel);
    }

}
