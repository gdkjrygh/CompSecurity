// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.splitfare;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

public class SplitFareState
{

    private static final SplitFareState EMPTY = new SplitFareState(0, Collections.emptyList());
    private final int acceptedContributorsCount;
    private final List invitedPhones;

    public SplitFareState(int i, List list)
    {
        acceptedContributorsCount = i;
        invitedPhones = list;
    }

    public static SplitFareState empty()
    {
        return EMPTY;
    }

    private List getInvitedPhones()
    {
        return (List)Objects.firstNonNull(invitedPhones, Collections.emptyList());
    }

    public int getAcceptedContributorsCount()
    {
        return acceptedContributorsCount;
    }

    public int getInvitedContributorsCount()
    {
        return getInvitedPhones().size();
    }

    public int getTotalContributorsCount()
    {
        return acceptedContributorsCount + 1;
    }

    public boolean hasPhoneNumberBeenInvited(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return false;
        }
        for (Iterator iterator = getInvitedPhones().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (s1.contains(s) || s.contains(s1))
            {
                return true;
            }
        }

        return false;
    }

}
