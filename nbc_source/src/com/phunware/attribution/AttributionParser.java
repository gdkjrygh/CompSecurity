// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.attribution;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AttributionParser
{
    public static class Notice
    {

        public boolean approved;
        public String name;
        public String noticeText;
        public String type;

        public Notice()
        {
        }
    }


    public AttributionParser()
    {
    }

    public static List getNotices(Context context)
    {
        Object obj = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        context = ((DocumentBuilder) (obj)).parse(context.getAssets().open("attribution.xml"));
        NodeList nodelist;
        nodelist = context.getElementsByTagName("notice");
        obj = new ArrayList();
        int i = 0;
_L2:
        context = ((Context) (obj));
        if (i >= nodelist.getLength())
        {
            break; /* Loop/switch isn't completed */
        }
        context = new Notice();
        Element element = (Element)nodelist.item(i);
        context.name = element.getAttribute("name");
        context.type = element.getAttribute("type");
        context.approved = "false".equalsIgnoreCase(element.getAttribute("approved"));
        context.noticeText = element.getTextContent();
        ((List) (obj)).add(context);
        i++;
        if (true) goto _L2; else goto _L1
        context;
        context = null;
_L1:
        return context;
        context;
        context.printStackTrace();
_L4:
        return null;
        context;
        context.printStackTrace();
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
    }
}
