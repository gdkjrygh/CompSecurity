// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.amazon;

import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.amazon:
//            HomeHeroWidgetManager

public static class a
    implements IGsonable
{

    String a;
    String b;
    List c;
    List d;

    private void a(List list)
    {
        c = new ArrayList();
        d = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            WebPhoto webphoto = (WebPhoto)list.get(i);
            c.add((new StringBuilder()).append("app:/collages/").append(webphoto.getId()).toString());
            d.add(webphoto.getMediumImageUrl());
        }

    }

    public boolean a()
    {
        return c.size() == 0;
    }

    public (String s, String s1, List list)
    {
        a = s;
        b = s1;
        a(list);
    }
}
