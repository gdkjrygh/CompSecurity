// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.view.View;
import org.chromium.content.browser.ContentVideoViewClient;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, XWalkContentsClient

class XWalkContentVideoViewClient
    implements ContentVideoViewClient
{

    private Activity mActivity;
    private XWalkContentsClient mContentsClient;
    private XWalkViewInternal mView;

    public XWalkContentVideoViewClient(XWalkContentsClient xwalkcontentsclient, Activity activity, XWalkViewInternal xwalkviewinternal)
    {
        mContentsClient = xwalkcontentsclient;
        mActivity = activity;
        mView = xwalkviewinternal;
    }

    public View getVideoLoadingProgressView()
    {
        return null;
    }

    public void onDestroyContentVideoView()
    {
        mView.setOverlayVideoMode(false);
        mContentsClient.onHideCustomView();
    }

    public boolean onShowCustomView(View view)
    {
        mView.setOverlayVideoMode(true);
        XWalkWebChromeClient.CustomViewCallback customviewcallback = new XWalkWebChromeClient.CustomViewCallback() {

            final XWalkContentVideoViewClient this$0;

            public void onCustomViewHidden()
            {
            }

            
            {
                this$0 = XWalkContentVideoViewClient.this;
                super();
            }
        };
        mContentsClient.onShowCustomView(view, customviewcallback);
        return true;
    }
}
