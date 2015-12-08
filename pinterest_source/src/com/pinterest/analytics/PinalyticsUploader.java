// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.common.async.IntervalRunner;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.CollectionUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.EventBatch;
import java.io.File;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.TByteArrayOutputStream;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

// Referenced classes of package com.pinterest.analytics:
//            Pinalytics

public class PinalyticsUploader
{

    private static final String a;
    private static final String b;
    private static PinalyticsUploader c;
    private com.pinterest.common.async.IntervalRunner.IntervalCallback d;
    private byte e[];
    private File f;
    private final BaseApiResponseHandler g = new _cls2();

    public PinalyticsUploader()
    {
        d = new _cls1();
    }

    public static PinalyticsUploader a()
    {
        if (c == null)
        {
            PinalyticsUploader pinalyticsuploader = new PinalyticsUploader();
            c = pinalyticsuploader;
            pinalyticsuploader.e();
        }
        return c;
    }

    static void a(PinalyticsUploader pinalyticsuploader)
    {
        PinalyticsUploader pinalyticsuploader1 = c;
        pinalyticsuploader1;
        JVM INSTR monitorenter ;
        EventBatch eventbatch = Pinalytics.a();
        if (eventbatch == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        TByteArrayOutputStream tbytearrayoutputstream;
        TBinaryProtocol tbinaryprotocol;
        if (eventbatch.getEventsSize() <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        tbytearrayoutputstream = new TByteArrayOutputStream();
        tbinaryprotocol = new TBinaryProtocol(new TIOStreamTransport(tbytearrayoutputstream));
        eventbatch.setReportTime(System.currentTimeMillis() * 0xf4240L);
        eventbatch.write(tbinaryprotocol);
        pinalyticsuploader.e = tbytearrayoutputstream.toByteArray();
        PLog.log("PinalyticsUploader", "Using in memory events", new Object[0]);
_L1:
        if (pinalyticsuploader.e == null)
        {
            List list = DiskCache.getCacheFiles(a);
            if (CollectionUtils.isNotEmpty(list))
            {
                pinalyticsuploader.f = (File)list.get(0);
                pinalyticsuploader.e = DiskCache.getBytes((new StringBuilder()).append(a).append(pinalyticsuploader.f.getName()).toString());
                PLog.log("PinalyticsUploader", "Using cached events", new Object[0]);
            }
        }
        if (pinalyticsuploader.e == null)
        {
            PLog.log("PinalyticsUploader", "No events to submit", new Object[0]);
        }
        pinalyticsuploader1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        CrashReporting.a(exception);
        PLog.error(exception, "exception occurred", new Object[0]);
        PLog.log("PinalyticsUploader", (new StringBuilder("Submitting: FAILED! ")).append(exception.toString()).toString(), new Object[0]);
          goto _L1
        pinalyticsuploader;
        pinalyticsuploader1;
        JVM INSTR monitorexit ;
        throw pinalyticsuploader;
    }

    static void a(ApiResponse apiresponse)
    {
        if (ApplicationInfo.isNonProduction())
        {
            PinterestJsonObject pinterestjsonobject = apiresponse.getDeveloperError();
            if (pinterestjsonobject != null)
            {
                String s = pinterestjsonobject.a("message", "");
                apiresponse = s;
                if (StringUtils.isBlank(s))
                {
                    apiresponse = String.valueOf(pinterestjsonobject);
                }
                apiresponse = (new StringBuilder()).append("ContextAPI: ").append(String.valueOf(apiresponse)).toString();
            } else
            {
                apiresponse = (new StringBuilder()).append("ContextAPI: ").append("Failure! See logs for details.").toString();
            }
            Application.showDebugErrorToast(apiresponse);
        }
    }

    static PinalyticsUploader b()
    {
        return c;
    }

    static void b(PinalyticsUploader pinalyticsuploader)
    {
label0:
        {
            IntervalRunner.instance().removeCallback(pinalyticsuploader.d);
            synchronized (c)
            {
                if (pinalyticsuploader.e == null)
                {
                    break label0;
                }
                AnalyticsApi.a(pinalyticsuploader.e, pinalyticsuploader.g);
                PLog.log("PinalyticsUploader", "Submitting: payload weighs %.2fk.", new Object[] {
                    Float.valueOf((float)pinalyticsuploader.e.length / 1000F)
                });
            }
            return;
        }
        pinalyticsuploader1;
        JVM INSTR monitorexit ;
        pinalyticsuploader.e();
        return;
        pinalyticsuploader;
        pinalyticsuploader1;
        JVM INSTR monitorexit ;
        throw pinalyticsuploader;
    }

    static File c(PinalyticsUploader pinalyticsuploader)
    {
        return pinalyticsuploader.f;
    }

    static String c()
    {
        return b;
    }

    static String d()
    {
        return a;
    }

    static void d(PinalyticsUploader pinalyticsuploader)
    {
        pinalyticsuploader.e();
    }

    private void e()
    {
        synchronized (c)
        {
            e = null;
            f = null;
        }
        IntervalRunner.instance().addCallback(d);
        return;
        exception;
        pinalyticsuploader;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static byte[] e(PinalyticsUploader pinalyticsuploader)
    {
        return pinalyticsuploader.e;
    }

    static 
    {
        a = (new StringBuilder("Pinalytics")).append(File.separator).toString();
        b = (new StringBuilder()).append(a).append("payload_").toString();
    }

    private class _cls2 extends BaseApiResponseHandler
    {

        final PinalyticsUploader a;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            throwable = PinalyticsUploader.b();
            throwable;
            JVM INSTR monitorenter ;
            if (apiresponse.getCode() == 15 || PinalyticsUploader.e(a) == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            if (PinalyticsUploader.c(a) != null) goto _L2; else goto _L1
_L1:
            apiresponse = (new StringBuilder()).append(PinalyticsUploader.c()).append(Arrays.hashCode(PinalyticsUploader.e(a))).toString();
            DiskCache.ensureDirectory(PinalyticsUploader.d());
            DiskCache.setBytes(apiresponse, PinalyticsUploader.e(a));
            PLog.log("PinalyticsUploader", "Submitting: FAILED: Saving payload to disk for later.", new Object[0]);
_L3:
            PinalyticsUploader.d(a);
            return;
_L2:
            PLog.log("PinalyticsUploader", "Submitting: FAILED: Payload already on disk for later.", new Object[0]);
              goto _L3
            apiresponse;
            throwable;
            JVM INSTR monitorexit ;
            throw apiresponse;
            PLog.log("PinalyticsUploader", "Submitting: FATAL: %s", new Object[] {
                String.valueOf(apiresponse.getDeveloperError())
            });
            if (PinalyticsUploader.c(a) != null)
            {
                PinalyticsUploader.c(a).delete();
                PLog.log("PinalyticsUploader", "Deleted used cache events because they were invalid", new Object[0]);
            }
            PinalyticsUploader.a(apiresponse);
              goto _L3
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            PLog.log("PinalyticsUploader", "Submitting: Success.", new Object[0]);
            synchronized (PinalyticsUploader.b())
            {
                if (PinalyticsUploader.c(a) != null)
                {
                    PinalyticsUploader.c(a).delete();
                    PLog.log("PinalyticsUploader", "Deleted used cache events.", new Object[0]);
                }
            }
            PinalyticsUploader.d(a);
            return;
            exception;
            apiresponse;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls2()
        {
            a = PinalyticsUploader.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.common.async.IntervalRunner.IntervalCallback
    {

        final PinalyticsUploader a;

        public void onInterval()
        {
            PinalyticsUploader.a(a);
            PinalyticsUploader.b(a);
        }

        public void onStop()
        {
            onInterval();
        }

        _cls1()
        {
            a = PinalyticsUploader.this;
            super();
        }
    }

}
