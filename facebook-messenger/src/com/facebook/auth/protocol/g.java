// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import android.os.Parcel;

// Referenced classes of package com.facebook.auth.protocol:
//            AuthenticationResultImpl, AuthenticationResult

final class g
    implements android.os.Parcelable.Creator
{

    g()
    {
    }

    public AuthenticationResult a(Parcel parcel)
    {
        return new AuthenticationResultImpl(parcel, null);
    }

    public AuthenticationResult[] a(int i)
    {
        return new AuthenticationResult[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
