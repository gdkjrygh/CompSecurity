// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.yong.gift:
//            GiftEntity

public class GiftXmlParser
{
    private class GiftParserHandler extends DefaultHandler
    {

        private GiftEntity currentGift;
        private ArrayList giftList;
        private String tagName;
        final GiftXmlParser this$0;

        public void characters(char ac[], int i, int j)
            throws SAXException
        {
            ac = new String(ac, i, j);
            if ("title".equals(tagName))
            {
                currentGift.setTitle(ac);
            } else
            {
                if ("detailed".equals(tagName))
                {
                    currentGift.setDetailed(ac);
                    return;
                }
                if ("icon_imagePath".equals(tagName))
                {
                    currentGift.setIcon_imagePath((new StringBuilder("http://moobosoft.com/giftmodule/")).append(ac).toString());
                    return;
                }
                if ("marketUrl".equals(tagName))
                {
                    currentGift.setMarketUrl(ac);
                    return;
                }
            }
        }

        public void endElement(String s, String s1, String s2)
            throws SAXException
        {
            if ("gift".equals(s1))
            {
                giftList.add(currentGift);
            }
            tagName = null;
        }

        public void startDocument()
            throws SAXException
        {
            giftList = new ArrayList();
        }

        public void startElement(String s, String s1, String s2, Attributes attributes)
            throws SAXException
        {
            if ("gift".equals(s1))
            {
                currentGift = new GiftEntity();
                currentGift.setId(Integer.parseInt(attributes.getValue("id")));
            }
            tagName = s1;
        }


        private GiftParserHandler()
        {
            this$0 = GiftXmlParser.this;
            super();
        }

        GiftParserHandler(GiftParserHandler giftparserhandler)
        {
            this();
        }
    }


    public GiftXmlParser()
    {
    }

    public ArrayList parse(InputStream inputstream)
        throws Exception
    {
        Object obj = null;
        if (inputstream != null)
        {
            obj = SAXParserFactory.newInstance().newSAXParser();
            GiftParserHandler giftparserhandler = new GiftParserHandler(null);
            ((SAXParser) (obj)).parse(inputstream, giftparserhandler);
            obj = giftparserhandler.giftList;
        }
        return ((ArrayList) (obj));
    }
}
