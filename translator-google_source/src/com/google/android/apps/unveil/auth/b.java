// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.auth;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.unveil.auth:
//            AuthToken

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = parcel.readString();
        parcel = parcel.readString();
        return new AuthToken(AuthToken.AuthTokenType.valueOf(s), parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AuthToken[i];
    }
}
