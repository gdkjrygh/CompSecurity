// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.FreeBusyUrl;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            UriPropertyScribe

public class FreeBusyUrlScribe extends UriPropertyScribe
{

    public FreeBusyUrlScribe()
    {
        super(ezvcard/property/FreeBusyUrl, "FBURL");
    }

    protected FreeBusyUrl _parseValue(String s)
    {
        return new FreeBusyUrl(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
