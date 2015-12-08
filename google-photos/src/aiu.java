// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public final class aiu
{

    private SAXParserFactory a;

    public aiu()
    {
        a = SAXParserFactory.newInstance();
    }

    public XMLReader a(aio aio)
    {
        XMLReader xmlreader;
        try
        {
            xmlreader = a.newSAXParser().getXMLReader();
            xmlreader.setContentHandler(new aiv(aio));
        }
        // Misplaced declaration of an exception variable
        catch (aio aio)
        {
            throw new IOException("Error creating SAXParser for graph parsing!", aio);
        }
        // Misplaced declaration of an exception variable
        catch (aio aio)
        {
            throw new IOException("Error creating XMLReader for graph parsing!", aio);
        }
        return xmlreader;
    }
}
