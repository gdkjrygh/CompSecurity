// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.location.Location;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class MMRequest
{

    public static final String EDUCATION_ASSOCIATES = "associates";
    public static final String EDUCATION_BACHELORS = "bachelors";
    public static final String EDUCATION_DOCTORATE = "doctorate";
    public static final String EDUCATION_HIGH_SCHOOL = "highschool";
    public static final String EDUCATION_IN_COLLEGE = "incollege";
    public static final String EDUCATION_MASTERS = "masters";
    public static final String EDUCATION_OTHER = "other";
    public static final String EDUCATION_SOME_COLLEGE = "somecollege";
    public static final String ETHNICITY_ASIAN = "asian";
    public static final String ETHNICITY_BLACK = "black";
    public static final String ETHNICITY_HISPANIC = "hispanic";
    public static final String ETHNICITY_INDIAN = "indian";
    public static final String ETHNICITY_MIDDLE_EASTERN = "middleeastern";
    public static final String ETHNICITY_NATIVE_AMERICAN = "nativeamerican";
    public static final String ETHNICITY_OTHER = "other";
    public static final String ETHNICITY_PACIFIC_ISLANDER = "pacificislander";
    public static final String ETHNICITY_WHITE = "white";
    public static final String GENDER_FEMALE = "female";
    public static final String GENDER_MALE = "male";
    public static final String GENDER_OTHER = "other";
    public static final String KEY_AGE = "age";
    public static final String KEY_CHILDREN = "children";
    public static final String KEY_EDUCATION = "education";
    public static final String KEY_ETHNICITY = "ethnicity";
    public static final String KEY_GENDER = "gender";
    public static final String KEY_HEIGHT = "hsht";
    public static final String KEY_INCOME = "income";
    public static final String KEY_KEYWORDS = "keywords";
    public static final String KEY_MARITAL_STATUS = "marital";
    public static final String KEY_POLITICS = "politics";
    public static final String KEY_VENDOR = "vendor";
    public static final String KEY_WIDTH = "hswd";
    public static final String KEY_ZIP_CODE = "zip";
    public static final String MARITAL_DIVORCED = "divorced";
    public static final String MARITAL_ENGAGED = "engaged";
    public static final String MARITAL_MARRIED = "married";
    public static final String MARITAL_OTHER = "other";
    public static final String MARITAL_RELATIONSHIP = "relationship";
    public static final String MARITAL_SINGLE = "single";
    static Location location;
    String age;
    String children;
    String education;
    String ethnicity;
    String gender;
    String income;
    String keywords;
    String marital;
    String politics;
    private Map values;
    String vendor;
    String zip;

    public MMRequest()
    {
        age = null;
        children = null;
        education = null;
        ethnicity = null;
        gender = null;
        income = null;
        keywords = null;
        marital = null;
        politics = null;
        vendor = null;
        zip = null;
        values = new HashMap();
    }

    public static Location getUserLocation()
    {
        return location;
    }

    static void insertLocation(Map map)
    {
        if (location != null)
        {
            map.put("lat", Double.toString(location.getLatitude()));
            map.put("long", Double.toString(location.getLongitude()));
            if (location.hasAccuracy())
            {
                map.put("ha", Float.toString(location.getAccuracy()));
                map.put("va", Float.toString(location.getAccuracy()));
            }
            if (location.hasSpeed())
            {
                map.put("spd", Float.toString(location.getSpeed()));
            }
            if (location.hasBearing())
            {
                map.put("brg", Float.toString(location.getBearing()));
            }
            if (location.hasAltitude())
            {
                map.put("alt", Double.toString(location.getAltitude()));
            }
            map.put("tslr", Long.toString(location.getTime()));
            map.put("loc", "true");
            map.put("lsrc", location.getProvider());
            return;
        } else
        {
            map.put("loc", "false");
            return;
        }
    }

    public static void setUserLocation(Location location1)
    {
        if (location1 == null)
        {
            return;
        } else
        {
            location = location1;
            return;
        }
    }

    void getUrlParams(Map map)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = values.entrySet().iterator(); iterator.hasNext(); map.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (age != null)
        {
            map.put("age", age);
        }
        if (children != null)
        {
            map.put("children", children);
        }
        if (education != null)
        {
            map.put("education", education);
        }
        if (ethnicity != null)
        {
            map.put("ethnicity", ethnicity);
        }
        if (gender != null)
        {
            map.put("gender", gender);
        }
        if (income != null)
        {
            map.put("income", income);
        }
        if (keywords != null)
        {
            map.put("keywords", keywords);
        }
        if (marital != null)
        {
            map.put("marital", marital);
        }
        if (politics != null)
        {
            map.put("politics", politics);
        }
        if (vendor != null)
        {
            map.put("vendor", vendor);
        }
        if (zip != null)
        {
            map.put("zip", zip);
        }
    }

    public MMRequest put(String s, String s1)
    {
        if (s.equals("age"))
        {
            age = s1;
            return this;
        }
        if (s.equals("children"))
        {
            children = s1;
            return this;
        }
        if (s.equals("education"))
        {
            education = s1;
            return this;
        }
        if (s.equals("ethnicity"))
        {
            ethnicity = s1;
            return this;
        }
        if (s.equals("gender"))
        {
            gender = s1;
            return this;
        }
        if (s.equals("income"))
        {
            income = s1;
            return this;
        }
        if (s.equals("keywords"))
        {
            keywords = s1;
            return this;
        }
        if (s.equals("marital"))
        {
            marital = s1;
            return this;
        }
        if (s.equals("politics"))
        {
            politics = s1;
            return this;
        }
        if (s.equals("vendor"))
        {
            vendor = s1;
            return this;
        }
        if (s.equals("zip"))
        {
            zip = s1;
            return this;
        }
        if (s1 != null)
        {
            values.put(s, s1);
            return this;
        } else
        {
            values.remove(s);
            return this;
        }
    }

    public void setAge(String s)
    {
        age = s;
    }

    public void setChildren(String s)
    {
        children = s;
    }

    public void setEducation(String s)
    {
        education = s;
    }

    public void setEthnicity(String s)
    {
        ethnicity = s;
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setIncome(String s)
    {
        income = s;
    }

    public void setKeywords(String s)
    {
        keywords = s;
    }

    public void setMarital(String s)
    {
        marital = s;
    }

    public void setMetaValues(Map map)
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                put((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    public void setPolitics(String s)
    {
        politics = s;
    }

    public void setVendor(String s)
    {
        vendor = s;
    }

    public void setZip(String s)
    {
        zip = s;
    }
}
