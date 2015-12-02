// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.qihoo360.common.utils:
//            IniProperties

public class FeatureConfigUtils
{

    public static final String GOOGLE_PLAY_MARKET_LINK = "market://details?id=%s";
    public static final String GOOGLE_PLAY_WEB_LINK = "https://play.google.com/store/apps/details?id=%s";
    private static final String a = "fcu";
    private Context b;
    private final IniProperties c;

    public FeatureConfigUtils(Context context)
    {
        Exception exception;
        b = context;
        c = new IniProperties();
        try
        {
            context = b.getAssets().open("f_l_c.ini");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        try
        {
            c.load(context);
        }
        catch (IOException ioexception)
        {
            try
            {
                context.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        finally { }
        context.close();
        return;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw exception;
        context;
    }

    public String getMarketLink(int i, boolean flag)
    {
        String s = c.getProperty(String.valueOf(i), "AsLink");
        if (!TextUtils.isEmpty(s))
        {
            return s;
        }
        if (flag)
        {
            return "https://play.google.com/store/apps/details?id=%s";
        } else
        {
            return "market://details?id=%s";
        }
    }

    public boolean isUsingGooglePlay(int i)
    {
        return TextUtils.isEmpty(c.getProperty(String.valueOf(i), "AsLink"));
    }

    public boolean shouldAppBoxBeEnabled(int i)
    {
        String s = c.getProperty(String.valueOf(i), "AbEnabled");
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        catch (Exception exception)
        {
            return true;
        }
        return i > 0;
    }

}
