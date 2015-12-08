// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.webkit.JsPromptResult;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            PromptResult

public class PromptResultForJavaScript
    implements PromptResult
{

    private JsPromptResult result;

    public PromptResultForJavaScript(JsPromptResult jspromptresult)
    {
        if (jspromptresult == null)
        {
            throw new IllegalArgumentException("JS result cannot be null");
        } else
        {
            result = jspromptresult;
            return;
        }
    }

    public void cancel()
    {
        result.cancel();
    }

    public void confirm(String s)
    {
        result.confirm(s);
    }
}
