// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import org.xbmc.kore.utils.JsonUtils;

public class GlobalType
{
    public static class Time
    {

        public final int hours;
        public final int milliseconds;
        public final int minutes;
        public final int seconds;

        public int ToSeconds()
        {
            return hours * 3600 + minutes * 60 + seconds;
        }

        public Time(JsonNode jsonnode)
        {
            hours = JsonUtils.intFromJsonNode(jsonnode, "hours", 0);
            milliseconds = JsonUtils.intFromJsonNode(jsonnode, "milliseconds", 0);
            minutes = JsonUtils.intFromJsonNode(jsonnode, "minutes", 0);
            seconds = JsonUtils.intFromJsonNode(jsonnode, "seconds", 0);
        }
    }

}
