// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.FieldIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AbstractTagParser, AttributeParserType, WoblParser

class FieldTagParser extends AbstractTagParser
{

    public FieldTagParser(WoblParser woblparser)
    {
        super(woblparser, EnumSet.of(AttributeParserType.PADDING, AttributeParserType.BOX_STYLED, AttributeParserType.Z_DEPTH));
    }

    private void parseChild(FieldIr fieldir, XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        if (xmlelement.isNameEqualTo("field-name"))
        {
            if (fieldir.getFieldName() == null)
            {
                fieldir.setFieldName((TextIr)getWoblParser().parseElement(xmlelement));
                return;
            } else
            {
                throw new WoblMalformedDocException("Field has more than one field-name child");
            }
        }
        if (xmlelement.isNameEqualTo("field-value"))
        {
            if (fieldir.getFieldValue() == null)
            {
                fieldir.setFieldValue((TextIr)getWoblParser().parseElement(xmlelement));
                return;
            } else
            {
                throw new WoblMalformedDocException("Field has more than one field-value child");
            }
        } else
        {
            throw new WoblMalformedDocException("Invalid child tag in field element");
        }
    }

    protected FieldIr onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        FieldIr fieldir = new FieldIr();
        xmlelement = xmlelement.getAllChildren();
        if (xmlelement.size() != 2)
        {
            throw new WoblMalformedDocException("Field tag must have exactly two children");
        } else
        {
            parseChild(fieldir, (XmlElement)xmlelement.get(0));
            parseChild(fieldir, (XmlElement)xmlelement.get(1));
            return fieldir;
        }
    }

    protected volatile IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        return onParse(xmlelement);
    }
}
