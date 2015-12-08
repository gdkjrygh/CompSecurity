// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload, CustomData

public class Device extends Payload
{

    public static final String KEY = "device";
    private static final String KEY_BOARD = "board";
    private static final String KEY_BOOTLOADER_VERSION = "bootloader_version";
    private static final String KEY_BRAND = "brand";
    private static final String KEY_BUILD_ID = "build_id";
    private static final String KEY_BUILD_TYPE = "build_type";
    private static final String KEY_CARRIER = "carrier";
    private static final String KEY_CPU = "cpu";
    private static final String KEY_CURRENT_CARRIER = "current_carrier";
    public static final String KEY_CUSTOM_DATA = "custom_data";
    private static final String KEY_DEVICE = "device";
    private static final String KEY_INTEGRATION_CONFIG = "integration_config";
    private static final String KEY_LOCALE_COUNTRY_CODE = "locale_country_code";
    private static final String KEY_LOCALE_LANGUAGE_CODE = "locale_language_code";
    private static final String KEY_LOCALE_RAW = "locale_raw";
    private static final String KEY_MANUFACTURER = "manufacturer";
    private static final String KEY_MODEL = "model";
    private static final String KEY_NETWORK_TYPE = "network_type";
    private static final String KEY_OS_API_LEVEL = "os_api_level";
    private static final String KEY_OS_BUILD = "os_build";
    private static final String KEY_OS_NAME = "os_name";
    private static final String KEY_OS_VERSION = "os_version";
    private static final String KEY_PRODUCT = "product";
    private static final String KEY_RADIO_VERSION = "radio_version";
    private static final String KEY_UTC_OFFSET = "utc_offset";
    private static final String KEY_UUID = "uuid";

    public Device()
    {
    }

    public Device(String s)
        throws JSONException
    {
        super(s);
    }

    public String getBoard()
    {
        String s;
        if (isNull("board"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("board");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getBootloaderVersion()
    {
        String s;
        if (isNull("bootloader_version"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("bootloader_version");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getBrand()
    {
        String s;
        if (isNull("brand"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("brand");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getBuildId()
    {
        String s;
        if (isNull("build_id"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("build_id");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getBuildType()
    {
        String s;
        if (isNull("build_type"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("build_type");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getCarrier()
    {
        String s;
        if (isNull("carrier"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("carrier");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getCpu()
    {
        String s;
        if (isNull("cpu"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("cpu");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getCurrentCarrier()
    {
        String s;
        if (isNull("current_carrier"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("current_carrier");
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

    public String getDevice()
    {
        String s;
        if (isNull("device"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("device");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public CustomData getIntegrationConfig()
    {
        if (isNull("integration_config"))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        CustomData customdata = new CustomData(getJSONObject("integration_config"));
        return customdata;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getLocaleCountryCode()
    {
        String s;
        if (isNull("locale_country_code"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("locale_country_code");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getLocaleLanguageCode()
    {
        String s;
        if (isNull("locale_language_code"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("locale_language_code");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getLocaleRaw()
    {
        String s;
        if (isNull("locale_raw"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("locale_raw");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getManufacturer()
    {
        String s;
        if (isNull("manufacturer"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("manufacturer");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getModel()
    {
        String s;
        if (isNull("model"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("model");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getNetworkType()
    {
        String s;
        if (isNull("network_type"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("network_type");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getOsApiLevel()
    {
        String s;
        if (isNull("os_api_level"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("os_api_level");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getOsBuild()
    {
        String s;
        if (isNull("os_build"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("os_build");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getOsName()
    {
        String s;
        if (isNull("os_name"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("os_name");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getOsVersion()
    {
        String s;
        if (isNull("os_version"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("os_version");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getProduct()
    {
        String s;
        if (isNull("product"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("product");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getRadioVersion()
    {
        String s;
        if (isNull("radio_version"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("radio_version");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getUtcOffset()
    {
        String s;
        if (isNull("utc_offset"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("utc_offset");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getUuid()
    {
        String s;
        if (isNull("uuid"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("uuid");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public void initBaseType()
    {
        setBaseType(Payload.BaseType.device);
    }

    public void setBoard(String s)
    {
        try
        {
            put("board", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "board"
            });
        }
    }

    public void setBootloaderVersion(String s)
    {
        try
        {
            put("bootloader_version", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "bootloader_version"
            });
        }
    }

    public void setBrand(String s)
    {
        try
        {
            put("brand", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "brand"
            });
        }
    }

    public void setBuildId(String s)
    {
        try
        {
            put("build_id", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "build_id"
            });
        }
    }

    public void setBuildType(String s)
    {
        try
        {
            put("build_type", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "build_type"
            });
        }
    }

    public void setCarrier(String s)
    {
        try
        {
            put("carrier", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "carrier"
            });
        }
    }

    public void setCpu(String s)
    {
        try
        {
            put("cpu", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "cpu"
            });
        }
    }

    public void setCurrentCarrier(String s)
    {
        try
        {
            put("current_carrier", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "current_carrier"
            });
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

    public void setDevice(String s)
    {
        try
        {
            put("device", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "device"
            });
        }
    }

    public void setIntegrationConfig(CustomData customdata)
    {
        try
        {
            put("integration_config", customdata);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CustomData customdata)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "integration_config"
            });
        }
    }

    public void setLocaleCountryCode(String s)
    {
        try
        {
            put("locale_country_code", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "locale_country_code"
            });
        }
    }

    public void setLocaleLanguageCode(String s)
    {
        try
        {
            put("locale_language_code", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "locale_language_code"
            });
        }
    }

    public void setLocaleRaw(String s)
    {
        try
        {
            put("locale_raw", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "locale_raw"
            });
        }
    }

    public void setManufacturer(String s)
    {
        try
        {
            put("manufacturer", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "manufacturer"
            });
        }
    }

    public void setModel(String s)
    {
        try
        {
            put("model", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "model"
            });
        }
    }

    public void setNetworkType(String s)
    {
        try
        {
            put("network_type", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "network_type"
            });
        }
    }

    public void setOsApiLevel(String s)
    {
        try
        {
            put("os_api_level", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "os_api_level"
            });
        }
    }

    public void setOsBuild(String s)
    {
        try
        {
            put("os_build", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "os_build"
            });
        }
    }

    public void setOsName(String s)
    {
        try
        {
            put("os_name", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "os_name"
            });
        }
    }

    public void setOsVersion(String s)
    {
        try
        {
            put("os_version", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "os_version"
            });
        }
    }

    public void setProduct(String s)
    {
        try
        {
            put("product", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "product"
            });
        }
    }

    public void setRadioVersion(String s)
    {
        try
        {
            put("radio_version", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "radio_version"
            });
        }
    }

    public void setUtcOffset(String s)
    {
        try
        {
            put("utc_offset", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "utc_offset"
            });
        }
    }

    public void setUuid(String s)
    {
        try
        {
            put("uuid", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Device.", new Object[] {
                "uuid"
            });
        }
    }
}
