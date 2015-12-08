// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.ActionIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, Asserts, WoblParser

class ActionTagParser extends AbstractTagParser
{

    public ActionTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.TEXT_STYLED, AttributeParserType.PADDING, AttributeParserType.TAP_TARGET, AttributeParserType.Z_DEPTH, AttributeParserType.ALPHA));
    }

    protected ActionIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        Asserts.requireAttributes(xmlelement, new String[] {
            "tap-uri"
        });
        if (xmlelement.getAttribute("tap-uri").getUriList().isEmpty())
        {
            throw new WoblMalformedDocException("No valid tap-uri on action element.");
        }
        Object obj = xmlelement.getText();
        ActionIr actionir = new ActionIr();
        actionir.setText(((String) (obj)));
        com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon actionicon = com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.LINK;
        obj = actionicon;
        if (xmlelement.hasAttribute("icon"))
        {
            try
            {
                obj = com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.of(xmlelement.getAttribute("icon").getString());
            }
            // Misplaced declaration of an exception variable
            catch (XmlElement xmlelement)
            {
                Reporter.report(ReportLevel.WARN, xmlelement);
                obj = actionicon;
            }
        }
        actionir.setIcon(((com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon) (obj)));
        return actionir;
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }
}
