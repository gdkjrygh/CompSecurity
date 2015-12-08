// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


// Referenced classes of package com.splunk.mint:
//            TransactionsDatabase

public class transid
{

    final TransactionsDatabase this$0;
    public Long timestamp;
    public String transid;

    public (Long long1, String s)
    {
        this$0 = TransactionsDatabase.this;
        super();
        timestamp = long1;
        transid = s;
    }
}
