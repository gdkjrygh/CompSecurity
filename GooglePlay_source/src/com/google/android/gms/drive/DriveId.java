// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.DriveFileImpl;
import com.google.android.gms.drive.internal.DriveLog;
import com.google.android.gms.drive.internal.MarshalledDriveId;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.gms.drive:
//            DriveIdCreator, DriveFile

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DriveIdCreator();
    private volatile String encodedForm;
    private volatile String encodedInvariantForm;
    final long mDatabaseInstanceId;
    public final String mResourceId;
    public final int mResourceType;
    final long mSqlId;
    final int mVersionCode;

    DriveId(int i, String s, long l, long l1, int j)
    {
label0:
        {
            boolean flag1 = false;
            super();
            encodedForm = null;
            encodedInvariantForm = null;
            mVersionCode = i;
            mResourceId = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            if (s == null)
            {
                flag = flag1;
                if (l == -1L)
                {
                    break label0;
                }
            }
            flag = true;
        }
        Preconditions.checkArgument(flag);
        mSqlId = l;
        mDatabaseInstanceId = l1;
        mResourceType = j;
    }

    public DriveId(String s, long l, long l1, int i)
    {
        this(1, s, l, l1, i);
    }

    public static DriveId createFromResourceId(String s)
    {
        Preconditions.checkNotNull(s);
        return new DriveId(s, -1L, -1L, -1);
    }

    private static DriveId decodeFromBytes(byte abyte0[])
    {
        MarshalledDriveId marshalleddriveid;
        try
        {
            marshalleddriveid = (MarshalledDriveId)MessageNano.mergeFrom$1ec43da(new MarshalledDriveId(), abyte0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(marshalleddriveid.resourceId))
        {
            abyte0 = null;
        } else
        {
            abyte0 = marshalleddriveid.resourceId;
        }
        return new DriveId(marshalleddriveid.versionCode, abyte0, marshalleddriveid.sqlId, marshalleddriveid.databaseInstanceId, marshalleddriveid.resourceType);
    }

    public static DriveId decodeFromString(String s)
    {
        Preconditions.checkArgument(s.startsWith("DriveId:"), (new StringBuilder("Invalid DriveId: ")).append(s).toString());
        return decodeFromBytes(Base64.decode(s.substring(8), 10));
    }

    public final DriveFile asDriveFile()
    {
        if (mResourceType == 1)
        {
            throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
        } else
        {
            return new DriveFileImpl(this);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (encodedForm == null)
        {
            MarshalledDriveId marshalleddriveid = new MarshalledDriveId();
            marshalleddriveid.versionCode = mVersionCode;
            String s;
            if (mResourceId == null)
            {
                s = "";
            } else
            {
                s = mResourceId;
            }
            marshalleddriveid.resourceId = s;
            marshalleddriveid.sqlId = mSqlId;
            marshalleddriveid.databaseInstanceId = mDatabaseInstanceId;
            marshalleddriveid.resourceType = mResourceType;
            s = Base64.encodeToString(MessageNano.toByteArray(marshalleddriveid), 10);
            encodedForm = (new StringBuilder("DriveId:")).append(s).toString();
        }
        return encodedForm;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DriveId) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (((DriveId) (obj = (DriveId)obj)).mDatabaseInstanceId != mDatabaseInstanceId) goto _L1; else goto _L3
_L3:
        if (((DriveId) (obj)).mSqlId == -1L && mSqlId == -1L)
        {
            return ((DriveId) (obj)).mResourceId.equals(mResourceId);
        }
        if (mResourceId != null && ((DriveId) (obj)).mResourceId != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((DriveId) (obj)).mSqlId != mSqlId) goto _L1; else goto _L4
_L4:
        return true;
        if (((DriveId) (obj)).mSqlId != mSqlId) goto _L1; else goto _L5
_L5:
        if (((DriveId) (obj)).mResourceId.equals(mResourceId))
        {
            return true;
        } else
        {
            DriveLog.w("DriveId", "Unexpected unequal resourceId for same DriveId object.");
            return false;
        }
    }

    public int hashCode()
    {
        if (mSqlId == -1L)
        {
            return mResourceId.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(mDatabaseInstanceId)).append(String.valueOf(mSqlId)).toString().hashCode();
        }
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DriveIdCreator.writeToParcel$1b74a21c(this, parcel);
    }

}
