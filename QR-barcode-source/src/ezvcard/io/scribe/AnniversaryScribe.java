// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.Anniversary;
import ezvcard.property.DateOrTimeProperty;
import ezvcard.util.PartialDate;
import java.util.Date;

// Referenced classes of package ezvcard.io.scribe:
//            DateOrTimePropertyScribe

public class AnniversaryScribe extends DateOrTimePropertyScribe
{

    public AnniversaryScribe()
    {
        super(ezvcard/property/Anniversary, "ANNIVERSARY");
    }

    protected Anniversary newInstance(PartialDate partialdate)
    {
        return new Anniversary(partialdate);
    }

    protected Anniversary newInstance(String s)
    {
        return new Anniversary(s);
    }

    protected Anniversary newInstance(Date date, boolean flag)
    {
        return new Anniversary(date, flag);
    }

    protected volatile DateOrTimeProperty newInstance(PartialDate partialdate)
    {
        return newInstance(partialdate);
    }

    protected volatile DateOrTimeProperty newInstance(String s)
    {
        return newInstance(s);
    }

    protected volatile DateOrTimeProperty newInstance(Date date, boolean flag)
    {
        return newInstance(date, flag);
    }
}
