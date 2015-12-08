// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.loader;

import com.auditude.ads.network.vast.model.VASTAd;
import com.auditude.ads.network.vast.model.VASTAdBase;
import com.auditude.ads.network.vast.model.VASTAdCreativeBase;
import com.auditude.ads.network.vast.model.VASTClick;
import com.auditude.ads.network.vast.model.VASTCompanionCreative;
import com.auditude.ads.network.vast.model.VASTDocument;
import com.auditude.ads.network.vast.model.VASTInlineAd;
import com.auditude.ads.network.vast.model.VASTLinearCreative;
import com.auditude.ads.network.vast.model.VASTMediaFile;
import com.auditude.ads.network.vast.model.VASTNonLinearCreative;
import com.auditude.ads.network.vast.model.VASTTrackingEvent;
import com.auditude.ads.network.vast.model.VASTTrackingUrl;
import com.auditude.ads.network.vast.model.VASTWrapperAd;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.PingUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.XMLUtil;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class VASTXMLParser
{

    private static final String AD = "Ad";
    private static final String AD_PARAMETERS = "AdParameters";
    private static final String AD_SYSTEM = "AdSystem";
    private static final String AD_TITLE = "AdTitle";
    private static final String ALT_TEXT = "AltText";
    private static final String API_FRAMEWORK = "apiFramework";
    private static final String BITRATE = "bitrate";
    private static final String CLICK_THROUGH = "ClickThrough";
    private static final String CLICK_TRACKING = "ClickTracking";
    private static final String COMPANION = "Companion";
    private static final String COMPANION_ADS = "CompanionAds";
    private static final String COMPANION_CLICK_THROUGH = "CompanionClickThrough";
    private static final String COMPANION_CLICK_TRACKING = "CompanionClickTracking";
    private static final String CREATIVES = "Creatives";
    private static final String CREATIVE_TYPE = "creativeType";
    private static final String CUSTOM_CLICK = "CustomClick";
    private static final String DELIVERY = "delivery";
    private static final String DESCRIPTION = "Description";
    private static final String DURATION = "Duration";
    private static final String ERROR = "Error";
    private static final String EVENT = "event";
    private static final String EXPANDED_HEIGHT = "expandedHeight";
    private static final String EXPANDED_WIDTH = "expandedWidth";
    private static final String EXTENSION = "Extension";
    private static final String EXTENSIONS = "Extensions";
    private static final String HEIGHT = "height";
    private static final String HTML_RESOURCE = "HTMLResource";
    private static final String ID = "id";
    private static final String IFRAME_RESOURCE = "IFrameResource";
    private static final String IMPRESSION = "Impression";
    private static final String INLINE = "InLine";
    private static final String LINEAR = "Linear";
    private static final String MAINTAIN_ASPECT_RATIO = "maintainAspectRatio";
    private static final String MEDIA_FILE = "MediaFile";
    private static final String MEDIA_FILES = "MediaFiles";
    private static final String NON_LINEAR = "NonLinear";
    private static final String NON_LINEAR_ADS = "NonLinearAds";
    private static final String NON_LINEAR_CLICK_THROUGH = "NonLinearClickThrough";
    private static final String OFFSET = "offset";
    private static final String ROOT_TAG = "VAST";
    private static final String SCALABLE = "scalable";
    private static final String SKIPOFFSET = "skipoffset";
    private static final String STATIC_RESOURCE = "StaticResource";
    private static final String SURVEY = "Survey";
    private static final String TRACKING = "Tracking";
    private static final String TRACKING_EVENTS = "TrackingEvents";
    private static final String TYPE = "type";
    private static final String VAST_AD_TAG_URI = "VASTAdTagURI";
    private static final String VERSION = "version";
    private static final String VIDEO_CLICKS = "VideoClicks";
    private static final String WIDTH = "width";
    private static final String WRAPPER = "Wrapper";
    public VASTAd parentAd;
    private XmlPullParser parser;

    public VASTXMLParser()
    {
    }

    private void logVastError(VASTInlineAd vastinlinead, int i)
    {
        if (vastinlinead != null && vastinlinead.errorUrl != null && vastinlinead.errorUrl.length() > 0)
        {
            PingUtil.pingUrl(AuditudeUtil.substituteTags(vastinlinead.errorUrl.replaceAll("\\[ERRORCODE\\]", String.valueOf(i)).replaceAll("%5BERRORCODE%5D", String.valueOf(i))));
        }
    }

    private VASTAd parseAd()
        throws XmlPullParserException, IOException
    {
        VASTAd vastad;
        int i;
        vastad = new VASTAd(XMLUtil.attributeAsStringOrDefault(parser, "id", null), parentAd.getFallbackOnInvalidCreative());
        vastad.setSequence(XMLUtil.attributeAsIntOrDefault(parser, "sequence", -1));
        i = 2;
_L2:
        Object obj;
        obj = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("InLine".equalsIgnoreCase(((String) (obj))))
        {
            parseVASTAdBase(vastad, new VASTInlineAd());
        } else
        if ("Wrapper".equalsIgnoreCase(((String) (obj))))
        {
            obj = new VASTWrapperAd();
            obj.followAdditionalWrappers = Boolean.valueOf(XMLUtil.attributeAsBoolOrDefault(parser, "followAdditionalWrappers", true));
            obj.fallbackOnNoAd = XMLUtil.attributeAsStringOrDefault(parser, "fallbackOnNoAd", null);
            obj.allowMultipleAds = XMLUtil.attributeAsStringOrDefault(parser, "allowMultipleAds", null);
            parseVASTAdBase(vastad, ((VASTInlineAd) (obj)));
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"Ad".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
        return vastad;
    }

    private void parseAdCreativeBaseAttributes(VASTAdCreativeBase vastadcreativebase)
    {
        vastadcreativebase.id = XMLUtil.attributeAsStringOrDefault(parser, "id", null);
        vastadcreativebase.width = XMLUtil.attributeAsIntOrDefault(parser, "width", 0);
        vastadcreativebase.height = XMLUtil.attributeAsIntOrDefault(parser, "height", 0);
        vastadcreativebase.expandedWidth = XMLUtil.attributeAsIntOrDefault(parser, "expandedWidth", 0);
        vastadcreativebase.expandedHeight = XMLUtil.attributeAsIntOrDefault(parser, "expandedHeight", 0);
        vastadcreativebase.apiFramework = XMLUtil.attributeAsStringOrDefault(parser, "apiFramework", null);
    }

    private void parseCompanionAds(VASTInlineAd vastinlinead, String s)
        throws XmlPullParserException, IOException
    {
        String s1;
        int i;
        s1 = null;
        i = parser.next();
_L2:
        String s2;
        s2 = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("Companion".equalsIgnoreCase(s2))
        {
            s = new VASTCompanionCreative();
            parseAdCreativeBaseAttributes(s);
            vastinlinead.addCompanionAd(s);
        } else
        if ("CompanionClickThrough".equalsIgnoreCase(s2))
        {
            s = s1;
            if (s1 != null)
            {
                s1.clickThroughUrl = parser.nextText().replaceAll("\t", "");
                s = s1;
            }
        } else
        if ("CompanionClickTracking".equalsIgnoreCase(s2))
        {
            s1.addClickTrakingUrl(parser.nextText().replaceAll("\t", ""));
            s = s1;
        } else
        if ("AdParameters".equalsIgnoreCase(s2))
        {
            s1.adParameters = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        if ("AltText".equalsIgnoreCase(s2))
        {
            s1.altText = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        if ("TrackingEvents".equalsIgnoreCase(s2))
        {
            s = s1;
            if (s1 != null)
            {
                parseTrackingEvents(s1);
                s = s1;
            }
        } else
        if ("StaticResource".equalsIgnoreCase(s2))
        {
            s1.creativeType = XMLUtil.attributeAsStringOrDefault(parser, "creativeType", null);
            s1.resourceType = "static";
            s1.url = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        if ("IFrameResource".equalsIgnoreCase(s2) && ((VASTCompanionCreative) (s1)).resourceType != "static")
        {
            s1.resourceType = "iframe";
            s1.url = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        {
            s = s1;
            if ("HTMLResource".equalsIgnoreCase(s2))
            {
                s = s1;
                if (((VASTCompanionCreative) (s1)).resourceType == null)
                {
                    s1.resourceType = "html";
                    s1.url = parser.nextText().replaceAll("\t", "");
                    s = s1;
                }
            }
        }
_L3:
        i = parser.next();
        s1 = s;
        if (true) goto _L2; else goto _L1
_L1:
        s = s1;
        if (i == 3)
        {
            if ("Companion".equalsIgnoreCase(s2))
            {
                s = null;
            } else
            {
                s = s1;
                if ("CompanionAds".equalsIgnoreCase(s2))
                {
                    return;
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void parseCreatives(VASTInlineAd vastinlinead, String s)
        throws XmlPullParserException, IOException
    {
        int i = parser.next();
_L2:
        String s1;
        s1 = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("Linear".equalsIgnoreCase(s1))
        {
            parseLinearAd(vastinlinead, s);
        } else
        if ("NonLinearAds".equalsIgnoreCase(s1))
        {
            parseNonLinearAds(vastinlinead, s);
        } else
        if ("CompanionAds".equalsIgnoreCase(s1))
        {
            String s2 = XMLUtil.attributeAsStringOrDefault(parser, "required", "none");
            s1 = s2;
            if (s2.length() <= 0)
            {
                s1 = "none";
            }
            vastinlinead.companionRequired = s1;
            parseCompanionAds(vastinlinead, s);
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"Creatives".equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
    }

    private void parseExtensions(VASTAdBase vastadbase)
        throws XmlPullParserException, IOException
    {
        int i = parser.next();
_L2:
        String s;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("Extension".equalsIgnoreCase(s))
        {
            vastadbase.addExtension(parser.getText());
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"Extensions".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
    }

    private void parseLinearAd(VASTInlineAd vastinlinead, String s)
        throws XmlPullParserException, IOException
    {
        VASTLinearCreative vastlinearcreative;
        int i;
        vastlinearcreative = new VASTLinearCreative();
        vastlinearcreative.adId = s;
        s = XMLUtil.attributeAsStringOrDefault(parser, "skipoffset", null);
        if (s != null && (s.matches("(^[-.0-9]+:[-.0-9]+:[-.0-9]+$)") || s.matches("(^[-.0-9]+%)")))
        {
            vastinlinead.setSkipOffset(s);
        }
        i = parser.next();
_L2:
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("TrackingEvents".equalsIgnoreCase(s))
        {
            parseTrackingEvents(vastlinearcreative);
        } else
        if ("Duration".equalsIgnoreCase(s))
        {
            vastlinearcreative.duration = StringUtil.parseDuration(parser.nextText().replaceAll("\t", ""));
        } else
        if ("AdParameters".equalsIgnoreCase(s))
        {
            vastlinearcreative.adParameters = parser.nextText().replaceAll("\t", "");
        } else
        if ("VideoClicks".equalsIgnoreCase(s))
        {
            parseLinearClick(vastlinearcreative);
        } else
        if ("MediaFiles".equalsIgnoreCase(s))
        {
            parseMediaFiles(vastlinearcreative);
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"Linear".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
        if (vastlinearcreative.getMediaFiles() != null && vastlinearcreative.getMediaFiles().size() > 0)
        {
            vastlinearcreative.apiFramework = ((VASTMediaFile)vastlinearcreative.getMediaFiles().get(0)).apiFramework;
        }
        vastinlinead.linearAd = vastlinearcreative;
        if (!(vastinlinead instanceof VASTWrapperAd) && (vastinlinead.linearAd == null || vastinlinead.linearAd.getMediaFiles() == null || vastinlinead.linearAd.getMediaFiles().size() <= 0 || vastinlinead.linearAd.duration <= 0))
        {
            vastinlinead.asInvalideXML = Boolean.valueOf(true);
        }
        return;
    }

    private void parseLinearClick(VASTLinearCreative vastlinearcreative)
        throws XmlPullParserException, IOException
    {
        VASTClick vastclick;
        int i;
        vastclick = new VASTClick();
        i = parser.next();
_L2:
        String s;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("ClickThrough".equalsIgnoreCase(s))
        {
            vastclick.setUrl(parser.nextText().replaceAll("\t", ""));
        } else
        if ("ClickTracking".equalsIgnoreCase(s))
        {
            vastclick.addClickTrackingUrl(parser.nextText().replaceAll("\t", ""));
        } else
        if ("CustomClick".equalsIgnoreCase(s))
        {
            vastclick.addCustomClickUrl(parser.nextText().replaceAll("\t", ""));
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"VideoClicks".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
        vastlinearcreative.click = vastclick;
        return;
    }

    private void parseMediaFiles(VASTLinearCreative vastlinearcreative)
        throws XmlPullParserException, IOException
    {
        int i = parser.next();
_L2:
        Object obj;
        obj = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("MediaFile".equalsIgnoreCase(((String) (obj))))
        {
            obj = new VASTMediaFile();
            obj.id = XMLUtil.attributeAsStringOrDefault(parser, "id", null);
            obj.bitrate = XMLUtil.attributeAsIntOrDefault(parser, "bitrate", 0);
            obj.width = XMLUtil.attributeAsIntOrDefault(parser, "width", 0);
            obj.height = XMLUtil.attributeAsIntOrDefault(parser, "height", 0);
            obj.delivery = XMLUtil.attributeAsStringOrDefault(parser, "delivery", null);
            obj.type = XMLUtil.attributeAsStringOrDefault(parser, "type", null);
            obj.scalable = XMLUtil.attributeAsBoolOrDefault(parser, "scalable", true);
            obj.maintainAspectRatio = XMLUtil.attributeAsBoolOrDefault(parser, "maintainAspectRatio", true);
            obj.apiFramework = XMLUtil.attributeAsStringOrDefault(parser, "apiFramework", null);
            obj.url = parser.nextText().replaceAll("\t", "");
            vastlinearcreative.addMediaFile(((VASTMediaFile) (obj)));
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"MediaFiles".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
    }

    private void parseNonLinearAds(VASTInlineAd vastinlinead, String s)
        throws XmlPullParserException, IOException
    {
        String s1;
        VASTAdCreativeBase vastadcreativebase;
        int i;
        vastadcreativebase = new VASTAdCreativeBase();
        s1 = null;
        i = parser.next();
_L2:
        String s2;
        s2 = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("NonLinear".equalsIgnoreCase(s2))
        {
            s = new VASTNonLinearCreative();
            parseAdCreativeBaseAttributes(s);
            s.scalable = XMLUtil.attributeAsBoolOrDefault(parser, "scalable", true);
            s.maintainAspectRatio = XMLUtil.attributeAsBoolOrDefault(parser, "maintainAspectRatio", true);
            vastinlinead.addNonLinearAd(s);
        } else
        if ("NonLinearClickThrough".equalsIgnoreCase(s2))
        {
            s = s1;
            if (s1 != null)
            {
                s1.clickThroughUrl = parser.nextText().replaceAll("\t", "");
                s = s1;
            }
        } else
        if ("AdParameters".equalsIgnoreCase(s2))
        {
            s1.adParameters = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        if ("TrackingEvents".equalsIgnoreCase(s2))
        {
            if (s1 != null)
            {
                parseTrackingEvents(s1);
                s = s1;
            } else
            {
                parseTrackingEvents(vastadcreativebase);
                s = s1;
            }
        } else
        if ("StaticResource".equalsIgnoreCase(s2))
        {
            s1.creativeType = XMLUtil.attributeAsStringOrDefault(parser, "creativeType", null);
            s1.resourceType = "static";
            s1.url = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        if ("IFrameResource".equalsIgnoreCase(s2))
        {
            s1.resourceType = "iframe";
            s1.url = parser.nextText().replaceAll("\t", "");
            s = s1;
        } else
        {
            s = s1;
            if ("HTMLResource".equalsIgnoreCase(s2))
            {
                s1.resourceType = "html";
                s1.url = parser.nextText().replaceAll("\t", "");
                s = s1;
            }
        }
_L3:
        i = parser.next();
        s1 = s;
        if (true) goto _L2; else goto _L1
_L1:
        s = s1;
        if (i == 3)
        {
            if ("NonLinear".equalsIgnoreCase(s2))
            {
                s = null;
            } else
            {
                s = s1;
                if ("NonLinearAds".equalsIgnoreCase(s2))
                {
                    if (vastadcreativebase.getTrackingEvents() != null && vastadcreativebase.getTrackingEvents().size() > 0)
                    {
                        vastinlinead.setNonLinearAdTrackingEvents(vastadcreativebase.getTrackingEvents());
                    }
                    return;
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void parseTrackingEvents(VASTAdCreativeBase vastadcreativebase)
        throws XmlPullParserException, IOException
    {
        int i = parser.next();
_L2:
        Object obj;
        obj = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("Tracking".equalsIgnoreCase(((String) (obj))))
        {
            String s = XMLUtil.attributeAsStringOrDefault(parser, "event", null);
            if (!StringUtil.isNullOrEmpty(s))
            {
                Object obj1 = vastadcreativebase.getTrackingEventByType(s);
                obj = obj1;
                if (obj1 == null)
                {
                    obj = new VASTTrackingEvent(s);
                    vastadcreativebase.addTrackingEvent(((VASTTrackingEvent) (obj)));
                }
                obj1 = XMLUtil.attributeAsStringOrDefault(parser, "offset", null);
                VASTTrackingUrl vasttrackingurl = new VASTTrackingUrl(parser.nextText().replaceAll("\t", ""), s);
                if (obj1 != null && s.equalsIgnoreCase("progress"))
                {
                    if (((String) (obj1)).matches("(^[-.0-9]+%)"))
                    {
                        vasttrackingurl.setOffset(StringUtil.convertToInt(((String) (obj1)).substring(0, ((String) (obj1)).indexOf("%"))));
                        vasttrackingurl.setOffsetIsPercent(Boolean.valueOf(true));
                        ((VASTTrackingEvent) (obj)).addTrackingUrl(vasttrackingurl);
                    } else
                    if (((String) (obj1)).matches("(^[-.0-9]+:[-.0-9]+:[-.0-9]+$)"))
                    {
                        vasttrackingurl.setOffset(StringUtil.parseDuration(((String) (obj1))) * 1000);
                        vasttrackingurl.setOffsetIsPercent(Boolean.valueOf(false));
                        ((VASTTrackingEvent) (obj)).addTrackingUrl(vasttrackingurl);
                    } else
                    if (((String) (obj1)).matches("(^[0-9]+$)"))
                    {
                        vasttrackingurl.setOffset(StringUtil.convertToInt(((String) (obj1))) * 1000);
                        vasttrackingurl.setOffsetIsPercent(Boolean.valueOf(false));
                        ((VASTTrackingEvent) (obj)).addTrackingUrl(vasttrackingurl);
                    }
                } else
                {
                    ((VASTTrackingEvent) (obj)).addTrackingUrl(vasttrackingurl);
                }
            }
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"TrackingEvents".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
    }

    private void parseVASTAdBase(VASTAd vastad, VASTInlineAd vastinlinead)
        throws XmlPullParserException, IOException
    {
        int i;
        i = parser.next();
        vastinlinead.setNetworkAdId(vastad.getID());
_L2:
        String s;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("VASTAdTagURI".equalsIgnoreCase(s))
        {
            if (vastinlinead instanceof VASTWrapperAd)
            {
                ((VASTWrapperAd)vastinlinead).source = parser.nextText().replaceAll("\t", "");
            }
        } else
        if ("AdSystem".equalsIgnoreCase(s))
        {
            vastinlinead.adSystem = parser.nextText().replaceAll("\t", "");
        } else
        if ("AdTitle".equalsIgnoreCase(s))
        {
            vastinlinead.adTitle = parser.nextText().replaceAll("\t", "");
        } else
        if ("Description".equalsIgnoreCase(s))
        {
            vastinlinead.description = parser.nextText().replaceAll("\t", "");
        } else
        if ("Survey".equalsIgnoreCase(s))
        {
            vastinlinead.surveyUrl = parser.nextText().replaceAll("\t", "");
        } else
        if ("Error".equalsIgnoreCase(s))
        {
            vastinlinead.errorUrl = parser.nextText().replaceAll("\t", "");
        } else
        if ("Impression".equalsIgnoreCase(s))
        {
            vastinlinead.addImpressionUrl(new VASTTrackingUrl(parser.nextText().replaceAll("\t", ""), "creativeview"));
        } else
        if ("Creatives".equalsIgnoreCase(s))
        {
            parseCreatives(vastinlinead, vastad.getID());
        } else
        if ("Extensions".equalsIgnoreCase(s))
        {
            parseExtensions(vastinlinead);
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3) goto _L4; else goto _L3
_L3:
        if (vastinlinead.linearAd != null && vastinlinead.errorUrl != null && vastinlinead.errorUrl.length() > 0)
        {
            VASTTrackingEvent vasttrackingevent1 = vastinlinead.linearAd.getTrackingEventByType("vasterror");
            VASTTrackingEvent vasttrackingevent = vasttrackingevent1;
            if (vasttrackingevent1 == null)
            {
                vasttrackingevent = new VASTTrackingEvent("vasterror");
                vastinlinead.linearAd.addTrackingEvent(vasttrackingevent);
            }
            vasttrackingevent.addTrackingUrl(new VASTTrackingUrl(vastinlinead.errorUrl, "vasterror"));
        }
        if ("Wrapper".equalsIgnoreCase(s) && (vastinlinead instanceof VASTWrapperAd))
        {
            vastad.setWrapperAd((VASTWrapperAd)vastinlinead);
            return;
        }
        if ("InLine".equalsIgnoreCase(s))
        {
            if (vastinlinead.asInvalideXML.booleanValue())
            {
                logVastError(vastinlinead, 101);
                return;
            } else
            {
                vastad.addInlineAds(vastinlinead);
                return;
            }
        }
          goto _L4
    }

    private VASTDocument parseXML(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        Object obj;
        int i;
        obj = null;
        i = xmlpullparser.getEventType();
_L2:
        Object obj1;
        if (i == 1)
        {
            return ((VASTDocument) (obj));
        }
        switch (i)
        {
        default:
            obj1 = obj;
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_192;
        }
_L3:
        i = xmlpullparser.next();
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        String s = xmlpullparser.getName();
        if (s.equalsIgnoreCase("VAST"))
        {
            obj = XMLUtil.attributeAsStringOrDefault(xmlpullparser, "version", null);
            if (StringUtil.isNullOrEmpty(((String) (obj))))
            {
                return null;
            }
            if (!"2.0".equals(obj) && !"2.0.0".equals(obj) && !"2.0.1".equals(obj) && !"3.0".equals(obj))
            {
                return null;
            }
            obj1 = new VASTDocument(parentAd);
            obj1.version = ((String) (obj));
        } else
        {
            obj1 = obj;
            if (s.equalsIgnoreCase("Ad"))
            {
                VASTAd vastad = parseAd();
                obj1 = obj;
                if (vastad != null)
                {
                    ((VASTDocument) (obj)).addVASTAd(vastad);
                    obj1 = obj;
                }
            }
        }
          goto _L3
        obj1 = obj;
        if (xmlpullparser.getName().equalsIgnoreCase("VAST"))
        {
            return ((VASTDocument) (obj));
        }
          goto _L3
    }

    public final VASTDocument parse(String s)
        throws IOException, XmlPullParserException
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return null;
        } else
        {
            parser = XmlPullParserFactory.newInstance().newPullParser();
            parser.setInput(new StringReader(s));
            return parseXML(parser);
        }
    }

    public final VASTDocument parse(XmlPullParser xmlpullparser)
        throws IOException, XmlPullParserException
    {
        parser = xmlpullparser;
        return parseXML(parser);
    }
}
