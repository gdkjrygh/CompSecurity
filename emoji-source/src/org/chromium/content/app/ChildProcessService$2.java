// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import android.content.Context;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.CommandLine;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.library_loader.Linker;
import org.chromium.base.library_loader.ProcessInitException;

// Referenced classes of package org.chromium.content.app:
//            ChildProcessService, ChromiumLinkerParams, ContentMain

class this._cls0
    implements Runnable
{

    static final boolean $assertionsDisabled;
    final ChildProcessService this$0;

    public void run()
    {
        Object obj = ChildProcessService.access$100(ChildProcessService.this);
        obj;
        JVM INSTR monitorenter ;
        for (; ChildProcessService.access$200(ChildProcessService.this) == null; ChildProcessService.access$100(ChildProcessService.this).wait()) { }
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
          goto _L2
_L1:
        obj;
        JVM INSTR monitorexit ;
        CommandLine.init(ChildProcessService.access$200(ChildProcessService.this));
        flag2 = Linker.isUsed();
        int i;
        boolean flag;
        flag = false;
        i = 0;
        if (!flag2) goto _L4; else goto _L3
_L3:
        obj = ChildProcessService.access$100(ChildProcessService.this);
        obj;
        JVM INSTR monitorenter ;
        for (; !ChildProcessService.access$700(ChildProcessService.this); ChildProcessService.access$100(ChildProcessService.this).wait()) { }
        break MISSING_BLOCK_LABEL_157;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        boolean flag2;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("ChildProcessService", (new StringBuilder()).append("ChildProcessMain startup failed: ").append(obj).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("ChildProcessService", (new StringBuilder()).append("ChildProcessMain startup failed: ").append(obj).toString());
        }
        return;
        obj;
        JVM INSTR monitorexit ;
        if (!$assertionsDisabled && ChildProcessService.access$800(ChildProcessService.this) == null)
        {
            throw new AssertionError();
        }
        if (!ChildProcessService.access$800(ChildProcessService.this).mWaitForSharedRelro) goto _L6; else goto _L5
_L5:
        i = 1;
        Linker.initServiceProcess(ChildProcessService.access$800(ChildProcessService.this).mBaseLoadAddress);
_L8:
        Linker.setTestRunnerClassName(ChildProcessService.access$800(ChildProcessService.this).mTestRunnerClassName);
        flag = i;
_L4:
        i = 0;
        if (CommandLine.getInstance().hasSwitch("renderer-wait-for-java-debugger"))
        {
            Debug.waitForDebugger();
        }
        LibraryLoader.loadNow(getApplicationContext(), false);
        i = 1;
_L9:
        boolean flag1;
        flag1 = i;
        if (i)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        flag1 = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        Linker.disableSharedRelros();
        LibraryLoader.loadNow(getApplicationContext(), false);
        flag1 = true;
_L10:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        System.exit(-1);
        LibraryLoader.initialize();
        obj = ChildProcessService.access$100(ChildProcessService.this);
        obj;
        JVM INSTR monitorenter ;
        ChildProcessService.access$902(ChildProcessService.this, true);
        ChildProcessService.access$100(ChildProcessService.this).notifyAll();
        for (; ChildProcessService.access$500(ChildProcessService.this) == null; ChildProcessService.access$100(ChildProcessService.this).wait()) { }
          goto _L7
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        Linker.disableSharedRelros();
          goto _L8
        obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        Log.w("ChildProcessService", "Failed to load native library with shared RELRO, retrying without");
          goto _L9
        Log.e("ChildProcessService", "Failed to load native library", ((Throwable) (obj)));
          goto _L9
        obj;
        Log.e("ChildProcessService", "Failed to load native library on retry", ((Throwable) (obj)));
        flag1 = i;
          goto _L10
_L7:
        obj;
        JVM INSTR monitorexit ;
        int ai[];
        int ai1[];
        if (!$assertionsDisabled && ChildProcessService.access$500(ChildProcessService.this).size() != ChildProcessService.access$600(ChildProcessService.this).size())
        {
            throw new AssertionError();
        }
        ai = new int[ChildProcessService.access$500(ChildProcessService.this).size()];
        ai1 = new int[ChildProcessService.access$600(ChildProcessService.this).size()];
        i = 0;
_L12:
        if (i >= ChildProcessService.access$500(ChildProcessService.this).size())
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ((Integer)ChildProcessService.access$500(ChildProcessService.this).get(i)).intValue();
        ai1[i] = ((ParcelFileDescriptor)ChildProcessService.access$600(ChildProcessService.this).get(i)).detachFd();
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        ContentMain.initApplicationContext(((Context)ChildProcessService.access$1000().get()).getApplicationContext());
        ChildProcessService.access$1100(((Context)ChildProcessService.access$1000().get()).getApplicationContext(), ChildProcessService.this, ai, ai1, ChildProcessService.access$300(ChildProcessService.this), ChildProcessService.access$400(ChildProcessService.this));
        ContentMain.start();
        ChildProcessService.access$1200();
        return;
          goto _L8
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/app/ChildProcessService.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    eption()
    {
        this$0 = ChildProcessService.this;
        super();
    }
}
