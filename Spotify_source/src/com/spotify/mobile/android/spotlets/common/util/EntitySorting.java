// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.Assertion;
import dmx;
import gfp;
import gin;
import gio;
import gip;
import giq;
import gng;
import gni;
import java.io.IOException;
import java.util.List;

public abstract class EntitySorting
    implements dmx
{

    private final Context a;
    private final giq b;
    private final gng c;
    private SortingModel d;

    public EntitySorting(Context context, giq giq1, gni gni1)
    {
        a = context;
        c = gni1.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b = giq1;
    }

    private SortingModel b()
    {
        if (d != null && d.getMap() != null)
        {
            return d;
        }
        String s = b.b(a).a(a(), "");
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                d = (SortingModel)c.a().readValue(s, com/spotify/mobile/android/spotlets/common/util/EntitySorting$SortingModel);
            }
            catch (IOException ioexception)
            {
                Assertion.b("Failed to fetch sorting for items.");
            }
        }
        if (d == null || d.getMap() == null)
        {
            d = new SortingModel(new SortOrderLruCache(1000));
        }
        return d;
    }

    public final gfp a(String s, gfp gfp1, List list)
    {
        s = gfp.a((String)b().getMap().get(s), list);
        if (s == null)
        {
            s = gfp1;
        }
        return (gfp)s;
    }

    public abstract gip a();

    public final void a(String s, String s1)
    {
        SortingModel sortingmodel;
        sortingmodel = b();
        sortingmodel.getMap().put(s, s1);
        s = null;
        s1 = c.a().writeValueAsString(sortingmodel);
        s = s1;
_L2:
        if (s != null)
        {
            b.b(a).b().a(a(), s).b();
        }
        return;
        s1;
        Assertion.b("Failed to write sorting for items.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    private class SortingModel
        implements JacksonModel
    {

        private final SortOrderLruCache mSortMap;

        public SortOrderLruCache getMap()
        {
            return mSortMap;
        }

        public SortingModel(SortOrderLruCache sortorderlrucache)
        {
            mSortMap = sortorderlrucache;
        }
    }


    private class SortOrderLruCache extends LinkedHashMap
        implements JacksonModel
    {

        private static final long serialVersionUID = 0x9fbf0effee8ea6efL;
        private final int mMaxEntries;

        protected boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            return super.size() > mMaxEntries;
        }

        public SortOrderLruCache()
        {
            this(1000);
        }

        public SortOrderLruCache(int i)
        {
            super(Math.max(i + 1, 0), 1.0F, true);
            mMaxEntries = i;
        }
    }

}
