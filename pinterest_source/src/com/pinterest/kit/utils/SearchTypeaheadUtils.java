// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class SearchTypeaheadUtils
{

    public SearchTypeaheadUtils()
    {
    }

    public static ArrayList getPartitionsToFetch()
    {
        ArrayList arraylist = new ArrayList();
        String s = Preferences.persisted().getString("PREF_TYPEAHEAD_CACHE_PARTITIONS", "");
        if (StringUtils.isEmpty(s))
        {
            return arraylist;
        }
        String as[] = s.split(",");
        for (int i = 0; i < as.length; i++)
        {
            arraylist.add(as[i]);
        }

        return arraylist;
    }

    public static String getTypeAheadCacheCurrentVersion()
    {
        return Preferences.persisted().getString("PREF_SEARCH_TYPEAHEAD_CACHE_VERSION", "");
    }

    public static void persistCacheInfo(PinterestJsonObject pinterestjsonobject)
    {
        int i = 0;
        int j = pinterestjsonobject.a("parts", 0);
        String s = pinterestjsonobject.a("version", "");
        pinterestjsonobject = pinterestjsonobject.e("partitions");
        if (j > 0)
        {
            Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_PARTITION_COUNT", j, true);
        }
        if (StringUtils.isNotEmpty(s))
        {
            Preferences.persisted().set("PREF_SEARCH_TYPEAHEAD_CACHE_VERSION", s, true);
        }
        if (pinterestjsonobject.a() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (; i < pinterestjsonobject.a(); i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(pinterestjsonobject.a(i));
            }

            Preferences.persisted().set("PREF_TYPEAHEAD_CACHE_PARTITIONS", stringbuilder.toString(), true);
        }
    }
}
