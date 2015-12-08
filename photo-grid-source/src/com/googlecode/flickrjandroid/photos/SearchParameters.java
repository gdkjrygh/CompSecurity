// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.googlecode.flickrjandroid.photos:
//            c, d

public class SearchParameters
{

    public static final ThreadLocal DATE_FORMATS = new c();
    public static int DATE_POSTED_ASC = 0;
    public static int DATE_POSTED_DESC = 0;
    public static int DATE_TAKEN_ASC = 0;
    public static int DATE_TAKEN_DESC = 0;
    public static int INTERESTINGNESS_ASC = 0;
    public static int INTERESTINGNESS_DESC = 0;
    public static final ThreadLocal MYSQL_DATE_FORMATS = new d();
    public static int RELEVANCE = 0;
    public static final long serialVersionUID = 12L;
    private int accuracy;
    private String bbox[];
    private String contacts;
    private Set extras;
    private String groupId;
    private boolean hasGeo;
    private boolean inCommons;
    private Date interestingnessDate;
    private String latitude;
    private String license;
    private String longitude;
    private String machineTagMode;
    private String machineTags[];
    private Date maxTakenDate;
    private Date maxUploadDate;
    private String media;
    private Date minTakenDate;
    private Date minUploadDate;
    private String placeId;
    private int radius;
    private String radiusUnits;
    private String safeSearch;
    private int sort;
    private String tagMode;
    private String tags[];
    private String text;
    private String userId;
    private String woeId;

    public SearchParameters()
    {
        accuracy = 0;
        radius = -1;
        hasGeo = false;
        inCommons = false;
        sort = 0;
    }

    public int getAccuracy()
    {
        return accuracy;
    }

    public Collection getAsParameters()
    {
        String as[];
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (inCommons)
        {
            arraylist.add(new Parameter("is_commons", "true"));
        }
        Object obj = getLatitude();
        if (obj != null)
        {
            arraylist.add(new Parameter("lat", obj));
        }
        obj = getLongitude();
        if (obj != null)
        {
            arraylist.add(new Parameter("lon", obj));
        }
        int i = getRadius();
        if (i > 0)
        {
            arraylist.add(new Parameter("radius", i));
        }
        obj = getRadiusUnits();
        if (obj != null)
        {
            arraylist.add(new Parameter("radius_units", obj));
        }
        obj = getMedia();
        if (obj != null)
        {
            arraylist.add(new Parameter("media", obj));
        }
        obj = getUserId();
        if (obj != null)
        {
            arraylist.add(new Parameter("user_id", obj));
            obj = getContacts();
            if (obj != null)
            {
                arraylist.add(new Parameter("contacts", obj));
            }
        }
        obj = getGroupId();
        if (obj != null)
        {
            arraylist.add(new Parameter("group_id", obj));
        }
        as = getTags();
        if (as != null)
        {
            arraylist.add(new Parameter("tags", StringUtilities.join(as, ",")));
        }
        as = getTagMode();
        if (as != null)
        {
            arraylist.add(new Parameter("tag_mode", as));
        }
        as = getMachineTags();
        if (as != null)
        {
            arraylist.add(new Parameter("machine_tags", StringUtilities.join(as, ",")));
        }
        as = getMachineTagMode();
        if (as != null)
        {
            arraylist.add(new Parameter("machine_tag_mode", as));
        }
        as = getText();
        if (as != null)
        {
            arraylist.add(new Parameter("text", as));
        }
        as = getMinUploadDate();
        if (as != null)
        {
            arraylist.add(new Parameter("min_upload_date", new Long(as.getTime() / 1000L)));
        }
        as = getMaxUploadDate();
        if (as != null)
        {
            arraylist.add(new Parameter("max_upload_date", new Long(as.getTime() / 1000L)));
        }
        as = getMinTakenDate();
        if (as != null)
        {
            arraylist.add(new Parameter("min_taken_date", ((DateFormat)MYSQL_DATE_FORMATS.get()).format(as)));
        }
        as = getMaxTakenDate();
        if (as != null)
        {
            arraylist.add(new Parameter("max_taken_date", ((DateFormat)MYSQL_DATE_FORMATS.get()).format(as)));
        }
        as = getLicense();
        if (as != null)
        {
            arraylist.add(new Parameter("license", as));
        }
        as = getInterestingnessDate();
        if (as != null)
        {
            arraylist.add(new Parameter("date", ((DateFormat)DATE_FORMATS.get()).format(as)));
        }
        as = getBBox();
        if (as == null) goto _L2; else goto _L1
_L1:
        arraylist.add(new Parameter("bbox", StringUtilities.join(as, ",")));
        if (accuracy > 0)
        {
            arraylist.add(new Parameter("accuracy", accuracy));
        }
_L4:
        String s = getSafeSearch();
        if (s != null)
        {
            arraylist.add(new Parameter("safe_search", s));
        }
        if (getHasGeo())
        {
            arraylist.add(new Parameter("has_geo", "true"));
        }
        if (extras != null && !extras.isEmpty())
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(extras, ",")));
        }
        if (sort != DATE_POSTED_DESC)
        {
            String s1 = null;
            if (sort == DATE_POSTED_ASC)
            {
                s1 = "date-posted-asc";
            }
            if (sort == DATE_TAKEN_DESC)
            {
                s1 = "date-taken-desc";
            }
            if (sort == DATE_TAKEN_ASC)
            {
                s1 = "date-taken-asc";
            }
            if (sort == INTERESTINGNESS_DESC)
            {
                s1 = "interestingness-desc";
            }
            if (sort == INTERESTINGNESS_ASC)
            {
                s1 = "interestingness-asc";
            }
            if (sort == RELEVANCE)
            {
                s1 = "relevance";
            }
            if (s1 != null)
            {
                arraylist.add(new Parameter("sort", s1));
            }
        }
        return arraylist;
_L2:
        String s2 = getWoeId();
        if (s2 != null)
        {
            arraylist.add(new Parameter("woe_id", s2));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String[] getBBox()
    {
        return bbox;
    }

    public String getContacts()
    {
        return contacts;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public boolean getHasGeo()
    {
        return hasGeo;
    }

    public Date getInterestingnessDate()
    {
        return interestingnessDate;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public String getLicense()
    {
        return license;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public String getMachineTagMode()
    {
        return machineTagMode;
    }

    public String[] getMachineTags()
    {
        return machineTags;
    }

    public Date getMaxTakenDate()
    {
        return maxTakenDate;
    }

    public Date getMaxUploadDate()
    {
        return maxUploadDate;
    }

    public String getMedia()
    {
        return media;
    }

    public Date getMinTakenDate()
    {
        return minTakenDate;
    }

    public Date getMinUploadDate()
    {
        return minUploadDate;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public int getRadius()
    {
        return radius;
    }

    public String getRadiusUnits()
    {
        return radiusUnits;
    }

    public String getSafeSearch()
    {
        return safeSearch;
    }

    public int getSort()
    {
        return sort;
    }

    public String getTagMode()
    {
        return tagMode;
    }

    public String[] getTags()
    {
        return tags;
    }

    public String getText()
    {
        return text;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getWoeId()
    {
        return woeId;
    }

    public boolean isInCommons()
    {
        return inCommons;
    }

    public void setAccuracy(int i)
    {
        accuracy = i;
    }

    public void setBBox(String s, String s1, String s2, String s3)
    {
        bbox = (new String[] {
            s, s1, s2, s3
        });
    }

    public void setContacts(String s)
    {
        contacts = s;
    }

    public void setExtras(Set set)
    {
        extras = set;
    }

    public void setGroupId(String s)
    {
        groupId = s;
    }

    public void setHasGeo(boolean flag)
    {
        hasGeo = flag;
    }

    public void setInCommons(boolean flag)
    {
        inCommons = flag;
    }

    public void setInterestingnessDate(Date date)
    {
        interestingnessDate = date;
    }

    public void setLatitude(String s)
    {
        latitude = s;
    }

    public void setLicense(String s)
    {
        license = s;
    }

    public void setLongitude(String s)
    {
        longitude = s;
    }

    public void setMachineTagMode(String s)
    {
        machineTagMode = s;
    }

    public void setMachineTags(String as[])
    {
        machineTags = as;
    }

    public void setMaxTakenDate(Date date)
    {
        maxTakenDate = date;
    }

    public void setMaxUploadDate(Date date)
    {
        maxUploadDate = date;
    }

    public void setMedia(String s)
    {
        if (s.equals("all") || s.equals("photos") || s.equals("videos"))
        {
            media = s;
            return;
        } else
        {
            throw new FlickrException("0", "Media type is not valid.");
        }
    }

    public void setMinTakenDate(Date date)
    {
        minTakenDate = date;
    }

    public void setMinUploadDate(Date date)
    {
        minUploadDate = date;
    }

    public void setPlaceId(String s)
    {
        placeId = s;
    }

    public void setRadius(int i)
    {
        radius = i;
    }

    public void setRadiusUnits(String s)
    {
        radiusUnits = s;
    }

    public void setSafeSearch(String s)
    {
        safeSearch = s;
    }

    public void setSort(int i)
    {
        sort = i;
    }

    public void setTagMode(String s)
    {
        tagMode = s;
    }

    public void setTags(String as[])
    {
        tags = as;
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setUserId(String s)
    {
        userId = s;
    }

    public void setWoeId(String s)
    {
        woeId = s;
    }

    static 
    {
        DATE_POSTED_DESC = 0;
        DATE_POSTED_ASC = 1;
        DATE_TAKEN_DESC = 2;
        DATE_TAKEN_ASC = 3;
        INTERESTINGNESS_DESC = 4;
        INTERESTINGNESS_ASC = 5;
        RELEVANCE = 6;
    }
}
