// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.CalendarUri;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            UriPropertyScribe

public class CalendarUriScribe extends UriPropertyScribe
{

    public CalendarUriScribe()
    {
        super(ezvcard/property/CalendarUri, "CALURI");
    }

    protected CalendarUri _parseValue(String s)
    {
        return new CalendarUri(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
