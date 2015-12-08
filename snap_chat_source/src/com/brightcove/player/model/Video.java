// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.model:
//            MetadataObject, SourceCollection, Source

public class Video extends MetadataObject
{
    public static class Fields
    {

        public static final String CAPTIONING = "captioning";
        public static final String CAPTION_SOURCES = "captionSources";
        public static final String CONTENT_ID = "contentId";
        public static final String CUSTOM_FIELDS = "customFields";
        public static final String DURATION = "duration";
        public static final String HEADERS = "headers";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String PUBLISHER_ID = "pubId";
        public static final String REFERENCE_ID = "referenceId";
        public static final String SHORT_DESCRIPTION = "shortDescription";
        public static final String STILL_IMAGE_URI = "stillImageUri";
        public static final String SUBTITLE_SOURCES = "subtitleSources";

        public Fields()
        {
        }
    }


    private Map b;
    private List c;

    public Video(Map map)
    {
        super(map);
    }

    public Video(Map map, Set set)
    {
        super(map);
        if (set == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("sourceCollectionsRequired"));
        }
        map = new HashMap();
        SourceCollection sourcecollection;
        for (set = set.iterator(); set.hasNext(); map.put(sourcecollection.getDeliveryType(), sourcecollection))
        {
            sourcecollection = (SourceCollection)set.next();
            if (map.containsKey(sourcecollection.getDeliveryType()))
            {
                throw new IllegalStateException(ErrorUtil.getMessage("duplicateDeliveryTypes"));
            }
        }

        b = map;
    }

    public Video(Map map, Set set, List list)
    {
        this(map, set);
        if (list == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("cuePointsRequired"));
        } else
        {
            c = list;
            return;
        }
    }

    public static Video createVideo(String s)
    {
        DeliveryType deliverytype;
        String s1;
        if (s == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        }
        deliverytype = DeliveryType.UNKNOWN;
        s1 = s.split("[?]")[0].toLowerCase(Locale.getDefault());
        if (!s1.endsWith(".mp4")) goto _L2; else goto _L1
_L1:
        deliverytype = DeliveryType.MP4;
_L4:
        return createVideo(s, deliverytype);
_L2:
        if (s1.endsWith(".m3u") || s1.endsWith(".m3u8"))
        {
            deliverytype = DeliveryType.HLS;
        } else
        if (s1.contains("/dash/"))
        {
            deliverytype = DeliveryType.DASH;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Video createVideo(String s, DeliveryType deliverytype)
    {
        if (s == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        } else
        {
            HashSet hashset = new HashSet();
            hashset.add(new SourceCollection(new Source(s, deliverytype), deliverytype));
            return new Video(new HashMap(), hashset, new ArrayList());
        }
    }

    public List getCuePoints()
    {
        return c;
    }

    public int getDuration()
    {
        int i = 0;
        if (a.containsKey("duration"))
        {
            try
            {
                i = Integer.parseInt(a.get("duration").toString());
            }
            catch (NumberFormatException numberformatexception)
            {
                (new StringBuilder("Invalid number value seen for duration in Video: ")).append(a.get("duration"));
                return 0;
            }
        }
        return i;
    }

    public String getId()
    {
        String s = "";
        if (a.containsKey("id"))
        {
            s = a.get("id").toString();
        }
        return s;
    }

    public Map getSourceCollections()
    {
        return b;
    }

    public String toString()
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Video{");
        if (a.get("name") != null)
        {
            stringbuilder.append("name: \"");
            stringbuilder.append(a.get("name"));
            stringbuilder.append("\"");
        }
        if (a.get("shortDescription") != null)
        {
            stringbuilder.append(", shortDescription: \"");
            stringbuilder.append(a.get("shortDescription"));
            stringbuilder.append("\"");
        }
        stringbuilder.append(", sourceCollections: ");
        int i;
        if (b != null)
        {
            i = b.size();
        } else
        {
            i = 0;
        }
        stringbuilder.append(i);
        stringbuilder.append(", cuePoints: ");
        i = ((flag) ? 1 : 0);
        if (c != null)
        {
            i = c.size();
        }
        stringbuilder.append(i);
        if (a.get("customFields") != null)
        {
            stringbuilder.append(", custom fields: \"");
            stringbuilder.append(a.get("customFields"));
            stringbuilder.append("\"");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
