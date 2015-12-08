// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientCallbackHelper, XWalkContentsClient

class this._cls0 extends Handler
{

    final XWalkContentsClientCallbackHelper this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("XWalkContentsClientCallbackHelper: unhandled message ").append(message.what).toString());

        case 1: // '\001'
            message = (String)message.obj;
            XWalkContentsClientCallbackHelper.access$000(XWalkContentsClientCallbackHelper.this).onLoadResource(message);
            return;

        case 2: // '\002'
            message = (String)message.obj;
            XWalkContentsClientCallbackHelper.access$000(XWalkContentsClientCallbackHelper.this).onPageStarted(message);
            return;

        case 3: // '\003'
            message = (wnloadInfo)message.obj;
            XWalkContentsClientCallbackHelper.access$000(XWalkContentsClientCallbackHelper.this).onDownloadStart(((wnloadInfo) (message)).mUrl, ((wnloadInfo) (message)).mUserAgent, ((wnloadInfo) (message)).mContentDisposition, ((wnloadInfo) (message)).mMimeType, ((wnloadInfo) (message)).mContentLength);
            return;

        case 4: // '\004'
            message = (ginRequestInfo)message.obj;
            XWalkContentsClientCallbackHelper.access$000(XWalkContentsClientCallbackHelper.this).onReceivedLoginRequest(((ginRequestInfo) (message)).mRealm, ((ginRequestInfo) (message)).mAccount, ((ginRequestInfo) (message)).mArgs);
            return;

        case 5: // '\005'
            message = (ReceivedErrorInfo)message.obj;
            XWalkContentsClientCallbackHelper.access$000(XWalkContentsClientCallbackHelper.this).onReceivedError(((ReceivedErrorInfo) (message)).mErrorCode, ((ReceivedErrorInfo) (message)).mDescription, ((ReceivedErrorInfo) (message)).mFailingUrl);
            return;

        case 6: // '\006'
            message = (String)message.obj;
            break;
        }
        XWalkContentsClientCallbackHelper.access$000(XWalkContentsClientCallbackHelper.this).onResourceLoadStarted(message);
    }

    ReceivedErrorInfo(Looper looper)
    {
        this$0 = XWalkContentsClientCallbackHelper.this;
        super(looper);
    }
}
