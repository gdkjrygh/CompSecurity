// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.graphics.Color;
import com.pinterest.base.Colors;
import com.pinterest.experiment.Experiments;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            FollowableModel, Pin, ModelHelper

public class Interest extends FollowableModel
{

    public static final String TYPE = "interest";
    private boolean _isRecommended;
    private boolean _shouldAnimateOnAppear;
    private Date cacheExpirationDate;
    private ArrayList childInterests;
    private String dominantColor;
    private Date feedUpdatedTime;
    private Boolean following;
    private Long id;
    private Integer imageGridLg2LineHeight;
    private String imageGridLg2LineUrl;
    private Integer imageGridLg2LineWidth;
    private Integer imageGridLg4LineHeight;
    private String imageGridLg4LineUrl;
    private Integer imageGridLg4LineWidth;
    private Integer imageGridMed1LineHeight;
    private String imageGridMed1LineUrl;
    private Integer imageGridMed1LineWidth;
    private Integer imageGridMed2LineHeight;
    private String imageGridMed2LineUrl;
    private Integer imageGridMed2LineWidth;
    private Integer imageGridMed4LineHeight;
    private String imageGridMed4LineUrl;
    private Integer imageGridMed4LineWidth;
    private Integer imageHeaderHeight;
    private String imageHeaderUrl;
    private Integer imageHeaderWidth;
    private String imageSignature;
    private Integer imageSmallHeight;
    private String imageSmallUrl;
    private Integer imageSmallWidth;
    private String key;
    private String name;
    private Integer pinnerCount;
    private ArrayList recommendationPins;
    private String recommendationSource;
    private String uid;
    private String urlName;

    public Interest()
    {
        pinnerCount = Integer.valueOf(-1);
        _shouldAnimateOnAppear = false;
    }

    public Interest(Long long1)
    {
        pinnerCount = Integer.valueOf(-1);
        _shouldAnimateOnAppear = false;
        id = long1;
    }

    public Interest(Long long1, String s, Date date, String s1, String s2, String s3, String s4, 
            String s5, Boolean boolean1, Date date1, Integer integer, String s6, String s7, Integer integer1, 
            Integer integer2, String s8, Integer integer3, Integer integer4, String s9, Integer integer5, Integer integer6, 
            String s10, Integer integer7, Integer integer8, String s11, Integer integer9, Integer integer10, String s12, 
            Integer integer11, Integer integer12, String s13, Integer integer13, Integer integer14)
    {
        pinnerCount = Integer.valueOf(-1);
        _shouldAnimateOnAppear = false;
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        key = s1;
        name = s2;
        urlName = s3;
        imageSignature = s4;
        dominantColor = s5;
        following = boolean1;
        feedUpdatedTime = date1;
        pinnerCount = integer;
        recommendationSource = s6;
        imageSmallUrl = s7;
        imageSmallWidth = integer1;
        imageSmallHeight = integer2;
        imageHeaderUrl = s8;
        imageHeaderWidth = integer3;
        imageHeaderHeight = integer4;
        imageGridMed1LineUrl = s9;
        imageGridMed1LineWidth = integer5;
        imageGridMed1LineHeight = integer6;
        imageGridMed2LineUrl = s10;
        imageGridMed2LineWidth = integer7;
        imageGridMed2LineHeight = integer8;
        imageGridMed4LineUrl = s11;
        imageGridMed4LineWidth = integer9;
        imageGridMed4LineHeight = integer10;
        imageGridLg2LineUrl = s12;
        imageGridLg2LineWidth = integer11;
        imageGridLg2LineHeight = integer12;
        imageGridLg4LineUrl = s13;
        imageGridLg4LineWidth = integer13;
        imageGridLg4LineHeight = integer14;
    }

    private static void cacheInterest(final Interest interest)
    {
        (new _cls1()).execute();
    }

    private static void cacheInterests(final List interests)
    {
        (new _cls2()).execute();
    }

    public static Interest make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static Interest make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = new Interest();
        } else
        {
            Interest interest = (Interest)pinterestjsonobject.a(com/pinterest/api/model/Interest);
            Object obj = interest.getDominantColor();
            if (obj != null)
            {
                interest.setDominantColor(((String) (obj)).replace("null", "").replace("[", "").replace("]", ""));
            }
            PinterestJsonObject pinterestjsonobject2 = pinterestjsonobject.c("images");
            if (pinterestjsonobject2 != null)
            {
                obj = pinterestjsonobject2.c("75x75");
                if (obj != null)
                {
                    interest.setImageSmallUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageSmallWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageSmallHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
                PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject2.c("474x");
                obj = pinterestjsonobject1;
                if (pinterestjsonobject1 == null)
                {
                    obj = pinterestjsonobject2.c("600x");
                }
                if (obj != null)
                {
                    interest.setImageHeaderUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageHeaderWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageHeaderHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
                obj = pinterestjsonobject2.c("300x300(ir.48)");
                if (obj != null)
                {
                    interest.setImageGridLg4LineUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageGridLg4LineWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageGridLg4LineHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
                obj = pinterestjsonobject2.c("300x300(ir.24)");
                if (obj != null)
                {
                    interest.setImageGridLg2LineUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageGridLg2LineWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageGridLg2LineHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
                obj = pinterestjsonobject2.c("150x150(ir.48)");
                if (obj != null)
                {
                    interest.setImageGridMed4LineUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageGridMed4LineWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageGridMed4LineHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
                obj = pinterestjsonobject2.c("150x150(ir.24)");
                if (obj != null)
                {
                    interest.setImageGridMed2LineUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageGridMed2LineWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageGridMed2LineHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
                obj = pinterestjsonobject2.c("150x150(ir.12)");
                if (obj != null)
                {
                    interest.setImageGridMed1LineUrl(((PinterestJsonObject) (obj)).a("url", ""));
                    interest.setImageGridMed1LineWidth(Integer.valueOf(((PinterestJsonObject) (obj)).a("width", 0)));
                    interest.setImageGridMed1LineHeight(Integer.valueOf(((PinterestJsonObject) (obj)).a("height", 0)));
                }
            }
            obj = pinterestjsonobject.e("recommendation_pins");
            if (((PinterestJsonArray) (obj)).a() > 0)
            {
                interest.setRecommendationPins(new ArrayList(Pin.makeAll(((PinterestJsonArray) (obj)))));
            }
            interest.setIsRecommended(pinterestjsonobject.a("is_recommended").booleanValue());
            pinterestjsonobject = interest;
            if (flag)
            {
                cacheInterest(interest);
                return interest;
            }
        }
        return pinterestjsonobject;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        return makeAll(pinterestjsonarray, true);
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(make(pinterestjsonarray.d(i), false));
        }

        if (flag)
        {
            cacheInterests(arraylist);
        }
        return arraylist;
    }

    public static ArrayList makeAllFromExploreData(PinterestJsonArray pinterestjsonarray, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (int i = 0; i < pinterestjsonarray.a(); i++)
        {
            Object obj = pinterestjsonarray.c(i);
            if (obj != null)
            {
                obj = makeFromExploreData(((PinterestJsonObject) (obj)), false);
                arraylist1.addAll(((Interest) (obj)).getChildInterests());
                arraylist.add(obj);
            }
        }

        if (flag)
        {
            ModelHelper.setInterests(arraylist1);
        }
        return arraylist;
    }

    public static Interest makeFromExploreData(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        ArrayList arraylist = (ArrayList)makeAll(pinterestjsonobject.d("child_interests"), flag);
        pinterestjsonobject = make(pinterestjsonobject.c("l1_interest"), flag);
        if (Experiments.k())
        {
            arraylist.add(0, pinterestjsonobject);
        } else
        {
            arraylist.add(pinterestjsonobject);
        }
        pinterestjsonobject.setChildInterests(arraylist);
        return pinterestjsonobject;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Interest)obj;
            if (uid == null ? ((Interest) (obj)).uid != null : !uid.equals(((Interest) (obj)).uid))
            {
                return false;
            }
        }
        return true;
    }

    public int getBackgroundColor()
    {
        return Colors.from(dominantColor, Color.argb(255, 238, 238, 238)).intValue();
    }

    public String getBestImageUrl(int i)
    {
        if (i > 1)
        {
            return StringUtils.defaultString(getImageGridMed2LineUrl(), getImageGridLg4LineUrl());
        } else
        {
            return StringUtils.defaultString(getImageGridMed1LineUrl(), getImageGridLg2LineUrl());
        }
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public ArrayList getChildInterests()
    {
        return childInterests;
    }

    public String getDominantColor()
    {
        return dominantColor;
    }

    public Date getFeedUpdatedTime()
    {
        return feedUpdatedTime;
    }

    public Boolean getFollowing()
    {
        return following;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getImageGridLg2LineHeight()
    {
        return imageGridLg2LineHeight;
    }

    public String getImageGridLg2LineUrl()
    {
        return imageGridLg2LineUrl;
    }

    public Integer getImageGridLg2LineWidth()
    {
        return imageGridLg2LineWidth;
    }

    public Integer getImageGridLg4LineHeight()
    {
        return imageGridLg4LineHeight;
    }

    public String getImageGridLg4LineUrl()
    {
        return imageGridLg4LineUrl;
    }

    public Integer getImageGridLg4LineWidth()
    {
        return imageGridLg4LineWidth;
    }

    public Integer getImageGridMed1LineHeight()
    {
        return imageGridMed1LineHeight;
    }

    public String getImageGridMed1LineUrl()
    {
        return imageGridMed1LineUrl;
    }

    public Integer getImageGridMed1LineWidth()
    {
        return imageGridMed1LineWidth;
    }

    public Integer getImageGridMed2LineHeight()
    {
        return imageGridMed2LineHeight;
    }

    public String getImageGridMed2LineUrl()
    {
        return imageGridMed2LineUrl;
    }

    public Integer getImageGridMed2LineWidth()
    {
        return imageGridMed2LineWidth;
    }

    public Integer getImageGridMed4LineHeight()
    {
        return imageGridMed4LineHeight;
    }

    public String getImageGridMed4LineUrl()
    {
        return imageGridMed4LineUrl;
    }

    public Integer getImageGridMed4LineWidth()
    {
        return imageGridMed4LineWidth;
    }

    public Integer getImageHeaderHeight()
    {
        return imageHeaderHeight;
    }

    public String getImageHeaderUrl()
    {
        return imageHeaderUrl;
    }

    public Integer getImageHeaderWidth()
    {
        return imageHeaderWidth;
    }

    public String getImageSignature()
    {
        return imageSignature;
    }

    public Integer getImageSmallHeight()
    {
        return imageSmallHeight;
    }

    public String getImageSmallUrl()
    {
        return imageSmallUrl;
    }

    public Integer getImageSmallWidth()
    {
        return imageSmallWidth;
    }

    public String getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public Integer getPinnerCount()
    {
        return pinnerCount;
    }

    public ArrayList getRecommendationPins()
    {
        return recommendationPins;
    }

    public String getRecommendationSource()
    {
        return recommendationSource;
    }

    public boolean getShouldAnimateOnAppear()
    {
        return _shouldAnimateOnAppear;
    }

    public String getUid()
    {
        return uid;
    }

    public String getUrlName()
    {
        return urlName;
    }

    public boolean isRecommended()
    {
        return _isRecommended;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setChildInterests(ArrayList arraylist)
    {
        childInterests = arraylist;
    }

    public void setDominantColor(String s)
    {
        dominantColor = s;
    }

    public void setFeedUpdatedTime(Date date)
    {
        feedUpdatedTime = date;
    }

    public void setFollowing(Boolean boolean1)
    {
        following = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageGridLg2LineHeight(Integer integer)
    {
        imageGridLg2LineHeight = integer;
    }

    public void setImageGridLg2LineUrl(String s)
    {
        imageGridLg2LineUrl = s;
    }

    public void setImageGridLg2LineWidth(Integer integer)
    {
        imageGridLg2LineWidth = integer;
    }

    public void setImageGridLg4LineHeight(Integer integer)
    {
        imageGridLg4LineHeight = integer;
    }

    public void setImageGridLg4LineUrl(String s)
    {
        imageGridLg4LineUrl = s;
    }

    public void setImageGridLg4LineWidth(Integer integer)
    {
        imageGridLg4LineWidth = integer;
    }

    public void setImageGridMed1LineHeight(Integer integer)
    {
        imageGridMed1LineHeight = integer;
    }

    public void setImageGridMed1LineUrl(String s)
    {
        imageGridMed1LineUrl = s;
    }

    public void setImageGridMed1LineWidth(Integer integer)
    {
        imageGridMed1LineWidth = integer;
    }

    public void setImageGridMed2LineHeight(Integer integer)
    {
        imageGridMed2LineHeight = integer;
    }

    public void setImageGridMed2LineUrl(String s)
    {
        imageGridMed2LineUrl = s;
    }

    public void setImageGridMed2LineWidth(Integer integer)
    {
        imageGridMed2LineWidth = integer;
    }

    public void setImageGridMed4LineHeight(Integer integer)
    {
        imageGridMed4LineHeight = integer;
    }

    public void setImageGridMed4LineUrl(String s)
    {
        imageGridMed4LineUrl = s;
    }

    public void setImageGridMed4LineWidth(Integer integer)
    {
        imageGridMed4LineWidth = integer;
    }

    public void setImageHeaderHeight(Integer integer)
    {
        imageHeaderHeight = integer;
    }

    public void setImageHeaderUrl(String s)
    {
        imageHeaderUrl = s;
    }

    public void setImageHeaderWidth(Integer integer)
    {
        imageHeaderWidth = integer;
    }

    public void setImageSignature(String s)
    {
        imageSignature = s;
    }

    public void setImageSmallHeight(Integer integer)
    {
        imageSmallHeight = integer;
    }

    public void setImageSmallUrl(String s)
    {
        imageSmallUrl = s;
    }

    public void setImageSmallWidth(Integer integer)
    {
        imageSmallWidth = integer;
    }

    public void setIsRecommended(boolean flag)
    {
        _isRecommended = flag;
    }

    public void setKey(String s)
    {
        key = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPinnerCount(Integer integer)
    {
        pinnerCount = integer;
    }

    public void setRecommendationPins(ArrayList arraylist)
    {
        recommendationPins = arraylist;
    }

    public void setRecommendationSource(String s)
    {
        recommendationSource = s;
    }

    public void setShouldAnimateOnAppear(boolean flag)
    {
        _shouldAnimateOnAppear = flag;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUrlName(String s)
    {
        urlName = s;
    }

    private class _cls1 extends BackgroundTask
    {

        final Interest val$interest;

        public final void run()
        {
            ModelHelper.setInterest(interest);
        }

        _cls1()
        {
            interest = interest1;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final List val$interests;

        public final void run()
        {
            ModelHelper.setInterests(interests);
        }

        _cls2()
        {
            interests = list;
            super();
        }
    }

}
