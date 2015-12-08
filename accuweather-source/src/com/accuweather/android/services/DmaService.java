// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

// Referenced classes of package com.accuweather.android.services:
//            DmaFeedParser

public class DmaService
{

    public DmaService()
    {
    }

    private XMLReader buildXmlReader()
        throws ParserConfigurationException, SAXException
    {
        return SAXParserFactory.newInstance().newSAXParser().getXMLReader();
    }

    public List retrieveDMAs(InputSource inputsource)
        throws Exception
    {
        DmaFeedParser dmafeedparser = new DmaFeedParser();
        XMLReader xmlreader = buildXmlReader();
        xmlreader.setContentHandler(dmafeedparser);
        xmlreader.parse(inputsource);
        return dmafeedparser.getDmaModels();
    }
}
