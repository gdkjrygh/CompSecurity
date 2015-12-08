// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            h, k, i, cc

final class a
    implements ValueCallback
{

    final il.client.b.a a;

    public final void onReceiveValue(Object obj)
    {
        h h1;
        WebView webview;
        String s;
        s = (String)obj;
        obj = a.a;
        h1 = a.a;
        webview = a.a;
        synchronized (h1.a)
        {
            h1.d = h1.d - 1;
        }
        if (!TextUtils.isEmpty(s))
        {
            obj1 = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_140;
            }
            h1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(((String) (obj1))).toString());
        }
_L1:
        if (h1.a())
        {
            ((k) (obj)).a.b(h1);
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        try
        {
            h1.a(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.a("Json string may be malformed.");
            return;
        }
        catch (Throwable throwable)
        {
            b.a("Failed to get webview content.", throwable);
            ((k) (obj)).b.a(throwable, true);
            return;
        }
          goto _L1
    }

    <init>(<init> <init>1)
    {
        a = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/k$2

/* anonymous class */
    final class k._cls2
        implements Runnable
    {

        ValueCallback a;
        final h b;
        final WebView c;
        final k d;

        public final void run()
        {
            if (!c.getSettings().getJavaScriptEnabled())
            {
                break MISSING_BLOCK_LABEL_26;
            }
            c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", a);
            return;
            Throwable throwable;
            throwable;
            a.onReceiveValue("");
            return;
        }

            
            {
                d = k1;
                b = h1;
                c = webview;
                super();
                a = new k._cls2._cls1(this);
            }
    }

}
