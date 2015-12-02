// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.auth.login:
//            AuthFragmentConfig

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public AuthFragmentConfig a(Parcel parcel)
    {
        try
        {
            parcel = new AuthFragmentConfig(parcel, null);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return null;
        }
        return parcel;
    }

    public AuthFragmentConfig[] a(int i)
    {
        return new AuthFragmentConfig[i];
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
