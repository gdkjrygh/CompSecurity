// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            TourDetailResponse

public class poi_id
{

    private ArrayList member_pois;
    private String poi_id;
    String short_description;
    final TourDetailResponse this$0;
    String title;

    public String getId()
    {
        return poi_id;
    }

    public ArrayList getPois()
    {
        return member_pois;
    }

    public String getShortDescription()
    {
        return short_description;
    }

    public String getTitle()
    {
        return title;
    }

    public ()
    {
        this$0 = TourDetailResponse.this;
        super();
        title = "";
        short_description = "";
        poi_id = "";
    }
}
