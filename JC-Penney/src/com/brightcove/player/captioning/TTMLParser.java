// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.util.Log;
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

    private static final String a = com/brightcove/player/captioning/TTMLParser.getSimpleName();
    private static final Pattern b = Pattern.compile("^(\\d{2}+):(\\d{2}+):(\\d{2}+)[:.](\\d{2,3}+)$");

    private TTMLParser()
    {
    }

    private static int a(int i, int j, int k, int l)
    {
        return 0x36ee80 * i + 60000 * j + k * 1000 + l;
    }

    private static TTMLDocument a(XmlPullParser xmlpullparser)
    {
        Object obj = new HashMap();
        ArrayList arraylist = new ArrayList();
        xmlpullparser.require(2, Namespaces.DEFAULT, "tt");
        Block block = null;
        Map map = null;
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
                    arraylist.add(e(xmlpullparser));
                }
            }
        } while (true);
        xmlpullparser.require(1, Namespaces.DEFAULT, null);
        return new TTMLDocument(((Map) (obj)), map, block, arraylist);
    }

    private static String a(StringBuilder stringbuilder)
    {
        return stringbuilder.toString();
    }

    private static void a(Block block, XmlPullParser xmlpullparser)
    {
        if (block != null)
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
                return;
            }
        }
    }

    private static void a(Element element, XmlPullParser xmlpullparser)
    {
        if (element != null)
        {
            if (!StringUtil.isEmpty(xmlpullparser = xmlpullparser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "id")))
            {
                element.setID(xmlpullparser);
                return;
            }
        }
    }

    private static void a(Region region, XmlPullParser xmlpullparser)
    {
        if (region != null)
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
                return;
            }
        }
    }

    private static void a(StyledElement styledelement, XmlPullParser xmlpullparser)
    {
        if (styledelement != null)
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
                return;
            }
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
                StyledElement styledelement = d(xmlpullparser);
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
                Region region = f(xmlpullparser);
                hashmap.put(region.getID(), region);
            }
        } while (true);
        xmlpullparser.require(3, Namespaces.DEFAULT, "layout");
        return hashmap;
    }

    private static StyledElement d(XmlPullParser xmlpullparser)
    {
        xmlpullparser.require(2, Namespaces.DEFAULT, "style");
        StyledElement styledelement = new StyledElement();
        a(styledelement, xmlpullparser);
        a(styledelement, xmlpullparser);
        return styledelement;
    }

    private static BrightcoveClosedCaption e(XmlPullParser xmlpullparser)
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
                        span.setText(a(stringbuilder));
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
                        span2.setText(a(stringbuilder));
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
                span.setText(a(stringbuilder));
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
            xmlpullparser.setText(a(stringbuilder));
            arraylist.add(xmlpullparser);
            arraylist1.add(arraylist);
        } else
        {
            arraylist1.add(arraylist);
        }
        brightcoveclosedcaption.setLines(arraylist1);
        return brightcoveclosedcaption;
    }

    private static Region f(XmlPullParser xmlpullparser)
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
        return region;
    }

    public static int parseTimeValue(String s)
    {
        if (StringUtil.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        int i;
        Object obj = b.matcher(s);
        if (!((Matcher) (obj)).find() || ((Matcher) (obj)).groupCount() < 4)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        String s1 = ((Matcher) (obj)).group(1);
        String s2 = ((Matcher) (obj)).group(2);
        String s3 = ((Matcher) (obj)).group(3);
        obj = ((Matcher) (obj)).group(4);
        if (StringUtil.isEmpty(s1) || StringUtil.isEmpty(s2) || StringUtil.isEmpty(s3) || StringUtil.isEmpty(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        i = a(Integer.parseInt(s1), Integer.parseInt(s2), Integer.parseInt(s3), Integer.parseInt(((String) (obj))));
        return i;
        NumberFormatException numberformatexception;
        numberformatexception;
        Log.w(a, (new StringBuilder()).append("got invalid time format for caption: ").append(s).toString());
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
        Log.i(a, (new StringBuilder()).append("detected XML encoding for TTML is: ").append(((XmlPullParser) (obj)).getInputEncoding()).toString());
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


    private class Namespaces
    {

        public static final String DEFAULT = null;
        public static final String TTM = "http://www.w3.org/ns/ttml#metadata";
        public static final String TTS = "http://www.w3.org/ns/ttml#styling";
        public static final String XML = "http://www.w3.org/XML/1998/namespace";


        public Namespaces()
        {
        }
    }

}
