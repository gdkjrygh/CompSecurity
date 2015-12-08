// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.content.Context;
import android.os.Bundle;
import com.appboy.AppboyImageUtils;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;

public class AppboyWearableNotificationUtils
{

    private static final String TAG;

    public AppboyWearableNotificationUtils()
    {
    }

    private static boolean isWearExtraPagePresentInBundle(Bundle bundle, int i)
    {
        String s = (new StringBuilder("ab_we_t")).append(i).toString();
        String s1 = (new StringBuilder("ab_we_c")).append(i).toString();
        return bundle.containsKey(s) && bundle.containsKey(s1);
    }

    public static void setWearableNotificationFeaturesIfPresentAndSupported(Context context, android.support.v4.app.aa.d d, Bundle bundle)
    {
        if (bundle == null) goto _L2; else goto _L1
_L1:
        android.support.v4.app.aa.r r;
        Object obj;
        String s;
        int i;
        r = new android.support.v4.app.aa.r();
        if (bundle.containsKey("ab_wi"))
        {
            if (Boolean.valueOf(Boolean.parseBoolean(bundle.getString("ab_wi"))).booleanValue())
            {
                r.a = r.a | 2;
            } else
            {
                r.a = r.a & -3;
            }
        }
        if (bundle.containsKey("ab_wb"))
        {
            android.graphics.Bitmap bitmap = AppboyImageUtils.downloadImageBitmap(bundle.getString("ab_wb"));
            if (bitmap != null)
            {
                r.c = bitmap;
            }
        }
        i = 0;
_L8:
        if (!isWearExtraPagePresentInBundle(bundle, i)) goto _L4; else goto _L3
_L3:
        obj = bundle.getString((new StringBuilder("ab_we_t")).append(i).toString());
        s = bundle.getString((new StringBuilder("ab_we_c")).append(i).toString());
        if (s != null && obj != null) goto _L6; else goto _L5
_L5:
        AppboyLogger.d(TAG, String.format("The title or content of extra page %s was null. Adding no further extra pages.", new Object[] {
            Integer.valueOf(i)
        }));
_L4:
        d.extend(r);
_L2:
        return;
_L6:
        android.support.v4.app.aa.c c = new android.support.v4.app.aa.c();
        c.c(s);
        obj = (new android.support.v4.app.aa.d(context)).setContentTitle(((CharSequence) (obj))).setStyle(c).build();
        r.b.add(obj);
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/push/AppboyWearableNotificationUtils.getName()
        });
    }
}
