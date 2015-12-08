// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.net.Uri;
import android.text.TextUtils;

// Referenced classes of package com.microsoft.advertising.android:
//            ai

public final class ac
{

    public static int a = 0;
    public static int b = 1;
    public static final String c[] = {
        "http", "https", "itms-apps", "market", "bingfoodanddrink", "binghealthnfitness", "bingtravel", "bingweather", "bingfinance", "bingsports", 
        "bingnews", "skype"
    };

    public static boolean a(String s, ai ai1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = Uri.parse(s);
        flag = flag1;
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((Uri) (obj)).getScheme();
        flag = flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L4
_L4:
        int i = 0;
_L9:
        if (i < c.length) goto _L6; else goto _L5
_L5:
        flag = flag1;
_L2:
        if (ai1 != null)
        {
            ai1.c("allowUrl", String.format("url=%s; allow=%s", new Object[] {
                s, Boolean.valueOf(flag)
            }));
        }
        return flag;
_L6:
        if (!((String) (obj)).equalsIgnoreCase(c[i]))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L2; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
