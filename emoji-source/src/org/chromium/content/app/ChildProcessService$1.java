// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.util.ArrayList;
import org.chromium.base.library_loader.Linker;
import org.chromium.content.common.IChildProcessCallback;

// Referenced classes of package org.chromium.content.app:
//            ChildProcessService

class e.Stub extends org.chromium.content.common.tub
{

    static final boolean $assertionsDisabled;
    final ChildProcessService this$0;

    public void crashIntentionallyForTesting()
    {
        Process.killProcess(Process.myPid());
    }

    public int setupConnection(Bundle bundle, IChildProcessCallback ichildprocesscallback)
    {
        ChildProcessService.access$002(ChildProcessService.this, ichildprocesscallback);
        ichildprocesscallback = ChildProcessService.access$100(ChildProcessService.this);
        ichildprocesscallback;
        JVM INSTR monitorenter ;
        if (ChildProcessService.access$200(ChildProcessService.this) == null)
        {
            ChildProcessService.access$202(ChildProcessService.this, bundle.getStringArray("com.google.android.apps.chrome.extra.command_line"));
        }
        if (!$assertionsDisabled && ChildProcessService.access$200(ChildProcessService.this) == null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_72;
        bundle;
        ichildprocesscallback;
        JVM INSTR monitorexit ;
        throw bundle;
        ChildProcessService.access$302(ChildProcessService.this, bundle.getInt("com.google.android.apps.chrome.extra.cpu_count"));
        ChildProcessService.access$402(ChildProcessService.this, bundle.getLong("com.google.android.apps.chrome.extra.cpu_features"));
        if (!$assertionsDisabled && ChildProcessService.access$300(ChildProcessService.this) <= 0)
        {
            throw new AssertionError();
        }
        ChildProcessService.access$502(ChildProcessService.this, new ArrayList());
        ChildProcessService.access$602(ChildProcessService.this, new ArrayList());
        int i = 0;
_L2:
        Object obj = (ParcelFileDescriptor)bundle.getParcelable((new StringBuilder()).append("com.google.android.apps.chrome.extra.extraFile_").append(i).append("_fd").toString());
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        bundle = bundle.getBundle("org.chromium.base.android.linker.shared_relros");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        Linker.useSharedRelros(bundle);
        ChildProcessService.access$100(ChildProcessService.this).notifyAll();
        ichildprocesscallback;
        JVM INSTR monitorexit ;
        return Process.myPid();
        ChildProcessService.access$600(ChildProcessService.this).add(obj);
        obj = (new StringBuilder()).append("com.google.android.apps.chrome.extra.extraFile_").append(i).append("_id").toString();
        ChildProcessService.access$500(ChildProcessService.this).add(Integer.valueOf(bundle.getInt(((String) (obj)))));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
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

    ck()
    {
        this$0 = ChildProcessService.this;
        super();
    }
}
