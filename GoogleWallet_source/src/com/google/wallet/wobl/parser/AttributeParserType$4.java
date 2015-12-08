// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;


// Referenced classes of package com.google.wallet.wobl.parser:
//            AttributeParserType, PaddingAttributeParser, WoblParser, AbstractAttributeParser

final class nit> extends AttributeParserType
{

    public final AbstractAttributeParser get(WoblParser woblparser)
    {
        return new PaddingAttributeParser(woblparser);
    }

    r(String s, int i)
    {
        super(s, i, null);
    }
}
