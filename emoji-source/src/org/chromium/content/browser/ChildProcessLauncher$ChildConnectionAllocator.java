// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import org.chromium.content.app.ChromiumLinkerParams;
import org.chromium.content.app.PrivilegedProcessService;
import org.chromium.content.app.SandboxedProcessService;

// Referenced classes of package org.chromium.content.browser:
//            ChildProcessLauncher, ChildProcessConnectionImpl, ChildProcessConnection

private static class mInSandbox
{

    static final boolean $assertionsDisabled;
    private Class mChildClass;
    private final ChildProcessConnection mChildProcessConnections[];
    private final Object mConnectionLock = new Object();
    private final ArrayList mFreeConnectionIndices;
    private final boolean mInSandbox;

    public ChildProcessConnection allocate(Context context, mInSandbox minsandbox, ChromiumLinkerParams chromiumlinkerparams)
    {
        Object obj = mConnectionLock;
        obj;
        JVM INSTR monitorenter ;
        if (!mFreeConnectionIndices.isEmpty())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Log.e("ChildProcessLauncher", "Ran out of services to allocate.");
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_47;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        int i = ((Integer)mFreeConnectionIndices.remove(0)).intValue();
        if (!$assertionsDisabled && mChildProcessConnections[i] != null)
        {
            throw new AssertionError();
        }
        mChildProcessConnections[i] = new ChildProcessConnectionImpl(context, i, mInSandbox, minsandbox, mChildClass, chromiumlinkerparams);
        Log.d("ChildProcessLauncher", (new StringBuilder()).append("Allocator allocated a connection, sandbox: ").append(mInSandbox).append(", slot: ").append(i).toString());
        context = mChildProcessConnections[i];
        obj;
        JVM INSTR monitorexit ;
        return context;
    }

    int allocatedConnectionsCountForTesting()
    {
        return mChildProcessConnections.length - mFreeConnectionIndices.size();
    }

    public void free(ChildProcessConnection childprocessconnection)
    {
        Object obj = mConnectionLock;
        obj;
        JVM INSTR monitorenter ;
        int j;
        j = childprocessconnection.getServiceNumber();
        if (mChildProcessConnections[j] == childprocessconnection)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (mChildProcessConnections[j] != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        int i = -1;
_L1:
        Log.e("ChildProcessLauncher", (new StringBuilder()).append("Unable to find connection to free in slot: ").append(j).append(" already occupied by service: ").append(i).toString());
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_196;
        childprocessconnection;
        obj;
        JVM INSTR monitorexit ;
        throw childprocessconnection;
        i = mChildProcessConnections[j].getServiceNumber();
          goto _L1
        mChildProcessConnections[j] = null;
        if (!$assertionsDisabled && mFreeConnectionIndices.contains(Integer.valueOf(j)))
        {
            throw new AssertionError();
        }
        mFreeConnectionIndices.add(Integer.valueOf(j));
        Log.d("ChildProcessLauncher", (new StringBuilder()).append("Allocator freed a connection, sandbox: ").append(mInSandbox).append(", slot: ").append(j).toString());
        obj;
        JVM INSTR monitorexit ;
    }

    public void setServiceClass(Class class1)
    {
        mChildClass = class1;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ChildProcessLauncher.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public (boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 20;
        } else
        {
            byte0 = 3;
        }
        mChildProcessConnections = new ChildProcessConnectionImpl[byte0];
        mFreeConnectionIndices = new ArrayList(byte0);
        for (int i = 0; i < byte0; i++)
        {
            mFreeConnectionIndices.add(Integer.valueOf(i));
        }

        Object obj;
        if (flag)
        {
            obj = org/chromium/content/app/SandboxedProcessService;
        } else
        {
            obj = org/chromium/content/app/PrivilegedProcessService;
        }
        setServiceClass(((Class) (obj)));
        mInSandbox = flag;
    }
}
