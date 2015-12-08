// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            Utils, Properties, EnumActionType, ExtraData

abstract class BaseDTO
{

    protected String apiKey;
    protected String appVersionCode;
    protected String appVersionName;
    protected String carrier;
    protected String connection;
    protected String device;
    protected ExtraData extraData;
    protected String locale;
    protected String osVersion;
    protected String packageName;
    protected String platform;
    protected String remoteIP;
    protected Boolean rooted;
    protected String sdkVersion;
    protected String state;
    protected String timestamp;
    protected Long timestampMilis;
    protected EnumActionType type;
    protected String userIdentifier;
    protected String uuid;

    public BaseDTO(EnumActionType enumactiontype)
    {
        timestamp = Utils.getTime();
        timestampMilis = Long.valueOf(System.currentTimeMillis());
        sdkVersion = "4.0";
        platform = "Android";
        type = enumactiontype;
        apiKey = Properties.API_KEY;
        StringBuilder stringbuilder = new StringBuilder();
        if (Properties.PHONE_BRAND != null)
        {
            enumactiontype = (new StringBuilder()).append(Properties.PHONE_BRAND).append(" ").toString();
        } else
        {
            enumactiontype = "";
        }
        device = stringbuilder.append(enumactiontype).append(Properties.PHONE_MODEL).toString();
        osVersion = Properties.OS_VERSION;
        appVersionCode = Properties.APP_VERSIONCODE;
        appVersionName = Properties.APP_VERSIONNAME;
        packageName = Properties.APP_PACKAGE;
        locale = Properties.LOCALE;
        rooted = Boolean.valueOf(Properties.HAS_ROOT);
        uuid = Properties.UID;
        userIdentifier = Properties.userIdentifier;
        carrier = Properties.CARRIER;
        remoteIP = "{%#@@#%}";
        connection = Properties.CONNECTION;
        state = Properties.STATE;
        extraData = Properties.extraData;
    }

    public JSONObject getBasicDataFixtureJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("sdkVersion", sdkVersion);
        jsonobject.put("apiKey", apiKey);
        jsonobject.put("platform", platform);
        jsonobject.put("device", device);
        jsonobject.put("osVersion", osVersion);
        jsonobject.put("locale", locale);
        jsonobject.put("uuid", uuid);
        jsonobject.put("userIdentifier", userIdentifier);
        jsonobject.put("carrier", carrier);
        jsonobject.put("remoteIP", remoteIP);
        jsonobject.put("appVersionCode", appVersionCode);
        jsonobject.put("appVersionName", appVersionName);
        jsonobject.put("packageName", packageName);
        jsonobject.put("connection", connection);
        jsonobject.put("state", state);
        if (type == EnumActionType.ping)
        {
            return jsonobject;
        }
        Object obj;
        Iterator iterator;
        if (type == EnumActionType.gnip || extraData == null || extraData.isEmpty())
        {
            break MISSING_BLOCK_LABEL_323;
        }
        obj = new JSONObject();
        iterator = extraData.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_315;
            }
            entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() != null)
            {
                break MISSING_BLOCK_LABEL_290;
            }
            ((JSONObject) (obj)).put((String)entry.getKey(), "null");
        } while (true);
        try
        {
            ((JSONObject) (obj)).put((String)entry.getKey(), entry.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
            return jsonobject;
        }
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject.put("extraData", obj);
        return jsonobject;
    }
}
