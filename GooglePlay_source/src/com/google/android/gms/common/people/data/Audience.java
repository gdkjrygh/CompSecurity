// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.people.data:
//            AudienceCreator, AudienceMember

public final class Audience
    implements SafeParcelable
{

    public static final AudienceCreator CREATOR = new AudienceCreator();
    final List mAudienceMembers;
    final int mDomainRestricted;
    final boolean mIsFullyUnderstood;
    final boolean mReadOnly;
    final int mVersionCode;

    Audience(int i, List list, int j, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        super();
        List list1 = list;
        if (i == 1)
        {
            list1 = list;
            if (list == null)
            {
                list1 = Collections.emptyList();
            }
        }
        mVersionCode = i;
        if (j == 1)
        {
            list = removePublicMembers(list1);
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        mAudienceMembers = list;
        mDomainRestricted = j;
        if (i == 1)
        {
            mIsFullyUnderstood = flag;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mReadOnly = flag;
            return;
        }
        mReadOnly = flag1;
        if (!flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        mIsFullyUnderstood = flag;
    }

    private static List removePublicMembers(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            AudienceMember audiencemember = (AudienceMember)list.next();
            if (!audiencemember.isPublicSystemGroup())
            {
                arraylist.add(audiencemember);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Audience)
        {
            if (mVersionCode == ((Audience) (obj = (Audience)obj)).mVersionCode && Objects.equal(mAudienceMembers, ((Audience) (obj)).mAudienceMembers) && mDomainRestricted == ((Audience) (obj)).mDomainRestricted && mReadOnly == ((Audience) (obj)).mReadOnly)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), mAudienceMembers, Integer.valueOf(mDomainRestricted), Boolean.valueOf(mReadOnly)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AudienceCreator.writeToParcel$72b4f457(this, parcel);
    }

}
