// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            ActionTransaction, InterfaceDataType, EnumActionType, Utils, 
//            Properties, TransactionsDatabase, DataSaver, NetSender

class ActionTransactionStart extends ActionTransaction
    implements InterfaceDataType
{

    private ActionTransactionStart(String s)
    {
        super(s, EnumActionType.trstart);
        transaction_id = Utils.getRandomSessionNumber();
    }

    public static ActionTransactionStart createTransactionStart(String s)
    {
        s = new ActionTransactionStart(s);
        Properties.transactionsDatabase.addStartedTransaction(s);
        return s;
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
            jsonobject.put("tr_name", name);
            jsonobject.put("transaction_id", transaction_id);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return (new StringBuilder()).append(jsonobject.toString()).append(Properties.getSeparator(EnumActionType.trstart)).toString();
    }
}
