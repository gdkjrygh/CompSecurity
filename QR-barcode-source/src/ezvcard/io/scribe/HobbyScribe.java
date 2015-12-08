// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.Hobby;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class HobbyScribe extends StringPropertyScribe
{

    public HobbyScribe()
    {
        super(ezvcard/property/Hobby, "HOBBY");
    }

    protected Hobby _parseValue(String s)
    {
        return new Hobby(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
