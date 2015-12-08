// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gr

public final class ei
{

    public static String D(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new JSONObject(s)).getString("developerPayload");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.W("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public static String E(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (new JSONObject(s)).getString("purchaseToken");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.W("Fail to parse purchase data");
            return null;
        }
        return s;
    }

    public static int b(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            gr.W("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (bundle instanceof Integer)
        {
            return ((Integer)bundle).intValue();
        }
        if (bundle instanceof Long)
        {
            return (int)((Long)bundle).longValue();
        } else
        {
            gr.W((new StringBuilder()).append("Unexpected type for intent response code. ").append(bundle.getClass().getName()).toString());
            return 5;
        }
    }

    public static int d(Intent intent)
    {
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if (intent == null)
        {
            gr.W("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (intent instanceof Integer)
        {
            return ((Integer)intent).intValue();
        }
        if (intent instanceof Long)
        {
            return (int)((Long)intent).longValue();
        } else
        {
            gr.W((new StringBuilder()).append("Unexpected type for intent response code. ").append(intent.getClass().getName()).toString());
            return 5;
        }
    }

    public static String e(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("INAPP_PURCHASE_DATA");
        }
    }

    public static String f(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("INAPP_DATA_SIGNATURE");
        }
    }
}
