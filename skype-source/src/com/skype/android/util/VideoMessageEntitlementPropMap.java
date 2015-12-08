// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.HashMap;

public class VideoMessageEntitlementPropMap
{

    private HashMap a;

    public VideoMessageEntitlementPropMap(com.skype.SkyLib.GetVideoMessagingEntitlement_Result getvideomessagingentitlement_result)
    {
        a = new HashMap();
        String as[] = getvideomessagingentitlement_result.m_ids;
        getvideomessagingentitlement_result = getvideomessagingentitlement_result.m_values;
        if (as != null)
        {
            for (int i = 0; i < as.length; i++)
            {
                a.put(as[i], Integer.valueOf(getvideomessagingentitlement_result[i]));
            }

        }
    }

    public final int a()
    {
        Integer integer = (Integer)a.get("messages_left");
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    public final int b()
    {
        Integer integer = (Integer)a.get("max_message_length");
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }
}
