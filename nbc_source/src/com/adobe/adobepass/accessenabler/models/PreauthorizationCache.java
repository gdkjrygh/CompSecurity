// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import com.adobe.adobepass.accessenabler.utils.Log;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// Referenced classes of package com.adobe.adobepass.accessenabler.models:
//            PreauthorizationCacheEntry

public class PreauthorizationCache
{

    static final String LOG_TAG = "StorageManager";
    private String xml;

    public PreauthorizationCache(String s)
    {
        xml = s;
    }

    private List parsePreauthorizeMessage(String s)
        throws Exception
    {
        Object obj = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource inputsource = new InputSource();
        inputsource.setCharacterStream(new StringReader(s));
        s = ((DocumentBuilder) (obj)).parse(inputsource);
        s.getDocumentElement().normalize();
        s = s.getElementsByTagName("resource");
        obj = new ArrayList();
        int i = 0;
        for (int j = s.getLength(); i < j; i++)
        {
            ((ArrayList) (obj)).add(new PreauthorizationCacheEntry(s.item(i).getChildNodes().item(0).getTextContent(), s.item(i).getChildNodes().item(1).getTextContent().toLowerCase().equals("true")));
        }

        return ((List) (obj));
    }

    public List getPreauthorizedResources()
    {
        List list;
        try
        {
            list = parsePreauthorizeMessage(xml);
        }
        catch (Exception exception)
        {
            Log.d("StorageManager", exception.getMessage());
            return Collections.emptyList();
        }
        return list;
    }

    public String getXML()
    {
        return xml;
    }
}
