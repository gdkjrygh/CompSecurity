// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            am

public class al
    implements SafeParcelable, Node
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    private final String CE;
    final int CK;
    private final String OS;

    al(int i, String s, String s1)
    {
        CK = i;
        CE = s;
        OS = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof al)
        {
            if (((al) (obj = (al)obj)).CE.equals(CE) && ((al) (obj)).OS.equals(OS))
            {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName()
    {
        return OS;
    }

    public String getId()
    {
        return CE;
    }

    public int hashCode()
    {
        return (CE.hashCode() + 629) * 37 + OS.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("NodeParcelable{").append(CE).append(",").append(OS).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        am.a(this, parcel, i);
    }

}
