// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public class DateIr extends TextIr
{

    private Date date;
    private TimeZone displayTimeZone;
    private String template;

    public DateIr()
    {
    }

    public Date getDate()
    {
        return date;
    }

    public TimeZone getDisplayTimeZone()
    {
        return displayTimeZone;
    }

    public Optional getFontSize()
    {
        return Optional.absent();
    }

    public Optional getLineHeight()
    {
        return Optional.absent();
    }

    public Optional getMaxLines()
    {
        return Optional.absent();
    }

    public String getTemplate()
    {
        return template;
    }

    public Optional getTextOverflow()
    {
        return Optional.absent();
    }

    public void setDate(Date date1)
    {
        date = date1;
    }

    public void setDisplayTimeZone(TimeZone timezone)
    {
        displayTimeZone = timezone;
    }

    public void setTemplate(String s)
    {
        template = s;
    }
}
