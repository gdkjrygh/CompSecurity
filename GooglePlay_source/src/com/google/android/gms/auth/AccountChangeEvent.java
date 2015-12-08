// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventCreator

public class AccountChangeEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AccountChangeEventCreator();
    final String mAccountName;
    final String mChangeData;
    final int mChangeType;
    final int mEventIndex;
    final long mId;
    final int mVersion;

    AccountChangeEvent(int i, long l, String s, int j, int k, String s1)
    {
        mVersion = i;
        mId = l;
        mAccountName = (String)Preconditions.checkNotNull(s);
        mChangeType = j;
        mEventIndex = k;
        mChangeData = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof AccountChangeEvent)
            {
                if (mVersion != ((AccountChangeEvent) (obj = (AccountChangeEvent)obj)).mVersion || mId != ((AccountChangeEvent) (obj)).mId || !Objects.equal(mAccountName, ((AccountChangeEvent) (obj)).mAccountName) || mChangeType != ((AccountChangeEvent) (obj)).mChangeType || mEventIndex != ((AccountChangeEvent) (obj)).mEventIndex || !Objects.equal(mChangeData, ((AccountChangeEvent) (obj)).mChangeData))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersion), Long.valueOf(mId), mAccountName, Integer.valueOf(mChangeType), Integer.valueOf(mEventIndex), mChangeData
        });
    }

    public String toString()
    {
        String s = "UNKNOWN";
        mChangeType;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 94
    //                   2 100
    //                   3 112
    //                   4 106;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return (new StringBuilder("AccountChangeEvent {accountName = ")).append(mAccountName).append(", changeType = ").append(s).append(", changeData = ").append(mChangeData).append(", eventIndex = ").append(mEventIndex).append("}").toString();
_L2:
        s = "ADDED";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "REMOVED";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "RENAMED_TO";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "RENAMED_FROM";
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventCreator.writeToParcel$119e69c0(this, parcel);
    }

}
