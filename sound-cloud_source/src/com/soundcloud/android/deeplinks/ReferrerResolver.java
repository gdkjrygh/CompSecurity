// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.java.strings.Strings;

class ReferrerResolver
{

    private static final String ANDROID_APP_SCHEME = "android-app";
    private static final String ANDROID_INTENT_EXTRA_REFERRER = "android.intent.extra.REFERRER";
    private static final String ANDROID_INTENT_EXTRA_REFERRER_NAME = "android.intent.extra.REFERRER_NAME";
    private static final String EXTRA_ANDROID_BROWSER_HEADERS = "com.android.browser.headers";
    private static final String EXTRA_BROWSER_APPLICATION_ID = "com.android.browser.application_id";
    private static final String EXTRA_BROWSER_REFERER = "Referer";
    private static final String EXTRA_FACEBOOK_APP_ID = "app_id";
    private static final String EXTRA_INTENT_ANCESTOR = "intent.extra.ANCESTOR";
    private static final String FACEBOOK_PKG_NAME = "com.facebook.application.";
    private static final String GOOGLE_APPCRAWLER_PACKAGE_NAME = "com.google.appcrawler";
    private static final String GOOGLE_PLUS_PKG_NAME = "com.google.android.apps.plus";
    private static final String PARAM_ORIGIN = "origin";
    private static final String TWITTER_PKG_NAME = "com.twitter.android";

    ReferrerResolver()
    {
    }

    private String getActionForSoundCloud(Resources resources)
    {
        return (new StringBuilder("com.facebook.application.")).append(getFacebookAppId(resources)).toString();
    }

    private ComponentName getAncestorComponent(Intent intent)
    {
        if (intent.hasExtra("intent.extra.ANCESTOR"))
        {
            intent = ((Intent) (intent.getExtras().get("intent.extra.ANCESTOR")));
            if (intent instanceof Intent)
            {
                return ((Intent)intent).getComponent();
            }
        }
        return null;
    }

    private Uri getAndroidReferrer(Intent intent)
    {
        if (intent.hasExtra("android.intent.extra.REFERRER"))
        {
            return (Uri)intent.getParcelableExtra("android.intent.extra.REFERRER");
        }
        if (intent.hasExtra("android.intent.extra.REFERRER_NAME"))
        {
            return Uri.parse(intent.getStringExtra("android.intent.extra.REFERRER_NAME"));
        } else
        {
            return Uri.EMPTY;
        }
    }

    private String getBrowserReferrer(Intent intent)
    {
        intent = ((Intent) (intent.getExtras().get("com.android.browser.headers")));
        if (intent instanceof Bundle)
        {
            return ((Bundle)intent).getString("Referer");
        } else
        {
            return null;
        }
    }

    private String getFacebookAppId(Resources resources)
    {
        return resources.getString(0x7f070308);
    }

    private String getOrigin(Intent intent)
    {
        intent = intent.getData();
        if (intent != null && !intent.isOpaque())
        {
            return intent.getQueryParameter("origin");
        } else
        {
            return null;
        }
    }

    private boolean isBrowserIntent(Intent intent)
    {
        return intent.hasExtra("com.android.browser.headers");
    }

    private boolean isFacebookIntent(Intent intent, Resources resources)
    {
        if (!isFacebookAction(intent, resources))
        {
            if (intent.hasExtra("app_id"))
            {
                if (Long.parseLong(getFacebookAppId(resources), 10) != intent.getLongExtra("app_id", -1L))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    private boolean isGoogleCrawlerIntent(Intent intent)
    {
        intent = getAndroidReferrer(intent);
        return "android-app".equals(intent.getScheme()) && "com.google.appcrawler".equals(intent.getHost());
    }

    private boolean isGooglePlusIntent(Intent intent)
    {
        if (intent.hasExtra("com.android.browser.application_id"))
        {
            intent = intent.getStringExtra("com.android.browser.application_id");
            if (intent != null && "com.google.android.apps.plus".equals(intent))
            {
                return true;
            }
        }
        return false;
    }

    private boolean isOriginIntent(Intent intent)
    {
        return Strings.isNotBlank(getOrigin(intent));
    }

    private boolean isTwitterIntent(Intent intent)
    {
        intent = getAncestorComponent(intent);
        return intent != null && "com.twitter.android".equals(intent.getPackageName());
    }

    private Referrer referrerFromBrowser(Intent intent)
    {
        intent = getBrowserReferrer(intent);
        if (intent != null)
        {
            intent = Uri.parse(intent).getHost();
            if (intent != null)
            {
                return Referrer.fromHost(intent);
            }
        }
        return Referrer.OTHER;
    }

    private Referrer referrerFromOrigin(Intent intent)
    {
        intent = getOrigin(intent);
        if (intent != null)
        {
            return Referrer.fromOrigin(intent);
        } else
        {
            return Referrer.OTHER;
        }
    }

    public Referrer getReferrerFromIntent(Intent intent, Resources resources)
    {
        try
        {
            if (isOriginIntent(intent))
            {
                return referrerFromOrigin(intent);
            }
            if (isFacebookIntent(intent, resources))
            {
                return Referrer.FACEBOOK;
            }
            if (isTwitterIntent(intent))
            {
                return Referrer.TWITTER;
            }
            if (isGooglePlusIntent(intent))
            {
                return Referrer.GOOGLE_PLUS;
            }
            if (isGoogleCrawlerIntent(intent))
            {
                return Referrer.GOOGLE_CRAWLER;
            }
            if (isBrowserIntent(intent))
            {
                return referrerFromBrowser(intent);
            }
            intent = Referrer.OTHER;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return Referrer.OTHER;
        }
        return intent;
    }

    public boolean isFacebookAction(Intent intent, Resources resources)
    {
        return getActionForSoundCloud(resources).equals(intent.getAction());
    }
}
