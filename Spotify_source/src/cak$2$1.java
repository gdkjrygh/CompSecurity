// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

final class g.Object
    implements ValueCallback
{

    private g.Throwable a;

    public final void onReceiveValue(Object obj)
    {
        cah cah1;
        WebView webview;
        String s;
        s = (String)obj;
        obj = a.a;
        cah1 = a.a;
        webview = a.a;
        synchronized (cah1.a)
        {
            cah1.d = cah1.d - 1;
        }
        if (!TextUtils.isEmpty(s))
        {
            obj1 = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_140;
            }
            cah1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(((String) (obj1))).toString());
        }
_L1:
        if (cah1.a())
        {
            ((cak) (obj)).c.b(cah1);
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        try
        {
            cah1.a(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bka.a("Json string may be malformed.");
            return;
        }
        catch (Throwable throwable)
        {
            bka.a("Failed to get webview content.", throwable);
            ((cak) (obj)).d.a(throwable, true);
            return;
        }
          goto _L1
    }

    <init>(<init> <init>1)
    {
        a = <init>1;
        super();
    }

    // Unreferenced inner class cak$2

/* anonymous class */
    final class cak._cls2
        implements Runnable
    {

        final cah a;
        final WebView b;
        final cak c;
        private ValueCallback d;

        public final void run()
        {
            if (!b.getSettings().getJavaScriptEnabled())
            {
                break MISSING_BLOCK_LABEL_26;
            }
            b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", d);
            return;
            Throwable throwable;
            throwable;
            d.onReceiveValue("");
            return;
        }

            
            {
                c = cak1;
                a = cah1;
                b = webview;
                super();
                d = new cak._cls2._cls1(this);
            }
    }

}
