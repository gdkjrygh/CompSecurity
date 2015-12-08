// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            Log, CallbackTask

public class CallbackTaskFactory
{

    private static final String TAG = "CallbackTaskFactory";
    private static Map taskList = new HashMap();

    private CallbackTaskFactory()
    {
    }

    public static transient void addCallbackTask(CallbackTask callbacktask, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            Log.d("CallbackTaskFactory", (new StringBuilder()).append("Adding action: ").append(s).toString());
            taskList.put(s, callbacktask);
        }

    }

    public static CallbackTask getCallbackTask(String s, String s1, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        CallbackTask callbacktask = (CallbackTask)taskList.get(s);
        s = callbacktask;
        if (callbacktask != null)
        {
            s = callbacktask.create(s1, jsonarray, webviewlinker);
        }
        return s;
    }

    public static boolean hasAction(String s)
    {
        return taskList.containsKey(s);
    }

}
