// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import me.lyft.android.common.IHasReason;
import me.lyft.android.common.Preconditions;

public class SplitFareServiceException extends Exception
    implements IHasReason
{

    public static final String REASON_EMPTY_INVITE_LIST = "empty_invite_list";
    public static final String REASON_LAPSED = "splitfare_request_lapsed";
    private final String reason;

    public SplitFareServiceException(String s)
    {
        Preconditions.checkNotNull(s);
        reason = s;
    }

    public String getReason()
    {
        return reason;
    }
}
