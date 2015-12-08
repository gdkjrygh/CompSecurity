// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ht

public class hs
    implements SafeParcelable
{

    public static final ht CREATOR = new ht();
    public final String GQ;
    public final int GR;
    final int xJ;

    public hs(int i, String s, int j)
    {
        xJ = i;
        GQ = s;
        GR = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ht.a(this, parcel, i);
    }

}
