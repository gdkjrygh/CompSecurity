// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.login:
//            LoginClient

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public LoginClient a(Parcel parcel)
    {
        return new LoginClient(parcel);
    }

    public LoginClient[] a(int i)
    {
        return new LoginClient[i];
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
