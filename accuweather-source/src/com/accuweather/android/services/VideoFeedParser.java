// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.VideoModel;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class VideoFeedParser extends DefaultHandler
{

    private static final String CONTENT_XML_NAME = "content";
    private static final String DESCRIPTION_XML_NAME = "description";
    private static final String FAILURE_XML_NAME = "failure";
    private static final String ITEM_XML_NAME = "item";
    private static final String NEWLINE = "\r\n";
    private static final String PUBDATE_XML_NAME = "pubdate";
    private static final String THUMBNAIL_XML_NAME = "thumbnail";
    private static final String TITLE_XML_NAME = "title";
    private static final String URL_XML_NAME = "url";
    private boolean isStartElem;
    private int level;
    private List tags;
    private ArrayList videoModels;
    private VideoModel videoObj;

    public VideoFeedParser()
    {
        tags = new ArrayList();
        level = 0;
        isStartElem = false;
        videoModels = new ArrayList();
    }

    public void characters(char ac[], int i, int j)
    {
        ac = (new String(ac, i, j)).trim();
        if (isStartElem && !ac.equalsIgnoreCase("\r\n") && !ac.equalsIgnoreCase(null) && level == 4)
        {
            if (((String)tags.get(3)).equalsIgnoreCase("title"))
            {
                videoObj.setName((new StringBuilder()).append(videoObj.getName()).append(ac).toString());
            } else
            {
                if (((String)tags.get(3)).equalsIgnoreCase("description"))
                {
                    videoObj.setDescription((new StringBuilder()).append(videoObj.getDescription()).append(ac).toString());
                    return;
                }
                if (((String)tags.get(3)).equalsIgnoreCase("pubdate"))
                {
                    videoObj.setDate((new StringBuilder()).append(videoObj.getDate()).append(ac).toString());
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
        if (s1.trim().equalsIgnoreCase("item"))
        {
            videoModels.add(videoObj);
        }
    }

    public ArrayList getVideosList()
    {
        return videoModels;
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        isStartElem = true;
        level = level + 1;
        s = s1.trim();
        tags.add(s);
        if (s.equalsIgnoreCase("item"))
        {
            videoObj = new VideoModel();
        } else
        {
            if (s.equalsIgnoreCase("content"))
            {
                videoObj.setUrl(attributes.getValue("url"));
                return;
            }
            if (s.equalsIgnoreCase("thumbnail"))
            {
                videoObj.setThumbnailUrl(attributes.getValue("url"));
                return;
            }
            if (s.equalsIgnoreCase("failure"))
            {
                throw new SAXException();
            }
        }
    }
}
