// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.text.Html;
import android.text.Spanned;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Model, ModelHelper

public class Place extends Model
{

    private static final String SEPARATOR = ", ";
    private static final SimpleDateFormat _sHourFormatter = new SimpleDateFormat("HHmm");
    private String _address;
    private Spanned _addressDisplay;
    private String _addressShort;
    private String _cityState;
    private List _displayHours;
    private List _displayTips;
    private String access;
    private Date cacheExpirationDate;
    private String category;
    private String country;
    private Boolean fromPinJoin;
    private String hours;
    private Long id;
    private Double latitude;
    private String locality;
    private Double longitude;
    private String name;
    private String phone;
    private String postalCode;
    private String region;
    private String searchId;
    private String sourceIcon;
    private String sourceName;
    private String sourceUrl;
    private String street;
    private String tips;
    private String type;
    private String uid;
    private String url;

    public Place()
    {
    }

    public Place(Long long1)
    {
        id = long1;
    }

    public Place(Long long1, String s, Date date, String s1, Double double1, Double double2, String s2, 
            String s3, String s4, String s5, String s6, String s7, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            String s17, Boolean boolean1)
    {
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        searchId = s1;
        latitude = double1;
        longitude = double2;
        category = s2;
        sourceIcon = s3;
        sourceName = s4;
        name = s5;
        locality = s6;
        url = s7;
        country = s8;
        region = s9;
        sourceUrl = s10;
        phone = s11;
        street = s12;
        postalCode = s13;
        type = s14;
        access = s15;
        hours = s16;
        tips = s17;
        fromPinJoin = boolean1;
    }

    public static Place make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static Place make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            final Place place = (Place)pinterestjsonobject.a(com/pinterest/api/model/Place);
            PinterestJsonArray pinterestjsonarray = pinterestjsonobject.e("hours");
            if (pinterestjsonarray.a() > 0)
            {
                place.setHours(pinterestjsonarray.toString());
            }
            pinterestjsonobject = pinterestjsonobject.e("simple_tips");
            if (pinterestjsonobject.a() > 0)
            {
                place.setTips(pinterestjsonobject.toString());
            }
            pinterestjsonobject = place;
            if (flag)
            {
                (new _cls1()).execute();
                return place;
            }
        }
        return pinterestjsonobject;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            Place place = make(pinterestjsonarray.c(i), false);
            if (place != null)
            {
                arraylist.add(place);
            }
        }

        ModelHelper.setPlaces(arraylist);
        return arraylist;
    }

    public static Place merge(Place place)
    {
        if (place == null)
        {
            return null;
        } else
        {
            return merge(place, ModelHelper.getPlace(place.getUid()));
        }
    }

    public static Place merge(Place place, Place place1)
    {
        Place place2;
        if (place == null)
        {
            place2 = null;
        } else
        {
            place2 = place;
            if (place1 != null)
            {
                if (place.cacheExpirationDate != null)
                {
                    place1.cacheExpirationDate = place.cacheExpirationDate;
                }
                if (place.searchId != null)
                {
                    place1.searchId = place.searchId;
                }
                if (place.latitude != null)
                {
                    place1.latitude = place.latitude;
                }
                if (place.longitude != null)
                {
                    place1.longitude = place.longitude;
                }
                if (place.category != null)
                {
                    place1.category = place.category;
                }
                if (place.sourceIcon != null)
                {
                    place1.sourceIcon = place.sourceIcon;
                }
                if (place.sourceName != null)
                {
                    place1.sourceName = place.sourceName;
                }
                if (place.name != null)
                {
                    place1.name = place.name;
                }
                if (place.locality != null)
                {
                    place1.locality = place.locality;
                }
                if (place.url != null)
                {
                    place1.url = place.url;
                }
                if (place.country != null)
                {
                    place1.country = place.country;
                }
                if (place.region != null)
                {
                    place1.region = place.region;
                }
                if (place.sourceUrl != null)
                {
                    place1.sourceUrl = place.sourceUrl;
                }
                if (place.phone != null)
                {
                    place1.phone = place.phone;
                }
                if (place.street != null)
                {
                    place1.street = place.street;
                }
                if (place.postalCode != null)
                {
                    place1.postalCode = place.postalCode;
                }
                if (place.type != null)
                {
                    place1.type = place.type;
                }
                if (place.access != null)
                {
                    place1.access = place.access;
                }
                if (place.hours != null)
                {
                    place1.hours = place.hours;
                }
                if (place.tips != null)
                {
                    place1.tips = place.tips;
                }
                if (place.fromPinJoin != null)
                {
                    place1.fromPinJoin = place.fromPinJoin;
                }
                return place1;
            }
        }
        return place2;
    }

    private static List parseHours(PinterestJsonArray pinterestjsonarray)
    {
        if (pinterestjsonarray != null && pinterestjsonarray.a() != 0) goto _L2; else goto _L1
_L1:
        pinterestjsonarray = null;
_L4:
        return pinterestjsonarray;
_L2:
        ArrayList arraylist;
        JsonArray jsonarray;
        int i;
        arraylist = new ArrayList();
        jsonarray = pinterestjsonarray.a;
        i = 0;
_L9:
        pinterestjsonarray = arraylist;
        if (i >= jsonarray.size()) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj = jsonarray.get(i).getAsJsonObject();
        obj1 = ((JsonObject) (obj)).get("open").getAsJsonArray();
        pinterestjsonarray = new ArrayList();
        int j = 0;
_L6:
        if (j >= ((JsonArray) (obj1)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = ((JsonArray) (obj1)).get(j).getAsJsonObject();
        String s = ((JsonObject) (obj2)).get("start").getAsString();
        obj2 = ((JsonObject) (obj2)).get("end").getAsString();
        pinterestjsonarray.add(new StartEndHours(_sHourFormatter.parse(s), _sHourFormatter.parse(((String) (obj2)))));
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        obj = ((JsonObject) (obj)).get("days").getAsJsonArray();
        obj1 = new ArrayList();
        j = 0;
_L8:
        if (j >= ((JsonArray) (obj)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((List) (obj1)).add(Integer.valueOf(((JsonArray) (obj)).get(j).getAsInt()));
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        arraylist.add(new DisplayHours(pinterestjsonarray, ((List) (obj1))));
        i++;
          goto _L9
        pinterestjsonarray;
        PLog.log("Malformed 'hours' JSON in place data.", new Object[] {
            pinterestjsonarray
        });
_L11:
        return null;
        pinterestjsonarray;
        PLog.log("Malformed 'start' or 'end' hours in place data.", new Object[] {
            pinterestjsonarray
        });
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static List parseTips(PinterestJsonArray pinterestjsonarray)
    {
        if (pinterestjsonarray != null && pinterestjsonarray.a() != 0) goto _L2; else goto _L1
_L1:
        pinterestjsonarray = null;
_L4:
        return pinterestjsonarray;
_L2:
        ArrayList arraylist;
        JsonArray jsonarray;
        int i;
        arraylist = new ArrayList();
        jsonarray = pinterestjsonarray.a;
        i = 0;
_L5:
        pinterestjsonarray = arraylist;
        if (i >= jsonarray.size()) goto _L4; else goto _L3
_L3:
        arraylist.add(jsonarray.get(i).getAsString());
        i++;
          goto _L5
        pinterestjsonarray;
        PLog.log("Malformed 'simple_tips' JSON in place data.", new Object[] {
            pinterestjsonarray
        });
        return null;
    }

    public boolean canEdit()
    {
        return access != null && access.contains("write");
    }

    public String getAccess()
    {
        return access;
    }

    public String getAddress()
    {
        return getAddress(false);
    }

    public String getAddress(boolean flag)
    {
        if (_address == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (ModelHelper.isValidString(getStreet()))
            {
                if (flag)
                {
                    stringbuilder.append(getStreet()).append(System.getProperty("line.separator"));
                } else
                {
                    stringbuilder.append(getStreet()).append(", ");
                }
            }
            if (ModelHelper.isValidString(getLocality()))
            {
                stringbuilder.append(getLocality()).append(", ");
            }
            if (ModelHelper.isValidString(getRegion()))
            {
                stringbuilder.append(getRegion()).append(", ");
            }
            if (ModelHelper.isValidString(getCountry()))
            {
                stringbuilder.append(getCountry());
            }
            _address = stringbuilder.toString();
        }
        return _address;
    }

    public Spanned getAddressDisplay()
    {
        if (_addressDisplay == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (ModelHelper.isValidString(getStreet()))
            {
                stringbuilder.append(getStreet());
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("<br/>");
            }
            if (ModelHelper.isValidString(getLocality()))
            {
                stringbuilder.append(getLocality()).append(", ");
            }
            if (ModelHelper.isValidString(getRegion()))
            {
                stringbuilder.append(getRegion()).append(", ");
            }
            if (ModelHelper.isValidString(getCountry()))
            {
                stringbuilder.append(getCountry());
            }
            _addressDisplay = Html.fromHtml(stringbuilder.toString());
        }
        return _addressDisplay;
    }

    public String getAddressShort()
    {
        if (_addressShort == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s = getCityState();
            if (ModelHelper.isValidString(s))
            {
                stringbuilder.append(s);
            }
            s = getCountry();
            if (ModelHelper.isValidString(s))
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(s);
            }
            _addressShort = stringbuilder.toString();
        }
        return _addressShort;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getCategory()
    {
        return category;
    }

    public String getCityState()
    {
        if (_cityState == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (ModelHelper.isValidString(getLocality()))
            {
                stringbuilder.append(getLocality());
            }
            if (ModelHelper.isValidString(getRegion()))
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(getRegion());
            }
            _cityState = stringbuilder.toString();
        }
        return _cityState;
    }

    public String getCountry()
    {
        return country;
    }

    public List getDisplayHours()
    {
        if (_displayHours == null && !StringUtils.isEmpty(getHours()))
        {
            _displayHours = parseHours(new PinterestJsonArray(getHours()));
        }
        return _displayHours;
    }

    public List getDisplayTips()
    {
        if (_displayTips == null && !StringUtils.isEmpty(getTips()))
        {
            _displayTips = parseTips(new PinterestJsonArray(getTips()));
        }
        return _displayTips;
    }

    public Boolean getFromPinJoin()
    {
        return fromPinJoin;
    }

    public String getHours()
    {
        return hours;
    }

    public Long getId()
    {
        return id;
    }

    public LatLng getLatLng()
    {
        return new LatLng(latitude.doubleValue(), longitude.doubleValue());
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public String getLocality()
    {
        return locality;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public CharSequence getMetadataDisplay()
    {
        if (ModelHelper.isValidString(getCategory()) && ModelHelper.isValid(getCityState()))
        {
            return Resources.string(0x7f070437, new Object[] {
                getCategory(), getCityState()
            });
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getRegion()
    {
        return region;
    }

    public String getSearchId()
    {
        return searchId;
    }

    public String getSourceIcon()
    {
        return sourceIcon;
    }

    public String getSourceName()
    {
        return sourceName;
    }

    public String getSourceUrl()
    {
        return sourceUrl;
    }

    public String getStreet()
    {
        return street;
    }

    public String getTips()
    {
        return tips;
    }

    public String getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isOpenNow()
    {
        if (_displayHours != null);
        return false;
    }

    public void setAccess(String s)
    {
        access = s;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setDisplayHours(List list)
    {
        _displayHours = list;
    }

    public void setDisplayTips(List list)
    {
        _displayTips = list;
    }

    public void setFromPinJoin(Boolean boolean1)
    {
        fromPinJoin = boolean1;
    }

    public void setHours(String s)
    {
        hours = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLatitude(Double double1)
    {
        latitude = double1;
    }

    public void setLocality(String s)
    {
        locality = s;
    }

    public void setLongitude(Double double1)
    {
        longitude = double1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setRegion(String s)
    {
        region = s;
    }

    public void setSearchId(String s)
    {
        searchId = s;
    }

    public void setSourceIcon(String s)
    {
        sourceIcon = s;
    }

    public void setSourceName(String s)
    {
        sourceName = s;
    }

    public void setSourceUrl(String s)
    {
        sourceUrl = s;
    }

    public void setStreet(String s)
    {
        street = s;
    }

    public void setTips(String s)
    {
        tips = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }


    private class _cls1 extends BackgroundTask
    {

        final Place val$place;

        public final void run()
        {
            ModelHelper.setPlace(Place.merge(place));
        }

        _cls1()
        {
            place = place1;
            super();
        }
    }


    private class StartEndHours
    {

        public Date end;
        public Date start;

        public StartEndHours(Date date, Date date1)
        {
            start = date;
            end = date1;
        }
    }


    private class DisplayHours
    {

        private List _days;
        private String _daysDisplay;
        private List _hours;
        private String _timesDisplay;

        private boolean areDaysConsecutive()
        {
            Iterator iterator = _days.iterator();
            Integer integer;
            for (int i = -1; iterator.hasNext(); i = integer.intValue())
            {
                integer = (Integer)iterator.next();
                if (i != -1 && integer.intValue() != i + 1)
                {
                    return false;
                }
            }

            return true;
        }

        public void generateDisplayFields()
        {
            Object obj;
            int i;
            _daysDisplay = "";
            obj = (new DateFormatSymbols()).getShortWeekdays();
            i = _days.size();
            if (i != 1) goto _L2; else goto _L1
_L1:
            _daysDisplay = obj[((Integer)_days.get(0)).intValue()];
_L4:
            _timesDisplay = "";
            obj = DateFormat.getTimeInstance(3);
            for (Iterator iterator = _hours.iterator(); iterator.hasNext();)
            {
                StartEndHours startendhours = (StartEndHours)iterator.next();
                if (!_timesDisplay.isEmpty())
                {
                    _timesDisplay = (new StringBuilder()).append(_timesDisplay).append(System.getProperty("line.separator")).toString();
                }
                _timesDisplay = (new StringBuilder()).append(_timesDisplay).append(Resources.string(0x7f070442, new Object[] {
                    ((DateFormat) (obj)).format(startendhours.start), ((DateFormat) (obj)).format(startendhours.end)
                })).toString();
            }

            break; /* Loop/switch isn't completed */
_L2:
            if (!areDaysConsecutive())
            {
                break; /* Loop/switch isn't completed */
            }
            _daysDisplay = Resources.string(0x7f070438, new Object[] {
                obj[((Integer)_days.get(0)).intValue()], obj[((Integer)_days.get(i - 1)).intValue()]
            });
            if (true) goto _L4; else goto _L3
_L3:
            Iterator iterator1 = _days.iterator();
            while (iterator1.hasNext()) 
            {
                Integer integer = (Integer)iterator1.next();
                if (!TextUtils.isEmpty(_daysDisplay))
                {
                    _daysDisplay = (new StringBuilder()).append(_daysDisplay).append(", ").toString();
                }
                _daysDisplay = (new StringBuilder()).append(_daysDisplay).append(obj[integer.intValue()]).toString();
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public String getDaysDisplay()
        {
            if (_daysDisplay == null)
            {
                generateDisplayFields();
            }
            return _daysDisplay;
        }

        public String getTimesDisplay()
        {
            if (_timesDisplay == null)
            {
                generateDisplayFields();
            }
            return _timesDisplay;
        }

        public DisplayHours(List list, List list1)
        {
            _hours = list;
            _days = list1;
            generateDisplayFields();
        }
    }

}
