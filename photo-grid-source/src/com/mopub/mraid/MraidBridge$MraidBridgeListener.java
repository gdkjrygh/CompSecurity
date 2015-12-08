// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import java.net.URI;

// Referenced classes of package com.mopub.mraid:
//            ag

public interface 
{

    public abstract void onClose();

    public abstract boolean onConsoleMessage(ConsoleMessage consolemessage);

    public abstract void onExpand(URI uri, boolean flag);

    public abstract boolean onJsAlert(String s, JsResult jsresult);

    public abstract void onOpen(URI uri);

    public abstract void onPageFailedToLoad();

    public abstract void onPageLoaded();

    public abstract void onPlayVideo(URI uri);

    public abstract void onResize(int i, int j, int k, int l, com.mopub.common. , boolean flag);

    public abstract void onSetOrientationProperties(boolean flag, ag ag);

    public abstract void onUseCustomClose(boolean flag);

    public abstract void onVisibilityChanged(boolean flag);
}
