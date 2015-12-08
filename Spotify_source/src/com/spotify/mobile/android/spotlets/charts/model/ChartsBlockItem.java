// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.content.Context;
import android.os.Parcelable;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import dpa;
import dpk;
import drf;
import drp;
import dry;
import gdw;
import java.util.List;

public abstract class ChartsBlockItem
    implements Parcelable, drf, dry
{

    protected static final String NAME_REGIONAL = "regional";
    protected static final String NAME_SOCIAL = "social";
    protected static final String NAME_VIRAL = "viral";
    public final List imageUrls;
    public final String name;
    public String title;
    public final String uri;

    public ChartsBlockItem(String s, String s1, String s2, List list)
    {
        uri = (String)ctz.a(s);
        title = s1;
        name = s2;
        imageUrls = gdw.a(list);
        boolean flag;
        if (s1 != null || s2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Either title or name should not be null.");
    }

    public String getId()
    {
        return uri;
    }

    public PorcelainNavigationLink getLink()
    {
        dpk dpk1 = dpa.a(uri);
        dpk1.b = title;
        return dpk1.a();
    }

    public drp getMetricsInfo()
    {
        return null;
    }

    public void updateTitle(Context context)
    {
        if (title == null)
        {
            if ("social".equals(name))
            {
                title = context.getString(0x7f08051b);
            } else
            {
                if ("regional".equals(name))
                {
                    title = context.getString(0x7f080168);
                    return;
                }
                if ("viral".equals(name))
                {
                    title = context.getString(0x7f080169);
                    return;
                }
            }
        }
    }
}
