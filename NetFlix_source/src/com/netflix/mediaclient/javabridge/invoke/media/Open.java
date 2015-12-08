// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.ui.common.PlayContext;
import org.json.JSONException;
import org.json.JSONObject;

public class Open extends BaseInvoke
{
    public static final class NetType extends Enum
    {

        private static final NetType $VALUES[];
        public static final NetType mobile;
        public static final NetType wifi;
        public static final NetType wired;

        public static NetType valueOf(String s)
        {
            return (NetType)Enum.valueOf(com/netflix/mediaclient/javabridge/invoke/media/Open$NetType, s);
        }

        public static NetType[] values()
        {
            return (NetType[])$VALUES.clone();
        }

        static 
        {
            wifi = new NetType("wifi", 0);
            mobile = new NetType("mobile", 1);
            wired = new NetType("wired", 2);
            $VALUES = (new NetType[] {
                wifi, mobile, wired
            });
        }

        private NetType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String METHOD = "open";
    private static final String PARAMS = "params";
    private static final String PARAM_NET_TYPE = "nettype";
    private static final String PARAM_NET_TYPE_VALUE_MOBILE = "mobile";
    private static final String PARAM_NET_TYPE_VALUE_WIFI = "wifi";
    private static final String PARAM_NET_TYPE_VALUE_WIRED = "wired";
    private static final String PARAM_PIN_VERIFY_CAPABILITY = "pinCapableClient";
    private static final String PARAM_PLAY_CONTEXT = "uiplaycontext";
    private static final String PARAM_PLAY_CONTEXT_LIST_POS = "row";
    private static final String PARAM_PLAY_CONTEXT_REQ_ID = "request_id";
    private static final String PARAM_PLAY_CONTEXT_VIDEO_POS = "rank";
    private static final String PROPERTY_MOVIEID = "movieId";
    private static final String PROPERTY_TRACKID = "trackerId";
    private static final String TARGET = "media";

    public Open(long l, PlayContext playcontext, NetType nettype)
    {
        super("media", "open");
        setArguments(l, playcontext, nettype);
    }

    private void setArguments(long l, PlayContext playcontext, NetType nettype)
    {
        if (playcontext == null)
        {
            throw new IllegalArgumentException("Play context can not be null!");
        }
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1;
        jsonobject.put("movieId", l);
        jsonobject.put("trackerId", playcontext.getTrackId());
        jsonobject1 = new JSONObject();
        if (!NetType.mobile.equals(nettype)) goto _L2; else goto _L1
_L1:
        jsonobject1.put("nettype", "mobile");
_L7:
        jsonobject1.put("pinCapableClient", true);
        nettype = new JSONObject();
        nettype.put("request_id", playcontext.getRequestId());
        nettype.put("row", playcontext.getListPos());
        nettype.put("rank", playcontext.getVideoPos());
        jsonobject1.put("uiplaycontext", nettype);
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", String.format("DEBUG info: reqId %s, listPos %d,  videoPos %d", new Object[] {
                playcontext.getRequestId(), Integer.valueOf(playcontext.getListPos()), Integer.valueOf(playcontext.getVideoPos())
            }));
        }
        jsonobject.put("params", jsonobject1);
        arguments = jsonobject.toString();
        if (Log.isLoggable("nf_invoke", 3))
        {
            Log.d("nf_invoke", String.format("DEBUG info: sessionParams: %s", new Object[] {
                jsonobject.toString()
            }));
        }
          goto _L3
_L2:
        if (NetType.wifi.equals(nettype))
        {
            jsonobject1.put("nettype", "wifi");
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L5:
        Log.e("nf_invoke", "Failed to create JSON object", playcontext);
        return;
_L4:
        if (NetType.wired.equals(nettype))
        {
            jsonobject1.put("nettype", "wired");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            jsonobject1.put("nettype", "mobile");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (PlayContext playcontext) { }
        continue; /* Loop/switch isn't completed */
        playcontext;
        if (true) goto _L5; else goto _L3
_L3:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
