// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            a

public final class CopresenceApiOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final CopresenceApiOptions a = new CopresenceApiOptions();
    final int b;
    public final boolean c;
    public final String d;

    private CopresenceApiOptions()
    {
        this(1, true, null);
    }

    CopresenceApiOptions(int i, boolean flag, String s)
    {
        b = i;
        c = flag;
        d = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.copresence.internal.a.a(this, parcel);
    }

}
