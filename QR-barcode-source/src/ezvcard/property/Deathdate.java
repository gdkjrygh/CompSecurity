// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.util.PartialDate;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            DateOrTimeProperty

public class Deathdate extends DateOrTimeProperty
{

    public Deathdate(PartialDate partialdate)
    {
        super(partialdate);
    }

    public Deathdate(String s)
    {
        super(s);
    }

    public Deathdate(Date date)
    {
        super(date);
    }

    public Deathdate(Date date, boolean flag)
    {
        super(date, flag);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }
}
