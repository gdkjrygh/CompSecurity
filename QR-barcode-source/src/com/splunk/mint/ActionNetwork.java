// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            BaseDTO, InterfaceDataType, EnumActionType, DataSaver, 
//            NetSender, Properties

public class ActionNetwork extends BaseDTO
    implements InterfaceDataType
{

    private String exception;
    private Boolean failed;
    private Long latency;
    private String protocol;
    private Long requestLength;
    private Long responseLength;
    private Integer statusCode;
    private String url;

    public ActionNetwork(EnumActionType enumactiontype, String s)
    {
        super(enumactiontype);
        url = "";
        latency = Long.valueOf(0L);
        statusCode = Integer.valueOf(0);
        responseLength = Long.valueOf(0L);
        requestLength = Long.valueOf(0L);
        failed = Boolean.valueOf(true);
        exception = null;
        protocol = null;
        url = s;
    }

    public static final void logNetwork(String s, long l, long l1, String s1, Map map, Map map1, 
            int i, long l2, long l3, String s2)
    {
        s = new ActionNetwork(EnumActionType.network, s);
        s.timestamp = String.valueOf(l);
        s.latency = Long.valueOf(l1 - l);
        s.statusCode = Integer.valueOf(i);
        s.responseLength = Long.valueOf(l3);
        s.requestLength = Long.valueOf(l2);
        if (((ActionNetwork) (s)).statusCode.intValue() >= 200 && ((ActionNetwork) (s)).statusCode.intValue() < 400)
        {
            s.failed = Boolean.valueOf(false);
        } else
        {
            s.failed = Boolean.valueOf(true);
        }
        s.exception = s2;
        s.protocol = s1;
        s.save(new DataSaver());
    }

    public volatile JSONObject getBasicDataFixtureJson()
    {
        return super.getBasicDataFixtureJson();
    }

    public void save(DataSaver datasaver)
    {
        datasaver.save(toJsonLine());
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
            jsonobject.put("url", url);
            jsonobject.put("latency", latency);
            jsonobject.put("statusCode", statusCode);
            jsonobject.put("responseLength", responseLength);
            jsonobject.put("requestLength", requestLength);
            jsonobject.put("failed", failed);
            jsonobject.put("protocol", protocol);
            if (exception != null && exception.length() > 0)
            {
                jsonobject.put("exception", exception);
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return (new StringBuilder()).append(jsonobject.toString()).append(Properties.getSeparator(EnumActionType.network)).toString();
    }
}
