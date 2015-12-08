// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.content.Context;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package net.coocent.android.xmlparser:
//            GiftXmlParser, GiftEntity

private class <init> extends DefaultHandler
{

    private GiftEntity currentGift;
    private ArrayList giftList;
    private String tagName;
    final GiftXmlParser this$0;

    public void characters(char ac[], int i, int j)
        throws SAXException
    {
        ac = new String(ac, i, j);
        if ("packagename".equals(tagName))
        {
            currentGift.setPackagename(ac);
        } else
        {
            if ("title".equals(tagName))
            {
                currentGift.setTitle(ac);
                return;
            }
            if ("icon_imagePath".equals(tagName))
            {
                currentGift.setIcon_imagePath((new StringBuilder("http://www.coocent.net/coocentPromotion/yonggift/")).append(ac).toString());
                return;
            }
        }
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        if ("gift".equals(s1) && !currentGift.getPackagename().equals(GiftXmlParser.access$0(GiftXmlParser.this).getPackageName()))
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


    private ()
    {
        this$0 = GiftXmlParser.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
