// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            ak, ah

final class a
    implements ValueCallback
{

    final a a;

    public final void onReceiveValue(Object obj)
    {
        obj = (String)obj;
        a.a.a(a.a, a.a, ((String) (obj)));
    }

    <init>(<init> <init>1)
    {
        a = <init>1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/ak$2

/* anonymous class */
    final class ak._cls2
        implements Runnable
    {

        ValueCallback a;
        final ah b;
        final WebView c;
        final ak d;

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
                d = ak1;
                b = ah;
                c = webview;
                super();
                a = new ak._cls2._cls1(this);
            }
    }

}
