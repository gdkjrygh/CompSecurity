// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import java.util.Date;

// Referenced classes of package ezvcard.property:
//            SimpleProperty

public class Revision extends SimpleProperty
{

    public Revision(Date date)
    {
        super(date);
    }

    public static Revision now()
    {
        return new Revision(new Date());
    }
}
