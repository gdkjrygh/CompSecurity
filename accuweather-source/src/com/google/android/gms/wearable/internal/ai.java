// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aj

public class ai
    implements SafeParcelable, Node
{

    public static final android.os.Parcelable.Creator CREATOR = new aj();
    private final String Lk;
    private final String xD;
    final int xJ;

    ai(int i, String s, String s1)
    {
        xJ = i;
        xD = s;
        Lk = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ai)
        {
            if (((ai) (obj = (ai)obj)).xD.equals(xD) && ((ai) (obj)).Lk.equals(Lk))
            {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName()
    {
        return Lk;
    }

    public String getId()
    {
        return xD;
    }

    public int hashCode()
    {
        return (xD.hashCode() + 629) * 37 + Lk.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("NodeParcelable{").append(xD).append(",").append(Lk).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
