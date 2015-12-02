// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.debug.log.BLog;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.http.protocol.ApiMethodRunnerParams;
import com.facebook.http.protocol.SingleMethodRunner;
import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.tools.dextr.bridge.upload:
//            BackgroundUploadService, UploadConstraints, LoomUploadMethod

public class BackgroundUploadServiceImpl
    implements BackgroundUploadService
{

    private final ExecutorService a;
    private final ExecutorService b;
    private final UploadConstraints c;
    private final SingleMethodRunner d;
    private final Set e = new HashSet(10);

    public BackgroundUploadServiceImpl(UploadConstraints uploadconstraints, ExecutorService executorservice, ExecutorService executorservice1, SingleMethodRunner singlemethodrunner)
    {
        b = executorservice1;
        c = uploadconstraints;
        a = executorservice;
        d = singlemethodrunner;
    }

    static Set a(BackgroundUploadServiceImpl backgrounduploadserviceimpl)
    {
        return backgrounduploadserviceimpl.e;
    }

    static void a(BackgroundUploadServiceImpl backgrounduploadserviceimpl, File file, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener, boolean flag)
    {
        backgrounduploadserviceimpl.a(file, backgrounduploadlistener, flag);
    }

    private void a(File file, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener)
    {
        if (backgrounduploadlistener != null)
        {
            ExecutorDetour.a(a, new _cls2(backgrounduploadlistener, file), 0x95d27524);
        }
    }

    private void a(File file, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener, boolean flag)
    {
label0:
        {
            if (!flag && !c.a())
            {
                return;
            }
            LoomUploadMethod loomuploadmethod = new LoomUploadMethod();
            ApiMethodRunnerParams apimethodrunnerparams = new ApiMethodRunnerParams();
            apimethodrunnerparams.a(RequestPriority.CAN_WAIT);
            CallerContext callercontext = CallerContext.a(com/facebook/tools/dextr/bridge/upload/BackgroundUploadServiceImpl);
            try
            {
                if (!((Boolean)d.a(loomuploadmethod, file, apimethodrunnerparams, callercontext)).booleanValue())
                {
                    break label0;
                }
            }
            catch (Exception exception)
            {
                BLog.a("Dextr", exception, "Upload failed for trace %s", new Object[] {
                    file.getName()
                });
                b(file, backgrounduploadlistener);
                return;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        c.a(file.length());
        a(file, backgrounduploadlistener);
        return;
        BLog.a("Dextr", "Upload failed for trace %s", new Object[] {
            file.getName()
        });
        b(file, backgrounduploadlistener);
        return;
    }

    private void a(List list, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = list.iterator();
_L1:
        File file;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        file = (File)iterator.next();
        synchronized (e)
        {
            if (!e.contains(file))
            {
                break MISSING_BLOCK_LABEL_68;
            }
        }
          goto _L1
        backgrounduploadlistener;
        list;
        JVM INSTR monitorexit ;
        throw backgrounduploadlistener;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        JVM INSTR monitorexit ;
        if (!file.exists()) goto _L1; else goto _L2
_L2:
        ExecutorDetour.a(b, new _cls1(file, backgrounduploadlistener, flag), 0x8ebef4c1);
          goto _L1
        this;
        JVM INSTR monitorexit ;
    }

    private void b(File file, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener)
    {
        if (backgrounduploadlistener != null)
        {
            ExecutorDetour.a(a, new _cls3(backgrounduploadlistener, file), 0x67d24c8b);
        }
    }

    public final void a(List list, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener)
    {
        a(list, backgrounduploadlistener, false);
    }

    public final void b(List list, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener)
    {
        a(list, backgrounduploadlistener, true);
    }

    private class _cls2
        implements Runnable
    {

        final BackgroundUploadService.BackgroundUploadListener a;
        final File b;
        final BackgroundUploadServiceImpl c;

        public void run()
        {
            a.a(b);
        }

        _cls2(BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener, File file)
        {
            c = BackgroundUploadServiceImpl.this;
            a = backgrounduploadlistener;
            b = file;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final File a;
        final BackgroundUploadService.BackgroundUploadListener b;
        final boolean c;
        final BackgroundUploadServiceImpl d;

        public void run()
        {
            if (!a.exists())
            {
                return;
            }
            synchronized (BackgroundUploadServiceImpl.a(d))
            {
                BackgroundUploadServiceImpl.a(d).add(a);
            }
            BackgroundUploadServiceImpl.a(d, a, b, c);
            synchronized (BackgroundUploadServiceImpl.a(d))
            {
                BackgroundUploadServiceImpl.a(d).remove(a);
            }
            return;
            exception;
            set;
            JVM INSTR monitorexit ;
            throw exception;
            exception1;
            set;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        _cls1(File file, BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener, boolean flag)
        {
            d = BackgroundUploadServiceImpl.this;
            a = file;
            b = backgrounduploadlistener;
            c = flag;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final BackgroundUploadService.BackgroundUploadListener a;
        final File b;
        final BackgroundUploadServiceImpl c;

        public void run()
        {
            a.b(b);
        }

        _cls3(BackgroundUploadService.BackgroundUploadListener backgrounduploadlistener, File file)
        {
            c = BackgroundUploadServiceImpl.this;
            a = backgrounduploadlistener;
            b = file;
            super();
        }
    }

}
