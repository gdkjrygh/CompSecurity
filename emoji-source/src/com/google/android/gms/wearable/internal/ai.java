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
    private final String Ln;
    private final String xG;
    final int xM;

    ai(int i, String s, String s1)
    {
        xM = i;
        xG = s;
        Ln = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ai)
        {
            if (((ai) (obj = (ai)obj)).xG.equals(xG) && ((ai) (obj)).Ln.equals(Ln))
            {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName()
    {
        return Ln;
    }

    public String getId()
    {
        return xG;
    }

    public int hashCode()
    {
        return (xG.hashCode() + 629) * 37 + Ln.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("NodeParcelable{").append(xG).append(",").append(Ln).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
