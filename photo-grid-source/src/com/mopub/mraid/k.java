// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import java.net.URI;

// Referenced classes of package com.mopub.mraid:
//            MraidController, MraidBridge, ag

final class k
    implements MraidBridge.MraidBridgeListener
{

    final MraidController a;

    k(MraidController mraidcontroller)
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
        a.a(uri, flag);
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
        if (MraidController.a(a) != null)
        {
            MraidController.a(a).onFailedToLoad();
        }
    }

    public final void onPageLoaded()
    {
        a.a();
    }

    public final void onPlayVideo(URI uri)
    {
        a.a(uri.toString());
    }

    public final void onResize(int i, int j, int l, int i1, com.mopub.common.CloseableLayout.ClosePosition closeposition, boolean flag)
    {
        a.a(i, j, l, i1, closeposition, flag);
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
        if (!MraidController.b(a).d())
        {
            MraidController.c(a).a(flag);
        }
    }
}
