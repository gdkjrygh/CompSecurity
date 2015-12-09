// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.Optional;
import java.util.TimeZone;

public class WoblEnvironmentInfo
{

    private Optional timeZone;

    public WoblEnvironmentInfo()
    {
        timeZone = Optional.absent();
    }

    public Optional getTimeZone()
    {
        return timeZone;
    }

    public void setTimeZone(TimeZone timezone)
    {
        timeZone = Optional.of(timezone);
    }
}
