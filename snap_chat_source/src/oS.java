// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.api2.framework.HttpMethod;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class oS
{
    public static interface a
    {

        public abstract void onJsonResult(Object obj, pi pi1);
    }

    public static final class b
    {

        final a mCallback;
        final Class mClass;

        b(Class class1, a a1)
        {
            mClass = class1;
            mCallback = a1;
        }
    }

    public static interface c
    {

        public abstract void a(Object obj, pi pi1);
    }

    public static final class d
    {

        final c mCallback;
        final Object mInstance;

        d(c c1, Object obj)
        {
            mCallback = c1;
            mInstance = obj;
        }
    }


    public static final String CONTENT_LENGTH = "Content-Length";
    private static final int DEFAULT_RESPONSE_SIZE = 1024;
    protected static final String DESERIALIZATION_TIMED_METRIC_NAME = "DESERIALIZATION_TIMED";
    protected static final String FORMAT_PARAM = "format";
    public static final int LARGE_RESPONSE_SIZE = 10240;
    protected static final String LENGTH_PARAM = "length";
    public static final int MAX_DISCOVER_SHARE_BLOB_SIZE = 0x500000;
    public static final int MAX_UPLOAD_BLOB_SIZE = 0x280000;
    protected static Set MEDIA_BLOB_DOWNLOAD_REQUESTS_PATH = eg.a("/bq/story_blob", "/bq/auth_story_blobs", "/bq/chat_media", "/discover/dsnaps", "/ph/blob");
    public static final int NO_RESPONSE_STATUSCODE = -1;
    protected static final String PATH_PARAM = "path";
    private static final String TAG = "HyperRequest";
    protected static AtomicInteger sConcurrentMediaRequests = new AtomicInteger(0);
    protected static AtomicInteger sConcurrentRequests = new AtomicInteger(0);
    protected final Cc mBandwidthEstimator = Cc.a();
    public final Iu mGsonWrapper;
    protected boolean mIsMediaBlobDownloadRequest;
    protected List mJsonCallbacks;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mMetricFactory;
    protected List mProtoBufCallbacks;
    public final oT mProvider = new oT();
    public final UUID mUUID = UUID.randomUUID();

    protected oS()
    {
        mIsMediaBlobDownloadRequest = false;
        mJsonCallbacks = new ArrayList();
        mProtoBufCallbacks = new ArrayList();
        mGsonWrapper = mProvider.c();
        mMetricFactory = mProvider.d();
    }

    public static Qd buildAuthPayload(Qd qd)
    {
        String s = String.valueOf(System.currentTimeMillis());
        qd.timestamp = s;
        qd.reqToken = mA.a(s);
        qd.username = Bt.q();
        return qd;
    }

    public static Qd buildStaticAuthPayload(Qd qd)
    {
        String s = String.valueOf(System.currentTimeMillis());
        qd.timestamp = s;
        qd.reqToken = mA.b(s);
        if (TextUtils.isEmpty(qd.username) && !TextUtils.isEmpty(Bt.q()))
        {
            qd.username = Bt.q();
        }
        return qd;
    }

    private void reportDeserializationTimed(EasyMetric easymetric, String s, String s1, int i)
    {
        if (easymetric != null)
        {
            easymetric.a("path", s).a("length", Integer.valueOf(i)).a("format", s1).b(false);
        }
    }

    public EasyMetric addAdditionalParams(EasyMetric easymetric)
    {
        return easymetric;
    }

    public boolean allowDuplicateRequests()
    {
        return true;
    }

    protected final void callJsonCallback(b b1, pi pi1)
    {
        Object obj = null;
        if (pi1.mCaughtException == null)
        {
            obj = pi1.d();
            obj = deserializeJson(b1.mClass, ((String) (obj)), pi1.mPath);
        }
        b1.mCallback.onJsonResult(obj, pi1);
    }

    protected void callProtoBufCallback(d d1, pi pi1)
    {
        Object obj = null;
        fo fo1 = obj;
        if (pi1.mCaughtException == null)
        {
            Pb pb = pi1.mBuffer;
            fo1 = obj;
            if (pb != null)
            {
                fo1 = obj;
                if (pb.a() > 0)
                {
                    fo1 = deserializeProto(Arrays.copyOf(pb.b(), pb.a()), (fo)d1.mInstance, pi1.mPath);
                }
            }
        }
        d1.mCallback.a(fo1, pi1);
    }

    public final Object deserializeJson(Class class1, String s, String s1)
    {
        EasyMetric easymetric = null;
        int i;
        if (TextUtils.isEmpty(s))
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        if (i > 10240)
        {
            easymetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DESERIALIZATION_TIMED").b();
        }
        class1 = ((Class) (mGsonWrapper.a(s, class1)));
        reportDeserializationTimed(easymetric, s1, "JSON", i);
        return class1;
    }

    public fo deserializeProto(byte abyte0[], fo fo1, String s)
    {
        Object obj = null;
        Object obj1 = null;
        if (abyte0 != null)
        {
            int i = abyte0.length;
            if (i > 10240)
            {
                obj = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DESERIALIZATION_TIMED").b();
            } else
            {
                obj = null;
            }
            try
            {
                abyte0 = fo.a(fo1, abyte0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Timber.e("HyperRequest", (new StringBuilder("Fail to parse protoBuf bytes ")).append(abyte0.getMessage()).toString(), new Object[0]);
                abyte0 = obj1;
            }
            reportDeserializationTimed(((EasyMetric) (obj)), s, "PROTO", i);
            obj = abyte0;
        }
        return ((fo) (obj));
    }

    public Map getHeaders(pn pn)
    {
        pn = new TreeMap();
        if (ReleaseManager.f())
        {
            pn.put("X-Snapchat-UUID", Pj.c());
        }
        pn.put("User-Agent", Pj.a());
        pn.put("Accept-Language", Pj.b());
        pn.put("Accept-Locale", Locale.getDefault().toString());
        return pn;
    }

    public final List getJsonCallbacks()
    {
        return mJsonCallbacks;
    }

    public HttpMethod getMethod()
    {
        return HttpMethod.POST;
    }

    public com.snapchat.android.networkmanager.NetworkManager.Priority getPriority()
    {
        return com.snapchat.android.networkmanager.NetworkManager.Priority.NORMAL;
    }

    public abstract pn getRequestPayload();

    public String getRequestTag()
    {
        if (!allowDuplicateRequests())
        {
            return getUrl();
        } else
        {
            return mUUID.toString();
        }
    }

    public Pb getResponseBuffer()
    {
        return new Pc(1024, new Pc.b());
    }

    public abstract String getUrl();

    public void logNetworkRequest(pi pi1)
    {
        EasyMetric easymetric = (new EasyMetric("ENDPOINT_REQUEST")).a("reachability", pi1.mNetworkType).a("endpoint", pi1.mPath).a("host", pi1.a()).a("con_requests", Integer.valueOf(sConcurrentRequests.get())).a("bw_est", Long.valueOf(mBandwidthEstimator.b())).a("first_bytes_latency", Long.valueOf(pi1.mFirstByteDuration)).a("total_latency", Long.valueOf(pi1.mDuration)).a("status_code", Integer.valueOf(pi1.mResponseCode)).a("first_bytes_size", Long.valueOf(pi1.mFirstByteSize)).a("request_size_bytes", Long.valueOf(pi1.mRequestBodySize)).a("return_size_bytes", Long.valueOf(pi1.mResponseBodySize)).a("compressed_size_bytes", Long.valueOf(pi1.mResponseCompressedSize)).a("Hit_Cache", Boolean.valueOf(pi1.mIsCached)).a("hit_local_cache", Boolean.valueOf(pi1.mIsLocallyCached)).a("protocol", pi1.mProtocol).a("requestId", pi1.mRequestId).d();
        if (mIsMediaBlobDownloadRequest)
        {
            easymetric.a("con_media_requests", Integer.valueOf(sConcurrentMediaRequests.get()));
        }
        if (pi1.mPartialReceivedSize > 0L)
        {
            easymetric.a("partial_bytes", Long.valueOf(pi1.mPartialReceivedSize));
        }
        if (pi1.mRequestCompressedSize > 0L)
        {
            easymetric.a("compressed_request_size_bytes", Long.valueOf(pi1.mRequestCompressedSize));
        }
        String s = pi1.mInterface;
        if (s != null)
        {
            easymetric.a("interface", s);
            if (pi1.mCaughtException != null)
            {
                s = pi1.mCaughtException.getMessage();
                if (!TextUtils.isEmpty(s))
                {
                    easymetric.a("exception", s);
                }
            }
        }
        s = pi1.mNetworkException;
        if (s != null)
        {
            easymetric.a("migration_exception", s);
        }
        addAdditionalParams(easymetric);
        pi1 = pi1.mPingResultFuture;
        if (pi1 != null)
        {
            if (pi1 != null)
            {
                PG.b(new pA._cls1(pi1, easymetric));
            }
            return;
        } else
        {
            easymetric.b(false);
            return;
        }
    }

    public void onResult(pi pi1)
    {
        String s = pi1.a("Content-Type");
        boolean flag;
        if (s != null && s.contains("application/x-protobuffer"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            for (Iterator iterator = mProtoBufCallbacks.iterator(); iterator.hasNext(); callProtoBufCallback((d)iterator.next(), pi1)) { }
        } else
        {
            for (Iterator iterator1 = mJsonCallbacks.iterator(); iterator1.hasNext(); callJsonCallback((b)iterator1.next(), pi1)) { }
        }
    }

    public final void registerCallback(Class class1, a a1)
    {
        mJsonCallbacks.add(new b(class1, a1));
    }

    public final void registerProtoBufCallback(c c1, fo fo1)
    {
        mProtoBufCallbacks.add(new d(c1, fo1));
    }

    public boolean shouldUseProtoBuf()
    {
        return false;
    }

}
