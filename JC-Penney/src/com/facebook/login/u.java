// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.login:
//            WebViewLoginMethodHandler

final class u
    implements android.os.Parcelable.Creator
{

    u()
    {
    }

    public WebViewLoginMethodHandler a(Parcel parcel)
    {
        return new WebViewLoginMethodHandler(parcel);
    }

    public WebViewLoginMethodHandler[] a(int i)
    {
        return new WebViewLoginMethodHandler[i];
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
