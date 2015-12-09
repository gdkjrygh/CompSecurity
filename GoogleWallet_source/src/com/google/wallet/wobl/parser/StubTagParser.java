// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, WoblParser

public class StubTagParser extends AbstractTagParser
{

    public StubTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.noneOf(com/google/wallet/wobl/parser/AttributeParserType));
    }

    protected IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return null;
    }
}
