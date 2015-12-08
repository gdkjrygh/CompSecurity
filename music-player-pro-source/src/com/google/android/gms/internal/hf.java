// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hg

public class hf
    implements SafeParcelable
{

    public static final hg CREATOR = new hg();
    final int CK;
    final String CS;
    final String CT;
    final String CU;

    hf(int i, String s, String s1, String s2)
    {
        CK = i;
        CS = s;
        CT = s1;
        CU = s2;
    }

    public hf(String s, String s1, String s2)
    {
        this(1, s, s1, s2);
    }

    public int describeContents()
    {
        hg hg1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            CS, CT, CU
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hg hg1 = CREATOR;
        hg.a(this, parcel, i);
    }

}
