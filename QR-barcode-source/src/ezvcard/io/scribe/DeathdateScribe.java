// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.DateOrTimeProperty;
import ezvcard.property.Deathdate;
import ezvcard.util.PartialDate;
import java.util.Date;

// Referenced classes of package ezvcard.io.scribe:
//            DateOrTimePropertyScribe

public class DeathdateScribe extends DateOrTimePropertyScribe
{

    public DeathdateScribe()
    {
        super(ezvcard/property/Deathdate, "DEATHDATE");
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

    protected Deathdate newInstance(PartialDate partialdate)
    {
        return new Deathdate(partialdate);
    }

    protected Deathdate newInstance(String s)
    {
        return new Deathdate(s);
    }

    protected Deathdate newInstance(Date date, boolean flag)
    {
        return new Deathdate(date, flag);
    }
}
