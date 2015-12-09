// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.common.base.CharMatcher;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.parser.reporter.ReportLevel;
import com.google.wallet.wobl.parser.reporter.Reporter;
import com.google.wallet.wobl.parser.xml.XmlElement;
import com.google.wallet.wobl.parser.xml.XmlTag;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, WoblParser, AttributeParserType

abstract class AbstractTextTagParser extends AbstractTagParser
{
    static class TextTagParser extends AbstractTextTagParser
    {

        protected TextIr newIrInstance()
        {
            return new TextIr();
        }

        protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
            throws WoblMalformedDocException
        {
            return onParse(xmlelement);
        }

        public TextTagParser(WoblParser woblparser)
        {
            super(woblparser, EnumSet.of(AttributeParserType.TEXT_STYLED, new AttributeParserType[] {
                AttributeParserType.MULTI_LINE_TEXT_STYLED, AttributeParserType.PADDING, AttributeParserType.TAP_TARGET, AttributeParserType.BOX_STYLED, AttributeParserType.Z_DEPTH
            }));
        }
    }


    private static final CharMatcher SPACE = CharMatcher.anyOf(" ");

    protected AbstractTextTagParser(WoblParser woblparser, Set set)
    {
        super(woblparser, set);
    }

    private boolean hasDuplicateDescendantTag(XmlElement xmlelement, String s)
    {
        if (xmlelement.isNameEqualTo(s))
        {
            return true;
        }
        for (xmlelement = xmlelement.getAllChildren().iterator(); xmlelement.hasNext();)
        {
            if (hasDuplicateDescendantTag((XmlElement)xmlelement.next(), s))
            {
                return true;
            }
        }

        return false;
    }

    protected abstract TextIr newIrInstance();

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }

    protected TextIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        TextIr textir = newIrInstance();
        if (xmlelement.hasText())
        {
            textir.setText(CharMatcher.BREAKING_WHITESPACE.trimAndCollapseFrom(xmlelement.getText(), ' '));
            return textir;
        }
        if (xmlelement.getChildrenCount() == 0)
        {
            textir.setText(null);
            return textir;
        }
        for (Iterator iterator = xmlelement.getAllChildren().iterator(); iterator.hasNext();)
        {
            if (hasDuplicateDescendantTag((XmlElement)iterator.next(), xmlelement.getTagName()))
            {
                throw new WoblMalformedDocException(String.format("Nesting %1$s inside %1$s is not allowed.", new Object[] {
                    xmlelement.getTagName()
                }));
            }
        }

        xmlelement = xmlelement.getAllChildren().iterator();
        do
        {
            if (!xmlelement.hasNext())
            {
                break;
            }
            XmlElement xmlelement1 = (XmlElement)xmlelement.next();
            if (xmlelement1.isInternalTextElement())
            {
                TextIr textir1 = new TextIr();
                textir1.setText(CharMatcher.BREAKING_WHITESPACE.collapseFrom(xmlelement1.getText(), ' '));
                textir.addChildComponent(textir1);
            } else
            {
                IntermediateRepresentation intermediaterepresentation = getWoblParser().parseElement(xmlelement1);
                if (intermediaterepresentation != null)
                {
                    if (!(intermediaterepresentation instanceof TextIr))
                    {
                        Reporter.report(ReportLevel.WARN, com/google/wallet/wobl/exception/WoblMalformedDocException, "%s can not be inside text/field tag.", new Object[] {
                            xmlelement1.getStartTag().getTagName()
                        });
                    } else
                    {
                        textir.addChildComponent((TextIr)intermediaterepresentation);
                    }
                }
            }
        } while (true);
        xmlelement = (TextIr)textir.getChildComponents().get(0);
        xmlelement.setText(SPACE.trimLeadingFrom(xmlelement.getText()));
        xmlelement = (TextIr)textir.getChildComponents().get(textir.getChildComponents().size() - 1);
        xmlelement.setText(SPACE.trimTrailingFrom(xmlelement.getText()));
        return textir;
    }

}
