// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            Log

public abstract class CallbackTask
{

    public static final String TAG = "CallbackTask";
    protected WebViewLinker appLink;
    protected String callbackId;
    protected boolean complete;
    protected JSONArray parameters;

    protected CallbackTask()
    {
        callbackId = null;
        parameters = null;
        appLink = null;
        complete = false;
    }

    protected CallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        callbackId = null;
        parameters = null;
        appLink = null;
        complete = false;
        Log.d("CallbackTask", (new StringBuilder()).append("CBId: ").append(s).toString());
        Log.d("CallbackTask", (new StringBuilder()).append("Params: ").append(jsonarray.toString()).toString());
        callbackId = s;
        parameters = jsonarray;
        appLink = webviewlinker;
        complete = false;
    }

    public static void load()
        throws RuntimeException
    {
        throw new RuntimeException("Create a load function for your CallbackTask");
    }

    public abstract CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker);

    public abstract void execute(WebView webview);

    public String getCallbackId()
    {
        return callbackId;
    }

    public boolean isComplete()
    {
        return complete;
    }

    public void setComplete()
    {
        complete = true;
    }
}
