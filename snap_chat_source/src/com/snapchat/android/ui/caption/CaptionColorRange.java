// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.os.Parcel;
import android.os.Parcelable;

public class CaptionColorRange
    implements Parcelable
{

    final int a;
    final int b;
    final int c;

    public CaptionColorRange(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeIntArray(new int[] {
            a, b, c
        });
    }
}
