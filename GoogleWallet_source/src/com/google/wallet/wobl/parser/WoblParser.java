// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.exception.WoblParserException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.xml.XmlAttribute;
import com.google.wallet.wobl.parser.xml.XmlElement;
import com.google.wallet.wobl.parser.xml.XmlParser;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.wallet.wobl.parser:
//            WoblParserMetadata, WoblEnvironmentInfo, FieldTagParser, DateTagParser, 
//            ColumnLayoutTagParser, BarcodeTagParser, LineTagParser, ImageTagParser, 
//            InlineLinkTagParser, ActionTagParser, SpinnerTagParser, StubTagParser, 
//            AbstractTagParser

public class WoblParser
{

    private final WoblEnvironmentInfo environmentInfo = new WoblEnvironmentInfo();
    private final WoblParserMetadata metadata = new WoblParserMetadata();
    private final Map parsers;
    private final AbstractTagParser stubTagParser = new StubTagParser(this);

    public WoblParser()
    {
        HashMap hashmap = new HashMap();
        AbstractTextTagParser.TextTagParser texttagparser = new AbstractTextTagParser.TextTagParser(this);
        hashmap.put("text", texttagparser);
        hashmap.put("field-name", texttagparser);
        hashmap.put("field-value", texttagparser);
        hashmap.put("field", new FieldTagParser(this));
        hashmap.put("date", new DateTagParser(this));
        hashmap.put("column-layout", new ColumnLayoutTagParser(this));
        hashmap.put("barcode", new BarcodeTagParser(this));
        hashmap.put("line", new LineTagParser(this));
        hashmap.put("image", new ImageTagParser(this));
        hashmap.put("inline-link", new InlineLinkTagParser(this));
        hashmap.put("action", new ActionTagParser(this));
        hashmap.put("spinner", new SpinnerTagParser(this));
        parsers = Collections.unmodifiableMap(hashmap);
    }

    public WoblEnvironmentInfo getEnvironmentInfo()
    {
        return environmentInfo;
    }

    WoblParserMetadata getMetadata()
    {
        return metadata;
    }

    AbstractTagParser getTagParser(XmlElement xmlelement)
    {
        xmlelement = (AbstractTagParser)parsers.get(xmlelement.getTagName());
        if (xmlelement != null)
        {
            return xmlelement;
        } else
        {
            return stubTagParser;
        }
    }

    boolean isRtlLanguage()
    {
        return false;
    }

    IntermediateRepresentation parseElement(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        if (xmlelement.isNameEqualTo("head"))
        {
            parseHeader(xmlelement);
            return null;
        } else
        {
            return getTagParser(xmlelement).parse(xmlelement);
        }
    }

    void parseHeader(XmlElement xmlelement)
        throws WoblMalformedDocException
    {
        xmlelement = xmlelement.getAllChildren().iterator();
        do
        {
            if (!xmlelement.hasNext())
            {
                break;
            }
            XmlElement xmlelement1 = (XmlElement)xmlelement.next();
            if (xmlelement1.isNameEqualTo("stylesheet"))
            {
                metadata.parseStylesheet(xmlelement1);
            }
        } while (true);
    }

    public IntermediateRepresentation parseWobl(Reader reader)
        throws WoblParserException, WoblMalformedDocException
    {
        reader = (new XmlParser(reader)).generateXmlElementTree();
        metadata.clear();
        if (reader.hasAttribute("lang"))
        {
            metadata.setLang(reader.getAttribute("lang").getString());
        }
        if (reader.hasAttribute("id"))
        {
            metadata.setId(reader.getAttribute("id").getString());
        }
        if (reader.hasAttribute("xmlns"))
        {
            metadata.setXmlns(reader.getAttribute("xmlns").getString());
        }
        for (reader = reader.getAllChildren().iterator(); reader.hasNext();)
        {
            IntermediateRepresentation intermediaterepresentation = parseElement((XmlElement)reader.next());
            if (intermediaterepresentation != null)
            {
                return intermediaterepresentation;
            }
        }

        return null;
    }

    public IntermediateRepresentation parseWobl(String s)
        throws WoblParserException, WoblMalformedDocException
    {
        return parseWobl(((Reader) (new StringReader(s))));
    }
}
