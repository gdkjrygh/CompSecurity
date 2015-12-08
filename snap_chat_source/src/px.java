// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlRequestListener;
import org.chromium.net.UrlResponseInfo;

public final class px extends UrlRequestListener
{

    private static final int BUFFER_SIZE = 32768;
    public static final String TAG = "RequestListener";
    final Pb mBuffer;
    final pi.a mBuilder;
    private ByteArrayOutputStream mBytesReceived;
    long mContentLength;
    final CountDownLatch mLatch;
    private final pC mProgressListeners[];
    private WritableByteChannel mReceiveChannel;
    long mStartTime;
    long mTotalBytesRead;
    final String mUrl;

    public transient px(String s, pi.a a1, Pb pb, CountDownLatch countdownlatch, pC apc[])
    {
        mStartTime = 0L;
        mContentLength = 0L;
        mTotalBytesRead = 0L;
        mBytesReceived = new ByteArrayOutputStream();
        mReceiveChannel = Channels.newChannel(mBytesReceived);
        mUrl = s;
        mBuilder = a1;
        mBuffer = pb;
        mLatch = countdownlatch;
        mStartTime = System.currentTimeMillis();
        mProgressListeners = apc;
    }

    public final void a()
    {
        if (ReleaseManager.f())
        {
            Timber.c("RequestListener", "onSucceeded read %d bytes, url %s", new Object[] {
                Integer.valueOf(mBytesReceived.size()), mUrl
            });
        }
        mBuilder.mResponseBodySize = mBytesReceived.size();
        mBuffer.a(mBytesReceived.toByteArray());
        mBuilder.mResponseBuffer = mBuffer;
        mBuilder.mDuration = System.currentTimeMillis() - mStartTime;
        mLatch.countDown();
    }

    public final void a(UrlRequest urlrequest, String s)
    {
        if (ReleaseManager.f())
        {
            Timber.c("RequestListener", "onReceivedRedirect, old url %s new url %s", new Object[] {
                mUrl, s
            });
        }
        urlrequest.b();
    }

    public final void a(UrlRequest urlrequest, ByteBuffer bytebuffer)
    {
        pC apc[];
        int j;
        int k;
        j = bytebuffer.remaining();
        mTotalBytesRead = mTotalBytesRead + (long)j;
        mReceiveChannel.write(bytebuffer);
        apc = mProgressListeners;
        k = apc.length;
        int i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        apc[i].a(j, mContentLength);
        i++;
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        Timber.e("RequestListener", "IOException during ByteBuffer read. Details: ", new Object[] {
            ioexception
        });
_L1:
        bytebuffer.position(0);
        urlrequest.a(bytebuffer);
        return;
    }

    public final void a(UrlRequest urlrequest, UrlResponseInfo urlresponseinfo)
    {
        if (urlresponseinfo == null) goto _L2; else goto _L1
_L1:
        Object obj;
        mBuilder.mResponseCode = urlresponseinfo.a;
        mBuilder.mProtocol = urlresponseinfo.d;
        mBuilder.mResponseMessage = urlresponseinfo.b;
        obj = urlresponseinfo.a();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = (List)((Map) (obj)).get("Content-Length");
        if (obj == null || ((List) (obj)).isEmpty()) goto _L4; else goto _L5
_L5:
        long l = IJ.a(eR.a((String)((List) (obj)).get(0)));
_L7:
        mContentLength = l;
        mBuilder.mResponseCompressedSize = mContentLength;
        boolean flag = urlresponseinfo.c;
        if (ReleaseManager.f())
        {
            if (flag)
            {
                Timber.c("RequestListener", "% the result is cached", new Object[0]);
            }
            Timber.c("RequestListener", "Response Started, url %s content length %d", new Object[] {
                mUrl, Long.valueOf(mContentLength)
            });
        }
        mBuilder.mIsLocallyCached = flag;
        mBuilder.mFirstByteDuration = System.currentTimeMillis() - mStartTime;
        urlresponseinfo = new po(urlresponseinfo.a());
        mBuilder.mResponseHeaders = urlresponseinfo;
        String s = UUID.randomUUID().toString();
        pi.a a1 = mBuilder;
        if (urlresponseinfo.a("Age") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.mIsCached = flag;
        mBuilder.mRequestId = s;
_L2:
        urlrequest.a(ByteBuffer.allocateDirect(32768));
        return;
_L4:
        l = 0L;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(UrlResponseInfo urlresponseinfo, UrlRequestException urlrequestexception)
    {
        if (ReleaseManager.f())
        {
            Timber.e("RequestListener", "Request failed. %s, url %s", new Object[] {
                urlrequestexception.getMessage(), mUrl
            });
        }
        mBuilder.mDuration = System.currentTimeMillis() - mStartTime;
        if (mTotalBytesRead > 0L)
        {
            mBuilder.mPartialReceivedBytesSize = mTotalBytesRead;
        }
        mBuilder.mCaughtException = urlrequestexception;
        if (urlresponseinfo != null && !TextUtils.isEmpty(urlresponseinfo.d))
        {
            mBuilder.mProtocol = urlresponseinfo.d;
        }
        mLatch.countDown();
    }
}
