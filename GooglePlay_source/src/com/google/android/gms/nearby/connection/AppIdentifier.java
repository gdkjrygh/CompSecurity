// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.connection:
//            AppIdentifierCreator

public final class AppIdentifier
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AppIdentifierCreator();
    final String mIdentifier;
    final int mVersionCode;

    AppIdentifier(int i, String s)
    {
        mVersionCode = i;
        mIdentifier = Preconditions.checkNotEmpty(s, "Missing application identifier value");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppIdentifierCreator.writeToParcel$1ae2a13b(this, parcel);
    }

}
