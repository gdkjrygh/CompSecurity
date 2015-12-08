// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.util.HashMap;

// Referenced classes of package com.splunk.mint:
//            ActionTransactionStart

class TransactionsDatabase extends HashMap
{
    public class Container
    {

        final TransactionsDatabase this$0;
        public Long timestamp;
        public String transid;

        public Container(Long long1, String s)
        {
            this$0 = TransactionsDatabase.this;
            super();
            timestamp = long1;
            transid = s;
        }
    }


    protected static final String TransName = "TStart:name:";
    private static final long serialVersionUID = 0xcf3443817e97b27fL;

    public TransactionsDatabase()
    {
    }

    public boolean addStartedTransaction(ActionTransactionStart actiontransactionstart)
    {
        if (actiontransactionstart == null)
        {
            return false;
        }
        try
        {
            put((new StringBuilder()).append("TStart:name:").append(actiontransactionstart.name).toString(), new Container(actiontransactionstart.timestampMilis, actiontransactionstart.transaction_id));
        }
        // Misplaced declaration of an exception variable
        catch (ActionTransactionStart actiontransactionstart)
        {
            actiontransactionstart.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean closeStartedTransaction(String s)
    {
        while (s == null || !containsKey((new StringBuilder()).append("TStart:name:").append(s).toString())) 
        {
            return false;
        }
        put((new StringBuilder()).append("TStart:name:").append(s).toString(), new Container(Long.valueOf(-1L), null));
        return true;
    }

    public Container getStartedTransactionContainer(String s)
    {
        while (s == null || !containsKey((new StringBuilder()).append("TStart:name:").append(s).toString())) 
        {
            return null;
        }
        return (Container)get((new StringBuilder()).append("TStart:name:").append(s).toString());
    }
}
