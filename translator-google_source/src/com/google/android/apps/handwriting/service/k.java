// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            HandwritingRecognizerInfo

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = true;
        String s = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        return new HandwritingRecognizerInfo(s, flag);
    }

    public final Object[] newArray(int i)
    {
        return new HandwritingRecognizerInfo[i];
    }
}
