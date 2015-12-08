// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;

// Referenced classes of package com.splunk.mint:
//            ActionEvent, InterfaceDataType, EnumActionType, NetSender

class EventDataPingSettings extends ActionEvent
    implements InterfaceDataType
{

    public EventDataPingSettings(EnumActionType enumactiontype, String s, Integer integer)
    {
        super(enumactiontype, s, integer);
    }

    public void send(Context context, NetSender netsender, boolean flag)
    {
    }
}
