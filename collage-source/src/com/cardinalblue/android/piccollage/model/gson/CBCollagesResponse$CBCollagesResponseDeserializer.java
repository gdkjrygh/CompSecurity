// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CBCollagesResponse, WebPhotosData, WebPromotionData

public static class 
    implements k
{

    private static final String PC_API_FEED_NODE = "collages";
    private static final String PC_API_LIKES_NODE = "likes";
    private static final String PC_API_PROMOTION_NODE = "promotion";
    private static final String PC_API_SEARCH_NODE = "search";

    public CBCollagesResponse deserialize(l l1, Type type, j j1)
        throws p
    {
        Object obj = null;
        WebPhotosData webphotosdata = new WebPhotosData();
        o o1 = l1.m();
        if (o1.b("promotion"))
        {
            type = (WebPromotionData)j1.a(o1.c("promotion"), com/cardinalblue/android/piccollage/model/gson/WebPromotionData);
        } else
        {
            type = null;
        }
        if (o1.b("collages"))
        {
            l1 = o1.c("collages");
        } else
        if (o1.b("likes"))
        {
            l1 = o1.c("likes");
        } else
        {
            l1 = obj;
            if (o1.b("search"))
            {
                l1 = o1.c("search");
            }
        }
        if (l1 != null)
        {
            l1 = (WebPhotosData)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/WebPhotosData);
        } else
        {
            l1 = webphotosdata;
        }
        return new CBCollagesResponse(l1, type);
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
