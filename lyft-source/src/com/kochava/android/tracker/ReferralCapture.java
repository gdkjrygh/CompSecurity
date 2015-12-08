// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.kochava.android.tracker:
//            Global

public class ReferralCapture extends BroadcastReceiver
{

    public static String a = "";

    public ReferralCapture()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (Global.a)
        {
            Log.e("KochavaReferralCapture", "Referral Capture received an intent:");
        }
        if (Global.a)
        {
            Log.e("KochavaReferralCapture", (new StringBuilder("package:")).append(intent.getPackage()).append(", action:").append(intent.getAction()).toString());
        }
        Object obj;
        String as[];
        int j;
        try
        {
            obj = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        ((Bundle) (obj)).containsKey(null);
        obj = new HashMap();
        if (intent.getAction().equals("com.android.vending.INSTALL_REFERRER")) goto _L2; else goto _L1
_L1:
        if (Global.a)
        {
            Log.e("KochavaReferralCapture", "intent not a referral");
        }
_L4:
        return;
_L2:
        intent = intent.getStringExtra("referrer");
        if (intent == null || intent.length() == 0)
        {
            if (Global.a)
            {
                Log.e("KochavaReferralCapture", "referral intent empty");
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        intent = URLDecoder.decode(intent, "UTF-8");
        if (Global.a)
        {
            Log.e("KochavaReferralCapture", (new StringBuilder("referral string: ")).append(intent).toString());
        }
        intent = intent.split("&");
        j = intent.length;
        for (int i = 0; i < j; i++)
        {
            break MISSING_BLOCK_LABEL_315;
        }

        intent = obj.toString();
        intent = intent.substring(1, intent.length() - 1).replace(", ", "&").replace("=", ":");
        context.getSharedPreferences("initPrefs", 0).edit().putString("initData", intent).commit();
        if (Global.a)
        {
            Log.e("KochavaReferralCapture", (new StringBuilder("Setting referral global string: ")).append(intent).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
        if (!Global.b) goto _L4; else goto _L5
_L5:
        Log.e("KochavaReferralCapture", (new StringBuilder("Error within ReferralCapture: ")).append(context.getMessage()).toString());
        return;
label0:
        {
            as = intent[i].split("=");
            if (as.length == 1)
            {
                ((Map) (obj)).put(as[0], "");
                break label0;
            }
            try
            {
                ((Map) (obj)).put(as[0], as[1]);
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                if (Global.a)
                {
                    Log.e("KochavaReferralCapture", (new StringBuilder("Error within ReferralCapture: ")).append(intent.getMessage()).toString());
                }
            }
        }
        break MISSING_BLOCK_LABEL_196;
    }

}
