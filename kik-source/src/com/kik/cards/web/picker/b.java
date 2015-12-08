// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.picker;

import android.os.Parcel;

// Referenced classes of package com.kik.cards.web.picker:
//            PickerRequest

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new PickerRequest(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PickerRequest[i];
    }
}
