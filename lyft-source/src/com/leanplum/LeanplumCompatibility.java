// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.leanplum:
//            Leanplum

public class LeanplumCompatibility
{

    public static final String CAMPAIGN_CONTENT = "&cc";
    public static final String CAMPAIGN_MEDUIM = "&cm";
    public static final String CAMPAIGN_NAME = "&cn";
    public static final String CAMPAIGN_SOURCE = "&cs";
    public static final String EVENT_ACTION = "&ea";
    public static final String EVENT_CATEGORY = "&ec";
    public static final String EVENT_LABEL = "&el";
    public static final String EVENT_VALUE = "&ev";
    public static final String EXCEPTION_DESCRIPTION = "&exd";
    public static final String ITEM_CATEGORY = "&iv";
    public static final String ITEM_NAME = "&in";
    public static final String SOCIAL_ACTION = "&sa";
    public static final String SOCIAL_NETWORK = "&sn";
    public static final String SOCIAL_TARGET = "&st";
    public static final String TIMING_CATEGORY = "&utc";
    public static final String TIMING_LABEL = "&utl";
    public static final String TIMING_NAME = "&utv";
    public static final String TIMING_VALUE = "&utt";
    public static final String TRANSACTION_AFFILIATION = "&ta";
    public static final String TYPE = "&t";

    public LeanplumCompatibility()
    {
    }

    private static String a(HashMap hashmap, List list)
    {
        LinkedList linkedlist = new LinkedList();
        list = list.iterator();
        do
        {
            String s;
            do
            {
                if (!list.hasNext())
                {
                    return TextUtils.join(" ", linkedlist);
                }
                s = (String)list.next();
            } while (hashmap.get(s) == null);
            linkedlist.add((String)hashmap.get(s));
            hashmap.remove(s);
        } while (true);
    }

    public static void fTrack(String s)
    {
        Leanplum.track(s);
    }

    public static void fTrack(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("errorMessage", s1);
        hashmap.put("errorClass", s2);
        Leanplum.track((new StringBuilder(String.valueOf(s))).append(" error").toString(), 0.0D, "", hashmap);
    }

    public static void fTrack(String s, HashMap hashmap)
    {
        Leanplum.track(s, hashmap);
    }

    public static void fTrack(String s, HashMap hashmap, boolean flag)
    {
        if (flag)
        {
            Leanplum.track((new StringBuilder(String.valueOf(s))).append(" begin").toString(), 0.0D, "", hashmap);
            return;
        } else
        {
            Leanplum.track(s, 0.0D, "", hashmap);
            return;
        }
    }

    public static void fTrack(String s, boolean flag)
    {
        if (flag)
        {
            Leanplum.track((new StringBuilder(String.valueOf(s))).append(" begin").toString(), 0.0D, "", new HashMap());
            return;
        } else
        {
            Leanplum.track(s, 0.0D, "", new HashMap());
            return;
        }
    }

    public static void gaTrack(Map map)
    {
        HashMap hashmap = new HashMap(map);
        if (hashmap.get("&ec") == null && hashmap.get("&ea") == null && hashmap.get("&el") == null) goto _L2; else goto _L1
_L1:
        String s;
        String s2 = a(hashmap, Arrays.asList(new String[] {
            "&ec", "&ea", "&el"
        }));
        String s1 = (String)hashmap.get("&ev");
        map = s1;
        s = s2;
        if (s1 != null)
        {
            hashmap.remove("&ev");
            s = s2;
            map = s1;
        }
_L10:
        Object obj = hashmap.keySet().iterator();
_L8:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (map == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Leanplum.track(s, Double.parseDouble(map), hashmap);
_L6:
        return;
_L2:
        if (hashmap.get("&exd") != null)
        {
            s = a(hashmap, Arrays.asList(new String[] {
                "&exd", "&t"
            }));
            map = null;
        } else
        if (hashmap.get("&ta") != null)
        {
            s = a(hashmap, Arrays.asList(new String[] {
                "&ta", "&t"
            }));
            map = null;
        } else
        if (hashmap.get("&iv") != null || hashmap.get("&in") != null)
        {
            s = a(hashmap, Arrays.asList(new String[] {
                "&iv", "&in", "&t"
            }));
            map = null;
        } else
        if (hashmap.get("&sn") != null || hashmap.get("&sa") != null || hashmap.get("&st") != null)
        {
            s = a(hashmap, Arrays.asList(new String[] {
                "&sn", "&sa", "&st"
            }));
            map = null;
        } else
        {
            if (hashmap.get("&utc") == null && hashmap.get("&utv") == null && hashmap.get("&utl") == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            String s3 = a(hashmap, Arrays.asList(new String[] {
                "&utc", "&utv", "&utl", "&t"
            }));
            obj = (String)hashmap.get("&utt");
            map = ((Map) (obj));
            s = s3;
            if (obj != null)
            {
                hashmap.remove("&utt");
                s = s3;
                map = ((Map) (obj));
            }
        }
        continue; /* Loop/switch isn't completed */
        if (hashmap.get("&cm") != null || hashmap.get("&cc") != null || hashmap.get("&cn") != null || hashmap.get("&cs") == null) goto _L6; else goto _L5
_L5:
        return;
_L4:
        String s4 = (String)((Iterator) (obj)).next();
        if (hashmap.get(s4) == null)
        {
            hashmap.remove(s4);
        }
        if (true) goto _L8; else goto _L7
_L7:
        Leanplum.track(s, hashmap);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
