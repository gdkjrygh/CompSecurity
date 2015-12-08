// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hh

public class hg
    implements SafeParcelable
{

    public static final hh CREATOR = new hh();
    final int BR;
    final String BZ;
    final String Ca;
    final String Cb;

    hg(int i, String s, String s1, String s2)
    {
        BR = i;
        BZ = s;
        Ca = s1;
        Cb = s2;
    }

    public hg(String s, String s1, String s2)
    {
        this(1, s, s1, s2);
    }

    public int describeContents()
    {
        hh hh1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[] {
            BZ, Ca, Cb
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hh hh1 = CREATOR;
        hh.a(this, parcel, i);
    }

}
