// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            ActionTransaction, InterfaceDataType, EnumActionType, EnumTransactionStatus, 
//            Properties, TransactionsDatabase, DataSaver, NetSender

class ActionTransactionStop extends ActionTransaction
    implements InterfaceDataType
{

    protected long duration;
    protected String reason;
    protected EnumTransactionStatus status;

    private ActionTransactionStop(String s, EnumTransactionStatus enumtransactionstatus, String s1)
    {
        super(s, EnumActionType.trstop);
        duration = 0L;
        status = EnumTransactionStatus.FAIL;
        reason = "";
        status = enumtransactionstatus;
        reason = s1;
        if (s1 == null || s1.length() == 0)
        {
            reason = "NA";
        }
        enumtransactionstatus = Properties.transactionsDatabase.getStartedTransactionContainer(s);
        if (enumtransactionstatus != null)
        {
            transaction_id = ((TransactionsDatabase.Container) (enumtransactionstatus)).transid;
            long l = ((TransactionsDatabase.Container) (enumtransactionstatus)).timestamp.longValue();
            if (l != -1L)
            {
                duration = timestampMilis.longValue() - l;
            }
        }
        Properties.transactionsDatabase.closeStartedTransaction(s);
    }

    protected static final ActionTransactionStop createTransactionCancel(String s, String s1)
    {
        return new ActionTransactionStop(s, EnumTransactionStatus.CANCEL, s1);
    }

    protected static final ActionTransactionStop createTransactionFail(String s, String s1)
    {
        return new ActionTransactionStop(s, EnumTransactionStatus.FAIL, s1);
    }

    protected static final ActionTransactionStop createTransactionStop(String s)
    {
        return new ActionTransactionStop(s, EnumTransactionStatus.SUCCESS, null);
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
            jsonobject.put("status", status.toString());
            jsonobject.put("reason", reason);
            jsonobject.put("transaction_id", transaction_id);
            jsonobject.put("tr_duration", String.valueOf(duration));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return (new StringBuilder()).append(jsonobject.toString()).append(Properties.getSeparator(EnumActionType.trstop)).toString();
    }
}
