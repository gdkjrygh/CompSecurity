// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.a.e;
import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CBYoutubeSearchResponse, WebPromotionData, CBYoutubeData

public static class 
    implements k
{

    private static final String KEY_DATA = "data";
    private static final String KEY_NEXT_PAGE = "next_page";
    private static final String KEY_OFFSET = "offset";
    private static final String KEY_TOTAL = "total";
    private static final String PC_API_PROMOTION_NODE = "promotion";
    private static final String PC_API_SEARCH_NODE = "search";
    private static final String PC_API_VIDEO_NODE = "videos";

    public CBYoutubeSearchResponse deserialize(l l1, Type type, j j1)
        throws p
    {
        Object obj = null;
        CBYoutubeSearchResponse cbyoutubesearchresponse = new CBYoutubeSearchResponse();
        o o1 = l1.m();
        if (o1.b("promotion"))
        {
            type = (WebPromotionData)j1.a(o1.c("promotion"), com/cardinalblue/android/piccollage/model/gson/WebPromotionData);
        } else
        {
            type = null;
        }
        if (o1.b("search"))
        {
            l1 = o1.e("search");
        } else
        {
            l1 = obj;
            if (o1.b("videos"))
            {
                l1 = o1.e("videos");
            }
        }
        if (l1 != null)
        {
            CBYoutubeSearchResponse.access$002(cbyoutubesearchresponse, type);
            CBYoutubeSearchResponse.access$102(cbyoutubesearchresponse, e.a(l1, "offset", 0));
            CBYoutubeSearchResponse.access$202(cbyoutubesearchresponse, e.a(l1, "total", 0));
            CBYoutubeSearchResponse.access$302(cbyoutubesearchresponse, e.a(l1, "next_page", ""));
            if (l1.b("data"))
            {
                type = l1.d("data");
                l1 = new LinkedList();
                for (type = type.iterator(); type.hasNext(); l1.add((CBYoutubeData)j1.a((l)type.next(), com/cardinalblue/android/piccollage/model/gson/CBYoutubeData))) { }
                CBYoutubeSearchResponse.access$402(cbyoutubesearchresponse, l1);
            }
        }
        return cbyoutubesearchresponse;
    }

    public volatile Object deserialize(l l1, Type type, j j1)
        throws p
    {
        return deserialize(l1, type, j1);
    }

    public ()
    {
    }
}
