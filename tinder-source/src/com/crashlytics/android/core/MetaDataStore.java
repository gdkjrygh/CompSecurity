// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//            UserMetaData

class MetaDataStore
{

    static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public MetaDataStore(File file)
    {
        b = file;
    }

    static String a(UserMetaData usermetadata)
        throws JSONException
    {
        return (new JSONObject(usermetadata) {

            final UserMetaData a;

            
                throws JSONException
            {
                a = usermetadata;
                super();
                put("userId", a.b);
                put("userName", a.c);
                put("userEmail", a.d);
            }
        }).toString();
    }

    static String a(Map map)
        throws JSONException
    {
        return (new JSONObject(map)).toString();
    }

    private static String a(JSONObject jsonobject, String s)
    {
        String s1 = null;
        if (!jsonobject.isNull(s))
        {
            s1 = jsonobject.optString(s, null);
        }
        return s1;
    }

    private static Map e(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        HashMap hashmap = new HashMap();
        String s1;
        for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, a(s, s1)))
        {
            s1 = (String)iterator.next();
        }

        return hashmap;
    }

    public final UserMetaData a(String s)
    {
        s = c(s);
        if (!s.exists())
        {
            return UserMetaData.a;
        }
        FileInputStream fileinputstream = new FileInputStream(s);
        s = fileinputstream;
        Object obj = new JSONObject(CommonUtils.a(fileinputstream));
        s = fileinputstream;
        obj = new UserMetaData(a(((JSONObject) (obj)), "userId"), a(((JSONObject) (obj)), "userName"), a(((JSONObject) (obj)), "userEmail"));
        CommonUtils.a(fileinputstream, "Failed to close user metadata file.");
        return ((UserMetaData) (obj));
        Exception exception1;
        exception1;
        fileinputstream = null;
_L4:
        s = fileinputstream;
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Error deserializing user metadata.", exception1);
        CommonUtils.a(fileinputstream, "Failed to close user metadata file.");
        return UserMetaData.a;
        Exception exception;
        exception;
        s = null;
_L2:
        CommonUtils.a(s, "Failed to close user metadata file.");
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Map b(String s)
    {
        s = d(s);
        if (!s.exists())
        {
            return Collections.emptyMap();
        }
        FileInputStream fileinputstream = new FileInputStream(s);
        s = fileinputstream;
        Map map = e(CommonUtils.a(fileinputstream));
        CommonUtils.a(fileinputstream, "Failed to close user metadata file.");
        return map;
        Exception exception1;
        exception1;
        fileinputstream = null;
_L4:
        s = fileinputstream;
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Error deserializing user metadata.", exception1);
        CommonUtils.a(fileinputstream, "Failed to close user metadata file.");
        return Collections.emptyMap();
        Exception exception;
        exception;
        s = null;
_L2:
        CommonUtils.a(s, "Failed to close user metadata file.");
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    final File c(String s)
    {
        return new File(b, (new StringBuilder()).append(s).append("user.meta").toString());
    }

    final File d(String s)
    {
        return new File(b, (new StringBuilder()).append(s).append("keys.meta").toString());
    }

}
