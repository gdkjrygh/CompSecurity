// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.undo;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.undo:
//            ApplyShadowOp

static final class I
    implements android.os.or
{

    public ApplyShadowOp a(Parcel parcel)
    {
        return new ApplyShadowOp(parcel);
    }

    public ApplyShadowOp[] a(int i)
    {
        return new ApplyShadowOp[i];
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
