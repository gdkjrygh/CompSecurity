// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.io.html.HCardElement;
import ezvcard.property.TextProperty;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public abstract class UriPropertyScribe extends StringPropertyScribe
{

    public UriPropertyScribe(Class class1, String s)
    {
        super(class1, s, VCardDataType.URI);
    }

    protected TextProperty _parseHtml(HCardElement hcardelement, List list)
    {
        String s = hcardelement.absUrl("href");
        if (s.length() == 0)
        {
            return (TextProperty)super._parseHtml(hcardelement, list);
        } else
        {
            return (TextProperty)_parseValue(s);
        }
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }
}
