// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Sdk

public class SdkFactory
{

    public SdkFactory()
    {
    }

    public static Sdk fromJson(String s)
    {
        Sdk sdk = new Sdk(s);
        return sdk;
        JSONException jsonexception;
        jsonexception;
        Log.v("Error parsing json as Sdk: %s", jsonexception, new Object[] {
            s
        });
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
