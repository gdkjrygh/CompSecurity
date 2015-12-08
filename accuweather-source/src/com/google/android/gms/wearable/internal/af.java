// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ag

public class af
    implements SafeParcelable, MessageEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new ag();
    private final byte TC[];
    private final String alS;
    private final String alT;
    private final int qX;
    final int xJ;

    af(int i, int j, String s, byte abyte0[], String s1)
    {
        xJ = i;
        qX = j;
        alS = s;
        TC = abyte0;
        alT = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return TC;
    }

    public String getPath()
    {
        return alS;
    }

    public int getRequestId()
    {
        return qX;
    }

    public String getSourceNodeId()
    {
        return alT;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(qX).append(",").append(alS).append(", size=");
        Object obj;
        if (TC == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(TC.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ag.a(this, parcel, i);
    }

}
