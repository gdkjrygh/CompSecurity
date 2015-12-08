// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.kik;

import android.os.Parcel;

// Referenced classes of package com.kik.cards.web.kik:
//            KikContentMessageParcelable

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new KikContentMessageParcelable(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new KikContentMessageParcelable[i];
    }
}
