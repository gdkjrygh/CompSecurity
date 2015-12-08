// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.common.people.data:
//            b

public final class AudienceMember
    implements SafeParcelable
{

    public static final String AUDIENCE_GROUP_DOMAIN = "domain";
    public static final String AUDIENCE_GROUP_EXTENDED = "extendedCircles";
    public static final String AUDIENCE_GROUP_PUBLIC = "public";
    public static final String AUDIENCE_GROUP_YOUR_CIRCLES = "myCircles";
    public static final b CREATOR = new b();
    public static final int TYPE_CIRCLE = 1;
    public static final int TYPE_PERSON = 2;
    private final int EB;
    private final Bundle Ue;
    private final int WK;
    private final String WL;
    private final String WM;
    private final String WN;
    private final String WO;
    private final int mVersionCode;

    AudienceMember(int i, int j, int k, String s, String s1, String s2, String s3, 
            Bundle bundle)
    {
        mVersionCode = i;
        EB = j;
        WK = k;
        WL = s;
        WM = s1;
        WN = s2;
        WO = s3;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        Ue = bundle;
    }

    private boolean isPerson()
    {
        return EB == 2;
    }

    private boolean isPersonalCircle()
    {
        return EB == 1 && WK == -1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof AudienceMember)
        {
            if (mVersionCode == ((AudienceMember) (obj = (AudienceMember)obj)).mVersionCode && EB == ((AudienceMember) (obj)).EB && WK == ((AudienceMember) (obj)).WK && kl.equal(WL, ((AudienceMember) (obj)).WL) && kl.equal(WM, ((AudienceMember) (obj)).WM))
            {
                return true;
            }
        }
        return false;
    }

    public final String getAvatarUrl()
    {
        return WO;
    }

    public final String getCircleId()
    {
        return WL;
    }

    public final int getCircleType()
    {
        return WK;
    }

    public final String getDisplayName()
    {
        return WN;
    }

    public final Bundle getMetadata()
    {
        return Ue;
    }

    public final String getPeopleQualifiedId()
    {
        return WM;
    }

    public final int getType()
    {
        return EB;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), Integer.valueOf(EB), Integer.valueOf(WK), WL, WM
        });
    }

    public final String toString()
    {
        if (isPerson())
        {
            return String.format("Person [%s] %s", new Object[] {
                getPeopleQualifiedId(), getDisplayName()
            });
        }
        if (isPersonalCircle())
        {
            return String.format("Circle [%s] %s", new Object[] {
                getCircleId(), getDisplayName()
            });
        } else
        {
            return String.format("Group [%s] %s", new Object[] {
                getCircleId(), getDisplayName()
            });
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
