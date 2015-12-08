// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            DownloadInfo

public static class mPercentCompleted
{

    static final boolean $assertionsDisabled;
    private String mContentDisposition;
    private long mContentLength;
    private String mCookie;
    private String mDescription;
    private int mDownloadId;
    private String mFileName;
    private String mFilePath;
    private boolean mHasDownloadId;
    private boolean mHasUserGesture;
    private boolean mIsGETRequest;
    private boolean mIsSuccessful;
    private String mMimeType;
    private int mPercentCompleted;
    private String mReferer;
    private long mTimeRemainingInMillis;
    private String mUrl;
    private String mUserAgent;

    public static mPercentCompleted fromDownloadInfo(DownloadInfo downloadinfo)
    {
        mPercentCompleted mpercentcompleted = new <init>();
        mpercentcompleted.setUrl(downloadinfo.getUrl()).setUserAgent(downloadinfo.getUserAgent()).setMimeType(downloadinfo.getMimeType()).setCookie(downloadinfo.getCookie()).setFileName(downloadinfo.getFileName()).setDescription(downloadinfo.getDescription()).setFilePath(downloadinfo.getFilePath()).setReferer(downloadinfo.getReferer()).setContentLength(downloadinfo.getContentLength()).setHasDownloadId(downloadinfo.hasDownloadId()).setDownloadId(downloadinfo.getDownloadId()).setHasUserGesture(downloadinfo.hasUserGesture()).setContentDisposition(downloadinfo.getContentDisposition()).setIsGETRequest(downloadinfo.isGETRequest()).setIsSuccessful(downloadinfo.isSuccessful()).setPercentCompleted(downloadinfo.getPercentCompleted()).setTimeRemainingInMillis(downloadinfo.getTimeRemainingInMillis());
        return mpercentcompleted;
    }

    public DownloadInfo build()
    {
        return new DownloadInfo(this, null);
    }

    public emainingInMillis setContentDisposition(String s)
    {
        mContentDisposition = s;
        return this;
    }

    public mContentDisposition setContentLength(long l)
    {
        mContentLength = l;
        return this;
    }

    public mContentLength setCookie(String s)
    {
        mCookie = s;
        return this;
    }

    public mCookie setDescription(String s)
    {
        mDescription = s;
        return this;
    }

    public mDescription setDownloadId(int i)
    {
        mDownloadId = i;
        return this;
    }

    public mDownloadId setFileName(String s)
    {
        mFileName = s;
        return this;
    }

    public mFileName setFilePath(String s)
    {
        mFilePath = s;
        return this;
    }

    public mFilePath setHasDownloadId(boolean flag)
    {
        mHasDownloadId = flag;
        return this;
    }

    public mHasDownloadId setHasUserGesture(boolean flag)
    {
        mHasUserGesture = flag;
        return this;
    }

    public mHasUserGesture setIsGETRequest(boolean flag)
    {
        mIsGETRequest = flag;
        return this;
    }

    public mIsGETRequest setIsSuccessful(boolean flag)
    {
        mIsSuccessful = flag;
        return this;
    }

    public mIsSuccessful setMimeType(String s)
    {
        mMimeType = s;
        return this;
    }

    public mMimeType setPercentCompleted(int i)
    {
        if (!$assertionsDisabled && i > 100)
        {
            throw new AssertionError();
        } else
        {
            mPercentCompleted = i;
            return this;
        }
    }

    public mPercentCompleted setReferer(String s)
    {
        mReferer = s;
        return this;
    }

    public mReferer setTimeRemainingInMillis(long l)
    {
        mTimeRemainingInMillis = l;
        return this;
    }

    public mTimeRemainingInMillis setUrl(String s)
    {
        mUrl = s;
        return this;
    }

    public mUrl setUserAgent(String s)
    {
        mUserAgent = s;
        return this;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/DownloadInfo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


















    public ()
    {
        mPercentCompleted = -1;
    }
}
