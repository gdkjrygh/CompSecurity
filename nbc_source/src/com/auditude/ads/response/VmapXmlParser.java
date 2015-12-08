// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.network.vast.loader.VASTXMLParser;
import com.auditude.ads.network.vast.model.VASTAd;
import com.auditude.ads.network.vast.model.VASTDocument;
import com.auditude.ads.network.vast.model.VASTWrapperAd;
import com.auditude.ads.util.XMLUtil;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.auditude.ads.response:
//            VmapXmlNode

public class VmapXmlParser
{

    private VASTAd parentAd;
    private XmlPullParser parser;
    private VmapXmlNode rootNode;

    public VmapXmlParser()
    {
        parentAd = null;
    }

    private VmapXmlNode parseNode()
        throws XmlPullParserException, IOException
    {
        VmapXmlNode vmapxmlnode;
        int i;
        vmapxmlnode = new VmapXmlNode();
        vmapxmlnode.setName(parser.getName());
        setAttributes(vmapxmlnode);
        i = parser.next();
_L2:
        if (i == 3)
        {
            return vmapxmlnode;
        }
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("VAST".equalsIgnoreCase(parser.getName()))
        {
            VASTDocument vastdocument = parseVAST(parentAd);
            if (vastdocument != null)
            {
                vmapxmlnode.addVastDocument(vastdocument);
            }
        } else
        {
            if ("AdSource".equalsIgnoreCase(parser.getName()))
            {
                VASTWrapperAd vastwrapperad = new VASTWrapperAd();
                vastwrapperad.followAdditionalWrappers = Boolean.valueOf(XMLUtil.attributeAsBoolOrDefault(parser, "followRedirects", true));
                boolean flag = false;
                AdSettings adsettings = AuditudeEnv.getInstance().getAdSettings();
                if (adsettings.getProperty("fallbackOnInvalidCreative") != null)
                {
                    flag = Boolean.valueOf(adsettings.getProperty("fallbackOnInvalidCreative").toString()).booleanValue();
                }
                parentAd = new VASTAd(XMLUtil.attributeAsStringOrDefault(parser, "id", String.valueOf(Math.round(Math.random() * 1000D))), Boolean.valueOf(flag));
                parentAd.setWrapperAd(vastwrapperad);
            }
            vmapxmlnode.addChild(parseNode());
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 4) goto _L4; else goto _L3
_L3:
        vmapxmlnode.setValue(parser.getText());
          goto _L4
    }

    private VASTDocument parseVAST(VASTAd vastad)
        throws XmlPullParserException, IOException
    {
        Object obj1 = null;
        int i = parser.getEventType();
        parser.getName();
        do
        {
            String s1 = parser.getName();
            int j = i;
            String s = s1;
            Object obj = obj1;
            if (i == 2)
            {
                j = i;
                s = s1;
                obj = obj1;
                if ("VAST".equalsIgnoreCase(s1))
                {
                    obj = new VASTXMLParser();
                    obj.parentAd = vastad;
                    obj = ((VASTXMLParser) (obj)).parse(parser);
                    j = parser.getEventType();
                    s = parser.getName();
                }
            }
            if (j == 3 && "VAST".equalsIgnoreCase(s))
            {
                return ((VASTDocument) (obj));
            }
            i = parser.next();
            obj1 = obj;
        } while (true);
    }

    private void setAttributes(VmapXmlNode vmapxmlnode)
    {
        if (vmapxmlnode == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = parser.getAttributeCount();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        vmapxmlnode.setAttribute(parser.getAttributeName(i), parser.getAttributeValue(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ArrayList getChildNodes()
    {
        return rootNode.getChildNodes();
    }

    public ArrayList getChildeNodesByName(String s)
    {
        return rootNode.getChildeNodesByName(s);
    }

    public void parseXML(String s)
        throws XmlPullParserException, IOException
    {
        if (s == null || s.length() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        XmlPullParserFactory xmlpullparserfactory = XmlPullParserFactory.newInstance();
        xmlpullparserfactory.setNamespaceAware(true);
        parser = xmlpullparserfactory.newPullParser();
        parser.setInput(new StringReader(s));
        i = parser.getEventType();
_L5:
        if (i != 1) goto _L3; else goto _L2
_L2:
        return;
_L3:
        if (i != 0 && i != 1 && i == 2)
        {
            rootNode = parseNode();
        }
        i = parser.next();
        if (true) goto _L5; else goto _L4
_L4:
    }
}
