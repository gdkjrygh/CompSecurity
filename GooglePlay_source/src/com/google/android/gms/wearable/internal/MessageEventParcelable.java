// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            MessageEventParcelableCreator

public class MessageEventParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new MessageEventParcelableCreator();
    final byte mData[];
    final String mPath;
    final int mRequestId;
    final String mSource;
    final int mVersionCode;

    MessageEventParcelable(int i, int j, String s, byte abyte0[], String s1)
    {
        mVersionCode = i;
        mRequestId = j;
        mPath = s;
        mData = abyte0;
        mSource = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("MessageEventParcelable[")).append(mRequestId).append(",").append(mPath).append(", size=");
        Object obj;
        if (mData == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(mData.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MessageEventParcelableCreator.writeToParcel$6ae86e9a(this, parcel);
    }

}
