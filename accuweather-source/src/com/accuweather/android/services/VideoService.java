// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

// Referenced classes of package com.accuweather.android.services:
//            BaseDataRetrievalService, IVideoService, VideoFeedParser

public class VideoService extends BaseDataRetrievalService
    implements IVideoService
{

    private static final String CANADA_CLIP_CODE = "CAN";
    private static final String CANADA_COUNTRY_CODE = "CA";
    private static final String CLIP_CODE_KEY = "reference_id";
    private static final String COMMAND = "find_playlist_by_reference_id";
    private static final String COMMAND_KEY = "command";
    private static final String NATIONAL_CLIP_CODE = "NATIONAL";
    private static final String OUTPUT = "mrss";
    private static final String OUTPUT_KEY = "output";
    private static final String PARTNER_KEY = "partner";
    private static final String TOKEN = "OaGu5WBaKpKfKXq_IrzfVHPyfNiX20u3pGLBh13L8GY.";
    private static final String TOKEN_KEY = "token";
    private static final String US_COUNTRY_CODE = "US";
    private static final String VIDEO_FEED_URL = "http://api.brightcove.com/services/library";
    private static final String WORLD_CLIP_CODE = "WORLD";

    public VideoService()
    {
    }

    private XMLReader buildXmlReader()
        throws ParserConfigurationException, SAXException
    {
        return SAXParserFactory.newInstance().newSAXParser().getXMLReader();
    }

    private String getClipCode(String s, String s1)
    {
        if (s.equals("US"))
        {
            s = s1;
            if (s1.equals(""))
            {
                s = "NATIONAL";
            }
            return s;
        }
        if (s.equals("CA"))
        {
            return "CAN";
        } else
        {
            return "WORLD";
        }
    }

    private List parseVideoInputSource(InputSource inputsource)
        throws ParserConfigurationException, SAXException, IOException
    {
        VideoFeedParser videofeedparser = new VideoFeedParser();
        XMLReader xmlreader = buildXmlReader();
        xmlreader.setContentHandler(videofeedparser);
        xmlreader.parse(inputsource);
        return videofeedparser.getVideosList();
    }

    public List retrieveVideos(String s, String s1, String s2)
        throws Exception
    {
        String s3;
        String s4;
        String s5;
        String s6;
        s3 = null;
        s5 = null;
        s6 = null;
        s4 = null;
        s = getInputStream(Uri.parse("http://api.brightcove.com/services/library").buildUpon().appendQueryParameter("token", "OaGu5WBaKpKfKXq_IrzfVHPyfNiX20u3pGLBh13L8GY.").appendQueryParameter("command", "find_playlist_by_reference_id").appendQueryParameter("output", "mrss").appendQueryParameter("reference_id", getClipCode(s1, s2)).appendQueryParameter("partner", s).build().toString());
        s4 = s;
        s3 = s;
        s5 = s;
        s6 = s;
        s1 = parseVideoInputSource(new InputSource(s));
        closeInputStream(s);
        return s1;
        s;
        s3 = s4;
        throw new ParserConfigurationException(s.getMessage());
        s;
        closeInputStream(s3);
        throw s;
        s;
        s3 = s5;
        throw new IOException(s.getMessage());
        s;
        s3 = s6;
        throw new SAXException(s.getMessage());
    }
}
