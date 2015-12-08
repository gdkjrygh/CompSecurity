// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.ImageIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, Asserts, WoblParser

public class ImageTagParser extends AbstractTagParser
{

    public ImageTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.BOX_STYLED, AttributeParserType.PADDING, AttributeParserType.TAP_TARGET, AttributeParserType.Z_DEPTH, AttributeParserType.ALPHA));
    }

    protected ImageIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        ImageIr imageir = new ImageIr();
        Asserts.requireAttributes(xmlelement, new String[] {
            "source", "aspect"
        });
        imageir.setSource(xmlelement.getAttribute("source").getString());
        imageir.setAspect(xmlelement.getAttribute("aspect").getDouble());
        if (xmlelement.hasAttribute("alt-text"))
        {
            xmlelement = Optional.of(xmlelement.getAttribute("alt-text").getString());
        } else
        {
            xmlelement = Optional.absent();
        }
        imageir.setAltText(xmlelement);
        return imageir;
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }
}
