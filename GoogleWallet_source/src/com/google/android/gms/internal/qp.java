// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            qq

public final class qp
    implements SafeParcelable
{

    public static final qq CREATOR = new qq();
    private final String Fl;
    private final String aBg;
    private final int mVersionCode;

    qp(int i, String s, String s1)
    {
        mVersionCode = i;
        Fl = s;
        aBg = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getAccountName()
    {
        return Fl;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final String qD()
    {
        return aBg;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        qq.a(this, parcel, i);
    }

}
