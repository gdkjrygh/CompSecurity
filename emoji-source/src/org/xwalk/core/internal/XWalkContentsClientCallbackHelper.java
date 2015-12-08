// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClient

class XWalkContentsClientCallbackHelper
{
    private static class DownloadInfo
    {

        final String mContentDisposition;
        final long mContentLength;
        final String mMimeType;
        final String mUrl;
        final String mUserAgent;

        DownloadInfo(String s, String s1, String s2, String s3, long l)
        {
            mUrl = s;
            mUserAgent = s1;
            mContentDisposition = s2;
            mMimeType = s3;
            mContentLength = l;
        }
    }

    private static class LoginRequestInfo
    {

        final String mAccount;
        final String mArgs;
        final String mRealm;

        LoginRequestInfo(String s, String s1, String s2)
        {
            mRealm = s;
            mAccount = s1;
            mArgs = s2;
        }
    }

    private static class OnReceivedErrorInfo
    {

        final String mDescription;
        final int mErrorCode;
        final String mFailingUrl;

        OnReceivedErrorInfo(int i, String s, String s1)
        {
            mErrorCode = i;
            mDescription = s;
            mFailingUrl = s1;
        }
    }


    private static final int MSG_ON_DOWNLOAD_START = 3;
    private static final int MSG_ON_LOAD_RESOURCE = 1;
    private static final int MSG_ON_PAGE_STARTED = 2;
    private static final int MSG_ON_RECEIVED_ERROR = 5;
    private static final int MSG_ON_RECEIVED_LOGIN_REQUEST = 4;
    private static final int MSG_ON_RESOURCE_LOAD_STARTED = 6;
    private final XWalkContentsClient mContentsClient;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) {

        final XWalkContentsClientCallbackHelper this$0;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("XWalkContentsClientCallbackHelper: unhandled message ").append(message.what).toString());

            case 1: // '\001'
                message = (String)message.obj;
                mContentsClient.onLoadResource(message);
                return;

            case 2: // '\002'
                message = (String)message.obj;
                mContentsClient.onPageStarted(message);
                return;

            case 3: // '\003'
                message = (DownloadInfo)message.obj;
                mContentsClient.onDownloadStart(((DownloadInfo) (message)).mUrl, ((DownloadInfo) (message)).mUserAgent, ((DownloadInfo) (message)).mContentDisposition, ((DownloadInfo) (message)).mMimeType, ((DownloadInfo) (message)).mContentLength);
                return;

            case 4: // '\004'
                message = (LoginRequestInfo)message.obj;
                mContentsClient.onReceivedLoginRequest(((LoginRequestInfo) (message)).mRealm, ((LoginRequestInfo) (message)).mAccount, ((LoginRequestInfo) (message)).mArgs);
                return;

            case 5: // '\005'
                message = (OnReceivedErrorInfo)message.obj;
                mContentsClient.onReceivedError(((OnReceivedErrorInfo) (message)).mErrorCode, ((OnReceivedErrorInfo) (message)).mDescription, ((OnReceivedErrorInfo) (message)).mFailingUrl);
                return;

            case 6: // '\006'
                message = (String)message.obj;
                break;
            }
            mContentsClient.onResourceLoadStarted(message);
        }

            
            {
                this$0 = XWalkContentsClientCallbackHelper.this;
                super(looper);
            }
    };

    public XWalkContentsClientCallbackHelper(XWalkContentsClient xwalkcontentsclient)
    {
        mContentsClient = xwalkcontentsclient;
    }

    public void postOnDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        s = new DownloadInfo(s, s1, s2, s3, l);
        mHandler.sendMessage(mHandler.obtainMessage(3, s));
    }

    public void postOnLoadResource(String s)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, s));
    }

    public void postOnPageStarted(String s)
    {
        mHandler.sendMessage(mHandler.obtainMessage(2, s));
    }

    public void postOnReceivedError(int i, String s, String s1)
    {
        s = new OnReceivedErrorInfo(i, s, s1);
        mHandler.sendMessage(mHandler.obtainMessage(5, s));
    }

    public void postOnReceivedLoginRequest(String s, String s1, String s2)
    {
        s = new LoginRequestInfo(s, s1, s2);
        mHandler.sendMessage(mHandler.obtainMessage(4, s));
    }

    public void postOnResourceLoadStarted(String s)
    {
        mHandler.sendMessage(mHandler.obtainMessage(6, s));
    }

}
