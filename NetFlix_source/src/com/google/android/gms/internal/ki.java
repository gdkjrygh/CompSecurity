// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.e;

// Referenced classes of package com.google.android.gms.internal:
//            kj

public class ki
    implements SafeParcelable, e
{

    public static final android.os.Parcelable.Creator CREATOR = new kj();
    private final int Eu;
    private final byte Nf[];
    private final String adF;
    private final String adG;
    final int xH;

    ki(int i, int j, String s, byte abyte0[], String s1)
    {
        xH = i;
        Eu = j;
        adF = s;
        Nf = abyte0;
        adG = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int fA()
    {
        return Eu;
    }

    public byte[] getData()
    {
        return Nf;
    }

    public String getPath()
    {
        return adF;
    }

    public String getSource()
    {
        return adG;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(Eu).append(",").append(adF);
        Object obj;
        if (Nf == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(Nf.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kj.a(this, parcel, i);
    }

}
