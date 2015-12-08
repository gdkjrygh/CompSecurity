// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.Uid;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            UriPropertyScribe

public class UidScribe extends UriPropertyScribe
{

    public UidScribe()
    {
        super(ezvcard/property/Uid, "UID");
    }

    protected Uid _parseValue(String s)
    {
        return new Uid(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
