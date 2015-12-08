// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.DmaModel;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DmaFeedParser extends DefaultHandler
{

    private static final String DMAENTRY = "dmaentry";
    private static final String FAILURE = "failure";
    private static final String MARKETID = "marketid";
    private static final String MOBILELOGO = "mobilelogo";
    private static final String MOBILEURL = "mobileurl";
    private List dmaModels;
    private DmaModel dmaObj;
    private boolean isStartElem;
    private int level;
    private List tags;

    public DmaFeedParser()
    {
        tags = new ArrayList();
        level = 0;
        isStartElem = false;
        dmaModels = new ArrayList();
    }

    public void characters(char ac[], int i, int j)
    {
        ac = (new String(ac, i, j)).trim();
        if (isStartElem && !ac.equals("\r\n") && !ac.equals(null) && level == 4)
        {
            if (((String)tags.get(3)).equalsIgnoreCase("marketid"))
            {
                dmaObj.setMarketId((new StringBuilder()).append(dmaObj.getMarketId()).append(ac).toString());
            } else
            {
                if (((String)tags.get(3)).equalsIgnoreCase("mobilelogo"))
                {
                    dmaObj.setMobileLogo((new StringBuilder()).append(dmaObj.getMobileLogo()).append(ac).toString());
                    return;
                }
                if (((String)tags.get(3)).equalsIgnoreCase("mobileurl"))
                {
                    dmaObj.setMobileUrl((new StringBuilder()).append(dmaObj.getMobileUrl()).append(ac).toString());
                    return;
                }
            }
        }
    }

    public void endDocument()
    {
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        isStartElem = false;
        level = level - 1;
        tags.remove(level);
        if (s1.trim().equalsIgnoreCase("dmaentry"))
        {
            dmaModels.add(dmaObj);
        }
    }

    public List getDmaModels()
    {
        return dmaModels;
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        isStartElem = true;
        level = level + 1;
        s = s1.trim();
        tags.add(s);
        if (s.equalsIgnoreCase("dmaentry"))
        {
            dmaObj = new DmaModel();
        } else
        if (s.equalsIgnoreCase("failure"))
        {
            throw new SAXException();
        }
    }
}
