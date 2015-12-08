// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.TagData;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.utils.NumberUtils;
import com.adobe.mediacore.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

final class TimedMetadataParser
{

    private static final String AD_CUE_DURATION_KEY = "DURATION";
    private static final String AD_CUE_ID_KEY = "ID";
    private static final String CUE_DATA = "DATA";

    TimedMetadataParser()
    {
    }

    private static long getMetadataId(Metadata metadata, String s, long l)
    {
        if (metadata == null || !metadata.containsKey("ID"))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        long l1 = Long.parseLong(metadata.getValue("ID"));
        return l1;
        metadata;
        return (long)(new StringBuilder(s)).append(l).toString().hashCode();
    }

    private static Metadata parseMetadata(String s)
    {
        MetadataNode metadatanode = new MetadataNode();
        if (StringUtils.isEmpty(s))
        {
            return metadatanode;
        }
        s = splitIgnoringQuotes(',', s).iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = (String)s.next();
            Object obj = splitIgnoringQuotes('=', s1);
            if (((ArrayList) (obj)).size() != 2)
            {
                obj = StringUtils.trimQuotes(s1.trim()).trim();
                if (NumberUtils.isNumeric(((String) (obj))))
                {
                    metadatanode.setValue("DURATION", ((String) (obj)));
                } else
                {
                    metadatanode.setValue("DATA", ((String) (obj)).trim());
                }
            } else
            {
                String s2 = StringUtils.trimQuotes(((String)((ArrayList) (obj)).get(0)).trim()).trim();
                obj = StringUtils.trimQuotes(((String)((ArrayList) (obj)).get(1)).trim()).trim();
                if (!StringUtils.isEmpty(s2))
                {
                    metadatanode.setValue(s2, ((String) (obj)));
                }
            }
        } while (true);
        return metadatanode;
    }

    public static TimedMetadata parseTagData(TagData tagdata)
    {
        String s = tagdata.data;
        long l = tagdata.time;
        if (!StringUtils.isEmpty(s))
        {
            if ((tagdata = s.split(":", 2)).length >= 1)
            {
                String s1 = tagdata[0].trim();
                long l1;
                if (tagdata.length >= 2)
                {
                    tagdata = parseMetadata(tagdata[1]);
                } else
                {
                    tagdata = new MetadataNode();
                }
                l1 = getMetadataId(tagdata, s1, l);
                return new TimedMetadata(com.adobe.mediacore.metadata.TimedMetadata.Type.TAG, l, l1, s1, tagdata);
            }
        }
        return null;
    }

    private static ArrayList splitIgnoringQuotes(char c, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
        int i = 0;
        while (i < s.length()) 
        {
            char c1 = s.charAt(i);
            if (c1 == '"')
            {
                stringbuilder.append(c1);
                if (flag)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
            } else
            if (c1 == c)
            {
                if (flag)
                {
                    stringbuilder.append(c1);
                } else
                {
                    if (stringbuilder.length() > 0)
                    {
                        arraylist.add(stringbuilder.toString());
                    }
                    stringbuilder = new StringBuilder();
                }
            } else
            {
                stringbuilder.append(c1);
            }
            i++;
        }
        if (stringbuilder.length() > 0)
        {
            arraylist.add(stringbuilder.toString());
        }
        return arraylist;
    }
}
