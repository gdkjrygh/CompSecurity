// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hs

public class hr
    implements SafeParcelable
{

    public static final hs CREATOR = new hs();
    public final String GT;
    public final int GU;
    final int xM;

    public hr(int i, String s, int j)
    {
        xM = i;
        GT = s;
        GU = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hs.a(this, parcel, i);
    }

}
