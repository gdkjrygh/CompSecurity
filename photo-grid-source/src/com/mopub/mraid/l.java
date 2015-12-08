// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import java.net.URI;

// Referenced classes of package com.mopub.mraid:
//            MraidController, h, MraidBridge, ag

final class l
    implements MraidBridge.MraidBridgeListener
{

    final MraidController a;

    l(MraidController mraidcontroller)
    {
        a = mraidcontroller;
        super();
    }

    public final void onClose()
    {
        a.d();
    }

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        return a.a(consolemessage);
    }

    public final void onExpand(URI uri, boolean flag)
    {
    }

    public final boolean onJsAlert(String s, JsResult jsresult)
    {
        return a.a(s, jsresult);
    }

    public final void onOpen(URI uri)
    {
        a.b(uri.toString());
    }

    public final void onPageFailedToLoad()
    {
    }

    public final void onPageLoaded()
    {
        a.b();
    }

    public final void onPlayVideo(URI uri)
    {
        a.a(uri.toString());
    }

    public final void onResize(int i, int j, int k, int i1, com.mopub.common.CloseableLayout.ClosePosition closeposition, boolean flag)
    {
        throw new h("Not allowed to resize from an expanded state");
    }

    public final void onSetOrientationProperties(boolean flag, ag ag)
    {
        a.a(flag, ag);
    }

    public final void onUseCustomClose(boolean flag)
    {
        a.a(flag);
    }

    public final void onVisibilityChanged(boolean flag)
    {
        MraidController.c(a).a(flag);
        MraidController.b(a).a(flag);
    }
}
