// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.parser;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Parser
{

    private static Parser instance = null;
    private SAXParser parser;

    private Parser()
    {
        SAXParserFactory saxparserfactory = SAXParserFactory.newInstance();
        try
        {
            parser = saxparserfactory.newSAXParser();
            return;
        }
        catch (ParserConfigurationException parserconfigurationexception)
        {
            parserconfigurationexception.printStackTrace();
            return;
        }
        catch (SAXException saxexception)
        {
            saxexception.printStackTrace();
        }
    }

    public static Parser getInstance()
    {
        if (instance == null)
        {
            instance = new Parser();
        }
        return instance;
    }

    public void parse(String s, DefaultHandler defaulthandler)
    {
        try
        {
            parser.parse(s, defaulthandler);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

}
