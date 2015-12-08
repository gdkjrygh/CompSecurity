// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            CallbackTask, Log, CallbackTaskFactory

public class MoveCallbackTask extends CallbackTask
{

    private static final String TAG = "MoveCBT";
    private static final String actions[] = {
        "moveInnerWebView"
    };
    private static int lastMovement = 0;

    private MoveCallbackTask()
    {
    }

    private MoveCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
    }

    public static int getLastMovement()
    {
        return lastMovement;
    }

    public static void load()
    {
        Log.d("MoveCBT", "Loading");
        CallbackTaskFactory.addCallbackTask(new MoveCallbackTask(), actions);
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        Log.d("MoveCBT", (new StringBuilder()).append("Create: ").append(s).toString());
        return new MoveCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        AppHelper.hideKeyboard();
        AppHelper.hideMenu();
    }

}
