// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.rewrite;

import android.os.Parcel;

// Referenced classes of package com.facebook.zero.rewrite:
//            ZeroUrlRewriteRule

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public ZeroUrlRewriteRule a(Parcel parcel)
    {
        return new ZeroUrlRewriteRule(parcel, null);
    }

    public ZeroUrlRewriteRule[] a(int i)
    {
        return new ZeroUrlRewriteRule[i];
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
