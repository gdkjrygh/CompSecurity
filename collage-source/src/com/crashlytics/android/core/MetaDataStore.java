// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
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

    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_EMAIL = "userEmail";
    private static final String KEY_USER_ID = "userId";
    private static final String KEY_USER_NAME = "userName";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file)
    {
        filesDir = file;
    }

    private File getKeysFileForSession(String s)
    {
        return new File(filesDir, (new StringBuilder()).append(s).append("keys").append(".meta").toString());
    }

    private File getUserDataFileForSession(String s)
    {
        return new File(filesDir, (new StringBuilder()).append(s).append("user").append(".meta").toString());
    }

    private static Map jsonToKeysData(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        HashMap hashmap = new HashMap();
        String s1;
        for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, valueOrNull(s, s1)))
        {
            s1 = (String)iterator.next();
        }

        return hashmap;
    }

    private static UserMetaData jsonToUserData(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        return new UserMetaData(valueOrNull(s, "userId"), valueOrNull(s, "userName"), valueOrNull(s, "userEmail"));
    }

    private static String keysDataToJson(Map map)
        throws JSONException
    {
        return (new JSONObject(map)).toString();
    }

    private static String userDataToJson(UserMetaData usermetadata)
        throws JSONException
    {
        return (new JSONObject(usermetadata) {

            final UserMetaData val$userData;

            
                throws JSONException
            {
                userData = usermetadata;
                super();
                put("userId", userData.id);
                put("userName", userData.name);
                put("userEmail", userData.email);
            }
        }).toString();
    }

    private static String valueOrNull(JSONObject jsonobject, String s)
    {
        String s1 = null;
        if (!jsonobject.isNull(s))
        {
            s1 = jsonobject.optString(s, null);
        }
        return s1;
    }

    public Map readKeyData(String s)
    {
        s = getKeysFileForSession(s);
        if (!s.exists())
        {
            return Collections.emptyMap();
        }
        FileInputStream fileinputstream = new FileInputStream(s);
        s = fileinputstream;
        Map map = jsonToKeysData(h.a(fileinputstream));
        h.a(fileinputstream, "Failed to close user metadata file.");
        return map;
        Exception exception1;
        exception1;
        fileinputstream = null;
_L4:
        s = fileinputstream;
        c.h().e("Fabric", "Error deserializing user metadata.", exception1);
        h.a(fileinputstream, "Failed to close user metadata file.");
        return Collections.emptyMap();
        Exception exception;
        exception;
        s = null;
_L2:
        h.a(s, "Failed to close user metadata file.");
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public UserMetaData readUserData(String s)
    {
        s = getUserDataFileForSession(s);
        if (!s.exists())
        {
            return UserMetaData.EMPTY;
        }
        FileInputStream fileinputstream = new FileInputStream(s);
        s = fileinputstream;
        UserMetaData usermetadata = jsonToUserData(h.a(fileinputstream));
        h.a(fileinputstream, "Failed to close user metadata file.");
        return usermetadata;
        Exception exception1;
        exception1;
        fileinputstream = null;
_L4:
        s = fileinputstream;
        c.h().e("Fabric", "Error deserializing user metadata.", exception1);
        h.a(fileinputstream, "Failed to close user metadata file.");
        return UserMetaData.EMPTY;
        Exception exception;
        exception;
        s = null;
_L2:
        h.a(s, "Failed to close user metadata file.");
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeKeyData(String s, Map map)
    {
        File file;
        file = getKeysFileForSession(s);
        s = null;
        String s1;
        s1 = keysDataToJson(map);
        map = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
        s = map;
        map.write(s1);
        s = map;
        map.flush();
        h.a(map, "Failed to close key/value metadata file.");
        return;
        Object obj;
        obj;
        map = null;
_L4:
        s = map;
        c.h().e("Fabric", "Error serializing key/value metadata.", ((Throwable) (obj)));
        h.a(map, "Failed to close key/value metadata file.");
        return;
        obj;
        map = s;
        s = ((String) (obj));
_L2:
        h.a(map, "Failed to close key/value metadata file.");
        throw s;
        obj;
        map = s;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeUserData(String s, UserMetaData usermetadata)
    {
        File file;
        file = getUserDataFileForSession(s);
        s = null;
        String s1;
        s1 = userDataToJson(usermetadata);
        usermetadata = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
        s = usermetadata;
        usermetadata.write(s1);
        s = usermetadata;
        usermetadata.flush();
        h.a(usermetadata, "Failed to close user metadata file.");
        return;
        Object obj;
        obj;
        usermetadata = null;
_L4:
        s = usermetadata;
        c.h().e("Fabric", "Error serializing user metadata.", ((Throwable) (obj)));
        h.a(usermetadata, "Failed to close user metadata file.");
        return;
        obj;
        usermetadata = s;
        s = ((String) (obj));
_L2:
        h.a(usermetadata, "Failed to close user metadata file.");
        throw s;
        obj;
        usermetadata = s;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
