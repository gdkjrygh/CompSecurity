// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.people.identity.models.AvatarRef;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultAvatarRefImplCreator

public final class DefaultAvatarRefImpl
    implements SafeParcelable, AvatarRef
{

    public static final DefaultAvatarRefImplCreator CREATOR = new DefaultAvatarRefImplCreator();
    String mUrl;
    final int mVersionCode;

    DefaultAvatarRefImpl(int i, String s)
    {
        mVersionCode = i;
        mUrl = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultAvatarRefImplCreator.writeToParcel$4ae70e9b(this, parcel);
    }

}
