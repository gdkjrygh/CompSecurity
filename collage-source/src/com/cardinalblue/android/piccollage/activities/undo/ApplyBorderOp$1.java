// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.undo;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.undo:
//            ApplyBorderOp

static final class I
    implements android.os.or
{

    public ApplyBorderOp a(Parcel parcel)
    {
        return new ApplyBorderOp(parcel);
    }

    public ApplyBorderOp[] a(int i)
    {
        return new ApplyBorderOp[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    I()
    {
    }
}
