// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            CorrectionSpan

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new CorrectionSpan(parcel.readString());
    }

    public final Object[] newArray(int i)
    {
        return new CorrectionSpan[i];
    }
}
