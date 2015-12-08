// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Parcel;

// Referenced classes of package com.facebook:
//            AccessToken

static final class or
    implements android.os.ator
{

    public AccessToken createFromParcel(Parcel parcel)
    {
        return new AccessToken(parcel);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public AccessToken[] newArray(int i)
    {
        return new AccessToken[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    or()
    {
    }
}
