// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.web;

import android.content.Context;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.crash.CrashReporterConfig;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.config.web:
//            ConfigParser

public class CrashReporterConfigParser
    implements ConfigParser
{

    public CrashReporterConfigParser()
    {
    }

    public String getKey()
    {
        return "crash-reporter";
    }

    public boolean isArray()
    {
        return false;
    }

    public void parse(Context context, ApplicationConfig applicationconfig, Object obj)
    {
        context = applicationconfig.getCrashReporterConfig();
        applicationconfig = (JSONObject)obj;
        context.a(applicationconfig.optInt("frequency"));
        if (applicationconfig.has("ask-user"))
        {
            context.a(applicationconfig.optBoolean("ask-user"));
        }
    }
}
