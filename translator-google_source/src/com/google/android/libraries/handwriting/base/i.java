// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            Stroke

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new Stroke(parcel);
    }

    public final Object[] newArray(int j)
    {
        return new Stroke[j];
    }
}
