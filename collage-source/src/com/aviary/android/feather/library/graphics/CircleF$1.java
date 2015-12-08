// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.library.graphics:
//            CircleF

static final class 
    implements android.os..Creator
{

    public CircleF a(Parcel parcel)
    {
        CircleF circlef = new CircleF();
        circlef.a(parcel);
        return circlef;
    }

    public CircleF[] a(int i)
    {
        return new CircleF[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
