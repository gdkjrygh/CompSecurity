// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.people.identity.models.PersonRef;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultPersonRefImplCreator, DefaultAvatarRefImpl

public class DefaultPersonRefImpl
    implements SafeParcelable, PersonRef
{

    public static final DefaultPersonRefImplCreator CREATOR = new DefaultPersonRefImplCreator();
    DefaultAvatarRefImpl mAvatar;
    String mName;
    String mQualifiedId;
    final int mVersionCode;

    DefaultPersonRefImpl(int i, String s, String s1, DefaultAvatarRefImpl defaultavatarrefimpl)
    {
        mVersionCode = i;
        mName = s;
        mQualifiedId = s1;
        mAvatar = defaultavatarrefimpl;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonRefImplCreator.writeToParcel(this, parcel, i);
    }

}
