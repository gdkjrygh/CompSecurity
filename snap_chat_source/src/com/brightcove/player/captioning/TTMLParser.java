// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.util.Xml;
import com.brightcove.player.model.Block;
import com.brightcove.player.model.Element;
import com.brightcove.player.model.Length;
import com.brightcove.player.model.Region;
import com.brightcove.player.model.Span;
import com.brightcove.player.model.StyledElement;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.util.StringUtil;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.brightcove.player.captioning:
//            BrightcoveClosedCaption

public class TTMLParser
{
    public static class Attributes
    {

        public static final String BEGIN = "begin";
        public static final String BG_COLOR = "backgroundColor";
        public static final String COLOR = "color";
        public static final String DISPLAY_ALIGN = "displayAlign";
        public static final String END = "end";
        public static final String EXTENT = "extent";
        public static final String FONT_FAMILY = "fontFamily";
        public static final String FONT_SIZE = "fontSize";
        public static final String FONT_STYLE = "fontStyle";
        public static final String FONT_WEIGHT = "fontWeight";
        public static final String ID = "id";
        public static final String ORIGIN = "origin";
        public static final String REGION = "region";
        public static final String STYLE = "style";
        public static final String TEXT_ALIGN = "textAlign";
        public static final String TEXT_DECORATION = "textDecoration";

        public Attributes()
        {
        }
    }

    public static class Namespaces
    {

        public static final String DEFAULT = null;
        public static final String TTM = "http://www.w3.org/ns/ttml#metadata";
        public static final String TTS = "http://www.w3.org/ns/ttml#styling";
        public static final String XML = "http://www.w3.org/XML/1998/namespace";


        public Namespaces()
        {
        }
    }

    public static class Tags
    {

        public static final String BODY = "body";
        public static final String BR = "br";
        public static final String CAPTION = "p";
        public static final String HEAD = "head";
        public static final String LAYOUT = "layout";
        public static final String REGION = "region";
        public static final String ROOT = "tt";
        public static final String SPAN = "span";
        public static final String STYLE = "style";
        public static final String STYLING = "styling";

        public Tags()
        {
        }
    }


    private static final Pattern a = Pattern.compile("^(\\d{2}+):(\\d{2}+):(\\d{2}+)[:.](\\d{2,3}+)$");

    private TTMLParser()
    {
    }

    private static TTMLDocument a(XmlPullParser xmlpullparser)
    {
        Object obj = new HashMap();
        ArrayList arraylist = new ArrayList();
        xmlpullparser.require(2, Namespaces.DEFAULT, "tt");
        Map map = null;
        Block block = null;
        do
        {
            if (xmlpullparser.next() == 1)
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2)
            {
                String s = xmlpullparser.getName();
                if (s.equals("styling"))
                {
                    map = b(xmlpullparser);
                } else
                if (s.equals("layout"))
                {
                    obj = c(xmlpullparser);
                } else
                if (s.equals("body"))
                {
                    block = new Block();
                    a(((StyledElement) (block)), xmlpullparser);
                    a(block, xmlpullparser);
                } else
                if (s.equals("p"))
                {
                    arraylist.add(d(xmlpullparser));
                }
            }
        } while (true);
        xmlpullparser.require(1, Namespaces.DEFAULT, null);
        return new TTMLDocument(((Map) (obj)), map, block, arraylist);
    }

    private static void a(Block block, XmlPullParser xmlpullparser)
    {
        String s = xmlpullparser.getAttributeValue(Namespaces.DEFAULT, "begin");
        String s1 = xmlpullparser.getAttributeValue(Namespaces.DEFAULT, "end");
        int i = parseTimeValue(s);
        int j = parseTimeValue(s1);
        xmlpullparser = xmlpullparser.getAttributeValue(Namespaces.DEFAULT, "region");
        block.setBeginTime(i);
        block.setEndTime(j);
        if (!StringUtil.isEmpty(xmlpullparser))
        {
            block.setRegion(xmlpullparser);
        }
    }

    private static void a(Element element, XmlPullParser xmlpullparser)
    {
        xmlpullparser = xmlpullparser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "id");
        if (!StringUtil.isEmpty(xmlpullparser))
        {
            element.setID(xmlpullparser);
        }
    }

    private static void a(Region region, XmlPullParser xmlpullparser)
    {
        String s1 = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "origin");
        String s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "extent");
        xmlpullparser = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "displayAlign");
        if (!StringUtil.isEmpty(s1))
        {
            String as1[] = s1.split(" ");
            region.setOriginX(new Length(as1[0]));
            region.setOriginY(new Length(as1[1]));
        }
        if (!StringUtil.isEmpty(s))
        {
            String as[] = s.split(" ");
            region.setExtentX(new Length(as[0]));
            region.setExtentY(new Length(as[1]));
        }
        if (!StringUtil.isEmpty(xmlpullparser))
        {
            region.setDisplayAlign(com.brightcove.player.model.Region.DisplayAlign.fromString(xmlpullparser));
        }
    }

    private static void a(StyledElement styledelement, XmlPullParser xmlpullparser)
    {
        String s = xmlpullparser.getAttributeValue(Namespaces.DEFAULT, "style");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setStyleName(s);
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "color");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setColor(s);
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "backgroundColor");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setBackgroundColor(s);
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "fontStyle");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setFontStyle(com.brightcove.player.model.StyledElement.FontStyle.valueOf(s.toUpperCase()));
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "textAlign");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setTextAlign(com.brightcove.player.model.StyledElement.TextAlign.valueOf(s.toUpperCase()));
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "fontWeight");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setFontWeight(com.brightcove.player.model.StyledElement.FontWeight.valueOf(s.toUpperCase()));
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "textDecoration");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setTextDecoration(com.brightcove.player.model.StyledElement.TextDecoration.valueOf(s.toUpperCase()));
        }
        s = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "fontSize");
        if (!StringUtil.isEmpty(s))
        {
            styledelement.setFontSize(new Length(s));
        }
        xmlpullparser = xmlpullparser.getAttributeValue("http://www.w3.org/ns/ttml#styling", "fontFamily");
        if (!StringUtil.isEmpty(xmlpullparser))
        {
            styledelement.setFontFamily(xmlpullparser);
        }
    }

    private static Map b(XmlPullParser xmlpullparser)
    {
        xmlpullparser.require(2, Namespaces.DEFAULT, "styling");
        HashMap hashmap = new HashMap();
        do
        {
            if (xmlpullparser.next() == 3 && xmlpullparser.getName().equals("styling"))
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2 && xmlpullparser.getName().equals("style"))
            {
                xmlpullparser.require(2, Namespaces.DEFAULT, "style");
                StyledElement styledelement = new StyledElement();
                a(styledelement, xmlpullparser);
                a(styledelement, xmlpullparser);
                hashmap.put(styledelement.getID(), styledelement);
            }
        } while (true);
        xmlpullparser.require(3, Namespaces.DEFAULT, "styling");
        return hashmap;
    }

    private static Map c(XmlPullParser xmlpullparser)
    {
        xmlpullparser.require(2, Namespaces.DEFAULT, "layout");
        HashMap hashmap = new HashMap();
        do
        {
            if (xmlpullparser.next() == 3 && xmlpullparser.getName().equals("layout"))
            {
                break;
            }
            if (xmlpullparser.getEventType() == 2 && xmlpullparser.getName().equals("region"))
            {
                xmlpullparser.require(2, Namespaces.DEFAULT, "region");
                Region region = new Region();
                a(region, xmlpullparser);
                a(region, xmlpullparser);
                a(region, xmlpullparser);
                if (xmlpullparser.nextTag() == 2 && xmlpullparser.getName().equals("style"))
                {
                    a(region, xmlpullparser);
                    a(region, xmlpullparser);
                }
                hashmap.put(region.getID(), region);
            }
        } while (true);
        xmlpullparser.require(3, Namespaces.DEFAULT, "layout");
        return hashmap;
    }

    private static BrightcoveClosedCaption d(XmlPullParser xmlpullparser)
    {
        xmlpullparser.require(2, Namespaces.DEFAULT, "p");
        BrightcoveClosedCaption brightcoveclosedcaption = new BrightcoveClosedCaption();
        a(brightcoveclosedcaption, xmlpullparser);
        a(brightcoveclosedcaption, xmlpullparser);
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        Span span = new Span();
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (xmlpullparser.next() == 3 && xmlpullparser.getName().equals("p"))
            {
                break;
            }
            int i = xmlpullparser.getEventType();
            if (i == 4)
            {
                String s1 = xmlpullparser.getText();
                if (!StringUtil.isEmpty(s1))
                {
                    Span span1 = span;
                    if (span == null)
                    {
                        span1 = new Span();
                    }
                    stringbuilder.append(s1);
                    span = span1;
                }
            } else
            if (i == 2)
            {
                String s = xmlpullparser.getName();
                if (s.equals("span"))
                {
                    if (span != null)
                    {
                        span.setText(stringbuilder.toString());
                        arraylist.add(span);
                        stringbuilder.delete(0, stringbuilder.length());
                    }
                    span = new Span();
                    a(span, xmlpullparser);
                } else
                if (s.equals("br"))
                {
                    Span span2 = span;
                    if (stringbuilder.length() > 0)
                    {
                        span2 = span;
                        if (span == null)
                        {
                            span2 = new Span();
                        }
                        span2.setText(stringbuilder.toString());
                        arraylist.add(span2);
                        stringbuilder.delete(0, stringbuilder.length());
                        span2 = new Span(span2);
                    }
                    arraylist1.add(arraylist);
                    arraylist = new ArrayList();
                    span = span2;
                }
            } else
            if (i == 3 && xmlpullparser.getName().equals("span"))
            {
                span.setText(stringbuilder.toString());
                arraylist.add(span);
                span = null;
                stringbuilder.delete(0, stringbuilder.length());
            }
        } while (true);
        if (stringbuilder.length() > 0)
        {
            xmlpullparser = span;
            if (span == null)
            {
                xmlpullparser = new Span();
            }
            xmlpullparser.setText(stringbuilder.toString());
            arraylist.add(xmlpullparser);
            arraylist1.add(arraylist);
        } else
        {
            arraylist1.add(arraylist);
        }
        brightcoveclosedcaption.setLines(arraylist1);
        return brightcoveclosedcaption;
    }

    public static int parseTimeValue(String s)
    {
        if (StringUtil.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        int i;
        int j;
        int k;
        int l;
        Object obj = a.matcher(s);
        if (!((Matcher) (obj)).find() || ((Matcher) (obj)).groupCount() < 4)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        s = ((Matcher) (obj)).group(1);
        String s1 = ((Matcher) (obj)).group(2);
        String s2 = ((Matcher) (obj)).group(3);
        obj = ((Matcher) (obj)).group(4);
        if (StringUtil.isEmpty(s) || StringUtil.isEmpty(s1) || StringUtil.isEmpty(s2) || StringUtil.isEmpty(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        i = Integer.parseInt(s);
        j = Integer.parseInt(s1);
        k = Integer.parseInt(s2);
        l = Integer.parseInt(((String) (obj)));
        return l + (i * 0x36ee80 + j * 60000 + k * 1000);
        s;
        return -1;
    }

    public static TTMLDocument parseXml(InputStream inputstream, String s)
    {
        XmlPullParser xmlpullparser = XmlPullParserFactory.newInstance().newPullParser();
        xmlpullparser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        xmlpullparser.setInput(inputstream, s);
        xmlpullparser.nextTag();
        s = a(xmlpullparser);
        if (inputstream != null)
        {
            inputstream.close();
        }
        return s;
        s;
        if (inputstream != null)
        {
            inputstream.close();
        }
        throw s;
    }

    public static TTMLDocument parseXml(Reader reader)
    {
        Object obj;
        obj = Xml.newPullParser();
        ((XmlPullParser) (obj)).setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        ((XmlPullParser) (obj)).setInput(reader);
        ((XmlPullParser) (obj)).nextTag();
        (new StringBuilder("detected XML encoding for TTML is: ")).append(((XmlPullParser) (obj)).getInputEncoding());
        obj = a(((XmlPullParser) (obj)));
        if (reader != null)
        {
            reader.close();
        }
        return ((TTMLDocument) (obj));
        Exception exception;
        exception;
        if (reader != null)
        {
            reader.close();
        }
        throw exception;
    }

    static 
    {
        com/brightcove/player/captioning/TTMLParser.getSimpleName();
    }
}
