// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.Setup;
import com.skype.android.config.FileUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaDocumentSetup
{

    private static final String AL_DISTRIB_AUTH_DOMAINS = "*Lib/MediaMessaging/DistributionAuthDomains";
    private static final String AL_DISTRIB_URL = "*Lib/MediaMessaging/DistributionUrl";
    private static final String AL_STORAGE_AUTH_DOMAINS = "*Lib/MediaMessaging/StorageAuthDomains";
    private static final String AL_STORAGE_URL = "*Lib/MediaMessaging/StorageUrl";

    public MediaDocumentSetup()
    {
    }

    public void setupProxy(Setup setup, String s)
    {
        s = new File(s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj3 = null;
        obj1 = null;
        obj4 = null;
        obj2 = null;
        obj5 = null;
        obj = null;
        obj6 = null;
        s = new FileInputStream(s);
        obj = new BufferedReader(new InputStreamReader(s, "UTF-8"));
        obj1 = new StringBuilder();
_L5:
        obj2 = ((BufferedReader) (obj)).readLine();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(((String) (obj2)));
          goto _L5
        obj2;
        setup = s;
        s = ((String) (obj));
_L11:
        obj = setup;
        obj1 = s;
        ((JSONException) (obj2)).printStackTrace();
        FileUtil.closeStream(setup);
        FileUtil.closeStream(s);
_L2:
        return;
_L4:
        obj1 = new JSONObject(((StringBuilder) (obj1)).toString());
        setup.setStr("*Lib/MediaMessaging/StorageUrl", ((JSONObject) (obj1)).getString("*Lib/MediaMessaging/StorageUrl"));
        setup.setStr("*Lib/MediaMessaging/DistributionUrl", ((JSONObject) (obj1)).getString("*Lib/MediaMessaging/DistributionUrl"));
        setup.setStr("*Lib/MediaMessaging/StorageAuthDomains", ((JSONObject) (obj1)).getString("*Lib/MediaMessaging/StorageAuthDomains"));
        setup.setStr("*Lib/MediaMessaging/DistributionAuthDomains", ((JSONObject) (obj1)).getString("*Lib/MediaMessaging/DistributionAuthDomains"));
        FileUtil.closeStream(s);
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return;
        obj2;
        s = obj3;
        setup = obj5;
_L9:
        obj = setup;
        obj1 = s;
        ((IOException) (obj2)).printStackTrace();
        FileUtil.closeStream(setup);
        FileUtil.closeStream(s);
        return;
        setup;
_L7:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        FileUtil.closeStream(((java.io.Closeable) (obj1)));
        throw setup;
        setup;
        obj = s;
        obj1 = obj4;
        continue; /* Loop/switch isn't completed */
        setup;
        obj1 = obj;
        obj = s;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        setup = s;
        s = obj3;
        continue; /* Loop/switch isn't completed */
        obj2;
        setup = s;
        s = ((String) (obj));
        if (true) goto _L9; else goto _L8
_L8:
        JSONException jsonexception;
        jsonexception;
        setup = obj6;
        s = ((String) (obj2));
        obj2 = jsonexception;
        continue; /* Loop/switch isn't completed */
        jsonexception;
        setup = s;
        s = ((String) (obj2));
        obj2 = jsonexception;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
