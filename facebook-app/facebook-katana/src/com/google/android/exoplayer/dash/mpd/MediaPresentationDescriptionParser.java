// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.MimeTypes;
import com.google.android.exoplayer.util.UriUtil;
import com.google.android.exoplayer.util.Util;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            AdaptationSet, Representation, ContentProtection, MediaPresentationDescription, 
//            Period, RangedUri, UrlTemplate, UtcTimingElement, 
//            SegmentBase

public class MediaPresentationDescriptionParser extends DefaultHandler
    implements com.google.android.exoplayer.upstream.UriLoadable.Parser
{

    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private final String b;
    private final XmlPullParserFactory c;

    public MediaPresentationDescriptionParser()
    {
        this(null);
    }

    private MediaPresentationDescriptionParser(String s)
    {
        b = s;
        try
        {
            c = XmlPullParserFactory.newInstance();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", s);
        }
    }

    private static int a(int i, int j)
    {
        int k;
        if (i == -1)
        {
            k = j;
        } else
        {
            k = i;
            if (j != -1)
            {
                boolean flag;
                if (i == j)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Assertions.b(flag);
                return i;
            }
        }
        return k;
    }

    private static int a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ("audio".equals(s))
            {
                return 1;
            }
            if ("video".equals(s))
            {
                return 0;
            }
            if ("text".equals(s))
            {
                return 2;
            }
        }
        return -1;
    }

    private static int a(XmlPullParser xmlpullparser, String s, int i)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return i;
        } else
        {
            return Integer.parseInt(xmlpullparser);
        }
    }

    private static Format a(String s, String s1, int i, int j, float f1, int k, int l, int i1, 
            String s2, String s3)
    {
        return new Format(s, s1, i, j, f1, k, l, i1, s2, s3);
    }

    private static AdaptationSet a(int i, int j, List list, List list1)
    {
        return new AdaptationSet(i, j, list, list1);
    }

    private AdaptationSet a(XmlPullParser xmlpullparser, String s, long l, long l1, SegmentBase segmentbase)
    {
        int i1 = a(xmlpullparser, "id", -1);
        String s3 = xmlpullparser.getAttributeValue(null, "mimeType");
        String s2 = xmlpullparser.getAttributeValue(null, "lang");
        int k = a(xmlpullparser.getAttributeValue(null, "contentType"));
        int i = k;
        if (k == -1)
        {
            i = b(xmlpullparser.getAttributeValue(null, "mimeType"));
        }
        ContentProtectionsBuilder contentprotectionsbuilder = new ContentProtectionsBuilder();
        ArrayList arraylist = new ArrayList();
        String s1 = s;
        s = segmentbase;
        segmentbase = s2;
        k = i;
        do
        {
            xmlpullparser.next();
            int j;
            if (e(xmlpullparser, "BaseURL"))
            {
                s1 = f(xmlpullparser, s1);
                j = k;
            } else
            if (e(xmlpullparser, "ContentProtection"))
            {
                contentprotectionsbuilder.a(b(xmlpullparser));
                j = k;
            } else
            if (e(xmlpullparser, "ContentComponent"))
            {
                segmentbase = b(segmentbase, xmlpullparser.getAttributeValue(null, "lang"));
                j = a(k, a(xmlpullparser.getAttributeValue(null, "contentType")));
            } else
            if (e(xmlpullparser, "Representation"))
            {
                Representation representation = a(xmlpullparser, s1, l, l1, s3, ((String) (segmentbase)), ((SegmentBase) (s)), contentprotectionsbuilder);
                contentprotectionsbuilder.a();
                j = a(k, b(representation.c.b));
                arraylist.add(representation);
            } else
            if (e(xmlpullparser, "SegmentBase"))
            {
                s = a(xmlpullparser, s1, (SegmentBase.SingleSegmentBase)s);
                j = k;
            } else
            if (e(xmlpullparser, "SegmentList"))
            {
                s = a(xmlpullparser, s1, (SegmentBase.SegmentList)s, l1);
                j = k;
            } else
            if (e(xmlpullparser, "SegmentTemplate"))
            {
                s = a(xmlpullparser, s1, (SegmentBase.SegmentTemplate)s, l1);
                j = k;
            } else
            {
                d(xmlpullparser);
                j = k;
            }
            k = j;
        } while (!d(xmlpullparser, "AdaptationSet"));
        return a(i1, j, ((List) (arraylist)), ((List) (contentprotectionsbuilder.b())));
    }

    private static ContentProtection a(String s, UUID uuid, byte abyte0[])
    {
        return new ContentProtection(s, uuid, abyte0);
    }

    private static MediaPresentationDescription a(long l, long l1, long l2, boolean flag, long l3, long l4, UtcTimingElement utctimingelement, String s, List list)
    {
        return new MediaPresentationDescription(l, l1, l2, flag, l3, l4, utctimingelement, s, list);
    }

    private MediaPresentationDescription a(XmlPullParser xmlpullparser, String s)
    {
        String s1;
        UtcTimingElement utctimingelement;
        UtcTimingElement utctimingelement1;
        String s2;
        String s3;
        ArrayList arraylist;
        long l3;
        long l2 = c(xmlpullparser, "availabilityStartTime", -1L);
        l3 = b(xmlpullparser, "mediaPresentationDuration", -1L);
        long l4 = b(xmlpullparser, "minBufferTime", -1L);
        s1 = xmlpullparser.getAttributeValue(null, "type");
        long l;
        long l1;
        boolean flag;
        if (s1 != null)
        {
            flag = s1.equals("dynamic");
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l = b(xmlpullparser, "minimumUpdatePeriod", -1L);
        } else
        {
            l = -1L;
        }
        if (flag)
        {
            l1 = b(xmlpullparser, "timeShiftBufferDepth", -1L);
        } else
        {
            l1 = -1L;
        }
        utctimingelement = null;
        s1 = null;
        arraylist = new ArrayList();
_L6:
        xmlpullparser.next();
        if (!e(xmlpullparser, "BaseURL"))
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = f(xmlpullparser, s);
        s2 = s1;
        utctimingelement1 = utctimingelement;
_L4:
        utctimingelement = utctimingelement1;
        s1 = s2;
        s = s3;
        if (d(xmlpullparser, "MPD"))
        {
            return a(l2, l3, l4, flag, l, l1, utctimingelement1, s2, ((List) (arraylist)));
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_101;
_L1:
        if (e(xmlpullparser, "UTCTiming"))
        {
            utctimingelement1 = a(xmlpullparser);
            s2 = s1;
            s3 = s;
        } else
        if (e(xmlpullparser, "Period"))
        {
            arraylist.add(a(xmlpullparser, s, l3));
            utctimingelement1 = utctimingelement;
            s2 = s1;
            s3 = s;
        } else
        {
            utctimingelement1 = utctimingelement;
            s2 = s1;
            s3 = s;
            if (e(xmlpullparser, "Location"))
            {
                s2 = xmlpullparser.nextText();
                utctimingelement1 = utctimingelement;
                s3 = s;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static Period a(String s, long l, long l1, List list)
    {
        return new Period(s, l, l1, list);
    }

    private Period a(XmlPullParser xmlpullparser, String s, long l)
    {
        String s1;
        String s3;
        ArrayList arraylist;
        long l1;
        s3 = xmlpullparser.getAttributeValue(null, "id");
        l1 = b(xmlpullparser, "start", 0L);
        l = b(xmlpullparser, "duration", l);
        Object obj = null;
        arraylist = new ArrayList();
        s1 = s;
        s = obj;
_L2:
        String s2;
        xmlpullparser.next();
        if (!e(xmlpullparser, "BaseURL"))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = f(xmlpullparser, s1);
_L3:
        s1 = s2;
        if (d(xmlpullparser, "Period"))
        {
            return a(s3, l1, l, ((List) (arraylist)));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (e(xmlpullparser, "AdaptationSet"))
        {
            arraylist.add(a(xmlpullparser, s1, l1, l, ((SegmentBase) (s))));
            s2 = s1;
        } else
        if (e(xmlpullparser, "SegmentBase"))
        {
            s = a(xmlpullparser, s1, ((SegmentBase.SingleSegmentBase) (null)));
            s2 = s1;
        } else
        if (e(xmlpullparser, "SegmentList"))
        {
            s = a(xmlpullparser, s1, ((SegmentBase.SegmentList) (null)), l);
            s2 = s1;
        } else
        {
            s2 = s1;
            if (e(xmlpullparser, "SegmentTemplate"))
            {
                s = a(xmlpullparser, s1, ((SegmentBase.SegmentTemplate) (null)), l);
                s2 = s1;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static RangedUri a(String s, String s1, long l, long l1)
    {
        return new RangedUri(s, s1, l, l1);
    }

    private RangedUri a(XmlPullParser xmlpullparser, String s, String s1, String s2)
    {
        s1 = xmlpullparser.getAttributeValue(null, s1);
        long l = 0L;
        long l2 = -1L;
        xmlpullparser = xmlpullparser.getAttributeValue(null, s2);
        long l1 = l2;
        if (xmlpullparser != null)
        {
            xmlpullparser = xmlpullparser.split("-");
            long l3 = Long.parseLong(xmlpullparser[0]);
            l = l3;
            l1 = l2;
            if (xmlpullparser.length == 2)
            {
                l1 = (Long.parseLong(xmlpullparser[1]) - l3) + 1L;
                l = l3;
            }
        }
        return a(s, s1, l, l1);
    }

    private static Representation a(long l, long l1, String s, int i, Format format, SegmentBase segmentbase)
    {
        return Representation.a(l, l1, s, i, format, segmentbase);
    }

    private Representation a(XmlPullParser xmlpullparser, String s, long l, long l1, String s1, 
            String s2, SegmentBase segmentbase, ContentProtectionsBuilder contentprotectionsbuilder)
    {
        String s3;
        Object obj;
        int j;
        int k;
        int i1;
        int j1;
        s3 = xmlpullparser.getAttributeValue(null, "id");
        j = g(xmlpullparser, "bandwidth");
        k = g(xmlpullparser, "audioSamplingRate");
        i1 = g(xmlpullparser, "width");
        j1 = g(xmlpullparser, "height");
        obj = xmlpullparser.getAttributeValue(null, "frameRate");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = a.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj)).matches()) goto _L2; else goto _L3
_L3:
        float f1;
        int i;
        i = Integer.parseInt(((Matcher) (obj)).group(1));
        obj = ((Matcher) (obj)).group(2);
        String s4;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            f1 = (float)i / (float)Integer.parseInt(((String) (obj)));
        } else
        {
            f1 = i;
        }
_L5:
        obj = a(xmlpullparser, "mimeType", s1);
        s4 = a(xmlpullparser, "codecs", ((String) (null)));
        i = -1;
        s1 = segmentbase;
        do
        {
            xmlpullparser.next();
            if (e(xmlpullparser, "BaseURL"))
            {
                s = f(xmlpullparser, s);
                segmentbase = s1;
                s1 = s;
                s = segmentbase;
            } else
            if (e(xmlpullparser, "AudioChannelConfiguration"))
            {
                i = Integer.parseInt(xmlpullparser.getAttributeValue(null, "value"));
                segmentbase = s;
                s = s1;
                s1 = segmentbase;
            } else
            if (e(xmlpullparser, "SegmentBase"))
            {
                segmentbase = a(xmlpullparser, s, (SegmentBase.SingleSegmentBase)s1);
                s1 = s;
                s = segmentbase;
            } else
            if (e(xmlpullparser, "SegmentList"))
            {
                segmentbase = a(xmlpullparser, s, (SegmentBase.SegmentList)s1, l1);
                s1 = s;
                s = segmentbase;
            } else
            if (e(xmlpullparser, "SegmentTemplate"))
            {
                segmentbase = a(xmlpullparser, s, (SegmentBase.SegmentTemplate)s1, l1);
                s1 = s;
                s = segmentbase;
            } else
            {
                if (e(xmlpullparser, "ContentProtection"))
                {
                    contentprotectionsbuilder.b(b(xmlpullparser));
                }
                segmentbase = s;
                s = s1;
                s1 = segmentbase;
            }
            if (d(xmlpullparser, "Representation"))
            {
                xmlpullparser = a(s3, ((String) (obj)), i1, j1, f1, i, k, j, s2, s4);
                s2 = b;
                if (s == null)
                {
                    s = new SegmentBase.SingleSegmentBase(s1);
                }
                return a(l, l1, s2, -1, ((Format) (xmlpullparser)), ((SegmentBase) (s)));
            }
            segmentbase = s1;
            s1 = s;
            s = segmentbase;
        } while (true);
_L2:
        f1 = -1F;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static SegmentBase.SegmentList a(RangedUri rangeduri, long l, long l1, long l2, int i, 
            long l3, List list, List list1)
    {
        return new SegmentBase.SegmentList(rangeduri, l, l1, l2, i, l3, list, list1);
    }

    private SegmentBase.SegmentList a(XmlPullParser xmlpullparser, String s, SegmentBase.SegmentList segmentlist, long l)
    {
        Object obj;
        List list;
        RangedUri rangeduri;
        Object obj1;
        RangedUri rangeduri1;
        List list1;
        int i;
        long l1;
        long l2;
        long l3;
        if (segmentlist != null)
        {
            l1 = segmentlist.b;
        } else
        {
            l1 = 1L;
        }
        l2 = d(xmlpullparser, "timescale", l1);
        if (segmentlist != null)
        {
            l1 = segmentlist.c;
        } else
        {
            l1 = 0L;
        }
        l3 = d(xmlpullparser, "presentationTimeOffset", l1);
        if (segmentlist != null)
        {
            l1 = segmentlist.f;
        } else
        {
            l1 = -1L;
        }
        l1 = d(xmlpullparser, "duration", l1);
        if (segmentlist != null)
        {
            i = segmentlist.e;
        } else
        {
            i = 1;
        }
        i = a(xmlpullparser, "startNumber", i);
        rangeduri1 = null;
        list1 = null;
        obj1 = null;
_L3:
        xmlpullparser.next();
        if (!e(xmlpullparser, "Initialization")) goto _L2; else goto _L1
_L1:
        rangeduri = b(xmlpullparser, s);
        list = list1;
        obj = obj1;
_L4:
        obj1 = obj;
        list1 = list;
        rangeduri1 = rangeduri;
        if (d(xmlpullparser, "SegmentList"))
        {
            if (segmentlist != null)
            {
                if (rangeduri == null)
                {
                    rangeduri = segmentlist.a;
                }
                if (list != null)
                {
                    xmlpullparser = list;
                } else
                {
                    xmlpullparser = segmentlist.g;
                }
                if (obj == null)
                {
                    obj = segmentlist.h;
                }
            } else
            {
                xmlpullparser = list;
            }
            return a(rangeduri, l2, l3, l, i, l1, ((List) (xmlpullparser)), ((List) (obj)));
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (e(xmlpullparser, "SegmentTimeline"))
        {
            list = c(xmlpullparser);
            obj = obj1;
            rangeduri = rangeduri1;
        } else
        {
            obj = obj1;
            list = list1;
            rangeduri = rangeduri1;
            if (e(xmlpullparser, "SegmentURL"))
            {
                obj = obj1;
                if (obj1 == null)
                {
                    obj = new ArrayList();
                }
                ((List) (obj)).add(c(xmlpullparser, s));
                list = list1;
                rangeduri = rangeduri1;
            }
        }
          goto _L4
    }

    private static SegmentBase.SegmentTemplate a(RangedUri rangeduri, long l, long l1, long l2, int i, 
            long l3, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1, String s)
    {
        return new SegmentBase.SegmentTemplate(rangeduri, l, l1, l2, i, l3, list, urltemplate, urltemplate1, s);
    }

    private SegmentBase.SegmentTemplate a(XmlPullParser xmlpullparser, String s, SegmentBase.SegmentTemplate segmenttemplate, long l)
    {
        Object obj;
        RangedUri rangeduri;
        RangedUri rangeduri1;
        Object obj1;
        UrlTemplate urltemplate;
        UrlTemplate urltemplate1;
        int i;
        long l1;
        long l2;
        long l3;
        if (segmenttemplate != null)
        {
            l1 = segmenttemplate.b;
        } else
        {
            l1 = 1L;
        }
        l2 = d(xmlpullparser, "timescale", l1);
        if (segmenttemplate != null)
        {
            l1 = segmenttemplate.c;
        } else
        {
            l1 = 0L;
        }
        l3 = d(xmlpullparser, "presentationTimeOffset", l1);
        if (segmenttemplate != null)
        {
            l1 = segmenttemplate.f;
        } else
        {
            l1 = -1L;
        }
        l1 = d(xmlpullparser, "duration", l1);
        if (segmenttemplate != null)
        {
            i = segmenttemplate.e;
        } else
        {
            i = 1;
        }
        i = a(xmlpullparser, "startNumber", i);
        if (segmenttemplate != null)
        {
            obj = segmenttemplate.i;
        } else
        {
            obj = null;
        }
        urltemplate = a(xmlpullparser, "media", ((UrlTemplate) (obj)));
        if (segmenttemplate != null)
        {
            obj = segmenttemplate.h;
        } else
        {
            obj = null;
        }
        urltemplate1 = a(xmlpullparser, "initialization", ((UrlTemplate) (obj)));
        rangeduri1 = null;
        obj1 = null;
_L3:
        xmlpullparser.next();
        if (!e(xmlpullparser, "Initialization")) goto _L2; else goto _L1
_L1:
        rangeduri = b(xmlpullparser, s);
        obj = obj1;
_L4:
        obj1 = obj;
        rangeduri1 = rangeduri;
        if (d(xmlpullparser, "SegmentTemplate"))
        {
            if (segmenttemplate != null)
            {
                if (rangeduri == null)
                {
                    rangeduri = segmenttemplate.a;
                }
                if (obj == null)
                {
                    obj = segmenttemplate.g;
                }
                xmlpullparser = ((XmlPullParser) (obj));
            } else
            {
                xmlpullparser = ((XmlPullParser) (obj));
            }
            return a(rangeduri, l2, l3, l, i, l1, ((List) (xmlpullparser)), urltemplate1, urltemplate, s);
        }
        if (true) goto _L3; else goto _L2
_L2:
        obj = obj1;
        rangeduri = rangeduri1;
        if (e(xmlpullparser, "SegmentTimeline"))
        {
            obj = c(xmlpullparser);
            rangeduri = rangeduri1;
        }
          goto _L4
    }

    private static SegmentBase.SegmentTimelineElement a(long l, long l1)
    {
        return new SegmentBase.SegmentTimelineElement(l, l1);
    }

    private static SegmentBase.SingleSegmentBase a(RangedUri rangeduri, long l, long l1, String s, long l2, 
            long l3)
    {
        return new SegmentBase.SingleSegmentBase(rangeduri, l, l1, s, l2, l3);
    }

    private SegmentBase.SingleSegmentBase a(XmlPullParser xmlpullparser, String s, SegmentBase.SingleSegmentBase singlesegmentbase)
    {
        Object obj;
        long l;
        long l1;
        long l2;
        long l3;
        if (singlesegmentbase != null)
        {
            l = singlesegmentbase.b;
        } else
        {
            l = 1L;
        }
        l2 = d(xmlpullparser, "timescale", l);
        if (singlesegmentbase != null)
        {
            l = singlesegmentbase.c;
        } else
        {
            l = 0L;
        }
        l3 = d(xmlpullparser, "presentationTimeOffset", l);
        if (singlesegmentbase != null)
        {
            l = singlesegmentbase.e;
        } else
        {
            l = 0L;
        }
        if (singlesegmentbase != null)
        {
            l1 = singlesegmentbase.f;
        } else
        {
            l1 = -1L;
        }
        obj = xmlpullparser.getAttributeValue(null, "indexRange");
        if (obj != null)
        {
            String as[] = ((String) (obj)).split("-");
            l = Long.parseLong(as[0]);
            l1 = (Long.parseLong(as[1]) - l) + 1L;
        }
        if (singlesegmentbase != null)
        {
            singlesegmentbase = singlesegmentbase.a;
        } else
        {
            singlesegmentbase = null;
        }
        do
        {
            xmlpullparser.next();
            as = singlesegmentbase;
            if (e(xmlpullparser, "Initialization"))
            {
                as = b(xmlpullparser, s);
            }
            singlesegmentbase = as;
        } while (!d(xmlpullparser, "SegmentBase"));
        return a(((RangedUri) (as)), l2, l3, s, l, l1);
    }

    private static UrlTemplate a(XmlPullParser xmlpullparser, String s, UrlTemplate urltemplate)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser != null)
        {
            urltemplate = UrlTemplate.a(xmlpullparser);
        }
        return urltemplate;
    }

    private static UtcTimingElement a(String s, String s1)
    {
        return new UtcTimingElement(s, s1);
    }

    private UtcTimingElement a(XmlPullParser xmlpullparser)
    {
        return a(xmlpullparser.getAttributeValue(null, "schemeIdUri"), xmlpullparser.getAttributeValue(null, "value"));
    }

    private static String a(XmlPullParser xmlpullparser, String s, String s1)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return s1;
        } else
        {
            return xmlpullparser;
        }
    }

    private static int b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (MimeTypes.a(s))
            {
                return 1;
            }
            if (MimeTypes.b(s))
            {
                return 0;
            }
            if (MimeTypes.c(s) || MimeTypes.d(s))
            {
                return 2;
            }
        }
        return -1;
    }

    private static long b(XmlPullParser xmlpullparser, String s, long l)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return l;
        } else
        {
            return Util.c(xmlpullparser);
        }
    }

    private ContentProtection b(XmlPullParser xmlpullparser)
    {
        byte abyte1[] = null;
        String s = xmlpullparser.getAttributeValue(null, "schemeIdUri");
        UUID uuid = null;
        byte abyte0[];
        UUID uuid1;
        do
        {
            xmlpullparser.next();
            abyte0 = abyte1;
            uuid1 = uuid;
            if (e(xmlpullparser, "cenc:pssh"))
            {
                abyte0 = abyte1;
                uuid1 = uuid;
                if (xmlpullparser.next() == 4)
                {
                    abyte0 = Base64.decode(xmlpullparser.getText(), 0);
                    uuid = PsshAtomUtil.a(abyte0);
                    uuid1 = uuid;
                    if (uuid == null)
                    {
                        throw new ParserException("Invalid pssh atom in cenc:pssh element");
                    }
                }
            }
            abyte1 = abyte0;
            uuid = uuid1;
        } while (!d(xmlpullparser, "ContentProtection"));
        return a(s, uuid1, abyte0);
    }

    private RangedUri b(XmlPullParser xmlpullparser, String s)
    {
        return a(xmlpullparser, s, "sourceURL", "range");
    }

    private static String b(String s, String s1)
    {
        String s2;
        if (s == null)
        {
            s2 = s1;
        } else
        {
            s2 = s;
            if (s1 != null)
            {
                Assertions.b(s.equals(s1));
                return s;
            }
        }
        return s2;
    }

    private static long c(XmlPullParser xmlpullparser, String s, long l)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return l;
        } else
        {
            return Util.d(xmlpullparser);
        }
    }

    private RangedUri c(XmlPullParser xmlpullparser, String s)
    {
        return a(xmlpullparser, s, "media", "mediaRange");
    }

    private List c(XmlPullParser xmlpullparser)
    {
        ArrayList arraylist = new ArrayList();
        long l = 0L;
        do
        {
            xmlpullparser.next();
            long l1 = l;
            if (e(xmlpullparser, "S"))
            {
                l = d(xmlpullparser, "t", l);
                long l2 = h(xmlpullparser, "d");
                int j = a(xmlpullparser, "r", 0);
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j + 1)
                    {
                        break;
                    }
                    arraylist.add(a(l, l2));
                    i++;
                    l += l2;
                } while (true);
            }
            l = l1;
        } while (!d(xmlpullparser, "SegmentTimeline"));
        return arraylist;
    }

    private static long d(XmlPullParser xmlpullparser, String s, long l)
    {
        xmlpullparser = xmlpullparser.getAttributeValue(null, s);
        if (xmlpullparser == null)
        {
            return l;
        } else
        {
            return Long.parseLong(xmlpullparser);
        }
    }

    private static boolean d(XmlPullParser xmlpullparser)
    {
        return xmlpullparser.getEventType() == 2;
    }

    private static boolean d(XmlPullParser xmlpullparser, String s)
    {
        return xmlpullparser.getEventType() == 3 && s.equals(xmlpullparser.getName());
    }

    private static boolean e(XmlPullParser xmlpullparser, String s)
    {
        return xmlpullparser.getEventType() == 2 && s.equals(xmlpullparser.getName());
    }

    private static String f(XmlPullParser xmlpullparser, String s)
    {
        xmlpullparser.next();
        return UriUtil.b(s, xmlpullparser.getText());
    }

    private static int g(XmlPullParser xmlpullparser, String s)
    {
        return a(xmlpullparser, s, -1);
    }

    private static long h(XmlPullParser xmlpullparser, String s)
    {
        return d(xmlpullparser, s, -1L);
    }

    public final MediaPresentationDescription a(String s, InputStream inputstream)
    {
        XmlPullParser xmlpullparser;
        try
        {
            xmlpullparser = c.newPullParser();
            xmlpullparser.setInput(inputstream, null);
            if (xmlpullparser.next() != 2 || !"MPD".equals(xmlpullparser.getName()))
            {
                throw new ParserException("inputStream does not contain a valid media presentation description");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ParserException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ParserException(s);
        }
        s = a(xmlpullparser, s);
        return s;
    }

    public final Object b(String s, InputStream inputstream)
    {
        return a(s, inputstream);
    }


    private class ContentProtectionsBuilder
        implements Comparator
    {

        private ArrayList a;
        private ArrayList b;
        private ArrayList c;
        private boolean d;

        private static int a(ContentProtection contentprotection, ContentProtection contentprotection1)
        {
            return contentprotection.a.compareTo(contentprotection1.a);
        }

        private static void a(List list, ContentProtection contentprotection)
        {
            if (!list.contains(contentprotection))
            {
                int i = 0;
                while (i < list.size()) 
                {
                    boolean flag;
                    if (!((ContentProtection)list.get(i)).a.equals(contentprotection.a))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Assertions.b(flag);
                    i++;
                }
                list.add(contentprotection);
            }
        }

        public final void a()
        {
            boolean flag = true;
            if (!d)
            {
                if (c != null)
                {
                    Collections.sort(c, this);
                }
                b = c;
                d = true;
            } else
            if (c == null)
            {
                if (b != null)
                {
                    flag = false;
                }
                Assertions.b(flag);
            } else
            {
                Collections.sort(c, this);
                Assertions.b(c.equals(b));
            }
            c = null;
        }

        public final void a(ContentProtection contentprotection)
        {
            if (a == null)
            {
                a = new ArrayList();
            }
            a(((List) (a)), contentprotection);
        }

        public final ArrayList b()
        {
            if (a == null)
            {
                return b;
            }
            if (b == null)
            {
                return a;
            }
            for (int i = 0; i < b.size(); i++)
            {
                a(a, (ContentProtection)b.get(i));
            }

            return a;
        }

        public final void b(ContentProtection contentprotection)
        {
            if (c == null)
            {
                c = new ArrayList();
            }
            a(c, contentprotection);
        }

        public final int compare(Object obj, Object obj1)
        {
            return a((ContentProtection)obj, (ContentProtection)obj1);
        }

        protected ContentProtectionsBuilder()
        {
        }
    }

}
