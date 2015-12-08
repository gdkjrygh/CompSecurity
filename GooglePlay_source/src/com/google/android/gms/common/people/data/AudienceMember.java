// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.people.internal.PeopleUtils;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.people.data:
//            AudienceMemberCreator

public final class AudienceMember
    implements SafeParcelable
{

    public static final AudienceMemberCreator CREATOR = new AudienceMemberCreator();
    final String mAvatarUrl;
    public final String mCircleId;
    public final int mCircleType;
    public final String mDisplayName;
    final Bundle mMetadata;
    public final String mPeopleQualifiedId;
    public final int mType;
    final int mVersionCode;

    AudienceMember(int i, int j, int k, String s, String s1, String s2, String s3, 
            Bundle bundle)
    {
        mVersionCode = i;
        mType = j;
        mCircleType = k;
        mCircleId = s;
        mPeopleQualifiedId = s1;
        mDisplayName = s2;
        mAvatarUrl = s3;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        mMetadata = bundle;
    }

    private AudienceMember(int i, int j, String s, String s1, String s2, String s3)
    {
        this(1, i, j, s, s1, s2, s3, null);
    }

    public static AudienceMember forCircle(String s, String s1)
    {
        return new AudienceMember(1, -1, s, null, s1, null);
    }

    public static AudienceMember forGroup(String s, String s1)
    {
        Integer integer1 = (Integer)PeopleUtils.MAP_CIRCLE_TYPE.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = (Integer)PeopleUtils.MAP_CIRCLE_TYPE.get(null);
        }
        return new AudienceMember(1, integer.intValue(), s, null, s1, null);
    }

    public static AudienceMember forPersonWithEmail(String s, String s1)
    {
        return forPersonWithPeopleQualifiedId(PeopleUtils.emailToPeopleQualifiedId(s), s1, null);
    }

    public static AudienceMember forPersonWithGaiaId$4a62ecd5(String s, String s1)
    {
        Preconditions.checkNotEmpty(s, "Person ID must not be empty.");
        return forPersonWithPeopleQualifiedId(PeopleUtils.gaiaIdToPeopleQualifiedId(s), s1, null);
    }

    public static AudienceMember forPersonWithPeopleQualifiedId(String s, String s1, String s2)
    {
        return new AudienceMember(2, 0, null, s, s1, null);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof AudienceMember)
        {
            if (mVersionCode == ((AudienceMember) (obj = (AudienceMember)obj)).mVersionCode && mType == ((AudienceMember) (obj)).mType && mCircleType == ((AudienceMember) (obj)).mCircleType && Objects.equal(mCircleId, ((AudienceMember) (obj)).mCircleId) && Objects.equal(mPeopleQualifiedId, ((AudienceMember) (obj)).mPeopleQualifiedId))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), Integer.valueOf(mType), Integer.valueOf(mCircleType), mCircleId, mPeopleQualifiedId
        });
    }

    public final boolean isPublicSystemGroup()
    {
        return mType == 1 && mCircleType == 1;
    }

    public final String toString()
    {
        boolean flag;
        if (mType == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return String.format("Person [%s] %s", new Object[] {
                mPeopleQualifiedId, mDisplayName
            });
        }
        if (mType == 1 && mCircleType == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return String.format("Circle [%s] %s", new Object[] {
                mCircleId, mDisplayName
            });
        } else
        {
            return String.format("Group [%s] %s", new Object[] {
                mCircleId, mDisplayName
            });
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AudienceMemberCreator.writeToParcel$4b7b3a63(this, parcel);
    }

}
