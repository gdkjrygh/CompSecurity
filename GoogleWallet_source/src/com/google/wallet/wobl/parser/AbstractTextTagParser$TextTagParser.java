// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTextTagParser, AttributeParserType, WoblParser

static class STYLED extends AbstractTextTagParser
{

    protected TextIr newIrInstance()
    {
        return new TextIr();
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return super.onParse(xmlelement);
    }

    public esentation(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.TEXT_STYLED, new AttributeParserType[] {
            AttributeParserType.MULTI_LINE_TEXT_STYLED, AttributeParserType.PADDING, AttributeParserType.TAP_TARGET, AttributeParserType.BOX_STYLED, AttributeParserType.Z_DEPTH
        }));
    }
}
