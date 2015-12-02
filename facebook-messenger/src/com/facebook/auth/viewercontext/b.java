// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import android.os.Parcel;

// Referenced classes of package com.facebook.auth.viewercontext:
//            ViewerContext

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public ViewerContext a(Parcel parcel)
    {
        return new ViewerContext(parcel, null);
    }

    public ViewerContext[] a(int i)
    {
        return new ViewerContext[i];
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
