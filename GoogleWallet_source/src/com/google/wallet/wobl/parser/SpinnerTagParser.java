// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.SpinnerIr;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, WoblParser

public class SpinnerTagParser extends AbstractTagParser
{

    public SpinnerTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.BOX_STYLED, AttributeParserType.PADDING, AttributeParserType.TAP_TARGET, AttributeParserType.Z_DEPTH));
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }

    protected SpinnerIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        SpinnerIr spinnerir = new SpinnerIr();
        if (xmlelement.hasAttribute("alt-text"))
        {
            xmlelement = Optional.of(xmlelement.getAttribute("alt-text").getString());
        } else
        {
            xmlelement = Optional.absent();
        }
        spinnerir.setAltText(xmlelement);
        return spinnerir;
    }
}
