// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinMarkletFragment

class this._cls0 extends WebChromeClient
{

    final PinMarkletFragment this$0;

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        PLog.log((new StringBuilder("console message : ")).append(consolemessage.message()).toString(), new Object[0]);
        return super.onConsoleMessage(consolemessage);
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        PinMarkletFragment.access$302(PinMarkletFragment.this, true);
        PinMarkletFragment.access$500(PinMarkletFragment.this, PinMarkletFragment.access$400(PinMarkletFragment.this));
        jsresult.cancel();
        return true;
    }

    A()
    {
        this$0 = PinMarkletFragment.this;
        super();
    }
}
