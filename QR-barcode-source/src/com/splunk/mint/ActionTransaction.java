// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;

// Referenced classes of package com.splunk.mint:
//            BaseDTO, InterfaceDataType, DataSaver, NetSender, 
//            EnumActionType, Properties

abstract class ActionTransaction extends BaseDTO
    implements InterfaceDataType
{

    protected String name;
    protected String transaction_id;

    protected ActionTransaction(String s, EnumActionType enumactiontype)
    {
        super(enumactiontype);
        name = "";
        transaction_id = "";
        name = s;
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
        return (new StringBuilder()).append("").append(Properties.getSeparator(EnumActionType.trstart)).toString();
    }
}
