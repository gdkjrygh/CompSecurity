// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.InlineLinkIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTextTagParser, AttributeParserType, Asserts, WoblParser

class InlineLinkTagParser extends AbstractTextTagParser
{

    public InlineLinkTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.TEXT_STYLED, AttributeParserType.TAP_TARGET, AttributeParserType.BOX_STYLED));
    }

    protected InlineLinkIr newIrInstance()
    {
        return new InlineLinkIr();
    }

    protected volatile TextIr newIrInstance()
    {
        return newIrInstance();
    }

    protected InlineLinkIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        Asserts.requireAttributes(xmlelement, new String[] {
            "tap-uri"
        });
        return (InlineLinkIr)super.onParse(xmlelement);
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }

    protected volatile TextIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }
}
