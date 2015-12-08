// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.MarshalledChangeSequenceNumber;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.gms.drive:
//            ChangeSequenceNumberCreator

public class ChangeSequenceNumber
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ChangeSequenceNumberCreator();
    private volatile String encodedForm;
    final long mAccountId;
    final long mDatabaseInstanceId;
    final long mSequenceNumber;
    final int mVersionCode;

    ChangeSequenceNumber(int i, long l, long l1, long l2)
    {
        boolean flag1 = true;
        super();
        encodedForm = null;
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l1 != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (l2 != -1L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        mVersionCode = i;
        mSequenceNumber = l;
        mDatabaseInstanceId = l1;
        mAccountId = l2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ChangeSequenceNumber)
        {
            if (((ChangeSequenceNumber) (obj = (ChangeSequenceNumber)obj)).mDatabaseInstanceId == mDatabaseInstanceId && ((ChangeSequenceNumber) (obj)).mAccountId == mAccountId && ((ChangeSequenceNumber) (obj)).mSequenceNumber == mSequenceNumber)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(String.valueOf(mSequenceNumber)).append(String.valueOf(mDatabaseInstanceId)).append(String.valueOf(mAccountId)).toString().hashCode();
    }

    public String toString()
    {
        if (encodedForm == null)
        {
            Object obj = new MarshalledChangeSequenceNumber();
            obj.versionCode = mVersionCode;
            obj.sequenceNumber = mSequenceNumber;
            obj.databaseInstanceId = mDatabaseInstanceId;
            obj.accountId = mAccountId;
            obj = Base64.encodeToString(MessageNano.toByteArray(((MessageNano) (obj))), 10);
            encodedForm = (new StringBuilder("ChangeSequenceNumber:")).append(((String) (obj))).toString();
        }
        return encodedForm;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ChangeSequenceNumberCreator.writeToParcel$4001d267(this, parcel);
    }

}
