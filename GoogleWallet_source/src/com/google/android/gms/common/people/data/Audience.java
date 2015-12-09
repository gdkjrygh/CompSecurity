// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.people.data:
//            a

public final class Audience
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    public static final int DOMAIN_RESTRICTED_NOT_SET = 0;
    public static final int DOMAIN_RESTRICTED_RESTRICTED = 1;
    public static final int DOMAIN_RESTRICTED_UNRESTRICTED = 2;
    private final List WG;
    private final int WH;
    private final boolean WI;
    private final boolean WJ;
    private final int mVersionCode;

    Audience(int i, List list, int j, boolean flag, boolean flag1)
    {
        boolean flag3 = true;
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
        WG = Collections.unmodifiableList(list1);
        WH = j;
        if (i == 1)
        {
            WI = flag;
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            WJ = flag;
            return;
        }
        WJ = flag1;
        if (!flag1)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        WI = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Audience)
        {
            if (mVersionCode == ((Audience) (obj = (Audience)obj)).mVersionCode && kl.equal(WG, ((Audience) (obj)).WG) && WH == ((Audience) (obj)).WH && WJ == ((Audience) (obj)).WJ)
            {
                return true;
            }
        }
        return false;
    }

    public final List getAudienceMemberList()
    {
        return WG;
    }

    public final int getDomainRestricted()
    {
        return WH;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), WG, Integer.valueOf(WH), Boolean.valueOf(WJ)
        });
    }

    final boolean iY()
    {
        return WI;
    }

    public final boolean isReadOnly()
    {
        return WJ;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
