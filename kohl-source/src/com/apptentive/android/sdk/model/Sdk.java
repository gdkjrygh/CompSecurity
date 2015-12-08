// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload

public class Sdk extends Payload
{

    public static final String KEY = "sdk";
    private static final String KEY_AUTHOR_EMAIL = "author_email";
    private static final String KEY_AUTHOR_NAME = "author_name";
    private static final String KEY_DISTRIBUTION = "distribution";
    private static final String KEY_DISTRIBUTION_VERSION = "distribution_version";
    private static final String KEY_PLATFORM = "platform";
    private static final String KEY_PROGRAMMING_LANGUAGE = "programming_language";
    private static final String KEY_VERSION = "version";

    public Sdk()
    {
    }

    public Sdk(String s)
        throws JSONException
    {
        super(s);
    }

    public String getAuthorEmail()
    {
        String s;
        if (isNull("author_email"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("author_email");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getAuthorName()
    {
        String s;
        if (isNull("author_name"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("author_name");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getDistribution()
    {
        String s;
        if (isNull("distribution"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("distribution");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getDistributionVersion()
    {
        String s;
        if (isNull("distribution_version"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("distribution_version");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getPlatform()
    {
        String s;
        if (isNull("platform"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("platform");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getProgrammingLanguage()
    {
        String s;
        if (isNull("programming_language"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("programming_language");
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
        setBaseType(Payload.BaseType.sdk);
    }

    public void setAuthorEmail(String s)
    {
        try
        {
            put("author_email", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Sdk.", new Object[] {
                "author_email"
            });
        }
    }

    public void setAuthorName(String s)
    {
        try
        {
            put("author_name", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Sdk.", new Object[] {
                "author_name"
            });
        }
    }

    public void setDistribution(String s)
    {
        try
        {
            put("distribution", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Sdk.", new Object[] {
                "distribution"
            });
        }
    }

    public void setDistributionVersion(String s)
    {
        try
        {
            put("distribution_version", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Sdk.", new Object[] {
                "distribution_version"
            });
        }
    }

    public void setPlatform(String s)
    {
        try
        {
            put("platform", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Sdk.", new Object[] {
                "platform"
            });
        }
    }

    public void setProgrammingLanguage(String s)
    {
        try
        {
            put("programming_language", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Error adding %s to Sdk.", new Object[] {
                "programming_language"
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
            Log.w("Error adding %s to Sdk.", new Object[] {
                "version"
            });
        }
    }
}
