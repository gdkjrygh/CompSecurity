// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.news;

import java.util.ArrayList;

// Referenced classes of package com.accuweather.android.models.news:
//            NewsResult

public class NewsResults extends ArrayList
{

    private static final long serialVersionUID = 0x50744e427c39783bL;

    public NewsResults()
    {
    }

    public ArrayList buildNewsModels()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < size(); i++)
        {
            arraylist.add(((NewsResult)get(i)).toNewsModel());
        }

        return arraylist;
    }
}
