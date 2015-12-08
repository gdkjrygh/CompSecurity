// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.Expertise;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class ExpertiseScribe extends StringPropertyScribe
{

    public ExpertiseScribe()
    {
        super(ezvcard/property/Expertise, "EXPERTISE");
    }

    protected Expertise _parseValue(String s)
    {
        return new Expertise(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
