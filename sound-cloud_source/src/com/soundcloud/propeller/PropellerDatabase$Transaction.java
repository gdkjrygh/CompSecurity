// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;


// Referenced classes of package com.soundcloud.propeller:
//            PropellerDatabase, TxnResult, WriteResult, PropellerWriteException

public static abstract class 
{

    private final TxnResult txnResult = new TxnResult();

    public TxnResult execute(PropellerDatabase propellerdatabase)
    {
        steps(propellerdatabase);
        return txnResult;
    }

    public WriteResult step(WriteResult writeresult)
    {
        if (!writeresult.success())
        {
            writeresult = new PropellerWriteException("Transaction failed", writeresult.getFailure());
            txnResult.fail(writeresult);
            throw writeresult;
        } else
        {
            return writeresult;
        }
    }

    public abstract void steps(PropellerDatabase propellerdatabase);

    public boolean success()
    {
        return txnResult.success();
    }


    public ()
    {
    }
}
