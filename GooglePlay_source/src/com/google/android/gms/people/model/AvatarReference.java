// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.model:
//            ParcelableAvatarReference

public final class AvatarReference
    implements SafeParcelable
{

    public static final ParcelableAvatarReference CREATOR = new ParcelableAvatarReference();
    final String mLocation;
    final int mSource;
    final int mVersionCode;

    AvatarReference(int i, int j, String s)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mVersionCode = i;
        mSource = j;
        mLocation = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("source", Integer.valueOf(mSource)).add("location", mLocation).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ParcelableAvatarReference.writeToParcel$f2d72cc(this, parcel);
    }

}
