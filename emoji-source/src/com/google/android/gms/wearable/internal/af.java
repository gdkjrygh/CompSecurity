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
    private final byte TF[];
    private final String alV;
    private final String alW;
    private final int ra;
    final int xM;

    af(int i, int j, String s, byte abyte0[], String s1)
    {
        xM = i;
        ra = j;
        alV = s;
        TF = abyte0;
        alW = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return TF;
    }

    public String getPath()
    {
        return alV;
    }

    public int getRequestId()
    {
        return ra;
    }

    public String getSourceNodeId()
    {
        return alW;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(ra).append(",").append(alV).append(", size=");
        Object obj;
        if (TF == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(TF.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ag.a(this, parcel, i);
    }

}
