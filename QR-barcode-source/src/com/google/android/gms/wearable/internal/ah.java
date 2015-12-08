// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ai

public class ah
    implements SafeParcelable, MessageEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    final int BR;
    private final byte acH[];
    private final String avH;
    private final String avI;
    private final int uQ;

    ah(int i, int j, String s, byte abyte0[], String s1)
    {
        BR = i;
        uQ = j;
        avH = s;
        acH = abyte0;
        avI = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return acH;
    }

    public String getPath()
    {
        return avH;
    }

    public int getRequestId()
    {
        return uQ;
    }

    public String getSourceNodeId()
    {
        return avI;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(uQ).append(",").append(avH).append(", size=");
        Object obj;
        if (acH == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(acH.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai.a(this, parcel, i);
    }

}
