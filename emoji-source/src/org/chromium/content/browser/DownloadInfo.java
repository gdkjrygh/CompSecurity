// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


public final class DownloadInfo
{
    public static class Builder
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

        public static Builder fromDownloadInfo(DownloadInfo downloadinfo)
        {
            Builder builder = new Builder();
            builder.setUrl(downloadinfo.getUrl()).setUserAgent(downloadinfo.getUserAgent()).setMimeType(downloadinfo.getMimeType()).setCookie(downloadinfo.getCookie()).setFileName(downloadinfo.getFileName()).setDescription(downloadinfo.getDescription()).setFilePath(downloadinfo.getFilePath()).setReferer(downloadinfo.getReferer()).setContentLength(downloadinfo.getContentLength()).setHasDownloadId(downloadinfo.hasDownloadId()).setDownloadId(downloadinfo.getDownloadId()).setHasUserGesture(downloadinfo.hasUserGesture()).setContentDisposition(downloadinfo.getContentDisposition()).setIsGETRequest(downloadinfo.isGETRequest()).setIsSuccessful(downloadinfo.isSuccessful()).setPercentCompleted(downloadinfo.getPercentCompleted()).setTimeRemainingInMillis(downloadinfo.getTimeRemainingInMillis());
            return builder;
        }

        public DownloadInfo build()
        {
            return new DownloadInfo(this);
        }

        public Builder setContentDisposition(String s)
        {
            mContentDisposition = s;
            return this;
        }

        public Builder setContentLength(long l)
        {
            mContentLength = l;
            return this;
        }

        public Builder setCookie(String s)
        {
            mCookie = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            mDescription = s;
            return this;
        }

        public Builder setDownloadId(int i)
        {
            mDownloadId = i;
            return this;
        }

        public Builder setFileName(String s)
        {
            mFileName = s;
            return this;
        }

        public Builder setFilePath(String s)
        {
            mFilePath = s;
            return this;
        }

        public Builder setHasDownloadId(boolean flag)
        {
            mHasDownloadId = flag;
            return this;
        }

        public Builder setHasUserGesture(boolean flag)
        {
            mHasUserGesture = flag;
            return this;
        }

        public Builder setIsGETRequest(boolean flag)
        {
            mIsGETRequest = flag;
            return this;
        }

        public Builder setIsSuccessful(boolean flag)
        {
            mIsSuccessful = flag;
            return this;
        }

        public Builder setMimeType(String s)
        {
            mMimeType = s;
            return this;
        }

        public Builder setPercentCompleted(int i)
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

        public Builder setReferer(String s)
        {
            mReferer = s;
            return this;
        }

        public Builder setTimeRemainingInMillis(long l)
        {
            mTimeRemainingInMillis = l;
            return this;
        }

        public Builder setUrl(String s)
        {
            mUrl = s;
            return this;
        }

        public Builder setUserAgent(String s)
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


















        public Builder()
        {
            mPercentCompleted = -1;
        }
    }


    private final String mContentDisposition;
    private final long mContentLength;
    private final String mCookie;
    private final String mDescription;
    private final int mDownloadId;
    private final String mFileName;
    private final String mFilePath;
    private final boolean mHasDownloadId;
    private final boolean mHasUserGesture;
    private final boolean mIsGETRequest;
    private final boolean mIsSuccessful;
    private final String mMimeType;
    private final int mPercentCompleted;
    private final String mReferer;
    private final long mTimeRemainingInMillis;
    private final String mUrl;
    private final String mUserAgent;

    private DownloadInfo(Builder builder)
    {
        mUrl = builder.mUrl;
        mUserAgent = builder.mUserAgent;
        mMimeType = builder.mMimeType;
        mCookie = builder.mCookie;
        mFileName = builder.mFileName;
        mDescription = builder.mDescription;
        mFilePath = builder.mFilePath;
        mReferer = builder.mReferer;
        mContentLength = builder.mContentLength;
        mHasDownloadId = builder.mHasDownloadId;
        mDownloadId = builder.mDownloadId;
        mHasUserGesture = builder.mHasUserGesture;
        mIsSuccessful = builder.mIsSuccessful;
        mIsGETRequest = builder.mIsGETRequest;
        mContentDisposition = builder.mContentDisposition;
        mPercentCompleted = builder.mPercentCompleted;
        mTimeRemainingInMillis = builder.mTimeRemainingInMillis;
    }


    public String getContentDisposition()
    {
        return mContentDisposition;
    }

    public long getContentLength()
    {
        return mContentLength;
    }

    public String getCookie()
    {
        return mCookie;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public int getDownloadId()
    {
        return mDownloadId;
    }

    public String getFileName()
    {
        return mFileName;
    }

    public String getFilePath()
    {
        return mFilePath;
    }

    public String getMimeType()
    {
        return mMimeType;
    }

    public int getPercentCompleted()
    {
        return mPercentCompleted;
    }

    public String getReferer()
    {
        return mReferer;
    }

    public long getTimeRemainingInMillis()
    {
        return mTimeRemainingInMillis;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public String getUserAgent()
    {
        return mUserAgent;
    }

    public boolean hasDownloadId()
    {
        return mHasDownloadId;
    }

    public boolean hasUserGesture()
    {
        return mHasUserGesture;
    }

    public boolean isGETRequest()
    {
        return mIsGETRequest;
    }

    public boolean isSuccessful()
    {
        return mIsSuccessful;
    }
}
