// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Parcel;
import kik.a.d.l;

final class bh
    implements android.os.Parcelable.Creator
{

    bh()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = parcel.readString();
        String s1 = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new l(s, s1, flag);
    }

    public final volatile Object[] newArray(int i)
    {
        return new l[i];
    }
}
