// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            BaseDTO, InterfaceDataType, EnumExceptionType, Properties, 
//            StacktraceHash, ExtraData, Utils, BreadcrumbsLimited, 
//            DataSaver, NetSender, EnumStateStatus, EnumActionType

class ActionError extends BaseDTO
    implements InterfaceDataType
{

    private JSONArray breadcrumbs;
    private String errorHash;
    private EnumStateStatus gpsStatus;
    private Boolean handled;
    private String klass;
    private String memAppAvailable;
    private String memAppMax;
    private String memAppTotal;
    private String memSysAvailable;
    private String memSysLow;
    private String memSysThreshold;
    private String message;
    private String msFromStart;
    private String stacktrace;
    private String where;

    public ActionError(EnumActionType enumactiontype, String s, EnumExceptionType enumexceptiontype, ExtraData extradata)
    {
        super(enumactiontype);
        stacktrace = s;
        if (enumexceptiontype == EnumExceptionType.HANDLED)
        {
            handled = Boolean.valueOf(true);
        } else
        {
            handled = Boolean.valueOf(false);
        }
        enumactiontype = StacktraceHash.manipulateStacktrace(Properties.APP_PACKAGE, s);
        klass = (String)enumactiontype.get("klass");
        message = (String)enumactiontype.get("message");
        errorHash = (String)enumactiontype.get("errorHash");
        where = (String)enumactiontype.get("where");
        if (extradata != null)
        {
            if (extraData == null)
            {
                extraData = new ExtraData();
            }
            extraData.addExtraData(extradata);
        }
        gpsStatus = Properties.IS_GPS_ON;
        msFromStart = Utils.getMilisFromStart();
        enumactiontype = new android.app.ActivityManager.MemoryInfo();
        s = Runtime.getRuntime();
        memSysLow = String.valueOf(((android.app.ActivityManager.MemoryInfo) (enumactiontype)).lowMemory);
        memSysAvailable = String.valueOf((double)((android.app.ActivityManager.MemoryInfo) (enumactiontype)).availMem / 1048576D);
        memSysThreshold = String.valueOf((double)((android.app.ActivityManager.MemoryInfo) (enumactiontype)).threshold / 1048576D);
        memAppMax = String.valueOf((double)s.maxMemory() / 1048576D);
        memAppAvailable = String.valueOf((double)s.freeMemory() / 1048576D);
        memAppTotal = String.valueOf((double)s.totalMemory() / 1048576D);
        breadcrumbs = Properties.breadcrumbs.getList();
    }

    protected final String getErrorHash()
    {
        return errorHash;
    }

    public void save(DataSaver datasaver)
    {
        (new DataSaver()).save(toJsonLine());
    }

    public void send(Context context, NetSender netsender, boolean flag)
    {
        netsender.send(toJsonLine(), flag);
    }

    public void send(NetSender netsender, boolean flag)
    {
        netsender.send(toJsonLine(), flag);
    }

    public String toJsonLine()
    {
        JSONObject jsonobject = getBasicDataFixtureJson();
        try
        {
            jsonobject.put("stacktrace", stacktrace);
            jsonobject.put("handled", handled);
            jsonobject.put("klass", klass);
            jsonobject.put("message", message);
            jsonobject.put("errorHash", errorHash);
            jsonobject.put("where", where);
            jsonobject.put("rooted", rooted);
            jsonobject.put("gpsStatus", gpsStatus.toString());
            jsonobject.put("msFromStart", msFromStart);
            if (breadcrumbs != null && breadcrumbs.length() > 0)
            {
                jsonobject.put("breadcrumbs", breadcrumbs);
            }
            jsonobject.put("memSysLow", memSysLow);
            jsonobject.put("memSysAvailable", memSysAvailable);
            jsonobject.put("memSysThreshold", memSysThreshold);
            jsonobject.put("memAppMax", memAppMax);
            jsonobject.put("memAppAvailable", memAppAvailable);
            jsonobject.put("memAppTotal", memAppTotal);
            if (Properties.SEND_LOG && !handled.booleanValue())
            {
                jsonobject.put("log", Utils.readLogs());
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return (new StringBuilder()).append(jsonobject.toString()).append(Properties.getSeparator(EnumActionType.error)).toString();
    }
}
