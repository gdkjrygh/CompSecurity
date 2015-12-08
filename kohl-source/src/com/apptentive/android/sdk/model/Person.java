// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload, CustomData

public class Person extends Payload
{

    public static final String KEY = "person";
    private static final String KEY_BIRTHDAY = "birthday";
    private static final String KEY_CITY = "city";
    private static final String KEY_COUNTRY = "country";
    public static final String KEY_CUSTOM_DATA = "custom_data";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_FACEBOOK_ID = "facebook_id";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE_NUMBER = "phone_number";
    private static final String KEY_STREET = "street";
    private static final String KEY_ZIP = "zip";

    public Person()
    {
    }

    public Person(String s)
        throws JSONException
    {
        super(s);
    }

    public String getBirthday()
    {
        String s;
        if (isNull("birthday"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("birthday");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getCity()
    {
        String s;
        if (isNull("city"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("city");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getCountry()
    {
        String s;
        if (isNull("country"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("country");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public CustomData getCustomData()
    {
        if (isNull("custom_data"))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        CustomData customdata = new CustomData(getJSONObject("custom_data"));
        return customdata;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getEmail()
    {
        String s;
        if (isNull("email"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("email");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getFacebookId()
    {
        String s;
        if (isNull("facebook_id"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("facebook_id");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getId()
    {
        String s;
        if (isNull("id"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("id");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getName()
    {
        String s;
        if (isNull("name"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("name");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getPhoneNumber()
    {
        String s;
        if (isNull("phone_number"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("phone_number");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getStreet()
    {
        String s;
        if (isNull("street"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("street");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getZip()
    {
        String s;
        if (isNull("zip"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("zip");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public void initBaseType()
    {
        setBaseType(Payload.BaseType.person);
    }

    public void setBirthday(String s)
    {
        try
        {
            put("birthday", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field birthday of person", new Object[0]);
        }
    }

    public void setCity(String s)
    {
        try
        {
            put("city", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field city of person", new Object[0]);
        }
    }

    public void setCountry(String s)
    {
        try
        {
            put("country", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field country of person", new Object[0]);
        }
    }

    public void setCustomData(CustomData customdata)
    {
        try
        {
            put("custom_data", customdata);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CustomData customdata)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "custom_data"
            });
        }
    }

    public void setEmail(String s)
    {
        try
        {
            put("email", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field email of person", new Object[0]);
        }
    }

    public void setFacebookId(String s)
    {
        try
        {
            put("facebook_id", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field facebook_id of person", new Object[0]);
        }
    }

    public void setId(String s)
    {
        try
        {
            put("id", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field id of person", new Object[0]);
        }
    }

    public void setName(String s)
    {
        try
        {
            put("name", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field name of person", new Object[0]);
        }
    }

    public void setPhoneNumber(String s)
    {
        try
        {
            put("phone_number", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field phone_number of person", new Object[0]);
        }
    }

    public void setStreet(String s)
    {
        try
        {
            put("street", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field street of person", new Object[0]);
        }
    }

    public void setZip(String s)
    {
        try
        {
            put("zip", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to set field zip of person", new Object[0]);
        }
    }
}
