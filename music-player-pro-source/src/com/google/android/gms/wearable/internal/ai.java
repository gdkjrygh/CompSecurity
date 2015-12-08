// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aj

public class ai
    implements SafeParcelable, MessageEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new aj();
    final int CK;
    private final byte aeA[];
    private final String ahy;
    private final String axW;
    private final int ve;

    ai(int i, int j, String s, byte abyte0[], String s1)
    {
        CK = i;
        ve = j;
        axW = s;
        aeA = abyte0;
        ahy = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return aeA;
    }

    public String getPath()
    {
        return axW;
    }

    public int getRequestId()
    {
        return ve;
    }

    public String getSourceNodeId()
    {
        return ahy;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(ve).append(",").append(axW).append(", size=");
        Object obj;
        if (aeA == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(aeA.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
