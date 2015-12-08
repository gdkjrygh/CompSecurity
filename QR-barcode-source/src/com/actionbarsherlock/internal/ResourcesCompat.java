// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.DisplayMetrics;

// Referenced classes of package com.actionbarsherlock.internal:
//            ActionBarSherlockCompat

public final class ResourcesCompat
{

    private static final String TAG = "ResourcesCompat";

    private ResourcesCompat()
    {
    }

    public static boolean getResources_getBoolean(Context context, int i)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        flag = context.getResources().getBoolean(i);
_L4:
        return flag;
_L2:
        float f;
        float f1;
        context = context.getResources().getDisplayMetrics();
        f1 = (float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density;
        f = (float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density;
        if (f1 < f)
        {
            f = f1;
        }
        if (i != com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 < 480F)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i != com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 >= 480F)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i != com.actionbarsherlock.R.bool.abs__action_bar_expanded_action_views_exclusive)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f >= 600F)
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (i == com.actionbarsherlock.R.bool.abs__config_allowActionMenuItemTextWithIcon)
        {
            if (f1 < 480F)
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown boolean resource ID ")).append(i).toString());
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static int getResources_getInteger(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return context.getResources().getInteger(i);
        }
        context = context.getResources().getDisplayMetrics();
        float f = (float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density;
        if (i == com.actionbarsherlock.R.integer.abs__max_action_buttons)
        {
            if (f >= 600F)
            {
                return 5;
            }
            if (f >= 500F)
            {
                return 4;
            }
            return f < 360F ? 2 : 3;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown integer resource ID ")).append(i).toString());
        }
    }

    public static int loadLogoFromManifest(Activity activity)
    {
        Object obj;
        int i;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        j = 0;
        k = 0;
        i = k;
        String s;
        String s1;
        String s2;
        XmlResourceParser xmlresourceparser;
        String s3;
        boolean flag2;
        try
        {
            s1 = activity.getClass().getName();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
            return i;
        }
        i = k;
        s2 = activity.getApplicationInfo().packageName;
        i = k;
        xmlresourceparser = activity.createPackageContext(s2, 0).getAssets().openXmlResourceParser("AndroidManifest.xml");
        i = k;
        k = xmlresourceparser.getEventType();
        i = k;
          goto _L1
_L15:
        k = j;
        if (i != 2) goto _L3; else goto _L2
_L2:
        i = j;
        activity = xmlresourceparser.getName();
        i = j;
        if (!"application".equals(activity)) goto _L5; else goto _L4
_L4:
        i = j;
        k = xmlresourceparser.getAttributeCount() - 1;
          goto _L6
_L3:
        i = k;
        j = xmlresourceparser.nextToken();
        i = j;
        j = k;
        continue; /* Loop/switch isn't completed */
_L17:
        i = j;
        if (!"logo".equals(xmlresourceparser.getAttributeName(k))) goto _L8; else goto _L7
_L7:
        i = j;
        k = xmlresourceparser.getAttributeResourceValue(k, 0);
          goto _L3
_L5:
        k = j;
        i = j;
        if (!"activity".equals(activity)) goto _L3; else goto _L9
_L9:
        activity = null;
        s = null;
        flag1 = false;
        i = j;
        k = xmlresourceparser.getAttributeCount() - 1;
          goto _L10
_L19:
        i = j;
        s3 = xmlresourceparser.getAttributeName(k);
        i = j;
        if (!"logo".equals(s3)) goto _L12; else goto _L11
_L11:
        i = j;
        obj = Integer.valueOf(xmlresourceparser.getAttributeResourceValue(k, 0));
        flag = flag1;
_L13:
        i = j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        i = j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        i = j;
        j = ((Integer) (obj)).intValue();
        i = j;
        break MISSING_BLOCK_LABEL_433;
_L12:
        obj = activity;
        flag = flag1;
        i = j;
        if (!"name".equals(s3))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        s = ActionBarSherlockCompat.cleanActivityName(s2, xmlresourceparser.getAttributeValue(k));
        i = j;
        flag2 = s1.equals(s);
        if (!flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        obj = activity;
        if (true) goto _L13; else goto _L1
_L1:
        if (i != 1) goto _L15; else goto _L14
_L14:
        return j;
_L6:
        if (k >= 0) goto _L17; else goto _L16
_L16:
        k = j;
          goto _L3
_L8:
        k--;
          goto _L6
_L10:
        if (k >= 0) goto _L19; else goto _L18
_L18:
        k = j;
        if (flag1)
        {
            return j;
        }
          goto _L3
        k--;
        activity = ((Activity) (obj));
        flag1 = flag;
        j = i;
          goto _L10
    }
}
