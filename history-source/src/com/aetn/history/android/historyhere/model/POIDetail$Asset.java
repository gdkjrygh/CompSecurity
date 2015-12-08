// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;


// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POIDetail

public class this._cls0
{

    public static final String ASSET_TYPE_IMAGE = "image_uri";
    public static final String ASSET_TYPE_MEMBER_POIS = "member_pois";
    public static final String ASSET_TYPE_VIDEO = "video_hls_uri";
    private String asset_body;
    private String asset_id;
    private String asset_title;
    private String asset_type;
    final POIDetail this$0;

    public String getImageCredit()
    {
        String s = "";
        if (!asset_title.equalsIgnoreCase("null"))
        {
            s = asset_title;
        }
        return s;
    }

    public String getImageURL()
    {
        return asset_body;
    }

    public String getTourPois()
    {
        return asset_body.replaceAll(" ", "");
    }

    public boolean isAssetTypeImage()
    {
        return asset_type.equalsIgnoreCase("image_uri");
    }

    public boolean isAssetTypeTourPois()
    {
        return asset_type.equalsIgnoreCase("member_pois");
    }


/*
    static String access$002( , String s)
    {
        .asset_type = s;
        return s;
    }

*/


/*
    static String access$102(asset_type asset_type1, String s)
    {
        asset_type1.asset_title = s;
        return s;
    }

*/


/*
    static String access$202(asset_title asset_title1, String s)
    {
        asset_title1.asset_body = s;
        return s;
    }

*/

    public asset_body()
    {
        this$0 = POIDetail.this;
        super();
    }
}
