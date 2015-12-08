// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;

public final class PSDKConfig
{

    public static final String DEFAULT_AD_TAG = "#EXT-X-CUE";
    private static String _adTags[];
    private static String _subscribedTags[];

    public PSDKConfig()
    {
    }

    private static String[] addDefaultAdTag(String as[])
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        String as1[];
        as1 = new String[1];
        as1[0] = "#EXT-X-CUE";
_L4:
        return as1;
_L2:
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                as1 = as;
                if ("#EXT-X-CUE".equals(as[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        String as2[] = new String[as.length + 1];
        as2[0] = "#EXT-X-CUE";
        System.arraycopy(as, 0, as2, 1, as.length);
        return as2;
    }

    public static String[] getAdTags()
    {
        return _adTags;
    }

    protected static String[] getAdTagsWithDefault()
    {
        return addDefaultAdTag(_adTags);
    }

    public static String[] getSubscribedTags()
    {
        return _subscribedTags;
    }

    public static void setAdTags(String as[])
    {
        if (as == null)
        {
            _adTags = null;
            return;
        }
        HashSet hashset = new HashSet();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            String s = s1;
            if (s1 != null)
            {
                s = s1.trim();
            }
            if (StringUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Array can not contain null or empty values.");
            }
            hashset.add(s);
        }

        _adTags = (String[])hashset.toArray(new String[hashset.size()]);
    }

    public static void setSubscribedTags(String as[])
    {
        if (as == null)
        {
            _subscribedTags = null;
            return;
        }
        HashSet hashset = new HashSet();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            String s = s1;
            if (s1 != null)
            {
                s = s1.trim();
            }
            if (StringUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Array can not contain null or empty values.");
            }
            hashset.add(s);
        }

        _subscribedTags = (String[])hashset.toArray(new String[hashset.size()]);
    }
}
