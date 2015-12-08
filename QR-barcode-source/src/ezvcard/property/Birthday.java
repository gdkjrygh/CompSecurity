// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.util.PartialDate;
import java.util.Date;

// Referenced classes of package ezvcard.property:
//            DateOrTimeProperty

public class Birthday extends DateOrTimeProperty
{

    public Birthday(PartialDate partialdate)
    {
        super(partialdate);
    }

    public Birthday(String s)
    {
        super(s);
    }

    public Birthday(Date date)
    {
        super(date);
    }

    public Birthday(Date date, boolean flag)
    {
        super(date, flag);
    }
}
