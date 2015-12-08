// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            BaseDTO, InterfaceDataType, EnumActionType, Utils, 
//            DataSaver, Logger, NetSender, Properties, 
//            MintLogLevel

class ActionLog extends BaseDTO
    implements InterfaceDataType
{

    public Integer eventLevel;
    public String eventName;

    public ActionLog(EnumActionType enumactiontype, String s, Integer integer)
    {
        super(enumactiontype);
        eventName = "";
        eventLevel = Integer.valueOf(2);
        eventName = s;
        eventLevel = integer;
    }

    public static final ActionLog createLog(String s, MintLogLevel mintloglevel)
    {
        return new ActionLog(EnumActionType.log, s, Integer.valueOf(Utils.convertLoggingLevelToInt(mintloglevel)));
    }

    private String getLevelSfromLevel(Integer integer)
    {
        if (integer.intValue() == 3)
        {
            return "D";
        }
        if (integer.intValue() == 6)
        {
            return "E";
        }
        if (integer.intValue() == 4)
        {
            return "I";
        }
        if (integer.intValue() == 2)
        {
            return "V";
        }
        if (integer.intValue() == 5)
        {
            return "W";
        } else
        {
            return "I";
        }
    }

    public void save(DataSaver datasaver)
    {
        if (eventLevel != null)
        {
            if (eventLevel.intValue() >= Properties.RemoteSettingsProps.logLevel.intValue())
            {
                datasaver.save(toJsonLine());
                return;
            } else
            {
                Logger.logInfo("Logs's level is lower than the minimum level from Remote Settings, log will not be saved");
                return;
            }
        } else
        {
            datasaver.save(toJsonLine());
            return;
        }
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
            jsonobject.put("log_name", eventName);
            jsonobject.put("level", getLevelSfromLevel(eventLevel));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return (new StringBuilder()).append(jsonobject.toString()).append(Properties.getSeparator(type)).toString();
    }
}
