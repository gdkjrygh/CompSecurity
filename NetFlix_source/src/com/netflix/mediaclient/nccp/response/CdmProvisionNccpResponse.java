// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp.response;

import android.util.Base64;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.nccp.BaseNccpResponse;
import com.netflix.mediaclient.util.XmlDomUtils;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public final class CdmProvisionNccpResponse extends BaseNccpResponse
{

    protected static final String KCE_KEY_ID = "nccp:kcekeyid";
    protected static final String KCH_KEY_ID = "nccp:kchkeyid";
    protected static final String KEYRESPONSE = "nccp:keyresponse";
    private byte kcekeyid[];
    private byte kchkeyid[];
    private byte keyResponse[];

    public CdmProvisionNccpResponse(String s)
        throws IOException, ParserConfigurationException, SAXException
    {
        super(s);
    }

    private void handleKceKeyId(NodeList nodelist)
    {
        for (int i = 0; i < nodelist.getLength(); i++)
        {
            org.w3c.dom.Node node = nodelist.item(i);
            if (!(node instanceof Element))
            {
                continue;
            }
            kcekeyid = Base64.decode(XmlDomUtils.getElementText((Element)node), 0);
            if (Log.isLoggable("nf_nccp", 3))
            {
                Log.d("nf_nccp", (new StringBuilder()).append("Kce key id found  after unbase: ").append(new String(kcekeyid)).toString());
            }
        }

    }

    private void handleKchKeyId(NodeList nodelist)
    {
        for (int i = 0; i < nodelist.getLength(); i++)
        {
            org.w3c.dom.Node node = nodelist.item(i);
            if (!(node instanceof Element))
            {
                continue;
            }
            kchkeyid = Base64.decode(XmlDomUtils.getElementText((Element)node), 0);
            if (Log.isLoggable("nf_nccp", 3))
            {
                Log.d("nf_nccp", (new StringBuilder()).append("Kch key id found  after unbase: ").append(new String(kchkeyid)).toString());
            }
        }

    }

    private void handleKeyResponse(NodeList nodelist)
    {
        for (int i = 0; i < nodelist.getLength(); i++)
        {
            org.w3c.dom.Node node = nodelist.item(i);
            if (node instanceof Element)
            {
                keyResponse = Base64.decode(XmlDomUtils.getElementText((Element)node), 0);
            }
        }

    }

    private void handleResult(Element element)
    {
        handleKeyResponse(element.getElementsByTagName("nccp:keyresponse"));
        handleKceKeyId(element.getElementsByTagName("nccp:kcekeyid"));
        handleKchKeyId(element.getElementsByTagName("nccp:kchkeyid"));
    }

    public byte[] getKcekeyId()
    {
        return kcekeyid;
    }

    public byte[] getKchkeyId()
    {
        return kchkeyid;
    }

    public byte[] getKeyResponse()
    {
        return keyResponse;
    }

    public boolean getStatus()
    {
        return false;
    }

    public String getTransaction()
    {
        return "cdmprovision";
    }

    protected void parseResult(NodeList nodelist)
    {
        for (int i = 0; i < nodelist.getLength(); i++)
        {
            org.w3c.dom.Node node = nodelist.item(i);
            if (node instanceof Element)
            {
                Log.d("nf_nccp", "Result found");
                handleResult((Element)node);
            }
        }

    }
}
