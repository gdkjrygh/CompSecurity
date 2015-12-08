// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode, BaseHtmlWebView

public interface HtmlWebViewListener
{

    public abstract void onClicked();

    public abstract void onCollapsed();

    public abstract void onFailed(MoPubErrorCode mopuberrorcode);

    public abstract void onLoaded(BaseHtmlWebView basehtmlwebview);
}
