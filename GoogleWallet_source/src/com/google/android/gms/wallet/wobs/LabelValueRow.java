// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.a;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            c

public final class LabelValueRow
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    String aVL;
    String aVM;
    ArrayList aVN;
    private final int mVersionCode;

    LabelValueRow()
    {
        mVersionCode = 1;
        aVN = a.ji();
    }

    LabelValueRow(int i, String s, String s1, ArrayList arraylist)
    {
        mVersionCode = i;
        aVL = s;
        aVM = s1;
        aVN = arraylist;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.wobs.c.a(this, parcel, i);
    }

}
