// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.f;

// Referenced classes of package com.google.android.gms.internal:
//            kl

public class kk
    implements SafeParcelable, f
{

    public static final android.os.Parcelable.Creator CREATOR = new kl();
    private final String HA;
    private final String wp;
    final int xH;

    kk(int i, String s, String s1)
    {
        xH = i;
        wp = s;
        HA = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof kk)
        {
            if (((kk) (obj = (kk)obj)).wp.equals(wp) && ((kk) (obj)).HA.equals(HA))
            {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName()
    {
        return HA;
    }

    public String getId()
    {
        return wp;
    }

    public int hashCode()
    {
        return (wp.hashCode() + 629) * 37 + HA.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("NodeParcelable{").append(wp).append(",").append(HA).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kl.a(this, parcel, i);
    }

}
