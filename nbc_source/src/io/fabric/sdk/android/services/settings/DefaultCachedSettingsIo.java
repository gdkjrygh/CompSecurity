// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            CachedSettingsIo

class DefaultCachedSettingsIo
    implements CachedSettingsIo
{

    private final Kit kit;

    public DefaultCachedSettingsIo(Kit kit1)
    {
        kit = kit1;
    }

    public JSONObject readCachedSettings()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Fabric.getLogger().d("Fabric", "Reading cached settings...");
        obj2 = null;
        obj4 = null;
        obj1 = null;
        obj3 = null;
        obj = obj4;
        File file = new File((new FileStoreImpl(kit)).getFilesDir(), "com.crashlytics.settings.json");
        obj = obj4;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj1 = new FileInputStream(file);
        obj = new JSONObject(CommonUtils.streamToString(((java.io.InputStream) (obj1))));
_L4:
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        return ((JSONObject) (obj));
_L2:
        obj = obj4;
        Fabric.getLogger().d("Fabric", "No cached settings found.");
        obj = obj3;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj1 = obj2;
        obj2 = obj;
_L8:
        obj = obj1;
        Fabric.getLogger().e("Fabric", "Failed to fetch cached settings", ((Throwable) (obj2)));
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Error while closing settings cache file.");
        return null;
        obj1;
_L6:
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Error while closing settings cache file.");
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void writeCachedSettings(long l, JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Fabric.getLogger().d("Fabric", "Writing settings to cache file...");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj1 = null;
        obj2 = null;
        obj = obj1;
        jsonobject.put("expires_at", l);
        obj = obj1;
        obj1 = new FileWriter(new File((new FileStoreImpl(kit)).getFilesDir(), "com.crashlytics.settings.json"));
        ((FileWriter) (obj1)).write(jsonobject.toString());
        ((FileWriter) (obj1)).flush();
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close settings writer.");
        return;
        obj1;
        jsonobject = obj2;
_L4:
        obj = jsonobject;
        Fabric.getLogger().e("Fabric", "Failed to cache settings", ((Throwable) (obj1)));
        CommonUtils.closeOrLog(jsonobject, "Failed to close settings writer.");
        return;
        jsonobject;
_L2:
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close settings writer.");
        throw jsonobject;
        jsonobject;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        jsonobject = ((JSONObject) (obj1));
        obj1 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
