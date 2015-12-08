// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import com.kik.cards.web.au;
import com.kik.cards.web.az;
import com.kik.cards.web.ba;
import org.c.b;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.kik.cards.web.plugin:
//            JavascriptGlue

private final class a extends ba
{

    final JavascriptGlue a;

    private String a(JSONArray jsonarray, String s)
    {
        int i = 1;
        Object obj = jsonarray.getString(0);
        if ("poll".equals(obj))
        {
            return com.kik.cards.web.plugin.JavascriptGlue.b(a).poll();
        }
        if ("invokeAsyncFunction".equals(obj))
        {
            return com.kik.cards.web.plugin.JavascriptGlue.b(a).invokeAsyncFunction(jsonarray.getString(1), jsonarray.getString(2), jsonarray.getString(3), s);
        }
        if ("invokeFunction".equals(obj))
        {
            return com.kik.cards.web.plugin.JavascriptGlue.b(a).invokeFunction(jsonarray.getString(1), jsonarray.getString(2), s);
        }
        if ("batchInvoke".equals(obj))
        {
            obj = new JSONArray();
            for (; i < jsonarray.length(); i++)
            {
                ((JSONArray) (obj)).put(a(jsonarray.getJSONArray(i), s));
            }

            return ((JSONArray) (obj)).toString();
        } else
        {
            throw new NoSuchMethodException(((String) (obj)));
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        super.onConsoleMessage(consolemessage);
        JavascriptGlue.a(a, consolemessage.message());
        return true;
    }

    public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        if (JavascriptGlue.a(a))
        {
            JavascriptGlue.c().b("Prompt after unhook: {}", s2);
            jspromptresult.cancel();
            return true;
        }
        if (!"CardsBridge".equals(s1))
        {
            break MISSING_BLOCK_LABEL_60;
        }
        jspromptresult.confirm(a(new JSONArray(s2), s));
        return true;
        webview;
_L2:
        jspromptresult.cancel();
        return true;
        webview;
        continue; /* Loop/switch isn't completed */
        webview;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Interface(JavascriptGlue javascriptglue, au au, az az)
    {
        a = javascriptglue;
        super(au, az);
    }
}
