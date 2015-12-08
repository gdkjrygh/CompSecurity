// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            k

public class HandwritingRecognizerInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    public final String a;
    public final boolean b;

    public HandwritingRecognizerInfo(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public int describeContents()
    {
        return 0x6169aa2;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
