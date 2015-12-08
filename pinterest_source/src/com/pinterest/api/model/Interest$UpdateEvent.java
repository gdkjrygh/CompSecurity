// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


// Referenced classes of package com.pinterest.api.model:
//            Interest

public class _followUpdated
{

    private Boolean _followUpdated;
    private Interest _interest;

    public Boolean getFollowUpdated()
    {
        return _followUpdated;
    }

    public Interest getInterest()
    {
        return _interest;
    }

    public void setFollowUpdated(Boolean boolean1)
    {
        _followUpdated = boolean1;
    }

    public void setInterest(Interest interest)
    {
        _interest = interest;
    }

    public (Interest interest)
    {
        this(interest, null);
    }

    public <init>(Interest interest, Boolean boolean1)
    {
        _interest = interest;
        _followUpdated = boolean1;
    }
}
