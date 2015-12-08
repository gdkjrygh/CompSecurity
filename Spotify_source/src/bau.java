// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer.ParserException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class bau extends DefaultHandler
    implements bdq
{

    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private final XmlPullParserFactory b;

    public bau()
    {
        this((byte)0);
    }

    private bau(byte byte0)
    {
        try
        {
            b = XmlPullParserFactory.newInstance();
            return;
        }
        catch (XmlPullParserException xmlpullparserexception)
        {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", xmlpullparserexception);
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
                bds.b(flag);
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

    private baq a(XmlPullParser xmlpullparser, String s, long l, long l1, bbb bbb)
    {
        Object obj;
        String s3;
        bav bav1;
        ArrayList arraylist;
        int i;
        a(xmlpullparser, "id", -1);
        s3 = xmlpullparser.getAttributeValue(null, "mimeType");
        obj = xmlpullparser.getAttributeValue(null, "lang");
        int j = a(xmlpullparser.getAttributeValue(null, "contentType"));
        i = j;
        if (j == -1)
        {
            i = b(xmlpullparser.getAttributeValue(null, "mimeType"));
        }
        bav1 = new bav();
        arraylist = new ArrayList();
        String s1 = s;
        s = ((String) (obj));
        obj = bbb;
        bbb = s1;
_L2:
        xmlpullparser.next();
        if (!c(xmlpullparser, "BaseURL"))
        {
            break; /* Loop/switch isn't completed */
        }
        bbb = d(xmlpullparser, bbb);
_L3:
        if (b(xmlpullparser, "AdaptationSet"))
        {
            return new baq(i, arraylist, bav1.a());
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (c(xmlpullparser, "ContentProtection"))
        {
            bar bar1 = a(xmlpullparser);
            if (bav1.a == null)
            {
                bav1.a = new ArrayList();
            }
            bav.a(bav1.a, bar1);
        } else
        if (c(xmlpullparser, "ContentComponent"))
        {
            String s2 = xmlpullparser.getAttributeValue(null, "lang");
            if (s == null)
            {
                s = s2;
            } else
            if (s2 != null)
            {
                bds.b(s.equals(s2));
            }
            i = a(i, a(xmlpullparser.getAttributeValue(null, "contentType")));
        } else
        if (c(xmlpullparser, "Representation"))
        {
            bay bay1 = a(xmlpullparser, ((String) (bbb)), l, l1, s3, ((bbb) (obj)), bav1);
            if (!bav1.d)
            {
                if (bav1.c != null)
                {
                    Collections.sort(bav1.c, bav1);
                }
                bav1.b = bav1.c;
                bav1.d = true;
            } else
            if (bav1.c == null)
            {
                boolean flag;
                if (bav1.b == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                bds.b(flag);
            } else
            {
                Collections.sort(bav1.c, bav1);
                bds.b(bav1.c.equals(bav1.b));
            }
            bav1.c = null;
            i = a(i, b(bay1.a.b));
            arraylist.add(bay1);
        } else
        if (c(xmlpullparser, "SegmentBase"))
        {
            obj = a(xmlpullparser, ((String) (bbb)), (bbg)obj);
        } else
        if (c(xmlpullparser, "SegmentList"))
        {
            obj = a(xmlpullparser, ((String) (bbb)), (bbd)obj, l1);
        } else
        if (c(xmlpullparser, "SegmentTemplate"))
        {
            obj = a(xmlpullparser, ((String) (bbb)), (bbe)obj, l1);
        } else
        {
            xmlpullparser.getEventType();
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static bar a(XmlPullParser xmlpullparser)
    {
        byte abyte1[] = null;
        String s = xmlpullparser.getAttributeValue(null, "schemeIdUri");
        java.util.UUID uuid = null;
        byte abyte0[];
        java.util.UUID uuid1;
        do
        {
            xmlpullparser.next();
            abyte0 = abyte1;
            uuid1 = uuid;
            if (c(xmlpullparser, "cenc:pssh"))
            {
                abyte0 = abyte1;
                uuid1 = uuid;
                if (xmlpullparser.next() == 4)
                {
                    abyte0 = Base64.decode(xmlpullparser.getText(), 0);
                    uuid = bcm.a(abyte0);
                    uuid1 = uuid;
                    if (uuid == null)
                    {
                        throw new ParserException("Invalid pssh atom in cenc:pssh element");
                    }
                }
            }
            abyte1 = abyte0;
            uuid = uuid1;
        } while (!b(xmlpullparser, "ContentProtection"));
        return new bar(s, uuid1, abyte0);
    }

    private baw a(XmlPullParser xmlpullparser, String s, long l)
    {
        String s1;
        ArrayList arraylist;
        long l1;
        xmlpullparser.getAttributeValue(null, "id");
        l1 = b(xmlpullparser, "start", 0L);
        l = b(xmlpullparser, "duration", l);
        arraylist = new ArrayList();
        Object obj = null;
        s1 = s;
        s = obj;
_L2:
        String s2;
        xmlpullparser.next();
        if (!c(xmlpullparser, "BaseURL"))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = d(xmlpullparser, s1);
_L3:
        s1 = s2;
        if (b(xmlpullparser, "Period"))
        {
            return new baw(arraylist);
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (c(xmlpullparser, "AdaptationSet"))
        {
            arraylist.add(a(xmlpullparser, s1, l1, l, ((bbb) (s))));
            s2 = s1;
        } else
        if (c(xmlpullparser, "SegmentBase"))
        {
            s = a(xmlpullparser, s1, ((bbg) (null)));
            s2 = s1;
        } else
        if (c(xmlpullparser, "SegmentList"))
        {
            s = a(xmlpullparser, s1, ((bbd) (null)), l);
            s2 = s1;
        } else
        {
            s2 = s1;
            if (c(xmlpullparser, "SegmentTemplate"))
            {
                s = a(xmlpullparser, s1, ((bbe) (null)), l);
                s2 = s1;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static bax a(XmlPullParser xmlpullparser, String s)
    {
        return a(xmlpullparser, s, "sourceURL", "range");
    }

    private static bax a(XmlPullParser xmlpullparser, String s, String s1, String s2)
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
                l1 = 1L + (Long.parseLong(xmlpullparser[1]) - l3);
                l = l3;
            }
        }
        return new bax(s, s1, l, l1);
    }

    private static bay a(XmlPullParser xmlpullparser, String s, long l, long l1, String s1, bbb bbb, 
            bav bav1)
    {
        String s2 = xmlpullparser.getAttributeValue(null, "id");
        int i = a(xmlpullparser, "bandwidth", -1);
        a(xmlpullparser, "audioSamplingRate", -1);
        int j = a(xmlpullparser, "width", -1);
        int k = a(xmlpullparser, "height", -1);
        Object obj = xmlpullparser.getAttributeValue(null, "frameRate");
        if (obj != null)
        {
            obj = a.matcher(((CharSequence) (obj)));
            if (((Matcher) (obj)).matches())
            {
                Integer.parseInt(((Matcher) (obj)).group(1));
                obj = ((Matcher) (obj)).group(2);
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    Integer.parseInt(((String) (obj)));
                }
            }
        }
        obj = a(xmlpullparser, "mimeType", s1);
        String s3 = a(xmlpullparser, "codecs", ((String) (null)));
        s1 = bbb;
        do
        {
            xmlpullparser.next();
            if (c(xmlpullparser, "BaseURL"))
            {
                bbb = d(xmlpullparser, s);
                s = s1;
                s1 = bbb;
            } else
            if (c(xmlpullparser, "AudioChannelConfiguration"))
            {
                Integer.parseInt(xmlpullparser.getAttributeValue(null, "value"));
                bbb = s;
                s = s1;
                s1 = bbb;
            } else
            if (c(xmlpullparser, "SegmentBase"))
            {
                bbb = a(xmlpullparser, s, (bbg)s1);
                s1 = s;
                s = bbb;
            } else
            if (c(xmlpullparser, "SegmentList"))
            {
                bbb = a(xmlpullparser, s, (bbd)s1, l1);
                s1 = s;
                s = bbb;
            } else
            if (c(xmlpullparser, "SegmentTemplate"))
            {
                bbb = a(xmlpullparser, s, (bbe)s1, l1);
                s1 = s;
                s = bbb;
            } else
            {
                if (c(xmlpullparser, "ContentProtection"))
                {
                    bbb = a(xmlpullparser);
                    if (bav1.c == null)
                    {
                        bav1.c = new ArrayList();
                    }
                    bav.a(bav1.c, bbb);
                }
                bbb = s;
                s = s1;
                s1 = bbb;
            }
            if (b(xmlpullparser, "Representation"))
            {
                xmlpullparser = new bad(s2, ((String) (obj)), j, k, i, s3);
                if (s == null)
                {
                    s = new bbg(s1);
                }
                if (s instanceof bbg)
                {
                    return new bba(l, l1, xmlpullparser, (bbg)s);
                }
                if (s instanceof bbc)
                {
                    return new baz(l, l1, xmlpullparser, (bbc)s);
                } else
                {
                    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                }
            }
            bbb = s1;
            s1 = s;
            s = bbb;
        } while (true);
    }

    private static bbd a(XmlPullParser xmlpullparser, String s, bbd bbd1, long l)
    {
        Object obj;
        List list;
        bax bax1;
        Object obj1;
        bax bax2;
        List list1;
        int i;
        long l1;
        long l2;
        long l3;
        if (bbd1 != null)
        {
            l1 = bbd1.b;
        } else
        {
            l1 = 1L;
        }
        l2 = c(xmlpullparser, "timescale", l1);
        if (bbd1 != null)
        {
            l1 = bbd1.c;
        } else
        {
            l1 = 0L;
        }
        l3 = c(xmlpullparser, "presentationTimeOffset", l1);
        if (bbd1 != null)
        {
            l1 = bbd1.f;
        } else
        {
            l1 = -1L;
        }
        l1 = c(xmlpullparser, "duration", l1);
        if (bbd1 != null)
        {
            i = bbd1.e;
        } else
        {
            i = 1;
        }
        i = a(xmlpullparser, "startNumber", i);
        bax2 = null;
        list1 = null;
        obj1 = null;
_L3:
        xmlpullparser.next();
        if (!c(xmlpullparser, "Initialization")) goto _L2; else goto _L1
_L1:
        bax1 = a(xmlpullparser, s);
        list = list1;
        obj = obj1;
_L4:
        obj1 = obj;
        list1 = list;
        bax2 = bax1;
        if (b(xmlpullparser, "SegmentList"))
        {
            if (bbd1 != null)
            {
                if (bax1 == null)
                {
                    bax1 = bbd1.a;
                }
                if (list != null)
                {
                    xmlpullparser = list;
                } else
                {
                    xmlpullparser = bbd1.g;
                }
                if (obj == null)
                {
                    obj = bbd1.h;
                }
            } else
            {
                xmlpullparser = list;
            }
            return new bbd(bax1, l2, l3, l, i, l1, xmlpullparser, ((List) (obj)));
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (c(xmlpullparser, "SegmentTimeline"))
        {
            list = b(xmlpullparser);
            obj = obj1;
            bax1 = bax2;
        } else
        {
            obj = obj1;
            list = list1;
            bax1 = bax2;
            if (c(xmlpullparser, "SegmentURL"))
            {
                obj = obj1;
                if (obj1 == null)
                {
                    obj = new ArrayList();
                }
                ((List) (obj)).add(a(xmlpullparser, s, "media", "mediaRange"));
                list = list1;
                bax1 = bax2;
            }
        }
          goto _L4
    }

    private static bbe a(XmlPullParser xmlpullparser, String s, bbe bbe1, long l)
    {
        Object obj;
        bax bax1;
        bax bax2;
        Object obj1;
        bbh bbh1;
        bbh bbh2;
        int i;
        long l1;
        long l2;
        long l3;
        if (bbe1 != null)
        {
            l1 = bbe1.b;
        } else
        {
            l1 = 1L;
        }
        l2 = c(xmlpullparser, "timescale", l1);
        if (bbe1 != null)
        {
            l1 = bbe1.c;
        } else
        {
            l1 = 0L;
        }
        l3 = c(xmlpullparser, "presentationTimeOffset", l1);
        if (bbe1 != null)
        {
            l1 = bbe1.f;
        } else
        {
            l1 = -1L;
        }
        l1 = c(xmlpullparser, "duration", l1);
        if (bbe1 != null)
        {
            i = bbe1.e;
        } else
        {
            i = 1;
        }
        i = a(xmlpullparser, "startNumber", i);
        if (bbe1 != null)
        {
            obj = bbe1.i;
        } else
        {
            obj = null;
        }
        bbh1 = a(xmlpullparser, "media", ((bbh) (obj)));
        if (bbe1 != null)
        {
            obj = bbe1.h;
        } else
        {
            obj = null;
        }
        bbh2 = a(xmlpullparser, "initialization", ((bbh) (obj)));
        bax2 = null;
        obj1 = null;
_L3:
        xmlpullparser.next();
        if (!c(xmlpullparser, "Initialization")) goto _L2; else goto _L1
_L1:
        bax1 = a(xmlpullparser, s);
        obj = obj1;
_L4:
        obj1 = obj;
        bax2 = bax1;
        if (b(xmlpullparser, "SegmentTemplate"))
        {
            if (bbe1 != null)
            {
                if (bax1 == null)
                {
                    bax1 = bbe1.a;
                }
                if (obj == null)
                {
                    obj = bbe1.g;
                }
                xmlpullparser = ((XmlPullParser) (obj));
            } else
            {
                xmlpullparser = ((XmlPullParser) (obj));
            }
            return new bbe(bax1, l2, l3, l, i, l1, xmlpullparser, bbh2, bbh1, s);
        }
        if (true) goto _L3; else goto _L2
_L2:
        obj = obj1;
        bax1 = bax2;
        if (c(xmlpullparser, "SegmentTimeline"))
        {
            obj = b(xmlpullparser);
            bax1 = bax2;
        }
          goto _L4
    }

    private static bbg a(XmlPullParser xmlpullparser, String s, bbg bbg1)
    {
        String s1;
        long l;
        long l1;
        long l2;
        long l3;
        if (bbg1 != null)
        {
            l = bbg1.b;
        } else
        {
            l = 1L;
        }
        l2 = c(xmlpullparser, "timescale", l);
        if (bbg1 != null)
        {
            l = bbg1.c;
        } else
        {
            l = 0L;
        }
        l3 = c(xmlpullparser, "presentationTimeOffset", l);
        if (bbg1 != null)
        {
            l = bbg1.e;
        } else
        {
            l = 0L;
        }
        if (bbg1 != null)
        {
            l1 = bbg1.f;
        } else
        {
            l1 = -1L;
        }
        s1 = xmlpullparser.getAttributeValue(null, "indexRange");
        if (s1 != null)
        {
            String as[] = s1.split("-");
            l = Long.parseLong(as[0]);
            l1 = (Long.parseLong(as[1]) - l) + 1L;
        }
        if (bbg1 != null)
        {
            bbg1 = bbg1.a;
        } else
        {
            bbg1 = null;
        }
        do
        {
            xmlpullparser.next();
            if (c(xmlpullparser, "Initialization"))
            {
                bbg1 = a(xmlpullparser, s);
            }
        } while (!b(xmlpullparser, "SegmentBase"));
        return new bbg(bbg1, l2, l3, s, l, l1);
    }

    private static bbh a(XmlPullParser xmlpullparser, String s, bbh bbh1)
    {
        String s1 = xmlpullparser.getAttributeValue(null, s);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        String as[];
        int ai[];
        String as1[];
        int k;
        as = new String[5];
        ai = new int[4];
        as1 = new String[4];
        as[0] = "";
        k = 0;
_L4:
        for (int i = 0; i < s1.length();)
        {
            int l = s1.indexOf("$", i);
            if (l == -1)
            {
                as[k] = (new StringBuilder()).append(as[k]).append(s1.substring(i)).toString();
                i = s1.length();
            } else
            if (l != i)
            {
                as[k] = (new StringBuilder()).append(as[k]).append(s1.substring(i, l)).toString();
                i = l;
            } else
            if (s1.startsWith("$$", i))
            {
                as[k] = (new StringBuilder()).append(as[k]).append("$").toString();
                i += 2;
            } else
            {
                int i1 = s1.indexOf("$", i + 1);
                bbh1 = s1.substring(i + 1, i1);
                if (bbh1.equals("RepresentationID"))
                {
                    ai[k] = 1;
                } else
                {
                    int j = bbh1.indexOf("%0");
                    xmlpullparser = "%01d";
                    s = bbh1;
                    if (j != -1)
                    {
                        s = bbh1.substring(j);
                        xmlpullparser = s;
                        if (!s.endsWith("d"))
                        {
                            xmlpullparser = (new StringBuilder()).append(s).append("d").toString();
                        }
                        s = bbh1.substring(0, j);
                    }
                    if (s.equals("Number"))
                    {
                        ai[k] = 2;
                    } else
                    if (s.equals("Bandwidth"))
                    {
                        ai[k] = 3;
                    } else
                    if (s.equals("Time"))
                    {
                        ai[k] = 4;
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder("Invalid template: ")).append(s1).toString());
                    }
                    as1[k] = xmlpullparser;
                }
                k++;
                as[k] = "";
                i = i1 + 1;
            }
        }

        bbh1 = new bbh(as, ai, as1, k);
_L2:
        return bbh1;
        if (true) goto _L4; else goto _L3
_L3:
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
            if (bea.b(s))
            {
                return 1;
            }
            if (bea.c(s))
            {
                return 0;
            }
            if (bea.a(s).equals("text") || s.equals("application/ttml+xml"))
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
            return bej.b(xmlpullparser);
        }
    }

    private bat b(String s, InputStream inputstream)
    {
        Object obj;
        String s1;
        XmlPullParser xmlpullparser;
        ArrayList arraylist;
        long l2;
        boolean flag;
        long l1 = -1L;
        obj = null;
        long l;
        try
        {
            xmlpullparser = b.newPullParser();
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
        inputstream = xmlpullparser.getAttributeValue(null, "availabilityStartTime");
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        l = -1L;
_L7:
        l2 = b(xmlpullparser, "mediaPresentationDuration", -1L);
        b(xmlpullparser, "minBufferTime", -1L);
        inputstream = xmlpullparser.getAttributeValue(null, "type");
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        flag = inputstream.equals("dynamic");
_L10:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        b(xmlpullparser, "minimumUpdatePeriod", -1L);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        l1 = b(xmlpullparser, "timeShiftBufferDepth", -1L);
        arraylist = new ArrayList();
        inputstream = ((InputStream) (obj));
_L6:
        xmlpullparser.next();
        if (!c(xmlpullparser, "BaseURL")) goto _L4; else goto _L3
_L3:
        s1 = d(xmlpullparser, s);
        obj = inputstream;
_L8:
        inputstream = ((InputStream) (obj));
        s = s1;
        if (!b(xmlpullparser, "MPD")) goto _L6; else goto _L5
_L5:
        return new bat(l, l2, flag, l1, ((String) (obj)), arraylist);
_L2:
        l = bej.c(inputstream);
          goto _L7
_L4:
        if (!c(xmlpullparser, "UTCTiming"))
        {
            break MISSING_BLOCK_LABEL_320;
        }
        new bbi(xmlpullparser.getAttributeValue(null, "schemeIdUri"), xmlpullparser.getAttributeValue(null, "value"));
        obj = inputstream;
        s1 = s;
          goto _L8
        if (!c(xmlpullparser, "Period"))
        {
            break MISSING_BLOCK_LABEL_355;
        }
        arraylist.add(a(xmlpullparser, s, l2));
        obj = inputstream;
        s1 = s;
          goto _L8
        obj = inputstream;
        s1 = s;
        if (!c(xmlpullparser, "Location")) goto _L8; else goto _L9
_L9:
        obj = xmlpullparser.nextText();
        s1 = s;
          goto _L8
        flag = false;
          goto _L10
    }

    private static List b(XmlPullParser xmlpullparser)
    {
        ArrayList arraylist = new ArrayList();
        long l = 0L;
        do
        {
            xmlpullparser.next();
            long l1 = l;
            if (c(xmlpullparser, "S"))
            {
                l = c(xmlpullparser, "t", l);
                long l2 = c(xmlpullparser, "d", -1L);
                int j = a(xmlpullparser, "r", 0);
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j + 1)
                    {
                        break;
                    }
                    arraylist.add(new bbf(l, l2));
                    i++;
                    l += l2;
                } while (true);
            }
            l = l1;
        } while (!b(xmlpullparser, "SegmentTimeline"));
        return arraylist;
    }

    private static boolean b(XmlPullParser xmlpullparser, String s)
    {
        return xmlpullparser.getEventType() == 3 && s.equals(xmlpullparser.getName());
    }

    private static long c(XmlPullParser xmlpullparser, String s, long l)
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

    private static boolean c(XmlPullParser xmlpullparser, String s)
    {
        return xmlpullparser.getEventType() == 2 && s.equals(xmlpullparser.getName());
    }

    private static String d(XmlPullParser xmlpullparser, String s)
    {
        xmlpullparser.next();
        return bei.a(s, xmlpullparser.getText());
    }

    public final Object a(String s, InputStream inputstream)
    {
        return b(s, inputstream);
    }

}
