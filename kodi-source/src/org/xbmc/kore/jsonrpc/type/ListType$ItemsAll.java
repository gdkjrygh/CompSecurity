// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ListType

public static class ode extends ode
{

    public final String channel;
    public final int channelnumber;
    public final String channeltype;
    public final String endtime;
    public final boolean hidden;
    public final boolean locked;
    public final String starttime;

    public (JsonNode jsonnode)
    {
        super(jsonnode);
        channel = JsonUtils.stringFromJsonNode(jsonnode, "channel", null);
        channelnumber = JsonUtils.intFromJsonNode(jsonnode, "channelnumber", 0);
        channeltype = JsonUtils.stringFromJsonNode(jsonnode, "channeltype", "tv");
        endtime = JsonUtils.stringFromJsonNode(jsonnode, "endtime", null);
        hidden = JsonUtils.booleanFromJsonNode(jsonnode, "hidden", false);
        locked = JsonUtils.booleanFromJsonNode(jsonnode, "locked", false);
        starttime = JsonUtils.stringFromJsonNode(jsonnode, "starttime", null);
    }
}
