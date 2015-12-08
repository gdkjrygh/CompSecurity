// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import org.chromium.components.navigation_interception.NavigationParams;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkNavigationHandler

public class XWalkNavigationHandlerImpl
    implements XWalkNavigationHandler
{

    private static final String ACTION_GEO_PREFIX = "geo:";
    private static final String ACTION_MAIL_PREFIX = "mailto:";
    private static final String ACTION_MARKET_PREFIX = "market:";
    private static final String ACTION_SMS_PREFIX = "sms:";
    private static final String ACTION_TEL_PREFIX = "tel:";
    private static final String PROTOCOL_WTAI_MC_PREFIX = "wtai://wp/mc;";
    private static final String PROTOCOL_WTAI_PREFIX = "wtai://";
    private static final String TAG = "XWalkNavigationHandlerImpl";
    private Context mContext;

    public XWalkNavigationHandlerImpl(Context context)
    {
        mContext = context;
    }

    private Intent createIntentForActionUri(String s)
    {
        Intent intent = null;
        if (!s.startsWith("tel:")) goto _L2; else goto _L1
_L1:
        intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(s));
_L8:
        return intent;
_L2:
        Intent intent4;
        int i;
        if (s.startsWith("geo:"))
        {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setData(Uri.parse(s));
            return intent1;
        }
        if (s.startsWith("mailto:"))
        {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(s));
            return intent2;
        }
        if (!s.startsWith("sms:"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent4 = new Intent("android.intent.action.VIEW");
        i = s.indexOf('?');
        if (i != -1) goto _L4; else goto _L3
_L3:
        s = s.substring(4);
_L6:
        intent4.setData(Uri.parse((new StringBuilder()).append("sms:").append(s).toString()));
        intent4.putExtra("address", s);
        intent4.setType("vnd.android-dir/mms-sms");
        return intent4;
_L4:
        String s1 = s.substring(4, i);
        String s2 = Uri.parse(s).getQuery();
        s = s1;
        if (s2 != null)
        {
            s = s1;
            if (s2.startsWith("body="))
            {
                intent4.putExtra("sms_body", s2.substring(5));
                s = s1;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!s.startsWith("market:")) goto _L8; else goto _L7
_L7:
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(Uri.parse(s));
        return intent3;
    }

    private Intent createIntentForWTAI(String s)
    {
        Intent intent = null;
        if (s.startsWith("wtai://wp/mc;"))
        {
            s = s.substring("wtai://wp/mc;".length());
            s = (new StringBuilder()).append("tel:").append(s).toString();
            intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse(s));
        }
        return intent;
    }

    private boolean handleUrlByMimeType(String s)
    {
        String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(s));
        if (shouldHandleMimeType(s1))
        {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(s), s1);
            if (intent.resolveActivity(mContext.getPackageManager()) != null)
            {
                startActivity(intent);
                return true;
            }
        }
        return false;
    }

    private boolean shouldHandleMimeType(String s)
    {
        return s != null && s.startsWith("application/");
    }

    public boolean handleNavigation(NavigationParams navigationparams)
    {
        String s = navigationparams.url;
        if (s.startsWith("wtai://"))
        {
            navigationparams = createIntentForWTAI(s);
        } else
        {
            navigationparams = createIntentForActionUri(s);
        }
        if (navigationparams != null && startActivity(navigationparams))
        {
            return true;
        } else
        {
            return handleUrlByMimeType(s);
        }
    }

    protected boolean startActivity(Intent intent)
    {
        try
        {
            if (!(mContext instanceof Activity))
            {
                intent.addFlags(0x10000000);
            }
            mContext.startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Log.w("XWalkNavigationHandlerImpl", "Activity not found for Intent:");
            Log.w("XWalkNavigationHandlerImpl", intent.toUri(0));
            return false;
        }
        return true;
    }
}
