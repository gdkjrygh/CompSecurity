// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.webkit.WebView;

// Referenced classes of package com.amazon.device.associates:
//            OpenRetailPageRequest

public interface LinkService
{

    public abstract void openRetailPage(OpenRetailPageRequest openretailpagerequest);

    public abstract boolean overrideLinkInvocation(WebView webview, String s);
}
