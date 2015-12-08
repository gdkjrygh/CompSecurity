// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;

public interface MraidWebViewDebugListener
{

    public abstract boolean onConsoleMessage(ConsoleMessage consolemessage);

    public abstract boolean onJsAlert(String s, JsResult jsresult);
}
