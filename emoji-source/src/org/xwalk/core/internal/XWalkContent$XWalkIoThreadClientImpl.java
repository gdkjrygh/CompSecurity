// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.webkit.WebResourceResponse;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsIoThreadClient, XWalkContent, XWalkSettings, XWalkContentsClientBridge, 
//            XWalkContentsClientCallbackHelper, InterceptedRequestData

private class <init>
    implements XWalkContentsIoThreadClient
{

    final XWalkContent this$0;

    public int getCacheMode()
    {
        return XWalkContent.access$300(XWalkContent.this).getCacheMode();
    }

    public void newLoginRequest(String s, String s1, String s2)
    {
        XWalkContent.access$400(XWalkContent.this).getCallbackHelper().postOnReceivedLoginRequest(s, s1, s2);
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        XWalkContent.access$400(XWalkContent.this).getCallbackHelper().postOnDownloadStart(s, s1, s2, s3, l);
    }

    public boolean shouldBlockContentUrls()
    {
        return !XWalkContent.access$300(XWalkContent.this).getAllowContentAccess();
    }

    public boolean shouldBlockFileUrls()
    {
        return !XWalkContent.access$300(XWalkContent.this).getAllowFileAccess();
    }

    public boolean shouldBlockNetworkLoads()
    {
        return XWalkContent.access$300(XWalkContent.this).getBlockNetworkLoads();
    }

    public InterceptedRequestData shouldInterceptRequest(String s, boolean flag)
    {
        XWalkContent.access$400(XWalkContent.this).getCallbackHelper().postOnResourceLoadStarted(s);
        WebResourceResponse webresourceresponse = XWalkContent.access$400(XWalkContent.this).shouldInterceptRequest(s);
        if (webresourceresponse == null)
        {
            XWalkContent.access$400(XWalkContent.this).getCallbackHelper().postOnLoadResource(s);
            return null;
        }
        if (flag && webresourceresponse.getData() == null)
        {
            XWalkContent.access$400(XWalkContent.this).getCallbackHelper().postOnReceivedError(-1, null, s);
        }
        return new InterceptedRequestData(webresourceresponse.getMimeType(), webresourceresponse.getEncoding(), webresourceresponse.getData());
    }

    private ()
    {
        this$0 = XWalkContent.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
