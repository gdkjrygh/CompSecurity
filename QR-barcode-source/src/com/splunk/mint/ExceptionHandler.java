// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.splunk.mint:
//            ActionError, EnumActionType, EnumExceptionType, Properties, 
//            TransactionsDatabase, ActionTransactionStop, DataSaver, NetSender, 
//            CrashInfo, Utils, Mint, MintCallback

public class ExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler defaultExceptionHandler;

    public ExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        defaultExceptionHandler = uncaughtexceptionhandler;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj = new StringWriter();
        throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
        obj = new ActionError(EnumActionType.error, obj.toString(), EnumExceptionType.UNHANDLED, null);
        for (Iterator iterator = Properties.transactionsDatabase.entrySet().iterator(); iterator.hasNext(); iterator.remove())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() != null)
            {
                ActionTransactionStop.createTransactionFail(((String)entry.getKey()).replace("TStart:name:", ""), ((ActionError) (obj)).getErrorHash()).save(new DataSaver());
            }
        }

        ((ActionError) (obj)).send(new NetSender(), true);
        (new CrashInfo()).saveLastCrashID(String.valueOf(((ActionError) (obj)).getErrorHash()));
        Utils.setForceSendPingOnNextStart();
        if (Mint.mintCallback != null)
        {
            Mint.mintCallback.lastBreath(new Exception(throwable));
        }
        try
        {
            Thread.sleep(3000L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        defaultExceptionHandler.uncaughtException(thread, throwable);
    }
}
