// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.util.ISOFormat;
import ezvcard.util.VCardDateFormatter;
import java.util.Date;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

protected static class date
{

    private Date date;
    private boolean extended;
    private boolean hasTime;
    private boolean utc;

    public date extended(boolean flag)
    {
        extended = flag;
        return this;
    }

    public extended time(boolean flag)
    {
        hasTime = flag;
        return this;
    }

    public hasTime utc(boolean flag)
    {
        utc = flag;
        return this;
    }

    public String write()
    {
        ISOFormat isoformat;
        if (hasTime)
        {
            if (utc)
            {
                if (extended)
                {
                    isoformat = ISOFormat.UTC_TIME_EXTENDED;
                } else
                {
                    isoformat = ISOFormat.UTC_TIME_BASIC;
                }
            } else
            if (extended)
            {
                isoformat = ISOFormat.TIME_EXTENDED;
            } else
            {
                isoformat = ISOFormat.TIME_BASIC;
            }
        } else
        if (extended)
        {
            isoformat = ISOFormat.DATE_EXTENDED;
        } else
        {
            isoformat = ISOFormat.DATE_BASIC;
        }
        return VCardDateFormatter.format(date, isoformat);
    }

    public (Date date1)
    {
        hasTime = true;
        extended = false;
        utc = true;
        date = date1;
    }
}
