// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.Future;

public final class pi
{
    public static final class a
    {

        public Exception mCaughtException;
        public long mDuration;
        public long mFirstByteDuration;
        long mFirstByteSize;
        private String mInterface;
        public boolean mIsCached;
        boolean mIsCanceled;
        public boolean mIsLocallyCached;
        String mNetworkException;
        private final String mNetworkType;
        public long mPartialReceivedBytesSize;
        public Future mPingResultFuture;
        public String mProtocol;
        long mRequestBodySize;
        long mRequestCompressedSize;
        public String mRequestId;
        public long mResponseBodySize;
        public Pb mResponseBuffer;
        public int mResponseCode;
        public long mResponseCompressedSize;
        public po mResponseHeaders;
        public String mResponseMessage;
        private final String mUrl;

        public final pi a()
        {
            return new pi(mUrl, mNetworkType, mResponseCode, mResponseMessage, mResponseBuffer, mResponseHeaders, mRequestId, mCaughtException, mResponseBodySize, mDuration, mFirstByteDuration, mRequestBodySize, mResponseCompressedSize, mRequestCompressedSize, mPartialReceivedBytesSize, mProtocol, mIsCached, mIsLocallyCached, mFirstByteSize, mNetworkException, mIsCanceled, mPingResultFuture, mInterface, (byte)0);
        }

        public a(String s, String s1)
        {
            this(s, s1, null);
        }

        public a(String s, String s1, String s2)
        {
            mResponseCode = 0;
            mResponseHeaders = new po();
            mUrl = s;
            mNetworkType = s1;
            mInterface = s2;
        }

        private a(pi pi1)
        {
            mResponseCode = 0;
            mResponseHeaders = new po();
            mUrl = pi1.mUrl;
            mNetworkType = pi1.mNetworkType;
            mRequestId = pi1.mRequestId;
            mRequestBodySize = pi1.mRequestBodySize;
            mDuration = pi1.mDuration;
            mProtocol = pi1.mProtocol;
            mCaughtException = pi1.mCaughtException;
            mIsLocallyCached = pi1.mIsLocallyCached;
            mIsCached = pi1.mIsCached;
            mIsCanceled = pi1.mIsCanceled;
            mResponseCode = pi1.mResponseCode;
            mResponseBodySize = pi1.mResponseBodySize;
            mRequestCompressedSize = pi1.mRequestCompressedSize;
            mResponseCompressedSize = pi1.mResponseCompressedSize;
            mPartialReceivedBytesSize = pi1.mPartialReceivedSize;
            mResponseMessage = pi1.mResponseMessage;
            mResponseBuffer = pi1.mBuffer;
            mResponseHeaders = pi1.mResponseHeaders;
            mNetworkException = pi1.mNetworkException;
            mPingResultFuture = pi1.mPingResultFuture;
            mFirstByteDuration = pi1.mFirstByteDuration;
            mFirstByteSize = pi1.mFirstByteSize;
            mInterface = pi1.mInterface;
        }

        public a(pi pi1, byte byte0)
        {
            this(pi1);
        }
    }


    public static final String APPLICATION_PROTO_BUF = "application/x-protobuffer";
    public static final String APPLICATION_ZIP = "application/zip";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final int NO_RESPONSE_STATUS_CODE = 0;
    public final Pb mBuffer;
    public final Exception mCaughtException;
    public final long mDuration;
    public final long mFirstByteDuration;
    final long mFirstByteSize;
    String mInterface;
    final boolean mIsCached;
    final boolean mIsCanceled;
    final boolean mIsLocallyCached;
    public final String mNetworkException;
    public final String mNetworkType;
    final long mPartialReceivedSize;
    String mPath;
    final Future mPingResultFuture;
    final String mProtocol;
    final long mRequestBodySize;
    final long mRequestCompressedSize;
    public final String mRequestId;
    public final long mResponseBodySize;
    public final int mResponseCode;
    final long mResponseCompressedSize;
    public final po mResponseHeaders;
    public final String mResponseMessage;
    final String mUrl;

    public pi()
    {
        this(null, "", 400, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, "", false, false, 0L, null, false, null, null);
    }

    private pi(String s, String s1, int i, String s2, Pb pb, po po1, String s3, 
            Exception exception, long l, long l1, long l2, 
            long l3, long l4, long l5, long l6, String s4, boolean flag, boolean flag1, long l7, String s5, 
            boolean flag2, Future future, String s6)
    {
        mPath = null;
        mUrl = s;
        mNetworkType = s1;
        mResponseCode = i;
        if (mResponseCode == 500 && TextUtils.isEmpty(s2))
        {
            mResponseMessage = IC.a(null, 0x7f08015d, new Object[0]);
        } else
        {
            mResponseMessage = s2;
        }
        try
        {
            mPath = (new URL(mUrl)).getPath();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mPath = "";
        }
        mBuffer = pb;
        mRequestId = s3;
        mResponseHeaders = po1;
        mCaughtException = exception;
        mResponseBodySize = l;
        mResponseCompressedSize = l4;
        mRequestCompressedSize = l5;
        mPartialReceivedSize = l6;
        mDuration = l1;
        mFirstByteDuration = l2;
        mRequestBodySize = l3;
        mProtocol = s4;
        mIsCached = flag;
        mIsLocallyCached = flag1;
        mFirstByteSize = l7;
        mNetworkException = s5;
        mIsCanceled = flag2;
        mPingResultFuture = future;
        mInterface = s6;
    }

    pi(String s, String s1, int i, String s2, Pb pb, po po1, String s3, 
            Exception exception, long l, long l1, long l2, 
            long l3, long l4, long l5, long l6, String s4, boolean flag, boolean flag1, long l7, String s5, 
            boolean flag2, Future future, String s6, byte byte0)
    {
        this(s, s1, i, s2, pb, po1, s3, exception, l, l1, l2, l3, l4, l5, l6, s4, flag, flag1, l7, s5, flag2, future, s6);
    }

    public final String a()
    {
        String s;
        try
        {
            s = (new URL(mUrl)).getHost();
        }
        catch (MalformedURLException malformedurlexception)
        {
            return "";
        }
        return s;
    }

    public final String a(String s)
    {
        if (mResponseHeaders == null)
        {
            return null;
        } else
        {
            return mResponseHeaders.a(s);
        }
    }

    public final int b()
    {
        if (mBuffer != null)
        {
            return mBuffer.a();
        } else
        {
            return 0;
        }
    }

    public final boolean c()
    {
        return mCaughtException == null && Iw.a(mResponseCode);
    }

    public final String d()
    {
        if (mBuffer != null)
        {
            return new String(mBuffer.b(), 0, mBuffer.a(), Charset.defaultCharset());
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        if (c())
        {
            return String.format("[Success (%s bytes)]", new Object[] {
                Integer.valueOf(b())
            });
        }
        if (mCaughtException != null)
        {
            return String.format("[Failed %s]", new Object[] {
                mCaughtException
            });
        }
        if (mResponseCode != 0)
        {
            return String.format("[Failed HTTP %d]", new Object[] {
                Integer.valueOf(mResponseCode)
            });
        } else
        {
            return "[Failed unknown]";
        }
    }
}
