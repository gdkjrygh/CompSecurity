// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            al

public class ak
    implements SafeParcelable, Node
{

    public static final android.os.Parcelable.Creator CREATOR = new al();
    private final String BL;
    final int BR;
    private final String NH;

    ak(int i, String s, String s1)
    {
        BR = i;
        BL = s;
        NH = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ak)
        {
            if (((ak) (obj = (ak)obj)).BL.equals(BL) && ((ak) (obj)).NH.equals(NH))
            {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName()
    {
        return NH;
    }

    public String getId()
    {
        return BL;
    }

    public int hashCode()
    {
        return (BL.hashCode() + 629) * 37 + NH.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("NodeParcelable{").append(BL).append(",").append(NH).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        al.a(this, parcel, i);
    }

}
