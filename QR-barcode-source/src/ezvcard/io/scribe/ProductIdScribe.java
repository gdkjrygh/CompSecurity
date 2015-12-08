// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.ProductId;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class ProductIdScribe extends StringPropertyScribe
{

    public ProductIdScribe()
    {
        super(ezvcard/property/ProductId, "PRODID");
    }

    protected ProductId _parseValue(String s)
    {
        return new ProductId(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
