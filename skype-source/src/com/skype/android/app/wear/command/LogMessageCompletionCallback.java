// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.l;

// Referenced classes of package com.skype.android.app.wear.command:
//            ChainableCompletionCallback

public class LogMessageCompletionCallback extends ChainableCompletionCallback
{
    public static class LogNodeMessageCompletionCallback extends LogMessageCompletionCallback
        implements NodeCompletionWearCommand.NodeCompletionCallback
    {

        public void onNodeError(NodeWearCommand.NodeMessageResult nodemessageresult, l l1)
        {
            Log.i(getTag(), (new StringBuilder("Command '")).append(getCommandDescription()).append("' failed to be sent to node ").append(nodemessageresult.getNode().b()).toString());
        }

        public void onNodeResult(NodeWearCommand.NodeMessageResult nodemessageresult, l l1)
        {
            Log.i(getTag(), (new StringBuilder("Command '")).append(getCommandDescription()).append("' sent successfully to node ").append(nodemessageresult.getNode().b()).toString());
        }

        public LogNodeMessageCompletionCallback then(NodeCompletionWearCommand.NodeCompletionCallback nodecompletioncallback)
        {
            then(nodecompletioncallback);
            return this;
        }

        private LogNodeMessageCompletionCallback(String s, String s1)
        {
            super(s, s1, null);
        }

    }


    private final String commandId;
    private final String tag;

    private LogMessageCompletionCallback(String s, String s1)
    {
        String s2 = s;
        if (s.length() > 23)
        {
            s2 = s.substring(0, 23);
        }
        tag = s2;
        commandId = s1;
    }


    public static LogMessageCompletionCallback getDataLoggerCallback(String s, String s1)
    {
        return new LogMessageCompletionCallback(s, s1);
    }

    public static LogMessageCompletionCallback getDeleteDataLoggerCallback(String s, String s1)
    {
        return new LogMessageCompletionCallback(s, s1);
    }

    public static LogNodeMessageCompletionCallback getMessageLoggerCallback(String s, String s1)
    {
        return new LogNodeMessageCompletionCallback(s, s1);
    }

    protected String getCommandDescription()
    {
        return commandId;
    }

    protected String getTag()
    {
        return tag;
    }

    protected void logError(String s, String s1, g g1)
    {
        Log.i(s, (new StringBuilder("Command '")).append(s1).append("' failed with message: ").append(g1.getStatus().b()).toString());
    }

    protected void logResult(String s, String s1)
    {
        Log.i(s, (new StringBuilder("Command '")).append(s1).append("' completed successfully.").toString());
    }

    public void onError(g g1)
    {
        logError(tag, commandId, g1);
        super.onError(g1);
    }

    public void onResult(g g1)
    {
        logResult(tag, commandId);
        super.onResult(g1);
    }
}
