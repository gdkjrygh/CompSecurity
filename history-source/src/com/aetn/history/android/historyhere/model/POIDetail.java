// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POI

public class POIDetail extends POI
{
    public class Asset
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
        static String access$002(Asset asset1, String s)
        {
            asset1.asset_type = s;
            return s;
        }

*/


/*
        static String access$102(Asset asset1, String s)
        {
            asset1.asset_title = s;
            return s;
        }

*/


/*
        static String access$202(Asset asset1, String s)
        {
            asset1.asset_body = s;
            return s;
        }

*/

        public Asset()
        {
            this$0 = POIDetail.this;
            super();
        }
    }

    public class PhoneNumber
    {

        public String areacode;
        public String digits;
        final POIDetail this$0;

        public PhoneNumber()
        {
            this$0 = POIDetail.this;
            super();
        }
    }


    private static final String TAG = "POIDetail";
    private static final long serialVersionUID = 1L;
    private ArrayList asset;
    private String description;
    private String era;
    private String imageCredit;
    private boolean inactive;
    private String key;
    private String modified_time;
    private PhoneNumber phoneNumber;
    private int quality;
    private ArrayList tags;
    private String tourListString;
    private String website;

    public POIDetail()
    {
    }

    public POIDetail(String s, String s1, POI.Location location, int i, String s2, String s3, String s4, 
            String s5, String s6, String s7, POI.Address address, PhoneNumber phonenumber, String s8)
    {
        super(s, s1, location, i, s2, s3, s5);
        description = s7;
        key = s6;
        imageCredit = s4;
        phoneNumber = phonenumber;
    }

    public ArrayList getAssets()
    {
        ArrayList arraylist = new ArrayList();
        Asset asset1 = new Asset();
        asset1.asset_type = "image_uri";
        asset1.asset_title = "http://mobileassets.aetndigital.com/history-here/132731.jpg";
        asset1.asset_body = "\251Corbis Images";
        Asset asset2 = new Asset();
        asset2.asset_type = "image_uri";
        asset2.asset_title = "http://mobileassets.aetndigital.com/history-here/132747.jpg";
        asset2.asset_body = "\251Eliot Porter";
        Asset asset3 = new Asset();
        asset3.asset_type = "image_uri";
        asset3.asset_title = "http://mobileassets.aetndigital.com/history-here/132789.jpg";
        asset3.asset_body = "\251Ansel Adams";
        Asset asset4 = new Asset();
        asset4.asset_type = "video_hls_uri";
        asset4.asset_title = "http://mobileassets.aetndigital.com/history-here/132789.mp3";
        arraylist.add(asset1);
        arraylist.add(asset2);
        arraylist.add(asset4);
        arraylist.add(asset3);
        return asset;
    }

    public String getDescription()
    {
        return description;
    }

    public String getEra()
    {
        return era;
    }

    public String getFormattedPhoneNumber()
    {
        String s = phoneNumber.areacode;
        String s1 = phoneNumber.digits;
        return (new StringBuilder()).append(s).append("-").append(s1).toString();
    }

    public String getImageCredit()
    {
        return imageCredit;
    }

    public int getInactive()
    {
        int i = 0;
        if (inactive)
        {
            i = 1;
        }
        return i;
    }

    public String getKey()
    {
        return key;
    }

    public String getModifiedTime()
    {
        return modified_time;
    }

    public PhoneNumber getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getPoiTourList()
    {
        if (asset != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Asset asset1;
        Iterator iterator = asset.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            asset1 = (Asset)iterator.next();
        } while (!asset1.isAssetTypeTourPois());
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return asset1.getTourPois();
    }

    public int getQuality()
    {
        return quality;
    }

    public ArrayList getTags()
    {
        return tags;
    }

    public String getTourListString()
    {
        return tourListString;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEra(String s)
    {
        era = s;
    }

    public void setImageCredit(String s)
    {
        imageCredit = s;
    }

    public void setKey(String s)
    {
        key = s;
    }

    public void setPhoneNumber(PhoneNumber phonenumber)
    {
        phoneNumber = phonenumber;
    }

    public void setTags(ArrayList arraylist)
    {
        tags = arraylist;
    }

    public void setTourListString(String s)
    {
        tourListString = s;
    }

    public void setWebsite(String s)
    {
        website = s;
    }
}
