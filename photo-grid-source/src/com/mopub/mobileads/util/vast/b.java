// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.VastAbsoluteProgressTracker;
import com.mopub.mobileads.VastFractionalProgressTracker;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            XmlUtils, d, c

final class b
{

    private Document a;

    b()
    {
    }

    private static void a(List list, List list1, float f1)
    {
        for (list1 = list1.iterator(); list1.hasNext(); list.add(new VastFractionalProgressTracker((String)list1.next(), f1))) { }
    }

    private List b(String s)
    {
        return XmlUtils.a(a, "Tracking", "event", s);
    }

    final String a()
    {
        String s = null;
        List list = XmlUtils.a(a, "VASTAdTagURI", null, null);
        if (list.size() > 0)
        {
            s = (String)list.get(0);
        }
        return s;
    }

    final void a(String s)
    {
        s = s.replaceFirst("<\\?.*\\?>", "");
        s = (new StringBuilder("<MPMoVideoXMLDocRoot>")).append(s).append("</MPMoVideoXMLDocRoot>").toString();
        DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
        documentbuilderfactory.setCoalescing(true);
        a = documentbuilderfactory.newDocumentBuilder().parse(new InputSource(new StringReader(s)));
    }

    final List b()
    {
        List list = XmlUtils.a(a, "Impression", null, null);
        list.addAll(XmlUtils.a(a, "MP_TRACKING_URL", null, null));
        return list;
    }

    final List c()
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist, b("firstQuartile"), 0.25F);
        a(arraylist, b("midpoint"), 0.5F);
        a(arraylist, b("thirdQuartile"), 0.75F);
        Iterator iterator = XmlUtils.b(a, "Tracking", "event", "progress").iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Node)iterator.next();
            String s = XmlUtils.c(((Node) (obj)), "offset").trim();
            if (Strings.isPercentageTracker(s))
            {
                obj = XmlUtils.a(((Node) (obj))).trim();
                try
                {
                    arraylist.add(new VastFractionalProgressTracker(((String) (obj)), Float.parseFloat(s.replace("%", "")) / 100F));
                }
                catch (NumberFormatException numberformatexception)
                {
                    MoPubLog.d(String.format("Failed to parse VAST progress tracker %s", new Object[] {
                        s
                    }));
                }
            }
        } while (true);
        Collections.sort(arraylist);
        return arraylist;
    }

    final List d()
    {
        ArrayList arraylist;
        Iterator iterator1;
        arraylist = new ArrayList();
        for (Iterator iterator = b("start").iterator(); iterator.hasNext(); arraylist.add(new VastAbsoluteProgressTracker((String)iterator.next(), 2000))) { }
        iterator1 = XmlUtils.b(a, "Tracking", "event", "progress").iterator();
_L2:
        String s;
        Object obj;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Node)iterator1.next();
        s = XmlUtils.c(((Node) (obj)), "offset").trim();
        if (!Strings.isAbsoluteTracker(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = XmlUtils.a(((Node) (obj))).trim();
        Integer integer = Strings.parseAbsoluteOffset(s);
        if (integer != null)
        {
            try
            {
                arraylist.add(new VastAbsoluteProgressTracker(((String) (obj)), integer.intValue()));
            }
            catch (NumberFormatException numberformatexception)
            {
                MoPubLog.d(String.format("Failed to parse VAST progress tracker %s", new Object[] {
                    s
                }));
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        Collections.sort(arraylist);
        return arraylist;
    }

    final List e()
    {
        return b("complete");
    }

    final List f()
    {
        return b("close");
    }

    final List g()
    {
        return b("skip");
    }

    final String h()
    {
        return XmlUtils.a(a, "ClickThrough");
    }

    final List i()
    {
        return XmlUtils.a(a, "ClickTracking", null, null);
    }

    final String j()
    {
        String s = XmlUtils.a(a, "MoPubCtaText");
        if (s != null && s.length() <= 15)
        {
            return s;
        } else
        {
            return null;
        }
    }

    final String k()
    {
        String s = XmlUtils.a(a, "MoPubSkipText");
        if (s != null && s.length() <= 8)
        {
            return s;
        } else
        {
            return null;
        }
    }

    final String l()
    {
        return XmlUtils.a(a, "MoPubCloseIcon");
    }

    final com.mopub.common.util.DeviceUtils.ForceOrientation m()
    {
        return com.mopub.common.util.DeviceUtils.ForceOrientation.getForceOrientation(XmlUtils.a(a, "MoPubForceOrientation"));
    }

    final String n()
    {
        Object obj = XmlUtils.b(a, "Linear", "skipoffset", null);
        if (((List) (obj)).isEmpty())
        {
            obj = null;
        } else
        {
            obj = (Node)((List) (obj)).get(0);
        }
        if (obj == null)
        {
            return null;
        }
        obj = XmlUtils.c(((Node) (obj)), "skipoffset");
        if (obj == null)
        {
            return null;
        }
        if (((String) (obj)).trim().isEmpty())
        {
            return null;
        } else
        {
            return ((String) (obj)).trim();
        }
    }

    final List o()
    {
        NodeList nodelist = a.getElementsByTagName("MediaFile");
        ArrayList arraylist = new ArrayList(nodelist.getLength());
        for (int i1 = 0; i1 < nodelist.getLength(); i1++)
        {
            arraylist.add(new d(this, nodelist.item(i1)));
        }

        return arraylist;
    }

    final List p()
    {
        NodeList nodelist = a.getElementsByTagName("Companion");
        ArrayList arraylist = new ArrayList(nodelist.getLength());
        for (int i1 = 0; i1 < nodelist.getLength(); i1++)
        {
            arraylist.add(new c(this, nodelist.item(i1)));
        }

        return arraylist;
    }
}
