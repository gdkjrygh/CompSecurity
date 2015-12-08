// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            BaseDTO, InterfaceDataType, EnumActionType, Utils, 
//            MintLogLevel, Properties, DataSaver, Logger, 
//            MintUrls, NetSender, NetSenderResponse, RemoteSettings

class ActionEvent extends BaseDTO
    implements InterfaceDataType
{

    private static String savedSessionID = "";
    protected long duration;
    protected Integer eventLevel;
    protected String eventName;
    protected String session_id;

    public ActionEvent(EnumActionType enumactiontype, String s, Integer integer)
    {
        super(enumactiontype);
        eventName = "";
        eventLevel = null;
        duration = -1L;
        session_id = "";
        eventName = s;
        eventLevel = integer;
        if (enumactiontype == EnumActionType.ping)
        {
            session_id = Utils.getRandomSessionNumber();
            savedSessionID = session_id;
        } else
        if (enumactiontype == EnumActionType.gnip)
        {
            session_id = savedSessionID;
            return;
        }
    }

    public static final ActionEvent createEvent(String s)
    {
        return new ActionEvent(EnumActionType.event, s, Integer.valueOf(Utils.convertLoggingLevelToInt(MintLogLevel.Verbose)));
    }

    public static final ActionEvent createEvent(String s, MintLogLevel mintloglevel)
    {
        return new ActionEvent(EnumActionType.event, s, Integer.valueOf(Utils.convertLoggingLevelToInt(mintloglevel)));
    }

    public static final ActionEvent createGnip()
    {
        ActionEvent actionevent = new ActionEvent(EnumActionType.gnip, null, null);
        actionevent.duration = actionevent.timestampMilis.longValue() - Properties.lastPingTime;
        return actionevent;
    }

    public static final ActionEvent createPing()
    {
        ActionEvent actionevent = new ActionEvent(EnumActionType.ping, null, null);
        Properties.lastPingTime = actionevent.timestampMilis.longValue();
        return actionevent;
    }

    public void save(DataSaver datasaver)
    {
        if (eventLevel != null)
        {
            if (eventLevel.intValue() >= Properties.RemoteSettingsProps.eventLevel.intValue())
            {
                datasaver.save(toJsonLine());
                return;
            } else
            {
                Logger.logInfo("Event's level is lower than the minimum level from Remote Settings, event will not be saved");
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
        if (type.equals(EnumActionType.ping))
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(MintUrls.getURL(0, 1));
            stringbuilder.append("?hash=");
            stringbuilder.append(Properties.RemoteSettingsProps.hashCode);
            netsender = RemoteSettings.convertJsonToRemoteSettings(netsender.sendBlocking(stringbuilder.toString(), toJsonLine(), flag).getServerResponse());
            if (netsender != null)
            {
                RemoteSettings.saveAndLoadRemoteSettings(context, netsender);
            }
            return;
        } else
        {
            netsender.send(toJsonLine(), flag);
            return;
        }
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
            if (duration != -1L)
            {
                jsonobject.put("ses_duration", duration);
            }
            if (eventName != null)
            {
                jsonobject.put("event_name", eventName);
            }
            if (eventLevel != null)
            {
                jsonobject.put("level", eventLevel);
            }
            if (type != EnumActionType.event)
            {
                jsonobject.put("session_id", session_id);
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return (new StringBuilder()).append(jsonobject.toString()).append(Properties.getSeparator(type)).toString();
    }

}
