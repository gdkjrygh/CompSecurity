// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            WebViewLinker, NativeCache

final class maxSearches
{

    private int maxSearches;
    private int statusLength;
    private String statusString;
    final WebViewLinker this$0;

    public void backButtonActive(boolean flag)
    {
        if (flag)
        {
            boolean _tmp = WebViewLinker.access$002(true);
            sendJavascript("INGDirectApp.showBackButton();");
            return;
        } else
        {
            boolean _tmp1 = WebViewLinker.access$002(false);
            sendJavascript("INGDirectApp.hideBackButton();");
            return;
        }
    }

    public void handleAlerts(String s)
    {
        String s1 = "INGDirectAppConnection.redirectContForReqTimeout();";
        if (s.trim().length() > 0)
        {
            s1 = (new StringBuilder()).append("Ext.dispatch({controller:'LoginController',action:'postLoginError',error:'").append(s).append("'})").toString();
        }
        sendJavascript(s1);
    }

    public void handleErrorCodes(String s)
    {
        if (s != null && s.length() >= statusLength)
        {
            int j;
            for (int i = 0; i <= maxSearches; i = j + 1)
            {
                j = i;
                if (s.regionMatches(true, i, statusString, 0, statusLength))
                {
                    Log.d("WebViewLinker.JavaScriptInterface", "Found Match!");
                    sendJavascript("INGDirectApp.updateLastAccessed();");
                    sendJavascript("INGDirectApp.hideBusyIndicator();");
                    j = maxSearches;
                }
            }

        }
    }

    public void userNameTransiteForm(String s)
    {
        if (!s.matches(NativeCache.staticRead("cif")))
        {
            NativeCache.staticWrite("cif", "");
            NativeCache.staticWrite("maskedCif", "");
        }
    }

    public ()
    {
        this$0 = WebViewLinker.this;
        super();
        statusString = "http status";
        statusLength = statusString.length();
        maxSearches = 10;
    }
}
