// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.provider;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.htc.blinkfeed.provider:
//            IdentityProvider

public class DummyIdentityProvider
    implements IdentityProvider
{

    private static String LOG_TAG = "BlinkFeedAPIInternal.DummyIdentityProvider";
    private static final String TAG_META_DATA = "plugin_meta";
    String mAccountName;
    String mAccountType;
    public Context mContext;
    public String mPluginName;

    public DummyIdentityProvider()
    {
        mAccountName = null;
        mAccountType = null;
    }

    public Account getAccount()
    {
        Object obj;
        obj = mContext.getPackageName();
        int i;
        if (mAccountName == null)
        {
            if (mPluginName != null)
            {
                mAccountName = mPluginName;
            } else
            {
                mAccountName = mContext.getPackageName();
            }
        }
        if (mAccountType != null) goto _L2; else goto _L1
_L1:
        obj = mContext.getPackageManager().getPackageInfo(((String) (obj)), 128).applicationInfo.metaData;
        obj = mContext.getResources().getXml(((Bundle) (obj)).getInt("opensense"));
_L4:
        i = ((XmlResourceParser) (obj)).getEventType();
        if (i != 1) goto _L3; else goto _L2
_L2:
        if (mAccountType == null)
        {
            obj = mAccountName;
        } else
        {
            obj = mAccountType;
        }
        return new Account(" ", ((String) (obj)));
_L3:
        if (((XmlResourceParser) (obj)).getEventType() != 2 || !"plugin_meta".equals(((XmlResourceParser) (obj)).getName()))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        mAccountType = ((XmlResourceParser) (obj)).nextText();
        com.htc.blinkfeed.Util.DebugLoger.d(LOG_TAG, (new StringBuilder("parsed ")).append(mAccountType).toString());
          goto _L2
        obj;
        try
        {
            Log.e(LOG_TAG, "Parse error", ((Throwable) (obj)));
            ((XmlPullParserException) (obj)).printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(LOG_TAG, "error to get meta", ((Throwable) (obj)));
            ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
        }
          goto _L2
        ((XmlResourceParser) (obj)).next();
          goto _L4
        obj;
        Log.e(LOG_TAG, "Parse error", ((Throwable) (obj)));
        ((IOException) (obj)).printStackTrace();
          goto _L2
    }

    public String getAuthenticationIntentURI()
    {
        return null;
    }

}
