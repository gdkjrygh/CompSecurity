// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.results;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ResultModel
    implements Serializable
{

    public ResultModel()
    {
    }

    public static List excludeDirectUrlResults(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ResultModel resultmodel = (ResultModel)list.next();
            if (TextUtils.isEmpty(resultmodel.getDirectUrl()))
            {
                arraylist.add(resultmodel);
            }
        } while (true);
        return arraylist;
    }

    public abstract boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent);

    public abstract Rect getBoundingBox();

    public String getDirectUrl()
    {
        return "";
    }

    public abstract String getImageUrl();

    public abstract com.google.android.apps.unveil.protocol.QueryResponseFactory.QueryType getQueryType();

    public String getReferrerUrl()
    {
        return "";
    }

    public abstract String getThumbnailUrl();

    public abstract String getTitle();

    public abstract String getWebSearchUrl();

    public abstract boolean hasImageUrl();

    public boolean isAdvertisement()
    {
        return false;
    }
}
