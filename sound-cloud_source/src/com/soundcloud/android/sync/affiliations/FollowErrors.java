// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.affiliations;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync.affiliations:
//            FollowError

public class FollowErrors
{

    private final List errors;

    public FollowErrors(List list)
    {
        errors = list;
    }

    public static FollowErrors empty()
    {
        return new FollowErrors(Collections.emptyList());
    }

    public Integer getAge()
    {
        for (Iterator iterator = errors.iterator(); iterator.hasNext();)
        {
            FollowError followerror = (FollowError)iterator.next();
            if (followerror.age != null)
            {
                return followerror.age;
            }
        }

        return null;
    }

    public boolean isAgeRestricted()
    {
        for (Iterator iterator = errors.iterator(); iterator.hasNext();)
        {
            if (((FollowError)iterator.next()).isAgeRestricted())
            {
                return true;
            }
        }

        return false;
    }

    public boolean isAgeUnknown()
    {
        for (Iterator iterator = errors.iterator(); iterator.hasNext();)
        {
            if (((FollowError)iterator.next()).isAgeUnknown())
            {
                return true;
            }
        }

        return false;
    }

    public String toString()
    {
        return (new StringBuilder("ApiErrors{errors=")).append(errors).append('}').toString();
    }
}
