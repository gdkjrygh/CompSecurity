// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.connection:
//            AppMetadataCreator

public final class AppMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AppMetadataCreator();
    final List mAppIdentifiers;
    final int mVersionCode;

    AppMetadata(int i, List list)
    {
        mVersionCode = i;
        mAppIdentifiers = (List)Preconditions.checkNotNull(list, "Must specify application identifiers");
        if (list.size() == 0)
        {
            throw new IllegalArgumentException(String.valueOf("Application identifiers cannot be empty"));
        } else
        {
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppMetadataCreator.writeToParcel$7beaba8b(this, parcel);
    }

}
