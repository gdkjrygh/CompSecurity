// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.splitfare;

import me.lyft.android.common.Strings;

public class SplitFareRequest
{

    private static final SplitFareRequest EMPTY = new SplitFareRequest("", "", "", false);
    private final String id;
    private final String initiatorName;
    private final String initiatorPhoto;
    private final boolean pending;

    public SplitFareRequest(String s, String s1, String s2, boolean flag)
    {
        id = s;
        initiatorName = s1;
        initiatorPhoto = s2;
        pending = flag;
    }

    public static SplitFareRequest empty()
    {
        return EMPTY;
    }

    public String getId()
    {
        return Strings.nullToEmpty(id);
    }

    public String getInitiatorName()
    {
        return Strings.nullToEmpty(initiatorName);
    }

    public String getInitiatorPhoto()
    {
        return Strings.nullToEmpty(initiatorPhoto);
    }

    public boolean isPending()
    {
        return pending;
    }

}
