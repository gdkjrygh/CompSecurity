// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.policies:
//            AutoValue_ApiPolicyInfo

public abstract class ApiPolicyInfo
{

    public static final String ALLOW = "ALLOW";
    public static final String BLOCK = "BLOCK";
    public static final String MONETIZE = "MONETIZE";
    public static final String SNIP = "SNIP";

    public ApiPolicyInfo()
    {
    }

    public static ApiPolicyInfo create(String s, boolean flag, String s1, boolean flag1, String s2, boolean flag2, boolean flag3)
    {
        return new AutoValue_ApiPolicyInfo(new Urn(s), flag, s1, flag1, s2, Boolean.valueOf(flag2), Boolean.valueOf(flag3));
    }

    public abstract String getMonetizationModel();

    public abstract String getPolicy();

    public abstract Urn getUrn();

    public abstract boolean isMonetizable();

    public abstract Boolean isSubHighTier();

    public abstract Boolean isSubMidTier();

    public abstract boolean isSyncable();
}
