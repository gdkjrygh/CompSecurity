// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.exceptions.UrlParseException;
import java.util.List;

public class Intents
{

    private Intents()
    {
    }

    public static boolean canHandleApplicationUrl(Context context, String s)
    {
        return canHandleApplicationUrl(context, s, true);
    }

    public static boolean canHandleApplicationUrl(Context context, String s, boolean flag)
    {
        if (!deviceCanHandleIntent(context, new Intent("android.intent.action.VIEW", Uri.parse(s))))
        {
            if (flag)
            {
                MoPubLog.w((new StringBuilder("Could not handle application specific action: ")).append(s).append(". You may be running in the emulator or another device which does not have the required application.").toString());
            }
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean deviceCanHandleIntent(Context context, Intent intent)
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            flag1 = context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (!flag1)
        {
            flag = true;
        }
        return flag;
    }

    public static Intent getStartActivityIntent(Context context, Class class1, Bundle bundle)
    {
        class1 = new Intent(context, class1);
        if (!(context instanceof Activity))
        {
            class1.addFlags(0x10000000);
        }
        if (bundle != null)
        {
            class1.putExtras(bundle);
        }
        return class1;
    }

    public static Intent intentForNativeBrowserScheme(String s)
    {
        Preconditions.checkNotNull(s);
        if (!isNativeBrowserScheme(s))
        {
            throw new UrlParseException("URL does not have mopubnativebrowser:// scheme.");
        }
        Object obj = Uri.parse(s);
        if (!"navigate".equals(((Uri) (obj)).getHost()))
        {
            throw new UrlParseException("URL missing 'navigate' host parameter.");
        }
        try
        {
            obj = ((Uri) (obj)).getQueryParameter("url");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MoPubLog.w((new StringBuilder("Could not handle url: ")).append(s).toString());
            throw new UrlParseException("Passed-in URL did not create a hierarchical URI.");
        }
        if (obj == null)
        {
            throw new UrlParseException("URL missing 'url' query parameter.");
        } else
        {
            return new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        }
    }

    public static boolean isAboutScheme(String s)
    {
        return "about".equals(Uri.parse(s).getScheme());
    }

    public static boolean isDeepLink(String s)
    {
        boolean flag1 = false;
        if (s == null) goto _L2; else goto _L1
_L1:
        String s1;
        Object obj;
        obj = Uri.parse(s);
        s1 = ((Uri) (obj)).getScheme();
        obj = ((Uri) (obj)).getHost();
        if (!"play.google.com".equals(obj) && !"market.android.com".equals(obj)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag || !isHttpUrl(s))
        {
            flag1 = true;
        }
        return flag1;
_L4:
        if ("market".equals(s1))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean isHttpUrl(String s)
    {
        if (s != null)
        {
            if ("http".equals(s = Uri.parse(s).getScheme()) || "https".equals(s))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isNativeBrowserScheme(String s)
    {
        return s.startsWith("mopubnativebrowser://");
    }

    public static void startActivity(Context context, Intent intent)
    {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(intent);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IntentNotResolvableException(context);
        }
    }
}
