// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            AppRelease

public class AppReleaseFactory
{

    public AppReleaseFactory()
    {
    }

    public static AppRelease fromJson(String s)
    {
        AppRelease apprelease = new AppRelease(s);
        return apprelease;
        JSONException jsonexception;
        jsonexception;
        Log.v("Error parsing json as AppRelease: %s", jsonexception, new Object[] {
            s
        });
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
