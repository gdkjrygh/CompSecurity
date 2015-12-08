// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Parcel;
import kik.a.d.m;

// Referenced classes of package kik.android.util:
//            KikDisplayOnlyGroupParcelable, KikDisplayOnlyContactParcelable

final class bi
    implements android.os.Parcelable.Creator
{

    bi()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new KikDisplayOnlyGroupParcelable(new m(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createTypedArrayList(KikDisplayOnlyContactParcelable.CREATOR)));
    }

    public final volatile Object[] newArray(int i)
    {
        return new KikDisplayOnlyGroupParcelable[i];
    }
}
