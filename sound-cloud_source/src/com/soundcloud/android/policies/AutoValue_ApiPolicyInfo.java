// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.policies:
//            ApiPolicyInfo

final class AutoValue_ApiPolicyInfo extends ApiPolicyInfo
{

    private final String getMonetizationModel;
    private final String getPolicy;
    private final Urn getUrn;
    private final boolean isMonetizable;
    private final Boolean isSubHighTier;
    private final Boolean isSubMidTier;
    private final boolean isSyncable;

    AutoValue_ApiPolicyInfo(Urn urn, boolean flag, String s, boolean flag1, String s1, Boolean boolean1, Boolean boolean2)
    {
        if (urn == null)
        {
            throw new NullPointerException("Null getUrn");
        }
        getUrn = urn;
        isMonetizable = flag;
        if (s == null)
        {
            throw new NullPointerException("Null getPolicy");
        }
        getPolicy = s;
        isSyncable = flag1;
        if (s1 == null)
        {
            throw new NullPointerException("Null getMonetizationModel");
        }
        getMonetizationModel = s1;
        if (boolean1 == null)
        {
            throw new NullPointerException("Null isSubMidTier");
        }
        isSubMidTier = boolean1;
        if (boolean2 == null)
        {
            throw new NullPointerException("Null isSubHighTier");
        } else
        {
            isSubHighTier = boolean2;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ApiPolicyInfo)
            {
                if (!getUrn.equals(((ApiPolicyInfo) (obj = (ApiPolicyInfo)obj)).getUrn()) || isMonetizable != ((ApiPolicyInfo) (obj)).isMonetizable() || !getPolicy.equals(((ApiPolicyInfo) (obj)).getPolicy()) || isSyncable != ((ApiPolicyInfo) (obj)).isSyncable() || !getMonetizationModel.equals(((ApiPolicyInfo) (obj)).getMonetizationModel()) || !isSubMidTier.equals(((ApiPolicyInfo) (obj)).isSubMidTier()) || !isSubHighTier.equals(((ApiPolicyInfo) (obj)).isSubHighTier()))
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

    public final String getMonetizationModel()
    {
        return getMonetizationModel;
    }

    public final String getPolicy()
    {
        return getPolicy;
    }

    public final Urn getUrn()
    {
        return getUrn;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int i = getUrn.hashCode();
        char c;
        int j;
        if (isMonetizable)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        j = getPolicy.hashCode();
        if (!isSyncable)
        {
            c1 = '\u04D5';
        }
        return (((((c ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ j) * 0xf4243 ^ c1) * 0xf4243 ^ getMonetizationModel.hashCode()) * 0xf4243 ^ isSubMidTier.hashCode()) * 0xf4243 ^ isSubHighTier.hashCode();
    }

    public final boolean isMonetizable()
    {
        return isMonetizable;
    }

    public final Boolean isSubHighTier()
    {
        return isSubHighTier;
    }

    public final Boolean isSubMidTier()
    {
        return isSubMidTier;
    }

    public final boolean isSyncable()
    {
        return isSyncable;
    }

    public final String toString()
    {
        return (new StringBuilder("ApiPolicyInfo{getUrn=")).append(getUrn).append(", isMonetizable=").append(isMonetizable).append(", getPolicy=").append(getPolicy).append(", isSyncable=").append(isSyncable).append(", getMonetizationModel=").append(getMonetizationModel).append(", isSubMidTier=").append(isSubMidTier).append(", isSubHighTier=").append(isSubHighTier).append("}").toString();
    }
}
