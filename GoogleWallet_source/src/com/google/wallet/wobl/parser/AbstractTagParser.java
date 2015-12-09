// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.xml.XmlElement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.wallet.wobl.parser:
//            AttributeParserType, AbstractAttributeParser, WoblParser

abstract class AbstractTagParser
{

    private final Set attributeParsers = new HashSet();
    private final WoblParser woblParser;

    public AbstractTagParser(WoblParser woblparser, Set set)
    {
        woblParser = woblparser;
        for (woblparser = set.iterator(); woblparser.hasNext(); attributeParsers.add(set.get(getWoblParser())))
        {
            set = (AttributeParserType)woblparser.next();
        }

    }

    protected WoblParser getWoblParser()
    {
        return woblParser;
    }

    protected abstract IntermediateRepresentation onParse(XmlElement xmlelement)
        throws WoblMalformedDocException;

    public final IntermediateRepresentation parse(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        IntermediateRepresentation intermediaterepresentation = onParse(xmlelement);
        for (Iterator iterator = attributeParsers.iterator(); iterator.hasNext(); ((AbstractAttributeParser)iterator.next()).applyAttributesToIr(intermediaterepresentation, xmlelement)) { }
        return intermediaterepresentation;
    }
}
