// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            ScoredCandidate

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ScoredCandidate(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ScoredCandidate[i];
    }
}
