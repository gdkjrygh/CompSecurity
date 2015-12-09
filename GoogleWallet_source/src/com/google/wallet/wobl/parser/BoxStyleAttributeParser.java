// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractAttributeParser, WoblParser, Attributes

class BoxStyleAttributeParser extends AbstractAttributeParser
{

    public BoxStyleAttributeParser(WoblParser woblparser)
    {
        super(woblparser);
    }

    public void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        xmlelement = Attributes.resolve("background-color", xmlelement, getWoblParser().getMetadata());
        if (xmlelement != null)
        {
            intermediaterepresentation.setBackgroundColor(xmlelement.getColor());
        }
    }
}
