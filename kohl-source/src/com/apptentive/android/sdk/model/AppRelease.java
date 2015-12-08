// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload

public class AppRelease extends Payload
{

    private static final String KEY_APP_STORE = "app_store";
    private static final String KEY_BUILD_NUMBER = "build_number";
    private static final String KEY_IDENTIFIER = "identifier";
    private static final String KEY_TARGET_SDK_VERSION = "target_sdk_version";
    private static final String KEY_VERSION = "version";

    public AppRelease()
    {
    }

    public AppRelease(String s)
        throws JSONException
    {
        super(s);
    }

    public String getAppStore()
    {
        String s;
        if (isNull("app_store"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("app_store");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getBuildNumber()
    {
        String s;
        if (isNull("build_number"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("build_number");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getIdentifier()
    {
        String s;
        if (isNull("identifier"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("identifier");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getTargetSdkVersion()
    {
        String s;
        if (isNull("target_sdk_version"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("target_sdk_version");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getVersion()
    {
        String s;
        if (isNull("version"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("version");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public void initBaseType()
    {
        setBaseType(Payload.BaseType.app_release);
    }

    public void setAppStore(String s)
    {
        try
        {
            put("app_store", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to AppRelease.", new Object[] {
                "app_store"
            });
        }
    }

    public void setBuildNumber(String s)
    {
        try
        {
            put("build_number", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to AppRelease.", new Object[] {
                "build_number"
            });
        }
    }

    public void setIdentifier(String s)
    {
        try
        {
            put("identifier", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to AppRelease.", new Object[] {
                "identifier"
            });
        }
    }

    public void setTargetSdkVersion(String s)
    {
        try
        {
            put("target_sdk_version", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to AppRelease.", new Object[] {
                "target_sdk_version"
            });
        }
    }

    public void setVersion(String s)
    {
        try
        {
            put("version", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to AppRelease.", new Object[] {
                "version"
            });
        }
    }
}
