// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.property.Language;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class LanguageScribe extends StringPropertyScribe
{

    public LanguageScribe()
    {
        super(ezvcard/property/Language, "LANG", VCardDataType.LANGUAGE_TAG);
    }

    protected Language _parseValue(String s)
    {
        return new Language(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
